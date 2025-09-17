# Package: cdm.base.staticdata.asset.common.metafields

## Interfaces

### FieldWithMetaAssetClassEnum
**Implements:** `RosettaModelObject` `FieldWithMeta` `GlobalKey` 

**Key Methods:**
- `getValue()` → `AssetClassEnum` [Getter]
- `getType()` → `Class` [Getter]
- `build()` → `FieldWithMetaAssetClassEnum` [Builder]
- `getValueType()` → `Class` [Getter]
- `getMeta()` → `MetaFields` [Getter]

### FieldWithMetaAssetClassEnumBuilder
**Implements:** `FieldWithMetaAssetClassEnum` `RosettaModelObjectBuilder` `FieldWithMeta$FieldWithMetaBuilder` `GlobalKey$GlobalKeyBuilder` 

**Key Methods:**
- `setValue(AssetClassEnum arg0)` → `FieldWithMetaAssetClassEnumBuilder` [Setter]
- `getOrCreateMeta()` → `MetaFieldsBuilder` [Getter]
- `getMeta()` → `MetaFieldsBuilder` [Getter]
- `setMeta(MetaFields arg0)` → `FieldWithMetaAssetClassEnumBuilder` [Setter]

## Concrete Classes

### FieldWithMetaAssetClassEnumBuilderImpl
**Implements:** `FieldWithMetaAssetClassEnum$FieldWithMetaAssetClassEnumBuilder` 

**Fields:**
- `AssetClassEnum value`
- `MetaFieldsBuilder meta`

**Key Methods:**
- `getValue()` → `AssetClassEnum` [Getter]
- `setValue(AssetClassEnum arg0)` → `FieldWithMetaAssetClassEnumBuilder` [Setter]
- `build()` → `FieldWithMetaAssetClassEnum` [Builder]
- `getOrCreateMeta()` → `MetaFieldsBuilder` [Getter]
- `getMeta()` → `MetaFieldsBuilder` [Getter]
- `setMeta(MetaFields arg0)` → `FieldWithMetaAssetClassEnumBuilder` [Setter]

### FieldWithMetaAssetClassEnumImpl
**Implements:** `FieldWithMetaAssetClassEnum` 

**Key Methods:**
- `getValue()` → `AssetClassEnum` [Getter]
- `build()` → `FieldWithMetaAssetClassEnum` [Builder]
- `setBuilderFields(FieldWithMetaAssetClassEnumBuilder arg0)` → `void` [Setter]
- `getMeta()` → `MetaFields` [Getter]

### FieldWithMetaAssetClassEnumMeta
**Extends:** `BasicRosettaMetaData` 

