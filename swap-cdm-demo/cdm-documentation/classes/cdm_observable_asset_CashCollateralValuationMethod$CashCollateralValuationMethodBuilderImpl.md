# CashCollateralValuationMethodBuilderImpl

**Full Name:** `cdm.observable.asset.CashCollateralValuationMethod$CashCollateralValuationMethodBuilderImpl`

**Package:** `cdm.observable.asset`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.observable.asset.CashCollateralValuationMethod$CashCollateralValuationMethodBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| applicableCsa | `CsaTypeEnum` |  |
| cashCollateralCurrency | `String` |  |
| cashCollateralInterestRate | `FieldWithMetaStringBuilder` |  |
| agreedDiscountRate | `FieldWithMetaStringBuilder` |  |
| protectedParty | `java.util.List<cdm.observable.asset.PartyDeterminationEnum>` |  |
| prescribedDocumentationAdjustment | `Boolean` |  |

### Methods

#### Builder Methods

- `CashCollateralValuationMethod build()`

#### Setter Methods

- `CashCollateralValuationMethodBuilder setProtectedParty(List arg0)`
- `CashCollateralValuationMethodBuilder setApplicableCsa(CsaTypeEnum arg0)`
- `CashCollateralValuationMethodBuilder setAgreedDiscountRateValue(String arg0)`
- `CashCollateralValuationMethodBuilder setAgreedDiscountRate(FieldWithMetaString arg0)`
- `CashCollateralValuationMethodBuilder setCashCollateralCurrency(String arg0)`
- `CashCollateralValuationMethodBuilder setCashCollateralInterestRateValue(String arg0)`
- `CashCollateralValuationMethodBuilder setPrescribedDocumentationAdjustment(Boolean arg0)`
- `CashCollateralValuationMethodBuilder setCashCollateralInterestRate(FieldWithMetaString arg0)`

#### Getter Methods

- `CsaTypeEnum getApplicableCsa()`
- `String getCashCollateralCurrency()`
- `FieldWithMetaStringBuilder getAgreedDiscountRate()`
- `List getProtectedParty()`
- `FieldWithMetaStringBuilder getOrCreateCashCollateralInterestRate()`
- `FieldWithMetaStringBuilder getOrCreateAgreedDiscountRate()`
- `FieldWithMetaStringBuilder getCashCollateralInterestRate()`
- `Boolean getPrescribedDocumentationAdjustment()`

#### Adder Methods

- `CashCollateralValuationMethodBuilder addProtectedParty(PartyDeterminationEnum arg0)`
- `CashCollateralValuationMethodBuilder addProtectedParty(PartyDeterminationEnum arg0, int arg1)`
- `CashCollateralValuationMethodBuilder addProtectedParty(List arg0)`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `CashCollateralValuationMethodBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `boolean hasData()`
- `CashCollateralValuationMethodBuilder toBuilder()`
- `CashCollateralValuationMethodBuilder prune()`

