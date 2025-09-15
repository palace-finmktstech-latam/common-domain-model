# Package: cdm.product.template.functions

## Abstract Classes

### AddTradeLot
**Implements:** `RosettaFunction` 

**Fields:**
- `ModelObjectValidator objectValidator`

### CompareTradeLot
**Implements:** `RosettaFunction` 

**Fields:**
- `CompareQuantityByUnitOfAmount compareQuantityByUnitOfAmount`

### CompareTradeLotToAmount
**Implements:** `RosettaFunction` 

**Fields:**
- `CompareNumbers compareNumbers`

### Create_CashflowFromSettlementPayout
**Implements:** `RosettaFunction` 

**Fields:**
- `ConditionValidator conditionValidator`
- `ModelObjectValidator objectValidator`

### FilterTradeLot
**Implements:** `RosettaFunction` 

**Fields:**
- `ModelObjectValidator objectValidator`

### FpmlIrd8
**Implements:** `RosettaFunction` 

### PriceQuantityTriangulation
**Implements:** `RosettaFunction` 

**Fields:**
- `CashPriceQuantityNoOfUnitsTriangulation cashPriceQuantityNoOfUnitsTriangulation`

### ReplaceTradeLot
**Implements:** `RosettaFunction` 

**Fields:**
- `ModelObjectValidator objectValidator`

## Concrete Classes

### AddTradeLotDefault
**Extends:** `AddTradeLot` 

### CompareTradeLotDefault
**Extends:** `CompareTradeLot` 

### CompareTradeLotToAmountDefault
**Extends:** `CompareTradeLotToAmount` 

### Create_CashflowFromSettlementPayoutDefault
**Extends:** `Create_CashflowFromSettlementPayout` 

### FilterTradeLotDefault
**Extends:** `FilterTradeLot` 

### FpmlIrd8Default
**Extends:** `FpmlIrd8` 

### FpmlIrd8Impl
**Extends:** `FpmlIrd8` 

### PriceQuantityTriangulationDefault
**Extends:** `PriceQuantityTriangulation` 

### ReplaceTradeLotDefault
**Extends:** `ReplaceTradeLot` 

