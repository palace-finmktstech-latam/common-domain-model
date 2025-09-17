# ResolvablePriceQuantity

**Full Name:** `cdm.product.common.settlement.ResolvablePriceQuantity`

**Package:** `cdm.product.common.settlement`

## Type: Interface

### Implemented Interfaces

- `com.rosetta.model.lib.RosettaModelObject`
- `com.rosetta.model.lib.GlobalKey`

### Methods

#### Builder Methods

- `ResolvablePriceQuantity build()`

#### Getter Methods

- `Class getType()`
- `Boolean getReset()`
- `MetaFields getMeta()`
- `ReferenceWithMetaNonNegativeQuantitySchedule getQuantitySchedule()`
- `QuantityMultiplier getQuantityMultiplier()`
- `ReferenceWithMetaResolvablePriceQuantity getQuantityReference()`
- `Quantity getResolvedQuantity()`
- `FutureValueAmount getFutureValueNotional()`
- `List getPriceSchedule()`

#### Other Methods

- `void process(RosettaPath arg0, Processor arg1)`
- `ResolvablePriceQuantityBuilder toBuilder()`
- `RosettaMetaData metaData()`

### Annotations

- **RuneDataType**
- **RosettaDataType**

