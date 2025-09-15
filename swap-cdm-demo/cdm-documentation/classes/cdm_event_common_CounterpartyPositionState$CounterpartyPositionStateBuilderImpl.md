# CounterpartyPositionStateBuilderImpl

**Full Name:** `cdm.event.common.CounterpartyPositionState$CounterpartyPositionStateBuilderImpl`

**Package:** `cdm.event.common`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.event.common.CounterpartyPositionState$CounterpartyPositionStateBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| counterpartyPosition | `CounterpartyPositionBuilder` |  |
| state | `StateBuilder` |  |
| observationHistory | `java.util.List<cdm.event.common.ObservationEvent$ObservationEventBuilder>` |  |
| valuationHistory | `java.util.List<cdm.event.common.Valuation$ValuationBuilder>` |  |
| meta | `MetaFieldsBuilder` |  |

### Methods

#### Builder Methods

- `CounterpartyPositionState build()`

#### Setter Methods

- `CounterpartyPositionStateBuilder setState(State arg0)`
- `CounterpartyPositionStateBuilder setCounterpartyPosition(CounterpartyPosition arg0)`
- `CounterpartyPositionStateBuilder setObservationHistory(List arg0)`
- `CounterpartyPositionStateBuilder setValuationHistory(List arg0)`
- `CounterpartyPositionStateBuilder setMeta(MetaFields arg0)`

#### Getter Methods

- `StateBuilder getState()`
- `StateBuilder getOrCreateState()`
- `MetaFieldsBuilder getOrCreateMeta()`
- `List getObservationHistory()`
- `List getValuationHistory()`
- `CounterpartyPositionBuilder getCounterpartyPosition()`
- `CounterpartyPositionBuilder getOrCreateCounterpartyPosition()`
- `MetaFieldsBuilder getMeta()`
- `ObservationEventBuilder getOrCreateObservationHistory(int arg0)`
- `ValuationBuilder getOrCreateValuationHistory(int arg0)`

#### Adder Methods

- `CounterpartyPositionStateBuilder addValuationHistory(Valuation arg0)`
- `CounterpartyPositionStateBuilder addValuationHistory(List arg0)`
- `CounterpartyPositionStateBuilder addValuationHistory(Valuation arg0, int arg1)`
- `CounterpartyPositionStateBuilder addObservationHistory(ObservationEvent arg0)`
- `CounterpartyPositionStateBuilder addObservationHistory(ObservationEvent arg0, int arg1)`
- `CounterpartyPositionStateBuilder addObservationHistory(List arg0)`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `CounterpartyPositionStateBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `boolean hasData()`
- `CounterpartyPositionStateBuilder toBuilder()`
- `CounterpartyPositionStateBuilder prune()`

