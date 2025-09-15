# ReferenceWithMetaBasketConstituentBuilderImpl

**Full Name:** `cdm.observable.asset.metafields.ReferenceWithMetaBasketConstituent$ReferenceWithMetaBasketConstituentBuilderImpl`

**Package:** `cdm.observable.asset.metafields`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.observable.asset.metafields.ReferenceWithMetaBasketConstituent$ReferenceWithMetaBasketConstituentBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| value | `BasketConstituentBuilder` |  |
| globalReference | `String` |  |
| externalReference | `String` |  |
| reference | `ReferenceBuilder` |  |

### Methods

#### Builder Methods

- `ReferenceWithMetaBasketConstituent build()`

#### Setter Methods

- `ReferenceWithMetaBasketConstituentBuilder setValue(BasketConstituent arg0)`
- `ReferenceWithMetaBasketConstituentBuilder setExternalReference(String arg0)`
- `ReferenceWithMetaBasketConstituentBuilder setGlobalReference(String arg0)`
- `ReferenceWithMetaBasketConstituentBuilder setReference(Reference arg0)`

#### Getter Methods

- `ReferenceBuilder getReference()`
- `BasketConstituentBuilder getValue()`
- `BasketConstituentBuilder getOrCreateValue()`
- `ReferenceBuilder getOrCreateReference()`
- `String getExternalReference()`
- `String getGlobalReference()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `ReferenceWithMetaBasketConstituentBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `boolean hasData()`
- `ReferenceWithMetaBasketConstituentBuilder toBuilder()`
- `ReferenceWithMetaBasketConstituentBuilder prune()`

