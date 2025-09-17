# CashflowTypeBuilderImpl

**Full Name:** `cdm.product.common.settlement.CashflowType$CashflowTypeBuilderImpl`

**Package:** `cdm.product.common.settlement`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.product.common.settlement.CashflowType$CashflowTypeBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| cashflowType | `ScheduledTransferEnum` |  |
| cashPrice | `CashPriceBuilder` |  |
| priceExpression | `PriceExpressionEnum` |  |

### Methods

#### Builder Methods

- `CashflowType build()`

#### Setter Methods

- `CashflowTypeBuilder setPriceExpression(PriceExpressionEnum arg0)`
- `CashflowTypeBuilder setCashPrice(CashPrice arg0)`
- `CashflowTypeBuilder setCashflowType(ScheduledTransferEnum arg0)`

#### Getter Methods

- `PriceExpressionEnum getPriceExpression()`
- `CashPriceBuilder getCashPrice()`
- `ScheduledTransferEnum getCashflowType()`
- `CashPriceBuilder getOrCreateCashPrice()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `CashflowTypeBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `CashflowTypeBuilder prune()`
- `CashflowTypeBuilder toBuilder()`
- `boolean hasData()`

