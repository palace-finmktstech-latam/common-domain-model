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

- `QuantityMultiplierBuilder setFxLinkedNotionalSchedule(FxLinkedNotionalSchedule arg0)`
- `QuantityMultiplierBuilder setMultiplierValue(BigDecimal arg0)`

#### Getter Methods

- `FxLinkedNotionalScheduleBuilder getOrCreateFxLinkedNotionalSchedule()`
- `FxLinkedNotionalScheduleBuilder getFxLinkedNotionalSchedule()`
- `BigDecimal getMultiplierValue()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `QuantityMultiplierBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `boolean hasData()`
- `QuantityMultiplierBuilder toBuilder()`
- `QuantityMultiplierBuilder prune()`

