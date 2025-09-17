# ObservationTermsBuilder

**Full Name:** `cdm.product.common.schedule.ObservationTerms$ObservationTermsBuilder`

**Package:** `cdm.product.common.schedule`

## Type: Interface

### Implemented Interfaces

- `cdm.product.common.schedule.ObservationTerms`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`

### Methods

#### Setter Methods

- `ObservationTermsBuilder setObservationTime(BusinessCenterTime arg0)`
- `ObservationTermsBuilder setInformationSource(FxSpotRateSource arg0)`
- `ObservationTermsBuilder setCalculationPeriodDates(CalculationPeriodDates arg0)`
- `ObservationTermsBuilder setObservationDates(ObservationDates arg0)`
- `ObservationTermsBuilder setObservationTimeType(TimeTypeEnum arg0)`
- `ObservationTermsBuilder setNumberOfObservationDates(Integer arg0)`
- `ObservationTermsBuilder setPrecision(Rounding arg0)`

#### Getter Methods

- `RoundingBuilder getPrecision()`
- `FxSpotRateSourceBuilder getInformationSource()`
- `CalculationPeriodDatesBuilder getOrCreateCalculationPeriodDates()`
- `ObservationDatesBuilder getOrCreateObservationDates()`
- `RoundingBuilder getOrCreatePrecision()`
- `BusinessCenterTimeBuilder getObservationTime()`
- `ObservationDatesBuilder getObservationDates()`
- `CalculationPeriodDatesBuilder getCalculationPeriodDates()`
- `BusinessCenterTimeBuilder getOrCreateObservationTime()`
- `FxSpotRateSourceBuilder getOrCreateInformationSource()`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `ObservationTermsBuilder prune()`

