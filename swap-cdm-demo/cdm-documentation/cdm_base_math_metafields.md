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
- `getOrCreateValue()` → `NonNegativeQuantityScheduleBuilder` [Getter]
- `getOrCreateMeta()` → `MetaFieldsBuilder` [Getter]
- `setMeta(MetaFields arg0)` → `FieldWithMetaNonNegativeQuantityScheduleBuilder` [Setter]
- `getMeta()` → `MetaFieldsBuilder` [Getter]

### ReferenceWithMetaNonNegativeQuantitySchedule
**Implements:** `RosettaModelObject` `ReferenceWithMeta` 

**Key Methods:**
- `getReference()` → `Reference` [Getter]
- `getValue()` → `NonNegativeQuantitySchedule` [Getter]
- `getType()` → `Class` [Getter]
- `build()` → `ReferenceWithMetaNonNegativeQuantitySchedule` [Builder]
- `getExternalReference()` → `String` [Getter]
- `getValueType()` → `Class` [Getter]
- `getGlobalReference()` → `String` [Getter]

### ReferenceWithMetaNonNegativeQuantityScheduleBuilder
**Implements:** `ReferenceWithMetaNonNegativeQuantitySchedule` `RosettaModelObjectBuilder` `ReferenceWithMeta$ReferenceWithMetaBuilder` 

**Key Methods:**
- `getReference()` → `ReferenceBuilder` [Getter]
- `getValue()` → `NonNegativeQuantityScheduleBuilder` [Getter]
- `setValue(NonNegativeQuantitySchedule arg0)` → `ReferenceWithMetaNonNegativeQuantityScheduleBuilder` [Setter]
- `getOrCreateValue()` → `NonNegativeQuantityScheduleBuilder` [Getter]
- `setExternalReference(String arg0)` → `ReferenceWithMetaNonNegativeQuantityScheduleBuilder` [Setter]
- `setGlobalReference(String arg0)` → `ReferenceWithMetaNonNegativeQuantityScheduleBuilder` [Setter]
- `getOrCreateReference()` → `ReferenceBuilder` [Getter]
- `setReference(Reference arg0)` → `ReferenceWithMetaNonNegativeQuantityScheduleBuilder` [Setter]

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
- `getOrCreateValue()` → `NonNegativeQuantityScheduleBuilder` [Getter]
- `getOrCreateMeta()` → `MetaFieldsBuilder` [Getter]
- `setMeta(MetaFields arg0)` → `FieldWithMetaNonNegativeQuantityScheduleBuilder` [Setter]
- `getMeta()` → `MetaFieldsBuilder` [Getter]

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
- `getOrCreateValue()` → `NonNegativeQuantityScheduleBuilder` [Getter]
- `setExternalReference(String arg0)` → `ReferenceWithMetaNonNegativeQuantityScheduleBuilder` [Setter]
- `setGlobalReference(String arg0)` → `ReferenceWithMetaNonNegativeQuantityScheduleBuilder` [Setter]
- `getOrCreateReference()` → `ReferenceBuilder` [Getter]
- `getExternalReference()` → `String` [Getter]
- `setReference(Reference arg0)` → `ReferenceWithMetaNonNegativeQuantityScheduleBuilder` [Setter]

### ReferenceWithMetaNonNegativeQuantityScheduleImpl
**Implements:** `ReferenceWithMetaNonNegativeQuantitySchedule` 

**Key Methods:**
- `getReference()` → `Reference` [Getter]
- `getValue()` → `NonNegativeQuantitySchedule` [Getter]
- `build()` → `ReferenceWithMetaNonNegativeQuantitySchedule` [Builder]
- `getExternalReference()` → `String` [Getter]
- `setBuilderFields(ReferenceWithMetaNonNegativeQuantityScheduleBuilder arg0)` → `void` [Setter]
- `getGlobalReference()` → `String` [Getter]

### ReferenceWithMetaNonNegativeQuantityScheduleMeta
**Extends:** `BasicRosettaMetaData` 

