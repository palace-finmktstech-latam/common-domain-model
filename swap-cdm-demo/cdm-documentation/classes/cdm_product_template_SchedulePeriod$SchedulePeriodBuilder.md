# SchedulePeriodBuilder

**Full Name:** `cdm.product.template.SchedulePeriod$SchedulePeriodBuilder`

**Package:** `cdm.product.template`

## Type: Interface

### Implemented Interfaces

- `cdm.product.template.SchedulePeriod`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`

### Methods

#### Setter Methods

- `SchedulePeriodBuilder setFixingPeriod(DateRange arg0)`
- `SchedulePeriodBuilder setDeliveryPeriod(CalculationScheduleDeliveryPeriods arg0)`
- `SchedulePeriodBuilder setCalculationPeriod(DateRange arg0)`
- `SchedulePeriodBuilder setPaymentDate(Date arg0)`

#### Getter Methods

- `CalculationScheduleDeliveryPeriodsBuilder getDeliveryPeriod()`
- `DateRangeBuilder getFixingPeriod()`
- `DateRangeBuilder getOrCreateFixingPeriod()`
- `CalculationScheduleDeliveryPeriodsBuilder getOrCreateDeliveryPeriod()`
- `DateRangeBuilder getCalculationPeriod()`
- `DateRangeBuilder getOrCreateCalculationPeriod()`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `SchedulePeriodBuilder prune()`

