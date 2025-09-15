# EquityIndexBuilderImpl

**Full Name:** `cdm.observable.asset.EquityIndex$EquityIndexBuilderImpl`

**Package:** `cdm.observable.asset`

## Type: Concrete Class

### Inheritance

**Extends:**
- `cdm.observable.asset.IndexBase$IndexBaseBuilderImpl`

### Implemented Interfaces

- `cdm.observable.asset.EquityIndex$EquityIndexBuilder`

### Methods

#### Builder Methods

- `EquityIndex build()`

#### Setter Methods

- `EquityIndexBuilder setName(FieldWithMetaString arg0)`
- `EquityIndexBuilder setIsExchangeListed(Boolean arg0)`
- `EquityIndexBuilder setRelatedExchange(List arg0)`
- `EquityIndexBuilder setExchange(LegalEntity arg0)`
- `EquityIndexBuilder setProvider(LegalEntity arg0)`
- `EquityIndexBuilder setAssetClass(AssetClassEnum arg0)`
- `EquityIndexBuilder setTaxonomy(List arg0)`
- `EquityIndexBuilder setIdentifier(List arg0)`
- `EquityIndexBuilder setNameValue(String arg0)`

#### Adder Methods

- `EquityIndexBuilder addRelatedExchange(LegalEntity arg0)`
- `EquityIndexBuilder addRelatedExchange(LegalEntity arg0, int arg1)`
- `EquityIndexBuilder addRelatedExchange(List arg0)`
- `EquityIndexBuilder addTaxonomy(Taxonomy arg0)`
- `EquityIndexBuilder addTaxonomy(Taxonomy arg0, int arg1)`
- `EquityIndexBuilder addTaxonomy(List arg0)`
- `EquityIndexBuilder addIdentifier(AssetIdentifier arg0)`
- `EquityIndexBuilder addIdentifier(AssetIdentifier arg0, int arg1)`
- `EquityIndexBuilder addIdentifier(List arg0)`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `EquityIndexBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `boolean hasData()`
- `EquityIndexBuilder toBuilder()`
- `EquityIndexBuilder prune()`

