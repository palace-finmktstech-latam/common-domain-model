# CounterpartyPosition

**Full Name:** `cdm.event.position.CounterpartyPosition`

**Package:** `cdm.event.position`

## Type: Interface

### Implemented Interfaces

- `cdm.event.position.ContractBase`

### Methods

#### Builder Methods

- `CounterpartyPosition build()`

#### Getter Methods

- `Class getType()`
- `List getPartyRole()`
- `List getTradeReference()`
- `TradableProduct getPositionBase()`
- `LocalDateTime getOpenDateTime()`
- `List getPositionIdentifier()`
- `List getParty()`

#### Other Methods

- `void process(RosettaPath arg0, Processor arg1)`
- `CounterpartyPositionBuilder toBuilder()`
- `RosettaMetaData metaData()`

### Annotations

- **RuneDataType**
- **RosettaDataType**

