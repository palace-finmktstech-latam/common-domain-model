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
- `RelativeDateOffset getVaryingNotionalFixingDates()`
- `FxSpotRateSource getFxSpotRateSource()`
- `BusinessCenterTime getFixingTime()`
- `RelativeDateOffset getVaryingNotionalInterimExchangePaymentDates()`
- `FieldWithMetaString getVaryingNotionalCurrency()`

#### Other Methods

- `void process(RosettaPath arg0, Processor arg1)`
- `FxLinkedNotionalScheduleBuilder toBuilder()`
- `RosettaMetaData metaData()`

### Annotations

- **RuneDataType**
- **RosettaDataType**

