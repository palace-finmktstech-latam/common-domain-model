# PaymentDiscountingBuilderImpl

**Full Name:** `cdm.product.common.settlement.PaymentDiscounting$PaymentDiscountingBuilderImpl`

**Package:** `cdm.product.common.settlement`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.product.common.settlement.PaymentDiscounting$PaymentDiscountingBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| discountFactor | `BigDecimal` |  |
| presentValueAmount | `MoneyBuilder` |  |

### Methods

#### Builder Methods

- `PaymentDiscounting build()`

#### Setter Methods

- `PaymentDiscountingBuilder setPresentValueAmount(Money arg0)`
- `PaymentDiscountingBuilder setDiscountFactor(BigDecimal arg0)`

#### Getter Methods

- `MoneyBuilder getPresentValueAmount()`
- `BigDecimal getDiscountFactor()`
- `MoneyBuilder getOrCreatePresentValueAmount()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `PaymentDiscountingBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `boolean hasData()`
- `PaymentDiscountingBuilder toBuilder()`
- `PaymentDiscountingBuilder prune()`

