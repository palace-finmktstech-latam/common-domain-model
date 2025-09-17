# FloatingRateIndexBuilderImpl

**Full Name:** `cdm.observable.asset.FloatingRateIndex$FloatingRateIndexBuilderImpl`

**Package:** `cdm.observable.asset`

## Type: Concrete Class

### Inheritance

**Extends:**
- `cdm.observable.asset.IndexBase$IndexBaseBuilderImpl`

### Implemented Interfaces

- `cdm.observable.asset.FloatingRateIndex$FloatingRateIndexBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| floatingRateIndex | `FieldWithMetaFloatingRateIndexEnumBuilder` |  |
| indexTenor | `PeriodBuilder` |  |

### Methods

#### Builder Methods

- `FloatingRateIndex build()`

#### Setter Methods

- `FloatingRateIndexBuilder setName(FieldWithMetaString arg0)`
- `FloatingRateIndexBuilder setIdentifier(List arg0)`
- `FloatingRateIndexBuilder setIndexTenor(Period arg0)`
- `FloatingRateIndexBuilder setTaxonomy(List arg0)`
- `FloatingRateIndexBuilder setFloatingRateIndexValue(FloatingRateIndexEnum arg0)`
- `FloatingRateIndexBuilder setNameValue(String arg0)`
- `FloatingRateIndexBuilder setExchange(LegalEntity arg0)`
- `FloatingRateIndexBuilder setIsExchangeListed(Boolean arg0)`
- `FloatingRateIndexBuilder setRelatedExchange(List arg0)`
- `FloatingRateIndexBuilder setAssetClass(AssetClassEnum arg0)`
- `FloatingRateIndexBuilder setProvider(LegalEntity arg0)`
- `FloatingRateIndexBuilder setFloatingRateIndex(FieldWithMetaFloatingRateIndexEnum arg0)`

#### Getter Methods

- `PeriodBuilder getOrCreateIndexTenor()`
- `PeriodBuilder getIndexTenor()`
- `FieldWithMetaFloatingRateIndexEnumBuilder getFloatingRateIndex()`
- `FieldWithMetaFloatingRateIndexEnumBuilder getOrCreateFloatingRateIndex()`

#### Adder Methods

- `FloatingRateIndexBuilder addIdentifier(List arg0)`
- `FloatingRateIndexBuilder addIdentifier(AssetIdentifier arg0)`
- `FloatingRateIndexBuilder addIdentifier(AssetIdentifier arg0, int arg1)`
- `FloatingRateIndexBuilder addTaxonomy(Taxonomy arg0)`
- `FloatingRateIndexBuilder addTaxonomy(Taxonomy arg0, int arg1)`
- `FloatingRateIndexBuilder addTaxonomy(List arg0)`
- `FloatingRateIndexBuilder addRelatedExchange(List arg0)`
- `FloatingRateIndexBuilder addRelatedExchange(LegalEntity arg0)`
- `FloatingRateIndexBuilder addRelatedExchange(LegalEntity arg0, int arg1)`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `FloatingRateIndexBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `FloatingRateIndexBuilder prune()`
- `FloatingRateIndexBuilder toBuilder()`
- `boolean hasData()`

