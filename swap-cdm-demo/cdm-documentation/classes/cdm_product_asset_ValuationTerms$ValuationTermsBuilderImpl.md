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

- `ValuationTermsBuilder setFuturesPriceValuation(Boolean arg0)`
- `ValuationTermsBuilder setOptionsPriceValuation(Boolean arg0)`
- `ValuationTermsBuilder setNumberOfValuationDates(Integer arg0)`
- `ValuationTermsBuilder setDividendValuationDates(AdjustableRelativeOrPeriodicDates arg0)`
- `ValuationTermsBuilder setFPVFinalPriceElectionFallback(FPVFinalPriceElectionFallbackEnum arg0)`
- `ValuationTermsBuilder setMultipleExchangeIndexAnnexFallback(Boolean arg0)`
- `ValuationTermsBuilder setComponentSecurityIndexAnnexFallback(Boolean arg0)`

#### Getter Methods

- `Boolean getFuturesPriceValuation()`
- `Boolean getOptionsPriceValuation()`
- `Integer getNumberOfValuationDates()`
- `AdjustableRelativeOrPeriodicDatesBuilder getDividendValuationDates()`
- `Boolean getMultipleExchangeIndexAnnexFallback()`
- `FPVFinalPriceElectionFallbackEnum getFPVFinalPriceElectionFallback()`
- `Boolean getComponentSecurityIndexAnnexFallback()`
- `AdjustableRelativeOrPeriodicDatesBuilder getOrCreateDividendValuationDates()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `ValuationTermsBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `ValuationTermsBuilder prune()`
- `ValuationTermsBuilder toBuilder()`
- `boolean hasData()`

