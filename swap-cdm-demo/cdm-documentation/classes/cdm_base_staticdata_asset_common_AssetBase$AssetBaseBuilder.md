# AssetBaseBuilder

**Full Name:** `cdm.base.staticdata.asset.common.AssetBase$AssetBaseBuilder`

**Package:** `cdm.base.staticdata.asset.common`

## Type: Interface

### Implemented Interfaces

- `cdm.base.staticdata.asset.common.AssetBase`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`

### Methods

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
- `List getRelatedExchange()`
- `LegalEntityBuilder getOrCreateExchange()`
- `LegalEntityBuilder getOrCreateRelatedExchange(int arg0)`
- `List getIdentifier()`

#### Adder Methods

- `AssetBaseBuilder addIdentifier(List arg0)`
- `AssetBaseBuilder addIdentifier(AssetIdentifier arg0)`
- `AssetBaseBuilder addIdentifier(AssetIdentifier arg0, int arg1)`
- `AssetBaseBuilder addTaxonomy(Taxonomy arg0, int arg1)`
- `AssetBaseBuilder addTaxonomy(Taxonomy arg0)`
- `AssetBaseBuilder addTaxonomy(List arg0)`
- `AssetBaseBuilder addRelatedExchange(List arg0)`
- `AssetBaseBuilder addRelatedExchange(LegalEntity arg0, int arg1)`
- `AssetBaseBuilder addRelatedExchange(LegalEntity arg0)`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `AssetBaseBuilder prune()`

