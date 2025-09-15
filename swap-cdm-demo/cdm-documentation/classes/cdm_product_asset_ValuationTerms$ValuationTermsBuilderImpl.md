# ValuationTermsBuilderImpl

**Full Name:** `cdm.product.asset.ValuationTerms$ValuationTermsBuilderImpl`

**Package:** `cdm.product.asset`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.product.asset.ValuationTerms$ValuationTermsBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| futuresPriceValuation | `Boolean` |  |
| optionsPriceValuation | `Boolean` |  |
| numberOfValuationDates | `Integer` |  |
| dividendValuationDates | `AdjustableRelativeOrPeriodicDatesBuilder` |  |
| fPVFinalPriceElectionFallback | `FPVFinalPriceElectionFallbackEnum` |  |
| multipleExchangeIndexAnnexFallback | `Boolean` |  |
| componentSecurityIndexAnnexFallback | `Boolean` |  |

### Methods

#### Builder Methods

- `ValuationTerms build()`

#### Setter Methods

- `ValuationTermsBuilder setMultipleExchangeIndexAnnexFallback(Boolean arg0)`
- `ValuationTermsBuilder setComponentSecurityIndexAnnexFallback(Boolean arg0)`
- `ValuationTermsBuilder setFPVFinalPriceElectionFallback(FPVFinalPriceElectionFallbackEnum arg0)`
- `ValuationTermsBuilder setNumberOfValuationDates(Integer arg0)`
- `ValuationTermsBuilder setDividendValuationDates(AdjustableRelativeOrPeriodicDates arg0)`
- `ValuationTermsBuilder setFuturesPriceValuation(Boolean arg0)`
- `ValuationTermsBuilder setOptionsPriceValuation(Boolean arg0)`

#### Getter Methods

- `Boolean getMultipleExchangeIndexAnnexFallback()`
- `FPVFinalPriceElectionFallbackEnum getFPVFinalPriceElectionFallback()`
- `AdjustableRelativeOrPeriodicDatesBuilder getOrCreateDividendValuationDates()`
- `Boolean getComponentSecurityIndexAnnexFallback()`
- `AdjustableRelativeOrPeriodicDatesBuilder getDividendValuationDates()`
- `Boolean getFuturesPriceValuation()`
- `Boolean getOptionsPriceValuation()`
- `Integer getNumberOfValuationDates()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `ValuationTermsBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `boolean hasData()`
- `ValuationTermsBuilder toBuilder()`
- `ValuationTermsBuilder prune()`

