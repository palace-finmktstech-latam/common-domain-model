# ReferenceWithMetaPortfolioStateBuilderImpl

**Full Name:** `cdm.event.position.metafields.ReferenceWithMetaPortfolioState$ReferenceWithMetaPortfolioStateBuilderImpl`

**Package:** `cdm.event.position.metafields`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.event.position.metafields.ReferenceWithMetaPortfolioState$ReferenceWithMetaPortfolioStateBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| value | `PortfolioStateBuilder` |  |
| globalReference | `String` |  |
| externalReference | `String` |  |
| reference | `ReferenceBuilder` |  |

### Methods

#### Builder Methods

- `ReferenceWithMetaPortfolioState build()`

#### Setter Methods

- `ReferenceWithMetaPortfolioStateBuilder setValue(PortfolioState arg0)`
- `ReferenceWithMetaPortfolioStateBuilder setExternalReference(String arg0)`
- `ReferenceWithMetaPortfolioStateBuilder setGlobalReference(String arg0)`
- `ReferenceWithMetaPortfolioStateBuilder setReference(Reference arg0)`

#### Getter Methods

- `ReferenceBuilder getReference()`
- `PortfolioStateBuilder getValue()`
- `PortfolioStateBuilder getOrCreateValue()`
- `ReferenceBuilder getOrCreateReference()`
- `String getExternalReference()`
- `String getGlobalReference()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `ReferenceWithMetaPortfolioStateBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `boolean hasData()`
- `ReferenceWithMetaPortfolioStateBuilder toBuilder()`
- `ReferenceWithMetaPortfolioStateBuilder prune()`

