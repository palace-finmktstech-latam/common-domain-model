# TaxonomyBuilderImpl

**Full Name:** `cdm.base.staticdata.asset.common.Taxonomy$TaxonomyBuilderImpl`

**Package:** `cdm.base.staticdata.asset.common`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.base.staticdata.asset.common.Taxonomy$TaxonomyBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| source | `TaxonomySourceEnum` |  |
| value | `TaxonomyValueBuilder` |  |

### Methods

#### Builder Methods

- `Taxonomy build()`

#### Setter Methods

- `TaxonomyBuilder setValue(TaxonomyValue arg0)`
- `TaxonomyBuilder setSource(TaxonomySourceEnum arg0)`

#### Getter Methods

- `TaxonomyValueBuilder getValue()`
- `TaxonomyValueBuilder getOrCreateValue()`
- `TaxonomySourceEnum getSource()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `TaxonomyBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `TaxonomyBuilder prune()`
- `TaxonomyBuilder toBuilder()`
- `boolean hasData()`

