# ReferenceWithMetaBusinessCentersBuilderImpl

**Full Name:** `cdm.base.datetime.metafields.ReferenceWithMetaBusinessCenters$ReferenceWithMetaBusinessCentersBuilderImpl`

**Package:** `cdm.base.datetime.metafields`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.base.datetime.metafields.ReferenceWithMetaBusinessCenters$ReferenceWithMetaBusinessCentersBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| value | `BusinessCentersBuilder` |  |
| globalReference | `String` |  |
| externalReference | `String` |  |
| reference | `ReferenceBuilder` |  |

### Methods

#### Builder Methods

- `ReferenceWithMetaBusinessCenters build()`

#### Setter Methods

- `ReferenceWithMetaBusinessCentersBuilder setValue(BusinessCenters arg0)`
- `ReferenceWithMetaBusinessCentersBuilder setExternalReference(String arg0)`
- `ReferenceWithMetaBusinessCentersBuilder setGlobalReference(String arg0)`
- `ReferenceWithMetaBusinessCentersBuilder setReference(Reference arg0)`

#### Getter Methods

- `ReferenceBuilder getReference()`
- `BusinessCentersBuilder getValue()`
- `BusinessCentersBuilder getOrCreateValue()`
- `ReferenceBuilder getOrCreateReference()`
- `String getExternalReference()`
- `String getGlobalReference()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `ReferenceWithMetaBusinessCentersBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `boolean hasData()`
- `ReferenceWithMetaBusinessCentersBuilder toBuilder()`
- `ReferenceWithMetaBusinessCentersBuilder prune()`

