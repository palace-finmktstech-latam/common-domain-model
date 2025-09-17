# ReturnTermsBuilderImpl

**Full Name:** `cdm.product.template.ReturnTerms$ReturnTermsBuilderImpl`

**Package:** `cdm.product.template`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.product.template.ReturnTerms$ReturnTermsBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| priceReturnTerms | `PriceReturnTermsBuilder` |  |
| dividendReturnTerms | `DividendReturnTermsBuilder` |  |
| varianceReturnTerms | `VarianceReturnTermsBuilder` |  |
| volatilityReturnTerms | `VolatilityReturnTermsBuilder` |  |
| correlationReturnTerms | `CorrelationReturnTermsBuilder` |  |

### Methods

#### Builder Methods

- `ReturnTerms build()`

#### Setter Methods

- `ReturnTermsBuilder setPriceReturnTerms(PriceReturnTerms arg0)`
- `ReturnTermsBuilder setVarianceReturnTerms(VarianceReturnTerms arg0)`
- `ReturnTermsBuilder setDividendReturnTerms(DividendReturnTerms arg0)`
- `ReturnTermsBuilder setVolatilityReturnTerms(VolatilityReturnTerms arg0)`
- `ReturnTermsBuilder setCorrelationReturnTerms(CorrelationReturnTerms arg0)`

#### Getter Methods

- `PriceReturnTermsBuilder getOrCreatePriceReturnTerms()`
- `VarianceReturnTermsBuilder getOrCreateVarianceReturnTerms()`
- `CorrelationReturnTermsBuilder getOrCreateCorrelationReturnTerms()`
- `VolatilityReturnTermsBuilder getOrCreateVolatilityReturnTerms()`
- `DividendReturnTermsBuilder getOrCreateDividendReturnTerms()`
- `PriceReturnTermsBuilder getPriceReturnTerms()`
- `VolatilityReturnTermsBuilder getVolatilityReturnTerms()`
- `DividendReturnTermsBuilder getDividendReturnTerms()`
- `CorrelationReturnTermsBuilder getCorrelationReturnTerms()`
- `VarianceReturnTermsBuilder getVarianceReturnTerms()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `ReturnTermsBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `ReturnTermsBuilder prune()`
- `ReturnTermsBuilder toBuilder()`
- `boolean hasData()`

