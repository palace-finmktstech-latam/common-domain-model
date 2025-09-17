# AdditionalFixedPaymentsBuilderImpl

**Full Name:** `cdm.product.asset.AdditionalFixedPayments$AdditionalFixedPaymentsBuilderImpl`

**Package:** `cdm.product.asset`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.product.asset.AdditionalFixedPayments$AdditionalFixedPaymentsBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| interestShortfallReimbursement | `Boolean` |  |
| principalShortfallReimbursement | `Boolean` |  |
| writedownReimbursement | `Boolean` |  |

### Methods

#### Builder Methods

- `AdditionalFixedPayments build()`

#### Setter Methods

- `AdditionalFixedPaymentsBuilder setWritedownReimbursement(Boolean arg0)`
- `AdditionalFixedPaymentsBuilder setPrincipalShortfallReimbursement(Boolean arg0)`
- `AdditionalFixedPaymentsBuilder setInterestShortfallReimbursement(Boolean arg0)`

#### Getter Methods

- `Boolean getPrincipalShortfallReimbursement()`
- `Boolean getInterestShortfallReimbursement()`
- `Boolean getWritedownReimbursement()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `AdditionalFixedPaymentsBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `AdditionalFixedPaymentsBuilder prune()`
- `AdditionalFixedPaymentsBuilder toBuilder()`
- `boolean hasData()`

