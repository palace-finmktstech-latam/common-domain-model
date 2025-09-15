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

- `StrikeBuilder setStrikeRate(BigDecimal arg0)`
- `StrikeBuilder setSeller(PayerReceiverEnum arg0)`
- `StrikeBuilder setBuyer(PayerReceiverEnum arg0)`
- `StrikeBuilder setMeta(MetaFields arg0)`

#### Getter Methods

- `PayerReceiverEnum getSeller()`
- `PayerReceiverEnum getBuyer()`
- `MetaFieldsBuilder getOrCreateMeta()`
- `BigDecimal getStrikeRate()`
- `MetaFieldsBuilder getMeta()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `StrikeBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `boolean hasData()`
- `StrikeBuilder toBuilder()`
- `StrikeBuilder prune()`

