# ReferenceWithMetaPaymentDatesBuilderImpl

**Full Name:** `cdm.product.common.schedule.metafields.ReferenceWithMetaPaymentDates$ReferenceWithMetaPaymentDatesBuilderImpl`

**Package:** `cdm.product.common.schedule.metafields`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.product.common.schedule.metafields.ReferenceWithMetaPaymentDates$ReferenceWithMetaPaymentDatesBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| value | `PaymentDatesBuilder` |  |
| globalReference | `String` |  |
| externalReference | `String` |  |
| reference | `ReferenceBuilder` |  |

### Methods

#### Builder Methods

- `ReferenceWithMetaPaymentDates build()`

#### Setter Methods

- `ReferenceWithMetaPaymentDatesBuilder setValue(PaymentDates arg0)`
- `ReferenceWithMetaPaymentDatesBuilder setExternalReference(String arg0)`
- `ReferenceWithMetaPaymentDatesBuilder setGlobalReference(String arg0)`
- `ReferenceWithMetaPaymentDatesBuilder setReference(Reference arg0)`

#### Getter Methods

- `ReferenceBuilder getReference()`
- `PaymentDatesBuilder getValue()`
- `PaymentDatesBuilder getOrCreateValue()`
- `ReferenceBuilder getOrCreateReference()`
- `String getExternalReference()`
- `String getGlobalReference()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `ReferenceWithMetaPaymentDatesBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `boolean hasData()`
- `ReferenceWithMetaPaymentDatesBuilder toBuilder()`
- `ReferenceWithMetaPaymentDatesBuilder prune()`

