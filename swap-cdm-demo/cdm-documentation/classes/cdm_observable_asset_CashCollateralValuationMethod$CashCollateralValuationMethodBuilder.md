# CashCollateralValuationMethodBuilder

**Full Name:** `cdm.observable.asset.CashCollateralValuationMethod$CashCollateralValuationMethodBuilder`

**Package:** `cdm.observable.asset`

## Type: Interface

### Implemented Interfaces

- `cdm.observable.asset.CashCollateralValuationMethod`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`

### Methods

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

- `FieldWithMetaStringBuilder getAgreedDiscountRate()`
- `FieldWithMetaStringBuilder getOrCreateCashCollateralInterestRate()`
- `FieldWithMetaStringBuilder getOrCreateAgreedDiscountRate()`
- `FieldWithMetaStringBuilder getCashCollateralInterestRate()`

#### Adder Methods

- `CashCollateralValuationMethodBuilder addProtectedParty(List arg0)`
- `CashCollateralValuationMethodBuilder addProtectedParty(PartyDeterminationEnum arg0, int arg1)`
- `CashCollateralValuationMethodBuilder addProtectedParty(PartyDeterminationEnum arg0)`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `CashCollateralValuationMethodBuilder prune()`

