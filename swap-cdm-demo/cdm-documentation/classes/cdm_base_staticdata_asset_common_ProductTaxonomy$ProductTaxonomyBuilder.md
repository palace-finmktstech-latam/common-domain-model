# ProductTaxonomyBuilder

**Full Name:** `cdm.base.staticdata.asset.common.ProductTaxonomy$ProductTaxonomyBuilder`

**Package:** `cdm.base.staticdata.asset.common`

## Type: Interface

### Implemented Interfaces

- `cdm.base.staticdata.asset.common.ProductTaxonomy`
- `cdm.base.staticdata.asset.common.Taxonomy$TaxonomyBuilder`

### Methods

#### Setter Methods

- `ProductTaxonomyBuilder setValue(TaxonomyValue arg0)`
- `ProductTaxonomyBuilder setSource(TaxonomySourceEnum arg0)`
- `ProductTaxonomyBuilder setProductQualifier(String arg0)`
- `ProductTaxonomyBuilder setPrimaryAssetClass(FieldWithMetaAssetClassEnum arg0)`
- `ProductTaxonomyBuilder setPrimaryAssetClassValue(AssetClassEnum arg0)`
- `ProductTaxonomyBuilder setSecondaryAssetClass(List arg0)`
- `ProductTaxonomyBuilder setSecondaryAssetClassValue(List arg0)`

#### Getter Methods

- `FieldWithMetaAssetClassEnumBuilder getPrimaryAssetClass()`
- `List getSecondaryAssetClass()`
- `FieldWithMetaAssetClassEnumBuilder getOrCreateSecondaryAssetClass(int arg0)`
- `FieldWithMetaAssetClassEnumBuilder getOrCreatePrimaryAssetClass()`

#### Adder Methods

- `ProductTaxonomyBuilder addSecondaryAssetClass(FieldWithMetaAssetClassEnum arg0)`
- `ProductTaxonomyBuilder addSecondaryAssetClass(FieldWithMetaAssetClassEnum arg0, int arg1)`
- `ProductTaxonomyBuilder addSecondaryAssetClass(List arg0)`
- `ProductTaxonomyBuilder addSecondaryAssetClassValue(List arg0)`
- `ProductTaxonomyBuilder addSecondaryAssetClassValue(AssetClassEnum arg0)`
- `ProductTaxonomyBuilder addSecondaryAssetClassValue(AssetClassEnum arg0, int arg1)`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `ProductTaxonomyBuilder prune()`

