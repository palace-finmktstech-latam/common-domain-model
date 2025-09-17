# CurveBuilderImpl

**Full Name:** `cdm.observable.asset.Curve$CurveBuilderImpl`

**Package:** `cdm.observable.asset`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.observable.asset.Curve$CurveBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| interestRateCurve | `InterestRateCurveBuilder` |  |
| commodityCurve | `FieldWithMetaCommodityReferencePriceEnumBuilder` |  |

### Methods

#### Builder Methods

- `Curve build()`

#### Setter Methods

- `CurveBuilder setInterestRateCurve(InterestRateCurve arg0)`
- `CurveBuilder setCommodityCurveValue(CommodityReferencePriceEnum arg0)`
- `CurveBuilder setCommodityCurve(FieldWithMetaCommodityReferencePriceEnum arg0)`

#### Getter Methods

- `FieldWithMetaCommodityReferencePriceEnumBuilder getOrCreateCommodityCurve()`
- `FieldWithMetaCommodityReferencePriceEnumBuilder getCommodityCurve()`
- `InterestRateCurveBuilder getInterestRateCurve()`
- `InterestRateCurveBuilder getOrCreateInterestRateCurve()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `CurveBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `CurveBuilder prune()`
- `CurveBuilder toBuilder()`
- `boolean hasData()`

