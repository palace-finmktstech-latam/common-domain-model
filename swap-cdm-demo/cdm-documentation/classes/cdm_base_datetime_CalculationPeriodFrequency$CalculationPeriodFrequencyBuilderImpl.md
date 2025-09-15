# CalculationPeriodFrequencyBuilderImpl

**Full Name:** `cdm.base.datetime.CalculationPeriodFrequency$CalculationPeriodFrequencyBuilderImpl`

**Package:** `cdm.base.datetime`

## Type: Concrete Class

### Inheritance

**Extends:**
- `cdm.base.datetime.Frequency$FrequencyBuilderImpl`

### Implemented Interfaces

- `cdm.base.datetime.CalculationPeriodFrequency$CalculationPeriodFrequencyBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| rollConvention | `RollConventionEnum` |  |
| balanceOfFirstPeriod | `Boolean` |  |

### Methods

#### Builder Methods

- `CalculationPeriodFrequency build()`

#### Setter Methods

- `CalculationPeriodFrequencyBuilder setPeriod(PeriodExtendedEnum arg0)`
- `CalculationPeriodFrequencyBuilder setPeriodMultiplier(Integer arg0)`
- `CalculationPeriodFrequencyBuilder setRollConvention(RollConventionEnum arg0)`
- `CalculationPeriodFrequencyBuilder setBalanceOfFirstPeriod(Boolean arg0)`
- `CalculationPeriodFrequencyBuilder setMeta(MetaFields arg0)`

#### Getter Methods

- `RollConventionEnum getRollConvention()`
- `Boolean getBalanceOfFirstPeriod()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `CalculationPeriodFrequencyBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `boolean hasData()`
- `CalculationPeriodFrequencyBuilder toBuilder()`
- `CalculationPeriodFrequencyBuilder prune()`

