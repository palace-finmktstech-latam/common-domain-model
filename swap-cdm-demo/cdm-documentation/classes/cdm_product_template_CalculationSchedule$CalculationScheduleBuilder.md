# CalculationScheduleBuilder

**Full Name:** `cdm.product.template.CalculationSchedule$CalculationScheduleBuilder`

**Package:** `cdm.product.template`

## Type: Interface

### Implemented Interfaces

- `cdm.product.template.CalculationSchedule`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`

### Methods

#### Setter Methods

- `CalculationScheduleBuilder setSchedulePeriod(List arg0)`

#### Getter Methods

- `SchedulePeriodBuilder getOrCreateSchedulePeriod(int arg0)`
- `List getSchedulePeriod()`

#### Adder Methods

- `CalculationScheduleBuilder addSchedulePeriod(List arg0)`
- `CalculationScheduleBuilder addSchedulePeriod(SchedulePeriod arg0)`
- `CalculationScheduleBuilder addSchedulePeriod(SchedulePeriod arg0, int arg1)`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `CalculationScheduleBuilder prune()`

