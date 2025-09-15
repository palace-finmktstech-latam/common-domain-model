# ObservationShiftCalculationBuilderImpl

**Full Name:** `cdm.observable.asset.calculatedrate.ObservationShiftCalculation$ObservationShiftCalculationBuilderImpl`

**Package:** `cdm.observable.asset.calculatedrate`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.observable.asset.calculatedrate.ObservationShiftCalculation$ObservationShiftCalculationBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| offsetDays | `Integer` |  |
| calculationBase | `ObservationPeriodDatesEnum` |  |
| additionalBusinessDays | `BusinessCentersBuilder` |  |

### Methods

#### Builder Methods

- `ObservationShiftCalculation build()`

#### Setter Methods

- `ObservationShiftCalculationBuilder setOffsetDays(Integer arg0)`
- `ObservationShiftCalculationBuilder setCalculationBase(ObservationPeriodDatesEnum arg0)`
- `ObservationShiftCalculationBuilder setAdditionalBusinessDays(BusinessCenters arg0)`

#### Getter Methods

- `BusinessCentersBuilder getOrCreateAdditionalBusinessDays()`
- `BusinessCentersBuilder getAdditionalBusinessDays()`
- `ObservationPeriodDatesEnum getCalculationBase()`
- `Integer getOffsetDays()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `ObservationShiftCalculationBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `boolean hasData()`
- `ObservationShiftCalculationBuilder toBuilder()`
- `ObservationShiftCalculationBuilder prune()`

