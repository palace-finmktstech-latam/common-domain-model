# EquityIndexBuilder

**Full Name:** `cdm.observable.asset.EquityIndex$EquityIndexBuilder`

**Package:** `cdm.observable.asset`

## Type: Interface

### Implemented Interfaces

- `cdm.observable.asset.EquityIndex`
- `cdm.observable.asset.IndexBase$IndexBaseBuilder`

### Methods

#### Setter Methods

- `EquityIndexBuilder setName(FieldWithMetaString arg0)`
- `EquityIndexBuilder setIdentifier(List arg0)`
- `EquityIndexBuilder setTaxonomy(List arg0)`
- `EquityIndexBuilder setNameValue(String arg0)`
- `EquityIndexBuilder setExchange(LegalEntity arg0)`
- `EquityIndexBuilder setIsExchangeListed(Boolean arg0)`
- `EquityIndexBuilder setRelatedExchange(List arg0)`
- `EquityIndexBuilder setAssetClass(AssetClassEnum arg0)`
- `EquityIndexBuilder setProvider(LegalEntity arg0)`

#### Adder Methods

- `EquityIndexBuilder addIdentifier(AssetIdentifier arg0)`
- `EquityIndexBuilder addIdentifier(List arg0)`
- `EquityIndexBuilder addIdentifier(AssetIdentifier arg0, int arg1)`
- `EquityIndexBuilder addTaxonomy(Taxonomy arg0)`
- `EquityIndexBuilder addTaxonomy(Taxonomy arg0, int arg1)`
- `EquityIndexBuilder addTaxonomy(List arg0)`
- `EquityIndexBuilder addRelatedExchange(List arg0)`
- `EquityIndexBuilder addRelatedExchange(LegalEntity arg0)`
- `EquityIndexBuilder addRelatedExchange(LegalEntity arg0, int arg1)`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `EquityIndexBuilder prune()`

