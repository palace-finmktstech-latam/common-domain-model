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
 * Step 7: Complete Cross-Currency Swap with Settlement Terms and FX Linked Notional
 *
 * Building on Step 6, now adding:
 * - Settlement currency (USD) on both legs for net settlement
 * - FX linked notional schedule for CLP/USD conversion
 * - FX spot rate source (Banco Central de Chile - Dólar Observado)
 * - Proper FX fixing dates (T-1 business day)
 *
 * This represents the complete cross-currency swap structure with all
 * essential components for proper FX fixing and settlement.
 */
public class CompleteXCcySwapWithSettlement {

    private final ObjectMapper objectMapper;

    public CompleteXCcySwapWithSettlement() {
        this.objectMapper = new ObjectMapper();
        this.objectMapper.registerModule(new JavaTimeModule());
        this.objectMapper.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
        this.objectMapper.enable(SerializationFeature.INDENT_OUTPUT);
    }

    public static void main(String[] args) {
        try {
            CompleteXCcySwapWithSettlement example = new CompleteXCcySwapWithSettlement();
            Trade trade = example.buildCompleteXCcySwap();

            System.out.println("================================================");
            System.out.println("STEP 7: COMPLETE CROSS-CURRENCY SWAP");
            System.out.println("================================================");
            System.out.println();
            System.out.println("New features in this step:");
            System.out.println("✅ Settlement currency (USD) on both legs");
            System.out.println("✅ FX linked notional schedule for CLP leg");
            System.out.println("✅ FX spot rate source (BCCh - Dólar Observado)");
            System.out.println("✅ FX fixing dates (T-1 business day)");
            System.out.println();

            String json = example.toJson(trade);

            // Save to file
            String filename = "json-outputs/step7-complete-xccy-swap.json";
            try (FileWriter writer = new FileWriter(filename)) {
                writer.write("================================================\n");
                writer.write("STEP 7: COMPLETE CROSS-CURRENCY SWAP\n");
                writer.write("================================================\n\n");
                writer.write(json);
                System.out.println("JSON output saved to: " + filename);
            }

            // Also print to console (truncated for readability)
            System.out.println("JSON Output (first 100 lines):");
            System.out.println("====================================");
            String[] lines = json.split("\n");
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

    public Trade buildCompleteXCcySwap() {

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

        // Step 7a: FX Linked Notional Schedule for CLP leg
        // This handles the FX conversion from CLP to USD for settlement
        FxSpotRateSource fxSpotRateSource = FxSpotRateSource.builder()
            .setPrimarySource(InformationSource.builder()
                .setSourceProviderValue(InformationProviderEnum.BANCO_CENTRAL_CHILE)
                .setSourcePageValue("Dólar Observado")
                .build())
            .build();

        // FX fixing dates: T-1 business day before payment
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

        // CLP notional with FX linked schedule
        NonNegativeQuantitySchedule clpNotionalSchedule = NonNegativeQuantitySchedule.builder()
            .setValue(BigDecimal.valueOf(950000000000.00)) // CLP 950 billion
            .setUnit(UnitType.builder()
                .setCurrencyValue("CLP")
                .build())
            .build();

        ResolvablePriceQuantity clpNotional = ResolvablePriceQuantity.builder()
            .setQuantityScheduleValue(clpNotionalSchedule)
            .setQuantityMultiplier(quantityMultiplier) // FX conversion here!
            .build();

        // Step 7b: Complete settlement terms with USD settlement currency
        SettlementTerms settlementTermsUSD = SettlementTerms.builder()
            .setSettlementCurrencyValue("USD") // Net settlement in USD
            .setSettlementType(SettlementTypeEnum.CASH) // Cash settlement (not physical delivery)
            .setTransferSettlementType(TransferSettlementEnum.PAYMENT_VERSUS_PAYMENT) // PvP for FX/interest rate swaps
            .build();

        // Fixed leg with settlement terms
        InterestRatePayout fixedLeg = InterestRatePayout.builder()
            .setPayerReceiver(PayerReceiver.builder()
                .setPayer(CounterpartyRoleEnum.PARTY_1)
                .setReceiver(CounterpartyRoleEnum.PARTY_2)
                .build())
            .setRateSpecification(fixedRateSpecification)
            .setDayCountFractionValue(DayCountFractionEnum.ACT_360)
            .setPriceQuantity(clpNotional) // CLP notional with FX link
            .setCalculationPeriodDates(calculationPeriodDates)
            .setPaymentDates(paymentDates)
            .setSettlementTerms(settlementTermsUSD) // Settles in USD
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

        // USD notional (no FX conversion needed)
        NonNegativeQuantitySchedule usdNotionalSchedule = NonNegativeQuantitySchedule.builder()
            .setValue(BigDecimal.valueOf(10000000.00)) // USD 10 million
            .setUnit(UnitType.builder()
                .setCurrencyValue("USD")
                .build())
            .build();

        ResolvablePriceQuantity usdNotional = ResolvablePriceQuantity.builder()
            .setQuantityScheduleValue(usdNotionalSchedule)
            // No quantity multiplier needed - already in USD
            .build();

        // Floating leg with settlement terms
        InterestRatePayout floatingLeg = InterestRatePayout.builder()
            .setPayerReceiver(PayerReceiver.builder()
                .setPayer(CounterpartyRoleEnum.PARTY_2)
                .setReceiver(CounterpartyRoleEnum.PARTY_1)
                .build())
            .setRateSpecification(floatingRateSpecification)
            .setDayCountFractionValue(DayCountFractionEnum.ACT_360)
            .setPriceQuantity(usdNotional) // USD notional (no conversion)
            .setCalculationPeriodDates(calculationPeriodDates)
            .setPaymentDates(paymentDates)
            .setSettlementTerms(settlementTermsUSD) // Also settles in USD
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

        // Create complete cross-currency swap
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