# PositionBuilderImpl

**Full Name:** `cdm.event.position.Position$PositionBuilderImpl`

**Package:** `cdm.event.position`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.event.position.Position$PositionBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| priceQuantity | `java.util.List<cdm.observable.asset.PriceQuantity$PriceQuantityBuilder>` |  |
| product | `ProductBuilder` |  |
| cashBalance | `MoneyBuilder` |  |
| tradeReference | `ReferenceWithMetaTradeStateBuilder` |  |

### Methods

#### Builder Methods

- `Position build()`

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
- `PositionBuilder addPriceQuantity(PriceQuantity arg0, int arg1)`
- `PositionBuilder addPriceQuantity(PriceQuantity arg0)`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `PositionBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `boolean hasData()`
- `PositionBuilder toBuilder()`
- `PositionBuilder prune()`

