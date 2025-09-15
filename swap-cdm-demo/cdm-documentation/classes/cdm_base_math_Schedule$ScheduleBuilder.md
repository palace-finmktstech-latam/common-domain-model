# ScheduleBuilder

**Full Name:** `cdm.base.math.Schedule$ScheduleBuilder`

**Package:** `cdm.base.math`

## Type: Interface

### Implemented Interfaces

- `cdm.base.math.Schedule`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`

### Methods

#### Setter Methods

- `ScheduleBuilder setValue(BigDecimal arg0)`
- `ScheduleBuilder setDatedValue(List arg0)`

#### Getter Methods

- `List getDatedValue()`
- `DatedValueBuilder getOrCreateDatedValue(int arg0)`

#### Adder Methods

- `ScheduleBuilder addDatedValue(List arg0)`
- `ScheduleBuilder addDatedValue(DatedValue arg0, int arg1)`
- `ScheduleBuilder addDatedValue(DatedValue arg0)`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `ScheduleBuilder prune()`

