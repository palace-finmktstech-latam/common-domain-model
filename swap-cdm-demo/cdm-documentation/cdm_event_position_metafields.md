# Package: cdm.event.position.metafields

## Interfaces

### ReferenceWithMetaPortfolioState
**Implements:** `RosettaModelObject` `ReferenceWithMeta` 

**Key Methods:**
- `getReference()` → `Reference` [Getter]
- `getValue()` → `PortfolioState` [Getter]
- `getType()` → `Class` [Getter]
- `build()` → `ReferenceWithMetaPortfolioState` [Builder]
- `getExternalReference()` → `String` [Getter]
- `getValueType()` → `Class` [Getter]
- `getGlobalReference()` → `String` [Getter]

### ReferenceWithMetaPortfolioStateBuilder
**Implements:** `ReferenceWithMetaPortfolioState` `RosettaModelObjectBuilder` `ReferenceWithMeta$ReferenceWithMetaBuilder` 

**Key Methods:**
- `getReference()` → `ReferenceBuilder` [Getter]
- `getValue()` → `PortfolioStateBuilder` [Getter]
- `setValue(PortfolioState arg0)` → `ReferenceWithMetaPortfolioStateBuilder` [Setter]
- `getOrCreateValue()` → `PortfolioStateBuilder` [Getter]
- `setExternalReference(String arg0)` → `ReferenceWithMetaPortfolioStateBuilder` [Setter]
- `setGlobalReference(String arg0)` → `ReferenceWithMetaPortfolioStateBuilder` [Setter]
- `getOrCreateReference()` → `ReferenceBuilder` [Getter]
- `setReference(Reference arg0)` → `ReferenceWithMetaPortfolioStateBuilder` [Setter]

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
- `getOrCreateValue()` → `PortfolioStateBuilder` [Getter]
- `setExternalReference(String arg0)` → `ReferenceWithMetaPortfolioStateBuilder` [Setter]
- `setGlobalReference(String arg0)` → `ReferenceWithMetaPortfolioStateBuilder` [Setter]
- `getOrCreateReference()` → `ReferenceBuilder` [Getter]
- `getExternalReference()` → `String` [Getter]
- `setReference(Reference arg0)` → `ReferenceWithMetaPortfolioStateBuilder` [Setter]

### ReferenceWithMetaPortfolioStateImpl
**Implements:** `ReferenceWithMetaPortfolioState` 

**Key Methods:**
- `getReference()` → `Reference` [Getter]
- `getValue()` → `PortfolioState` [Getter]
- `build()` → `ReferenceWithMetaPortfolioState` [Builder]
- `getExternalReference()` → `String` [Getter]
- `setBuilderFields(ReferenceWithMetaPortfolioStateBuilder arg0)` → `void` [Setter]
- `getGlobalReference()` → `String` [Getter]

### ReferenceWithMetaPortfolioStateMeta
**Extends:** `BasicRosettaMetaData` 

