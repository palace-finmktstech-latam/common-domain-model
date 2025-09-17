# Package: cdm.event.position.metafields

## Interfaces

### ReferenceWithMetaPortfolioState
**Implements:** `RosettaModelObject` `ReferenceWithMeta` 

**Key Methods:**
- `getReference()` → `Reference` [Getter]
- `getValue()` → `PortfolioState` [Getter]
- `getType()` → `Class` [Getter]
- `build()` → `ReferenceWithMetaPortfolioState` [Builder]
- `getValueType()` → `Class` [Getter]
- `getExternalReference()` → `String` [Getter]
- `getGlobalReference()` → `String` [Getter]

### ReferenceWithMetaPortfolioStateBuilder
**Implements:** `ReferenceWithMetaPortfolioState` `RosettaModelObjectBuilder` `ReferenceWithMeta$ReferenceWithMetaBuilder` 

**Key Methods:**
- `getReference()` → `ReferenceBuilder` [Getter]
- `getValue()` → `PortfolioStateBuilder` [Getter]
- `setValue(PortfolioState arg0)` → `ReferenceWithMetaPortfolioStateBuilder` [Setter]
- `setReference(Reference arg0)` → `ReferenceWithMetaPortfolioStateBuilder` [Setter]
- `setGlobalReference(String arg0)` → `ReferenceWithMetaPortfolioStateBuilder` [Setter]
- `getOrCreateValue()` → `PortfolioStateBuilder` [Getter]
- `setExternalReference(String arg0)` → `ReferenceWithMetaPortfolioStateBuilder` [Setter]
- `getOrCreateReference()` → `ReferenceBuilder` [Getter]

## Concrete Classes

### ReferenceWithMetaPortfolioStateBuilderImpl
**Implements:** `ReferenceWithMetaPortfolioState$ReferenceWithMetaPortfolioStateBuilder` 

**Fields:**
- `PortfolioStateBuilder value`
- `String globalReference`
- `String externalReference`
- `ReferenceBuilder reference`

**Key Methods:**
- `getReference()` → `ReferenceBuilder` [Getter]
- `getValue()` → `PortfolioStateBuilder` [Getter]
- `setValue(PortfolioState arg0)` → `ReferenceWithMetaPortfolioStateBuilder` [Setter]
- `build()` → `ReferenceWithMetaPortfolioState` [Builder]
- `setReference(Reference arg0)` → `ReferenceWithMetaPortfolioStateBuilder` [Setter]
- `setGlobalReference(String arg0)` → `ReferenceWithMetaPortfolioStateBuilder` [Setter]
- `getOrCreateValue()` → `PortfolioStateBuilder` [Getter]
- `setExternalReference(String arg0)` → `ReferenceWithMetaPortfolioStateBuilder` [Setter]
- `getOrCreateReference()` → `ReferenceBuilder` [Getter]
- `getExternalReference()` → `String` [Getter]

### ReferenceWithMetaPortfolioStateImpl
**Implements:** `ReferenceWithMetaPortfolioState` 

**Key Methods:**
- `getReference()` → `Reference` [Getter]
- `getValue()` → `PortfolioState` [Getter]
- `build()` → `ReferenceWithMetaPortfolioState` [Builder]
- `setBuilderFields(ReferenceWithMetaPortfolioStateBuilder arg0)` → `void` [Setter]
- `getExternalReference()` → `String` [Getter]
- `getGlobalReference()` → `String` [Getter]

### ReferenceWithMetaPortfolioStateMeta
**Extends:** `BasicRosettaMetaData` 

