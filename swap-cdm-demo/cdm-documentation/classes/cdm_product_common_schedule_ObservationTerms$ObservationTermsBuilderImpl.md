# ObservationTermsBuilderImpl

**Full Name:** `cdm.product.common.schedule.ObservationTerms$ObservationTermsBuilderImpl`

**Package:** `cdm.product.common.schedule`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.product.common.schedule.ObservationTerms$ObservationTermsBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| observationTime | `BusinessCenterTimeBuilder` |  |
| observationTimeType | `TimeTypeEnum` |  |
| informationSource | `FxSpotRateSourceBuilder` |  |
| precision | `RoundingBuilder` |  |
| calculationPeriodDates | `CalculationPeriodDatesBuilder` |  |
| observationDates | `ObservationDatesBuilder` |  |
| numberOfObservationDates | `Integer` |  |

### Methods

#### Builder Methods

- `ObservationTerms build()`

#### Setter Methods

- `ObservationTermsBuilder setPrecision(Rounding arg0)`
- `ObservationTermsBuilder setObservationTime(BusinessCenterTime arg0)`
- `ObservationTermsBuilder setInformationSource(FxSpotRateSource arg0)`
- `ObservationTermsBuilder setCalculationPeriodDates(CalculationPeriodDates arg0)`
- `ObservationTermsBuilder setObservationTimeType(TimeTypeEnum arg0)`
- `ObservationTermsBuilder setObservationDates(ObservationDates arg0)`
- `ObservationTermsBuilder setNumberOfObservationDates(Integer arg0)`

#### Getter Methods

- `BusinessCenterTimeBuilder getOrCreateObservationTime()`
- `RoundingBuilder getOrCreatePrecision()`
- `BusinessCenterTimeBuilder getObservationTime()`
- `TimeTypeEnum getObservationTimeType()`
- `FxSpotRateSourceBuilder getInformationSource()`
- `Integer getNumberOfObservationDates()`
- `FxSpotRateSourceBuilder getOrCreateInformationSource()`
- `CalculationPeriodDatesBuilder getOrCreateCalculationPeriodDates()`
- `ObservationDatesBuilder getOrCreateObservationDates()`
- `RoundingBuilder getPrecision()`
- `CalculationPeriodDatesBuilder getCalculationPeriodDates()`
- `ObservationDatesBuilder getObservationDates()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `ObservationTermsBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `boolean hasData()`
- `ObservationTermsBuilder toBuilder()`
- `ObservationTermsBuilder prune()`

