# CalculationScheduleDeliveryPeriodsBuilder

**Full Name:** `cdm.product.asset.CalculationScheduleDeliveryPeriods$CalculationScheduleDeliveryPeriodsBuilder`

**Package:** `cdm.product.asset`

## Type: Interface

### Implemented Interfaces

- `cdm.product.asset.CalculationScheduleDeliveryPeriods`
- `cdm.product.asset.AssetDeliveryPeriods$AssetDeliveryPeriodsBuilder`

### Methods

#### Setter Methods

- `CalculationScheduleDeliveryPeriodsBuilder setDeliveryCapacity(Quantity arg0)`
- `CalculationScheduleDeliveryPeriodsBuilder setEndDate(Date arg0)`
- `CalculationScheduleDeliveryPeriodsBuilder setStartDate(Date arg0)`
- `CalculationScheduleDeliveryPeriodsBuilder setPriceTimeIntervalQuantity(Price arg0)`
- `CalculationScheduleDeliveryPeriodsBuilder setProfile(List arg0)`

#### Getter Methods

- `PriceBuilder getPriceTimeIntervalQuantity()`
- `QuantityBuilder getDeliveryCapacity()`
- `QuantityBuilder getOrCreateDeliveryCapacity()`
- `PriceBuilder getOrCreatePriceTimeIntervalQuantity()`

#### Adder Methods

- `CalculationScheduleDeliveryPeriodsBuilder addProfile(AssetDeliveryProfile arg0)`
- `CalculationScheduleDeliveryPeriodsBuilder addProfile(AssetDeliveryProfile arg0, int arg1)`
- `CalculationScheduleDeliveryPeriodsBuilder addProfile(List arg0)`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `CalculationScheduleDeliveryPeriodsBuilder prune()`

