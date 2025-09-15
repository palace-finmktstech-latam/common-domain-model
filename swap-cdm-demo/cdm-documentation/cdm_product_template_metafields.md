# Package: cdm.product.template.metafields

## Interfaces

### ReferenceWithMetaOptionPayout
**Implements:** `RosettaModelObject` `ReferenceWithMeta` 

**Key Methods:**
- `getReference()` → `Reference` [Getter]
- `getValue()` → `OptionPayout` [Getter]
- `getType()` → `Class` [Getter]
- `build()` → `ReferenceWithMetaOptionPayout` [Builder]
- `getExternalReference()` → `String` [Getter]
- `getValueType()` → `Class` [Getter]
- `getGlobalReference()` → `String` [Getter]

### ReferenceWithMetaOptionPayoutBuilder
**Implements:** `ReferenceWithMetaOptionPayout` `RosettaModelObjectBuilder` `ReferenceWithMeta$ReferenceWithMetaBuilder` 

**Key Methods:**
- `getReference()` → `ReferenceBuilder` [Getter]
- `getValue()` → `OptionPayoutBuilder` [Getter]
- `setValue(OptionPayout arg0)` → `ReferenceWithMetaOptionPayoutBuilder` [Setter]
- `getOrCreateValue()` → `OptionPayoutBuilder` [Getter]
- `setExternalReference(String arg0)` → `ReferenceWithMetaOptionPayoutBuilder` [Setter]
- `setGlobalReference(String arg0)` → `ReferenceWithMetaOptionPayoutBuilder` [Setter]
- `getOrCreateReference()` → `ReferenceBuilder` [Getter]
- `setReference(Reference arg0)` → `ReferenceWithMetaOptionPayoutBuilder` [Setter]

### ReferenceWithMetaPayout
**Implements:** `RosettaModelObject` `ReferenceWithMeta` 

**Key Methods:**
- `getReference()` → `Reference` [Getter]
- `getValue()` → `Payout` [Getter]
- `getType()` → `Class` [Getter]
- `build()` → `ReferenceWithMetaPayout` [Builder]
- `getExternalReference()` → `String` [Getter]
- `getValueType()` → `Class` [Getter]
- `getGlobalReference()` → `String` [Getter]

### ReferenceWithMetaPayoutBuilder
**Implements:** `ReferenceWithMetaPayout` `RosettaModelObjectBuilder` `ReferenceWithMeta$ReferenceWithMetaBuilder` 

**Key Methods:**
- `getReference()` → `ReferenceBuilder` [Getter]
- `getValue()` → `PayoutBuilder` [Getter]
- `setValue(Payout arg0)` → `ReferenceWithMetaPayoutBuilder` [Setter]
- `getOrCreateValue()` → `PayoutBuilder` [Getter]
- `setExternalReference(String arg0)` → `ReferenceWithMetaPayoutBuilder` [Setter]
- `setGlobalReference(String arg0)` → `ReferenceWithMetaPayoutBuilder` [Setter]
- `getOrCreateReference()` → `ReferenceBuilder` [Getter]
- `setReference(Reference arg0)` → `ReferenceWithMetaPayoutBuilder` [Setter]

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
- `getOrCreateValue()` → `OptionPayoutBuilder` [Getter]
- `setExternalReference(String arg0)` → `ReferenceWithMetaOptionPayoutBuilder` [Setter]
- `setGlobalReference(String arg0)` → `ReferenceWithMetaOptionPayoutBuilder` [Setter]
- `getOrCreateReference()` → `ReferenceBuilder` [Getter]
- `getExternalReference()` → `String` [Getter]
- `setReference(Reference arg0)` → `ReferenceWithMetaOptionPayoutBuilder` [Setter]

### ReferenceWithMetaOptionPayoutImpl
**Implements:** `ReferenceWithMetaOptionPayout` 

**Key Methods:**
- `getReference()` → `Reference` [Getter]
- `getValue()` → `OptionPayout` [Getter]
- `build()` → `ReferenceWithMetaOptionPayout` [Builder]
- `getExternalReference()` → `String` [Getter]
- `setBuilderFields(ReferenceWithMetaOptionPayoutBuilder arg0)` → `void` [Setter]
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
- `getOrCreateValue()` → `PayoutBuilder` [Getter]
- `setExternalReference(String arg0)` → `ReferenceWithMetaPayoutBuilder` [Setter]
- `setGlobalReference(String arg0)` → `ReferenceWithMetaPayoutBuilder` [Setter]
- `getOrCreateReference()` → `ReferenceBuilder` [Getter]
- `getExternalReference()` → `String` [Getter]
- `setReference(Reference arg0)` → `ReferenceWithMetaPayoutBuilder` [Setter]

### ReferenceWithMetaPayoutImpl
**Implements:** `ReferenceWithMetaPayout` 

**Key Methods:**
- `getReference()` → `Reference` [Getter]
- `getValue()` → `Payout` [Getter]
- `build()` → `ReferenceWithMetaPayout` [Builder]
- `getExternalReference()` → `String` [Getter]
- `setBuilderFields(ReferenceWithMetaPayoutBuilder arg0)` → `void` [Setter]
- `getGlobalReference()` → `String` [Getter]

### ReferenceWithMetaPayoutMeta
**Extends:** `BasicRosettaMetaData` 

