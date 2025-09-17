# Package: cdm.event.workflow.metafields

## Interfaces

### FieldWithMetaCreditLimitTypeEnum
**Implements:** `RosettaModelObject` `FieldWithMeta` `GlobalKey` 

**Key Methods:**
- `getValue()` → `CreditLimitTypeEnum` [Getter]
- `getType()` → `Class` [Getter]
- `build()` → `FieldWithMetaCreditLimitTypeEnum` [Builder]
- `getValueType()` → `Class` [Getter]
- `getMeta()` → `MetaFields` [Getter]

### FieldWithMetaCreditLimitTypeEnumBuilder
**Implements:** `FieldWithMetaCreditLimitTypeEnum` `RosettaModelObjectBuilder` `FieldWithMeta$FieldWithMetaBuilder` `GlobalKey$GlobalKeyBuilder` 

**Key Methods:**
- `setValue(CreditLimitTypeEnum arg0)` → `FieldWithMetaCreditLimitTypeEnumBuilder` [Setter]
- `getOrCreateMeta()` → `MetaFieldsBuilder` [Getter]
- `getMeta()` → `MetaFieldsBuilder` [Getter]
- `setMeta(MetaFields arg0)` → `FieldWithMetaCreditLimitTypeEnumBuilder` [Setter]

### FieldWithMetaLimitLevelEnum
**Implements:** `RosettaModelObject` `FieldWithMeta` `GlobalKey` 

**Key Methods:**
- `getValue()` → `LimitLevelEnum` [Getter]
- `getType()` → `Class` [Getter]
- `build()` → `FieldWithMetaLimitLevelEnum` [Builder]
- `getValueType()` → `Class` [Getter]
- `getMeta()` → `MetaFields` [Getter]

### FieldWithMetaLimitLevelEnumBuilder
**Implements:** `FieldWithMetaLimitLevelEnum` `RosettaModelObjectBuilder` `FieldWithMeta$FieldWithMetaBuilder` `GlobalKey$GlobalKeyBuilder` 

**Key Methods:**
- `setValue(LimitLevelEnum arg0)` → `FieldWithMetaLimitLevelEnumBuilder` [Setter]
- `getOrCreateMeta()` → `MetaFieldsBuilder` [Getter]
- `getMeta()` → `MetaFieldsBuilder` [Getter]
- `setMeta(MetaFields arg0)` → `FieldWithMetaLimitLevelEnumBuilder` [Setter]

### ReferenceWithMetaWorkflowStep
**Implements:** `RosettaModelObject` `ReferenceWithMeta` 

**Key Methods:**
- `getReference()` → `Reference` [Getter]
- `getValue()` → `WorkflowStep` [Getter]
- `getType()` → `Class` [Getter]
- `build()` → `ReferenceWithMetaWorkflowStep` [Builder]
- `getValueType()` → `Class` [Getter]
- `getExternalReference()` → `String` [Getter]
- `getGlobalReference()` → `String` [Getter]

### ReferenceWithMetaWorkflowStepBuilder
**Implements:** `ReferenceWithMetaWorkflowStep` `RosettaModelObjectBuilder` `ReferenceWithMeta$ReferenceWithMetaBuilder` 

**Key Methods:**
- `getReference()` → `ReferenceBuilder` [Getter]
- `getValue()` → `WorkflowStepBuilder` [Getter]
- `setValue(WorkflowStep arg0)` → `ReferenceWithMetaWorkflowStepBuilder` [Setter]
- `setReference(Reference arg0)` → `ReferenceWithMetaWorkflowStepBuilder` [Setter]
- `setGlobalReference(String arg0)` → `ReferenceWithMetaWorkflowStepBuilder` [Setter]
- `getOrCreateValue()` → `WorkflowStepBuilder` [Getter]
- `setExternalReference(String arg0)` → `ReferenceWithMetaWorkflowStepBuilder` [Setter]
- `getOrCreateReference()` → `ReferenceBuilder` [Getter]

## Concrete Classes

### FieldWithMetaCreditLimitTypeEnumBuilderImpl
**Implements:** `FieldWithMetaCreditLimitTypeEnum$FieldWithMetaCreditLimitTypeEnumBuilder` 

**Fields:**
- `CreditLimitTypeEnum value`
- `MetaFieldsBuilder meta`

