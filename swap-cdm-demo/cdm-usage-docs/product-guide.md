# Product Modeling Guide

## Overview

Products in CDM represent the economic terms of financial instruments.

## Product Hierarchy

```
Product
├── ContractualProduct
│   └── EconomicTerms
│       ├── Payout
│       │   ├── InterestRatePayout[]
│       │   ├── CreditDefaultPayout
│       │   └── EquityPayout
│       └── Collateral
└── Index
```

## Interest Rate Swap Product

### Creating the Product Container

```java
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
```

### Fixed Rate Leg

```java
InterestRatePayout fixedLeg = InterestRatePayout.builder()
    .setPayerReceiver(PayerReceiver.builder()
        .setPayer(CounterpartyRoleEnum.PARTY_1)
        .setReceiver(CounterpartyRoleEnum.PARTY_2)
        .build())
    .setRateSpecification(RateSpecification.builder()
        .setFixedRate(FixedRateSpecification.builder()
            .setRateSchedule(RateSchedule.builder()
                .setPriceValue(BigDecimal.valueOf(0.04715)) // 4.715%
                .build())
            .build())
        .build())
    .setDayCountFraction(DayCountFractionEnum.ACT_360)
    .setCalculationPeriodDates(calculationDates)
    .setPaymentDates(paymentDates)
    .setPriceQuantity(PriceQuantity.builder()
        .addQuantityValue(NonNegativeQuantitySchedule.builder()
            .setValue(BigDecimal.valueOf(300000000000.00)) // 300B CLP
            .setUnit(UnitType.builder()
                .setCurrencyValue("CLP")
                .build())
            .build())
        .build())
    .build();
```

### Floating Rate Leg

```java
InterestRatePayout floatingLeg = InterestRatePayout.builder()
    .setPayerReceiver(PayerReceiver.builder()
        .setPayer(CounterpartyRoleEnum.PARTY_2)
        .setReceiver(CounterpartyRoleEnum.PARTY_1)
        .build())
    .setRateSpecification(RateSpecification.builder()
        .setFloatingRate(FloatingRateSpecification.builder()
            .setRateOption(FloatingRateOption.builder()
                .setFloatingRateIndexValue(FloatingRateIndexEnum.CLP_TNA) // Chilean overnight
                .setIndexTenor(Period.builder()
                    .setPeriodMultiplier(1)
                    .setPeriod(PeriodEnum.D) // Daily
                    .build())
                .build())
            .build())
        .build())
    .setDayCountFraction(DayCountFractionEnum.ACT_360)
    .setCalculationPeriodDates(calculationDates)
    .setPaymentDates(paymentDates)
    .setPriceQuantity(priceQuantity) // Same notional
    .build();
```

## Other Product Types

### FX Forward

```java
Product fxProduct = Product.builder()
    .setContractualProduct(ContractualProduct.builder()
        .setEconomicTerms(EconomicTerms.builder()
            .setPayout(Payout.builder()
                .setForwardPayout(ForwardPayout.builder()
                    .setUnderlier(Product.builder()
                        .setForeignExchange(ForeignExchange.builder()
                            .setQuotedCurrencyPair(QuotedCurrencyPair.builder()
                                .setCurrency1Value("USD")
                                .setCurrency2Value("CLP")
                                .setQuoteBasis(QuoteBasisEnum.CURRENCY2_PER_CURRENCY1)
                                .build())
                            .build())
                        .build())
                    .build())
                .build())
            .build())
        .build())
    .build();
```

