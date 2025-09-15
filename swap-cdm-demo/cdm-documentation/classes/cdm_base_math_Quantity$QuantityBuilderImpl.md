# QuantityBuilderImpl

**Full Name:** `cdm.base.math.Quantity$QuantityBuilderImpl`

**Package:** `cdm.base.math`

## Type: Concrete Class

### Inheritance

**Extends:**
- `cdm.base.math.QuantitySchedule$QuantityScheduleBuilderImpl`

### Implemented Interfaces

- `cdm.base.math.Quantity$QuantityBuilder`

### Methods

#### Builder Methods

- `Quantity build()`

#### Setter Methods

- `QuantityBuilder setValue(BigDecimal arg0)`
- `QuantityBuilder setMultiplier(Measure arg0)`
- `QuantityBuilder setDatedValue(List arg0)`
- `QuantityBuilder setFrequency(Frequency arg0)`
- `QuantityBuilder setUnit(UnitType arg0)`

#### Adder Methods

- `QuantityBuilder addDatedValue(List arg0)`
- `QuantityBuilder addDatedValue(DatedValue arg0)`
- `QuantityBuilder addDatedValue(DatedValue arg0, int arg1)`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `QuantityBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `boolean hasData()`
- `QuantityBuilder toBuilder()`
- `QuantityBuilder prune()`

