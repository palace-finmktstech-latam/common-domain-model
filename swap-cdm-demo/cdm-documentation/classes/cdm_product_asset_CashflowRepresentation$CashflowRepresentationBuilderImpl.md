# CashflowRepresentationBuilderImpl

**Full Name:** `cdm.product.asset.CashflowRepresentation$CashflowRepresentationBuilderImpl`

**Package:** `cdm.product.asset`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.product.asset.CashflowRepresentation$CashflowRepresentationBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| cashflowsMatchParameters | `Boolean` |  |
| paymentCalculationPeriod | `java.util.List<cdm.product.common.schedule.PaymentCalculationPeriod$PaymentCalculationPeriodBuilder>` |  |

### Methods

#### Builder Methods

- `CashflowRepresentation build()`

#### Setter Methods

- `CashflowRepresentationBuilder setPaymentCalculationPeriod(List arg0)`
- `CashflowRepresentationBuilder setCashflowsMatchParameters(Boolean arg0)`

#### Getter Methods

- `Boolean getCashflowsMatchParameters()`
- `List getPaymentCalculationPeriod()`
- `PaymentCalculationPeriodBuilder getOrCreatePaymentCalculationPeriod(int arg0)`

#### Adder Methods

- `CashflowRepresentationBuilder addPaymentCalculationPeriod(PaymentCalculationPeriod arg0, int arg1)`
- `CashflowRepresentationBuilder addPaymentCalculationPeriod(List arg0)`
- `CashflowRepresentationBuilder addPaymentCalculationPeriod(PaymentCalculationPeriod arg0)`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `CashflowRepresentationBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `boolean hasData()`
- `CashflowRepresentationBuilder toBuilder()`
- `CashflowRepresentationBuilder prune()`

