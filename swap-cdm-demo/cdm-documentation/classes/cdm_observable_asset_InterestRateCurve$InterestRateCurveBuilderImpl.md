# InterestRateCurveBuilderImpl

**Full Name:** `cdm.observable.asset.InterestRateCurve$InterestRateCurveBuilderImpl`

**Package:** `cdm.observable.asset`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.observable.asset.InterestRateCurve$InterestRateCurveBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| floatingRateIndex | `FieldWithMetaFloatingRateIndexEnumBuilder` |  |
| tenor | `PeriodBuilder` |  |

### Methods

#### Builder Methods

- `InterestRateCurve build()`

#### Setter Methods

- `InterestRateCurveBuilder setFloatingRateIndex(FieldWithMetaFloatingRateIndexEnum arg0)`
- `InterestRateCurveBuilder setTenor(Period arg0)`
- `InterestRateCurveBuilder setFloatingRateIndexValue(FloatingRateIndexEnum arg0)`

#### Getter Methods

- `FieldWithMetaFloatingRateIndexEnumBuilder getFloatingRateIndex()`
- `PeriodBuilder getTenor()`
- `FieldWithMetaFloatingRateIndexEnumBuilder getOrCreateFloatingRateIndex()`
- `PeriodBuilder getOrCreateTenor()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `InterestRateCurveBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `boolean hasData()`
- `InterestRateCurveBuilder toBuilder()`
- `InterestRateCurveBuilder prune()`

