# ObservationEventBuilder

**Full Name:** `cdm.event.common.ObservationEvent$ObservationEventBuilder`

**Package:** `cdm.event.common`

## Type: Interface

### Implemented Interfaces

- `cdm.event.common.ObservationEvent`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`

### Methods

#### Setter Methods

- `ObservationEventBuilder setCorporateAction(CorporateAction arg0)`
- `ObservationEventBuilder setCreditEvent(CreditEvent arg0)`

#### Getter Methods

- `CreditEventBuilder getOrCreateCreditEvent()`
- `CreditEventBuilder getCreditEvent()`
- `CorporateActionBuilder getOrCreateCorporateAction()`
- `CorporateActionBuilder getCorporateAction()`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `ObservationEventBuilder prune()`

