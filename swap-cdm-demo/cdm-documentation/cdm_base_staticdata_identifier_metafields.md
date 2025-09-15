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
- `getOrCreateValue()` → `IdentifierBuilder` [Getter]
- `getOrCreateMeta()` → `MetaFieldsBuilder` [Getter]
- `setMeta(MetaFields arg0)` → `FieldWithMetaIdentifierBuilder` [Setter]
- `getMeta()` → `MetaFieldsBuilder` [Getter]

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
- `getOrCreateValue()` → `IdentifierBuilder` [Getter]
- `getOrCreateMeta()` → `MetaFieldsBuilder` [Getter]
- `setMeta(MetaFields arg0)` → `FieldWithMetaIdentifierBuilder` [Setter]
- `getMeta()` → `MetaFieldsBuilder` [Getter]

### FieldWithMetaIdentifierImpl
**Implements:** `FieldWithMetaIdentifier` 

**Key Methods:**
- `getValue()` → `Identifier` [Getter]
- `build()` → `FieldWithMetaIdentifier` [Builder]
- `setBuilderFields(FieldWithMetaIdentifierBuilder arg0)` → `void` [Setter]
- `getMeta()` → `MetaFields` [Getter]

### FieldWithMetaIdentifierMeta
**Extends:** `BasicRosettaMetaData` 

