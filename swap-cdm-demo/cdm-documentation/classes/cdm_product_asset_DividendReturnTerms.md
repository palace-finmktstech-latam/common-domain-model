# DividendReturnTerms

**Full Name:** `cdm.product.asset.DividendReturnTerms`

**Package:** `cdm.product.asset`

## Type: Interface

### Implemented Interfaces

- `com.rosetta.model.lib.RosettaModelObject`

### Methods

#### Builder Methods

- `DividendReturnTerms build()`

#### Getter Methods

- `Class getType()`
- `DividendAmountTypeEnum getExcessDividendAmount()`
- `List getDividendPayoutRatio()`
- `List getDividendPeriod()`
- `Boolean getDividendReinvestment()`
- `DividendEntitlementEnum getDividendEntitlement()`
- `DividendPeriodEnum getFirstOrSecondPeriod()`
- `DividendCurrency getDividendCurrency()`
- `DividendCompositionEnum getDividendComposition()`
- `Boolean getSpecialDividends()`
- `DividendAmountTypeEnum getDividendAmountType()`
- `Boolean getMaterialDividend()`
- `NonCashDividendTreatmentEnum getNonCashDividendTreatment()`
- `AncillaryRoleEnum getExtraordinaryDividendsParty()`
- `String getPerformance()`

#### Other Methods

- `void process(RosettaPath arg0, Processor arg1)`
- `DividendReturnTermsBuilder toBuilder()`
- `RosettaMetaData metaData()`

### Annotations

- **RuneDataType**
- **RosettaDataType**

