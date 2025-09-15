# TransactionAdditionalTermsBuilder

**Full Name:** `cdm.legaldocumentation.master.TransactionAdditionalTerms$TransactionAdditionalTermsBuilder`

**Package:** `cdm.legaldocumentation.master`

## Type: Interface

### Implemented Interfaces

- `cdm.legaldocumentation.master.TransactionAdditionalTerms`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`

### Methods

#### Setter Methods

- `TransactionAdditionalTermsBuilder setEquityAdditionalTerms(EquityAdditionalTerms arg0)`
- `TransactionAdditionalTermsBuilder setCreditAdditionalTerms(String arg0)`
- `TransactionAdditionalTermsBuilder setDigitalAssetAdditionalTerms(String arg0)`
- `TransactionAdditionalTermsBuilder setCommoditiesAdditionalTerms(String arg0)`
- `TransactionAdditionalTermsBuilder setInterestRateAdditionalTerms(String arg0)`
- `TransactionAdditionalTermsBuilder setForeignExchangeAdditionalTerms(FxAdditionalTerms arg0)`

#### Getter Methods

- `EquityAdditionalTermsBuilder getEquityAdditionalTerms()`
- `FxAdditionalTermsBuilder getForeignExchangeAdditionalTerms()`
- `FxAdditionalTermsBuilder getOrCreateForeignExchangeAdditionalTerms()`
- `EquityAdditionalTermsBuilder getOrCreateEquityAdditionalTerms()`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `TransactionAdditionalTermsBuilder prune()`

