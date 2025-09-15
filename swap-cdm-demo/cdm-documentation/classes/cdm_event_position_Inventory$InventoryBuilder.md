# InventoryBuilder

**Full Name:** `cdm.event.position.Inventory$InventoryBuilder`

**Package:** `cdm.event.position`

## Type: Interface

### Implemented Interfaces

- `cdm.event.position.Inventory`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`

### Methods

#### Setter Methods

- `InventoryBuilder setInventoryRecord(List arg0)`

#### Getter Methods

- `List getInventoryRecord()`
- `InventoryRecordBuilder getOrCreateInventoryRecord(int arg0)`

#### Adder Methods

- `InventoryBuilder addInventoryRecord(InventoryRecord arg0, int arg1)`
- `InventoryBuilder addInventoryRecord(List arg0)`
- `InventoryBuilder addInventoryRecord(InventoryRecord arg0)`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `InventoryBuilder prune()`

