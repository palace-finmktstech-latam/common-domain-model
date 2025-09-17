# TradeStateBuilderImpl

**Full Name:** `cdm.event.common.TradeState$TradeStateBuilderImpl`

**Package:** `cdm.event.common`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.event.common.TradeState$TradeStateBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| trade | `TradeBuilder` |  |
| state | `StateBuilder` |  |
| resetHistory | `java.util.List<cdm.event.common.Reset$ResetBuilder>` |  |
| transferHistory | `java.util.List<cdm.event.common.TransferState$TransferStateBuilder>` |  |
| observationHistory | `java.util.List<cdm.event.common.ObservationEvent$ObservationEventBuilder>` |  |
| valuationHistory | `java.util.List<cdm.event.common.Valuation$ValuationBuilder>` |  |
| meta | `MetaFieldsBuilder` |  |

### Methods

#### Builder Methods

- `TradeState build()`

#### Setter Methods

- `TradeStateBuilder setState(State arg0)`
- `TradeStateBuilder setTransferHistory(List arg0)`
- `TradeStateBuilder setResetHistory(List arg0)`
- `TradeStateBuilder setValuationHistory(List arg0)`
- `TradeStateBuilder setObservationHistory(List arg0)`
- `TradeStateBuilder setTrade(Trade arg0)`
- `TradeStateBuilder setMeta(MetaFields arg0)`

#### Getter Methods

- `StateBuilder getState()`
- `TradeBuilder getOrCreateTrade()`
- `StateBuilder getOrCreateState()`
- `List getObservationHistory()`
- `List getTransferHistory()`
- `List getResetHistory()`
- `TransferStateBuilder getOrCreateTransferHistory(int arg0)`
- `ResetBuilder getOrCreateResetHistory(int arg0)`
- `List getValuationHistory()`
- `MetaFieldsBuilder getOrCreateMeta()`
- `ObservationEventBuilder getOrCreateObservationHistory(int arg0)`
- `ValuationBuilder getOrCreateValuationHistory(int arg0)`
- `TradeBuilder getTrade()`
- `MetaFieldsBuilder getMeta()`

#### Adder Methods

- `TradeStateBuilder addResetHistory(Reset arg0, int arg1)`
- `TradeStateBuilder addResetHistory(Reset arg0)`
- `TradeStateBuilder addResetHistory(List arg0)`
- `TradeStateBuilder addTransferHistory(TransferState arg0, int arg1)`
- `TradeStateBuilder addTransferHistory(List arg0)`
- `TradeStateBuilder addTransferHistory(TransferState arg0)`
- `TradeStateBuilder addObservationHistory(List arg0)`
- `TradeStateBuilder addObservationHistory(ObservationEvent arg0)`
- `TradeStateBuilder addObservationHistory(ObservationEvent arg0, int arg1)`
- `TradeStateBuilder addValuationHistory(Valuation arg0)`
- `TradeStateBuilder addValuationHistory(List arg0)`
- `TradeStateBuilder addValuationHistory(Valuation arg0, int arg1)`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `TradeStateBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `TradeStateBuilder prune()`
- `TradeStateBuilder toBuilder()`
- `boolean hasData()`

