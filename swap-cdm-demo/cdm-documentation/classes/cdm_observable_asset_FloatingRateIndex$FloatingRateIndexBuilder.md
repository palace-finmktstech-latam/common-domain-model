# FloatingRateIndexBuilder

**Full Name:** `cdm.observable.asset.FloatingRateIndex$FloatingRateIndexBuilder`

**Package:** `cdm.observable.asset`

## Type: Interface

### Implemented Interfaces

- `cdm.observable.asset.FloatingRateIndex`
- `cdm.observable.asset.IndexBase$IndexBaseBuilder`

### Methods

#### Setter Methods

- `FloatingRateIndexBuilder setName(FieldWithMetaString arg0)`
- `FloatingRateIndexBuilder setIsExchangeListed(Boolean arg0)`
- `FloatingRateIndexBuilder setRelatedExchange(List arg0)`
- `FloatingRateIndexBuilder setExchange(LegalEntity arg0)`
- `FloatingRateIndexBuilder setFloatingRateIndex(FieldWithMetaFloatingRateIndexEnum arg0)`
- `FloatingRateIndexBuilder setProvider(LegalEntity arg0)`
- `FloatingRateIndexBuilder setAssetClass(AssetClassEnum arg0)`
- `FloatingRateIndexBuilder setTaxonomy(List arg0)`
- `FloatingRateIndexBuilder setIdentifier(List arg0)`
- `FloatingRateIndexBuilder setNameValue(String arg0)`
- `FloatingRateIndexBuilder setIndexTenor(Period arg0)`
- `FloatingRateIndexBuilder setFloatingRateIndexValue(FloatingRateIndexEnum arg0)`

#### Getter Methods

- `FieldWithMetaFloatingRateIndexEnumBuilder getFloatingRateIndex()`
- `PeriodBuilder getIndexTenor()`
- `PeriodBuilder getOrCreateIndexTenor()`
- `FieldWithMetaFloatingRateIndexEnumBuilder getOrCreateFloatingRateIndex()`

#### Adder Methods

- `FloatingRateIndexBuilder addRelatedExchange(LegalEntity arg0)`
- `FloatingRateIndexBuilder addRelatedExchange(List arg0)`
- `FloatingRateIndexBuilder addRelatedExchange(LegalEntity arg0, int arg1)`
- `FloatingRateIndexBuilder addTaxonomy(Taxonomy arg0, int arg1)`
- `FloatingRateIndexBuilder addTaxonomy(List arg0)`
- `FloatingRateIndexBuilder addTaxonomy(Taxonomy arg0)`
- `FloatingRateIndexBuilder addIdentifier(AssetIdentifier arg0)`
- `FloatingRateIndexBuilder addIdentifier(List arg0)`
- `FloatingRateIndexBuilder addIdentifier(AssetIdentifier arg0, int arg1)`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `FloatingRateIndexBuilder prune()`

