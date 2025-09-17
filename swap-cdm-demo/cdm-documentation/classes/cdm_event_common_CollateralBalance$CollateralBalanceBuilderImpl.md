# CollateralBalanceBuilderImpl

**Full Name:** `cdm.event.common.CollateralBalance$CollateralBalanceBuilderImpl`

**Package:** `cdm.event.common`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.event.common.CollateralBalance$CollateralBalanceBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| collateralBalanceStatus | `CollateralStatusEnum` |  |
| haircutIndicator | `HaircutIndicatorEnum` |  |
| amountBaseCurrency | `MoneyBuilder` |  |
| payerReceiver | `PartyReferencePayerReceiverBuilder` |  |

### Methods

#### Builder Methods

- `CollateralBalance build()`

#### Setter Methods

- `CollateralBalanceBuilder setAmountBaseCurrency(Money arg0)`
- `CollateralBalanceBuilder setCollateralBalanceStatus(CollateralStatusEnum arg0)`
- `CollateralBalanceBuilder setHaircutIndicator(HaircutIndicatorEnum arg0)`
- `CollateralBalanceBuilder setPayerReceiver(PartyReferencePayerReceiver arg0)`

#### Getter Methods

- `CollateralStatusEnum getCollateralBalanceStatus()`
- `MoneyBuilder getAmountBaseCurrency()`
- `HaircutIndicatorEnum getHaircutIndicator()`
- `PartyReferencePayerReceiverBuilder getOrCreatePayerReceiver()`
- `PartyReferencePayerReceiverBuilder getPayerReceiver()`
- `MoneyBuilder getOrCreateAmountBaseCurrency()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `CollateralBalanceBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `CollateralBalanceBuilder prune()`
- `CollateralBalanceBuilder toBuilder()`
- `boolean hasData()`

