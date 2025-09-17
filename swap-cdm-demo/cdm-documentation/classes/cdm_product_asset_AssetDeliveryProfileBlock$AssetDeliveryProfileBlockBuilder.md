# AssetDeliveryProfileBlockBuilder

**Full Name:** `cdm.product.asset.AssetDeliveryProfileBlock$AssetDeliveryProfileBlockBuilder`

**Package:** `cdm.product.asset`

## Type: Interface

### Implemented Interfaces

- `cdm.product.asset.AssetDeliveryProfileBlock`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`

### Methods

#### Setter Methods

- `AssetDeliveryProfileBlockBuilder setDayOfWeek(List arg0)`
- `AssetDeliveryProfileBlockBuilder setStartTime(LocalTime arg0)`
- `AssetDeliveryProfileBlockBuilder setDeliveryCapacity(Quantity arg0)`
- `AssetDeliveryProfileBlockBuilder setPriceTimeIntervalQuantity(Price arg0)`
- `AssetDeliveryProfileBlockBuilder setEndTime(LocalTime arg0)`

#### Getter Methods

- `PriceBuilder getPriceTimeIntervalQuantity()`
- `QuantityBuilder getDeliveryCapacity()`
- `QuantityBuilder getOrCreateDeliveryCapacity()`
- `PriceBuilder getOrCreatePriceTimeIntervalQuantity()`

#### Adder Methods

- `AssetDeliveryProfileBlockBuilder addDayOfWeek(List arg0)`
- `AssetDeliveryProfileBlockBuilder addDayOfWeek(DayOfWeekEnum arg0, int arg1)`
- `AssetDeliveryProfileBlockBuilder addDayOfWeek(DayOfWeekEnum arg0)`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `AssetDeliveryProfileBlockBuilder prune()`

