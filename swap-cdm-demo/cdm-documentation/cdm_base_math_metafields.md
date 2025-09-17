# Package: cdm.base.math.metafields

## Interfaces

### FieldWithMetaNonNegativeQuantitySchedule
**Implements:** `RosettaModelObject` `FieldWithMeta` `GlobalKey` 

**Key Methods:**
- `getValue()` → `NonNegativeQuantitySchedule` [Getter]
- `getType()` → `Class` [Getter]
- `build()` → `FieldWithMetaNonNegativeQuantitySchedule` [Builder]
- `getValueType()` → `Class` [Getter]
- `getMeta()` → `MetaFields` [Getter]

### FieldWithMetaNonNegativeQuantityScheduleBuilder
**Implements:** `FieldWithMetaNonNegativeQuantitySchedule` `RosettaModelObjectBuilder` `FieldWithMeta$FieldWithMetaBuilder` `GlobalKey$GlobalKeyBuilder` 

**Key Methods:**
- `getValue()` → `NonNegativeQuantityScheduleBuilder` [Getter]
- `setValue(NonNegativeQuantitySchedule arg0)` → `FieldWithMetaNonNegativeQuantityScheduleBuilder` [Setter]
- `getOrCreateMeta()` → `MetaFieldsBuilder` [Getter]
- `getOrCreateValue()` → `NonNegativeQuantityScheduleBuilder` [Getter]
- `getMeta()` → `MetaFieldsBuilder` [Getter]
- `setMeta(MetaFields arg0)` → `FieldWithMetaNonNegativeQuantityScheduleBuilder` [Setter]

### ReferenceWithMetaNonNegativeQuantitySchedule
**Implements:** `RosettaModelObject` `ReferenceWithMeta` 

**Key Methods:**
- `getReference()` → `Reference` [Getter]
- `getValue()` → `NonNegativeQuantitySchedule` [Getter]
- `getType()` → `Class` [Getter]
- `build()` → `ReferenceWithMetaNonNegativeQuantitySchedule` [Builder]
- `getValueType()` → `Class` [Getter]
- `getExternalReference()` → `String` [Getter]
- `getGlobalReference()` → `String` [Getter]

### ReferenceWithMetaNonNegativeQuantityScheduleBuilder
**Implements:** `ReferenceWithMetaNonNegativeQuantitySchedule` `RosettaModelObjectBuilder` `ReferenceWithMeta$ReferenceWithMetaBuilder` 

**Key Methods:**
- `getReference()` → `ReferenceBuilder` [Getter]
- `getValue()` → `NonNegativeQuantityScheduleBuilder` [Getter]
- `setValue(NonNegativeQuantitySchedule arg0)` → `ReferenceWithMetaNonNegativeQuantityScheduleBuilder` [Setter]
- `setReference(Reference arg0)` → `ReferenceWithMetaNonNegativeQuantityScheduleBuilder` [Setter]
- `setGlobalReference(String arg0)` → `ReferenceWithMetaNonNegativeQuantityScheduleBuilder` [Setter]
- `getOrCreateValue()` → `NonNegativeQuantityScheduleBuilder` [Getter]
- `setExternalReference(String arg0)` → `ReferenceWithMetaNonNegativeQuantityScheduleBuilder` [Setter]
- `getOrCreateReference()` → `ReferenceBuilder` [Getter]

## Concrete Classes

### FieldWithMetaNonNegativeQuantityScheduleBuilderImpl
**Implements:** `FieldWithMetaNonNegativeQuantitySchedule$FieldWithMetaNonNegativeQuantityScheduleBuilder` 

**Fields:**
- `NonNegativeQuantityScheduleBuilder value`
- `MetaFieldsBuilder meta`

**Key Methods:**
- `getValue()` → `NonNegativeQuantityScheduleBuilder` [Getter]
- `setValue(NonNegativeQuantitySchedule arg0)` → `FieldWithMetaNonNegativeQuantityScheduleBuilder` [Setter]
- `build()` → `FieldWithMetaNonNegativeQuantitySchedule` [Builder]
- `getOrCreateMeta()` → `MetaFieldsBuilder` [Getter]
- `getOrCreateValue()` → `NonNegativeQuantityScheduleBuilder` [Getter]
- `getMeta()` → `MetaFieldsBuilder` [Getter]
- `setMeta(MetaFields arg0)` → `FieldWithMetaNonNegativeQuantityScheduleBuilder` [Setter]

### FieldWithMetaNonNegativeQuantityScheduleImpl
**Implements:** `FieldWithMetaNonNegativeQuantitySchedule` 

**Key Methods:**
- `getValue()` → `NonNegativeQuantitySchedule` [Getter]
- `build()` → `FieldWithMetaNonNegativeQuantitySchedule` [Builder]
- `setBuilderFields(FieldWithMetaNonNegativeQuantityScheduleBuilder arg0)` → `void` [Setter]
- `getMeta()` → `MetaFields` [Getter]

### FieldWithMetaNonNegativeQuantityScheduleMeta
**Extends:** `BasicRosettaMetaData` 

### ReferenceWithMetaNonNegativeQuantityScheduleBuilderImpl
**Implements:** `ReferenceWithMetaNonNegativeQuantitySchedule$ReferenceWithMetaNonNegativeQuantityScheduleBuilder` 

**Fields:**
- `NonNegativeQuantityScheduleBuilder value`
- `String globalReference`
- `String externalReference`
- `ReferenceBuilder reference`

**Key Methods:**
- `getReference()` → `ReferenceBuilder` [Getter]
- `getValue()` → `NonNegativeQuantityScheduleBuilder` [Getter]
- `setValue(NonNegativeQuantitySchedule arg0)` → `ReferenceWithMetaNonNegativeQuantityScheduleBuilder` [Setter]
- `build()` → `ReferenceWithMetaNonNegativeQuantitySchedule` [Builder]
- `setReference(Reference arg0)` → `ReferenceWithMetaNonNegativeQuantityScheduleBuilder` [Setter]
- `setGlobalReference(String arg0)` → `ReferenceWithMetaNonNegativeQuantityScheduleBuilder` [Setter]
- `getOrCreateValue()` → `NonNegativeQuantityScheduleBuilder` [Getter]
- `setExternalReference(String arg0)` → `ReferenceWithMetaNonNegativeQuantityScheduleBuilder` [Setter]
- `getOrCreateReference()` → `ReferenceBuilder` [Getter]
- `getExternalReference()` → `String` [Getter]

### ReferenceWithMetaNonNegativeQuantityScheduleImpl
**Implements:** `ReferenceWithMetaNonNegativeQuantitySchedule` 

**Key Methods:**
- `getReference()` → `Reference` [Getter]
- `getValue()` → `NonNegativeQuantitySchedule` [Getter]
- `build()` → `ReferenceWithMetaNonNegativeQuantitySchedule` [Builder]
- `setBuilderFields(ReferenceWithMetaNonNegativeQuantityScheduleBuilder arg0)` → `void` [Setter]
- `getExternalReference()` → `String` [Getter]
- `getGlobalReference()` → `String` [Getter]

### ReferenceWithMetaNonNegativeQuantityScheduleMeta
**Extends:** `BasicRosettaMetaData` 

