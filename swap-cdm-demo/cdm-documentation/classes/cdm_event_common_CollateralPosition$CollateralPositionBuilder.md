# CollateralPositionBuilder

**Full Name:** `cdm.event.common.CollateralPosition$CollateralPositionBuilder`

**Package:** `cdm.event.common`

## Type: Interface

### Implemented Interfaces

- `cdm.event.common.CollateralPosition`
- `cdm.event.position.Position$PositionBuilder`

### Methods

#### Setter Methods

- `CollateralPositionBuilder setPriceQuantity(List arg0)`
- `CollateralPositionBuilder setCashBalance(Money arg0)`
- `CollateralPositionBuilder setTradeReference(ReferenceWithMetaTradeState arg0)`
- `CollateralPositionBuilder setTreatment(CollateralTreatment arg0)`
- `CollateralPositionBuilder setTradeReferenceValue(TradeState arg0)`
- `CollateralPositionBuilder setCollateralPositionStatus(CollateralStatusEnum arg0)`
- `CollateralPositionBuilder setProduct(Product arg0)`

#### Getter Methods

- `CollateralTreatmentBuilder getTreatment()`
- `CollateralTreatmentBuilder getOrCreateTreatment()`

#### Adder Methods

- `CollateralPositionBuilder addPriceQuantity(List arg0)`
- `CollateralPositionBuilder addPriceQuantity(PriceQuantity arg0, int arg1)`
- `CollateralPositionBuilder addPriceQuantity(PriceQuantity arg0)`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `CollateralPositionBuilder prune()`

