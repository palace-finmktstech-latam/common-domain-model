# CollateralTaxonomyValueBuilder

**Full Name:** `cdm.base.staticdata.asset.common.CollateralTaxonomyValue$CollateralTaxonomyValueBuilder`

**Package:** `cdm.base.staticdata.asset.common`

## Type: Interface

### Implemented Interfaces

- `cdm.base.staticdata.asset.common.CollateralTaxonomyValue`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`

### Methods

#### Setter Methods

- `CollateralTaxonomyValueBuilder setEu_EMIR_EligibleCollateral(List arg0)`
- `CollateralTaxonomyValueBuilder setUk_EMIR_EligibleCollateral(List arg0)`
- `CollateralTaxonomyValueBuilder setNonEnumeratedTaxonomyValue(List arg0)`
- `CollateralTaxonomyValueBuilder setNonEnumeratedTaxonomyValueValue(List arg0)`
- `CollateralTaxonomyValueBuilder setUs_CFTC_PR_EligibleCollateral(List arg0)`

#### Getter Methods

- `FieldWithMetaStringBuilder getOrCreateNonEnumeratedTaxonomyValue(int arg0)`
- `List getNonEnumeratedTaxonomyValue()`

#### Adder Methods

- `CollateralTaxonomyValueBuilder addNonEnumeratedTaxonomyValueValue(String arg0)`
- `CollateralTaxonomyValueBuilder addNonEnumeratedTaxonomyValueValue(List arg0)`
- `CollateralTaxonomyValueBuilder addNonEnumeratedTaxonomyValueValue(String arg0, int arg1)`
- `CollateralTaxonomyValueBuilder addEu_EMIR_EligibleCollateral(List arg0)`
- `CollateralTaxonomyValueBuilder addEu_EMIR_EligibleCollateral(EU_EMIR_EligibleCollateralEnum arg0, int arg1)`
- `CollateralTaxonomyValueBuilder addEu_EMIR_EligibleCollateral(EU_EMIR_EligibleCollateralEnum arg0)`
- `CollateralTaxonomyValueBuilder addUk_EMIR_EligibleCollateral(UK_EMIR_EligibleCollateralEnum arg0, int arg1)`
- `CollateralTaxonomyValueBuilder addUk_EMIR_EligibleCollateral(UK_EMIR_EligibleCollateralEnum arg0)`
- `CollateralTaxonomyValueBuilder addUk_EMIR_EligibleCollateral(List arg0)`
- `CollateralTaxonomyValueBuilder addUs_CFTC_PR_EligibleCollateral(US_CFTC_PR_EligibleCollateralEnum arg0, int arg1)`
- `CollateralTaxonomyValueBuilder addUs_CFTC_PR_EligibleCollateral(List arg0)`
- `CollateralTaxonomyValueBuilder addUs_CFTC_PR_EligibleCollateral(US_CFTC_PR_EligibleCollateralEnum arg0)`
- `CollateralTaxonomyValueBuilder addNonEnumeratedTaxonomyValue(FieldWithMetaString arg0, int arg1)`
- `CollateralTaxonomyValueBuilder addNonEnumeratedTaxonomyValue(List arg0)`
- `CollateralTaxonomyValueBuilder addNonEnumeratedTaxonomyValue(FieldWithMetaString arg0)`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `CollateralTaxonomyValueBuilder prune()`

