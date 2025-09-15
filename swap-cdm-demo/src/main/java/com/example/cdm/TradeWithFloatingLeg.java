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
import cdm.base.datetime.Period;
import cdm.base.datetime.PeriodEnum;
import cdm.product.common.settlement.ResolvablePriceQuantity;
import cdm.base.math.NonNegativeQuantitySchedule;
import cdm.base.math.UnitType;
import com.rosetta.model.lib.records.Date;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

/**
 * Step 4: Add Floating Rate Leg
 * 
 * Building on Step 3, now adding:
 * - Second InterestRatePayout for the floating leg
 * - FloatingRateSpecification with SOFR + spread
 * - USD notional for the floating leg
 * - Opposite payer/receiver direction
 * 
 * This creates both legs of our cross-currency interest rate swap
 */
public class TradeWithFloatingLeg {
    
    private final ObjectMapper objectMapper;
    
    public TradeWithFloatingLeg() {
        this.objectMapper = new ObjectMapper();
        this.objectMapper.registerModule(new JavaTimeModule());
        this.objectMapper.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
        this.objectMapper.enable(SerializationFeature.INDENT_OUTPUT);
    }

    public static void main(String[] args) {
        try {
            TradeWithFloatingLeg example = new TradeWithFloatingLeg();
            Trade trade = example.buildTradeWithFloatingLeg();
            
            System.out.println("=====================================");
            System.out.println("STEP 4: TRADE WITH FLOATING RATE LEG");
            System.out.println("=====================================");
            System.out.println();
            System.out.println("What we're adding:");
            System.out.println("• Fixed leg: Bank A pays 5% on CLP 950B");
            System.out.println("• Floating leg: Goldman Sachs pays SOFR+100bps on USD 10M");
            System.out.println("• Both legs in same product (interest rate swap)");
            System.out.println();
            
            String json = example.toJson(trade);
            System.out.println("JSON Output:");
            System.out.println("=====================================");
            System.out.println(json);
            
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public Trade buildTradeWithFloatingLeg() {
        
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

        // Step 4a: Create fixed leg (same as Step 3)
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

        InterestRatePayout fixedLeg = InterestRatePayout.builder()
            .setPayerReceiver(PayerReceiver.builder()
                .setPayer(CounterpartyRoleEnum.PARTY_1)    // Bank A pays
                .setReceiver(CounterpartyRoleEnum.PARTY_2) // Goldman Sachs receives
                .build())
            .setRateSpecification(fixedRateSpecification)
            .setDayCountFractionValue(DayCountFractionEnum.ACT_360)
            .setPriceQuantity(clpNotional)
            .build();

        // Step 4b: Create floating leg - Goldman Sachs pays SOFR + 100 bps
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

        InterestRatePayout floatingLeg = InterestRatePayout.builder()
            .setPayerReceiver(PayerReceiver.builder()
                .setPayer(CounterpartyRoleEnum.PARTY_2)    // Goldman Sachs pays
                .setReceiver(CounterpartyRoleEnum.PARTY_1) // Bank A receives
                .build())
            .setRateSpecification(floatingRateSpecification)
            .setDayCountFractionValue(DayCountFractionEnum.ACT_360)
            .setPriceQuantity(usdNotional)
            .build();

        // Step 4c: Create product with BOTH payouts
        NonTransferableProduct product = NonTransferableProduct.builder()
            .setEconomicTerms(EconomicTerms.builder()
                .addPayout(Payout.builder()
                    .setInterestRatePayout(fixedLeg)
                    .build())
                .addPayout(Payout.builder()  // Second payout for floating leg
                    .setInterestRatePayout(floatingLeg)
                    .build())
                .build())
            .build();

        // Create trade with both legs
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