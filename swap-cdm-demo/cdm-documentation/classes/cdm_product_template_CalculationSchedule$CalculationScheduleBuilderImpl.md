# CalculationScheduleBuilderImpl

**Full Name:** `cdm.product.template.CalculationSchedule$CalculationScheduleBuilderImpl`

**Package:** `cdm.product.template`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.product.template.CalculationSchedule$CalculationScheduleBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| schedulePeriod | `java.util.List<cdm.product.template.SchedulePeriod$SchedulePeriodBuilder>` |  |

### Methods

#### Builder Methods

- `CalculationSchedule build()`

#### Setter Methods

- `CalculationScheduleBuilder setSchedulePeriod(List arg0)`

#### Getter Methods

- `SchedulePeriodBuilder getOrCreateSchedulePeriod(int arg0)`
- `List getSchedulePeriod()`

#### Adder Methods

- `CalculationScheduleBuilder addSchedulePeriod(SchedulePeriod arg0, int arg1)`
- `CalculationScheduleBuilder addSchedulePeriod(SchedulePeriod arg0)`
- `CalculationScheduleBuilder addSchedulePeriod(List arg0)`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `CalculationScheduleBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `CalculationScheduleBuilder prune()`
- `CalculationScheduleBuilder toBuilder()`
- `boolean hasData()`

