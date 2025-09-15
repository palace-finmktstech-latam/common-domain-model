# PaymentDiscountingBuilder

**Full Name:** `cdm.product.common.settlement.PaymentDiscounting$PaymentDiscountingBuilder`

**Package:** `cdm.product.common.settlement`

## Type: Interface

### Implemented Interfaces

- `cdm.product.common.settlement.PaymentDiscounting`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`

### Methods

#### Setter Methods

- `PaymentDiscountingBuilder setPresentValueAmount(Money arg0)`
- `PaymentDiscountingBuilder setDiscountFactor(BigDecimal arg0)`

#### Getter Methods

- `MoneyBuilder getPresentValueAmount()`
- `MoneyBuilder getOrCreatePresentValueAmount()`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `PaymentDiscountingBuilder prune()`

