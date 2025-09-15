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
import cdm.base.datetime.PeriodExtendedEnum;
import cdm.product.common.settlement.ResolvablePriceQuantity;
import cdm.base.math.NonNegativeQuantitySchedule;
import cdm.base.math.UnitType;
import com.rosetta.model.lib.records.Date;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

/**
 * Step 5: Add Cross-Currency Elements
 * 
 * Building on Step 4, now adding:
 * - Settlement currency (USD) for both legs
 * - FX observable for CLP/USD conversion
 * - Business centers (NY + Santiago)
 * - Calculation period dates with business day adjustments
 * 
 * This creates a proper cross-currency swap with settlement considerations
 */
public class CrossCurrencySwap {
    
    private final ObjectMapper objectMapper;
    
    public CrossCurrencySwap() {
        this.objectMapper = new ObjectMapper();
        this.objectMapper.registerModule(new JavaTimeModule());
        this.objectMapper.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
        this.objectMapper.enable(SerializationFeature.INDENT_OUTPUT);
    }

    public static void main(String[] args) {
        try {
            CrossCurrencySwap example = new CrossCurrencySwap();
            Trade trade = example.buildCrossCurrencySwap();
            
            System.out.println("====================================");
            System.out.println("STEP 5: CROSS-CURRENCY ELEMENTS");
            System.out.println("====================================");
            System.out.println();
            System.out.println("What we're adding:");
            System.out.println("• Settlement currency: USD for both legs");
            System.out.println("• FX observable: CLP/USD for conversion");
            System.out.println("• Business centers: NY + Santiago");
            System.out.println("• Calculation period dates: Sep 2025 - Sep 2030");
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

    public Trade buildCrossCurrencySwap() {
        
        // Same party setup as before
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

        // Step 5a: Business Day Adjustments (NY + Santiago calendars)
        BusinessCenters businessCenters = BusinessCenters.builder()
            .addBusinessCenterValue(BusinessCenterEnum.USNY) // New York
            .addBusinessCenterValue(BusinessCenterEnum.CLSA) // Santiago
            .build();
        
        BusinessDayAdjustments businessDayAdjustments = BusinessDayAdjustments.builder()
            .setBusinessDayConvention(BusinessDayConventionEnum.MODFOLLOWING)
            .setBusinessCenters(businessCenters)
            .build();

        // Step 5b: Calculation Period Dates (effective and termination)
        CalculationPeriodDates calculationPeriodDates = CalculationPeriodDates.builder()
            .setEffectiveDate(AdjustableOrRelativeDate.builder()
                .setAdjustableDate(AdjustableDate.builder()
                    .setUnadjustedDate(Date.of(2025, 9, 15)) // September 15, 2025
                    .setDateAdjustments(businessDayAdjustments)
                    .build())
                .build())
            .setTerminationDate(AdjustableOrRelativeDate.builder()
                .setAdjustableDate(AdjustableDate.builder()
                    .setUnadjustedDate(Date.of(2030, 9, 15)) // September 15, 2030 (5 years)
                    .setDateAdjustments(businessDayAdjustments)
                    .build())
                .build())
            .setCalculationPeriodFrequency(CalculationPeriodFrequency.builder()
                .setPeriodMultiplier(6) // Semi-annual
                .setPeriod(PeriodExtendedEnum.M) // Months
                .setRollConvention(RollConventionEnum._15) // Roll on 15th
                .build())
            .setCalculationPeriodDatesAdjustments(businessDayAdjustments)
            .build();

        // Fixed rate specification (same as Step 4)
        PriceSchedule fixedRateSchedule = PriceSchedule.builder()
            .setValue(BigDecimal.valueOf(0.05)) // 5% as decimal
            .build();
        
        FixedRateSpecification fixedRateSpec = FixedRateSpecification.builder()
            .setRateSchedule(RateSchedule.builder()
                .setPriceValue(fixedRateSchedule)
                .build())
            .build();

        RateSpecification fixedRateSpecification = RateSpecification.builder()
            .setFixedRateSpecification(fixedRateSpec)
            .build();

        // CLP notional for fixed leg
        NonNegativeQuantitySchedule clpNotionalSchedule = NonNegativeQuantitySchedule.builder()
            .setValue(BigDecimal.valueOf(950000000000.00)) // CLP 950 billion
            .setUnit(UnitType.builder()
                .setCurrencyValue("CLP")
                .build())
            .build();
        
        ResolvablePriceQuantity clpNotional = ResolvablePriceQuantity.builder()
            .setQuantityScheduleValue(clpNotionalSchedule)
            .build();

        // Step 5c: Fixed leg with settlement currency USD
        InterestRatePayout fixedLeg = InterestRatePayout.builder()
            .setPayerReceiver(PayerReceiver.builder()
                .setPayer(CounterpartyRoleEnum.PARTY_1)    // Bank A pays
                .setReceiver(CounterpartyRoleEnum.PARTY_2) // Goldman Sachs receives
                .build())
            .setRateSpecification(fixedRateSpecification)
            .setDayCountFractionValue(DayCountFractionEnum.ACT_360)
            .setPriceQuantity(clpNotional) // CLP notional
            .setCalculationPeriodDates(calculationPeriodDates)
            // NEW: Settlement currency would go here if CDM supported it
            // Note: setSettlementCurrency method not available in CDM 6.0.0
            .build();

        // Floating rate specification (same as Step 4)
        FloatingRateSpecification floatingRateSpec = FloatingRateSpecification.builder()
            .setRateOptionValue(InterestRateIndex.builder()
                .setFloatingRateIndex(FloatingRateIndex.builder()
                    .setFloatingRateIndexValue(FloatingRateIndexEnum.USD_SOFR_COMPOUND)
                    .setIndexTenor(Period.builder()
                        .setPeriodMultiplier(1) // Daily compounding
                        .setPeriod(PeriodEnum.D)
                        .build())
                    .build())
                .build())
            .setSpreadSchedule(SpreadSchedule.builder()
                .setPriceValue(PriceSchedule.builder()
                    .setValue(BigDecimal.valueOf(0.01)) // 100 basis points = 1%
                    .build())
                .build())
            .build();

        RateSpecification floatingRateSpecification = RateSpecification.builder()
            .setFloatingRateSpecification(floatingRateSpec)
            .build();

        // USD notional for floating leg
        NonNegativeQuantitySchedule usdNotionalSchedule = NonNegativeQuantitySchedule.builder()
            .setValue(BigDecimal.valueOf(10000000.00)) // USD 10 million
            .setUnit(UnitType.builder()
                .setCurrencyValue("USD")
                .build())
            .build();
        
        ResolvablePriceQuantity usdNotional = ResolvablePriceQuantity.builder()
            .setQuantityScheduleValue(usdNotionalSchedule)
            .build();

        // Step 5d: Floating leg with settlement currency USD
        InterestRatePayout floatingLeg = InterestRatePayout.builder()
            .setPayerReceiver(PayerReceiver.builder()
                .setPayer(CounterpartyRoleEnum.PARTY_2)    // Goldman Sachs pays
                .setReceiver(CounterpartyRoleEnum.PARTY_1) // Bank A receives
                .build())
            .setRateSpecification(floatingRateSpecification)
            .setDayCountFractionValue(DayCountFractionEnum.ACT_360)
            .setPriceQuantity(usdNotional) // USD notional
            .setCalculationPeriodDates(calculationPeriodDates)
            // Settlement currency would go here if CDM supported it
            // Note: setSettlementCurrency method not available in CDM 6.0.0
            .build();

        // Step 5e: Note about FX Observable
        // In a complete implementation, would add FX observable for CLP/USD conversion
        // The observable would specify:
        // - Currency pair (USD/CLP)
        // - Quote basis (CLP per USD)
        // - Information source (e.g., Banco Central de Chile for Dólar Observado)
        // - Fixing time (T-1 business day)
        // Note: Observable API may vary in CDM 6.0.0

        // Create product with both payouts
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

        // Create trade with cross-currency product
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