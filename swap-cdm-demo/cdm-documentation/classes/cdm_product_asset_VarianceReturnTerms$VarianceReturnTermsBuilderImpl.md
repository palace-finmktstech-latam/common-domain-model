# VarianceReturnTermsBuilderImpl

**Full Name:** `cdm.product.asset.VarianceReturnTerms$VarianceReturnTermsBuilderImpl`

**Package:** `cdm.product.asset`

## Type: Concrete Class

### Inheritance

**Extends:**
- `cdm.product.asset.ReturnTermsBase$ReturnTermsBaseBuilderImpl`

### Implemented Interfaces

- `cdm.product.asset.VarianceReturnTerms$VarianceReturnTermsBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| varianceStrikePrice | `PriceBuilder` |  |
| volatilityStrikePrice | `PriceBuilder` |  |
| varianceCapFloor | `VarianceCapFloorBuilder` |  |
| volatilityCapFloor | `VolatilityCapFloorBuilder` |  |
| vegaNotionalAmount | `NonNegativeQuantityScheduleBuilder` |  |
| exchangeTradedContractNearest | `ReferenceWithMetaObservableBuilder` |  |

### Methods

#### Builder Methods

- `VarianceReturnTerms build()`

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

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `VarianceReturnTermsBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `VarianceReturnTermsBuilder prune()`
- `VarianceReturnTermsBuilder toBuilder()`
- `boolean hasData()`

