# Package: cdm.event.position.functions

## Abstract Classes

### EvaluatePortfolioState
**Implements:** `RosettaFunction` 

**Fields:**
- `ModelObjectValidator objectValidator`

### FxMarkToMarket
**Implements:** `RosettaFunction` 

**Fields:**
- `ConditionValidator conditionValidator`
- `FilterQuantityByCurrency filterQuantityByCurrency`
- `InterpolateForwardRate interpolateForwardRate`

**Key Methods:**
- `settlementPayout(Trade arg0)` → `MapperS` [Setter]

### InterpolateForwardRate
**Implements:** `RosettaFunction` 

### IsValidPartyRole
**Implements:** `RosettaFunction` 

## Concrete Classes

### EvaluatePortfolioStateDefault
**Extends:** `EvaluatePortfolioState` 

### FxMarkToMarketDefault
**Extends:** `FxMarkToMarket` 

**Key Methods:**
- `settlementPayout(Trade arg0)` → `MapperS` [Setter]

### InterpolateForwardRateDefault
**Extends:** `InterpolateForwardRate` 

### IsValidPartyRoleDefault
**Extends:** `IsValidPartyRole` 

