# AvailableInventoryBuilderImpl

**Full Name:** `cdm.event.position.AvailableInventory$AvailableInventoryBuilderImpl`

**Package:** `cdm.event.position`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.event.position.AvailableInventory$AvailableInventoryBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| availableInventoryType | `AvailableInventoryTypeEnum` |  |
| messageInformation | `MessageInformationBuilder` |  |
| party | `java.util.List<cdm.base.staticdata.party.Party$PartyBuilder>` |  |
| partyRole | `java.util.List<cdm.base.staticdata.party.PartyRole$PartyRoleBuilder>` |  |
| availableInventoryRecord | `java.util.List<cdm.event.position.AvailableInventoryRecord$AvailableInventoryRecordBuilder>` |  |

### Methods

#### Builder Methods

- `AvailableInventory build()`

#### Setter Methods

- `AvailableInventoryBuilder setPartyRole(List arg0)`
- `AvailableInventoryBuilder setMessageInformation(MessageInformation arg0)`
- `AvailableInventoryBuilder setAvailableInventoryRecord(List arg0)`
- `AvailableInventoryBuilder setAvailableInventoryType(AvailableInventoryTypeEnum arg0)`
- `AvailableInventoryBuilder setParty(List arg0)`

#### Getter Methods

- `PartyRoleBuilder getOrCreatePartyRole(int arg0)`
- `AvailableInventoryRecordBuilder getOrCreateAvailableInventoryRecord(int arg0)`
- `List getAvailableInventoryRecord()`
- `AvailableInventoryTypeEnum getAvailableInventoryType()`
- `MessageInformationBuilder getMessageInformation()`
- `List getPartyRole()`
- `List getParty()`
- `MessageInformationBuilder getOrCreateMessageInformation()`
- `PartyBuilder getOrCreateParty(int arg0)`

#### Adder Methods

- `AvailableInventoryBuilder addParty(List arg0)`
- `AvailableInventoryBuilder addParty(Party arg0)`
- `AvailableInventoryBuilder addParty(Party arg0, int arg1)`
- `AvailableInventoryBuilder addPartyRole(List arg0)`
- `AvailableInventoryBuilder addPartyRole(PartyRole arg0, int arg1)`
- `AvailableInventoryBuilder addPartyRole(PartyRole arg0)`
- `AvailableInventoryBuilder addAvailableInventoryRecord(AvailableInventoryRecord arg0)`
- `AvailableInventoryBuilder addAvailableInventoryRecord(List arg0)`
- `AvailableInventoryBuilder addAvailableInventoryRecord(AvailableInventoryRecord arg0, int arg1)`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `AvailableInventoryBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `boolean hasData()`
- `AvailableInventoryBuilder toBuilder()`
- `AvailableInventoryBuilder prune()`

