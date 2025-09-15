# ReturnTermsBase

**Full Name:** `cdm.product.asset.ReturnTermsBase`

**Package:** `cdm.product.asset`

## Type: Interface

### Implemented Interfaces

- `com.rosetta.model.lib.RosettaModelObject`

### Methods

#### Builder Methods

- `ReturnTermsBase build()`

#### Getter Methods

- `Class getType()`
- `String getPerformance()`
- `ValuationTerms getValuationTerms()`
- `DividendApplicability getDividendApplicability()`
- `Integer getExpectedN()`
- `Integer getAnnualizationFactor()`
- `Boolean getMeanAdjustment()`
- `BigDecimal getInitialLevel()`
- `DeterminationMethodEnum getInitialLevelSource()`
- `EquityUnderlierProvisions getEquityUnderlierProvisions()`
- `Boolean getSharePriceDividendAdjustment()`

#### Other Methods

- `void process(RosettaPath arg0, Processor arg1)`
- `ReturnTermsBaseBuilder toBuilder()`
- `RosettaMetaData metaData()`

### Annotations

- **RuneDataType**
- **RosettaDataType**

