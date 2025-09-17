# DividendDateReferenceBuilderImpl

**Full Name:** `cdm.product.asset.DividendDateReference$DividendDateReferenceBuilderImpl`

**Package:** `cdm.product.asset`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.product.asset.DividendDateReference$DividendDateReferenceBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| dateReference | `DividendDateReferenceEnum` |  |
| paymentDateOffset | `OffsetBuilder` |  |

### Methods

#### Builder Methods

- `DividendDateReference build()`

#### Setter Methods

- `DividendDateReferenceBuilder setDateReference(DividendDateReferenceEnum arg0)`
- `DividendDateReferenceBuilder setPaymentDateOffset(Offset arg0)`

#### Getter Methods

- `DividendDateReferenceEnum getDateReference()`
- `OffsetBuilder getPaymentDateOffset()`
- `OffsetBuilder getOrCreatePaymentDateOffset()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `DividendDateReferenceBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `DividendDateReferenceBuilder prune()`
- `DividendDateReferenceBuilder toBuilder()`
- `boolean hasData()`

