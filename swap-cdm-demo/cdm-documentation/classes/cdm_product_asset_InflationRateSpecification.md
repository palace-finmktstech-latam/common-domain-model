# InflationRateSpecification

**Full Name:** `cdm.product.asset.InflationRateSpecification`

**Package:** `cdm.product.asset`

## Type: Interface

### Implemented Interfaces

- `cdm.product.asset.FloatingRateSpecification`

### Methods

#### Builder Methods

- `InflationRateSpecification build()`

#### Getter Methods

- `Class getType()`
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

- `void process(RosettaPath arg0, Processor arg1)`
- `InflationRateSpecificationBuilder toBuilder()`
- `RosettaMetaData metaData()`

### Annotations

- **RuneDataType**
- **RosettaDataType**

