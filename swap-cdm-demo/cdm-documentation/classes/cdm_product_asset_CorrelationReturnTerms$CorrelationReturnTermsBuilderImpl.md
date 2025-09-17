# CorrelationReturnTermsBuilderImpl

**Full Name:** `cdm.product.asset.CorrelationReturnTerms$CorrelationReturnTermsBuilderImpl`

**Package:** `cdm.product.asset`

## Type: Concrete Class

### Inheritance

**Extends:**
- `cdm.product.asset.ReturnTermsBase$ReturnTermsBaseBuilderImpl`

### Implemented Interfaces

- `cdm.product.asset.CorrelationReturnTerms$CorrelationReturnTermsBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| correlationStrikePrice | `PriceBuilder` |  |
| boundedCorrelation | `NumberRangeBuilder` |  |
| numberOfDataSeries | `Integer` |  |

### Methods

#### Builder Methods

- `CorrelationReturnTerms build()`

#### Setter Methods

- `CorrelationReturnTermsBuilder setInitialLevel(BigDecimal arg0)`
- `CorrelationReturnTermsBuilder setMeanAdjustment(Boolean arg0)`
- `CorrelationReturnTermsBuilder setNumberOfDataSeries(Integer arg0)`
- `CorrelationReturnTermsBuilder setValuationTerms(ValuationTerms arg0)`
- `CorrelationReturnTermsBuilder setAnnualizationFactor(Integer arg0)`
- `CorrelationReturnTermsBuilder setExpectedN(Integer arg0)`
- `CorrelationReturnTermsBuilder setBoundedCorrelation(NumberRange arg0)`
- `CorrelationReturnTermsBuilder setDividendApplicability(DividendApplicability arg0)`
- `CorrelationReturnTermsBuilder setCorrelationStrikePrice(Price arg0)`
- `CorrelationReturnTermsBuilder setInitialLevelSource(DeterminationMethodEnum arg0)`
- `CorrelationReturnTermsBuilder setPerformance(String arg0)`
- `CorrelationReturnTermsBuilder setSharePriceDividendAdjustment(Boolean arg0)`
- `CorrelationReturnTermsBuilder setEquityUnderlierProvisions(EquityUnderlierProvisions arg0)`

#### Getter Methods

- `NumberRangeBuilder getBoundedCorrelation()`
- `PriceBuilder getCorrelationStrikePrice()`
- `Integer getNumberOfDataSeries()`
- `NumberRangeBuilder getOrCreateBoundedCorrelation()`
- `PriceBuilder getOrCreateCorrelationStrikePrice()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `CorrelationReturnTermsBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `CorrelationReturnTermsBuilder prune()`
- `CorrelationReturnTermsBuilder toBuilder()`
- `boolean hasData()`

