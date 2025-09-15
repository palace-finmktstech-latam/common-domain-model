package com.example.cdm;

import java.io.IOException;
import java.math.BigDecimal;
import cdm.event.common.*;
import cdm.base.staticdata.party.*;
import cdm.product.template.*;
import cdm.product.asset.*;
import cdm.base.datetime.daycount.DayCountFractionEnum;
import cdm.product.common.schedule.*;
import cdm.product.common.schedule.RateSchedule;
import cdm.observable.asset.*;
import cdm.observable.asset.Money;
import cdm.observable.asset.PriceSchedule;
import cdm.base.staticdata.asset.rates.FloatingRateIndexEnum;
import cdm.observable.asset.InterestRateIndex;
import cdm.observable.asset.FloatingRateIndex;
import cdm.product.asset.SpreadSchedule;
import cdm.base.datetime.*;
import cdm.product.common.settlement.*;
import cdm.product.common.settlement.SettlementTypeEnum;
import cdm.product.common.settlement.TransferSettlementEnum;
import cdm.base.math.NonNegativeQuantitySchedule;
import cdm.base.math.UnitType;
import com.rosetta.model.lib.records.Date;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import java.io.FileWriter;

/**
 * Step 8: Amortizing Cross-Currency Swap
 *
 * Building on Step 7, now adding:
 * - Principal payments with uniform amortization on both legs
 * - Initial notional exchange at trade start
 * - Final notional exchange at trade maturity
 * - Intermediate amortization payments at each coupon date
 *
 * This demonstrates how the CDM handles amortizing swaps where the notional
 * amount reduces over time through scheduled principal payments.
 */
public class AmortizingXCcySwap {

    private final ObjectMapper objectMapper;

    public AmortizingXCcySwap() {
        this.objectMapper = new ObjectMapper();
        this.objectMapper.registerModule(new JavaTimeModule());
        this.objectMapper.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
        this.objectMapper.enable(SerializationFeature.INDENT_OUTPUT);
    }

