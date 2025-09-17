# CashPriceBuilderImpl

**Full Name:** `cdm.observable.asset.CashPrice$CashPriceBuilderImpl`

**Package:** `cdm.observable.asset`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.observable.asset.CashPrice$CashPriceBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| cashPriceType | `CashPriceTypeEnum` |  |
| premiumExpression | `PremiumExpressionBuilder` |  |
| feeType | `FeeTypeEnum` |  |

### Methods

#### Builder Methods

- `CashPrice build()`

#### Setter Methods

- `CashPriceBuilder setFeeType(FeeTypeEnum arg0)`
- `CashPriceBuilder setCashPriceType(CashPriceTypeEnum arg0)`
- `CashPriceBuilder setPremiumExpression(PremiumExpression arg0)`

#### Getter Methods

- `CashPriceTypeEnum getCashPriceType()`
- `PremiumExpressionBuilder getPremiumExpression()`
- `PremiumExpressionBuilder getOrCreatePremiumExpression()`
- `FeeTypeEnum getFeeType()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `CashPriceBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `CashPriceBuilder prune()`
- `CashPriceBuilder toBuilder()`
- `boolean hasData()`

