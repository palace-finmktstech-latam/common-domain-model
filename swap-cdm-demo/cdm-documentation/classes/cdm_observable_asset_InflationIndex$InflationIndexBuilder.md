# InflationIndexBuilder

**Full Name:** `cdm.observable.asset.InflationIndex$InflationIndexBuilder`

**Package:** `cdm.observable.asset`

## Type: Interface

### Implemented Interfaces

- `cdm.observable.asset.InflationIndex`
- `cdm.observable.asset.IndexBase$IndexBaseBuilder`

### Methods

#### Setter Methods

- `InflationIndexBuilder setName(FieldWithMetaString arg0)`
- `InflationIndexBuilder setIsExchangeListed(Boolean arg0)`
- `InflationIndexBuilder setRelatedExchange(List arg0)`
- `InflationIndexBuilder setExchange(LegalEntity arg0)`
- `InflationIndexBuilder setProvider(LegalEntity arg0)`
- `InflationIndexBuilder setAssetClass(AssetClassEnum arg0)`
- `InflationIndexBuilder setTaxonomy(List arg0)`
- `InflationIndexBuilder setIdentifier(List arg0)`
- `InflationIndexBuilder setNameValue(String arg0)`
- `InflationIndexBuilder setIndexTenor(Period arg0)`
- `InflationIndexBuilder setInflationRateIndex(FieldWithMetaInflationRateIndexEnum arg0)`
- `InflationIndexBuilder setInflationRateIndexValue(InflationRateIndexEnum arg0)`

#### Getter Methods

- `FieldWithMetaInflationRateIndexEnumBuilder getInflationRateIndex()`
- `PeriodBuilder getIndexTenor()`
- `PeriodBuilder getOrCreateIndexTenor()`
- `FieldWithMetaInflationRateIndexEnumBuilder getOrCreateInflationRateIndex()`

#### Adder Methods

- `InflationIndexBuilder addRelatedExchange(LegalEntity arg0, int arg1)`
- `InflationIndexBuilder addRelatedExchange(LegalEntity arg0)`
- `InflationIndexBuilder addRelatedExchange(List arg0)`
- `InflationIndexBuilder addTaxonomy(Taxonomy arg0)`
- `InflationIndexBuilder addTaxonomy(Taxonomy arg0, int arg1)`
- `InflationIndexBuilder addTaxonomy(List arg0)`
- `InflationIndexBuilder addIdentifier(AssetIdentifier arg0)`
- `InflationIndexBuilder addIdentifier(AssetIdentifier arg0, int arg1)`
- `InflationIndexBuilder addIdentifier(List arg0)`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `InflationIndexBuilder prune()`

