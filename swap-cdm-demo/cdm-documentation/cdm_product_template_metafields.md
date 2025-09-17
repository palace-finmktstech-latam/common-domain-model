# Package: cdm.product.template.metafields

## Interfaces

### ReferenceWithMetaOptionPayout
**Implements:** `RosettaModelObject` `ReferenceWithMeta` 

**Key Methods:**
- `getReference()` → `Reference` [Getter]
- `getValue()` → `OptionPayout` [Getter]
- `getType()` → `Class` [Getter]
- `build()` → `ReferenceWithMetaOptionPayout` [Builder]
- `getValueType()` → `Class` [Getter]
- `getExternalReference()` → `String` [Getter]
- `getGlobalReference()` → `String` [Getter]

### ReferenceWithMetaOptionPayoutBuilder
**Implements:** `ReferenceWithMetaOptionPayout` `RosettaModelObjectBuilder` `ReferenceWithMeta$ReferenceWithMetaBuilder` 

**Key Methods:**
- `getReference()` → `ReferenceBuilder` [Getter]
- `getValue()` → `OptionPayoutBuilder` [Getter]
- `setValue(OptionPayout arg0)` → `ReferenceWithMetaOptionPayoutBuilder` [Setter]
- `setReference(Reference arg0)` → `ReferenceWithMetaOptionPayoutBuilder` [Setter]
- `setGlobalReference(String arg0)` → `ReferenceWithMetaOptionPayoutBuilder` [Setter]
- `getOrCreateValue()` → `OptionPayoutBuilder` [Getter]
- `setExternalReference(String arg0)` → `ReferenceWithMetaOptionPayoutBuilder` [Setter]
- `getOrCreateReference()` → `ReferenceBuilder` [Getter]

### ReferenceWithMetaPayout
**Implements:** `RosettaModelObject` `ReferenceWithMeta` 

**Key Methods:**
- `getReference()` → `Reference` [Getter]
- `getValue()` → `Payout` [Getter]
- `getType()` → `Class` [Getter]
- `build()` → `ReferenceWithMetaPayout` [Builder]
- `getValueType()` → `Class` [Getter]
- `getExternalReference()` → `String` [Getter]
- `getGlobalReference()` → `String` [Getter]

### ReferenceWithMetaPayoutBuilder
**Implements:** `ReferenceWithMetaPayout` `RosettaModelObjectBuilder` `ReferenceWithMeta$ReferenceWithMetaBuilder` 

**Key Methods:**
- `getReference()` → `ReferenceBuilder` [Getter]
- `getValue()` → `PayoutBuilder` [Getter]
- `setValue(Payout arg0)` → `ReferenceWithMetaPayoutBuilder` [Setter]
- `setReference(Reference arg0)` → `ReferenceWithMetaPayoutBuilder` [Setter]
- `setGlobalReference(String arg0)` → `ReferenceWithMetaPayoutBuilder` [Setter]
- `getOrCreateValue()` → `PayoutBuilder` [Getter]
- `setExternalReference(String arg0)` → `ReferenceWithMetaPayoutBuilder` [Setter]
- `getOrCreateReference()` → `ReferenceBuilder` [Getter]

## Concrete Classes

### ReferenceWithMetaOptionPayoutBuilderImpl
**Implements:** `ReferenceWithMetaOptionPayout$ReferenceWithMetaOptionPayoutBuilder` 

**Fields:**
- `OptionPayoutBuilder value`
- `String globalReference`
- `String externalReference`
- `ReferenceBuilder reference`

**Key Methods:**
- `getReference()` → `ReferenceBuilder` [Getter]
- `getValue()` → `OptionPayoutBuilder` [Getter]
- `setValue(OptionPayout arg0)` → `ReferenceWithMetaOptionPayoutBuilder` [Setter]
- `build()` → `ReferenceWithMetaOptionPayout` [Builder]
- `setReference(Reference arg0)` → `ReferenceWithMetaOptionPayoutBuilder` [Setter]
- `setGlobalReference(String arg0)` → `ReferenceWithMetaOptionPayoutBuilder` [Setter]
- `getOrCreateValue()` → `OptionPayoutBuilder` [Getter]
- `setExternalReference(String arg0)` → `ReferenceWithMetaOptionPayoutBuilder` [Setter]
- `getOrCreateReference()` → `ReferenceBuilder` [Getter]
- `getExternalReference()` → `String` [Getter]

### ReferenceWithMetaOptionPayoutImpl
**Implements:** `ReferenceWithMetaOptionPayout` 

**Key Methods:**
- `getReference()` → `Reference` [Getter]
- `getValue()` → `OptionPayout` [Getter]
- `build()` → `ReferenceWithMetaOptionPayout` [Builder]
- `setBuilderFields(ReferenceWithMetaOptionPayoutBuilder arg0)` → `void` [Setter]
- `getExternalReference()` → `String` [Getter]
- `getGlobalReference()` → `String` [Getter]

### ReferenceWithMetaOptionPayoutMeta
**Extends:** `BasicRosettaMetaData` 

### ReferenceWithMetaPayoutBuilderImpl
**Implements:** `ReferenceWithMetaPayout$ReferenceWithMetaPayoutBuilder` 

**Fields:**
- `PayoutBuilder value`
- `String globalReference`
- `String externalReference`
- `ReferenceBuilder reference`

**Key Methods:**
- `getReference()` → `ReferenceBuilder` [Getter]
- `getValue()` → `PayoutBuilder` [Getter]
- `setValue(Payout arg0)` → `ReferenceWithMetaPayoutBuilder` [Setter]
- `build()` → `ReferenceWithMetaPayout` [Builder]
- `setReference(Reference arg0)` → `ReferenceWithMetaPayoutBuilder` [Setter]
- `setGlobalReference(String arg0)` → `ReferenceWithMetaPayoutBuilder` [Setter]
- `getOrCreateValue()` → `PayoutBuilder` [Getter]
- `setExternalReference(String arg0)` → `ReferenceWithMetaPayoutBuilder` [Setter]
- `getOrCreateReference()` → `ReferenceBuilder` [Getter]
- `getExternalReference()` → `String` [Getter]

### ReferenceWithMetaPayoutImpl
**Implements:** `ReferenceWithMetaPayout` 

**Key Methods:**
- `getReference()` → `Reference` [Getter]
- `getValue()` → `Payout` [Getter]
- `build()` → `ReferenceWithMetaPayout` [Builder]
- `setBuilderFields(ReferenceWithMetaPayoutBuilder arg0)` → `void` [Setter]
- `getExternalReference()` → `String` [Getter]
- `getGlobalReference()` → `String` [Getter]

### ReferenceWithMetaPayoutMeta
**Extends:** `BasicRosettaMetaData` 

