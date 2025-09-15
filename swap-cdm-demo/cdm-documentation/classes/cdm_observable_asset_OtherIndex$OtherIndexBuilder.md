# OtherIndexBuilder

**Full Name:** `cdm.observable.asset.OtherIndex$OtherIndexBuilder`

**Package:** `cdm.observable.asset`

## Type: Interface

### Implemented Interfaces

- `cdm.observable.asset.OtherIndex`
- `cdm.observable.asset.IndexBase$IndexBaseBuilder`

### Methods

#### Setter Methods

- `OtherIndexBuilder setName(FieldWithMetaString arg0)`
- `OtherIndexBuilder setIsExchangeListed(Boolean arg0)`
- `OtherIndexBuilder setRelatedExchange(List arg0)`
- `OtherIndexBuilder setExchange(LegalEntity arg0)`
- `OtherIndexBuilder setProvider(LegalEntity arg0)`
- `OtherIndexBuilder setAssetClass(AssetClassEnum arg0)`
- `OtherIndexBuilder setTaxonomy(List arg0)`
- `OtherIndexBuilder setDescription(String arg0)`
- `OtherIndexBuilder setIdentifier(List arg0)`
- `OtherIndexBuilder setNameValue(String arg0)`

#### Adder Methods

- `OtherIndexBuilder addRelatedExchange(List arg0)`
- `OtherIndexBuilder addRelatedExchange(LegalEntity arg0)`
- `OtherIndexBuilder addRelatedExchange(LegalEntity arg0, int arg1)`
- `OtherIndexBuilder addTaxonomy(Taxonomy arg0, int arg1)`
- `OtherIndexBuilder addTaxonomy(Taxonomy arg0)`
- `OtherIndexBuilder addTaxonomy(List arg0)`
- `OtherIndexBuilder addIdentifier(AssetIdentifier arg0, int arg1)`
- `OtherIndexBuilder addIdentifier(List arg0)`
- `OtherIndexBuilder addIdentifier(AssetIdentifier arg0)`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `OtherIndexBuilder prune()`

