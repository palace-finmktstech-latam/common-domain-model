# FxLinkedNotionalSchedule

**Full Name:** `cdm.product.common.schedule.FxLinkedNotionalSchedule`

**Package:** `cdm.product.common.schedule`

## Type: Interface

### Implemented Interfaces

- `com.rosetta.model.lib.RosettaModelObject`

### Methods

#### Builder Methods

- `FxLinkedNotionalSchedule build()`

#### Getter Methods

- `Class getType()`
- `FxSpotRateSource getFxSpotRateSource()`
- `BusinessCenterTime getFixingTime()`
- `FieldWithMetaString getVaryingNotionalCurrency()`
- `RelativeDateOffset getVaryingNotionalInterimExchangePaymentDates()`
- `RelativeDateOffset getVaryingNotionalFixingDates()`

#### Other Methods

- `void process(RosettaPath arg0, Processor arg1)`
- `FxLinkedNotionalScheduleBuilder toBuilder()`
- `RosettaMetaData metaData()`

### Annotations

- **RuneDataType**
- **RosettaDataType**

