# TradeLotBuilderImpl

**Full Name:** `cdm.product.template.TradeLot$TradeLotBuilderImpl`

**Package:** `cdm.product.template`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.product.template.TradeLot$TradeLotBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| lotIdentifier | `java.util.List<cdm.base.staticdata.identifier.Identifier$IdentifierBuilder>` |  |
| priceQuantity | `java.util.List<cdm.observable.asset.PriceQuantity$PriceQuantityBuilder>` |  |

### Methods

#### Builder Methods

- `TradeLot build()`

#### Setter Methods

- `TradeLotBuilder setLotIdentifier(List arg0)`
- `TradeLotBuilder setPriceQuantity(List arg0)`

#### Getter Methods

- `List getPriceQuantity()`
- `List getLotIdentifier()`
- `IdentifierBuilder getOrCreateLotIdentifier(int arg0)`
- `PriceQuantityBuilder getOrCreatePriceQuantity(int arg0)`

#### Adder Methods

- `TradeLotBuilder addPriceQuantity(PriceQuantity arg0, int arg1)`
- `TradeLotBuilder addPriceQuantity(PriceQuantity arg0)`
- `TradeLotBuilder addPriceQuantity(List arg0)`
- `TradeLotBuilder addLotIdentifier(List arg0)`
- `TradeLotBuilder addLotIdentifier(Identifier arg0)`
- `TradeLotBuilder addLotIdentifier(Identifier arg0, int arg1)`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `TradeLotBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `TradeLotBuilder prune()`
- `TradeLotBuilder toBuilder()`
- `boolean hasData()`

