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

- `AdjustableOrRelativeDateBuilder setAdjustableDate(AdjustableDate arg0)`
- `AdjustableOrRelativeDateBuilder setRelativeDate(AdjustedRelativeDateOffset arg0)`
- `AdjustableOrRelativeDateBuilder setMeta(MetaFields arg0)`

#### Getter Methods

- `AdjustableDateBuilder getAdjustableDate()`
- `MetaFieldsBuilder getOrCreateMeta()`
- `AdjustableDateBuilder getOrCreateAdjustableDate()`
- `AdjustedRelativeDateOffsetBuilder getOrCreateRelativeDate()`
- `AdjustedRelativeDateOffsetBuilder getRelativeDate()`
- `MetaFieldsBuilder getMeta()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `AdjustableOrRelativeDateBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `boolean hasData()`
- `AdjustableOrRelativeDateBuilder toBuilder()`
- `AdjustableOrRelativeDateBuilder prune()`

