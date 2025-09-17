# ProductTaxonomyBuilderImpl

**Full Name:** `cdm.base.staticdata.asset.common.ProductTaxonomy$ProductTaxonomyBuilderImpl`

**Package:** `cdm.base.staticdata.asset.common`

## Type: Concrete Class

### Inheritance

**Extends:**
- `cdm.base.staticdata.asset.common.Taxonomy$TaxonomyBuilderImpl`

### Implemented Interfaces

- `cdm.base.staticdata.asset.common.ProductTaxonomy$ProductTaxonomyBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| primaryAssetClass | `FieldWithMetaAssetClassEnumBuilder` |  |
| secondaryAssetClass | `java.util.List<cdm.base.staticdata.asset.common.metafields.FieldWithMetaAssetClassEnum$FieldWithMetaAssetClassEnumBuilder>` |  |
| productQualifier | `String` |  |

### Methods

#### Builder Methods

- `ProductTaxonomy build()`

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
- `String getProductQualifier()`
- `FieldWithMetaAssetClassEnumBuilder getOrCreateSecondaryAssetClass(int arg0)`
- `FieldWithMetaAssetClassEnumBuilder getOrCreatePrimaryAssetClass()`

#### Adder Methods

- `ProductTaxonomyBuilder addSecondaryAssetClass(FieldWithMetaAssetClassEnum arg0)`
- `ProductTaxonomyBuilder addSecondaryAssetClass(FieldWithMetaAssetClassEnum arg0, int arg1)`
- `ProductTaxonomyBuilder addSecondaryAssetClass(List arg0)`
- `ProductTaxonomyBuilder addSecondaryAssetClassValue(AssetClassEnum arg0, int arg1)`
- `ProductTaxonomyBuilder addSecondaryAssetClassValue(AssetClassEnum arg0)`
- `ProductTaxonomyBuilder addSecondaryAssetClassValue(List arg0)`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `ProductTaxonomyBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `ProductTaxonomyBuilder prune()`
- `ProductTaxonomyBuilder toBuilder()`
- `boolean hasData()`

