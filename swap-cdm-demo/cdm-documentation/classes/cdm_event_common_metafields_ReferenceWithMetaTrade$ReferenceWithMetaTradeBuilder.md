# ReferenceWithMetaTradeBuilder

**Full Name:** `cdm.event.common.metafields.ReferenceWithMetaTrade$ReferenceWithMetaTradeBuilder`

**Package:** `cdm.event.common.metafields`

## Type: Interface

### Implemented Interfaces

- `cdm.event.common.metafields.ReferenceWithMetaTrade`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`
- `com.rosetta.model.lib.meta.ReferenceWithMeta$ReferenceWithMetaBuilder`

### Methods

#### Setter Methods

- `ReferenceWithMetaTradeBuilder setValue(Trade arg0)`
- `ReferenceWithMetaTradeBuilder setExternalReference(String arg0)`
- `ReferenceWithMetaTradeBuilder setGlobalReference(String arg0)`
- `ReferenceWithMetaTradeBuilder setReference(Reference arg0)`

#### Getter Methods

- `ReferenceBuilder getReference()`
- `TradeBuilder getValue()`
- `TradeBuilder getOrCreateValue()`
- `ReferenceBuilder getOrCreateReference()`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `ReferenceWithMetaTradeBuilder prune()`

