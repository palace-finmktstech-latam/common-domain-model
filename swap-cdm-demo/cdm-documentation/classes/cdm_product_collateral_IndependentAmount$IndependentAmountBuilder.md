# IndependentAmountBuilder

**Full Name:** `cdm.product.collateral.IndependentAmount$IndependentAmountBuilder`

**Package:** `cdm.product.collateral`

## Type: Interface

### Implemented Interfaces

- `cdm.product.collateral.IndependentAmount`
- `cdm.base.staticdata.party.PartyReferencePayerReceiver$PartyReferencePayerReceiverBuilder`

### Methods

#### Setter Methods

- `IndependentAmountBuilder setPayerPartyReferenceValue(Party arg0)`
- `IndependentAmountBuilder setReceiverPartyReferenceValue(Party arg0)`
- `IndependentAmountBuilder setReceiverAccountReference(ReferenceWithMetaAccount arg0)`
- `IndependentAmountBuilder setReceiverAccountReferenceValue(Account arg0)`
- `IndependentAmountBuilder setPayerAccountReferenceValue(Account arg0)`
- `IndependentAmountBuilder setReceiverPartyReference(ReferenceWithMetaParty arg0)`
- `IndependentAmountBuilder setPayerPartyReference(ReferenceWithMetaParty arg0)`
- `IndependentAmountBuilder setPaymentDetail(List arg0)`
- `IndependentAmountBuilder setPayerAccountReference(ReferenceWithMetaAccount arg0)`

#### Getter Methods

- `List getPaymentDetail()`
- `PaymentDetailBuilder getOrCreatePaymentDetail(int arg0)`

#### Adder Methods

- `IndependentAmountBuilder addPaymentDetail(PaymentDetail arg0, int arg1)`
- `IndependentAmountBuilder addPaymentDetail(PaymentDetail arg0)`
- `IndependentAmountBuilder addPaymentDetail(List arg0)`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `IndependentAmountBuilder prune()`

