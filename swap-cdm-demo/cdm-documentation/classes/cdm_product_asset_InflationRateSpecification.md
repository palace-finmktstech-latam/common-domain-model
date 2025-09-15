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
- `Boolean getFallbackBondApplicable()`
- `FieldWithMetaString getMainPublication()`
- `FieldWithMetaInterpolationMethodEnum getInterpolationMethod()`
- `FieldWithMetaString getIndexSource()`
- `InflationCalculationStyleEnum getCalculationStyle()`
- `BigDecimal getInitialIndexLevel()`
- `Offset getInflationLag()`
- `FinalPrincipalExchangeCalculationEnum getFinalPrincipalExchangeCalculation()`

#### Other Methods

- `void process(RosettaPath arg0, Processor arg1)`
- `InflationRateSpecificationBuilder toBuilder()`
- `RosettaMetaData metaData()`

### Annotations

- **RuneDataType**
- **RosettaDataType**

