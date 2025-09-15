# ConcentrationLimitCriteriaBuilder

**Full Name:** `cdm.product.collateral.ConcentrationLimitCriteria$ConcentrationLimitCriteriaBuilder`

**Package:** `cdm.product.collateral`

## Type: Interface

### Implemented Interfaces

- `cdm.product.collateral.ConcentrationLimitCriteria`
- `cdm.product.collateral.CollateralCriteriaBase$CollateralCriteriaBaseBuilder`

### Methods

#### Setter Methods

- `ConcentrationLimitCriteriaBuilder setAverageTradingVolume(AverageTradingVolume arg0)`
- `ConcentrationLimitCriteriaBuilder setConcentrationLimitType(ConcentrationLimitTypeEnum arg0)`
- `ConcentrationLimitCriteriaBuilder setAppliesTo(List arg0)`
- `ConcentrationLimitCriteriaBuilder setCollateralCriteria(CollateralCriteria arg0)`
- `ConcentrationLimitCriteriaBuilder setRestrictTo(CollateralMarginTypeEnum arg0)`
- `ConcentrationLimitCriteriaBuilder setRatingPriorityResolution(RatingPriorityResolutionEnum arg0)`

#### Getter Methods

- `AverageTradingVolumeBuilder getAverageTradingVolume()`
- `AverageTradingVolumeBuilder getOrCreateAverageTradingVolume()`

#### Adder Methods

- `ConcentrationLimitCriteriaBuilder addAppliesTo(CounterpartyRoleEnum arg0)`
- `ConcentrationLimitCriteriaBuilder addAppliesTo(CounterpartyRoleEnum arg0, int arg1)`
- `ConcentrationLimitCriteriaBuilder addAppliesTo(List arg0)`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `ConcentrationLimitCriteriaBuilder prune()`

