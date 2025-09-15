# InventoryRecordBuilderImpl

**Full Name:** `cdm.event.position.InventoryRecord$InventoryRecordBuilderImpl`

**Package:** `cdm.event.position`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.event.position.InventoryRecord$InventoryRecordBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| identifer | `AssignedIdentifierBuilder` |  |
| security | `SecurityBuilder` |  |

### Methods

#### Builder Methods

- `InventoryRecord build()`

#### Setter Methods

- `InventoryRecordBuilder setSecurity(Security arg0)`
- `InventoryRecordBuilder setIdentifer(AssignedIdentifier arg0)`

#### Getter Methods

- `SecurityBuilder getSecurity()`
- `AssignedIdentifierBuilder getOrCreateIdentifer()`
- `AssignedIdentifierBuilder getIdentifer()`
- `SecurityBuilder getOrCreateSecurity()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `InventoryRecordBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `boolean hasData()`
- `InventoryRecordBuilder toBuilder()`
- `InventoryRecordBuilder prune()`

