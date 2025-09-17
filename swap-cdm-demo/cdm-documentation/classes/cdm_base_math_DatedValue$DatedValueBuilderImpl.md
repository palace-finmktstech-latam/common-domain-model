# DatedValueBuilderImpl

**Full Name:** `cdm.base.math.DatedValue$DatedValueBuilderImpl`

**Package:** `cdm.base.math`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.base.math.DatedValue$DatedValueBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| date | `Date` |  |
| value | `BigDecimal` |  |
| meta | `MetaFieldsBuilder` |  |

### Methods

#### Builder Methods

- `DatedValue build()`

#### Setter Methods

- `DatedValueBuilder setValue(BigDecimal arg0)`
- `DatedValueBuilder setDate(Date arg0)`
- `DatedValueBuilder setMeta(MetaFields arg0)`

#### Getter Methods

- `BigDecimal getValue()`
- `Date getDate()`
- `MetaFieldsBuilder getOrCreateMeta()`
- `MetaFieldsBuilder getMeta()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `DatedValueBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `DatedValueBuilder prune()`
- `DatedValueBuilder toBuilder()`
- `boolean hasData()`

