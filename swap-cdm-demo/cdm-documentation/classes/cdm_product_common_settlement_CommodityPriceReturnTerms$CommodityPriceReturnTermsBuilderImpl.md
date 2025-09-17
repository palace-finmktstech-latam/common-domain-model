# CommodityPriceReturnTermsBuilderImpl

**Full Name:** `cdm.product.common.settlement.CommodityPriceReturnTerms$CommodityPriceReturnTermsBuilderImpl`

**Package:** `cdm.product.common.settlement`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.product.common.settlement.CommodityPriceReturnTerms$CommodityPriceReturnTermsBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| rounding | `RoundingBuilder` |  |
| spread | `SpreadScheduleBuilder` |  |
| rollFeature | `RollFeatureBuilder` |  |
| conversionFactor | `BigDecimal` |  |

### Methods

#### Builder Methods

- `CommodityPriceReturnTerms build()`

#### Setter Methods

- `CommodityPriceReturnTermsBuilder setConversionFactor(BigDecimal arg0)`
- `CommodityPriceReturnTermsBuilder setRollFeature(RollFeature arg0)`
- `CommodityPriceReturnTermsBuilder setRounding(Rounding arg0)`
- `CommodityPriceReturnTermsBuilder setSpread(SpreadSchedule arg0)`

#### Getter Methods

- `RoundingBuilder getOrCreateRounding()`
- `RoundingBuilder getRounding()`
- `RollFeatureBuilder getRollFeature()`
- `SpreadScheduleBuilder getOrCreateSpread()`
- `RollFeatureBuilder getOrCreateRollFeature()`
- `BigDecimal getConversionFactor()`
- `SpreadScheduleBuilder getSpread()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `CommodityPriceReturnTermsBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `CommodityPriceReturnTermsBuilder prune()`
- `CommodityPriceReturnTermsBuilder toBuilder()`
- `boolean hasData()`

