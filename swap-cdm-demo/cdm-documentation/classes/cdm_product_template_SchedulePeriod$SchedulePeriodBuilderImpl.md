# SchedulePeriodBuilderImpl

**Full Name:** `cdm.product.template.SchedulePeriod$SchedulePeriodBuilderImpl`

**Package:** `cdm.product.template`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.product.template.SchedulePeriod$SchedulePeriodBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| calculationPeriod | `DateRangeBuilder` |  |
| paymentDate | `Date` |  |
| fixingPeriod | `DateRangeBuilder` |  |
| deliveryPeriod | `CalculationScheduleDeliveryPeriodsBuilder` |  |

### Methods

#### Builder Methods

- `SchedulePeriod build()`

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
- `Date getPaymentDate()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `SchedulePeriodBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `SchedulePeriodBuilder prune()`
- `SchedulePeriodBuilder toBuilder()`
- `boolean hasData()`

