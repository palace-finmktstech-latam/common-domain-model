# DividendTermsBuilderImpl

**Full Name:** `cdm.product.template.DividendTerms$DividendTermsBuilderImpl`

**Package:** `cdm.product.template`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.product.template.DividendTerms$DividendTermsBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| manufacturedIncomeRequirement | `DividendPayoutRatioBuilder` |  |
| dividendEntitlement | `DividendEntitlementEnum` |  |
| minimumBillingAmount | `MoneyBuilder` |  |

### Methods

#### Builder Methods

- `DividendTerms build()`

#### Setter Methods

- `DividendTermsBuilder setDividendEntitlement(DividendEntitlementEnum arg0)`
- `DividendTermsBuilder setMinimumBillingAmount(Money arg0)`
- `DividendTermsBuilder setManufacturedIncomeRequirement(DividendPayoutRatio arg0)`

#### Getter Methods

- `DividendPayoutRatioBuilder getOrCreateManufacturedIncomeRequirement()`
- `DividendEntitlementEnum getDividendEntitlement()`
- `MoneyBuilder getMinimumBillingAmount()`
- `DividendPayoutRatioBuilder getManufacturedIncomeRequirement()`
- `MoneyBuilder getOrCreateMinimumBillingAmount()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `DividendTermsBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `DividendTermsBuilder prune()`
- `DividendTermsBuilder toBuilder()`
- `boolean hasData()`

