# DividendReturnTermsBuilderImpl

**Full Name:** `cdm.product.asset.DividendReturnTerms$DividendReturnTermsBuilderImpl`

**Package:** `cdm.product.asset`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.product.asset.DividendReturnTerms$DividendReturnTermsBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| dividendPayoutRatio | `java.util.List<cdm.product.asset.DividendPayoutRatio$DividendPayoutRatioBuilder>` |  |
| dividendReinvestment | `Boolean` |  |
| dividendEntitlement | `DividendEntitlementEnum` |  |
| dividendAmountType | `DividendAmountTypeEnum` |  |
| performance | `String` |  |
| firstOrSecondPeriod | `DividendPeriodEnum` |  |
| extraordinaryDividendsParty | `AncillaryRoleEnum` |  |
| excessDividendAmount | `DividendAmountTypeEnum` |  |
| dividendCurrency | `DividendCurrencyBuilder` |  |
| nonCashDividendTreatment | `NonCashDividendTreatmentEnum` |  |
| dividendComposition | `DividendCompositionEnum` |  |
| specialDividends | `Boolean` |  |
| materialDividend | `Boolean` |  |
| dividendPeriod | `java.util.List<cdm.product.asset.DividendPeriod$DividendPeriodBuilder>` |  |

### Methods

#### Builder Methods

- `DividendReturnTerms build()`

#### Setter Methods

- `DividendReturnTermsBuilder setNonCashDividendTreatment(NonCashDividendTreatmentEnum arg0)`
- `DividendReturnTermsBuilder setExtraordinaryDividendsParty(AncillaryRoleEnum arg0)`
- `DividendReturnTermsBuilder setDividendPayoutRatio(List arg0)`
- `DividendReturnTermsBuilder setDividendComposition(DividendCompositionEnum arg0)`
- `DividendReturnTermsBuilder setSpecialDividends(Boolean arg0)`
- `DividendReturnTermsBuilder setDividendPeriod(List arg0)`
- `DividendReturnTermsBuilder setDividendReinvestment(Boolean arg0)`
- `DividendReturnTermsBuilder setFirstOrSecondPeriod(DividendPeriodEnum arg0)`
- `DividendReturnTermsBuilder setMaterialDividend(Boolean arg0)`
- `DividendReturnTermsBuilder setExcessDividendAmount(DividendAmountTypeEnum arg0)`
- `DividendReturnTermsBuilder setPerformance(String arg0)`
- `DividendReturnTermsBuilder setDividendCurrency(DividendCurrency arg0)`
- `DividendReturnTermsBuilder setDividendEntitlement(DividendEntitlementEnum arg0)`
- `DividendReturnTermsBuilder setDividendAmountType(DividendAmountTypeEnum arg0)`

#### Getter Methods

- `DividendCurrencyBuilder getOrCreateDividendCurrency()`
- `String getPerformance()`
- `DividendPayoutRatioBuilder getOrCreateDividendPayoutRatio(int arg0)`
- `List getDividendPayoutRatio()`
- `Boolean getDividendReinvestment()`
- `DividendEntitlementEnum getDividendEntitlement()`
- `DividendPeriodEnum getFirstOrSecondPeriod()`
- `DividendAmountTypeEnum getExcessDividendAmount()`
- `DividendCompositionEnum getDividendComposition()`
- `List getDividendPeriod()`
- `DividendCurrencyBuilder getDividendCurrency()`
- `Boolean getMaterialDividend()`
- `DividendAmountTypeEnum getDividendAmountType()`
- `Boolean getSpecialDividends()`
- `DividendPeriodBuilder getOrCreateDividendPeriod(int arg0)`
- `NonCashDividendTreatmentEnum getNonCashDividendTreatment()`
- `AncillaryRoleEnum getExtraordinaryDividendsParty()`

#### Adder Methods

- `DividendReturnTermsBuilder addDividendPayoutRatio(List arg0)`
- `DividendReturnTermsBuilder addDividendPayoutRatio(DividendPayoutRatio arg0, int arg1)`
- `DividendReturnTermsBuilder addDividendPayoutRatio(DividendPayoutRatio arg0)`
- `DividendReturnTermsBuilder addDividendPeriod(List arg0)`
- `DividendReturnTermsBuilder addDividendPeriod(DividendPeriod arg0, int arg1)`
- `DividendReturnTermsBuilder addDividendPeriod(DividendPeriod arg0)`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `DividendReturnTermsBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `boolean hasData()`
- `DividendReturnTermsBuilder toBuilder()`
- `DividendReturnTermsBuilder prune()`

