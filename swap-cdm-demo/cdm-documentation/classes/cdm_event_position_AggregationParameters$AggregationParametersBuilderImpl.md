# AggregationParametersBuilderImpl

**Full Name:** `cdm.event.position.AggregationParameters$AggregationParametersBuilderImpl`

**Package:** `cdm.event.position`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.event.position.AggregationParameters$AggregationParametersBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| dateTime | `ZonedDateTime` |  |
| totalPosition | `Boolean` |  |
| positionStatus | `PositionStatusEnum` |  |
| party | `java.util.List<cdm.base.staticdata.party.metafields.ReferenceWithMetaParty$ReferenceWithMetaPartyBuilder>` |  |
| product | `java.util.List<cdm.product.template.NonTransferableProduct$NonTransferableProductBuilder>` |  |
| productQualifier | `java.util.List<java.lang.String>` |  |
| tradeReference | `java.util.List<cdm.event.common.metafields.ReferenceWithMetaTrade$ReferenceWithMetaTradeBuilder>` |  |

### Methods

#### Builder Methods

- `AggregationParameters build()`

#### Setter Methods

- `AggregationParametersBuilder setProductQualifier(List arg0)`
- `AggregationParametersBuilder setPartyValue(List arg0)`
- `AggregationParametersBuilder setDateTime(ZonedDateTime arg0)`
- `AggregationParametersBuilder setTotalPosition(Boolean arg0)`
- `AggregationParametersBuilder setPositionStatus(PositionStatusEnum arg0)`
- `AggregationParametersBuilder setProduct(List arg0)`
- `AggregationParametersBuilder setTradeReference(List arg0)`
- `AggregationParametersBuilder setTradeReferenceValue(List arg0)`
- `AggregationParametersBuilder setParty(List arg0)`

#### Getter Methods

- `List getProductQualifier()`
- `ZonedDateTime getDateTime()`
- `PositionStatusEnum getPositionStatus()`
- `Boolean getTotalPosition()`
- `ReferenceWithMetaTradeBuilder getOrCreateTradeReference(int arg0)`
- `NonTransferableProductBuilder getOrCreateProduct(int arg0)`
- `List getTradeReference()`
- `List getProduct()`
- `List getParty()`
- `ReferenceWithMetaPartyBuilder getOrCreateParty(int arg0)`

#### Adder Methods

- `AggregationParametersBuilder addParty(ReferenceWithMetaParty arg0, int arg1)`
- `AggregationParametersBuilder addParty(ReferenceWithMetaParty arg0)`
- `AggregationParametersBuilder addParty(List arg0)`
- `AggregationParametersBuilder addProductQualifier(String arg0)`
- `AggregationParametersBuilder addProductQualifier(String arg0, int arg1)`
- `AggregationParametersBuilder addProductQualifier(List arg0)`
- `AggregationParametersBuilder addPartyValue(Party arg0, int arg1)`
- `AggregationParametersBuilder addPartyValue(List arg0)`
- `AggregationParametersBuilder addPartyValue(Party arg0)`
- `AggregationParametersBuilder addProduct(NonTransferableProduct arg0)`
- `AggregationParametersBuilder addProduct(NonTransferableProduct arg0, int arg1)`
- `AggregationParametersBuilder addProduct(List arg0)`
- `AggregationParametersBuilder addTradeReference(List arg0)`
- `AggregationParametersBuilder addTradeReference(ReferenceWithMetaTrade arg0)`
- `AggregationParametersBuilder addTradeReference(ReferenceWithMetaTrade arg0, int arg1)`
- `AggregationParametersBuilder addTradeReferenceValue(Trade arg0, int arg1)`
- `AggregationParametersBuilder addTradeReferenceValue(Trade arg0)`
- `AggregationParametersBuilder addTradeReferenceValue(List arg0)`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `AggregationParametersBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `boolean hasData()`
- `AggregationParametersBuilder toBuilder()`
- `AggregationParametersBuilder prune()`

