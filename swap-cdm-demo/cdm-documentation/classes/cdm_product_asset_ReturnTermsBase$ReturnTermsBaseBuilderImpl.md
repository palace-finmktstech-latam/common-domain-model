# ReturnTermsBaseBuilderImpl

**Full Name:** `cdm.product.asset.ReturnTermsBase$ReturnTermsBaseBuilderImpl`

**Package:** `cdm.product.asset`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.product.asset.ReturnTermsBase$ReturnTermsBaseBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| valuationTerms | `ValuationTermsBuilder` |  |
| annualizationFactor | `Integer` |  |
| dividendApplicability | `DividendApplicabilityBuilder` |  |
| equityUnderlierProvisions | `EquityUnderlierProvisionsBuilder` |  |
| sharePriceDividendAdjustment | `Boolean` |  |
| expectedN | `Integer` |  |
| initialLevel | `BigDecimal` |  |
| initialLevelSource | `DeterminationMethodEnum` |  |
| meanAdjustment | `Boolean` |  |
| performance | `String` |  |

### Methods

#### Builder Methods

- `ReturnTermsBase build()`

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

- `Boolean getMeanAdjustment()`
- `Integer getExpectedN()`
- `DeterminationMethodEnum getInitialLevelSource()`
- `Integer getAnnualizationFactor()`
- `ValuationTermsBuilder getValuationTerms()`
- `BigDecimal getInitialLevel()`
- `DividendApplicabilityBuilder getDividendApplicability()`
- `ValuationTermsBuilder getOrCreateValuationTerms()`
- `EquityUnderlierProvisionsBuilder getEquityUnderlierProvisions()`
- `EquityUnderlierProvisionsBuilder getOrCreateEquityUnderlierProvisions()`
- `DividendApplicabilityBuilder getOrCreateDividendApplicability()`
- `Boolean getSharePriceDividendAdjustment()`
- `String getPerformance()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `ReturnTermsBaseBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `ReturnTermsBaseBuilder prune()`
- `ReturnTermsBaseBuilder toBuilder()`
- `boolean hasData()`

