# TrancheBuilderImpl

**Full Name:** `cdm.product.asset.Tranche$TrancheBuilderImpl`

**Package:** `cdm.product.asset`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.product.asset.Tranche$TrancheBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| attachmentPoint | `BigDecimal` |  |
| exhaustionPoint | `BigDecimal` |  |
| incurredRecoveryApplicable | `Boolean` |  |

### Methods

#### Builder Methods

- `Tranche build()`

#### Setter Methods

- `TrancheBuilder setExhaustionPoint(BigDecimal arg0)`
- `TrancheBuilder setAttachmentPoint(BigDecimal arg0)`
- `TrancheBuilder setIncurredRecoveryApplicable(Boolean arg0)`

#### Getter Methods

- `BigDecimal getAttachmentPoint()`
- `BigDecimal getExhaustionPoint()`
- `Boolean getIncurredRecoveryApplicable()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `TrancheBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `TrancheBuilder prune()`
- `TrancheBuilder toBuilder()`
- `boolean hasData()`

