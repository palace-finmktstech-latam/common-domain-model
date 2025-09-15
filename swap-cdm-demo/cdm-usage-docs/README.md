# CDM 6.0.0 Practical Usage Guide

## Overview

This guide provides practical, hands-on documentation for using the FINOS Common Domain Model (CDM) 6.0.0 in Java.

## Quick Start

### Key Concepts

1. **Builder Pattern**: All CDM objects use the builder pattern for construction
2. **Immutability**: Once built, CDM objects are immutable
3. **Validation**: CDM provides built-in validation rules
4. **Metadata**: Rich metadata support for audit and lineage

### Core Components

| Component | Purpose | Key Classes |
|-----------|---------|-------------|
| **Trade** | Represents a financial trade | `Trade`, `TradeState`, `ExecutionDetails` |
| **Product** | Defines financial products | `Product`, `InterestRatePayout`, `FixedRateSpecification` |
| **Party** | Counterparty information | `Party`, `PartyRole`, `Counterparty` |
| **Schedule** | Payment and calculation schedules | `CalculationPeriodDates`, `PaymentDates` |
| **Observable** | Market data and rates | `Observable`, `FloatingRateOption` |

## Component Guides

- [Trade Construction Guide](trade-guide.md)
- [Product Modeling Guide](product-guide.md)
- [Party Management Guide](party-guide.md)
- [Schedule Configuration Guide](schedule-guide.md)
- [Pricing and Observables Guide](pricing-guide.md)
- [Builder Pattern Guide](builder-pattern-guide.md)
- [Complete Swap Example](swap-example-guide.md)

## Basic Example

```java
// Create a simple trade
Trade trade = Trade.builder()
    .setTradeDateValue(Date.of(2025, 9, 10))
    .addTradeIdentifier(TradeIdentifier.builder()
        .addAssignedIdentifier(AssignedIdentifier.builder()
            .setIdentifierValue("DEAL-7554")
            .build())
        .build())
    .build();
```

