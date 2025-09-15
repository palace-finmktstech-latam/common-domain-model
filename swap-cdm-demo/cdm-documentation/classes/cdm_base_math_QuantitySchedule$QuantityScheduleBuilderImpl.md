# QuantityScheduleBuilderImpl

**Full Name:** `cdm.base.math.QuantitySchedule$QuantityScheduleBuilderImpl`

**Package:** `cdm.base.math`

## Type: Concrete Class

### Inheritance

**Extends:**
- `cdm.base.math.MeasureSchedule$MeasureScheduleBuilderImpl`

### Implemented Interfaces

- `cdm.base.math.QuantitySchedule$QuantityScheduleBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| multiplier | `MeasureBuilder` |  |
| frequency | `FrequencyBuilder` |  |

### Methods

#### Builder Methods

- `QuantitySchedule build()`

#### Setter Methods

- `QuantityScheduleBuilder setValue(BigDecimal arg0)`
- `QuantityScheduleBuilder setMultiplier(Measure arg0)`
- `QuantityScheduleBuilder setDatedValue(List arg0)`
- `QuantityScheduleBuilder setFrequency(Frequency arg0)`
- `QuantityScheduleBuilder setUnit(UnitType arg0)`

#### Getter Methods

- `MeasureBuilder getMultiplier()`
- `FrequencyBuilder getFrequency()`
- `FrequencyBuilder getOrCreateFrequency()`
- `MeasureBuilder getOrCreateMultiplier()`

#### Adder Methods

- `QuantityScheduleBuilder addDatedValue(DatedValue arg0)`
- `QuantityScheduleBuilder addDatedValue(List arg0)`
- `QuantityScheduleBuilder addDatedValue(DatedValue arg0, int arg1)`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `QuantityScheduleBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `boolean hasData()`
- `QuantityScheduleBuilder toBuilder()`
- `QuantityScheduleBuilder prune()`

