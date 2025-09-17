# CollateralBalanceBuilder

**Full Name:** `cdm.event.common.CollateralBalance$CollateralBalanceBuilder`

**Package:** `cdm.event.common`

## Type: Interface

### Implemented Interfaces

- `cdm.event.common.CollateralBalance`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`

### Methods

#### Setter Methods

- `CollateralBalanceBuilder setAmountBaseCurrency(Money arg0)`
- `CollateralBalanceBuilder setCollateralBalanceStatus(CollateralStatusEnum arg0)`
- `CollateralBalanceBuilder setHaircutIndicator(HaircutIndicatorEnum arg0)`
- `CollateralBalanceBuilder setPayerReceiver(PartyReferencePayerReceiver arg0)`

#### Getter Methods

- `MoneyBuilder getAmountBaseCurrency()`
- `PartyReferencePayerReceiverBuilder getOrCreatePayerReceiver()`
- `PartyReferencePayerReceiverBuilder getPayerReceiver()`
- `MoneyBuilder getOrCreateAmountBaseCurrency()`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `CollateralBalanceBuilder prune()`

