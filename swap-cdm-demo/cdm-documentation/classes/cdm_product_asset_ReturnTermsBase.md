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
- `Boolean getMeanAdjustment()`
- `Integer getExpectedN()`
- `DeterminationMethodEnum getInitialLevelSource()`
- `Integer getAnnualizationFactor()`
- `ValuationTerms getValuationTerms()`
- `BigDecimal getInitialLevel()`
- `DividendApplicability getDividendApplicability()`
- `EquityUnderlierProvisions getEquityUnderlierProvisions()`
- `Boolean getSharePriceDividendAdjustment()`
- `String getPerformance()`

#### Other Methods

- `void process(RosettaPath arg0, Processor arg1)`
- `ReturnTermsBaseBuilder toBuilder()`
- `RosettaMetaData metaData()`

### Annotations

- **RuneDataType**
- **RosettaDataType**

