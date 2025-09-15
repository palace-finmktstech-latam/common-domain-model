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
- `Boolean getListed()`
- `Boolean getAcceleratedOrMatured()`
- `ObligationCategoryEnum getCategory()`
- `LoanParticipation getDirectLoanParticipation()`
- `String getExcluded()`
- `String getOthReferenceEntityObligations()`
- `LoanParticipation getIndirectLoanParticipation()`
- `Boolean getFullFaithAndCreditObLiability()`
- `Boolean getGeneralFundObligationLiability()`
- `Boolean getRevenueObligationLiability()`
- `Boolean getAccruedInterest()`
- `Boolean getNotBearer()`
- `Boolean getNotDomesticIssuance()`
- `Boolean getTransferable()`
- `SpecifiedCurrency getSpecifiedCurrency()`
- `Boolean getNotDomesticLaw()`
- `Boolean getNotContingent()`
- `PCDeliverableObligationCharac getAssignableLoan()`
- `PCDeliverableObligationCharac getConsentRequiredLoan()`
- `NotDomesticCurrency getNotDomesticCurrency()`
- `Boolean getNotSubordinated()`
- `Boolean getNotSovereignLender()`
- `Period getMaximumMaturity()`

#### Other Methods

- `void process(RosettaPath arg0, Processor arg1)`
- `DeliverableObligationsBuilder toBuilder()`
- `RosettaMetaData metaData()`

### Annotations

- **RuneDataType**
- **RosettaDataType**

