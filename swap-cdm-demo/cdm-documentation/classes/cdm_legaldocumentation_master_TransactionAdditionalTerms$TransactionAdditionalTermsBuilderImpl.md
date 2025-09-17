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

- `TransactionAdditionalTermsBuilder setCreditAdditionalTerms(String arg0)`
- `TransactionAdditionalTermsBuilder setEquityAdditionalTerms(EquityAdditionalTerms arg0)`
- `TransactionAdditionalTermsBuilder setDigitalAssetAdditionalTerms(String arg0)`
- `TransactionAdditionalTermsBuilder setInterestRateAdditionalTerms(String arg0)`
- `TransactionAdditionalTermsBuilder setCommoditiesAdditionalTerms(String arg0)`
- `TransactionAdditionalTermsBuilder setForeignExchangeAdditionalTerms(FxAdditionalTerms arg0)`

#### Getter Methods

- `EquityAdditionalTermsBuilder getEquityAdditionalTerms()`
- `String getCreditAdditionalTerms()`
- `String getDigitalAssetAdditionalTerms()`
- `FxAdditionalTermsBuilder getForeignExchangeAdditionalTerms()`
- `String getInterestRateAdditionalTerms()`
- `String getCommoditiesAdditionalTerms()`
- `EquityAdditionalTermsBuilder getOrCreateEquityAdditionalTerms()`
- `FxAdditionalTermsBuilder getOrCreateForeignExchangeAdditionalTerms()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `TransactionAdditionalTermsBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `TransactionAdditionalTermsBuilder prune()`
- `TransactionAdditionalTermsBuilder toBuilder()`
- `boolean hasData()`

