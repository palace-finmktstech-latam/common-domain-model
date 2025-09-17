# CollateralTaxonomyValueBuilderImpl

**Full Name:** `cdm.base.staticdata.asset.common.CollateralTaxonomyValue$CollateralTaxonomyValueBuilderImpl`

**Package:** `cdm.base.staticdata.asset.common`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.base.staticdata.asset.common.CollateralTaxonomyValue$CollateralTaxonomyValueBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| eu_EMIR_EligibleCollateral | `java.util.List<cdm.base.staticdata.asset.common.EU_EMIR_EligibleCollateralEnum>` |  |
| uk_EMIR_EligibleCollateral | `java.util.List<cdm.base.staticdata.asset.common.UK_EMIR_EligibleCollateralEnum>` |  |
| us_CFTC_PR_EligibleCollateral | `java.util.List<cdm.base.staticdata.asset.common.US_CFTC_PR_EligibleCollateralEnum>` |  |
| nonEnumeratedTaxonomyValue | `java.util.List<com.rosetta.model.metafields.FieldWithMetaString$FieldWithMetaStringBuilder>` |  |

### Methods

#### Builder Methods

- `CollateralTaxonomyValue build()`

#### Setter Methods

- `CollateralTaxonomyValueBuilder setEu_EMIR_EligibleCollateral(List arg0)`
- `CollateralTaxonomyValueBuilder setUk_EMIR_EligibleCollateral(List arg0)`
- `CollateralTaxonomyValueBuilder setNonEnumeratedTaxonomyValue(List arg0)`
- `CollateralTaxonomyValueBuilder setNonEnumeratedTaxonomyValueValue(List arg0)`
- `CollateralTaxonomyValueBuilder setUs_CFTC_PR_EligibleCollateral(List arg0)`

#### Getter Methods

- `FieldWithMetaStringBuilder getOrCreateNonEnumeratedTaxonomyValue(int arg0)`
- `List getUs_CFTC_PR_EligibleCollateral()`
- `List getUk_EMIR_EligibleCollateral()`
- `List getEu_EMIR_EligibleCollateral()`
- `List getNonEnumeratedTaxonomyValue()`

#### Adder Methods

- `CollateralTaxonomyValueBuilder addNonEnumeratedTaxonomyValueValue(List arg0)`
- `CollateralTaxonomyValueBuilder addNonEnumeratedTaxonomyValueValue(String arg0)`
- `CollateralTaxonomyValueBuilder addNonEnumeratedTaxonomyValueValue(String arg0, int arg1)`
- `CollateralTaxonomyValueBuilder addEu_EMIR_EligibleCollateral(List arg0)`
- `CollateralTaxonomyValueBuilder addEu_EMIR_EligibleCollateral(EU_EMIR_EligibleCollateralEnum arg0, int arg1)`
- `CollateralTaxonomyValueBuilder addEu_EMIR_EligibleCollateral(EU_EMIR_EligibleCollateralEnum arg0)`
- `CollateralTaxonomyValueBuilder addUk_EMIR_EligibleCollateral(UK_EMIR_EligibleCollateralEnum arg0)`
- `CollateralTaxonomyValueBuilder addUk_EMIR_EligibleCollateral(UK_EMIR_EligibleCollateralEnum arg0, int arg1)`
- `CollateralTaxonomyValueBuilder addUk_EMIR_EligibleCollateral(List arg0)`
- `CollateralTaxonomyValueBuilder addUs_CFTC_PR_EligibleCollateral(List arg0)`
- `CollateralTaxonomyValueBuilder addUs_CFTC_PR_EligibleCollateral(US_CFTC_PR_EligibleCollateralEnum arg0, int arg1)`
- `CollateralTaxonomyValueBuilder addUs_CFTC_PR_EligibleCollateral(US_CFTC_PR_EligibleCollateralEnum arg0)`
- `CollateralTaxonomyValueBuilder addNonEnumeratedTaxonomyValue(List arg0)`
- `CollateralTaxonomyValueBuilder addNonEnumeratedTaxonomyValue(FieldWithMetaString arg0, int arg1)`
- `CollateralTaxonomyValueBuilder addNonEnumeratedTaxonomyValue(FieldWithMetaString arg0)`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `CollateralTaxonomyValueBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `CollateralTaxonomyValueBuilder prune()`
- `CollateralTaxonomyValueBuilder toBuilder()`
- `boolean hasData()`

