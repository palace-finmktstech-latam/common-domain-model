# CalculationScheduleDeliveryPeriodsBuilder

**Full Name:** `cdm.product.asset.CalculationScheduleDeliveryPeriods$CalculationScheduleDeliveryPeriodsBuilder`

**Package:** `cdm.product.asset`

## Type: Interface

### Implemented Interfaces

- `cdm.product.asset.CalculationScheduleDeliveryPeriods`
- `cdm.product.asset.AssetDeliveryPeriods$AssetDeliveryPeriodsBuilder`

### Methods

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

- `CalculationScheduleDeliveryPeriodsBuilder addProfile(AssetDeliveryProfile arg0)`
- `CalculationScheduleDeliveryPeriodsBuilder addProfile(List arg0)`
- `CalculationScheduleDeliveryPeriodsBuilder addProfile(AssetDeliveryProfile arg0, int arg1)`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `CalculationScheduleDeliveryPeriodsBuilder prune()`

