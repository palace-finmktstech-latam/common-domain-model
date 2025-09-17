# ExtensionEventBuilderImpl

**Full Name:** `cdm.product.template.ExtensionEvent$ExtensionEventBuilderImpl`

**Package:** `cdm.product.template`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.product.template.ExtensionEvent$ExtensionEventBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| adjustedExerciseDate | `Date` |  |
| adjustedExtendedTerminationDate | `Date` |  |
| meta | `MetaFieldsBuilder` |  |

### Methods

#### Builder Methods

- `ExtensionEvent build()`

#### Setter Methods

- `ExtensionEventBuilder setAdjustedExtendedTerminationDate(Date arg0)`
- `ExtensionEventBuilder setAdjustedExerciseDate(Date arg0)`
- `ExtensionEventBuilder setMeta(MetaFields arg0)`

#### Getter Methods

- `MetaFieldsBuilder getOrCreateMeta()`
- `Date getAdjustedExerciseDate()`
- `MetaFieldsBuilder getMeta()`
- `Date getAdjustedExtendedTerminationDate()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `ExtensionEventBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `ExtensionEventBuilder prune()`
- `ExtensionEventBuilder toBuilder()`
- `boolean hasData()`

