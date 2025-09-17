# Package: cdm.base.staticdata.identifier.metafields

## Interfaces

### FieldWithMetaIdentifier
**Implements:** `RosettaModelObject` `FieldWithMeta` `GlobalKey` 

**Key Methods:**
- `getValue()` → `Identifier` [Getter]
- `getType()` → `Class` [Getter]
- `build()` → `FieldWithMetaIdentifier` [Builder]
- `getValueType()` → `Class` [Getter]
- `getMeta()` → `MetaFields` [Getter]

### FieldWithMetaIdentifierBuilder
**Implements:** `FieldWithMetaIdentifier` `RosettaModelObjectBuilder` `FieldWithMeta$FieldWithMetaBuilder` `GlobalKey$GlobalKeyBuilder` 

**Key Methods:**
- `getValue()` → `IdentifierBuilder` [Getter]
- `setValue(Identifier arg0)` → `FieldWithMetaIdentifierBuilder` [Setter]
- `getOrCreateMeta()` → `MetaFieldsBuilder` [Getter]
- `getOrCreateValue()` → `IdentifierBuilder` [Getter]
- `getMeta()` → `MetaFieldsBuilder` [Getter]
- `setMeta(MetaFields arg0)` → `FieldWithMetaIdentifierBuilder` [Setter]

## Concrete Classes

### FieldWithMetaIdentifierBuilderImpl
**Implements:** `FieldWithMetaIdentifier$FieldWithMetaIdentifierBuilder` 

**Fields:**
- `IdentifierBuilder value`
- `MetaFieldsBuilder meta`

**Key Methods:**
- `getValue()` → `IdentifierBuilder` [Getter]
- `setValue(Identifier arg0)` → `FieldWithMetaIdentifierBuilder` [Setter]
- `build()` → `FieldWithMetaIdentifier` [Builder]
- `getOrCreateMeta()` → `MetaFieldsBuilder` [Getter]
- `getOrCreateValue()` → `IdentifierBuilder` [Getter]
- `getMeta()` → `MetaFieldsBuilder` [Getter]
- `setMeta(MetaFields arg0)` → `FieldWithMetaIdentifierBuilder` [Setter]

### FieldWithMetaIdentifierImpl
**Implements:** `FieldWithMetaIdentifier` 

**Key Methods:**
- `getValue()` → `Identifier` [Getter]
- `build()` → `FieldWithMetaIdentifier` [Builder]
- `setBuilderFields(FieldWithMetaIdentifierBuilder arg0)` → `void` [Setter]
- `getMeta()` → `MetaFields` [Getter]

### FieldWithMetaIdentifierMeta
**Extends:** `BasicRosettaMetaData` 

