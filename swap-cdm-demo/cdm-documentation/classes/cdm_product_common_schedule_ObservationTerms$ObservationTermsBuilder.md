# ObservationTermsBuilder

**Full Name:** `cdm.product.common.schedule.ObservationTerms$ObservationTermsBuilder`

**Package:** `cdm.product.common.schedule`

## Type: Interface

### Implemented Interfaces

- `cdm.product.common.schedule.ObservationTerms`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`

### Methods

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
- `FxSpotRateSourceBuilder getInformationSource()`
- `FxSpotRateSourceBuilder getOrCreateInformationSource()`
- `CalculationPeriodDatesBuilder getOrCreateCalculationPeriodDates()`
- `ObservationDatesBuilder getOrCreateObservationDates()`
- `RoundingBuilder getPrecision()`
- `CalculationPeriodDatesBuilder getCalculationPeriodDates()`
- `ObservationDatesBuilder getObservationDates()`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `ObservationTermsBuilder prune()`

