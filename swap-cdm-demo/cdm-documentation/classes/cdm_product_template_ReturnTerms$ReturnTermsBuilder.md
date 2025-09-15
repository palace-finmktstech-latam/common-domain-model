# ReturnTermsBuilder

**Full Name:** `cdm.product.template.ReturnTerms$ReturnTermsBuilder`

**Package:** `cdm.product.template`

## Type: Interface

### Implemented Interfaces

- `cdm.product.template.ReturnTerms`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`

### Methods

#### Setter Methods

- `ReturnTermsBuilder setVarianceReturnTerms(VarianceReturnTerms arg0)`
- `ReturnTermsBuilder setVolatilityReturnTerms(VolatilityReturnTerms arg0)`
- `ReturnTermsBuilder setDividendReturnTerms(DividendReturnTerms arg0)`
- `ReturnTermsBuilder setPriceReturnTerms(PriceReturnTerms arg0)`
- `ReturnTermsBuilder setCorrelationReturnTerms(CorrelationReturnTerms arg0)`

#### Getter Methods

- `CorrelationReturnTermsBuilder getCorrelationReturnTerms()`
- `VarianceReturnTermsBuilder getVarianceReturnTerms()`
- `VolatilityReturnTermsBuilder getVolatilityReturnTerms()`
- `DividendReturnTermsBuilder getDividendReturnTerms()`
- `PriceReturnTermsBuilder getPriceReturnTerms()`
- `DividendReturnTermsBuilder getOrCreateDividendReturnTerms()`
- `VarianceReturnTermsBuilder getOrCreateVarianceReturnTerms()`
- `VolatilityReturnTermsBuilder getOrCreateVolatilityReturnTerms()`
- `CorrelationReturnTermsBuilder getOrCreateCorrelationReturnTerms()`
- `PriceReturnTermsBuilder getOrCreatePriceReturnTerms()`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `ReturnTermsBuilder prune()`

