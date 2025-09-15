# PositionBuilder

**Full Name:** `cdm.event.position.Position$PositionBuilder`

**Package:** `cdm.event.position`

## Type: Interface

### Implemented Interfaces

- `cdm.event.position.Position`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`

### Methods

#### Setter Methods

- `PositionBuilder setProduct(Product arg0)`
- `PositionBuilder setPriceQuantity(List arg0)`
- `PositionBuilder setTradeReference(ReferenceWithMetaTradeState arg0)`
- `PositionBuilder setCashBalance(Money arg0)`
- `PositionBuilder setTradeReferenceValue(TradeState arg0)`

#### Getter Methods

- `List getPriceQuantity()`
- `ReferenceWithMetaTradeStateBuilder getOrCreateTradeReference()`
- `PriceQuantityBuilder getOrCreatePriceQuantity(int arg0)`
- `MoneyBuilder getOrCreateCashBalance()`
- `ProductBuilder getOrCreateProduct()`
- `ReferenceWithMetaTradeStateBuilder getTradeReference()`
- `MoneyBuilder getCashBalance()`
- `ProductBuilder getProduct()`

#### Adder Methods

- `PositionBuilder addPriceQuantity(List arg0)`
- `PositionBuilder addPriceQuantity(PriceQuantity arg0)`
- `PositionBuilder addPriceQuantity(PriceQuantity arg0, int arg1)`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `PositionBuilder prune()`

