# Package: cdm.base.datetime.daycount.metafields

## Interfaces

### FieldWithMetaDayCountFractionEnum
**Implements:** `RosettaModelObject` `FieldWithMeta` `GlobalKey` 

**Key Methods:**
- `getValue()` → `DayCountFractionEnum` [Getter]
- `getType()` → `Class` [Getter]
- `build()` → `FieldWithMetaDayCountFractionEnum` [Builder]
- `getValueType()` → `Class` [Getter]
- `getMeta()` → `MetaFields` [Getter]

### FieldWithMetaDayCountFractionEnumBuilder
**Implements:** `FieldWithMetaDayCountFractionEnum` `RosettaModelObjectBuilder` `FieldWithMeta$FieldWithMetaBuilder` `GlobalKey$GlobalKeyBuilder` 

**Key Methods:**
- `setValue(DayCountFractionEnum arg0)` → `FieldWithMetaDayCountFractionEnumBuilder` [Setter]
- `getOrCreateMeta()` → `MetaFieldsBuilder` [Getter]
- `setMeta(MetaFields arg0)` → `FieldWithMetaDayCountFractionEnumBuilder` [Setter]
- `getMeta()` → `MetaFieldsBuilder` [Getter]

## Concrete Classes

### FieldWithMetaDayCountFractionEnumBuilderImpl
**Implements:** `FieldWithMetaDayCountFractionEnum$FieldWithMetaDayCountFractionEnumBuilder` 

**Fields:**
- `DayCountFractionEnum value`
- `MetaFieldsBuilder meta`

**Key Methods:**
- `getValue()` → `DayCountFractionEnum` [Getter]
- `setValue(DayCountFractionEnum arg0)` → `FieldWithMetaDayCountFractionEnumBuilder` [Setter]
- `build()` → `FieldWithMetaDayCountFractionEnum` [Builder]
- `getOrCreateMeta()` → `MetaFieldsBuilder` [Getter]
- `setMeta(MetaFields arg0)` → `FieldWithMetaDayCountFractionEnumBuilder` [Setter]
- `getMeta()` → `MetaFieldsBuilder` [Getter]

### FieldWithMetaDayCountFractionEnumImpl
**Implements:** `FieldWithMetaDayCountFractionEnum` 

**Key Methods:**
- `getValue()` → `DayCountFractionEnum` [Getter]
- `build()` → `FieldWithMetaDayCountFractionEnum` [Builder]
- `setBuilderFields(FieldWithMetaDayCountFractionEnumBuilder arg0)` → `void` [Setter]
- `getMeta()` → `MetaFields` [Getter]

### FieldWithMetaDayCountFractionEnumMeta
**Extends:** `BasicRosettaMetaData` 

