# Package: cdm.product.common.settlement.metafields

## Interfaces

### ReferenceWithMetaCashSettlementTerms
**Implements:** `RosettaModelObject` `ReferenceWithMeta` 

**Key Methods:**
- `getReference()` → `Reference` [Getter]
- `getValue()` → `CashSettlementTerms` [Getter]
- `getType()` → `Class` [Getter]
- `build()` → `ReferenceWithMetaCashSettlementTerms` [Builder]
- `getExternalReference()` → `String` [Getter]
- `getValueType()` → `Class` [Getter]
- `getGlobalReference()` → `String` [Getter]

### ReferenceWithMetaCashSettlementTermsBuilder
**Implements:** `ReferenceWithMetaCashSettlementTerms` `RosettaModelObjectBuilder` `ReferenceWithMeta$ReferenceWithMetaBuilder` 

**Key Methods:**
- `getReference()` → `ReferenceBuilder` [Getter]
- `getValue()` → `CashSettlementTermsBuilder` [Getter]
- `setValue(CashSettlementTerms arg0)` → `ReferenceWithMetaCashSettlementTermsBuilder` [Setter]
- `getOrCreateValue()` → `CashSettlementTermsBuilder` [Getter]
- `setExternalReference(String arg0)` → `ReferenceWithMetaCashSettlementTermsBuilder` [Setter]
- `setGlobalReference(String arg0)` → `ReferenceWithMetaCashSettlementTermsBuilder` [Setter]
- `getOrCreateReference()` → `ReferenceBuilder` [Getter]
- `setReference(Reference arg0)` → `ReferenceWithMetaCashSettlementTermsBuilder` [Setter]

### ReferenceWithMetaPhysicalSettlementTerms
**Implements:** `RosettaModelObject` `ReferenceWithMeta` 

**Key Methods:**
- `getReference()` → `Reference` [Getter]
- `getValue()` → `PhysicalSettlementTerms` [Getter]
- `getType()` → `Class` [Getter]
- `build()` → `ReferenceWithMetaPhysicalSettlementTerms` [Builder]
- `getExternalReference()` → `String` [Getter]
- `getValueType()` → `Class` [Getter]
- `getGlobalReference()` → `String` [Getter]

### ReferenceWithMetaPhysicalSettlementTermsBuilder
**Implements:** `ReferenceWithMetaPhysicalSettlementTerms` `RosettaModelObjectBuilder` `ReferenceWithMeta$ReferenceWithMetaBuilder` 

**Key Methods:**
- `getReference()` → `ReferenceBuilder` [Getter]
- `getValue()` → `PhysicalSettlementTermsBuilder` [Getter]
- `setValue(PhysicalSettlementTerms arg0)` → `ReferenceWithMetaPhysicalSettlementTermsBuilder` [Setter]
- `getOrCreateValue()` → `PhysicalSettlementTermsBuilder` [Getter]
- `setExternalReference(String arg0)` → `ReferenceWithMetaPhysicalSettlementTermsBuilder` [Setter]
- `setGlobalReference(String arg0)` → `ReferenceWithMetaPhysicalSettlementTermsBuilder` [Setter]
- `getOrCreateReference()` → `ReferenceBuilder` [Getter]
- `setReference(Reference arg0)` → `ReferenceWithMetaPhysicalSettlementTermsBuilder` [Setter]

### ReferenceWithMetaResolvablePriceQuantity
**Implements:** `RosettaModelObject` `ReferenceWithMeta` 

**Key Methods:**
- `getReference()` → `Reference` [Getter]
- `getValue()` → `ResolvablePriceQuantity` [Getter]
- `getType()` → `Class` [Getter]
- `build()` → `ReferenceWithMetaResolvablePriceQuantity` [Builder]
- `getExternalReference()` → `String` [Getter]
- `getValueType()` → `Class` [Getter]
- `getGlobalReference()` → `String` [Getter]

### ReferenceWithMetaResolvablePriceQuantityBuilder
**Implements:** `ReferenceWithMetaResolvablePriceQuantity` `RosettaModelObjectBuilder` `ReferenceWithMeta$ReferenceWithMetaBuilder` 

**Key Methods:**
- `getReference()` → `ReferenceBuilder` [Getter]
- `getValue()` → `ResolvablePriceQuantityBuilder` [Getter]
- `setValue(ResolvablePriceQuantity arg0)` → `ReferenceWithMetaResolvablePriceQuantityBuilder` [Setter]
- `getOrCreateValue()` → `ResolvablePriceQuantityBuilder` [Getter]
- `setExternalReference(String arg0)` → `ReferenceWithMetaResolvablePriceQuantityBuilder` [Setter]
- `setGlobalReference(String arg0)` → `ReferenceWithMetaResolvablePriceQuantityBuilder` [Setter]
- `getOrCreateReference()` → `ReferenceBuilder` [Getter]
- `setReference(Reference arg0)` → `ReferenceWithMetaResolvablePriceQuantityBuilder` [Setter]

## Concrete Classes

### ReferenceWithMetaCashSettlementTermsBuilderImpl
**Implements:** `ReferenceWithMetaCashSettlementTerms$ReferenceWithMetaCashSettlementTermsBuilder` 

**Fields:**
- `CashSettlementTermsBuilder value`
- `String globalReference`
- `String externalReference`
- `ReferenceBuilder reference`

