# InventoryBuilderImpl

**Full Name:** `cdm.event.position.Inventory$InventoryBuilderImpl`

**Package:** `cdm.event.position`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.event.position.Inventory$InventoryBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| inventoryRecord | `java.util.List<cdm.event.position.InventoryRecord$InventoryRecordBuilder>` |  |

### Methods

#### Builder Methods

- `Inventory build()`

#### Setter Methods

- `InventoryBuilder setInventoryRecord(List arg0)`

#### Getter Methods

- `InventoryRecordBuilder getOrCreateInventoryRecord(int arg0)`
- `List getInventoryRecord()`

#### Adder Methods

- `InventoryBuilder addInventoryRecord(List arg0)`
- `InventoryBuilder addInventoryRecord(InventoryRecord arg0, int arg1)`
- `InventoryBuilder addInventoryRecord(InventoryRecord arg0)`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `InventoryBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `InventoryBuilder prune()`
- `InventoryBuilder toBuilder()`
- `boolean hasData()`

