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
- `String getPerformance()`
- `List getDividendPayoutRatio()`
- `Boolean getDividendReinvestment()`
- `DividendEntitlementEnum getDividendEntitlement()`
- `DividendPeriodEnum getFirstOrSecondPeriod()`
- `DividendAmountTypeEnum getExcessDividendAmount()`
- `DividendCompositionEnum getDividendComposition()`
- `List getDividendPeriod()`
- `DividendCurrency getDividendCurrency()`
- `Boolean getMaterialDividend()`
- `DividendAmountTypeEnum getDividendAmountType()`
- `Boolean getSpecialDividends()`
- `NonCashDividendTreatmentEnum getNonCashDividendTreatment()`
- `AncillaryRoleEnum getExtraordinaryDividendsParty()`

#### Other Methods

- `void process(RosettaPath arg0, Processor arg1)`
- `DividendReturnTermsBuilder toBuilder()`
- `RosettaMetaData metaData()`

### Annotations

- **RuneDataType**
- **RosettaDataType**