**Key Methods:**
- `getValue()` → `CreditLimitTypeEnum` [Getter]
- `setValue(CreditLimitTypeEnum arg0)` → `FieldWithMetaCreditLimitTypeEnumBuilder` [Setter]
- `build()` → `FieldWithMetaCreditLimitTypeEnum` [Builder]
- `getOrCreateMeta()` → `MetaFieldsBuilder` [Getter]
- `getMeta()` → `MetaFieldsBuilder` [Getter]
- `setMeta(MetaFields arg0)` → `FieldWithMetaCreditLimitTypeEnumBuilder` [Setter]

### FieldWithMetaCreditLimitTypeEnumImpl
**Implements:** `FieldWithMetaCreditLimitTypeEnum` 

**Key Methods:**
- `getValue()` → `CreditLimitTypeEnum` [Getter]
- `build()` → `FieldWithMetaCreditLimitTypeEnum` [Builder]
- `setBuilderFields(FieldWithMetaCreditLimitTypeEnumBuilder arg0)` → `void` [Setter]
- `getMeta()` → `MetaFields` [Getter]

### FieldWithMetaCreditLimitTypeEnumMeta
**Extends:** `BasicRosettaMetaData` 

### FieldWithMetaLimitLevelEnumBuilderImpl
**Implements:** `FieldWithMetaLimitLevelEnum$FieldWithMetaLimitLevelEnumBuilder` 

**Fields:**
- `LimitLevelEnum value`
- `MetaFieldsBuilder meta`

**Key Methods:**
- `getValue()` → `LimitLevelEnum` [Getter]
- `setValue(LimitLevelEnum arg0)` → `FieldWithMetaLimitLevelEnumBuilder` [Setter]
- `build()` → `FieldWithMetaLimitLevelEnum` [Builder]
- `getOrCreateMeta()` → `MetaFieldsBuilder` [Getter]
- `getMeta()` → `MetaFieldsBuilder` [Getter]
- `setMeta(MetaFields arg0)` → `FieldWithMetaLimitLevelEnumBuilder` [Setter]

### FieldWithMetaLimitLevelEnumImpl
**Implements:** `FieldWithMetaLimitLevelEnum` 

**Key Methods:**
- `getValue()` → `LimitLevelEnum` [Getter]
- `build()` → `FieldWithMetaLimitLevelEnum` [Builder]
- `setBuilderFields(FieldWithMetaLimitLevelEnumBuilder arg0)` → `void` [Setter]
- `getMeta()` → `MetaFields` [Getter]

### FieldWithMetaLimitLevelEnumMeta
**Extends:** `BasicRosettaMetaData` 

### ReferenceWithMetaWorkflowStepBuilderImpl
**Implements:** `ReferenceWithMetaWorkflowStep$ReferenceWithMetaWorkflowStepBuilder` 

**Fields:**
- `WorkflowStepBuilder value`
- `String globalReference`
- `String externalReference`
- `ReferenceBuilder reference`

**Key Methods:**
- `getReference()` → `ReferenceBuilder` [Getter]
- `getValue()` → `WorkflowStepBuilder` [Getter]
- `setValue(WorkflowStep arg0)` → `ReferenceWithMetaWorkflowStepBuilder` [Setter]
- `build()` → `ReferenceWithMetaWorkflowStep` [Builder]
- `setReference(Reference arg0)` → `ReferenceWithMetaWorkflowStepBuilder` [Setter]
- `setGlobalReference(String arg0)` → `ReferenceWithMetaWorkflowStepBuilder` [Setter]
- `getOrCreateValue()` → `WorkflowStepBuilder` [Getter]
- `setExternalReference(String arg0)` → `ReferenceWithMetaWorkflowStepBuilder` [Setter]
- `getOrCreateReference()` → `ReferenceBuilder` [Getter]
- `getExternalReference()` → `String` [Getter]

### ReferenceWithMetaWorkflowStepImpl
**Implements:** `ReferenceWithMetaWorkflowStep` 

**Key Methods:**
- `getReference()` → `Reference` [Getter]
- `getValue()` → `WorkflowStep` [Getter]
- `build()` → `ReferenceWithMetaWorkflowStep` [Builder]
- `setBuilderFields(ReferenceWithMetaWorkflowStepBuilder arg0)` → `void` [Setter]
- `getExternalReference()` → `String` [Getter]
- `getGlobalReference()` → `String` [Getter]

### ReferenceWithMetaWorkflowStepMeta
**Extends:** `BasicRosettaMetaData` 

