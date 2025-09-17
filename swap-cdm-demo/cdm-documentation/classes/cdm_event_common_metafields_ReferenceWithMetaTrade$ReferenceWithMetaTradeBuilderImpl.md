# ReferenceWithMetaTradeBuilderImpl

**Full Name:** `cdm.event.common.metafields.ReferenceWithMetaTrade$ReferenceWithMetaTradeBuilderImpl`

**Package:** `cdm.event.common.metafields`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.event.common.metafields.ReferenceWithMetaTrade$ReferenceWithMetaTradeBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| value | `TradeBuilder` |  |
| globalReference | `String` |  |
| externalReference | `String` |  |
| reference | `ReferenceBuilder` |  |

### Methods

#### Builder Methods

- `ReferenceWithMetaTrade build()`

#### Setter Methods

- `ReferenceWithMetaTradeBuilder setValue(Trade arg0)`
- `ReferenceWithMetaTradeBuilder setReference(Reference arg0)`
- `ReferenceWithMetaTradeBuilder setGlobalReference(String arg0)`
- `ReferenceWithMetaTradeBuilder setExternalReference(String arg0)`

#### Getter Methods

- `ReferenceBuilder getReference()`
- `TradeBuilder getValue()`
- `TradeBuilder getOrCreateValue()`
- `ReferenceBuilder getOrCreateReference()`
- `String getExternalReference()`
- `String getGlobalReference()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `ReferenceWithMetaTradeBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `ReferenceWithMetaTradeBuilder prune()`
- `ReferenceWithMetaTradeBuilder toBuilder()`
- `boolean hasData()`

