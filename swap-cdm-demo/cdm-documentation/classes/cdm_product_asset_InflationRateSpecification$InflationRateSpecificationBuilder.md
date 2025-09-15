# InflationRateSpecificationBuilder

**Full Name:** `cdm.product.asset.InflationRateSpecification$InflationRateSpecificationBuilder`

**Package:** `cdm.product.asset`

## Type: Interface

### Implemented Interfaces

- `cdm.product.asset.InflationRateSpecification`
- `cdm.product.asset.FloatingRateSpecification$FloatingRateSpecificationBuilder`

### Methods

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

- `FieldWithMetaStringBuilder getOrCreateMainPublication()`
- `FieldWithMetaStringBuilder getMainPublication()`
- `OffsetBuilder getOrCreateInflationLag()`
- `FieldWithMetaInterpolationMethodEnumBuilder getInterpolationMethod()`
- `FieldWithMetaStringBuilder getIndexSource()`
- `OffsetBuilder getInflationLag()`
- `FieldWithMetaStringBuilder getOrCreateIndexSource()`
- `FieldWithMetaInterpolationMethodEnumBuilder getOrCreateInterpolationMethod()`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `InflationRateSpecificationBuilder prune()`

