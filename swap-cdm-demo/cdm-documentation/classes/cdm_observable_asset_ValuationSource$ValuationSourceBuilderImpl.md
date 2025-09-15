# ValuationSourceBuilderImpl

**Full Name:** `cdm.observable.asset.ValuationSource$ValuationSourceBuilderImpl`

**Package:** `cdm.observable.asset`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.observable.asset.ValuationSource$ValuationSourceBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| quotedCurrencyPair | `ReferenceWithMetaQuotedCurrencyPairBuilder` |  |
| informationSource | `FxSpotRateSourceBuilder` |  |
| settlementRateOption | `SettlementRateOptionBuilder` |  |
| referenceBanks | `ReferenceBanksBuilder` |  |
| dealerOrCCP | `AncillaryEntityBuilder` |  |

### Methods

#### Builder Methods

- `ValuationSource build()`

#### Setter Methods

- `ValuationSourceBuilder setSettlementRateOption(SettlementRateOption arg0)`
- `ValuationSourceBuilder setDealerOrCCP(AncillaryEntity arg0)`
- `ValuationSourceBuilder setReferenceBanks(ReferenceBanks arg0)`
- `ValuationSourceBuilder setInformationSource(FxSpotRateSource arg0)`
- `ValuationSourceBuilder setQuotedCurrencyPair(ReferenceWithMetaQuotedCurrencyPair arg0)`
- `ValuationSourceBuilder setQuotedCurrencyPairValue(QuotedCurrencyPair arg0)`

#### Getter Methods

- `ReferenceWithMetaQuotedCurrencyPairBuilder getQuotedCurrencyPair()`
- `ReferenceBanksBuilder getOrCreateReferenceBanks()`
- `AncillaryEntityBuilder getOrCreateDealerOrCCP()`
- `AncillaryEntityBuilder getDealerOrCCP()`
- `SettlementRateOptionBuilder getSettlementRateOption()`
- `ReferenceBanksBuilder getReferenceBanks()`
- `SettlementRateOptionBuilder getOrCreateSettlementRateOption()`
- `FxSpotRateSourceBuilder getInformationSource()`
- `FxSpotRateSourceBuilder getOrCreateInformationSource()`
- `ReferenceWithMetaQuotedCurrencyPairBuilder getOrCreateQuotedCurrencyPair()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `ValuationSourceBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `boolean hasData()`
- `ValuationSourceBuilder toBuilder()`
- `ValuationSourceBuilder prune()`

