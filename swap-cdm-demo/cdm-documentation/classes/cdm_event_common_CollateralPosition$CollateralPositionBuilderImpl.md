# CollateralPositionBuilderImpl

**Full Name:** `cdm.event.common.CollateralPosition$CollateralPositionBuilderImpl`

**Package:** `cdm.event.common`

## Type: Concrete Class

### Inheritance

**Extends:**
- `cdm.event.position.Position$PositionBuilderImpl`

### Implemented Interfaces

- `cdm.event.common.CollateralPosition$CollateralPositionBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| treatment | `CollateralTreatmentBuilder` |  |
| collateralPositionStatus | `CollateralStatusEnum` |  |

### Methods

#### Builder Methods

- `CollateralPosition build()`

#### Setter Methods

- `CollateralPositionBuilder setProduct(Product arg0)`
- `CollateralPositionBuilder setPriceQuantity(List arg0)`
- `CollateralPositionBuilder setTradeReference(ReferenceWithMetaTradeState arg0)`
- `CollateralPositionBuilder setCashBalance(Money arg0)`
- `CollateralPositionBuilder setTreatment(CollateralTreatment arg0)`
- `CollateralPositionBuilder setTradeReferenceValue(TradeState arg0)`
- `CollateralPositionBuilder setCollateralPositionStatus(CollateralStatusEnum arg0)`

#### Getter Methods

- `CollateralTreatmentBuilder getTreatment()`
- `CollateralTreatmentBuilder getOrCreateTreatment()`
- `CollateralStatusEnum getCollateralPositionStatus()`

#### Adder Methods

- `CollateralPositionBuilder addPriceQuantity(PriceQuantity arg0)`
- `CollateralPositionBuilder addPriceQuantity(PriceQuantity arg0, int arg1)`
- `CollateralPositionBuilder addPriceQuantity(List arg0)`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `CollateralPositionBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `boolean hasData()`
- `CollateralPositionBuilder toBuilder()`
- `CollateralPositionBuilder prune()`

