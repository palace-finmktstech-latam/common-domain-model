# QuantityMultiplierBuilderImpl

**Full Name:** `cdm.product.common.settlement.QuantityMultiplier$QuantityMultiplierBuilderImpl`

**Package:** `cdm.product.common.settlement`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.product.common.settlement.QuantityMultiplier$QuantityMultiplierBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| fxLinkedNotionalSchedule | `FxLinkedNotionalScheduleBuilder` |  |
| multiplierValue | `BigDecimal` |  |

### Methods

#### Builder Methods

- `QuantityMultiplier build()`

#### Setter Methods

- `QuantityMultiplierBuilder setMultiplierValue(BigDecimal arg0)`
- `QuantityMultiplierBuilder setFxLinkedNotionalSchedule(FxLinkedNotionalSchedule arg0)`

#### Getter Methods

- `BigDecimal getMultiplierValue()`
- `FxLinkedNotionalScheduleBuilder getOrCreateFxLinkedNotionalSchedule()`
- `FxLinkedNotionalScheduleBuilder getFxLinkedNotionalSchedule()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `QuantityMultiplierBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `QuantityMultiplierBuilder prune()`
- `QuantityMultiplierBuilder toBuilder()`
- `boolean hasData()`

