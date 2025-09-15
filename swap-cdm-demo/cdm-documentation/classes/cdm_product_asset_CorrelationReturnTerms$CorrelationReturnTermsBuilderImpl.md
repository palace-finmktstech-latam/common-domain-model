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

- `CorrelationReturnTermsBuilder setSharePriceDividendAdjustment(Boolean arg0)`
- `CorrelationReturnTermsBuilder setEquityUnderlierProvisions(EquityUnderlierProvisions arg0)`
- `CorrelationReturnTermsBuilder setNumberOfDataSeries(Integer arg0)`
- `CorrelationReturnTermsBuilder setValuationTerms(ValuationTerms arg0)`
- `CorrelationReturnTermsBuilder setInitialLevel(BigDecimal arg0)`
- `CorrelationReturnTermsBuilder setDividendApplicability(DividendApplicability arg0)`
- `CorrelationReturnTermsBuilder setMeanAdjustment(Boolean arg0)`
- `CorrelationReturnTermsBuilder setExpectedN(Integer arg0)`
- `CorrelationReturnTermsBuilder setCorrelationStrikePrice(Price arg0)`
- `CorrelationReturnTermsBuilder setInitialLevelSource(DeterminationMethodEnum arg0)`
- `CorrelationReturnTermsBuilder setBoundedCorrelation(NumberRange arg0)`
- `CorrelationReturnTermsBuilder setPerformance(String arg0)`
- `CorrelationReturnTermsBuilder setAnnualizationFactor(Integer arg0)`

#### Getter Methods

- `PriceBuilder getCorrelationStrikePrice()`
- `NumberRangeBuilder getBoundedCorrelation()`
- `Integer getNumberOfDataSeries()`
- `PriceBuilder getOrCreateCorrelationStrikePrice()`
- `NumberRangeBuilder getOrCreateBoundedCorrelation()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `CorrelationReturnTermsBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `boolean hasData()`
- `CorrelationReturnTermsBuilder toBuilder()`
- `CorrelationReturnTermsBuilder prune()`

