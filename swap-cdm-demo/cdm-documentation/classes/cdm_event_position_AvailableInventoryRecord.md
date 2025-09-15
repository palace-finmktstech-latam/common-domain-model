# AvailableInventoryRecord

**Full Name:** `cdm.event.position.AvailableInventoryRecord`

**Package:** `cdm.event.position`

## Type: Interface

### Implemented Interfaces

- `cdm.event.position.InventoryRecord`

### Methods

#### Builder Methods

- `AvailableInventoryRecord build()`

#### Getter Methods

- `Class getType()`
- `Quantity getQuantity()`
- `Price getInterestRate()`
- `ZonedDateTime getExpirationDateTime()`
- `List getPartyRole()`
- `List getCollateral()`

#### Other Methods

- `void process(RosettaPath arg0, Processor arg1)`
- `AvailableInventoryRecordBuilder toBuilder()`
- `RosettaMetaData metaData()`

### Annotations

- **RuneDataType**
- **RosettaDataType**

