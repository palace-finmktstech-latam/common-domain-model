# ValuationSourceBuilder

**Full Name:** `cdm.observable.asset.ValuationSource$ValuationSourceBuilder`

**Package:** `cdm.observable.asset`

## Type: Interface

### Implemented Interfaces

- `cdm.observable.asset.ValuationSource`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`

### Methods

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

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `ValuationSourceBuilder prune()`

