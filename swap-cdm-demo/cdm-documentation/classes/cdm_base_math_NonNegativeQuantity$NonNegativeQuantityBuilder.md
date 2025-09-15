# NonNegativeQuantityBuilder

**Full Name:** `cdm.base.math.NonNegativeQuantity$NonNegativeQuantityBuilder`

**Package:** `cdm.base.math`

## Type: Interface

### Implemented Interfaces

- `cdm.base.math.NonNegativeQuantity`
- `cdm.base.math.Quantity$QuantityBuilder`

### Methods

#### Setter Methods

- `NonNegativeQuantityBuilder setValue(BigDecimal arg0)`
- `NonNegativeQuantityBuilder setMultiplier(Measure arg0)`
- `NonNegativeQuantityBuilder setDatedValue(List arg0)`
- `NonNegativeQuantityBuilder setFrequency(Frequency arg0)`
- `NonNegativeQuantityBuilder setUnit(UnitType arg0)`

#### Adder Methods

- `NonNegativeQuantityBuilder addDatedValue(List arg0)`
- `NonNegativeQuantityBuilder addDatedValue(DatedValue arg0, int arg1)`
- `NonNegativeQuantityBuilder addDatedValue(DatedValue arg0)`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `NonNegativeQuantityBuilder prune()`

