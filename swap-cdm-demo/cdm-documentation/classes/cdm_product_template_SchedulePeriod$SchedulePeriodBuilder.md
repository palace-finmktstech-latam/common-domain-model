# SchedulePeriodBuilder

**Full Name:** `cdm.product.template.SchedulePeriod$SchedulePeriodBuilder`

**Package:** `cdm.product.template`

## Type: Interface

### Implemented Interfaces

- `cdm.product.template.SchedulePeriod`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`

### Methods

#### Setter Methods

- `SchedulePeriodBuilder setCalculationPeriod(DateRange arg0)`
- `SchedulePeriodBuilder setDeliveryPeriod(CalculationScheduleDeliveryPeriods arg0)`
- `SchedulePeriodBuilder setFixingPeriod(DateRange arg0)`
- `SchedulePeriodBuilder setPaymentDate(Date arg0)`

#### Getter Methods

- `DateRangeBuilder getCalculationPeriod()`
- `CalculationScheduleDeliveryPeriodsBuilder getDeliveryPeriod()`
- `DateRangeBuilder getFixingPeriod()`
- `CalculationScheduleDeliveryPeriodsBuilder getOrCreateDeliveryPeriod()`
- `DateRangeBuilder getOrCreateFixingPeriod()`
- `DateRangeBuilder getOrCreateCalculationPeriod()`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `SchedulePeriodBuilder prune()`

