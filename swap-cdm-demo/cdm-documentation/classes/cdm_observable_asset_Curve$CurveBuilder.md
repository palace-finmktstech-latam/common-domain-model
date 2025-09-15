# CurveBuilder

**Full Name:** `cdm.observable.asset.Curve$CurveBuilder`

**Package:** `cdm.observable.asset`

## Type: Interface

### Implemented Interfaces

- `cdm.observable.asset.Curve`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`

### Methods

#### Setter Methods

- `CurveBuilder setInterestRateCurve(InterestRateCurve arg0)`
- `CurveBuilder setCommodityCurveValue(CommodityReferencePriceEnum arg0)`
- `CurveBuilder setCommodityCurve(FieldWithMetaCommodityReferencePriceEnum arg0)`

#### Getter Methods

- `InterestRateCurveBuilder getOrCreateInterestRateCurve()`
- `InterestRateCurveBuilder getInterestRateCurve()`
- `FieldWithMetaCommodityReferencePriceEnumBuilder getOrCreateCommodityCurve()`
- `FieldWithMetaCommodityReferencePriceEnumBuilder getCommodityCurve()`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `CurveBuilder prune()`

