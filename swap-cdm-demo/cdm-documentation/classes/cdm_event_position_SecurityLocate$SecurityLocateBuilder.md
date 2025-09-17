# SecurityLocateBuilder

**Full Name:** `cdm.event.position.SecurityLocate$SecurityLocateBuilder`

**Package:** `cdm.event.position`

## Type: Interface

### Implemented Interfaces

- `cdm.event.position.SecurityLocate`
- `cdm.event.position.AvailableInventory$AvailableInventoryBuilder`

### Methods

#### Setter Methods

- `SecurityLocateBuilder setAvailableInventoryRecord(List arg0)`
- `SecurityLocateBuilder setMessageInformation(MessageInformation arg0)`
- `SecurityLocateBuilder setAvailableInventoryType(AvailableInventoryTypeEnum arg0)`
- `SecurityLocateBuilder setParty(List arg0)`
- `SecurityLocateBuilder setPartyRole(List arg0)`

#### Adder Methods

- `SecurityLocateBuilder addPartyRole(List arg0)`
- `SecurityLocateBuilder addPartyRole(PartyRole arg0, int arg1)`
- `SecurityLocateBuilder addPartyRole(PartyRole arg0)`
- `SecurityLocateBuilder addParty(Party arg0)`
- `SecurityLocateBuilder addParty(List arg0)`
- `SecurityLocateBuilder addParty(Party arg0, int arg1)`
- `SecurityLocateBuilder addAvailableInventoryRecord(AvailableInventoryRecord arg0, int arg1)`
- `SecurityLocateBuilder addAvailableInventoryRecord(AvailableInventoryRecord arg0)`
- `SecurityLocateBuilder addAvailableInventoryRecord(List arg0)`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `SecurityLocateBuilder prune()`

