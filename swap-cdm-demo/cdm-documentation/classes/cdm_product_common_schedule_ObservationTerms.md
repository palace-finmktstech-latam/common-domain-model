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
- `Rounding getPrecision()`
- `FxSpotRateSource getInformationSource()`
- `BusinessCenterTime getObservationTime()`
- `TimeTypeEnum getObservationTimeType()`
- `ObservationDates getObservationDates()`
- `Integer getNumberOfObservationDates()`
- `CalculationPeriodDates getCalculationPeriodDates()`

#### Other Methods

- `void process(RosettaPath arg0, Processor arg1)`
- `ObservationTermsBuilder toBuilder()`
- `RosettaMetaData metaData()`

### Annotations

- **RuneDataType**
- **RosettaDataType**

