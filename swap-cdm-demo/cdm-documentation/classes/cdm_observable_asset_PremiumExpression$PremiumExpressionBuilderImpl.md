# PremiumExpressionBuilderImpl

**Full Name:** `cdm.observable.asset.PremiumExpression$PremiumExpressionBuilderImpl`

**Package:** `cdm.observable.asset`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.observable.asset.PremiumExpression$PremiumExpressionBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| premiumType | `PremiumTypeEnum` |  |
| pricePerOption | `MoneyBuilder` |  |
| percentageOfNotional | `BigDecimal` |  |

### Methods

#### Builder Methods

- `PremiumExpression build()`

#### Setter Methods

- `PremiumExpressionBuilder setPercentageOfNotional(BigDecimal arg0)`
- `PremiumExpressionBuilder setPricePerOption(Money arg0)`
- `PremiumExpressionBuilder setPremiumType(PremiumTypeEnum arg0)`

#### Getter Methods

- `MoneyBuilder getOrCreatePricePerOption()`
- `BigDecimal getPercentageOfNotional()`
- `PremiumTypeEnum getPremiumType()`
- `MoneyBuilder getPricePerOption()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `PremiumExpressionBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `PremiumExpressionBuilder prune()`
- `PremiumExpressionBuilder toBuilder()`
- `boolean hasData()`

