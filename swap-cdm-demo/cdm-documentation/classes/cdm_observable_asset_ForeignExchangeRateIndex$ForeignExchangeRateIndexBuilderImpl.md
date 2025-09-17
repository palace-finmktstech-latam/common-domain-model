# ForeignExchangeRateIndexBuilderImpl

**Full Name:** `cdm.observable.asset.ForeignExchangeRateIndex$ForeignExchangeRateIndexBuilderImpl`

**Package:** `cdm.observable.asset`

## Type: Concrete Class

### Inheritance

**Extends:**
- `cdm.observable.asset.IndexBase$IndexBaseBuilderImpl`

### Implemented Interfaces

- `cdm.observable.asset.ForeignExchangeRateIndex$ForeignExchangeRateIndexBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| quotedCurrencyPair | `FieldWithMetaQuotedCurrencyPairBuilder` |  |
| primaryFxSpotRateSource | `InformationSourceBuilder` |  |
| secondaryFxSpotRateSource | `InformationSourceBuilder` |  |

### Methods

#### Builder Methods

- `ForeignExchangeRateIndex build()`

#### Setter Methods

- `ForeignExchangeRateIndexBuilder setName(FieldWithMetaString arg0)`
- `ForeignExchangeRateIndexBuilder setIdentifier(List arg0)`
- `ForeignExchangeRateIndexBuilder setTaxonomy(List arg0)`
- `ForeignExchangeRateIndexBuilder setNameValue(String arg0)`
- `ForeignExchangeRateIndexBuilder setExchange(LegalEntity arg0)`
- `ForeignExchangeRateIndexBuilder setIsExchangeListed(Boolean arg0)`
- `ForeignExchangeRateIndexBuilder setRelatedExchange(List arg0)`
- `ForeignExchangeRateIndexBuilder setQuotedCurrencyPair(FieldWithMetaQuotedCurrencyPair arg0)`
- `ForeignExchangeRateIndexBuilder setAssetClass(AssetClassEnum arg0)`
- `ForeignExchangeRateIndexBuilder setProvider(LegalEntity arg0)`
- `ForeignExchangeRateIndexBuilder setQuotedCurrencyPairValue(QuotedCurrencyPair arg0)`
- `ForeignExchangeRateIndexBuilder setPrimaryFxSpotRateSource(InformationSource arg0)`
- `ForeignExchangeRateIndexBuilder setSecondaryFxSpotRateSource(InformationSource arg0)`

#### Getter Methods

- `InformationSourceBuilder getPrimaryFxSpotRateSource()`
- `FieldWithMetaQuotedCurrencyPairBuilder getQuotedCurrencyPair()`
- `FieldWithMetaQuotedCurrencyPairBuilder getOrCreateQuotedCurrencyPair()`
- `InformationSourceBuilder getSecondaryFxSpotRateSource()`
- `InformationSourceBuilder getOrCreatePrimaryFxSpotRateSource()`
- `InformationSourceBuilder getOrCreateSecondaryFxSpotRateSource()`

#### Adder Methods

- `ForeignExchangeRateIndexBuilder addIdentifier(AssetIdentifier arg0)`
- `ForeignExchangeRateIndexBuilder addIdentifier(List arg0)`
- `ForeignExchangeRateIndexBuilder addIdentifier(AssetIdentifier arg0, int arg1)`
- `ForeignExchangeRateIndexBuilder addTaxonomy(List arg0)`
- `ForeignExchangeRateIndexBuilder addTaxonomy(Taxonomy arg0)`
- `ForeignExchangeRateIndexBuilder addTaxonomy(Taxonomy arg0, int arg1)`
- `ForeignExchangeRateIndexBuilder addRelatedExchange(List arg0)`
- `ForeignExchangeRateIndexBuilder addRelatedExchange(LegalEntity arg0, int arg1)`
- `ForeignExchangeRateIndexBuilder addRelatedExchange(LegalEntity arg0)`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `ForeignExchangeRateIndexBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `ForeignExchangeRateIndexBuilder prune()`
- `ForeignExchangeRateIndexBuilder toBuilder()`
- `boolean hasData()`

