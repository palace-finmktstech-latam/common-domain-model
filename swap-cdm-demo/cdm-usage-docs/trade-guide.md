# Trade Construction Guide

## Overview

The `Trade` class is the central object for representing financial trades in CDM.

## Trade Structure

```
Trade
├── TradeDate
├── TradeIdentifier[]
├── Party[]
├── Counterparty[]
├── TradableProduct
│   ├── Product
│   └── TradeLot[]
├── ExecutionDetails
└── ContractDetails
```

## Building a Trade

### Step 1: Basic Trade Information

```java
Trade.TradeBuilder tradeBuilder = Trade.builder();

// Set trade date
tradeBuilder.setTradeDateValue(Date.of(2025, 9, 10));

// Add trade identifier
TradeIdentifier tradeId = TradeIdentifier.builder()
    .addAssignedIdentifier(AssignedIdentifier.builder()
        .setIdentifierValue("7554")
        .setVersion(1)
        .build())
    .setIdentifierType(TradeIdentifierTypeEnum.UNIQUE_TRANSACTION_IDENTIFIER)
    .build();
tradeBuilder.addTradeIdentifier(tradeId);
```

### Step 2: Add Parties

```java
// Create parties
Party party1 = Party.builder()
    .setPartyIdValue("LEI:969500MGHJHVT9Q8X221") // Example LEI
    .setNameValue("Bank ABC")
    .build();

Party party2 = Party.builder()
    .setPartyIdValue("LEI:969500MGHJHVT9Q8X222")
    .setNameValue("SCOTIABANK CHILE")
    .build();

tradeBuilder.addParty(party1).addParty(party2);
```

### Step 3: Define Counterparties

```java
// Define counterparty roles
Counterparty cp1 = Counterparty.builder()
    .setRole(CounterpartyRoleEnum.PARTY_1)
    .setPartyReferenceValue(party1.getMeta().getGlobalKey())
    .build();

Counterparty cp2 = Counterparty.builder()
    .setRole(CounterpartyRoleEnum.PARTY_2)
    .setPartyReferenceValue(party2.getMeta().getGlobalKey())
    .build();

tradeBuilder.addCounterparty(cp1).addCounterparty(cp2);
```

### Step 4: Attach Product

```java
// Create product (see Product Guide for details)
Product product = createProduct(); // Your product creation logic

TradableProduct tradableProduct = TradableProduct.builder()
    .setProduct(product)
    .build();

tradeBuilder.setTradableProduct(tradableProduct);
```

### Step 5: Build the Trade

```java
Trade trade = tradeBuilder.build();
```

## TradeState

TradeState wraps a Trade with lifecycle information:

```java
TradeState tradeState = TradeState.builder()
    .setTrade(trade)
    .setState(State.builder()
        .setPositionState(PositionStatusEnum.EXECUTED)
        .build())
    .build();
```

## Common Patterns

### Adding Multiple Identifiers

```java
tradeBuilder
    .addTradeIdentifier(TradeIdentifier.builder()
        .setIdentifierType(TradeIdentifierTypeEnum.UNIQUE_TRANSACTION_IDENTIFIER)
        .addAssignedIdentifier(assignedId1)
        .build())
    .addTradeIdentifier(TradeIdentifier.builder()
        .setIdentifierType(TradeIdentifierTypeEnum.UNIQUE_SWAP_IDENTIFIER)
        .addAssignedIdentifier(assignedId2)
        .build());
```

### Setting Execution Details

```java
ExecutionDetails executionDetails = ExecutionDetails.builder()
    .setExecutionType(ExecutionTypeEnum.ELECTRONIC)
    .setExecutionVenue(LegalEntity.builder()
        .setNameValue("Bloomberg SEF")
        .build())
    .build();

tradeBuilder.setExecutionDetails(executionDetails);
```

