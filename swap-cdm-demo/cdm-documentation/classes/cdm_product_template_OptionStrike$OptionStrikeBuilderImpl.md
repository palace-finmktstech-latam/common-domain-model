# OptionStrikeBuilderImpl

**Full Name:** `cdm.product.template.OptionStrike$OptionStrikeBuilderImpl`

**Package:** `cdm.product.template`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.product.template.OptionStrike$OptionStrikeBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| strikePrice | `PriceBuilder` |  |
| strikeReference | `ReferenceWithMetaFixedRateSpecificationBuilder` |  |
| referenceSwapCurve | `ReferenceSwapCurveBuilder` |  |
| averagingStrikeFeature | `AveragingStrikeFeatureBuilder` |  |

### Methods

#### Builder Methods

- `OptionStrike build()`

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

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `OptionStrikeBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `boolean hasData()`
- `OptionStrikeBuilder toBuilder()`
- `OptionStrikeBuilder prune()`

