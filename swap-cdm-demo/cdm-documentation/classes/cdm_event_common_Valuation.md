# Valuation

**Full Name:** `cdm.event.common.Valuation`

**Package:** `cdm.event.common`

## Type: Interface

### Implemented Interfaces

- `com.rosetta.model.lib.RosettaModelObject`

### Methods

#### Builder Methods

- `Valuation build()`

#### Getter Methods

- `ValuationTypeEnum getMethod()`
- `Class getType()`
- `ZonedDateTime getTimestamp()`
- `PriceTimingEnum getValuationTiming()`
- `Price getPriceComponent()`
- `ValuationSourceEnum getSource()`
- `BigDecimal getDelta()`
- `Money getAmount()`

#### Other Methods

- `void process(RosettaPath arg0, Processor arg1)`
- `ValuationBuilder toBuilder()`
- `RosettaMetaData metaData()`

### Annotations

- **RuneDataType**
- **RosettaDataType**

