# CalculationScheduleDeliveryPeriodsBuilderImpl

**Full Name:** `cdm.product.asset.CalculationScheduleDeliveryPeriods$CalculationScheduleDeliveryPeriodsBuilderImpl`

**Package:** `cdm.product.asset`

## Type: Concrete Class

### Inheritance

**Extends:**
- `cdm.product.asset.AssetDeliveryPeriods$AssetDeliveryPeriodsBuilderImpl`

### Implemented Interfaces

- `cdm.product.asset.CalculationScheduleDeliveryPeriods$CalculationScheduleDeliveryPeriodsBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| deliveryCapacity | `QuantityBuilder` |  |
| priceTimeIntervalQuantity | `PriceBuilder` |  |

### Methods

#### Builder Methods

- `CalculationScheduleDeliveryPeriods build()`

#### Setter Methods

- `CalculationScheduleDeliveryPeriodsBuilder setStartDate(Date arg0)`
- `CalculationScheduleDeliveryPeriodsBuilder setEndDate(Date arg0)`
- `CalculationScheduleDeliveryPeriodsBuilder setProfile(List arg0)`
- `CalculationScheduleDeliveryPeriodsBuilder setDeliveryCapacity(Quantity arg0)`
- `CalculationScheduleDeliveryPeriodsBuilder setPriceTimeIntervalQuantity(Price arg0)`

#### Getter Methods

- `QuantityBuilder getDeliveryCapacity()`
- `PriceBuilder getPriceTimeIntervalQuantity()`
- `QuantityBuilder getOrCreateDeliveryCapacity()`
- `PriceBuilder getOrCreatePriceTimeIntervalQuantity()`

#### Adder Methods

- `CalculationScheduleDeliveryPeriodsBuilder addProfile(AssetDeliveryProfile arg0, int arg1)`
- `CalculationScheduleDeliveryPeriodsBuilder addProfile(AssetDeliveryProfile arg0)`
- `CalculationScheduleDeliveryPeriodsBuilder addProfile(List arg0)`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `CalculationScheduleDeliveryPeriodsBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `boolean hasData()`
- `CalculationScheduleDeliveryPeriodsBuilder toBuilder()`
- `CalculationScheduleDeliveryPeriodsBuilder prune()`

