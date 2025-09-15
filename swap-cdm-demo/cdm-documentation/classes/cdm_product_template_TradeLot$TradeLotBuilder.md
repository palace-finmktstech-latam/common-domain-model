# TradeLotBuilder

**Full Name:** `cdm.product.template.TradeLot$TradeLotBuilder`

**Package:** `cdm.product.template`

## Type: Interface

### Implemented Interfaces

- `cdm.product.template.TradeLot`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`

### Methods

#### Setter Methods

- `TradeLotBuilder setLotIdentifier(List arg0)`
- `TradeLotBuilder setPriceQuantity(List arg0)`

#### Getter Methods

- `IdentifierBuilder getOrCreateLotIdentifier(int arg0)`
- `List getLotIdentifier()`
- `List getPriceQuantity()`
- `PriceQuantityBuilder getOrCreatePriceQuantity(int arg0)`

#### Adder Methods

- `TradeLotBuilder addLotIdentifier(Identifier arg0, int arg1)`
- `TradeLotBuilder addLotIdentifier(Identifier arg0)`
- `TradeLotBuilder addLotIdentifier(List arg0)`
- `TradeLotBuilder addPriceQuantity(List arg0)`
- `TradeLotBuilder addPriceQuantity(PriceQuantity arg0)`
- `TradeLotBuilder addPriceQuantity(PriceQuantity arg0, int arg1)`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `TradeLotBuilder prune()`

