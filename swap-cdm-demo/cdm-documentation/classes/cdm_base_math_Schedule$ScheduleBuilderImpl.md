# ScheduleBuilderImpl

**Full Name:** `cdm.base.math.Schedule$ScheduleBuilderImpl`

**Package:** `cdm.base.math`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.base.math.Schedule$ScheduleBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| value | `BigDecimal` |  |
| datedValue | `java.util.List<cdm.base.math.DatedValue$DatedValueBuilder>` |  |

### Methods

#### Builder Methods

- `Schedule build()`

#### Setter Methods

- `ScheduleBuilder setValue(BigDecimal arg0)`
- `ScheduleBuilder setDatedValue(List arg0)`

#### Getter Methods

- `BigDecimal getValue()`
- `List getDatedValue()`
- `DatedValueBuilder getOrCreateDatedValue(int arg0)`

#### Adder Methods

- `ScheduleBuilder addDatedValue(DatedValue arg0, int arg1)`
- `ScheduleBuilder addDatedValue(DatedValue arg0)`
- `ScheduleBuilder addDatedValue(List arg0)`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `ScheduleBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `ScheduleBuilder prune()`
- `ScheduleBuilder toBuilder()`
- `boolean hasData()`

