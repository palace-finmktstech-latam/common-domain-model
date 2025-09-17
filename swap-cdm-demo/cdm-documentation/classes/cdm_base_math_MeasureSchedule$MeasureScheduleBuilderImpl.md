# MeasureScheduleBuilderImpl

**Full Name:** `cdm.base.math.MeasureSchedule$MeasureScheduleBuilderImpl`

**Package:** `cdm.base.math`

## Type: Concrete Class

### Inheritance

**Extends:**
- `cdm.base.math.MeasureBase$MeasureBaseBuilderImpl`

### Implemented Interfaces

- `cdm.base.math.MeasureSchedule$MeasureScheduleBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| datedValue | `java.util.List<cdm.base.math.DatedValue$DatedValueBuilder>` |  |

### Methods

#### Builder Methods

- `MeasureSchedule build()`

#### Setter Methods

- `MeasureScheduleBuilder setValue(BigDecimal arg0)`
- `MeasureScheduleBuilder setDatedValue(List arg0)`
- `MeasureScheduleBuilder setUnit(UnitType arg0)`

#### Getter Methods

- `List getDatedValue()`
- `DatedValueBuilder getOrCreateDatedValue(int arg0)`

#### Adder Methods

- `MeasureScheduleBuilder addDatedValue(List arg0)`
- `MeasureScheduleBuilder addDatedValue(DatedValue arg0, int arg1)`
- `MeasureScheduleBuilder addDatedValue(DatedValue arg0)`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `MeasureScheduleBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `MeasureScheduleBuilder prune()`
- `MeasureScheduleBuilder toBuilder()`
- `boolean hasData()`

