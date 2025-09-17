# QuantityScheduleBuilder

**Full Name:** `cdm.base.math.QuantitySchedule$QuantityScheduleBuilder`

**Package:** `cdm.base.math`

## Type: Interface

### Implemented Interfaces

- `cdm.base.math.QuantitySchedule`
- `cdm.base.math.MeasureSchedule$MeasureScheduleBuilder`

### Methods

#### Setter Methods

- `QuantityScheduleBuilder setValue(BigDecimal arg0)`
- `QuantityScheduleBuilder setMultiplier(Measure arg0)`
- `QuantityScheduleBuilder setDatedValue(List arg0)`
- `QuantityScheduleBuilder setUnit(UnitType arg0)`
- `QuantityScheduleBuilder setFrequency(Frequency arg0)`

#### Getter Methods

- `MeasureBuilder getMultiplier()`
- `FrequencyBuilder getFrequency()`
- `FrequencyBuilder getOrCreateFrequency()`
- `MeasureBuilder getOrCreateMultiplier()`

#### Adder Methods

- `QuantityScheduleBuilder addDatedValue(List arg0)`
- `QuantityScheduleBuilder addDatedValue(DatedValue arg0, int arg1)`
- `QuantityScheduleBuilder addDatedValue(DatedValue arg0)`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `QuantityScheduleBuilder prune()`

