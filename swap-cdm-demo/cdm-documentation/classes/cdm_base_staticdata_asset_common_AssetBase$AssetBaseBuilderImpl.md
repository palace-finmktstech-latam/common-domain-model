# AssetBaseBuilderImpl

**Full Name:** `cdm.base.staticdata.asset.common.AssetBase$AssetBaseBuilderImpl`

**Package:** `cdm.base.staticdata.asset.common`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.base.staticdata.asset.common.AssetBase$AssetBaseBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| identifier | `java.util.List<cdm.base.staticdata.asset.common.AssetIdentifier$AssetIdentifierBuilder>` |  |
| taxonomy | `java.util.List<cdm.base.staticdata.asset.common.Taxonomy$TaxonomyBuilder>` |  |
| isExchangeListed | `Boolean` |  |
| exchange | `LegalEntityBuilder` |  |
| relatedExchange | `java.util.List<cdm.base.staticdata.party.LegalEntity$LegalEntityBuilder>` |  |

### Methods

#### Builder Methods

- `AssetBase build()`

#### Setter Methods

- `AssetBaseBuilder setIdentifier(List arg0)`
- `AssetBaseBuilder setTaxonomy(List arg0)`
- `AssetBaseBuilder setExchange(LegalEntity arg0)`
- `AssetBaseBuilder setIsExchangeListed(Boolean arg0)`
- `AssetBaseBuilder setRelatedExchange(List arg0)`

#### Getter Methods

- `AssetIdentifierBuilder getOrCreateIdentifier(int arg0)`
- `List getTaxonomy()`
- `TaxonomyBuilder getOrCreateTaxonomy(int arg0)`
- `LegalEntityBuilder getExchange()`
- `Boolean getIsExchangeListed()`
- `List getRelatedExchange()`
- `LegalEntityBuilder getOrCreateExchange()`
- `LegalEntityBuilder getOrCreateRelatedExchange(int arg0)`
- `List getIdentifier()`

#### Adder Methods

- `AssetBaseBuilder addIdentifier(AssetIdentifier arg0, int arg1)`
- `AssetBaseBuilder addIdentifier(AssetIdentifier arg0)`
- `AssetBaseBuilder addIdentifier(List arg0)`
- `AssetBaseBuilder addTaxonomy(Taxonomy arg0, int arg1)`
- `AssetBaseBuilder addTaxonomy(Taxonomy arg0)`
- `AssetBaseBuilder addTaxonomy(List arg0)`
- `AssetBaseBuilder addRelatedExchange(LegalEntity arg0)`
- `AssetBaseBuilder addRelatedExchange(LegalEntity arg0, int arg1)`
- `AssetBaseBuilder addRelatedExchange(List arg0)`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `AssetBaseBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `AssetBaseBuilder prune()`
- `AssetBaseBuilder toBuilder()`
- `boolean hasData()`