    public static void main(String[] args) {
        try {
            AmortizingXCcySwap example = new AmortizingXCcySwap();
            Trade trade = example.buildAmortizingXCcySwap();

            System.out.println("================================================");
            System.out.println("STEP 8: AMORTIZING CROSS-CURRENCY SWAP");
            System.out.println("================================================");
            System.out.println();
            System.out.println("New features in this step:");
            System.out.println("✅ Principal payments with uniform amortization");
            System.out.println("✅ Initial notional exchange");
            System.out.println("✅ Final notional exchange");
            System.out.println("✅ Intermediate principal payments at each coupon");
            System.out.println();

            String json = example.toJson(trade);

            // Save to file
            String filename = "json-outputs/step8-amortizing-xccy-swap.json";
            try (FileWriter writer = new FileWriter(filename)) {
                writer.write("================================================\\n");
                writer.write("STEP 8: AMORTIZING CROSS-CURRENCY SWAP\\n");
                writer.write("================================================\\n\\n");
                writer.write(json);
                System.out.println("JSON output saved to: " + filename);
            }

            // Also print to console (truncated for readability)
            System.out.println("JSON Output (first 100 lines):");
            System.out.println("====================================");
            String[] lines = json.split("\\n");
            for (int i = 0; i < Math.min(100, lines.length); i++) {
                System.out.println(lines[i]);
            }
            if (lines.length > 100) {
                System.out.println("... (truncated - see full output in " + filename + ")");
            }

        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public Trade buildAmortizingXCcySwap() {

        BusinessUnit buTest = BusinessUnit.builder()
            .setName("FX London")
            .build();

        // Same party setup
        Party bankA = Party.builder()
            .setNameValue("Bank A")
            .addBusinessUnit(buTest)
            .build();

        Party goldmanSachs = Party.builder()
            .setNameValue("Goldman Sachs International")
            .build();

        Counterparty cp1 = Counterparty.builder()
            .setRole(CounterpartyRoleEnum.PARTY_1)
            .setPartyReferenceValue(bankA)
            .build();

        Counterparty cp2 = Counterparty.builder()
            .setRole(CounterpartyRoleEnum.PARTY_2)
            .setPartyReferenceValue(goldmanSachs)
            .build();

        // Business centers for both NY and Santiago
        BusinessCenters businessCenters = BusinessCenters.builder()
            .addBusinessCenterValue(BusinessCenterEnum.USNY) // New York
            .addBusinessCenterValue(BusinessCenterEnum.CLSA) // Santiago
            .build();

        BusinessDayAdjustments businessDayAdjustments = BusinessDayAdjustments.builder()
            .setBusinessDayConvention(BusinessDayConventionEnum.MODFOLLOWING)
            .setBusinessCenters(businessCenters)
            .build();

        // Same calculation period dates
        CalculationPeriodDates calculationPeriodDates = CalculationPeriodDates.builder()
            .setEffectiveDate(AdjustableOrRelativeDate.builder()
                .setAdjustableDate(AdjustableDate.builder()
                    .setUnadjustedDate(Date.of(2025, 9, 15))
                    .setDateAdjustments(businessDayAdjustments)
                    .build())
                .build())
            .setTerminationDate(AdjustableOrRelativeDate.builder()
                .setAdjustableDate(AdjustableDate.builder()
                    .setUnadjustedDate(Date.of(2030, 9, 15))
                    .setDateAdjustments(businessDayAdjustments)
                    .build())
                .build())
            .setCalculationPeriodFrequency(CalculationPeriodFrequency.builder()
                .setPeriodMultiplier(6) // Semi-annual
                .setPeriod(PeriodExtendedEnum.M)
                .setRollConvention(RollConventionEnum._15)
                .build())
            .setCalculationPeriodDatesAdjustments(businessDayAdjustments)
            .build();

        // Payment dates with T+2 settlement
        PaymentDates paymentDates = PaymentDates.builder()
            .setPaymentFrequency(Frequency.builder()
                .setPeriodMultiplier(6) // Semi-annual payments
                .setPeriod(PeriodExtendedEnum.M)
                .build())
            .setPayRelativeTo(PayRelativeToEnum.CALCULATION_PERIOD_END_DATE)
            .setPaymentDaysOffset(Offset.builder()
                .setPeriodMultiplier(2) // T+2 settlement
                .setDayType(DayTypeEnum.BUSINESS)
                .build())
            .setPaymentDatesAdjustments(businessDayAdjustments)
            .build();

        // Fixed rate specification (5% on CLP)
        PriceSchedule fixedRateSchedule = PriceSchedule.builder()
            .setValue(BigDecimal.valueOf(0.05))
            .build();

        FixedRateSpecification fixedRateSpec = FixedRateSpecification.builder()
            .setRateSchedule(RateSchedule.builder()
                .setPriceValue(fixedRateSchedule)
                .build())
            .build();

        RateSpecification fixedRateSpecification = RateSpecification.builder()
            .setFixedRateSpecification(fixedRateSpec)
            .build();

        // Step 8a: Principal Payments for CLP Leg (Fixed Leg)
        // Initial notional: CLP 950 billion
        // Amortizes uniformly over 10 semi-annual payments (CLP 95 billion each)

        PrincipalPayment initialClpPayment = PrincipalPayment.builder()
            .setPrincipalPaymentDate(AdjustableDate.builder()
                .setUnadjustedDate(Date.of(2025, 9, 15))
                .setDateAdjustments(businessDayAdjustments)
                .build())
            .setPayerReceiver(PayerReceiver.builder()
                .setPayer(CounterpartyRoleEnum.PARTY_2) // Goldman Sachs pays CLP
                .setReceiver(CounterpartyRoleEnum.PARTY_1) // Bank A receives CLP
                .build())
            .setPrincipalAmount(Money.builder()
                .setValue(BigDecimal.valueOf(950000000000.00)) // CLP 950 billion
                .setUnit(UnitType.builder()
                    .setCurrencyValue("CLP")
                    .build())
                .build())
            .build();

        PrincipalPayment finalClpPayment = PrincipalPayment.builder()
            .setPrincipalPaymentDate(AdjustableDate.builder()
                .setUnadjustedDate(Date.of(2030, 9, 15))
                .setDateAdjustments(businessDayAdjustments)
                .build())
            .setPayerReceiver(PayerReceiver.builder()
                .setPayer(CounterpartyRoleEnum.PARTY_1) // Bank A repays remaining CLP
                .setReceiver(CounterpartyRoleEnum.PARTY_2) // Goldman Sachs receives CLP
                .build())
            .setPrincipalAmount(Money.builder()
                .setValue(BigDecimal.valueOf(95000000000.00)) // Final CLP 95 billion
                .setUnit(UnitType.builder()
                    .setCurrencyValue("CLP")
                    .build())
                .build())
            .build();

        // Intermediate amortization: 9 payments of CLP 95 billion each
        AdjustableRelativeOrPeriodicDates intermediateClpPayments = AdjustableRelativeOrPeriodicDates.builder()
            .setPeriodicDates(PeriodicDates.builder()
                .setStartDate(AdjustableOrRelativeDate.builder()
                    .setAdjustableDate(AdjustableDate.builder()
                        .setUnadjustedDate(Date.of(2026, 3, 15)) // First amortization
                        .setDateAdjustments(businessDayAdjustments)
                        .build())
                    .build())
                .setEndDate(AdjustableOrRelativeDate.builder()
                    .setAdjustableDate(AdjustableDate.builder()
                        .setUnadjustedDate(Date.of(2030, 3, 15)) // Last amortization before final
                        .setDateAdjustments(businessDayAdjustments)
                        .build())
                    .build())
                .setPeriodFrequency(CalculationPeriodFrequency.builder()
                    .setPeriodMultiplier(6) // Semi-annual amortization
                    .setPeriod(PeriodExtendedEnum.M)
                    .setRollConvention(RollConventionEnum._15)
                    .build())
                .setPeriodDatesAdjustments(businessDayAdjustments)
                .build())
            .build();

        PrincipalPaymentSchedule clpPrincipalSchedule = PrincipalPaymentSchedule.builder()
            .setInitialPrincipalPayment(initialClpPayment)
            .setIntermediatePrincipalPayment(intermediateClpPayments)
            .setFinalPrincipalPayment(finalClpPayment)
            .build();

        PrincipalPayments clpPrincipalPayments = PrincipalPayments.builder()
            .setInitialPayment(true) // Initial notional exchange
            .setIntermediatePayment(true) // Amortization payments
            .setFinalPayment(true) // Final notional exchange
            .addVaryingLegNotionalCurrency("CLP") // CLP notional varies due to amortization
            .setPrincipalPaymentSchedule(clpPrincipalSchedule)
            .build();

        // CLP notional with FX linked schedule (same as Step 7)
        FxSpotRateSource fxSpotRateSource = FxSpotRateSource.builder()
            .setPrimarySource(InformationSource.builder()
                .setSourceProviderValue(InformationProviderEnum.BANCO_CENTRAL_CHILE)
                .setSourcePageValue("Dólar Observado")
                .build())
            .build();

        RelativeDateOffset fxFixingDates = RelativeDateOffset.builder()
            .setPeriodMultiplier(-1) // T-1
            .setDayType(DayTypeEnum.BUSINESS)
            .setBusinessDayConvention(BusinessDayConventionEnum.PRECEDING)
            .setBusinessCenters(businessCenters)
            .build();

        FxLinkedNotionalSchedule fxLinkedSchedule = FxLinkedNotionalSchedule.builder()
            .setVaryingNotionalCurrencyValue("USD") // Convert to USD
            .setFxSpotRateSource(fxSpotRateSource)
            .setVaryingNotionalFixingDates(fxFixingDates)
            .build();

        QuantityMultiplier quantityMultiplier = QuantityMultiplier.builder()
            .setFxLinkedNotionalSchedule(fxLinkedSchedule)
            .build();

        NonNegativeQuantitySchedule clpNotionalSchedule = NonNegativeQuantitySchedule.builder()
            .setValue(BigDecimal.valueOf(950000000000.00)) // CLP 950 billion (initial)
            .setUnit(UnitType.builder()
                .setCurrencyValue("CLP")
                .build())
            .build();

        ResolvablePriceQuantity clpNotional = ResolvablePriceQuantity.builder()
            .setQuantityScheduleValue(clpNotionalSchedule)
            .setQuantityMultiplier(quantityMultiplier)
            .build();

        SettlementTerms settlementTermsUSD = SettlementTerms.builder()
            .setSettlementCurrencyValue("USD")
            .setSettlementType(SettlementTypeEnum.CASH)
            .setTransferSettlementType(TransferSettlementEnum.PAYMENT_VERSUS_PAYMENT)
            .build();

        // Fixed leg with principal payments
        InterestRatePayout fixedLeg = InterestRatePayout.builder()
            .setPayerReceiver(PayerReceiver.builder()
                .setPayer(CounterpartyRoleEnum.PARTY_1)
                .setReceiver(CounterpartyRoleEnum.PARTY_2)
                .build())
            .setRateSpecification(fixedRateSpecification)
            .setDayCountFractionValue(DayCountFractionEnum.ACT_360)
            .setPriceQuantity(clpNotional)
            .setCalculationPeriodDates(calculationPeriodDates)
            .setPaymentDates(paymentDates)
            .setSettlementTerms(settlementTermsUSD)
            .setPrincipalPayment(clpPrincipalPayments) // Principal amortization
            .build();

        // Step 8b: Principal Payments for USD Leg (Floating Leg)
        // Initial notional: USD 10 million
        // Amortizes uniformly over 10 semi-annual payments (USD 1 million each)

        PrincipalPayment initialUsdPayment = PrincipalPayment.builder()
            .setPrincipalPaymentDate(AdjustableDate.builder()
                .setUnadjustedDate(Date.of(2025, 9, 15))
                .setDateAdjustments(businessDayAdjustments)
                .build())
            .setPayerReceiver(PayerReceiver.builder()
                .setPayer(CounterpartyRoleEnum.PARTY_1) // Bank A pays USD
                .setReceiver(CounterpartyRoleEnum.PARTY_2) // Goldman Sachs receives USD
                .build())
            .setPrincipalAmount(Money.builder()
                .setValue(BigDecimal.valueOf(10000000.00)) // USD 10 million
                .setUnit(UnitType.builder()
                    .setCurrencyValue("USD")
                    .build())
                .build())
            .build();

        PrincipalPayment finalUsdPayment = PrincipalPayment.builder()
            .setPrincipalPaymentDate(AdjustableDate.builder()
                .setUnadjustedDate(Date.of(2030, 9, 15))
                .setDateAdjustments(businessDayAdjustments)
                .build())
            .setPayerReceiver(PayerReceiver.builder()
                .setPayer(CounterpartyRoleEnum.PARTY_2) // Goldman Sachs repays remaining USD
                .setReceiver(CounterpartyRoleEnum.PARTY_1) // Bank A receives USD
                .build())
            .setPrincipalAmount(Money.builder()
                .setValue(BigDecimal.valueOf(1000000.00)) // Final USD 1 million
                .setUnit(UnitType.builder()
                    .setCurrencyValue("USD")
                    .build())
                .build())
            .build();

        // Intermediate amortization: 9 payments of USD 1 million each
        AdjustableRelativeOrPeriodicDates intermediateUsdPayments = AdjustableRelativeOrPeriodicDates.builder()
            .setPeriodicDates(PeriodicDates.builder()
                .setStartDate(AdjustableOrRelativeDate.builder()
                    .setAdjustableDate(AdjustableDate.builder()
                        .setUnadjustedDate(Date.of(2026, 3, 15)) // First amortization
                        .setDateAdjustments(businessDayAdjustments)
                        .build())
                    .build())
                .setEndDate(AdjustableOrRelativeDate.builder()
                    .setAdjustableDate(AdjustableDate.builder()
                        .setUnadjustedDate(Date.of(2030, 3, 15)) // Last amortization before final
                        .setDateAdjustments(businessDayAdjustments)
                        .build())
                    .build())
                .setPeriodFrequency(CalculationPeriodFrequency.builder()
                    .setPeriodMultiplier(6) // Semi-annual amortization
                    .setPeriod(PeriodExtendedEnum.M)
                    .setRollConvention(RollConventionEnum._15)
                    .build())
                .setPeriodDatesAdjustments(businessDayAdjustments)
                .build())
            .build();

        PrincipalPaymentSchedule usdPrincipalSchedule = PrincipalPaymentSchedule.builder()
            .setInitialPrincipalPayment(initialUsdPayment)
            .setIntermediatePrincipalPayment(intermediateUsdPayments)
            .setFinalPrincipalPayment(finalUsdPayment)
            .build();

        PrincipalPayments usdPrincipalPayments = PrincipalPayments.builder()
            .setInitialPayment(true) // Initial notional exchange
            .setIntermediatePayment(true) // Amortization payments
            .setFinalPayment(true) // Final notional exchange
            .addVaryingLegNotionalCurrency("USD") // USD notional varies due to amortization
            .setPrincipalPaymentSchedule(usdPrincipalSchedule)
            .build();

        // Floating rate specification (SOFR + 100bps)
        FloatingRateSpecification floatingRateSpec = FloatingRateSpecification.builder()
            .setRateOptionValue(InterestRateIndex.builder()
                .setFloatingRateIndex(FloatingRateIndex.builder()
                    .setFloatingRateIndexValue(FloatingRateIndexEnum.USD_SOFR_COMPOUND)
                    .setIndexTenor(Period.builder()
                        .setPeriodMultiplier(1)
                        .setPeriod(PeriodEnum.D)
                        .build())
                    .build())
                .build())
            .setSpreadSchedule(SpreadSchedule.builder()
                .setPriceValue(PriceSchedule.builder()
                    .setValue(BigDecimal.valueOf(0.01)) // 100 basis points
                    .build())
                .build())
            .build();

        RateSpecification floatingRateSpecification = RateSpecification.builder()
            .setFloatingRateSpecification(floatingRateSpec)
            .build();

        NonNegativeQuantitySchedule usdNotionalSchedule = NonNegativeQuantitySchedule.builder()
            .setValue(BigDecimal.valueOf(10000000.00)) // USD 10 million (initial)
            .setUnit(UnitType.builder()
                .setCurrencyValue("USD")
                .build())
            .build();

        ResolvablePriceQuantity usdNotional = ResolvablePriceQuantity.builder()
            .setQuantityScheduleValue(usdNotionalSchedule)
            .build();

        // Floating leg with principal payments
        InterestRatePayout floatingLeg = InterestRatePayout.builder()
            .setPayerReceiver(PayerReceiver.builder()
                .setPayer(CounterpartyRoleEnum.PARTY_2)
                .setReceiver(CounterpartyRoleEnum.PARTY_1)
                .build())
            .setRateSpecification(floatingRateSpecification)
            .setDayCountFractionValue(DayCountFractionEnum.ACT_360)
            .setPriceQuantity(usdNotional)
            .setCalculationPeriodDates(calculationPeriodDates)
            .setPaymentDates(paymentDates)
            .setSettlementTerms(settlementTermsUSD)
            .setPrincipalPayment(usdPrincipalPayments) // Principal amortization
            .build();

        // Create product with both payouts
        NonTransferableProduct product = NonTransferableProduct.builder()
            .setEconomicTerms(EconomicTerms.builder()
                .setEffectiveDate(AdjustableOrRelativeDate.builder()
                    .setAdjustableDate(AdjustableDate.builder()
                        .setUnadjustedDate(Date.of(2025, 9, 15))
                        .setDateAdjustments(businessDayAdjustments)
                        .build())
                    .build())
                .setTerminationDate(AdjustableOrRelativeDate.builder()
                    .setAdjustableDate(AdjustableDate.builder()
                        .setUnadjustedDate(Date.of(2030, 9, 15))
                        .setDateAdjustments(businessDayAdjustments)
                        .build())
                    .build())
                .addPayout(Payout.builder()
                    .setInterestRatePayout(fixedLeg)
                    .build())
                .addPayout(Payout.builder()
                    .setInterestRatePayout(floatingLeg)
                    .build())
                .build())
            .build();

        // Create complete amortizing cross-currency swap
        return Trade.builder()
            .setTradeDateValue(Date.of(2025, 9, 10))
            .addTradeIdentifier(TradeIdentifier.builder().build())
            .addParty(bankA)
            .addParty(goldmanSachs)
            .addCounterparty(cp1)
            .addCounterparty(cp2)
            .setProduct(product)
            .build();
    }

    public String toJson(Object cdmObject) throws IOException {
        return objectMapper.writeValueAsString(cdmObject);
    }
}