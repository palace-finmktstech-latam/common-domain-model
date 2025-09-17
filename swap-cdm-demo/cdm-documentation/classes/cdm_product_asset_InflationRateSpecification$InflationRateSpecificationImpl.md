# InflationRateSpecificationImpl

**Full Name:** `cdm.product.asset.InflationRateSpecification$InflationRateSpecificationImpl`

**Package:** `cdm.product.asset`

## Type: Concrete Class

### Inheritance

**Extends:**
- `cdm.product.asset.FloatingRateSpecification$FloatingRateSpecificationImpl`

### Implemented Interfaces

- `cdm.product.asset.InflationRateSpecification`

### Methods

#### Builder Methods

- `InflationRateSpecification build()`

#### Setter Methods

- `void setBuilderFields(InflationRateSpecificationBuilder arg0)`

#### Getter Methods

- `InflationCalculationMethodEnum getCalculationMethod()`
- `FieldWithMetaString getMainPublication()`
- `Offset getInflationLag()`
- `FieldWithMetaString getIndexSource()`
- `BigDecimal getInitialIndexLevel()`
- `FieldWithMetaInterpolationMethodEnum getInterpolationMethod()`
- `InflationCalculationStyleEnum getCalculationStyle()`
- `Boolean getFallbackBondApplicable()`
- `FinalPrincipalExchangeCalculationEnum getFinalPrincipalExchangeCalculation()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `InflationRateSpecificationBuilder toBuilder()`

