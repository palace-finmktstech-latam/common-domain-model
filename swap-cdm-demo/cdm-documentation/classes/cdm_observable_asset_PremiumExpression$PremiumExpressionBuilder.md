# PremiumExpressionBuilder

**Full Name:** `cdm.observable.asset.PremiumExpression$PremiumExpressionBuilder`

**Package:** `cdm.observable.asset`

## Type: Interface

### Implemented Interfaces

- `cdm.observable.asset.PremiumExpression`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`

### Methods

#### Setter Methods

- `PremiumExpressionBuilder setPercentageOfNotional(BigDecimal arg0)`
- `PremiumExpressionBuilder setPricePerOption(Money arg0)`
- `PremiumExpressionBuilder setPremiumType(PremiumTypeEnum arg0)`

#### Getter Methods

- `MoneyBuilder getOrCreatePricePerOption()`
- `MoneyBuilder getPricePerOption()`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `PremiumExpressionBuilder prune()`

