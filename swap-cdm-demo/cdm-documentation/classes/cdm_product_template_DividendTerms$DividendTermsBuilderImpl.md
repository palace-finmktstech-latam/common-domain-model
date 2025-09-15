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

- `DividendTermsBuilder setManufacturedIncomeRequirement(DividendPayoutRatio arg0)`
- `DividendTermsBuilder setMinimumBillingAmount(Money arg0)`
- `DividendTermsBuilder setDividendEntitlement(DividendEntitlementEnum arg0)`

#### Getter Methods

- `DividendPayoutRatioBuilder getOrCreateManufacturedIncomeRequirement()`
- `MoneyBuilder getOrCreateMinimumBillingAmount()`
- `DividendPayoutRatioBuilder getManufacturedIncomeRequirement()`
- `MoneyBuilder getMinimumBillingAmount()`
- `DividendEntitlementEnum getDividendEntitlement()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `DividendTermsBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `boolean hasData()`
- `DividendTermsBuilder toBuilder()`
- `DividendTermsBuilder prune()`

