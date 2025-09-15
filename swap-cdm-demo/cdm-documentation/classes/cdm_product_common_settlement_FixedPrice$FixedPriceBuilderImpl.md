# FixedPriceBuilderImpl

**Full Name:** `cdm.product.common.settlement.FixedPrice$FixedPriceBuilderImpl`

**Package:** `cdm.product.common.settlement`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.product.common.settlement.FixedPrice$FixedPriceBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| price | `ReferenceWithMetaPriceScheduleBuilder` |  |

### Methods

#### Builder Methods

- `FixedPrice build()`

#### Setter Methods

- `FixedPriceBuilder setPriceValue(PriceSchedule arg0)`
- `FixedPriceBuilder setPrice(ReferenceWithMetaPriceSchedule arg0)`

#### Getter Methods

- `ReferenceWithMetaPriceScheduleBuilder getOrCreatePrice()`
- `ReferenceWithMetaPriceScheduleBuilder getPrice()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `FixedPriceBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `boolean hasData()`
- `FixedPriceBuilder toBuilder()`
- `FixedPriceBuilder prune()`

