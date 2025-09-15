# ReferenceWithMetaTradeStateBuilderImpl

**Full Name:** `cdm.event.common.metafields.ReferenceWithMetaTradeState$ReferenceWithMetaTradeStateBuilderImpl`

**Package:** `cdm.event.common.metafields`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.event.common.metafields.ReferenceWithMetaTradeState$ReferenceWithMetaTradeStateBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| value | `TradeStateBuilder` |  |
| globalReference | `String` |  |
| externalReference | `String` |  |
| reference | `ReferenceBuilder` |  |

### Methods

#### Builder Methods

- `ReferenceWithMetaTradeState build()`

#### Setter Methods

- `ReferenceWithMetaTradeStateBuilder setValue(TradeState arg0)`
- `ReferenceWithMetaTradeStateBuilder setExternalReference(String arg0)`
- `ReferenceWithMetaTradeStateBuilder setGlobalReference(String arg0)`
- `ReferenceWithMetaTradeStateBuilder setReference(Reference arg0)`

#### Getter Methods

- `ReferenceBuilder getReference()`
- `TradeStateBuilder getValue()`
- `TradeStateBuilder getOrCreateValue()`
- `ReferenceBuilder getOrCreateReference()`
- `String getExternalReference()`
- `String getGlobalReference()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `ReferenceWithMetaTradeStateBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `boolean hasData()`
- `ReferenceWithMetaTradeStateBuilder toBuilder()`
- `ReferenceWithMetaTradeStateBuilder prune()`

