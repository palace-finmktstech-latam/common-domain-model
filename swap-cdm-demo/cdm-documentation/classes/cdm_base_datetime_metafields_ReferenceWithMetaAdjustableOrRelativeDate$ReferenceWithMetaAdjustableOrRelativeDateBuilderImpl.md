# ReferenceWithMetaAdjustableOrRelativeDateBuilderImpl

**Full Name:** `cdm.base.datetime.metafields.ReferenceWithMetaAdjustableOrRelativeDate$ReferenceWithMetaAdjustableOrRelativeDateBuilderImpl`

**Package:** `cdm.base.datetime.metafields`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.base.datetime.metafields.ReferenceWithMetaAdjustableOrRelativeDate$ReferenceWithMetaAdjustableOrRelativeDateBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| value | `AdjustableOrRelativeDateBuilder` |  |
| globalReference | `String` |  |
| externalReference | `String` |  |
| reference | `ReferenceBuilder` |  |

### Methods

#### Builder Methods

- `ReferenceWithMetaAdjustableOrRelativeDate build()`

#### Setter Methods

- `ReferenceWithMetaAdjustableOrRelativeDateBuilder setValue(AdjustableOrRelativeDate arg0)`
- `ReferenceWithMetaAdjustableOrRelativeDateBuilder setReference(Reference arg0)`
- `ReferenceWithMetaAdjustableOrRelativeDateBuilder setGlobalReference(String arg0)`
- `ReferenceWithMetaAdjustableOrRelativeDateBuilder setExternalReference(String arg0)`

#### Getter Methods

- `ReferenceBuilder getReference()`
- `AdjustableOrRelativeDateBuilder getValue()`
- `AdjustableOrRelativeDateBuilder getOrCreateValue()`
- `ReferenceBuilder getOrCreateReference()`
- `String getExternalReference()`
- `String getGlobalReference()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `ReferenceWithMetaAdjustableOrRelativeDateBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `ReferenceWithMetaAdjustableOrRelativeDateBuilder prune()`
- `ReferenceWithMetaAdjustableOrRelativeDateBuilder toBuilder()`
- `boolean hasData()`

