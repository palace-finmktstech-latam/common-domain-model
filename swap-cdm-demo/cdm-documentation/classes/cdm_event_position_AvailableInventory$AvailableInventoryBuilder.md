# AvailableInventoryBuilder

**Full Name:** `cdm.event.position.AvailableInventory$AvailableInventoryBuilder`

**Package:** `cdm.event.position`

## Type: Interface

### Implemented Interfaces

- `cdm.event.position.AvailableInventory`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`

### Methods

#### Setter Methods

- `AvailableInventoryBuilder setAvailableInventoryRecord(List arg0)`
- `AvailableInventoryBuilder setMessageInformation(MessageInformation arg0)`
- `AvailableInventoryBuilder setAvailableInventoryType(AvailableInventoryTypeEnum arg0)`
- `AvailableInventoryBuilder setParty(List arg0)`
- `AvailableInventoryBuilder setPartyRole(List arg0)`

#### Getter Methods

- `List getPartyRole()`
- `List getParty()`
- `List getAvailableInventoryRecord()`
- `AvailableInventoryRecordBuilder getOrCreateAvailableInventoryRecord(int arg0)`
- `PartyBuilder getOrCreateParty(int arg0)`
- `MessageInformationBuilder getMessageInformation()`
- `MessageInformationBuilder getOrCreateMessageInformation()`
- `PartyRoleBuilder getOrCreatePartyRole(int arg0)`

#### Adder Methods

- `AvailableInventoryBuilder addPartyRole(PartyRole arg0)`
- `AvailableInventoryBuilder addPartyRole(List arg0)`
- `AvailableInventoryBuilder addPartyRole(PartyRole arg0, int arg1)`
- `AvailableInventoryBuilder addParty(Party arg0, int arg1)`
- `AvailableInventoryBuilder addParty(List arg0)`
- `AvailableInventoryBuilder addParty(Party arg0)`
- `AvailableInventoryBuilder addAvailableInventoryRecord(AvailableInventoryRecord arg0)`
- `AvailableInventoryBuilder addAvailableInventoryRecord(List arg0)`
- `AvailableInventoryBuilder addAvailableInventoryRecord(AvailableInventoryRecord arg0, int arg1)`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `AvailableInventoryBuilder prune()`

