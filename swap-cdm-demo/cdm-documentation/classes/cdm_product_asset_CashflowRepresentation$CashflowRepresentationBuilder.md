# CashflowRepresentationBuilder

**Full Name:** `cdm.product.asset.CashflowRepresentation$CashflowRepresentationBuilder`

**Package:** `cdm.product.asset`

## Type: Interface

### Implemented Interfaces

- `cdm.product.asset.CashflowRepresentation`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`

### Methods

#### Setter Methods

- `CashflowRepresentationBuilder setPaymentCalculationPeriod(List arg0)`
- `CashflowRepresentationBuilder setCashflowsMatchParameters(Boolean arg0)`

#### Getter Methods

- `List getPaymentCalculationPeriod()`
- `PaymentCalculationPeriodBuilder getOrCreatePaymentCalculationPeriod(int arg0)`

#### Adder Methods

- `CashflowRepresentationBuilder addPaymentCalculationPeriod(List arg0)`
- `CashflowRepresentationBuilder addPaymentCalculationPeriod(PaymentCalculationPeriod arg0, int arg1)`
- `CashflowRepresentationBuilder addPaymentCalculationPeriod(PaymentCalculationPeriod arg0)`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `CashflowRepresentationBuilder prune()`

