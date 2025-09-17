# ValuationSourceBuilder

**Full Name:** `cdm.observable.asset.ValuationSource$ValuationSourceBuilder`

**Package:** `cdm.observable.asset`

## Type: Interface

### Implemented Interfaces

- `cdm.observable.asset.ValuationSource`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`

### Methods

#### Setter Methods

- `ValuationSourceBuilder setInformationSource(FxSpotRateSource arg0)`
- `ValuationSourceBuilder setDealerOrCCP(AncillaryEntity arg0)`
- `ValuationSourceBuilder setSettlementRateOption(SettlementRateOption arg0)`
- `ValuationSourceBuilder setReferenceBanks(ReferenceBanks arg0)`
- `ValuationSourceBuilder setQuotedCurrencyPair(ReferenceWithMetaQuotedCurrencyPair arg0)`
- `ValuationSourceBuilder setQuotedCurrencyPairValue(QuotedCurrencyPair arg0)`

#### Getter Methods

- `FxSpotRateSourceBuilder getInformationSource()`
- `ReferenceBanksBuilder getReferenceBanks()`
- `SettlementRateOptionBuilder getSettlementRateOption()`
- `AncillaryEntityBuilder getDealerOrCCP()`
- `AncillaryEntityBuilder getOrCreateDealerOrCCP()`
- `ReferenceBanksBuilder getOrCreateReferenceBanks()`
- `FxSpotRateSourceBuilder getOrCreateInformationSource()`
- `SettlementRateOptionBuilder getOrCreateSettlementRateOption()`
- `ReferenceWithMetaQuotedCurrencyPairBuilder getQuotedCurrencyPair()`
- `ReferenceWithMetaQuotedCurrencyPairBuilder getOrCreateQuotedCurrencyPair()`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `ValuationSourceBuilder prune()`

