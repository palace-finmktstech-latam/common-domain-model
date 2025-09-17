# ReferenceWithMetaFixedRateSpecificationBuilderImpl

**Full Name:** `cdm.product.asset.metafields.ReferenceWithMetaFixedRateSpecification$ReferenceWithMetaFixedRateSpecificationBuilderImpl`

**Package:** `cdm.product.asset.metafields`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.product.asset.metafields.ReferenceWithMetaFixedRateSpecification$ReferenceWithMetaFixedRateSpecificationBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| value | `FixedRateSpecificationBuilder` |  |
| globalReference | `String` |  |
| externalReference | `String` |  |
| reference | `ReferenceBuilder` |  |

### Methods

#### Builder Methods

- `ReferenceWithMetaFixedRateSpecification build()`

#### Setter Methods

- `ReferenceWithMetaFixedRateSpecificationBuilder setValue(FixedRateSpecification arg0)`
- `ReferenceWithMetaFixedRateSpecificationBuilder setReference(Reference arg0)`
- `ReferenceWithMetaFixedRateSpecificationBuilder setGlobalReference(String arg0)`
- `ReferenceWithMetaFixedRateSpecificationBuilder setExternalReference(String arg0)`

#### Getter Methods

- `ReferenceBuilder getReference()`
- `FixedRateSpecificationBuilder getValue()`
- `FixedRateSpecificationBuilder getOrCreateValue()`
- `ReferenceBuilder getOrCreateReference()`
- `String getExternalReference()`
- `String getGlobalReference()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `ReferenceWithMetaFixedRateSpecificationBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `ReferenceWithMetaFixedRateSpecificationBuilder prune()`
- `ReferenceWithMetaFixedRateSpecificationBuilder toBuilder()`
- `boolean hasData()`

