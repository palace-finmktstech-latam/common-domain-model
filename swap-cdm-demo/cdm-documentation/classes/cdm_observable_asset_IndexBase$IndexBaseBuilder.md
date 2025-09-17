# IndexBaseBuilder

**Full Name:** `cdm.observable.asset.IndexBase$IndexBaseBuilder`

**Package:** `cdm.observable.asset`

## Type: Interface

### Implemented Interfaces

- `cdm.observable.asset.IndexBase`
- `cdm.base.staticdata.asset.common.AssetBase$AssetBaseBuilder`

### Methods

#### Setter Methods

- `IndexBaseBuilder setName(FieldWithMetaString arg0)`
- `IndexBaseBuilder setIdentifier(List arg0)`
- `IndexBaseBuilder setTaxonomy(List arg0)`
- `IndexBaseBuilder setNameValue(String arg0)`
- `IndexBaseBuilder setExchange(LegalEntity arg0)`
- `IndexBaseBuilder setIsExchangeListed(Boolean arg0)`
- `IndexBaseBuilder setRelatedExchange(List arg0)`
- `IndexBaseBuilder setAssetClass(AssetClassEnum arg0)`
- `IndexBaseBuilder setProvider(LegalEntity arg0)`

#### Getter Methods

- `FieldWithMetaStringBuilder getName()`
- `LegalEntityBuilder getProvider()`
- `FieldWithMetaStringBuilder getOrCreateName()`
- `LegalEntityBuilder getOrCreateProvider()`

#### Adder Methods

- `IndexBaseBuilder addIdentifier(List arg0)`
- `IndexBaseBuilder addIdentifier(AssetIdentifier arg0, int arg1)`
- `IndexBaseBuilder addIdentifier(AssetIdentifier arg0)`
- `IndexBaseBuilder addTaxonomy(Taxonomy arg0)`
- `IndexBaseBuilder addTaxonomy(List arg0)`
- `IndexBaseBuilder addTaxonomy(Taxonomy arg0, int arg1)`
- `IndexBaseBuilder addRelatedExchange(LegalEntity arg0, int arg1)`
- `IndexBaseBuilder addRelatedExchange(LegalEntity arg0)`
- `IndexBaseBuilder addRelatedExchange(List arg0)`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `IndexBaseBuilder prune()`

