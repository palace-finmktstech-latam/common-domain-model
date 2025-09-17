# AdjustableOrRelativeDateBuilderImpl

**Full Name:** `cdm.base.datetime.AdjustableOrRelativeDate$AdjustableOrRelativeDateBuilderImpl`

**Package:** `cdm.base.datetime`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.base.datetime.AdjustableOrRelativeDate$AdjustableOrRelativeDateBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| adjustableDate | `AdjustableDateBuilder` |  |
| relativeDate | `AdjustedRelativeDateOffsetBuilder` |  |
| meta | `MetaFieldsBuilder` |  |

### Methods

#### Builder Methods

- `AdjustableOrRelativeDate build()`

#### Setter Methods

- `AdjustableOrRelativeDateBuilder setMeta(MetaFields arg0)`
- `AdjustableOrRelativeDateBuilder setAdjustableDate(AdjustableDate arg0)`
- `AdjustableOrRelativeDateBuilder setRelativeDate(AdjustedRelativeDateOffset arg0)`

#### Getter Methods

- `AdjustableDateBuilder getAdjustableDate()`
- `MetaFieldsBuilder getOrCreateMeta()`
- `AdjustedRelativeDateOffsetBuilder getRelativeDate()`
- `MetaFieldsBuilder getMeta()`
- `AdjustableDateBuilder getOrCreateAdjustableDate()`
- `AdjustedRelativeDateOffsetBuilder getOrCreateRelativeDate()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `AdjustableOrRelativeDateBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `AdjustableOrRelativeDateBuilder prune()`
- `AdjustableOrRelativeDateBuilder toBuilder()`
- `boolean hasData()`

