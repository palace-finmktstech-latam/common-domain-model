# ReferenceWithMetaContractDetailsBuilderImpl

**Full Name:** `cdm.event.common.metafields.ReferenceWithMetaContractDetails$ReferenceWithMetaContractDetailsBuilderImpl`

**Package:** `cdm.event.common.metafields`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.event.common.metafields.ReferenceWithMetaContractDetails$ReferenceWithMetaContractDetailsBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| value | `ContractDetailsBuilder` |  |
| globalReference | `String` |  |
| externalReference | `String` |  |
| reference | `ReferenceBuilder` |  |

### Methods

#### Builder Methods

- `ReferenceWithMetaContractDetails build()`

#### Setter Methods

- `ReferenceWithMetaContractDetailsBuilder setValue(ContractDetails arg0)`
- `ReferenceWithMetaContractDetailsBuilder setReference(Reference arg0)`
- `ReferenceWithMetaContractDetailsBuilder setGlobalReference(String arg0)`
- `ReferenceWithMetaContractDetailsBuilder setExternalReference(String arg0)`

#### Getter Methods

- `ReferenceBuilder getReference()`
- `ContractDetailsBuilder getValue()`
- `ContractDetailsBuilder getOrCreateValue()`
- `ReferenceBuilder getOrCreateReference()`
- `String getExternalReference()`
- `String getGlobalReference()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `ReferenceWithMetaContractDetailsBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `ReferenceWithMetaContractDetailsBuilder prune()`
- `ReferenceWithMetaContractDetailsBuilder toBuilder()`
- `boolean hasData()`

