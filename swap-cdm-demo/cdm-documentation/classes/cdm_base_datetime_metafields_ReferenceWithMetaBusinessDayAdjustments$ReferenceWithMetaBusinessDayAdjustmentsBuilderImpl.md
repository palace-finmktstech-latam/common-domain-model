# ReferenceWithMetaBusinessDayAdjustmentsBuilderImpl

**Full Name:** `cdm.base.datetime.metafields.ReferenceWithMetaBusinessDayAdjustments$ReferenceWithMetaBusinessDayAdjustmentsBuilderImpl`

**Package:** `cdm.base.datetime.metafields`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.base.datetime.metafields.ReferenceWithMetaBusinessDayAdjustments$ReferenceWithMetaBusinessDayAdjustmentsBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| value | `BusinessDayAdjustmentsBuilder` |  |
| globalReference | `String` |  |
| externalReference | `String` |  |
| reference | `ReferenceBuilder` |  |

### Methods

#### Builder Methods

- `ReferenceWithMetaBusinessDayAdjustments build()`

#### Setter Methods

- `ReferenceWithMetaBusinessDayAdjustmentsBuilder setValue(BusinessDayAdjustments arg0)`
- `ReferenceWithMetaBusinessDayAdjustmentsBuilder setReference(Reference arg0)`
- `ReferenceWithMetaBusinessDayAdjustmentsBuilder setGlobalReference(String arg0)`
- `ReferenceWithMetaBusinessDayAdjustmentsBuilder setExternalReference(String arg0)`

#### Getter Methods

- `ReferenceBuilder getReference()`
- `BusinessDayAdjustmentsBuilder getValue()`
- `BusinessDayAdjustmentsBuilder getOrCreateValue()`
- `ReferenceBuilder getOrCreateReference()`
- `String getExternalReference()`
- `String getGlobalReference()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `ReferenceWithMetaBusinessDayAdjustmentsBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `ReferenceWithMetaBusinessDayAdjustmentsBuilder prune()`
- `ReferenceWithMetaBusinessDayAdjustmentsBuilder toBuilder()`
- `boolean hasData()`

