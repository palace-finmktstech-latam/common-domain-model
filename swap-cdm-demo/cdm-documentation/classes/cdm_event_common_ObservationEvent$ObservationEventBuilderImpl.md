# ObservationEventBuilderImpl

**Full Name:** `cdm.event.common.ObservationEvent$ObservationEventBuilderImpl`

**Package:** `cdm.event.common`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.event.common.ObservationEvent$ObservationEventBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| creditEvent | `CreditEventBuilder` |  |
| corporateAction | `CorporateActionBuilder` |  |

### Methods

#### Builder Methods

- `ObservationEvent build()`

#### Setter Methods

- `ObservationEventBuilder setCorporateAction(CorporateAction arg0)`
- `ObservationEventBuilder setCreditEvent(CreditEvent arg0)`

#### Getter Methods

- `CreditEventBuilder getOrCreateCreditEvent()`
- `CreditEventBuilder getCreditEvent()`
- `CorporateActionBuilder getOrCreateCorporateAction()`
- `CorporateActionBuilder getCorporateAction()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `ObservationEventBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `ObservationEventBuilder prune()`
- `ObservationEventBuilder toBuilder()`
- `boolean hasData()`

