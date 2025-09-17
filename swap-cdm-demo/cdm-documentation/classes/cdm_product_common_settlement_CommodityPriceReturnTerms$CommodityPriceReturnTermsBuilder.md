# CommodityPriceReturnTermsBuilder

**Full Name:** `cdm.product.common.settlement.CommodityPriceReturnTerms$CommodityPriceReturnTermsBuilder`

**Package:** `cdm.product.common.settlement`

## Type: Interface

### Implemented Interfaces

- `cdm.product.common.settlement.CommodityPriceReturnTerms`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`

### Methods

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
- `SpreadScheduleBuilder getSpread()`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `CommodityPriceReturnTermsBuilder prune()`

