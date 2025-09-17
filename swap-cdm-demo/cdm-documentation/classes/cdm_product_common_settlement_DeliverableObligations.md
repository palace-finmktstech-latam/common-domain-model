# DeliverableObligations

**Full Name:** `cdm.product.common.settlement.DeliverableObligations`

**Package:** `cdm.product.common.settlement`

## Type: Interface

### Implemented Interfaces

- `com.rosetta.model.lib.RosettaModelObject`

### Methods

#### Builder Methods

- `DeliverableObligations build()`

#### Getter Methods

- `Class getType()`
- `Boolean getGeneralFundObligationLiability()`
- `Boolean getRevenueObligationLiability()`
- `Boolean getFullFaithAndCreditObLiability()`
- `Boolean getAccruedInterest()`
- `Boolean getNotDomesticLaw()`
- `Boolean getNotContingent()`
- `SpecifiedCurrency getSpecifiedCurrency()`
- `Boolean getNotDomesticIssuance()`
- `Boolean getTransferable()`
- `NotDomesticCurrency getNotDomesticCurrency()`
- `Period getMaximumMaturity()`
- `Boolean getNotSovereignLender()`
- `PCDeliverableObligationCharac getAssignableLoan()`
- `PCDeliverableObligationCharac getConsentRequiredLoan()`
- `Boolean getNotSubordinated()`
- `Boolean getNotBearer()`
- `Boolean getListed()`
- `String getExcluded()`
- `Boolean getAcceleratedOrMatured()`
- `ObligationCategoryEnum getCategory()`
- `LoanParticipation getDirectLoanParticipation()`
- `String getOthReferenceEntityObligations()`
- `LoanParticipation getIndirectLoanParticipation()`

#### Other Methods

- `void process(RosettaPath arg0, Processor arg1)`
- `DeliverableObligationsBuilder toBuilder()`
- `RosettaMetaData metaData()`

### Annotations

- **RuneDataType**
- **RosettaDataType**

