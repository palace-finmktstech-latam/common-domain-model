# InflationIndexBuilderImpl

**Full Name:** `cdm.observable.asset.InflationIndex$InflationIndexBuilderImpl`

**Package:** `cdm.observable.asset`

## Type: Concrete Class

### Inheritance

**Extends:**
- `cdm.observable.asset.IndexBase$IndexBaseBuilderImpl`

### Implemented Interfaces

- `cdm.observable.asset.InflationIndex$InflationIndexBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| inflationRateIndex | `FieldWithMetaInflationRateIndexEnumBuilder` |  |
| indexTenor | `PeriodBuilder` |  |

### Methods

#### Builder Methods

- `InflationIndex build()`

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

- `InflationIndexBuilder addRelatedExchange(LegalEntity arg0)`
- `InflationIndexBuilder addRelatedExchange(List arg0)`
- `InflationIndexBuilder addRelatedExchange(LegalEntity arg0, int arg1)`
- `InflationIndexBuilder addTaxonomy(List arg0)`
- `InflationIndexBuilder addTaxonomy(Taxonomy arg0, int arg1)`
- `InflationIndexBuilder addTaxonomy(Taxonomy arg0)`
- `InflationIndexBuilder addIdentifier(AssetIdentifier arg0, int arg1)`
- `InflationIndexBuilder addIdentifier(AssetIdentifier arg0)`
- `InflationIndexBuilder addIdentifier(List arg0)`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `InflationIndexBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `boolean hasData()`
- `InflationIndexBuilder toBuilder()`
- `InflationIndexBuilder prune()`

