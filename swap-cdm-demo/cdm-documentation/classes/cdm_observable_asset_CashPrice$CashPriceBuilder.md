# CashPriceBuilder

**Full Name:** `cdm.observable.asset.CashPrice$CashPriceBuilder`

**Package:** `cdm.observable.asset`

## Type: Interface

### Implemented Interfaces

- `cdm.observable.asset.CashPrice`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`

### Methods

#### Setter Methods

- `CashPriceBuilder setCashPriceType(CashPriceTypeEnum arg0)`
- `CashPriceBuilder setPremiumExpression(PremiumExpression arg0)`
- `CashPriceBuilder setFeeType(FeeTypeEnum arg0)`

#### Getter Methods

- `PremiumExpressionBuilder getPremiumExpression()`
- `PremiumExpressionBuilder getOrCreatePremiumExpression()`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `CashPriceBuilder prune()`

