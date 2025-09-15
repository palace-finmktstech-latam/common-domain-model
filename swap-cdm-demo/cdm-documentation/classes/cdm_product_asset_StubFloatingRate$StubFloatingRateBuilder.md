# StubFloatingRateBuilder

**Full Name:** `cdm.product.asset.StubFloatingRate$StubFloatingRateBuilder`

**Package:** `cdm.product.asset`

## Type: Interface

### Implemented Interfaces

- `cdm.product.asset.StubFloatingRate`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`

### Methods

#### Setter Methods

- `StubFloatingRateBuilder setFloatingRateIndex(FloatingRateIndexEnum arg0)`
- `StubFloatingRateBuilder setSpreadSchedule(List arg0)`
- `StubFloatingRateBuilder setIndexTenor(Period arg0)`
- `StubFloatingRateBuilder setRateTreatment(RateTreatmentEnum arg0)`
- `StubFloatingRateBuilder setFloorRateSchedule(List arg0)`
- `StubFloatingRateBuilder setCapRateSchedule(List arg0)`
- `StubFloatingRateBuilder setFloatingRateMultiplierSchedule(Schedule arg0)`

#### Getter Methods

- `List getFloorRateSchedule()`
- `List getSpreadSchedule()`
- `List getCapRateSchedule()`
- `PeriodBuilder getIndexTenor()`
- `PeriodBuilder getOrCreateIndexTenor()`
- `SpreadScheduleBuilder getOrCreateSpreadSchedule(int arg0)`
- `StrikeScheduleBuilder getOrCreateCapRateSchedule(int arg0)`
- `ScheduleBuilder getFloatingRateMultiplierSchedule()`
- `StrikeScheduleBuilder getOrCreateFloorRateSchedule(int arg0)`
- `ScheduleBuilder getOrCreateFloatingRateMultiplierSchedule()`

#### Adder Methods

- `StubFloatingRateBuilder addSpreadSchedule(List arg0)`
- `StubFloatingRateBuilder addSpreadSchedule(SpreadSchedule arg0, int arg1)`
- `StubFloatingRateBuilder addSpreadSchedule(SpreadSchedule arg0)`
- `StubFloatingRateBuilder addCapRateSchedule(StrikeSchedule arg0)`
- `StubFloatingRateBuilder addCapRateSchedule(StrikeSchedule arg0, int arg1)`
- `StubFloatingRateBuilder addCapRateSchedule(List arg0)`
- `StubFloatingRateBuilder addFloorRateSchedule(StrikeSchedule arg0, int arg1)`
- `StubFloatingRateBuilder addFloorRateSchedule(List arg0)`
- `StubFloatingRateBuilder addFloorRateSchedule(StrikeSchedule arg0)`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `StubFloatingRateBuilder prune()`

