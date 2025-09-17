# AssetDeliveryProfileBlockBuilderImpl

**Full Name:** `cdm.product.asset.AssetDeliveryProfileBlock$AssetDeliveryProfileBlockBuilderImpl`

**Package:** `cdm.product.asset`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.product.asset.AssetDeliveryProfileBlock$AssetDeliveryProfileBlockBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| startTime | `LocalTime` |  |
| endTime | `LocalTime` |  |
| dayOfWeek | `java.util.List<cdm.base.datetime.DayOfWeekEnum>` |  |
| deliveryCapacity | `QuantityBuilder` |  |
| priceTimeIntervalQuantity | `PriceBuilder` |  |

### Methods

#### Builder Methods

- `AssetDeliveryProfileBlock build()`

#### Setter Methods

- `AssetDeliveryProfileBlockBuilder setDayOfWeek(List arg0)`
- `AssetDeliveryProfileBlockBuilder setStartTime(LocalTime arg0)`
- `AssetDeliveryProfileBlockBuilder setDeliveryCapacity(Quantity arg0)`
- `AssetDeliveryProfileBlockBuilder setPriceTimeIntervalQuantity(Price arg0)`
- `AssetDeliveryProfileBlockBuilder setEndTime(LocalTime arg0)`

#### Getter Methods

- `List getDayOfWeek()`
- `LocalTime getStartTime()`
- `PriceBuilder getPriceTimeIntervalQuantity()`
- `QuantityBuilder getDeliveryCapacity()`
- `QuantityBuilder getOrCreateDeliveryCapacity()`
- `PriceBuilder getOrCreatePriceTimeIntervalQuantity()`
- `LocalTime getEndTime()`

#### Adder Methods

- `AssetDeliveryProfileBlockBuilder addDayOfWeek(DayOfWeekEnum arg0)`
- `AssetDeliveryProfileBlockBuilder addDayOfWeek(List arg0)`
- `AssetDeliveryProfileBlockBuilder addDayOfWeek(DayOfWeekEnum arg0, int arg1)`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `AssetDeliveryProfileBlockBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `AssetDeliveryProfileBlockBuilder prune()`
- `AssetDeliveryProfileBlockBuilder toBuilder()`
- `boolean hasData()`

