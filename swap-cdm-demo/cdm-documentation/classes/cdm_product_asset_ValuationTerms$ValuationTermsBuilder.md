# ValuationTermsBuilder

**Full Name:** `cdm.product.asset.ValuationTerms$ValuationTermsBuilder`

**Package:** `cdm.product.asset`

## Type: Interface

### Implemented Interfaces

- `cdm.product.asset.ValuationTerms`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`

### Methods

#### Setter Methods

- `ValuationTermsBuilder setMultipleExchangeIndexAnnexFallback(Boolean arg0)`
- `ValuationTermsBuilder setComponentSecurityIndexAnnexFallback(Boolean arg0)`
- `ValuationTermsBuilder setFPVFinalPriceElectionFallback(FPVFinalPriceElectionFallbackEnum arg0)`
- `ValuationTermsBuilder setNumberOfValuationDates(Integer arg0)`
- `ValuationTermsBuilder setDividendValuationDates(AdjustableRelativeOrPeriodicDates arg0)`
- `ValuationTermsBuilder setFuturesPriceValuation(Boolean arg0)`
- `ValuationTermsBuilder setOptionsPriceValuation(Boolean arg0)`

#### Getter Methods

- `AdjustableRelativeOrPeriodicDatesBuilder getOrCreateDividendValuationDates()`
- `AdjustableRelativeOrPeriodicDatesBuilder getDividendValuationDates()`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `ValuationTermsBuilder prune()`

