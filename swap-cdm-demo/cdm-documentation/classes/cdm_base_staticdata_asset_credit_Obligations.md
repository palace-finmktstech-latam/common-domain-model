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
- `Boolean getGeneralFundObligationLiability()`
- `Boolean getRevenueObligationLiability()`
- `Boolean getFullFaithAndCreditObLiability()`
- `Boolean getNotDomesticLaw()`
- `Boolean getNotContingent()`
- `SpecifiedCurrency getSpecifiedCurrency()`
- `Boolean getNotDomesticIssuance()`
- `NotDomesticCurrency getNotDomesticCurrency()`
- `Boolean getNotSovereignLender()`
- `Boolean getNotSubordinated()`
- `Boolean getListed()`
- `String getExcluded()`
- `ObligationCategoryEnum getCategory()`
- `Boolean getCashSettlementOnly()`
- `Boolean getDeliveryOfCommitments()`
- `Boolean getContinuity()`
- `FieldWithMetaString getDesignatedPriority()`
- `String getOthReferenceEntityObligations()`

#### Other Methods

- `void process(RosettaPath arg0, Processor arg1)`
- `ObligationsBuilder toBuilder()`
- `RosettaMetaData metaData()`

### Annotations

- **RuneDataType**
- **RosettaDataType**

