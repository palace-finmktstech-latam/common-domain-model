# PartyReferencePayerReceiverBuilder

**Full Name:** `cdm.base.staticdata.party.PartyReferencePayerReceiver$PartyReferencePayerReceiverBuilder`

**Package:** `cdm.base.staticdata.party`

## Type: Interface

### Implemented Interfaces

- `cdm.base.staticdata.party.PartyReferencePayerReceiver`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`

### Methods

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

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `PartyReferencePayerReceiverBuilder prune()`

