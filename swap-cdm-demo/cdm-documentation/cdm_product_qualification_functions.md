# Package: cdm.product.qualification.functions

## Abstract Classes

### Qualify_AssetClass_Equity
**Implements:** `RosettaFunction` 

**Fields:**
- `ProductDeepPathUtil productDeepPathUtil`
- `Qualify_AssetClass_Equity qualify_AssetClass_Equity`
- `Qualify_UnderlierObservable_Equity qualify_UnderlierObservable_Equity`

**Key Methods:**
- `settlementUnderlier(EconomicTerms arg0)` → `MapperS` [Setter]

### Qualify_InstrumentTypeEquity
**Implements:** `RosettaFunction` 

**Fields:**
- `InstrumentDeepPathUtil instrumentDeepPathUtil`

### Qualify_UnderlierObservable_Equity
**Implements:** `RosettaFunction` 

**Fields:**
- `IndexDeepPathUtil indexDeepPathUtil`
- `Qualify_InstrumentTypeEquity qualify_InstrumentTypeEquity`
- `Qualify_UnderlierObservable_Equity qualify_UnderlierObservable_Equity`

### SettlementPayoutOnlyExists
**Implements:** `RosettaFunction` 

