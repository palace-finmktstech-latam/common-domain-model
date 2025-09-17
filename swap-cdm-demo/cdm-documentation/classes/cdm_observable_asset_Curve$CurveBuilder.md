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

- `FieldWithMetaCommodityReferencePriceEnumBuilder getOrCreateCommodityCurve()`
- `FieldWithMetaCommodityReferencePriceEnumBuilder getCommodityCurve()`
- `InterestRateCurveBuilder getInterestRateCurve()`
- `InterestRateCurveBuilder getOrCreateInterestRateCurve()`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `CurveBuilder prune()`

