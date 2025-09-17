# Package: cdm.product.common.schedule.metafields

## Interfaces

### ReferenceWithMetaCalculationPeriodDates
**Implements:** `RosettaModelObject` `ReferenceWithMeta` 

**Key Methods:**
- `getReference()` → `Reference` [Getter]
- `getValue()` → `CalculationPeriodDates` [Getter]
- `getType()` → `Class` [Getter]
- `build()` → `ReferenceWithMetaCalculationPeriodDates` [Builder]
- `getValueType()` → `Class` [Getter]
- `getExternalReference()` → `String` [Getter]
- `getGlobalReference()` → `String` [Getter]

### ReferenceWithMetaCalculationPeriodDatesBuilder
**Implements:** `ReferenceWithMetaCalculationPeriodDates` `RosettaModelObjectBuilder` `ReferenceWithMeta$ReferenceWithMetaBuilder` 

**Key Methods:**
- `getReference()` → `ReferenceBuilder` [Getter]
- `getValue()` → `CalculationPeriodDatesBuilder` [Getter]
- `setValue(CalculationPeriodDates arg0)` → `ReferenceWithMetaCalculationPeriodDatesBuilder` [Setter]
- `setReference(Reference arg0)` → `ReferenceWithMetaCalculationPeriodDatesBuilder` [Setter]
- `setGlobalReference(String arg0)` → `ReferenceWithMetaCalculationPeriodDatesBuilder` [Setter]
- `getOrCreateValue()` → `CalculationPeriodDatesBuilder` [Getter]
- `setExternalReference(String arg0)` → `ReferenceWithMetaCalculationPeriodDatesBuilder` [Setter]
- `getOrCreateReference()` → `ReferenceBuilder` [Getter]

### ReferenceWithMetaPaymentDates
**Implements:** `RosettaModelObject` `ReferenceWithMeta` 

**Key Methods:**
- `getReference()` → `Reference` [Getter]
- `getValue()` → `PaymentDates` [Getter]
- `getType()` → `Class` [Getter]
- `build()` → `ReferenceWithMetaPaymentDates` [Builder]
- `getValueType()` → `Class` [Getter]
- `getExternalReference()` → `String` [Getter]
- `getGlobalReference()` → `String` [Getter]

### ReferenceWithMetaPaymentDatesBuilder
**Implements:** `ReferenceWithMetaPaymentDates` `RosettaModelObjectBuilder` `ReferenceWithMeta$ReferenceWithMetaBuilder` 

**Key Methods:**
- `getReference()` → `ReferenceBuilder` [Getter]
- `getValue()` → `PaymentDatesBuilder` [Getter]
- `setValue(PaymentDates arg0)` → `ReferenceWithMetaPaymentDatesBuilder` [Setter]
- `setReference(Reference arg0)` → `ReferenceWithMetaPaymentDatesBuilder` [Setter]
- `setGlobalReference(String arg0)` → `ReferenceWithMetaPaymentDatesBuilder` [Setter]
- `getOrCreateValue()` → `PaymentDatesBuilder` [Getter]
- `setExternalReference(String arg0)` → `ReferenceWithMetaPaymentDatesBuilder` [Setter]
- `getOrCreateReference()` → `ReferenceBuilder` [Getter]

## Concrete Classes

### ReferenceWithMetaCalculationPeriodDatesBuilderImpl
**Implements:** `ReferenceWithMetaCalculationPeriodDates$ReferenceWithMetaCalculationPeriodDatesBuilder` 

**Fields:**
- `CalculationPeriodDatesBuilder value`
- `String globalReference`
- `String externalReference`
- `ReferenceBuilder reference`

**Key Methods:**
- `getReference()` → `ReferenceBuilder` [Getter]
- `getValue()` → `CalculationPeriodDatesBuilder` [Getter]
- `setValue(CalculationPeriodDates arg0)` → `ReferenceWithMetaCalculationPeriodDatesBuilder` [Setter]
- `build()` → `ReferenceWithMetaCalculationPeriodDates` [Builder]
- `setReference(Reference arg0)` → `ReferenceWithMetaCalculationPeriodDatesBuilder` [Setter]
- `setGlobalReference(String arg0)` → `ReferenceWithMetaCalculationPeriodDatesBuilder` [Setter]
- `getOrCreateValue()` → `CalculationPeriodDatesBuilder` [Getter]
- `setExternalReference(String arg0)` → `ReferenceWithMetaCalculationPeriodDatesBuilder` [Setter]
- `getOrCreateReference()` → `ReferenceBuilder` [Getter]
- `getExternalReference()` → `String` [Getter]

### ReferenceWithMetaCalculationPeriodDatesImpl
**Implements:** `ReferenceWithMetaCalculationPeriodDates` 

**Key Methods:**
- `getReference()` → `Reference` [Getter]
- `getValue()` → `CalculationPeriodDates` [Getter]
- `build()` → `ReferenceWithMetaCalculationPeriodDates` [Builder]
- `setBuilderFields(ReferenceWithMetaCalculationPeriodDatesBuilder arg0)` → `void` [Setter]
- `getExternalReference()` → `String` [Getter]
- `getGlobalReference()` → `String` [Getter]

### ReferenceWithMetaCalculationPeriodDatesMeta
**Extends:** `BasicRosettaMetaData` 

### ReferenceWithMetaPaymentDatesBuilderImpl
**Implements:** `ReferenceWithMetaPaymentDates$ReferenceWithMetaPaymentDatesBuilder` 

**Fields:**
- `PaymentDatesBuilder value`
- `String globalReference`
- `String externalReference`
- `ReferenceBuilder reference`

**Key Methods:**
- `getReference()` → `ReferenceBuilder` [Getter]
- `getValue()` → `PaymentDatesBuilder` [Getter]
- `setValue(PaymentDates arg0)` → `ReferenceWithMetaPaymentDatesBuilder` [Setter]
- `build()` → `ReferenceWithMetaPaymentDates` [Builder]
- `setReference(Reference arg0)` → `ReferenceWithMetaPaymentDatesBuilder` [Setter]
- `setGlobalReference(String arg0)` → `ReferenceWithMetaPaymentDatesBuilder` [Setter]
- `getOrCreateValue()` → `PaymentDatesBuilder` [Getter]
- `setExternalReference(String arg0)` → `ReferenceWithMetaPaymentDatesBuilder` [Setter]
- `getOrCreateReference()` → `ReferenceBuilder` [Getter]
- `getExternalReference()` → `String` [Getter]

### ReferenceWithMetaPaymentDatesImpl
**Implements:** `ReferenceWithMetaPaymentDates` 

**Key Methods:**
- `getReference()` → `Reference` [Getter]
- `getValue()` → `PaymentDates` [Getter]
- `build()` → `ReferenceWithMetaPaymentDates` [Builder]
- `setBuilderFields(ReferenceWithMetaPaymentDatesBuilder arg0)` → `void` [Setter]
- `getExternalReference()` → `String` [Getter]
- `getGlobalReference()` → `String` [Getter]

### ReferenceWithMetaPaymentDatesMeta
**Extends:** `BasicRosettaMetaData` 

