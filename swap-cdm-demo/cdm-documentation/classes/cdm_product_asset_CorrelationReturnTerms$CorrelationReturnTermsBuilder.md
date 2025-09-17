# CorrelationReturnTermsBuilder

**Full Name:** `cdm.product.asset.CorrelationReturnTerms$CorrelationReturnTermsBuilder`

**Package:** `cdm.product.asset`

## Type: Interface

### Implemented Interfaces

- `cdm.product.asset.CorrelationReturnTerms`
- `cdm.product.asset.ReturnTermsBase$ReturnTermsBaseBuilder`

### Methods

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
- `NumberRangeBuilder getOrCreateBoundedCorrelation()`
- `PriceBuilder getOrCreateCorrelationStrikePrice()`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `CorrelationReturnTermsBuilder prune()`

