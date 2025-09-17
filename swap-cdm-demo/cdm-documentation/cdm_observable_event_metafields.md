# Package: cdm.observable.event.metafields

## Interfaces

### FieldWithMetaMarketDisruptionEnum
**Implements:** `RosettaModelObject` `FieldWithMeta` `GlobalKey` 

**Key Methods:**
- `getValue()` → `MarketDisruptionEnum` [Getter]
- `getType()` → `Class` [Getter]
- `build()` → `FieldWithMetaMarketDisruptionEnum` [Builder]
- `getValueType()` → `Class` [Getter]
- `getMeta()` → `MetaFields` [Getter]

### FieldWithMetaMarketDisruptionEnumBuilder
**Implements:** `FieldWithMetaMarketDisruptionEnum` `RosettaModelObjectBuilder` `FieldWithMeta$FieldWithMetaBuilder` `GlobalKey$GlobalKeyBuilder` 

**Key Methods:**
- `setValue(MarketDisruptionEnum arg0)` → `FieldWithMetaMarketDisruptionEnumBuilder` [Setter]
- `getOrCreateMeta()` → `MetaFieldsBuilder` [Getter]
- `getMeta()` → `MetaFieldsBuilder` [Getter]
- `setMeta(MetaFields arg0)` → `FieldWithMetaMarketDisruptionEnumBuilder` [Setter]

### FieldWithMetaRestructuringEnum
**Implements:** `RosettaModelObject` `FieldWithMeta` `GlobalKey` 

**Key Methods:**
- `getValue()` → `RestructuringEnum` [Getter]
- `getType()` → `Class` [Getter]
- `build()` → `FieldWithMetaRestructuringEnum` [Builder]
- `getValueType()` → `Class` [Getter]
- `getMeta()` → `MetaFields` [Getter]

### FieldWithMetaRestructuringEnumBuilder
**Implements:** `FieldWithMetaRestructuringEnum` `RosettaModelObjectBuilder` `FieldWithMeta$FieldWithMetaBuilder` `GlobalKey$GlobalKeyBuilder` 

**Key Methods:**
- `setValue(RestructuringEnum arg0)` → `FieldWithMetaRestructuringEnumBuilder` [Setter]
- `getOrCreateMeta()` → `MetaFieldsBuilder` [Getter]
- `getMeta()` → `MetaFieldsBuilder` [Getter]
- `setMeta(MetaFields arg0)` → `FieldWithMetaRestructuringEnumBuilder` [Setter]

### ReferenceWithMetaCreditEvents
**Implements:** `RosettaModelObject` `ReferenceWithMeta` 

**Key Methods:**
- `getReference()` → `Reference` [Getter]
- `getValue()` → `CreditEvents` [Getter]
- `getType()` → `Class` [Getter]
- `build()` → `ReferenceWithMetaCreditEvents` [Builder]
- `getValueType()` → `Class` [Getter]
- `getExternalReference()` → `String` [Getter]
- `getGlobalReference()` → `String` [Getter]

### ReferenceWithMetaCreditEventsBuilder
**Implements:** `ReferenceWithMetaCreditEvents` `RosettaModelObjectBuilder` `ReferenceWithMeta$ReferenceWithMetaBuilder` 

**Key Methods:**
- `getReference()` → `ReferenceBuilder` [Getter]
- `getValue()` → `CreditEventsBuilder` [Getter]
- `setValue(CreditEvents arg0)` → `ReferenceWithMetaCreditEventsBuilder` [Setter]
- `setReference(Reference arg0)` → `ReferenceWithMetaCreditEventsBuilder` [Setter]
- `setGlobalReference(String arg0)` → `ReferenceWithMetaCreditEventsBuilder` [Setter]
- `getOrCreateValue()` → `CreditEventsBuilder` [Getter]
- `setExternalReference(String arg0)` → `ReferenceWithMetaCreditEventsBuilder` [Setter]
- `getOrCreateReference()` → `ReferenceBuilder` [Getter]

