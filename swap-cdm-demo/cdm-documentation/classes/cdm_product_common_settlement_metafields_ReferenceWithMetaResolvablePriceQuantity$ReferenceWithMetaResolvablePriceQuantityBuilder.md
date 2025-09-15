# ReferenceWithMetaResolvablePriceQuantityBuilder

**Full Name:** `cdm.product.common.settlement.metafields.ReferenceWithMetaResolvablePriceQuantity$ReferenceWithMetaResolvablePriceQuantityBuilder`

**Package:** `cdm.product.common.settlement.metafields`

## Type: Interface

### Implemented Interfaces

- `cdm.product.common.settlement.metafields.ReferenceWithMetaResolvablePriceQuantity`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`
- `com.rosetta.model.lib.meta.ReferenceWithMeta$ReferenceWithMetaBuilder`

### Methods

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

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `ReferenceWithMetaResolvablePriceQuantityBuilder prune()`

