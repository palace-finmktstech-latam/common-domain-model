# Builder Pattern Guide

## Overview

All CDM objects use the Builder pattern for construction, ensuring immutability and validation.

## Basic Builder Usage

```java
// 1. Get a builder
Trade.TradeBuilder builder = Trade.builder();

// 2. Set properties
builder.setTradeDateValue(Date.of(2025, 9, 10));

// 3. Build the immutable object
Trade trade = builder.build();
```

## Method Chaining

```java
Trade trade = Trade.builder()
    .setTradeDateValue(Date.of(2025, 9, 10))
    .addTradeIdentifier(tradeId)
    .addParty(party1)
    .addParty(party2)
    .build();
```

## Common Builder Methods

### Setting Single Values

```java
builder.setFieldName(value);
```

### Adding to Lists

```java
builder.addFieldName(value);  // Add one item
builder.addAllFieldName(list); // Add multiple items
```

### Setting Lists

```java
builder.setFieldName(Arrays.asList(item1, item2));
```

## Nested Builders

```java
Trade trade = Trade.builder()
    .setTradableProduct(TradableProduct.builder()
        .setProduct(Product.builder()
            .setContractualProduct(ContractualProduct.builder()
                .setEconomicTerms(EconomicTerms.builder()
                    .setPayout(Payout.builder()
                        .addInterestRatePayout(interestPayout)
                        .build())
                    .build())
                .build())
            .build())
        .build())
    .build();
```

## Builder Reuse

```java
// Create a template builder
BusinessDayAdjustments.BusinessDayAdjustmentsBuilder adjBuilder = 
    BusinessDayAdjustments.builder()
        .setBusinessDayConvention(BusinessDayConventionEnum.MODFOLLOWING)
        .addBusinessCenters(businessCenters);

// Reuse for multiple dates
AdjustableDate date1 = AdjustableDate.builder()
    .setUnadjustedDate(Date.of(2025, 9, 12))
    .setDateAdjustments(adjBuilder.build())
    .build();

AdjustableDate date2 = AdjustableDate.builder()
    .setUnadjustedDate(Date.of(2026, 1, 5))
    .setDateAdjustments(adjBuilder.build())
    .build();
```

## Modifying Existing Objects

```java
// Objects are immutable, so use toBuilder()
Trade originalTrade = /* ... */;

Trade modifiedTrade = originalTrade.toBuilder()
    .setTradeDateValue(Date.of(2025, 9, 11)) // Change date
    .addTradeIdentifier(newIdentifier) // Add identifier
    .build();
```

## Validation

```java
try {
    Trade trade = builder.build();
    // Object is valid
} catch (Exception e) {
    // Validation failed
    System.err.println("Invalid trade: " + e.getMessage());
}
```

