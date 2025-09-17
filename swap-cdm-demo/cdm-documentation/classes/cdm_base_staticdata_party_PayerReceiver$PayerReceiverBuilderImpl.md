# PayerReceiverBuilderImpl

**Full Name:** `cdm.base.staticdata.party.PayerReceiver$PayerReceiverBuilderImpl`

**Package:** `cdm.base.staticdata.party`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.base.staticdata.party.PayerReceiver$PayerReceiverBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| payer | `CounterpartyRoleEnum` |  |
| receiver | `CounterpartyRoleEnum` |  |

### Methods

#### Builder Methods

- `PayerReceiver build()`

#### Setter Methods

- `PayerReceiverBuilder setReceiver(CounterpartyRoleEnum arg0)`
- `PayerReceiverBuilder setPayer(CounterpartyRoleEnum arg0)`

#### Getter Methods

- `CounterpartyRoleEnum getReceiver()`
- `CounterpartyRoleEnum getPayer()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `PayerReceiverBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `PayerReceiverBuilder prune()`
- `PayerReceiverBuilder toBuilder()`
- `boolean hasData()`

