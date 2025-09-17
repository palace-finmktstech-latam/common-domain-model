# ValuationTerms

**Full Name:** `cdm.product.asset.ValuationTerms`

**Package:** `cdm.product.asset`

## Type: Interface

### Implemented Interfaces

- `com.rosetta.model.lib.RosettaModelObject`

### Methods

#### Builder Methods

- `ValuationTerms build()`

#### Getter Methods

- `Class getType()`
- `Boolean getFuturesPriceValuation()`
- `Boolean getOptionsPriceValuation()`
- `Integer getNumberOfValuationDates()`
- `AdjustableRelativeOrPeriodicDates getDividendValuationDates()`
- `Boolean getMultipleExchangeIndexAnnexFallback()`
- `FPVFinalPriceElectionFallbackEnum getFPVFinalPriceElectionFallback()`
- `Boolean getComponentSecurityIndexAnnexFallback()`

#### Other Methods

- `void process(RosettaPath arg0, Processor arg1)`
- `ValuationTermsBuilder toBuilder()`
- `RosettaMetaData metaData()`

### Annotations

- **RuneDataType**
- **RosettaDataType**

