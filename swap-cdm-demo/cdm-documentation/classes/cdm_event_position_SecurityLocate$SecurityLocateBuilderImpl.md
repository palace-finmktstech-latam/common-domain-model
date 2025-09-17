# SecurityLocateBuilderImpl

**Full Name:** `cdm.event.position.SecurityLocate$SecurityLocateBuilderImpl`

**Package:** `cdm.event.position`

## Type: Concrete Class

### Inheritance

**Extends:**
- `cdm.event.position.AvailableInventory$AvailableInventoryBuilderImpl`

### Implemented Interfaces

- `cdm.event.position.SecurityLocate$SecurityLocateBuilder`

### Methods

#### Builder Methods

- `SecurityLocate build()`

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
- `SecurityLocateBuilder addParty(List arg0)`
- `SecurityLocateBuilder addParty(Party arg0, int arg1)`
- `SecurityLocateBuilder addParty(Party arg0)`
- `SecurityLocateBuilder addAvailableInventoryRecord(AvailableInventoryRecord arg0, int arg1)`
- `SecurityLocateBuilder addAvailableInventoryRecord(List arg0)`
- `SecurityLocateBuilder addAvailableInventoryRecord(AvailableInventoryRecord arg0)`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `SecurityLocateBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `SecurityLocateBuilder prune()`
- `SecurityLocateBuilder toBuilder()`
- `boolean hasData()`

