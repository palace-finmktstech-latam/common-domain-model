# VolatilityReturnTermsBuilderImpl

**Full Name:** `cdm.product.asset.VolatilityReturnTerms$VolatilityReturnTermsBuilderImpl`

**Package:** `cdm.product.asset`

## Type: Concrete Class

### Inheritance

**Extends:**
- `cdm.product.asset.ReturnTermsBase$ReturnTermsBaseBuilderImpl`

### Implemented Interfaces

- `cdm.product.asset.VolatilityReturnTerms$VolatilityReturnTermsBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| volatilityStrikePrice | `PriceBuilder` |  |
| volatilityCapFloor | `VolatilityCapFloorBuilder` |  |
| exchangeTradedContractNearest | `ListedDerivativeBuilder` |  |

### Methods

#### Builder Methods

- `VolatilityReturnTerms build()`

#### Setter Methods

- `VolatilityReturnTermsBuilder setVolatilityStrikePrice(Price arg0)`
- `VolatilityReturnTermsBuilder setInitialLevel(BigDecimal arg0)`
- `VolatilityReturnTermsBuilder setMeanAdjustment(Boolean arg0)`
- `VolatilityReturnTermsBuilder setVolatilityCapFloor(VolatilityCapFloor arg0)`
- `VolatilityReturnTermsBuilder setValuationTerms(ValuationTerms arg0)`
- `VolatilityReturnTermsBuilder setAnnualizationFactor(Integer arg0)`
- `VolatilityReturnTermsBuilder setExpectedN(Integer arg0)`
- `VolatilityReturnTermsBuilder setDividendApplicability(DividendApplicability arg0)`
- `VolatilityReturnTermsBuilder setInitialLevelSource(DeterminationMethodEnum arg0)`
- `VolatilityReturnTermsBuilder setPerformance(String arg0)`
- `VolatilityReturnTermsBuilder setSharePriceDividendAdjustment(Boolean arg0)`
- `VolatilityReturnTermsBuilder setEquityUnderlierProvisions(EquityUnderlierProvisions arg0)`
- `VolatilityReturnTermsBuilder setExchangeTradedContractNearest(ListedDerivative arg0)`

#### Getter Methods

- `VolatilityCapFloorBuilder getVolatilityCapFloor()`
- `PriceBuilder getVolatilityStrikePrice()`
- `ListedDerivativeBuilder getExchangeTradedContractNearest()`
- `PriceBuilder getOrCreateVolatilityStrikePrice()`
- `ListedDerivativeBuilder getOrCreateExchangeTradedContractNearest()`
- `VolatilityCapFloorBuilder getOrCreateVolatilityCapFloor()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `VolatilityReturnTermsBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `VolatilityReturnTermsBuilder prune()`
- `VolatilityReturnTermsBuilder toBuilder()`
- `boolean hasData()`

