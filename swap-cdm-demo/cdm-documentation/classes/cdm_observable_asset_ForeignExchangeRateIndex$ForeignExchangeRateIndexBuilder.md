# ForeignExchangeRateIndexBuilder

**Full Name:** `cdm.observable.asset.ForeignExchangeRateIndex$ForeignExchangeRateIndexBuilder`

**Package:** `cdm.observable.asset`

## Type: Interface

### Implemented Interfaces

- `cdm.observable.asset.ForeignExchangeRateIndex`
- `cdm.observable.asset.IndexBase$IndexBaseBuilder`

### Methods

#### Setter Methods

- `ForeignExchangeRateIndexBuilder setName(FieldWithMetaString arg0)`
- `ForeignExchangeRateIndexBuilder setIsExchangeListed(Boolean arg0)`
- `ForeignExchangeRateIndexBuilder setRelatedExchange(List arg0)`
- `ForeignExchangeRateIndexBuilder setExchange(LegalEntity arg0)`
- `ForeignExchangeRateIndexBuilder setProvider(LegalEntity arg0)`
- `ForeignExchangeRateIndexBuilder setAssetClass(AssetClassEnum arg0)`
- `ForeignExchangeRateIndexBuilder setTaxonomy(List arg0)`
- `ForeignExchangeRateIndexBuilder setIdentifier(List arg0)`
- `ForeignExchangeRateIndexBuilder setNameValue(String arg0)`
- `ForeignExchangeRateIndexBuilder setSecondaryFxSpotRateSource(InformationSource arg0)`
- `ForeignExchangeRateIndexBuilder setQuotedCurrencyPair(FieldWithMetaQuotedCurrencyPair arg0)`
- `ForeignExchangeRateIndexBuilder setPrimaryFxSpotRateSource(InformationSource arg0)`
- `ForeignExchangeRateIndexBuilder setQuotedCurrencyPairValue(QuotedCurrencyPair arg0)`

#### Getter Methods

- `FieldWithMetaQuotedCurrencyPairBuilder getQuotedCurrencyPair()`
- `InformationSourceBuilder getPrimaryFxSpotRateSource()`
- `InformationSourceBuilder getSecondaryFxSpotRateSource()`
- `InformationSourceBuilder getOrCreatePrimaryFxSpotRateSource()`
- `FieldWithMetaQuotedCurrencyPairBuilder getOrCreateQuotedCurrencyPair()`
- `InformationSourceBuilder getOrCreateSecondaryFxSpotRateSource()`

#### Adder Methods

- `ForeignExchangeRateIndexBuilder addRelatedExchange(LegalEntity arg0)`
- `ForeignExchangeRateIndexBuilder addRelatedExchange(LegalEntity arg0, int arg1)`
- `ForeignExchangeRateIndexBuilder addRelatedExchange(List arg0)`
- `ForeignExchangeRateIndexBuilder addTaxonomy(List arg0)`
- `ForeignExchangeRateIndexBuilder addTaxonomy(Taxonomy arg0, int arg1)`
- `ForeignExchangeRateIndexBuilder addTaxonomy(Taxonomy arg0)`
- `ForeignExchangeRateIndexBuilder addIdentifier(List arg0)`
- `ForeignExchangeRateIndexBuilder addIdentifier(AssetIdentifier arg0, int arg1)`
- `ForeignExchangeRateIndexBuilder addIdentifier(AssetIdentifier arg0)`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `ForeignExchangeRateIndexBuilder prune()`

