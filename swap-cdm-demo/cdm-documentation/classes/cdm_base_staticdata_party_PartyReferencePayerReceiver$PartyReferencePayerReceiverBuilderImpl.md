# PartyReferencePayerReceiverBuilderImpl

**Full Name:** `cdm.base.staticdata.party.PartyReferencePayerReceiver$PartyReferencePayerReceiverBuilderImpl`

**Package:** `cdm.base.staticdata.party`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.base.staticdata.party.PartyReferencePayerReceiver$PartyReferencePayerReceiverBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| payerPartyReference | `ReferenceWithMetaPartyBuilder` |  |
| payerAccountReference | `ReferenceWithMetaAccountBuilder` |  |
| receiverPartyReference | `ReferenceWithMetaPartyBuilder` |  |
| receiverAccountReference | `ReferenceWithMetaAccountBuilder` |  |

### Methods

#### Builder Methods

- `PartyReferencePayerReceiver build()`

#### Setter Methods

- `PartyReferencePayerReceiverBuilder setPayerPartyReference(ReferenceWithMetaParty arg0)`
- `PartyReferencePayerReceiverBuilder setPayerAccountReference(ReferenceWithMetaAccount arg0)`
- `PartyReferencePayerReceiverBuilder setReceiverPartyReference(ReferenceWithMetaParty arg0)`
- `PartyReferencePayerReceiverBuilder setPayerPartyReferenceValue(Party arg0)`
- `PartyReferencePayerReceiverBuilder setReceiverPartyReferenceValue(Party arg0)`
- `PartyReferencePayerReceiverBuilder setReceiverAccountReference(ReferenceWithMetaAccount arg0)`
- `PartyReferencePayerReceiverBuilder setPayerAccountReferenceValue(Account arg0)`
- `PartyReferencePayerReceiverBuilder setReceiverAccountReferenceValue(Account arg0)`

#### Getter Methods

- `ReferenceWithMetaPartyBuilder getPayerPartyReference()`
- `ReferenceWithMetaPartyBuilder getReceiverPartyReference()`
- `ReferenceWithMetaAccountBuilder getPayerAccountReference()`
- `ReferenceWithMetaPartyBuilder getOrCreateReceiverPartyReference()`
- `ReferenceWithMetaPartyBuilder getOrCreatePayerPartyReference()`
- `ReferenceWithMetaAccountBuilder getOrCreateReceiverAccountReference()`
- `ReferenceWithMetaAccountBuilder getOrCreatePayerAccountReference()`
- `ReferenceWithMetaAccountBuilder getReceiverAccountReference()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `PartyReferencePayerReceiverBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `boolean hasData()`
- `PartyReferencePayerReceiverBuilder toBuilder()`
- `PartyReferencePayerReceiverBuilder prune()`

