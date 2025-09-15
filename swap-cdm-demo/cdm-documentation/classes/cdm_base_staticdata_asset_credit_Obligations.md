# Obligations

**Full Name:** `cdm.base.staticdata.asset.credit.Obligations`

**Package:** `cdm.base.staticdata.asset.credit`

## Type: Interface

### Implemented Interfaces

- `com.rosetta.model.lib.RosettaModelObject`

### Methods

#### Builder Methods

- `Obligations build()`

#### Getter Methods

- `Class getType()`
- `Boolean getListed()`
- `ObligationCategoryEnum getCategory()`
- `String getExcluded()`
- `FieldWithMetaString getDesignatedPriority()`
- `Boolean getCashSettlementOnly()`
- `Boolean getDeliveryOfCommitments()`
- `Boolean getContinuity()`
- `String getOthReferenceEntityObligations()`
- `Boolean getFullFaithAndCreditObLiability()`
- `Boolean getGeneralFundObligationLiability()`
- `Boolean getRevenueObligationLiability()`
- `Boolean getNotDomesticIssuance()`
- `SpecifiedCurrency getSpecifiedCurrency()`
- `Boolean getNotDomesticLaw()`
- `Boolean getNotContingent()`
- `NotDomesticCurrency getNotDomesticCurrency()`
- `Boolean getNotSubordinated()`
- `Boolean getNotSovereignLender()`

#### Other Methods

- `void process(RosettaPath arg0, Processor arg1)`
- `ObligationsBuilder toBuilder()`
- `RosettaMetaData metaData()`

### Annotations

- **RuneDataType**
- **RosettaDataType**