### ReferenceWithMetaObservation
**Implements:** `RosettaModelObject` `ReferenceWithMeta` 

**Key Methods:**
- `getReference()` → `Reference` [Getter]
- `getValue()` → `Observation` [Getter]
- `getType()` → `Class` [Getter]
- `build()` → `ReferenceWithMetaObservation` [Builder]
- `getValueType()` → `Class` [Getter]
- `getExternalReference()` → `String` [Getter]
- `getGlobalReference()` → `String` [Getter]

### ReferenceWithMetaObservationBuilder
**Implements:** `ReferenceWithMetaObservation` `RosettaModelObjectBuilder` `ReferenceWithMeta$ReferenceWithMetaBuilder` 

**Key Methods:**
- `getReference()` → `ReferenceBuilder` [Getter]
- `getValue()` → `ObservationBuilder` [Getter]
- `setValue(Observation arg0)` → `ReferenceWithMetaObservationBuilder` [Setter]
- `setReference(Reference arg0)` → `ReferenceWithMetaObservationBuilder` [Setter]
- `setGlobalReference(String arg0)` → `ReferenceWithMetaObservationBuilder` [Setter]
- `getOrCreateValue()` → `ObservationBuilder` [Getter]
- `setExternalReference(String arg0)` → `ReferenceWithMetaObservationBuilder` [Setter]
- `getOrCreateReference()` → `ReferenceBuilder` [Getter]

## Concrete Classes

### FieldWithMetaMarketDisruptionEnumBuilderImpl
**Implements:** `FieldWithMetaMarketDisruptionEnum$FieldWithMetaMarketDisruptionEnumBuilder` 

**Fields:**
- `MarketDisruptionEnum value`
- `MetaFieldsBuilder meta`

**Key Methods:**
- `getValue()` → `MarketDisruptionEnum` [Getter]
- `setValue(MarketDisruptionEnum arg0)` → `FieldWithMetaMarketDisruptionEnumBuilder` [Setter]
- `build()` → `FieldWithMetaMarketDisruptionEnum` [Builder]
- `getOrCreateMeta()` → `MetaFieldsBuilder` [Getter]
- `getMeta()` → `MetaFieldsBuilder` [Getter]
- `setMeta(MetaFields arg0)` → `FieldWithMetaMarketDisruptionEnumBuilder` [Setter]

### FieldWithMetaMarketDisruptionEnumImpl
**Implements:** `FieldWithMetaMarketDisruptionEnum` 

**Key Methods:**
- `getValue()` → `MarketDisruptionEnum` [Getter]
- `build()` → `FieldWithMetaMarketDisruptionEnum` [Builder]
- `setBuilderFields(FieldWithMetaMarketDisruptionEnumBuilder arg0)` → `void` [Setter]
- `getMeta()` → `MetaFields` [Getter]

### FieldWithMetaMarketDisruptionEnumMeta
**Extends:** `BasicRosettaMetaData` 

### FieldWithMetaRestructuringEnumBuilderImpl
**Implements:** `FieldWithMetaRestructuringEnum$FieldWithMetaRestructuringEnumBuilder` 

**Fields:**
- `RestructuringEnum value`
- `MetaFieldsBuilder meta`

**Key Methods:**
- `getValue()` → `RestructuringEnum` [Getter]
- `setValue(RestructuringEnum arg0)` → `FieldWithMetaRestructuringEnumBuilder` [Setter]
- `build()` → `FieldWithMetaRestructuringEnum` [Builder]
- `getOrCreateMeta()` → `MetaFieldsBuilder` [Getter]
- `getMeta()` → `MetaFieldsBuilder` [Getter]
- `setMeta(MetaFields arg0)` → `FieldWithMetaRestructuringEnumBuilder` [Setter]

### FieldWithMetaRestructuringEnumImpl
**Implements:** `FieldWithMetaRestructuringEnum` 

