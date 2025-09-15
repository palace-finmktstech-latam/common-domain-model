# EquityPerformance

**Full Name:** `cdm.event.common.functions.EquityPerformance`

**Package:** `cdm.event.common.functions`

## Type: Abstract Class

### Implemented Interfaces

- `com.rosetta.model.lib.functions.RosettaFunction`

### Fields

| Name | Type | Description |
|------|------|-------------|
| conditionValidator | `ConditionValidator` |  |
| equityNotionalAmount | `EquityNotionalAmount` |  |
| rateOfReturn0 | `RateOfReturn` |  |
| resolvePerformancePeriodStartPrice | `ResolvePerformancePeriodStartPrice` |  |

### Methods

#### Other Methods

- `BigDecimal evaluate(Trade arg0, Price arg1, Date arg2)`
- `BigDecimal doEvaluate(Trade arg0, Price arg1, Date arg2)`
- `MapperS notionalAmount(Trade arg0, Price arg1, Date arg2)`
- `MapperS rateOfReturn1(Trade arg0, Price arg1, Date arg2)`
- `MapperS periodStartPrice(Trade arg0, Price arg1, Date arg2)`
- `MapperS periodEndPrice(Trade arg0, Price arg1, Date arg2)`
- `MapperS performancePayout(Trade arg0, Price arg1, Date arg2)`
- `MapperS numberOfSecurities(Trade arg0, Price arg1, Date arg2)`

### Annotations

- **ImplementedBy**

