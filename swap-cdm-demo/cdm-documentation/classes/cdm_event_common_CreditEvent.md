# CreditEvent

**Full Name:** `cdm.event.common.CreditEvent`

**Package:** `cdm.event.common`

## Type: Interface

### Implemented Interfaces

- `com.rosetta.model.lib.RosettaModelObject`

### Methods

#### Builder Methods

- `CreditEvent build()`

#### Getter Methods

- `Class getType()`
- `Date getEventDeterminationDate()`
- `BigDecimal getRecoveryPercent()`
- `CreditEventTypeEnum getCreditEventType()`
- `Date getAuctionDate()`
- `Price getFinalPrice()`
- `ReferenceInformation getReferenceInformation()`
- `List getPubliclyAvailableInformation()`

#### Other Methods

- `void process(RosettaPath arg0, Processor arg1)`
- `CreditEventBuilder toBuilder()`
- `RosettaMetaData metaData()`

### Annotations

- **RuneDataType**
- **RosettaDataType**

