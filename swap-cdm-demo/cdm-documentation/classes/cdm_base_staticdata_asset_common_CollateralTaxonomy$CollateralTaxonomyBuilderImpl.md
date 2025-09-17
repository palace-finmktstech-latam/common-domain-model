# CollateralTaxonomyBuilderImpl

**Full Name:** `cdm.base.staticdata.asset.common.CollateralTaxonomy$CollateralTaxonomyBuilderImpl`

**Package:** `cdm.base.staticdata.asset.common`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.base.staticdata.asset.common.CollateralTaxonomy$CollateralTaxonomyBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| taxonomyValue | `CollateralTaxonomyValueBuilder` |  |
| taxonomySource | `TaxonomySourceEnum` |  |

### Methods

#### Builder Methods

- `CollateralTaxonomy build()`

#### Setter Methods

- `CollateralTaxonomyBuilder setTaxonomySource(TaxonomySourceEnum arg0)`
- `CollateralTaxonomyBuilder setTaxonomyValue(CollateralTaxonomyValue arg0)`

#### Getter Methods

- `CollateralTaxonomyValueBuilder getTaxonomyValue()`
- `CollateralTaxonomyValueBuilder getOrCreateTaxonomyValue()`
- `TaxonomySourceEnum getTaxonomySource()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `CollateralTaxonomyBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `CollateralTaxonomyBuilder prune()`
- `CollateralTaxonomyBuilder toBuilder()`
- `boolean hasData()`

