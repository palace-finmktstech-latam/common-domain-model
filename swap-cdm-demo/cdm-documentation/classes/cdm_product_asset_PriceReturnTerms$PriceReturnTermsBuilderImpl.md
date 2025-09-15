# PriceReturnTermsBuilderImpl

**Full Name:** `cdm.product.asset.PriceReturnTerms$PriceReturnTermsBuilderImpl`

**Package:** `cdm.product.asset`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.product.asset.PriceReturnTerms$PriceReturnTermsBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| returnType | `ReturnTypeEnum` |  |
| conversionFactor | `BigDecimal` |  |
| performance | `String` |  |

### Methods

#### Builder Methods

- `PriceReturnTerms build()`

#### Setter Methods

- `PriceReturnTermsBuilder setReturnType(ReturnTypeEnum arg0)`
- `PriceReturnTermsBuilder setPerformance(String arg0)`
- `PriceReturnTermsBuilder setConversionFactor(BigDecimal arg0)`

#### Getter Methods

- `ReturnTypeEnum getReturnType()`
- `String getPerformance()`
- `BigDecimal getConversionFactor()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `PriceReturnTermsBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `boolean hasData()`
- `PriceReturnTermsBuilder toBuilder()`
- `PriceReturnTermsBuilder prune()`

