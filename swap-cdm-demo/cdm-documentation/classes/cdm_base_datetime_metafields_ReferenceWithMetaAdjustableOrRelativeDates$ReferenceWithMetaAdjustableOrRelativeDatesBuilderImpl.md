# ReferenceWithMetaAdjustableOrRelativeDatesBuilderImpl

**Full Name:** `cdm.base.datetime.metafields.ReferenceWithMetaAdjustableOrRelativeDates$ReferenceWithMetaAdjustableOrRelativeDatesBuilderImpl`

**Package:** `cdm.base.datetime.metafields`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.base.datetime.metafields.ReferenceWithMetaAdjustableOrRelativeDates$ReferenceWithMetaAdjustableOrRelativeDatesBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| value | `AdjustableOrRelativeDatesBuilder` |  |
| globalReference | `String` |  |
| externalReference | `String` |  |
| reference | `ReferenceBuilder` |  |

### Methods

#### Builder Methods

- `ReferenceWithMetaAdjustableOrRelativeDates build()`

#### Setter Methods

- `ReferenceWithMetaAdjustableOrRelativeDatesBuilder setValue(AdjustableOrRelativeDates arg0)`
- `ReferenceWithMetaAdjustableOrRelativeDatesBuilder setReference(Reference arg0)`
- `ReferenceWithMetaAdjustableOrRelativeDatesBuilder setGlobalReference(String arg0)`
- `ReferenceWithMetaAdjustableOrRelativeDatesBuilder setExternalReference(String arg0)`

#### Getter Methods

- `ReferenceBuilder getReference()`
- `AdjustableOrRelativeDatesBuilder getValue()`
- `AdjustableOrRelativeDatesBuilder getOrCreateValue()`
- `ReferenceBuilder getOrCreateReference()`
- `String getExternalReference()`
- `String getGlobalReference()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `ReferenceWithMetaAdjustableOrRelativeDatesBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `ReferenceWithMetaAdjustableOrRelativeDatesBuilder prune()`
- `ReferenceWithMetaAdjustableOrRelativeDatesBuilder toBuilder()`
- `boolean hasData()`

