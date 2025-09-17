# StubFloatingRateBuilderImpl

**Full Name:** `cdm.product.asset.StubFloatingRate$StubFloatingRateBuilderImpl`

**Package:** `cdm.product.asset`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.product.asset.StubFloatingRate$StubFloatingRateBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| floatingRateIndex | `FloatingRateIndexEnum` |  |
| indexTenor | `PeriodBuilder` |  |
| floatingRateMultiplierSchedule | `ScheduleBuilder` |  |
| spreadSchedule | `java.util.List<cdm.product.asset.SpreadSchedule$SpreadScheduleBuilder>` |  |
| rateTreatment | `RateTreatmentEnum` |  |
| capRateSchedule | `java.util.List<cdm.product.template.StrikeSchedule$StrikeScheduleBuilder>` |  |
| floorRateSchedule | `java.util.List<cdm.product.template.StrikeSchedule$StrikeScheduleBuilder>` |  |

### Methods

#### Builder Methods

- `StubFloatingRate build()`

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
- `RateTreatmentEnum getRateTreatment()`
- `PeriodBuilder getIndexTenor()`
- `FloatingRateIndexEnum getFloatingRateIndex()`

#### Adder Methods

- `StubFloatingRateBuilder addSpreadSchedule(List arg0)`
- `StubFloatingRateBuilder addSpreadSchedule(SpreadSchedule arg0)`
- `StubFloatingRateBuilder addSpreadSchedule(SpreadSchedule arg0, int arg1)`
- `StubFloatingRateBuilder addCapRateSchedule(StrikeSchedule arg0, int arg1)`
- `StubFloatingRateBuilder addCapRateSchedule(StrikeSchedule arg0)`
- `StubFloatingRateBuilder addCapRateSchedule(List arg0)`
- `StubFloatingRateBuilder addFloorRateSchedule(StrikeSchedule arg0)`
- `StubFloatingRateBuilder addFloorRateSchedule(StrikeSchedule arg0, int arg1)`
- `StubFloatingRateBuilder addFloorRateSchedule(List arg0)`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `StubFloatingRateBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `StubFloatingRateBuilder prune()`
- `StubFloatingRateBuilder toBuilder()`
- `boolean hasData()`

