# ReferenceWithMetaResolvablePriceQuantityBuilderImpl

**Full Name:** `cdm.product.common.settlement.metafields.ReferenceWithMetaResolvablePriceQuantity$ReferenceWithMetaResolvablePriceQuantityBuilderImpl`

**Package:** `cdm.product.common.settlement.metafields`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.product.common.settlement.metafields.ReferenceWithMetaResolvablePriceQuantity$ReferenceWithMetaResolvablePriceQuantityBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| value | `ResolvablePriceQuantityBuilder` |  |
| globalReference | `String` |  |
| externalReference | `String` |  |
| reference | `ReferenceBuilder` |  |

### Methods

#### Builder Methods

- `ReferenceWithMetaResolvablePriceQuantity build()`

#### Setter Methods

- `ReferenceWithMetaResolvablePriceQuantityBuilder setValue(ResolvablePriceQuantity arg0)`
- `ReferenceWithMetaResolvablePriceQuantityBuilder setExternalReference(String arg0)`
- `ReferenceWithMetaResolvablePriceQuantityBuilder setGlobalReference(String arg0)`
- `ReferenceWithMetaResolvablePriceQuantityBuilder setReference(Reference arg0)`

#### Getter Methods

- `ReferenceBuilder getReference()`
- `ResolvablePriceQuantityBuilder getValue()`
- `ResolvablePriceQuantityBuilder getOrCreateValue()`
- `ReferenceBuilder getOrCreateReference()`
- `String getExternalReference()`
- `String getGlobalReference()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `ReferenceWithMetaResolvablePriceQuantityBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `boolean hasData()`
- `ReferenceWithMetaResolvablePriceQuantityBuilder toBuilder()`
- `ReferenceWithMetaResolvablePriceQuantityBuilder prune()`

