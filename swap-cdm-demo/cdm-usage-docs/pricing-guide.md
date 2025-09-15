# Pricing and Observables Guide

## Overview

CDM supports various pricing mechanisms and market observables.

## Fixed Rate Specification

```java
FixedRateSpecification fixedRate = FixedRateSpecification.builder()
    .setRateSchedule(RateSchedule.builder()
        .setPriceValue(BigDecimal.valueOf(0.04715)) // 4.715%
        .build())
    .build();
```

## Floating Rate Specification

### Basic Floating Rate

```java
FloatingRateSpecification floatingRate = FloatingRateSpecification.builder()
    .setRateOption(FloatingRateOption.builder()
        .setFloatingRateIndexValue(FloatingRateIndexEnum.USD_SOFR)
        .setIndexTenor(Period.builder()
            .setPeriodMultiplier(1)
            .setPeriod(PeriodEnum.D)
            .build())
        .build())
    .build();
```

### Floating Rate with Spread

```java
FloatingRateSpecification floatingWithSpread = FloatingRateSpecification.builder()
    .setRateOption(floatingRateOption)
    .setSpreadSchedule(SpreadSchedule.builder()
        .addInitialValue(BigDecimal.valueOf(0.0025)) // 25 bps
        .build())
    .build();
```

## Observable Assets

### Interest Rate Index

```java
Observable observable = Observable.builder()
    .setRateOption(FloatingRateOption.builder()
        .setFloatingRateIndexValue(FloatingRateIndexEnum.CLP_TNA) // Chilean overnight
        .build())
    .build();
```

### FX Rate

```java
Observable fxObservable = Observable.builder()
    .setCurrencyPair(QuotedCurrencyPair.builder()
        .setCurrency1Value("USD")
        .setCurrency2Value("CLP")
        .setQuoteBasis(QuoteBasisEnum.CURRENCY2_PER_CURRENCY1)
        .build())
    .build();
```

## Price and Quantity

```java
PriceQuantity priceQuantity = PriceQuantity.builder()
    .addQuantityValue(NonNegativeQuantitySchedule.builder()
        .setValue(BigDecimal.valueOf(300000000000.00)) // Notional
        .setUnit(UnitType.builder()
            .setCurrencyValue("CLP")
            .build())
        .build())
    .addPriceValue(PriceSchedule.builder()
        .setValue(BigDecimal.valueOf(850.50)) // FX rate
        .setUnit(UnitType.builder()
            .setCurrencyValue("CLP")
            .setPerUnitOf(UnitType.builder()
                .setCurrencyValue("USD")
                .build())
            .build())
        .build())
    .build();
```