**Key Methods:**
- `getReference()` → `ReferenceBuilder` [Getter]
- `getValue()` → `CashSettlementTermsBuilder` [Getter]
- `setValue(CashSettlementTerms arg0)` → `ReferenceWithMetaCashSettlementTermsBuilder` [Setter]
- `build()` → `ReferenceWithMetaCashSettlementTerms` [Builder]
- `getOrCreateValue()` → `CashSettlementTermsBuilder` [Getter]
- `setExternalReference(String arg0)` → `ReferenceWithMetaCashSettlementTermsBuilder` [Setter]
- `setGlobalReference(String arg0)` → `ReferenceWithMetaCashSettlementTermsBuilder` [Setter]
- `getOrCreateReference()` → `ReferenceBuilder` [Getter]
- `getExternalReference()` → `String` [Getter]
- `setReference(Reference arg0)` → `ReferenceWithMetaCashSettlementTermsBuilder` [Setter]

### ReferenceWithMetaCashSettlementTermsImpl
**Implements:** `ReferenceWithMetaCashSettlementTerms` 

**Key Methods:**
- `getReference()` → `Reference` [Getter]
- `getValue()` → `CashSettlementTerms` [Getter]
- `build()` → `ReferenceWithMetaCashSettlementTerms` [Builder]
- `getExternalReference()` → `String` [Getter]
- `setBuilderFields(ReferenceWithMetaCashSettlementTermsBuilder arg0)` → `void` [Setter]
- `getGlobalReference()` → `String` [Getter]

### ReferenceWithMetaCashSettlementTermsMeta
**Extends:** `BasicRosettaMetaData` 

### ReferenceWithMetaPhysicalSettlementTermsBuilderImpl
**Implements:** `ReferenceWithMetaPhysicalSettlementTerms$ReferenceWithMetaPhysicalSettlementTermsBuilder` 

**Fields:**
- `PhysicalSettlementTermsBuilder value`
- `String globalReference`
- `String externalReference`
- `ReferenceBuilder reference`

**Key Methods:**
- `getReference()` → `ReferenceBuilder` [Getter]
- `getValue()` → `PhysicalSettlementTermsBuilder` [Getter]
- `setValue(PhysicalSettlementTerms arg0)` → `ReferenceWithMetaPhysicalSettlementTermsBuilder` [Setter]
- `build()` → `ReferenceWithMetaPhysicalSettlementTerms` [Builder]
- `getOrCreateValue()` → `PhysicalSettlementTermsBuilder` [Getter]
- `setExternalReference(String arg0)` → `ReferenceWithMetaPhysicalSettlementTermsBuilder` [Setter]
- `setGlobalReference(String arg0)` → `ReferenceWithMetaPhysicalSettlementTermsBuilder` [Setter]
- `getOrCreateReference()` → `ReferenceBuilder` [Getter]
- `getExternalReference()` → `String` [Getter]
- `setReference(Reference arg0)` → `ReferenceWithMetaPhysicalSettlementTermsBuilder` [Setter]

### ReferenceWithMetaPhysicalSettlementTermsImpl
**Implements:** `ReferenceWithMetaPhysicalSettlementTerms` 

**Key Methods:**
- `getReference()` → `Reference` [Getter]
- `getValue()` → `PhysicalSettlementTerms` [Getter]
- `build()` → `ReferenceWithMetaPhysicalSettlementTerms` [Builder]
- `getExternalReference()` → `String` [Getter]
- `setBuilderFields(ReferenceWithMetaPhysicalSettlementTermsBuilder arg0)` → `void` [Setter]
- `getGlobalReference()` → `String` [Getter]

### ReferenceWithMetaPhysicalSettlementTermsMeta
**Extends:** `BasicRosettaMetaData` 

### ReferenceWithMetaResolvablePriceQuantityBuilderImpl
**Implements:** `ReferenceWithMetaResolvablePriceQuantity$ReferenceWithMetaResolvablePriceQuantityBuilder` 

**Fields:**
- `ResolvablePriceQuantityBuilder value`
- `String globalReference`
- `String externalReference`
- `ReferenceBuilder reference`

**Key Methods:**
- `getReference()` → `ReferenceBuilder` [Getter]
- `getValue()` → `ResolvablePriceQuantityBuilder` [Getter]
- `setValue(ResolvablePriceQuantity arg0)` → `ReferenceWithMetaResolvablePriceQuantityBuilder` [Setter]
- `build()` → `ReferenceWithMetaResolvablePriceQuantity` [Builder]
- `getOrCreateValue()` → `ResolvablePriceQuantityBuilder` [Getter]
- `setExternalReference(String arg0)` → `ReferenceWithMetaResolvablePriceQuantityBuilder` [Setter]
- `setGlobalReference(String arg0)` → `ReferenceWithMetaResolvablePriceQuantityBuilder` [Setter]
- `getOrCreateReference()` → `ReferenceBuilder` [Getter]
- `getExternalReference()` → `String` [Getter]
- `setReference(Reference arg0)` → `ReferenceWithMetaResolvablePriceQuantityBuilder` [Setter]

### ReferenceWithMetaResolvablePriceQuantityImpl
**Implements:** `ReferenceWithMetaResolvablePriceQuantity` 

**Key Methods:**
- `getReference()` → `Reference` [Getter]
- `getValue()` → `ResolvablePriceQuantity` [Getter]
- `build()` → `ReferenceWithMetaResolvablePriceQuantity` [Builder]
- `getExternalReference()` → `String` [Getter]
- `setBuilderFields(ReferenceWithMetaResolvablePriceQuantityBuilder arg0)` → `void` [Setter]
- `getGlobalReference()` → `String` [Getter]

### ReferenceWithMetaResolvablePriceQuantityMeta
**Extends:** `BasicRosettaMetaData` 

