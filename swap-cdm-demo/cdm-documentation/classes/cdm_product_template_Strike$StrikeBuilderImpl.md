# StrikeBuilderImpl

**Full Name:** `cdm.product.template.Strike$StrikeBuilderImpl`

**Package:** `cdm.product.template`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.product.template.Strike$StrikeBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| strikeRate | `BigDecimal` |  |
| buyer | `PayerReceiverEnum` |  |
| seller | `PayerReceiverEnum` |  |
| meta | `MetaFieldsBuilder` |  |

### Methods

#### Builder Methods

- `Strike build()`

#### Setter Methods

- `StrikeBuilder setMeta(MetaFields arg0)`
- `StrikeBuilder setStrikeRate(BigDecimal arg0)`
- `StrikeBuilder setBuyer(PayerReceiverEnum arg0)`
- `StrikeBuilder setSeller(PayerReceiverEnum arg0)`

#### Getter Methods

- `MetaFieldsBuilder getOrCreateMeta()`
- `MetaFieldsBuilder getMeta()`
- `BigDecimal getStrikeRate()`
- `PayerReceiverEnum getBuyer()`
- `PayerReceiverEnum getSeller()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `StrikeBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `StrikeBuilder prune()`
- `StrikeBuilder toBuilder()`
- `boolean hasData()`