**Key Methods:**
- `getValue()` → `RestructuringEnum` [Getter]
- `build()` → `FieldWithMetaRestructuringEnum` [Builder]
- `setBuilderFields(FieldWithMetaRestructuringEnumBuilder arg0)` → `void` [Setter]
- `getMeta()` → `MetaFields` [Getter]

### FieldWithMetaRestructuringEnumMeta
**Extends:** `BasicRosettaMetaData` 

### ReferenceWithMetaCreditEventsBuilderImpl
**Implements:** `ReferenceWithMetaCreditEvents$ReferenceWithMetaCreditEventsBuilder` 

**Fields:**
- `CreditEventsBuilder value`
- `String globalReference`
- `String externalReference`
- `ReferenceBuilder reference`

**Key Methods:**
- `getReference()` → `ReferenceBuilder` [Getter]
- `getValue()` → `CreditEventsBuilder` [Getter]
- `setValue(CreditEvents arg0)` → `ReferenceWithMetaCreditEventsBuilder` [Setter]
- `build()` → `ReferenceWithMetaCreditEvents` [Builder]
- `setReference(Reference arg0)` → `ReferenceWithMetaCreditEventsBuilder` [Setter]
- `setGlobalReference(String arg0)` → `ReferenceWithMetaCreditEventsBuilder` [Setter]
- `getOrCreateValue()` → `CreditEventsBuilder` [Getter]
- `setExternalReference(String arg0)` → `ReferenceWithMetaCreditEventsBuilder` [Setter]
- `getOrCreateReference()` → `ReferenceBuilder` [Getter]
- `getExternalReference()` → `String` [Getter]

### ReferenceWithMetaCreditEventsImpl
**Implements:** `ReferenceWithMetaCreditEvents` 

**Key Methods:**
- `getReference()` → `Reference` [Getter]
- `getValue()` → `CreditEvents` [Getter]
- `build()` → `ReferenceWithMetaCreditEvents` [Builder]
- `setBuilderFields(ReferenceWithMetaCreditEventsBuilder arg0)` → `void` [Setter]
- `getExternalReference()` → `String` [Getter]
- `getGlobalReference()` → `String` [Getter]

### ReferenceWithMetaCreditEventsMeta
**Extends:** `BasicRosettaMetaData` 

### ReferenceWithMetaObservationBuilderImpl
**Implements:** `ReferenceWithMetaObservation$ReferenceWithMetaObservationBuilder` 

**Fields:**
- `ObservationBuilder value`
- `String globalReference`
- `String externalReference`
- `ReferenceBuilder reference`

**Key Methods:**
- `getReference()` → `ReferenceBuilder` [Getter]
- `getValue()` → `ObservationBuilder` [Getter]
- `setValue(Observation arg0)` → `ReferenceWithMetaObservationBuilder` [Setter]
- `build()` → `ReferenceWithMetaObservation` [Builder]
- `setReference(Reference arg0)` → `ReferenceWithMetaObservationBuilder` [Setter]
- `setGlobalReference(String arg0)` → `ReferenceWithMetaObservationBuilder` [Setter]
- `getOrCreateValue()` → `ObservationBuilder` [Getter]
- `setExternalReference(String arg0)` → `ReferenceWithMetaObservationBuilder` [Setter]
- `getOrCreateReference()` → `ReferenceBuilder` [Getter]
- `getExternalReference()` → `String` [Getter]

### ReferenceWithMetaObservationImpl
**Implements:** `ReferenceWithMetaObservation` 

**Key Methods:**
- `getReference()` → `Reference` [Getter]
- `getValue()` → `Observation` [Getter]
- `build()` → `ReferenceWithMetaObservation` [Builder]
- `setBuilderFields(ReferenceWithMetaObservationBuilder arg0)` → `void` [Setter]
- `getExternalReference()` → `String` [Getter]
- `getGlobalReference()` → `String` [Getter]

### ReferenceWithMetaObservationMeta
**Extends:** `BasicRosettaMetaData` 

