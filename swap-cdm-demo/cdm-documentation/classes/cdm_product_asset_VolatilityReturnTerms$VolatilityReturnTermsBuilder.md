# VolatilityReturnTermsBuilder

**Full Name:** `cdm.product.asset.VolatilityReturnTerms$VolatilityReturnTermsBuilder`

**Package:** `cdm.product.asset`

## Type: Interface

### Implemented Interfaces

- `cdm.product.asset.VolatilityReturnTerms`
- `cdm.product.asset.ReturnTermsBase$ReturnTermsBaseBuilder`

### Methods

#### Setter Methods

- `VolatilityReturnTermsBuilder setSharePriceDividendAdjustment(Boolean arg0)`
- `VolatilityReturnTermsBuilder setEquityUnderlierProvisions(EquityUnderlierProvisions arg0)`
- `VolatilityReturnTermsBuilder setExchangeTradedContractNearest(ListedDerivative arg0)`
- `VolatilityReturnTermsBuilder setValuationTerms(ValuationTerms arg0)`
- `VolatilityReturnTermsBuilder setInitialLevel(BigDecimal arg0)`
- `VolatilityReturnTermsBuilder setDividendApplicability(DividendApplicability arg0)`
- `VolatilityReturnTermsBuilder setMeanAdjustment(Boolean arg0)`
- `VolatilityReturnTermsBuilder setExpectedN(Integer arg0)`
- `VolatilityReturnTermsBuilder setInitialLevelSource(DeterminationMethodEnum arg0)`
- `VolatilityReturnTermsBuilder setPerformance(String arg0)`
- `VolatilityReturnTermsBuilder setVolatilityStrikePrice(Price arg0)`
- `VolatilityReturnTermsBuilder setAnnualizationFactor(Integer arg0)`
- `VolatilityReturnTermsBuilder setVolatilityCapFloor(VolatilityCapFloor arg0)`

#### Getter Methods

- `PriceBuilder getOrCreateVolatilityStrikePrice()`
- `VolatilityCapFloorBuilder getOrCreateVolatilityCapFloor()`
- `ListedDerivativeBuilder getOrCreateExchangeTradedContractNearest()`
- `VolatilityCapFloorBuilder getVolatilityCapFloor()`
- `PriceBuilder getVolatilityStrikePrice()`
- `ListedDerivativeBuilder getExchangeTradedContractNearest()`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `VolatilityReturnTermsBuilder prune()`

