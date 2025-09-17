# EligibleCollateralCriteriaBuilder

**Full Name:** `cdm.product.collateral.EligibleCollateralCriteria$EligibleCollateralCriteriaBuilder`

**Package:** `cdm.product.collateral`

## Type: Interface

### Implemented Interfaces

- `cdm.product.collateral.EligibleCollateralCriteria`
- `cdm.product.collateral.CollateralCriteriaBase$CollateralCriteriaBaseBuilder`

### Methods

#### Setter Methods

- `EligibleCollateralCriteriaBuilder setTreatment(CollateralTreatment arg0)`
- `EligibleCollateralCriteriaBuilder setRatingPriorityResolution(RatingPriorityResolutionEnum arg0)`
- `EligibleCollateralCriteriaBuilder setCollateralCriteria(CollateralCriteria arg0)`
- `EligibleCollateralCriteriaBuilder setAppliesTo(List arg0)`
- `EligibleCollateralCriteriaBuilder setRestrictTo(CollateralMarginTypeEnum arg0)`

#### Getter Methods

- `CollateralTreatmentBuilder getTreatment()`
- `CollateralTreatmentBuilder getOrCreateTreatment()`

#### Adder Methods

- `EligibleCollateralCriteriaBuilder addAppliesTo(CounterpartyRoleEnum arg0, int arg1)`
- `EligibleCollateralCriteriaBuilder addAppliesTo(List arg0)`
- `EligibleCollateralCriteriaBuilder addAppliesTo(CounterpartyRoleEnum arg0)`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `EligibleCollateralCriteriaBuilder prune()`

