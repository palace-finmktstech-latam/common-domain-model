# NonNegativeStepBuilderImpl

**Full Name:** `cdm.base.math.NonNegativeStep$NonNegativeStepBuilderImpl`

**Package:** `cdm.base.math`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.base.math.NonNegativeStep$NonNegativeStepBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| stepDate | `Date` |  |
| stepValue | `BigDecimal` |  |
| meta | `MetaFieldsBuilder` |  |

### Methods

#### Builder Methods

- `NonNegativeStep build()`

#### Setter Methods

- `NonNegativeStepBuilder setMeta(MetaFields arg0)`
- `NonNegativeStepBuilder setStepDate(Date arg0)`
- `NonNegativeStepBuilder setStepValue(BigDecimal arg0)`

#### Getter Methods

- `MetaFieldsBuilder getOrCreateMeta()`
- `MetaFieldsBuilder getMeta()`
- `Date getStepDate()`
- `BigDecimal getStepValue()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `NonNegativeStepBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `boolean hasData()`
- `NonNegativeStepBuilder toBuilder()`
- `NonNegativeStepBuilder prune()`

