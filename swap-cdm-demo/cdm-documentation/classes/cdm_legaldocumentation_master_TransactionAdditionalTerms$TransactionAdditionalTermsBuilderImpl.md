# TransactionAdditionalTermsBuilderImpl

**Full Name:** `cdm.legaldocumentation.master.TransactionAdditionalTerms$TransactionAdditionalTermsBuilderImpl`

**Package:** `cdm.legaldocumentation.master`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.legaldocumentation.master.TransactionAdditionalTerms$TransactionAdditionalTermsBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| equityAdditionalTerms | `EquityAdditionalTermsBuilder` |  |
| foreignExchangeAdditionalTerms | `FxAdditionalTermsBuilder` |  |
| commoditiesAdditionalTerms | `String` |  |
| creditAdditionalTerms | `String` |  |
| interestRateAdditionalTerms | `String` |  |
| digitalAssetAdditionalTerms | `String` |  |

### Methods

#### Builder Methods

- `TransactionAdditionalTerms build()`

#### Setter Methods

- `TransactionAdditionalTermsBuilder setEquityAdditionalTerms(EquityAdditionalTerms arg0)`
- `TransactionAdditionalTermsBuilder setCreditAdditionalTerms(String arg0)`
- `TransactionAdditionalTermsBuilder setDigitalAssetAdditionalTerms(String arg0)`
- `TransactionAdditionalTermsBuilder setCommoditiesAdditionalTerms(String arg0)`
- `TransactionAdditionalTermsBuilder setInterestRateAdditionalTerms(String arg0)`
- `TransactionAdditionalTermsBuilder setForeignExchangeAdditionalTerms(FxAdditionalTerms arg0)`

#### Getter Methods

- `String getCreditAdditionalTerms()`
- `EquityAdditionalTermsBuilder getEquityAdditionalTerms()`
- `FxAdditionalTermsBuilder getForeignExchangeAdditionalTerms()`
- `String getDigitalAssetAdditionalTerms()`
- `String getCommoditiesAdditionalTerms()`
- `String getInterestRateAdditionalTerms()`
- `FxAdditionalTermsBuilder getOrCreateForeignExchangeAdditionalTerms()`
- `EquityAdditionalTermsBuilder getOrCreateEquityAdditionalTerms()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `TransactionAdditionalTermsBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `boolean hasData()`
- `TransactionAdditionalTermsBuilder toBuilder()`
- `TransactionAdditionalTermsBuilder prune()`

