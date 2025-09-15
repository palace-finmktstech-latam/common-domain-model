# Complete Swap Example

## Chilean Peso OIS Implementation

This example shows a complete implementation of a Chilean Peso Overnight Index Swap.

### Trade Details
- **Notional**: CLP 300,000,000,000
- **Fixed Rate**: 4.715%
- **Floating Index**: ICPCLP (Chilean overnight)
- **Start**: September 12, 2025
- **End**: January 5, 2026

### Complete Code

```java
public class ChileanOISExample {

    public TradeState buildChileanOIS() {
        // 1. Create parties
        Party bankParty = Party.builder()
            .setPartyIdValue("LEI:969500MGHJHVT9Q8X221")
            .setNameValue("Our Bank")
            .build();

        Party scotiabank = Party.builder()
            .setPartyIdValue("LEI:97018000197018000")
            .setNameValue("SCOTIABANK CHILE")
            .build();

        // 2. Define counterparties
        Counterparty cp1 = Counterparty.builder()
            .setRole(CounterpartyRoleEnum.PARTY_1)
            .setPartyReferenceValue(bankParty.getMeta().getGlobalKey())
            .build();

        Counterparty cp2 = Counterparty.builder()
            .setRole(CounterpartyRoleEnum.PARTY_2)
            .setPartyReferenceValue(scotiabank.getMeta().getGlobalKey())
            .build();

        // 3. Business day adjustments
        BusinessDayAdjustments bdAdjustments = BusinessDayAdjustments.builder()
            .setBusinessDayConvention(BusinessDayConventionEnum.MODFOLLOWING)
            .addBusinessCenters(BusinessCenters.builder()
                .addBusinessCenterValue(BusinessCenterEnum.CLSA) // Santiago
                .build())
            .build();

        // 4. Calculation period dates
        CalculationPeriodDates calcDates = CalculationPeriodDates.builder()
            .setEffectiveDate(AdjustableOrRelativeDate.builder()
                .setAdjustableDate(AdjustableDate.builder()
                    .setUnadjustedDate(Date.of(2025, 9, 12))
                    .setDateAdjustments(bdAdjustments)
                    .build())
                .build())
            .setTerminationDate(AdjustableOrRelativeDate.builder()
                .setAdjustableDate(AdjustableDate.builder()
                    .setUnadjustedDate(Date.of(2026, 1, 5))
                    .setDateAdjustments(bdAdjustments)
                    .build())
                .build())
            .build();

        // 5. Payment dates (bullet at maturity)
        PaymentDates paymentDates = PaymentDates.builder()
            .setPaymentFrequency(Frequency.builder()
                .setPeriodMultiplier(1)
                .setPeriod(PeriodExtendedEnum.T) // Term
                .build())
            .build();

        // 6. Notional
        PriceQuantity priceQuantity = PriceQuantity.builder()
            .addQuantityValue(NonNegativeQuantitySchedule.builder()
                .setValue(BigDecimal.valueOf(300000000000.00))
                .setUnit(UnitType.builder()
                    .setCurrencyValue("CLP")
                    .build())
                .build())
            .build();

        // 7. Fixed leg (Bank receives)
        InterestRatePayout fixedLeg = InterestRatePayout.builder()
            .setPayerReceiver(PayerReceiver.builder()
                .setPayer(CounterpartyRoleEnum.PARTY_2) // Scotiabank pays
                .setReceiver(CounterpartyRoleEnum.PARTY_1) // Bank receives
                .build())
            .setRateSpecification(RateSpecification.builder()
                .setFixedRate(FixedRateSpecification.builder()
                    .setRateSchedule(RateSchedule.builder()
                        .setPriceValue(BigDecimal.valueOf(0.04715))
                        .build())
                    .build())
                .build())
            .setDayCountFraction(DayCountFractionEnum.ACT_360)
            .setCalculationPeriodDates(calcDates)
            .setPaymentDates(paymentDates)
            .setPriceQuantity(priceQuantity)
            .build();

        // 8. Floating leg (Bank pays)
        InterestRatePayout floatingLeg = InterestRatePayout.builder()
            .setPayerReceiver(PayerReceiver.builder()
                .setPayer(CounterpartyRoleEnum.PARTY_1) // Bank pays
                .setReceiver(CounterpartyRoleEnum.PARTY_2) // Scotiabank receives
                .build())
            .setRateSpecification(RateSpecification.builder()
                .setFloatingRate(FloatingRateSpecification.builder()
                    .setRateOption(FloatingRateOption.builder()
                        .setFloatingRateIndexValue(FloatingRateIndexEnum.CLP_TNA)
                        .setIndexTenor(Period.builder()
                            .setPeriodMultiplier(1)
                            .setPeriod(PeriodEnum.D)
                            .build())
                        .build())
                    .build())
                .build())
            .setDayCountFraction(DayCountFractionEnum.ACT_360)
            .setCalculationPeriodDates(calcDates)
            .setPaymentDates(paymentDates)
            .setPriceQuantity(priceQuantity)
            .setCompoundingMethod(CompoundingMethodEnum.STRAIGHT) // Daily compounding
            .build();

        // 9. Create product
        Product product = Product.builder()
            .setContractualProduct(ContractualProduct.builder()
                .setEconomicTerms(EconomicTerms.builder()
                    .setPayout(Payout.builder()
                        .addInterestRatePayout(fixedLeg)
                        .addInterestRatePayout(floatingLeg)
                        .build())
                    .build())
                .build())
            .build();

        // 10. Create trade
        Trade trade = Trade.builder()
            .setTradeDateValue(Date.of(2025, 9, 10))
            .addTradeIdentifier(TradeIdentifier.builder()
                .addAssignedIdentifier(AssignedIdentifier.builder()
                    .setIdentifierValue("7554")
                    .build())
                .build())
            .addParty(bankParty)
            .addParty(scotiabank)
            .addCounterparty(cp1)
            .addCounterparty(cp2)
            .setTradableProduct(TradableProduct.builder()
                .setProduct(product)
                .build())
            .build();

        // 11. Wrap in TradeState
        return TradeState.builder()
            .setTrade(trade)
            .build();
    }
}
```

