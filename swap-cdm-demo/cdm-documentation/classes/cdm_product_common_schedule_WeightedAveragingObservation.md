# WeightedAveragingObservation

**Full Name:** `cdm.product.common.schedule.WeightedAveragingObservation`

**Package:** `cdm.product.common.schedule`

## Type: Interface

### Implemented Interfaces

- `com.rosetta.model.lib.RosettaModelObject`

### Methods

#### Builder Methods

- `WeightedAveragingObservation build()`

#### Getter Methods

- `Class getType()`
- `BigDecimal getWeight()`
- `ZonedDateTime getDateTime()`
- `Integer getObservationNumber()`

#### Other Methods

- `void process(RosettaPath arg0, Processor arg1)`
- `WeightedAveragingObservationBuilder toBuilder()`
- `RosettaMetaData metaData()`

### Annotations

- **RuneDataType**
- **RosettaDataType**

