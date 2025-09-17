# MeasureScheduleBuilder

**Full Name:** `cdm.base.math.MeasureSchedule$MeasureScheduleBuilder`

**Package:** `cdm.base.math`

## Type: Interface

### Implemented Interfaces

- `cdm.base.math.MeasureSchedule`
- `cdm.base.math.MeasureBase$MeasureBaseBuilder`

### Methods

#### Setter Methods

- `MeasureScheduleBuilder setValue(BigDecimal arg0)`
- `MeasureScheduleBuilder setDatedValue(List arg0)`
- `MeasureScheduleBuilder setUnit(UnitType arg0)`

#### Getter Methods

- `List getDatedValue()`
- `DatedValueBuilder getOrCreateDatedValue(int arg0)`

#### Adder Methods

- `MeasureScheduleBuilder addDatedValue(List arg0)`
- `MeasureScheduleBuilder addDatedValue(DatedValue arg0)`
- `MeasureScheduleBuilder addDatedValue(DatedValue arg0, int arg1)`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `MeasureScheduleBuilder prune()`

