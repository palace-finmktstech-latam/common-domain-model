# QuantityBuilder

**Full Name:** `cdm.base.math.Quantity$QuantityBuilder`

**Package:** `cdm.base.math`

## Type: Interface

### Implemented Interfaces

- `cdm.base.math.Quantity`
- `cdm.base.math.QuantitySchedule$QuantityScheduleBuilder`

### Methods

#### Setter Methods

- `QuantityBuilder setValue(BigDecimal arg0)`
- `QuantityBuilder setMultiplier(Measure arg0)`
- `QuantityBuilder setDatedValue(List arg0)`
- `QuantityBuilder setUnit(UnitType arg0)`
- `QuantityBuilder setFrequency(Frequency arg0)`

#### Adder Methods

- `QuantityBuilder addDatedValue(DatedValue arg0)`
- `QuantityBuilder addDatedValue(DatedValue arg0, int arg1)`
- `QuantityBuilder addDatedValue(List arg0)`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `QuantityBuilder prune()`

