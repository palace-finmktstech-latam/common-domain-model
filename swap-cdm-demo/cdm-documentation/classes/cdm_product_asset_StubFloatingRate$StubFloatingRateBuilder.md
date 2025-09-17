# StubFloatingRateBuilder

**Full Name:** `cdm.product.asset.StubFloatingRate$StubFloatingRateBuilder`

**Package:** `cdm.product.asset`

## Type: Interface

### Implemented Interfaces

- `cdm.product.asset.StubFloatingRate`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`

### Methods

#### Setter Methods

- `StubFloatingRateBuilder setCapRateSchedule(List arg0)`
- `StubFloatingRateBuilder setRateTreatment(RateTreatmentEnum arg0)`
- `StubFloatingRateBuilder setFloorRateSchedule(List arg0)`
- `StubFloatingRateBuilder setSpreadSchedule(List arg0)`
- `StubFloatingRateBuilder setIndexTenor(Period arg0)`
- `StubFloatingRateBuilder setFloatingRateMultiplierSchedule(Schedule arg0)`
- `StubFloatingRateBuilder setFloatingRateIndex(FloatingRateIndexEnum arg0)`

#### Getter Methods

- `StrikeScheduleBuilder getOrCreateCapRateSchedule(int arg0)`
- `SpreadScheduleBuilder getOrCreateSpreadSchedule(int arg0)`
- `PeriodBuilder getOrCreateIndexTenor()`
- `ScheduleBuilder getOrCreateFloatingRateMultiplierSchedule()`
- `StrikeScheduleBuilder getOrCreateFloorRateSchedule(int arg0)`
- `ScheduleBuilder getFloatingRateMultiplierSchedule()`
- `List getSpreadSchedule()`
- `List getFloorRateSchedule()`
- `List getCapRateSchedule()`
- `PeriodBuilder getIndexTenor()`

#### Adder Methods

- `StubFloatingRateBuilder addSpreadSchedule(SpreadSchedule arg0)`
- `StubFloatingRateBuilder addSpreadSchedule(SpreadSchedule arg0, int arg1)`
- `StubFloatingRateBuilder addSpreadSchedule(List arg0)`
- `StubFloatingRateBuilder addCapRateSchedule(StrikeSchedule arg0, int arg1)`
- `StubFloatingRateBuilder addCapRateSchedule(StrikeSchedule arg0)`
- `StubFloatingRateBuilder addCapRateSchedule(List arg0)`
- `StubFloatingRateBuilder addFloorRateSchedule(StrikeSchedule arg0, int arg1)`
- `StubFloatingRateBuilder addFloorRateSchedule(List arg0)`
- `StubFloatingRateBuilder addFloorRateSchedule(StrikeSchedule arg0)`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `StubFloatingRateBuilder prune()`

