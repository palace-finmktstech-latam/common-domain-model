# FutureValueAmountBuilderImpl

**Full Name:** `cdm.product.asset.FutureValueAmount$FutureValueAmountBuilderImpl`

**Package:** `cdm.product.asset`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.product.asset.FutureValueAmount$FutureValueAmountBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| quantity | `ReferenceWithMetaNonNegativeQuantityScheduleBuilder` |  |
| currency | `FieldWithMetaStringBuilder` |  |
| calculationPeriodNumberOfDays | `Integer` |  |
| valueDate | `Date` |  |

### Methods

#### Builder Methods

- `FutureValueAmount build()`

#### Setter Methods

- `FutureValueAmountBuilder setCurrency(FieldWithMetaString arg0)`
- `FutureValueAmountBuilder setQuantity(ReferenceWithMetaNonNegativeQuantitySchedule arg0)`
- `FutureValueAmountBuilder setCurrencyValue(String arg0)`
- `FutureValueAmountBuilder setQuantityValue(NonNegativeQuantitySchedule arg0)`
- `FutureValueAmountBuilder setCalculationPeriodNumberOfDays(Integer arg0)`
- `FutureValueAmountBuilder setValueDate(Date arg0)`

#### Getter Methods

- `FieldWithMetaStringBuilder getCurrency()`
- `ReferenceWithMetaNonNegativeQuantityScheduleBuilder getQuantity()`
- `ReferenceWithMetaNonNegativeQuantityScheduleBuilder getOrCreateQuantity()`
- `Integer getCalculationPeriodNumberOfDays()`
- `FieldWithMetaStringBuilder getOrCreateCurrency()`
- `Date getValueDate()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `FutureValueAmountBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `FutureValueAmountBuilder prune()`
- `FutureValueAmountBuilder toBuilder()`
- `boolean hasData()`

