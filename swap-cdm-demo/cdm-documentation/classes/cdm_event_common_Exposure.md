# Exposure

**Full Name:** `cdm.event.common.Exposure`

**Package:** `cdm.event.common`

## Type: Interface

### Implemented Interfaces

- `com.rosetta.model.lib.RosettaModelObject`

### Methods

#### Builder Methods

- `Exposure build()`

#### Getter Methods

- `Class getType()`
- `ReferenceWithMetaPortfolioState getTradePortfolio()`
- `ZonedDateTime getValuationDateTime()`
- `ZonedDateTime getCalculationDateTime()`
- `Money getAggregateValue()`

#### Other Methods

- `void process(RosettaPath arg0, Processor arg1)`
- `ExposureBuilder toBuilder()`
- `RosettaMetaData metaData()`

### Annotations

- **RuneDataType**
- **RosettaDataType**

