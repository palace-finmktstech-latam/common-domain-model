# InventoryRecordBuilder

**Full Name:** `cdm.event.position.InventoryRecord$InventoryRecordBuilder`

**Package:** `cdm.event.position`

## Type: Interface

### Implemented Interfaces

- `cdm.event.position.InventoryRecord`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`

### Methods

#### Setter Methods

- `InventoryRecordBuilder setSecurity(Security arg0)`
- `InventoryRecordBuilder setIdentifer(AssignedIdentifier arg0)`

#### Getter Methods

- `SecurityBuilder getSecurity()`
- `AssignedIdentifierBuilder getOrCreateIdentifer()`
- `AssignedIdentifierBuilder getIdentifer()`
- `SecurityBuilder getOrCreateSecurity()`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `InventoryRecordBuilder prune()`

