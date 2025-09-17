# DividendTermsBuilder

**Full Name:** `cdm.product.template.DividendTerms$DividendTermsBuilder`

**Package:** `cdm.product.template`

## Type: Interface

### Implemented Interfaces

- `cdm.product.template.DividendTerms`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`

### Methods

#### Setter Methods

- `DividendTermsBuilder setDividendEntitlement(DividendEntitlementEnum arg0)`
- `DividendTermsBuilder setMinimumBillingAmount(Money arg0)`
- `DividendTermsBuilder setManufacturedIncomeRequirement(DividendPayoutRatio arg0)`

#### Getter Methods

- `DividendPayoutRatioBuilder getOrCreateManufacturedIncomeRequirement()`
- `MoneyBuilder getMinimumBillingAmount()`
- `DividendPayoutRatioBuilder getManufacturedIncomeRequirement()`
- `MoneyBuilder getOrCreateMinimumBillingAmount()`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `DividendTermsBuilder prune()`

