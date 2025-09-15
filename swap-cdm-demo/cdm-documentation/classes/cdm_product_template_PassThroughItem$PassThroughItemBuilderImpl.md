# PassThroughItemBuilderImpl

**Full Name:** `cdm.product.template.PassThroughItem$PassThroughItemBuilderImpl`

**Package:** `cdm.product.template`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.product.template.PassThroughItem$PassThroughItemBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| payerReceiver | `PayerReceiverBuilder` |  |
| passThroughPercentage | `BigDecimal` |  |

### Methods

#### Builder Methods

- `PassThroughItem build()`

#### Setter Methods

- `PassThroughItemBuilder setPayerReceiver(PayerReceiver arg0)`
- `PassThroughItemBuilder setPassThroughPercentage(BigDecimal arg0)`

#### Getter Methods

- `PayerReceiverBuilder getPayerReceiver()`
- `PayerReceiverBuilder getOrCreatePayerReceiver()`
- `BigDecimal getPassThroughPercentage()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `PassThroughItemBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `boolean hasData()`
- `PassThroughItemBuilder toBuilder()`
- `PassThroughItemBuilder prune()`

