# ObservationTerms

**Full Name:** `cdm.product.common.schedule.ObservationTerms`

**Package:** `cdm.product.common.schedule`

## Type: Interface

### Implemented Interfaces

- `com.rosetta.model.lib.RosettaModelObject`

### Methods

#### Builder Methods

- `ObservationTerms build()`

#### Getter Methods

- `Class getType()`
- `BusinessCenterTime getObservationTime()`
- `TimeTypeEnum getObservationTimeType()`
- `FxSpotRateSource getInformationSource()`
- `Integer getNumberOfObservationDates()`
- `Rounding getPrecision()`
- `CalculationPeriodDates getCalculationPeriodDates()`
- `ObservationDates getObservationDates()`

#### Other Methods

- `void process(RosettaPath arg0, Processor arg1)`
- `ObservationTermsBuilder toBuilder()`
- `RosettaMetaData metaData()`

### Annotations

- **RuneDataType**
- **RosettaDataType**

