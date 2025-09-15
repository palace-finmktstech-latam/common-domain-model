# InflationRateSpecificationBuilderImpl

**Full Name:** `cdm.product.asset.InflationRateSpecification$InflationRateSpecificationBuilderImpl`

**Package:** `cdm.product.asset`

## Type: Concrete Class

### Inheritance

**Extends:**
- `cdm.product.asset.FloatingRateSpecification$FloatingRateSpecificationBuilderImpl`

### Implemented Interfaces

- `cdm.product.asset.InflationRateSpecification$InflationRateSpecificationBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| inflationLag | `OffsetBuilder` |  |
| indexSource | `FieldWithMetaStringBuilder` |  |
| mainPublication | `FieldWithMetaStringBuilder` |  |
| interpolationMethod | `FieldWithMetaInterpolationMethodEnumBuilder` |  |
| initialIndexLevel | `BigDecimal` |  |
| fallbackBondApplicable | `Boolean` |  |
| calculationMethod | `InflationCalculationMethodEnum` |  |
| calculationStyle | `InflationCalculationStyleEnum` |  |
| finalPrincipalExchangeCalculation | `FinalPrincipalExchangeCalculationEnum` |  |

### Methods

#### Builder Methods

- `InflationRateSpecification build()`

#### Setter Methods

- `InflationRateSpecificationBuilder setAveragingMethod(AveragingWeightingMethodEnum arg0)`
- `InflationRateSpecificationBuilder setCalculationMethod(InflationCalculationMethodEnum arg0)`
- `InflationRateSpecificationBuilder setSpreadSchedule(SpreadSchedule arg0)`
- `InflationRateSpecificationBuilder setRateTreatment(RateTreatmentEnum arg0)`
- `InflationRateSpecificationBuilder setFloorRateSchedule(StrikeSchedule arg0)`
- `InflationRateSpecificationBuilder setCapRateSchedule(StrikeSchedule arg0)`
- `InflationRateSpecificationBuilder setIndexSourceValue(String arg0)`
- `InflationRateSpecificationBuilder setMainPublication(FieldWithMetaString arg0)`
- `InflationRateSpecificationBuilder setMainPublicationValue(String arg0)`
- `InflationRateSpecificationBuilder setIndexSource(FieldWithMetaString arg0)`
- `InflationRateSpecificationBuilder setFallbackRate(FallbackRateParameters arg0)`
- `InflationRateSpecificationBuilder setRateOptionValue(InterestRateIndex arg0)`
- `InflationRateSpecificationBuilder setInitialRate(Price arg0)`
- `InflationRateSpecificationBuilder setRateOption(ReferenceWithMetaInterestRateIndex arg0)`
- `InflationRateSpecificationBuilder setCalculationParameters(FloatingRateCalculationParameters arg0)`
- `InflationRateSpecificationBuilder setFinalRateRounding(Rounding arg0)`
- `InflationRateSpecificationBuilder setInflationLag(Offset arg0)`
- `InflationRateSpecificationBuilder setFallbackBondApplicable(Boolean arg0)`
- `InflationRateSpecificationBuilder setInitialIndexLevel(BigDecimal arg0)`
- `InflationRateSpecificationBuilder setInterpolationMethod(FieldWithMetaInterpolationMethodEnum arg0)`
- `InflationRateSpecificationBuilder setCalculationStyle(InflationCalculationStyleEnum arg0)`
- `InflationRateSpecificationBuilder setFloatingRateMultiplierSchedule(RateSchedule arg0)`
- `InflationRateSpecificationBuilder setNegativeInterestRateTreatment(NegativeInterestRateTreatmentEnum arg0)`
- `InflationRateSpecificationBuilder setInterpolationMethodValue(InterpolationMethodEnum arg0)`
- `InflationRateSpecificationBuilder setFinalPrincipalExchangeCalculation(FinalPrincipalExchangeCalculationEnum arg0)`
- `InflationRateSpecificationBuilder setMeta(MetaFields arg0)`

#### Getter Methods

- `InflationCalculationMethodEnum getCalculationMethod()`
- `FieldWithMetaStringBuilder getOrCreateMainPublication()`
- `Boolean getFallbackBondApplicable()`
- `FieldWithMetaStringBuilder getMainPublication()`
- `OffsetBuilder getOrCreateInflationLag()`
- `FieldWithMetaInterpolationMethodEnumBuilder getInterpolationMethod()`
- `FieldWithMetaStringBuilder getIndexSource()`
- `InflationCalculationStyleEnum getCalculationStyle()`
- `BigDecimal getInitialIndexLevel()`
- `OffsetBuilder getInflationLag()`
- `FieldWithMetaStringBuilder getOrCreateIndexSource()`
- `FinalPrincipalExchangeCalculationEnum getFinalPrincipalExchangeCalculation()`
- `FieldWithMetaInterpolationMethodEnumBuilder getOrCreateInterpolationMethod()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `InflationRateSpecificationBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `boolean hasData()`
- `InflationRateSpecificationBuilder toBuilder()`
- `InflationRateSpecificationBuilder prune()`

