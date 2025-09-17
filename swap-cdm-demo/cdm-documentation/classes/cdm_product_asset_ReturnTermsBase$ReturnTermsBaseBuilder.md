# ReturnTermsBaseBuilder

**Full Name:** `cdm.product.asset.ReturnTermsBase$ReturnTermsBaseBuilder`

**Package:** `cdm.product.asset`

## Type: Interface

### Implemented Interfaces

- `cdm.product.asset.ReturnTermsBase`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`

### Methods

#### Setter Methods

- `ReturnTermsBaseBuilder setInitialLevel(BigDecimal arg0)`
- `ReturnTermsBaseBuilder setMeanAdjustment(Boolean arg0)`
- `ReturnTermsBaseBuilder setValuationTerms(ValuationTerms arg0)`
- `ReturnTermsBaseBuilder setAnnualizationFactor(Integer arg0)`
- `ReturnTermsBaseBuilder setExpectedN(Integer arg0)`
- `ReturnTermsBaseBuilder setDividendApplicability(DividendApplicability arg0)`
- `ReturnTermsBaseBuilder setInitialLevelSource(DeterminationMethodEnum arg0)`
- `ReturnTermsBaseBuilder setPerformance(String arg0)`
- `ReturnTermsBaseBuilder setSharePriceDividendAdjustment(Boolean arg0)`
- `ReturnTermsBaseBuilder setEquityUnderlierProvisions(EquityUnderlierProvisions arg0)`

#### Getter Methods

- `ValuationTermsBuilder getValuationTerms()`
- `DividendApplicabilityBuilder getDividendApplicability()`
- `ValuationTermsBuilder getOrCreateValuationTerms()`
- `EquityUnderlierProvisionsBuilder getEquityUnderlierProvisions()`
- `EquityUnderlierProvisionsBuilder getOrCreateEquityUnderlierProvisions()`
- `DividendApplicabilityBuilder getOrCreateDividendApplicability()`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `ReturnTermsBaseBuilder prune()`

