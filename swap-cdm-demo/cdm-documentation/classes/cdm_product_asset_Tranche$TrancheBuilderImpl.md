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

- `TrancheBuilder setIncurredRecoveryApplicable(Boolean arg0)`
- `TrancheBuilder setExhaustionPoint(BigDecimal arg0)`
- `TrancheBuilder setAttachmentPoint(BigDecimal arg0)`

#### Getter Methods

- `Boolean getIncurredRecoveryApplicable()`
- `BigDecimal getAttachmentPoint()`
- `BigDecimal getExhaustionPoint()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `TrancheBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `boolean hasData()`
- `TrancheBuilder toBuilder()`
- `TrancheBuilder prune()`

