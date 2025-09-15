# ComputedAmountBuilderImpl

**Full Name:** `cdm.product.common.settlement.ComputedAmount$ComputedAmountBuilderImpl`

**Package:** `cdm.product.common.settlement`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.product.common.settlement.ComputedAmount$ComputedAmountBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| callFunction | `String` |  |
| amount | `BigDecimal` |  |
| currency | `FieldWithMetaStringBuilder` |  |

### Methods

#### Builder Methods

- `ComputedAmount build()`

#### Setter Methods

- `ComputedAmountBuilder setCurrency(FieldWithMetaString arg0)`
- `ComputedAmountBuilder setCurrencyValue(String arg0)`
- `ComputedAmountBuilder setAmount(BigDecimal arg0)`
- `ComputedAmountBuilder setCallFunction(String arg0)`

#### Getter Methods

- `FieldWithMetaStringBuilder getCurrency()`
- `FieldWithMetaStringBuilder getOrCreateCurrency()`
- `BigDecimal getAmount()`
- `String getCallFunction()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `ComputedAmountBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `boolean hasData()`
- `ComputedAmountBuilder toBuilder()`
- `ComputedAmountBuilder prune()`

