# CounterpartyPositionStateBuilder

**Full Name:** `cdm.event.common.CounterpartyPositionState$CounterpartyPositionStateBuilder`

**Package:** `cdm.event.common`

## Type: Interface

### Implemented Interfaces

- `cdm.event.common.CounterpartyPositionState`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`
- `com.rosetta.model.lib.GlobalKey$GlobalKeyBuilder`

### Methods

#### Setter Methods

- `CounterpartyPositionStateBuilder setState(State arg0)`
- `CounterpartyPositionStateBuilder setValuationHistory(List arg0)`
- `CounterpartyPositionStateBuilder setObservationHistory(List arg0)`
- `CounterpartyPositionStateBuilder setCounterpartyPosition(CounterpartyPosition arg0)`
- `CounterpartyPositionStateBuilder setMeta(MetaFields arg0)`

#### Getter Methods

- `StateBuilder getState()`
- `StateBuilder getOrCreateState()`
- `List getObservationHistory()`
- `List getValuationHistory()`
- `MetaFieldsBuilder getOrCreateMeta()`
- `CounterpartyPositionBuilder getCounterpartyPosition()`
- `ObservationEventBuilder getOrCreateObservationHistory(int arg0)`
- `ValuationBuilder getOrCreateValuationHistory(int arg0)`
- `MetaFieldsBuilder getMeta()`
- `CounterpartyPositionBuilder getOrCreateCounterpartyPosition()`

#### Adder Methods

- `CounterpartyPositionStateBuilder addObservationHistory(List arg0)`
- `CounterpartyPositionStateBuilder addObservationHistory(ObservationEvent arg0)`
- `CounterpartyPositionStateBuilder addObservationHistory(ObservationEvent arg0, int arg1)`
- `CounterpartyPositionStateBuilder addValuationHistory(List arg0)`
- `CounterpartyPositionStateBuilder addValuationHistory(Valuation arg0, int arg1)`
- `CounterpartyPositionStateBuilder addValuationHistory(Valuation arg0)`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `CounterpartyPositionStateBuilder prune()`

