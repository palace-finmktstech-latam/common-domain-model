# TradeStateBuilder

**Full Name:** `cdm.event.common.TradeState$TradeStateBuilder`

**Package:** `cdm.event.common`

## Type: Interface

### Implemented Interfaces

- `cdm.event.common.TradeState`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`
- `com.rosetta.model.lib.GlobalKey$GlobalKeyBuilder`

### Methods

#### Setter Methods

- `TradeStateBuilder setState(State arg0)`
- `TradeStateBuilder setObservationHistory(List arg0)`
- `TradeStateBuilder setTransferHistory(List arg0)`
- `TradeStateBuilder setResetHistory(List arg0)`
- `TradeStateBuilder setValuationHistory(List arg0)`
- `TradeStateBuilder setMeta(MetaFields arg0)`
- `TradeStateBuilder setTrade(Trade arg0)`

#### Getter Methods

- `StateBuilder getState()`
- `StateBuilder getOrCreateState()`
- `MetaFieldsBuilder getOrCreateMeta()`
- `TradeBuilder getOrCreateTrade()`
- `List getResetHistory()`
- `ResetBuilder getOrCreateResetHistory(int arg0)`
- `List getTransferHistory()`
- `TransferStateBuilder getOrCreateTransferHistory(int arg0)`
- `List getObservationHistory()`
- `List getValuationHistory()`
- `TradeBuilder getTrade()`
- `MetaFieldsBuilder getMeta()`
- `ObservationEventBuilder getOrCreateObservationHistory(int arg0)`
- `ValuationBuilder getOrCreateValuationHistory(int arg0)`

#### Adder Methods

- `TradeStateBuilder addValuationHistory(Valuation arg0)`
- `TradeStateBuilder addValuationHistory(Valuation arg0, int arg1)`
- `TradeStateBuilder addValuationHistory(List arg0)`
- `TradeStateBuilder addObservationHistory(ObservationEvent arg0)`
- `TradeStateBuilder addObservationHistory(ObservationEvent arg0, int arg1)`
- `TradeStateBuilder addObservationHistory(List arg0)`
- `TradeStateBuilder addTransferHistory(List arg0)`
- `TradeStateBuilder addTransferHistory(TransferState arg0, int arg1)`
- `TradeStateBuilder addTransferHistory(TransferState arg0)`
- `TradeStateBuilder addResetHistory(Reset arg0, int arg1)`
- `TradeStateBuilder addResetHistory(Reset arg0)`
- `TradeStateBuilder addResetHistory(List arg0)`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `TradeStateBuilder prune()`

