# DividendReturnTermsBuilder

**Full Name:** `cdm.product.asset.DividendReturnTerms$DividendReturnTermsBuilder`

**Package:** `cdm.product.asset`

## Type: Interface

### Implemented Interfaces

- `cdm.product.asset.DividendReturnTerms`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`

### Methods

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
- `DividendPayoutRatioBuilder getOrCreateDividendPayoutRatio(int arg0)`
- `List getDividendPayoutRatio()`
- `List getDividendPeriod()`
- `DividendCurrencyBuilder getDividendCurrency()`
- `DividendPeriodBuilder getOrCreateDividendPeriod(int arg0)`

#### Adder Methods

- `DividendReturnTermsBuilder addDividendPayoutRatio(DividendPayoutRatio arg0)`
- `DividendReturnTermsBuilder addDividendPayoutRatio(DividendPayoutRatio arg0, int arg1)`
- `DividendReturnTermsBuilder addDividendPayoutRatio(List arg0)`
- `DividendReturnTermsBuilder addDividendPeriod(DividendPeriod arg0)`
- `DividendReturnTermsBuilder addDividendPeriod(DividendPeriod arg0, int arg1)`
- `DividendReturnTermsBuilder addDividendPeriod(List arg0)`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `DividendReturnTermsBuilder prune()`

