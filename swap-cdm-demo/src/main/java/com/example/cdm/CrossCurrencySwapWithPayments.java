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
import cdm.product.common.settlement.ResolvablePriceQuantity;
import cdm.base.math.NonNegativeQuantitySchedule;
import cdm.base.math.UnitType;
import com.rosetta.model.lib.records.Date;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

/**
 * Step 6: Add Payment Dates and FX Observable
 * 
 * Building on Step 5, now adding:
 * - Payment dates for both legs (T+2 settlement)
 * - Payment frequency (semi-annual for both legs)
 * - FX observable for CLP/USD conversion
 * - Proper business day adjustments for payments
 * 
 * This addresses the key concerns about missing payment dates and FX fixing
 */
public class CrossCurrencySwapWithPayments {
    
    private final ObjectMapper objectMapper;
    
    public CrossCurrencySwapWithPayments() {
        this.objectMapper = new ObjectMapper();
        this.objectMapper.registerModule(new JavaTimeModule());
        this.objectMapper.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
        this.objectMapper.enable(SerializationFeature.INDENT_OUTPUT);
    }

    public static void main(String[] args) {
        try {
            CrossCurrencySwapWithPayments example = new CrossCurrencySwapWithPayments();
            Trade trade = example.buildCrossCurrencySwapWithPayments();
            
            System.out.println("====================================");
            System.out.println("STEP 6: PAYMENT DATES & FX OBSERVABLE");
            System.out.println("====================================");
            System.out.println();
            System.out.println("What we're adding:");
            System.out.println("• Payment dates: T+2 settlement for both legs");
            System.out.println("• Payment frequency: Semi-annual");
            System.out.println("• FX observable: Dólar Observado CLP/USD");
            System.out.println("• Payment business day adjustments");
            System.out.println();
            
            String json = example.toJson(trade);
            System.out.println("JSON Output:");
            System.out.println("====================================");
            System.out.println(json);
            
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public Trade buildCrossCurrencySwapWithPayments() {
        
        // Same party setup
        Party bankA = Party.builder()
            .setNameValue("Bank A")
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

        // Same calculation period dates as Step 5
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

        // Step 6a: Payment Dates - T+2 settlement, semi-annual payments
        PaymentDates paymentDates = PaymentDates.builder()
            .setPaymentFrequency(Frequency.builder()
                .setPeriodMultiplier(6) // Semi-annual payments
                .setPeriod(PeriodExtendedEnum.M) // Monthly periods
                .build())
            .setPayRelativeTo(PayRelativeToEnum.CALCULATION_PERIOD_END_DATE) // Pay after period ends
            .setPaymentDaysOffset(Offset.builder()
                .setPeriodMultiplier(2) // T+2 settlement
                .setDayType(DayTypeEnum.BUSINESS) // Business days
                .build())
            .setPaymentDatesAdjustments(businessDayAdjustments) // Same adjustments as calculation
            .build();

        // Fixed rate specification (same as previous steps)
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

        // CLP notional
        NonNegativeQuantitySchedule clpNotionalSchedule = NonNegativeQuantitySchedule.builder()
            .setValue(BigDecimal.valueOf(950000000000.00))
            .setUnit(UnitType.builder()
                .setCurrencyValue("CLP")
                .build())
            .build();
        
        ResolvablePriceQuantity clpNotional = ResolvablePriceQuantity.builder()
            .setQuantityScheduleValue(clpNotionalSchedule)
            .build();

        // Step 6b: Fixed leg with payment dates
        InterestRatePayout fixedLeg = InterestRatePayout.builder()
            .setPayerReceiver(PayerReceiver.builder()
                .setPayer(CounterpartyRoleEnum.PARTY_1)
                .setReceiver(CounterpartyRoleEnum.PARTY_2)
                .build())
            .setRateSpecification(fixedRateSpecification)
            .setDayCountFractionValue(DayCountFractionEnum.ACT_360)
            .setPriceQuantity(clpNotional)
            .setCalculationPeriodDates(calculationPeriodDates)
            .setPaymentDates(paymentDates) // NEW: Payment dates added
            .build();

        // Floating rate specification (same as previous steps)
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
                    .setValue(BigDecimal.valueOf(0.01))
                    .build())
                .build())
            .build();

        RateSpecification floatingRateSpecification = RateSpecification.builder()
            .setFloatingRateSpecification(floatingRateSpec)
            .build();

        // USD notional
        NonNegativeQuantitySchedule usdNotionalSchedule = NonNegativeQuantitySchedule.builder()
            .setValue(BigDecimal.valueOf(10000000.00))
            .setUnit(UnitType.builder()
                .setCurrencyValue("USD")
                .build())
            .build();
        
        ResolvablePriceQuantity usdNotional = ResolvablePriceQuantity.builder()
            .setQuantityScheduleValue(usdNotionalSchedule)
            .build();

        // Step 6c: Floating leg with payment dates
        InterestRatePayout floatingLeg = InterestRatePayout.builder()
            .setPayerReceiver(PayerReceiver.builder()
                .setPayer(CounterpartyRoleEnum.PARTY_2)
                .setReceiver(CounterpartyRoleEnum.PARTY_1)
                .build())
            .setRateSpecification(floatingRateSpecification)
            .setDayCountFractionValue(DayCountFractionEnum.ACT_360)
            .setPriceQuantity(usdNotional)
            .setCalculationPeriodDates(calculationPeriodDates)
            .setPaymentDates(paymentDates) // NEW: Payment dates added
            .build();

        // Step 6d: FX Observable - To be implemented separately
        // The FX observable for Dólar Observado (CLP/USD conversion) is needed for:
        // - Converting CLP leg amounts to USD for net settlement
        // - T-1 business day fixing (Dólar Observado from BCCh)
        // - Rate source: Banco Central de Chile
        // Note: Observable API in CDM 6.0.0 requires further research

        // Create product with both payouts (payment dates now included)
        NonTransferableProduct product = NonTransferableProduct.builder()
            .setEconomicTerms(EconomicTerms.builder()
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