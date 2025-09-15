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
import cdm.product.common.settlement.ResolvablePriceQuantity;
import cdm.base.math.NonNegativeQuantitySchedule;
import cdm.base.math.UnitType;
import com.rosetta.model.lib.records.Date;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

/**
 * Step 3: Complete Fixed Rate Leg
 * 
 * Building on Step 2, now adding:
 * - 5% fixed rate specification with proper CDM nesting
 * - Day count fraction (ACT/360)
 * - Notional amount (CLP 950 billion)
 * 
 * This creates a complete fixed rate leg with all essential components
 */
public class TradeWithFixedRate {
    
    private final ObjectMapper objectMapper;
    
    public TradeWithFixedRate() {
        this.objectMapper = new ObjectMapper();
        this.objectMapper.registerModule(new JavaTimeModule());
        this.objectMapper.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
        this.objectMapper.enable(SerializationFeature.INDENT_OUTPUT);
    }

    public static void main(String[] args) {
        try {
            TradeWithFixedRate example = new TradeWithFixedRate();
            Trade trade = example.buildTradeWithFixedRate();
            
            System.out.println("=====================================");
            System.out.println("STEP 3: TRADE WITH 5% FIXED RATE");
            System.out.println("=====================================");
            System.out.println();
            System.out.println("What we're adding:");
            System.out.println("• Rate specification: 5% fixed rate");
            System.out.println("• Day count fraction: ACT/360");
            System.out.println("• Notional amount: CLP 950 billion");
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

    public Trade buildTradeWithFixedRate() {
        
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

        // Step 3: Create complete rate specification with 5% rate and conventions
        // PriceSchedule: Contains the actual rate value (0.05 = 5%)
        // Note: For interest rates, CDM typically doesn't require explicit unit specification
        // The context (being in an interest rate payout) implies percentage
        PriceSchedule priceSchedule = PriceSchedule.builder()
            .setValue(BigDecimal.valueOf(0.05)) // 5% as decimal (0.05)
            .build();
        
        // FixedRateSpecification: Contains the rate schedule
        FixedRateSpecification fixedRateSpec = FixedRateSpecification.builder()
            .setRateSchedule(RateSchedule.builder()
                .setPriceValue(priceSchedule) // The 5% rate
                .build())
            .build();

        RateSpecification rateSpec = RateSpecification.builder()
            .setFixedRateSpecification(fixedRateSpec)
            .build();

        // Step 3b: Create notional amount - CLP 950 billion
        // CDM uses ResolvablePriceQuantity for notional amounts
        NonNegativeQuantitySchedule notionalSchedule = NonNegativeQuantitySchedule.builder()
            .setValue(BigDecimal.valueOf(950000000000.00)) // CLP 950 billion
            .setUnit(UnitType.builder()
                .setCurrencyValue("CLP") // Chilean Peso
                .build())
            .build();
        
        ResolvablePriceQuantity clpNotional = ResolvablePriceQuantity.builder()
            .setQuantityScheduleValue(notionalSchedule)
            .build();

        // InterestRatePayout: Contains rate + calculation conventions + notional
        // Note: Business day adjustments are typically added via CalculationPeriodDates and PaymentDates
        // We'll add those in Step 5 when we build the full schedule structure
        InterestRatePayout fixedLeg = InterestRatePayout.builder()
            .setPayerReceiver(PayerReceiver.builder()
                .setPayer(CounterpartyRoleEnum.PARTY_1)    // Bank A pays
                .setReceiver(CounterpartyRoleEnum.PARTY_2) // Goldman Sachs receives
                .build())
            .setRateSpecification(rateSpec)  // The 5% fixed rate
            .setDayCountFractionValue(DayCountFractionEnum.ACT_360) // Actual/360 day count
            .setPriceQuantity(clpNotional)  // CLP 950 billion notional
            // Business day adjustments would be added via:
            // .setCalculationPeriodDates() - with business day rules for period boundaries
            // .setPaymentDates() - with business day rules for payment dates
            .build();

        // Create product with the payout
        NonTransferableProduct product = NonTransferableProduct.builder()
            .setEconomicTerms(EconomicTerms.builder()
                .addPayout(Payout.builder()
                    .setInterestRatePayout(fixedLeg)
                    .build())
                .build())
            .build();

        // Create trade with product
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