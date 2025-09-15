# AggregationParametersBuilder

**Full Name:** `cdm.event.position.AggregationParameters$AggregationParametersBuilder`

**Package:** `cdm.event.position`

## Type: Interface

### Implemented Interfaces

- `cdm.event.position.AggregationParameters`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`

### Methods

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

- `ReferenceWithMetaTradeBuilder getOrCreateTradeReference(int arg0)`
- `NonTransferableProductBuilder getOrCreateProduct(int arg0)`
- `List getTradeReference()`
- `List getProduct()`
- `List getParty()`
- `ReferenceWithMetaPartyBuilder getOrCreateParty(int arg0)`

#### Adder Methods

- `AggregationParametersBuilder addParty(List arg0)`
- `AggregationParametersBuilder addParty(ReferenceWithMetaParty arg0, int arg1)`
- `AggregationParametersBuilder addParty(ReferenceWithMetaParty arg0)`
- `AggregationParametersBuilder addProductQualifier(List arg0)`
- `AggregationParametersBuilder addProductQualifier(String arg0, int arg1)`
- `AggregationParametersBuilder addProductQualifier(String arg0)`
- `AggregationParametersBuilder addPartyValue(List arg0)`
- `AggregationParametersBuilder addPartyValue(Party arg0, int arg1)`
- `AggregationParametersBuilder addPartyValue(Party arg0)`
- `AggregationParametersBuilder addProduct(List arg0)`
- `AggregationParametersBuilder addProduct(NonTransferableProduct arg0)`
- `AggregationParametersBuilder addProduct(NonTransferableProduct arg0, int arg1)`
- `AggregationParametersBuilder addTradeReference(List arg0)`
- `AggregationParametersBuilder addTradeReference(ReferenceWithMetaTrade arg0, int arg1)`
- `AggregationParametersBuilder addTradeReference(ReferenceWithMetaTrade arg0)`
- `AggregationParametersBuilder addTradeReferenceValue(List arg0)`
- `AggregationParametersBuilder addTradeReferenceValue(Trade arg0)`
- `AggregationParametersBuilder addTradeReferenceValue(Trade arg0, int arg1)`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `AggregationParametersBuilder prune()`

