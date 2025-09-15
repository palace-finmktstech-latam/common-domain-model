# ObservationEventBuilder

**Full Name:** `cdm.event.common.ObservationEvent$ObservationEventBuilder`

**Package:** `cdm.event.common`

## Type: Interface

### Implemented Interfaces

- `cdm.event.common.ObservationEvent`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`

### Methods

#### Setter Methods

- `ObservationEventBuilder setCreditEvent(CreditEvent arg0)`
- `ObservationEventBuilder setCorporateAction(CorporateAction arg0)`

#### Getter Methods

- `CorporateActionBuilder getOrCreateCorporateAction()`
- `CreditEventBuilder getCreditEvent()`
- `CreditEventBuilder getOrCreateCreditEvent()`
- `CorporateActionBuilder getCorporateAction()`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `ObservationEventBuilder prune()`

