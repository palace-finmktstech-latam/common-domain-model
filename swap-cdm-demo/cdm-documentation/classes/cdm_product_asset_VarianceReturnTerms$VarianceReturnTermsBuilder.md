# VarianceReturnTermsBuilder

**Full Name:** `cdm.product.asset.VarianceReturnTerms$VarianceReturnTermsBuilder`

**Package:** `cdm.product.asset`

## Type: Interface

### Implemented Interfaces

- `cdm.product.asset.VarianceReturnTerms`
- `cdm.product.asset.ReturnTermsBase$ReturnTermsBaseBuilder`

### Methods

#### Setter Methods

- `VarianceReturnTermsBuilder setVolatilityStrikePrice(Price arg0)`
- `VarianceReturnTermsBuilder setInitialLevel(BigDecimal arg0)`
- `VarianceReturnTermsBuilder setMeanAdjustment(Boolean arg0)`
- `VarianceReturnTermsBuilder setVolatilityCapFloor(VolatilityCapFloor arg0)`
- `VarianceReturnTermsBuilder setVegaNotionalAmount(NonNegativeQuantitySchedule arg0)`
- `VarianceReturnTermsBuilder setValuationTerms(ValuationTerms arg0)`
- `VarianceReturnTermsBuilder setAnnualizationFactor(Integer arg0)`
- `VarianceReturnTermsBuilder setExpectedN(Integer arg0)`
- `VarianceReturnTermsBuilder setDividendApplicability(DividendApplicability arg0)`
- `VarianceReturnTermsBuilder setVarianceStrikePrice(Price arg0)`
- `VarianceReturnTermsBuilder setInitialLevelSource(DeterminationMethodEnum arg0)`
- `VarianceReturnTermsBuilder setVarianceCapFloor(VarianceCapFloor arg0)`
- `VarianceReturnTermsBuilder setPerformance(String arg0)`
- `VarianceReturnTermsBuilder setSharePriceDividendAdjustment(Boolean arg0)`
- `VarianceReturnTermsBuilder setEquityUnderlierProvisions(EquityUnderlierProvisions arg0)`
- `VarianceReturnTermsBuilder setExchangeTradedContractNearestValue(Observable arg0)`
- `VarianceReturnTermsBuilder setExchangeTradedContractNearest(ReferenceWithMetaObservable arg0)`

#### Getter Methods

- `VolatilityCapFloorBuilder getVolatilityCapFloor()`
- `PriceBuilder getVolatilityStrikePrice()`
- `PriceBuilder getVarianceStrikePrice()`
- `VarianceCapFloorBuilder getVarianceCapFloor()`
- `NonNegativeQuantityScheduleBuilder getVegaNotionalAmount()`
- `ReferenceWithMetaObservableBuilder getExchangeTradedContractNearest()`
- `PriceBuilder getOrCreateVolatilityStrikePrice()`
- `PriceBuilder getOrCreateVarianceStrikePrice()`
- `NonNegativeQuantityScheduleBuilder getOrCreateVegaNotionalAmount()`
- `VarianceCapFloorBuilder getOrCreateVarianceCapFloor()`
- `ReferenceWithMetaObservableBuilder getOrCreateExchangeTradedContractNearest()`
- `VolatilityCapFloorBuilder getOrCreateVolatilityCapFloor()`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `VarianceReturnTermsBuilder prune()`

