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

- `List getPriceQuantity()`
- `List getLotIdentifier()`
- `IdentifierBuilder getOrCreateLotIdentifier(int arg0)`
- `PriceQuantityBuilder getOrCreatePriceQuantity(int arg0)`

#### Adder Methods

- `TradeLotBuilder addPriceQuantity(PriceQuantity arg0)`
- `TradeLotBuilder addPriceQuantity(PriceQuantity arg0, int arg1)`
- `TradeLotBuilder addPriceQuantity(List arg0)`
- `TradeLotBuilder addLotIdentifier(Identifier arg0, int arg1)`
- `TradeLotBuilder addLotIdentifier(List arg0)`
- `TradeLotBuilder addLotIdentifier(Identifier arg0)`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `TradeLotBuilder prune()`

