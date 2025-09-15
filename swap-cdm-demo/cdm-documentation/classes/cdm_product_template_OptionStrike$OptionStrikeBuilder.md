# OptionStrikeBuilder

**Full Name:** `cdm.product.template.OptionStrike$OptionStrikeBuilder`

**Package:** `cdm.product.template`

## Type: Interface

### Implemented Interfaces

- `cdm.product.template.OptionStrike`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`

### Methods

#### Setter Methods

- `OptionStrikeBuilder setStrikePrice(Price arg0)`
- `OptionStrikeBuilder setReferenceSwapCurve(ReferenceSwapCurve arg0)`
- `OptionStrikeBuilder setStrikeReference(ReferenceWithMetaFixedRateSpecification arg0)`
- `OptionStrikeBuilder setAveragingStrikeFeature(AveragingStrikeFeature arg0)`
- `OptionStrikeBuilder setStrikeReferenceValue(FixedRateSpecification arg0)`

#### Getter Methods

- `ReferenceWithMetaFixedRateSpecificationBuilder getStrikeReference()`
- `AveragingStrikeFeatureBuilder getAveragingStrikeFeature()`
- `PriceBuilder getStrikePrice()`
- `ReferenceSwapCurveBuilder getReferenceSwapCurve()`
- `ReferenceSwapCurveBuilder getOrCreateReferenceSwapCurve()`
- `AveragingStrikeFeatureBuilder getOrCreateAveragingStrikeFeature()`
- `ReferenceWithMetaFixedRateSpecificationBuilder getOrCreateStrikeReference()`
- `PriceBuilder getOrCreateStrikePrice()`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `OptionStrikeBuilder prune()`

