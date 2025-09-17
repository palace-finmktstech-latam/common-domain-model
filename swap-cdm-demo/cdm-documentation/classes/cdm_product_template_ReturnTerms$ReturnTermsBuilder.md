# ReturnTermsBuilder

**Full Name:** `cdm.product.template.ReturnTerms$ReturnTermsBuilder`

**Package:** `cdm.product.template`

## Type: Interface

### Implemented Interfaces

- `cdm.product.template.ReturnTerms`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`

### Methods

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

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `ReturnTermsBuilder prune()`

