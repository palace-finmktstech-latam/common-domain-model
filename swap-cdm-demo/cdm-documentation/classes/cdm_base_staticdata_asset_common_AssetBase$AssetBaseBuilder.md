# AssetBaseBuilder

**Full Name:** `cdm.base.staticdata.asset.common.AssetBase$AssetBaseBuilder`

**Package:** `cdm.base.staticdata.asset.common`

## Type: Interface

### Implemented Interfaces

- `cdm.base.staticdata.asset.common.AssetBase`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`

### Methods

#### Setter Methods

- `AssetBaseBuilder setIsExchangeListed(Boolean arg0)`
- `AssetBaseBuilder setRelatedExchange(List arg0)`
- `AssetBaseBuilder setExchange(LegalEntity arg0)`
- `AssetBaseBuilder setTaxonomy(List arg0)`
- `AssetBaseBuilder setIdentifier(List arg0)`

#### Getter Methods

- `LegalEntityBuilder getOrCreateRelatedExchange(int arg0)`
- `LegalEntityBuilder getOrCreateExchange()`
- `List getRelatedExchange()`
- `TaxonomyBuilder getOrCreateTaxonomy(int arg0)`
- `LegalEntityBuilder getExchange()`
- `AssetIdentifierBuilder getOrCreateIdentifier(int arg0)`
- `List getTaxonomy()`
- `List getIdentifier()`

#### Adder Methods

- `AssetBaseBuilder addRelatedExchange(LegalEntity arg0)`
- `AssetBaseBuilder addRelatedExchange(List arg0)`
- `AssetBaseBuilder addRelatedExchange(LegalEntity arg0, int arg1)`
- `AssetBaseBuilder addTaxonomy(Taxonomy arg0, int arg1)`
- `AssetBaseBuilder addTaxonomy(List arg0)`
- `AssetBaseBuilder addTaxonomy(Taxonomy arg0)`
- `AssetBaseBuilder addIdentifier(AssetIdentifier arg0, int arg1)`
- `AssetBaseBuilder addIdentifier(AssetIdentifier arg0)`
- `AssetBaseBuilder addIdentifier(List arg0)`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `AssetBaseBuilder prune()`

