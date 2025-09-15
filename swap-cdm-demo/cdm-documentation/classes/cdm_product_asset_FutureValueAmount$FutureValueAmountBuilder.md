# FutureValueAmountBuilder

**Full Name:** `cdm.product.asset.FutureValueAmount$FutureValueAmountBuilder`

**Package:** `cdm.product.asset`

## Type: Interface

### Implemented Interfaces

- `cdm.product.asset.FutureValueAmount`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`

### Methods

#### Setter Methods

- `FutureValueAmountBuilder setCurrency(FieldWithMetaString arg0)`
- `FutureValueAmountBuilder setQuantity(ReferenceWithMetaNonNegativeQuantitySchedule arg0)`
- `FutureValueAmountBuilder setQuantityValue(NonNegativeQuantitySchedule arg0)`
- `FutureValueAmountBuilder setCurrencyValue(String arg0)`
- `FutureValueAmountBuilder setCalculationPeriodNumberOfDays(Integer arg0)`
- `FutureValueAmountBuilder setValueDate(Date arg0)`

#### Getter Methods

- `FieldWithMetaStringBuilder getCurrency()`
- `ReferenceWithMetaNonNegativeQuantityScheduleBuilder getQuantity()`
- `ReferenceWithMetaNonNegativeQuantityScheduleBuilder getOrCreateQuantity()`
- `FieldWithMetaStringBuilder getOrCreateCurrency()`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `FutureValueAmountBuilder prune()`

