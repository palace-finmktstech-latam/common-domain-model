# InterestRateCurveBuilder

**Full Name:** `cdm.observable.asset.InterestRateCurve$InterestRateCurveBuilder`

**Package:** `cdm.observable.asset`

## Type: Interface

### Implemented Interfaces

- `cdm.observable.asset.InterestRateCurve`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`

### Methods

#### Setter Methods

- `InterestRateCurveBuilder setFloatingRateIndexValue(FloatingRateIndexEnum arg0)`
- `InterestRateCurveBuilder setFloatingRateIndex(FieldWithMetaFloatingRateIndexEnum arg0)`
- `InterestRateCurveBuilder setTenor(Period arg0)`

#### Getter Methods

- `FieldWithMetaFloatingRateIndexEnumBuilder getFloatingRateIndex()`
- `FieldWithMetaFloatingRateIndexEnumBuilder getOrCreateFloatingRateIndex()`
- `PeriodBuilder getTenor()`
- `PeriodBuilder getOrCreateTenor()`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `InterestRateCurveBuilder prune()`

