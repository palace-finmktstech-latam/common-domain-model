# ReferenceWithMetaTradeStateBuilder

**Full Name:** `cdm.event.common.metafields.ReferenceWithMetaTradeState$ReferenceWithMetaTradeStateBuilder`

**Package:** `cdm.event.common.metafields`

## Type: Interface

### Implemented Interfaces

- `cdm.event.common.metafields.ReferenceWithMetaTradeState`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`
- `com.rosetta.model.lib.meta.ReferenceWithMeta$ReferenceWithMetaBuilder`

### Methods

#### Setter Methods

- `ReferenceWithMetaTradeStateBuilder setValue(TradeState arg0)`
- `ReferenceWithMetaTradeStateBuilder setReference(Reference arg0)`
- `ReferenceWithMetaTradeStateBuilder setGlobalReference(String arg0)`
- `ReferenceWithMetaTradeStateBuilder setExternalReference(String arg0)`

#### Getter Methods

- `ReferenceBuilder getReference()`
- `TradeStateBuilder getValue()`
- `TradeStateBuilder getOrCreateValue()`
- `ReferenceBuilder getOrCreateReference()`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `ReferenceWithMetaTradeStateBuilder prune()`

