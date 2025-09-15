# Schedule Configuration Guide

## Overview

Schedules define calculation periods, payment dates, and resets for financial products.

## Key Schedule Components

- **CalculationPeriodDates**: When interest accrues
- **PaymentDates**: When payments are made
- **ResetDates**: When floating rates reset
- **StubPeriod**: Handling of partial periods

## Calculation Period Dates

```java
CalculationPeriodDates calculationDates = CalculationPeriodDates.builder()
    .setEffectiveDate(AdjustableOrRelativeDate.builder()
        .setAdjustableDate(AdjustableDate.builder()
            .setUnadjustedDate(Date.of(2025, 9, 12))
            .setDateAdjustments(BusinessDayAdjustments.builder()
                .setBusinessDayConvention(BusinessDayConventionEnum.MODFOLLOWING)
                .addBusinessCenters(BusinessCenters.builder()
                    .addBusinessCenterValue(BusinessCenterEnum.CLSA) // Santiago
                    .build())
                .build())
            .build())
        .build())
    .setTerminationDate(AdjustableOrRelativeDate.builder()
        .setAdjustableDate(AdjustableDate.builder()
            .setUnadjustedDate(Date.of(2026, 1, 5))
            .setDateAdjustments(businessDayAdjustments)
            .build())
        .build())
    .setCalculationPeriodFrequency(CalculationPeriodFrequency.builder()
        .setPeriodMultiplier(3)
        .setPeriod(PeriodExtendedEnum.M) // 3 months
        .setRollConvention(RollConventionEnum._5) // 5th of month
        .build())
    .build();
```

## Payment Dates

```java
PaymentDates paymentDates = PaymentDates.builder()
    .setPaymentFrequency(Frequency.builder()
        .setPeriodMultiplier(3)
        .setPeriod(PeriodExtendedEnum.M)
        .build())
    .setPayRelativeTo(PayRelativeToEnum.CALCULATION_PERIOD_END_DATE)
    .setPaymentDaysOffset(Offset.builder()
        .setPeriodMultiplier(2)
        .setDayType(DayTypeEnum.BUSINESS)
        .build())
    .setPaymentDatesAdjustments(BusinessDayAdjustments.builder()
        .setBusinessDayConvention(BusinessDayConventionEnum.MODFOLLOWING)
        .addBusinessCenters(businessCenters)
        .build())
    .build();
```

## Reset Dates (for Floating Rates)

```java
ResetDates resetDates = ResetDates.builder()
    .setResetRelativeTo(ResetRelativeToEnum.CALCULATION_PERIOD_START_DATE)
    .setFixingDates(RelativeDateOffset.builder()
        .setPeriodMultiplier(-2) // 2 days before
        .setDayType(DayTypeEnum.BUSINESS)
        .setBusinessDayConvention(BusinessDayConventionEnum.NONE)
        .addBusinessCenters(businessCenters)
        .build())
    .setResetFrequency(ResetFrequency.builder()
        .setPeriodMultiplier(1)
        .setPeriod(PeriodExtendedEnum.D) // Daily reset
        .build())
    .build();
```

## Stub Periods

### Front Stub

```java
StubPeriod frontStub = StubPeriod.builder()
    .setStubPeriodType(StubPeriodTypeEnum.SHORT_INITIAL)
    .build();
```

### Back Stub

```java
StubPeriod backStub = StubPeriod.builder()
    .setStubPeriodType(StubPeriodTypeEnum.SHORT_FINAL)
    .build();
```

## Business Day Conventions

| Convention | Description |
|------------|-------------|
| FOLLOWING | Move to next business day |
| MODFOLLOWING | Next business day unless different month |
| PRECEDING | Move to previous business day |
| MODPRECEDING | Previous business day unless different month |
| NONE | No adjustment |

