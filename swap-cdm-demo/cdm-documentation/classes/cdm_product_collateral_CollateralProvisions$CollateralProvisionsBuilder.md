# CollateralProvisionsBuilder

**Full Name:** `cdm.product.collateral.CollateralProvisions$CollateralProvisionsBuilder`

**Package:** `cdm.product.collateral`

## Type: Interface

### Implemented Interfaces

- `cdm.product.collateral.CollateralProvisions`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`

### Methods

#### Setter Methods

- `CollateralProvisionsBuilder setCollateralType(CollateralTypeEnum arg0)`
- `CollateralProvisionsBuilder setEligibleCollateral(List arg0)`
- `CollateralProvisionsBuilder setSubstitutionProvisions(SubstitutionProvisions arg0)`

#### Getter Methods

- `List getEligibleCollateral()`
- `SubstitutionProvisionsBuilder getSubstitutionProvisions()`
- `SubstitutionProvisionsBuilder getOrCreateSubstitutionProvisions()`
- `EligibleCollateralCriteriaBuilder getOrCreateEligibleCollateral(int arg0)`

#### Adder Methods

- `CollateralProvisionsBuilder addEligibleCollateral(List arg0)`
- `CollateralProvisionsBuilder addEligibleCollateral(EligibleCollateralCriteria arg0, int arg1)`
- `CollateralProvisionsBuilder addEligibleCollateral(EligibleCollateralCriteria arg0)`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `CollateralProvisionsBuilder prune()`

