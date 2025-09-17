# NonNegativeQuantityScheduleBuilder

**Full Name:** `cdm.base.math.NonNegativeQuantitySchedule$NonNegativeQuantityScheduleBuilder`

**Package:** `cdm.base.math`

## Type: Interface

### Implemented Interfaces

- `cdm.base.math.NonNegativeQuantitySchedule`
- `cdm.base.math.QuantitySchedule$QuantityScheduleBuilder`

### Methods

#### Setter Methods

- `NonNegativeQuantityScheduleBuilder setValue(BigDecimal arg0)`
- `NonNegativeQuantityScheduleBuilder setMultiplier(Measure arg0)`
- `NonNegativeQuantityScheduleBuilder setDatedValue(List arg0)`
- `NonNegativeQuantityScheduleBuilder setUnit(UnitType arg0)`
- `NonNegativeQuantityScheduleBuilder setFrequency(Frequency arg0)`

#### Adder Methods

- `NonNegativeQuantityScheduleBuilder addDatedValue(DatedValue arg0)`
- `NonNegativeQuantityScheduleBuilder addDatedValue(DatedValue arg0, int arg1)`
- `NonNegativeQuantityScheduleBuilder addDatedValue(List arg0)`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `NonNegativeQuantityScheduleBuilder prune()`

