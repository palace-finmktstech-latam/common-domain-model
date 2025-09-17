# CashflowTypeBuilder

**Full Name:** `cdm.product.common.settlement.CashflowType$CashflowTypeBuilder`

**Package:** `cdm.product.common.settlement`

## Type: Interface

### Implemented Interfaces

- `cdm.product.common.settlement.CashflowType`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`

### Methods

#### Setter Methods

- `CashflowTypeBuilder setPriceExpression(PriceExpressionEnum arg0)`
- `CashflowTypeBuilder setCashPrice(CashPrice arg0)`
- `CashflowTypeBuilder setCashflowType(ScheduledTransferEnum arg0)`

#### Getter Methods

- `CashPriceBuilder getCashPrice()`
- `CashPriceBuilder getOrCreateCashPrice()`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `CashflowTypeBuilder prune()`

