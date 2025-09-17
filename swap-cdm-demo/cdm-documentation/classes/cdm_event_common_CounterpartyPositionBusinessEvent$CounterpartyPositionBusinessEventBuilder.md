# CounterpartyPositionBusinessEventBuilder

**Full Name:** `cdm.event.common.CounterpartyPositionBusinessEvent$CounterpartyPositionBusinessEventBuilder`

**Package:** `cdm.event.common`

## Type: Interface

### Implemented Interfaces

- `cdm.event.common.CounterpartyPositionBusinessEvent`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`

### Methods

#### Setter Methods

- `CounterpartyPositionBusinessEventBuilder setEventDate(Date arg0)`
- `CounterpartyPositionBusinessEventBuilder setIntent(PositionEventIntentEnum arg0)`
- `CounterpartyPositionBusinessEventBuilder setPackageInformation(IdentifiedList arg0)`
- `CounterpartyPositionBusinessEventBuilder setCorporateActionIntent(CorporateActionTypeEnum arg0)`
- `CounterpartyPositionBusinessEventBuilder setAfter(List arg0)`
- `CounterpartyPositionBusinessEventBuilder setEffectiveDate(Date arg0)`

#### Getter Methods

- `IdentifiedListBuilder getOrCreatePackageInformation()`
- `IdentifiedListBuilder getPackageInformation()`
- `List getAfter()`
- `CounterpartyPositionStateBuilder getOrCreateAfter(int arg0)`

#### Adder Methods

- `CounterpartyPositionBusinessEventBuilder addAfter(List arg0)`
- `CounterpartyPositionBusinessEventBuilder addAfter(CounterpartyPositionState arg0, int arg1)`
- `CounterpartyPositionBusinessEventBuilder addAfter(CounterpartyPositionState arg0)`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `CounterpartyPositionBusinessEventBuilder prune()`

