# MeasureBaseBuilderImpl

**Full Name:** `cdm.base.math.MeasureBase$MeasureBaseBuilderImpl`

**Package:** `cdm.base.math`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.base.math.MeasureBase$MeasureBaseBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| value | `BigDecimal` |  |
| unit | `UnitTypeBuilder` |  |

### Methods

#### Builder Methods

- `MeasureBase build()`

#### Setter Methods

- `MeasureBaseBuilder setValue(BigDecimal arg0)`
- `MeasureBaseBuilder setUnit(UnitType arg0)`

#### Getter Methods

- `BigDecimal getValue()`
- `UnitTypeBuilder getOrCreateUnit()`
- `UnitTypeBuilder getUnit()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `MeasureBaseBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `MeasureBaseBuilder prune()`
- `MeasureBaseBuilder toBuilder()`
- `boolean hasData()`

