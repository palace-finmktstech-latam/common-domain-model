# DeliverableObligationsBuilderImpl

**Full Name:** `cdm.product.common.settlement.DeliverableObligations$DeliverableObligationsBuilderImpl`

**Package:** `cdm.product.common.settlement`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.product.common.settlement.DeliverableObligations$DeliverableObligationsBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| accruedInterest | `Boolean` |  |
| category | `ObligationCategoryEnum` |  |
| notSubordinated | `Boolean` |  |
| specifiedCurrency | `SpecifiedCurrencyBuilder` |  |
| notSovereignLender | `Boolean` |  |
| notDomesticCurrency | `NotDomesticCurrencyBuilder` |  |
| notDomesticLaw | `Boolean` |  |
| listed | `Boolean` |  |
| notContingent | `Boolean` |  |
| notDomesticIssuance | `Boolean` |  |
| assignableLoan | `PCDeliverableObligationCharacBuilder` |  |
| consentRequiredLoan | `PCDeliverableObligationCharacBuilder` |  |
| directLoanParticipation | `LoanParticipationBuilder` |  |
| transferable | `Boolean` |  |
| maximumMaturity | `PeriodBuilder` |  |
| acceleratedOrMatured | `Boolean` |  |
| notBearer | `Boolean` |  |
| fullFaithAndCreditObLiability | `Boolean` |  |
| generalFundObligationLiability | `Boolean` |  |
| revenueObligationLiability | `Boolean` |  |
| indirectLoanParticipation | `LoanParticipationBuilder` |  |
| excluded | `String` |  |
| othReferenceEntityObligations | `String` |  |

### Methods

#### Builder Methods

- `DeliverableObligations build()`

#### Setter Methods

- `DeliverableObligationsBuilder setListed(Boolean arg0)`
- `DeliverableObligationsBuilder setNotContingent(Boolean arg0)`
- `DeliverableObligationsBuilder setNotDomesticCurrency(NotDomesticCurrency arg0)`
- `DeliverableObligationsBuilder setNotSubordinated(Boolean arg0)`
- `DeliverableObligationsBuilder setCategory(ObligationCategoryEnum arg0)`
- `DeliverableObligationsBuilder setNotDomesticLaw(Boolean arg0)`
- `DeliverableObligationsBuilder setNotDomesticIssuance(Boolean arg0)`
- `DeliverableObligationsBuilder setSpecifiedCurrency(SpecifiedCurrency arg0)`
- `DeliverableObligationsBuilder setMaximumMaturity(Period arg0)`
- `DeliverableObligationsBuilder setAssignableLoan(PCDeliverableObligationCharac arg0)`
- `DeliverableObligationsBuilder setConsentRequiredLoan(PCDeliverableObligationCharac arg0)`
- `DeliverableObligationsBuilder setTransferable(Boolean arg0)`
- `DeliverableObligationsBuilder setAcceleratedOrMatured(Boolean arg0)`
- `DeliverableObligationsBuilder setDirectLoanParticipation(LoanParticipation arg0)`
- `DeliverableObligationsBuilder setExcluded(String arg0)`
- `DeliverableObligationsBuilder setNotBearer(Boolean arg0)`
- `DeliverableObligationsBuilder setNotSovereignLender(Boolean arg0)`
- `DeliverableObligationsBuilder setAccruedInterest(Boolean arg0)`
- `DeliverableObligationsBuilder setRevenueObligationLiability(Boolean arg0)`
- `DeliverableObligationsBuilder setIndirectLoanParticipation(LoanParticipation arg0)`
- `DeliverableObligationsBuilder setGeneralFundObligationLiability(Boolean arg0)`
- `DeliverableObligationsBuilder setFullFaithAndCreditObLiability(Boolean arg0)`
- `DeliverableObligationsBuilder setOthReferenceEntityObligations(String arg0)`

#### Getter Methods

- `Boolean getListed()`
- `Boolean getAcceleratedOrMatured()`
- `ObligationCategoryEnum getCategory()`
- `LoanParticipationBuilder getDirectLoanParticipation()`
- `String getExcluded()`
- `PCDeliverableObligationCharacBuilder getOrCreateAssignableLoan()`
- `PeriodBuilder getOrCreateMaximumMaturity()`
- `SpecifiedCurrencyBuilder getOrCreateSpecifiedCurrency()`
- `NotDomesticCurrencyBuilder getOrCreateNotDomesticCurrency()`
- `LoanParticipationBuilder getOrCreateDirectLoanParticipation()`
- `LoanParticipationBuilder getOrCreateIndirectLoanParticipation()`
- `PCDeliverableObligationCharacBuilder getOrCreateConsentRequiredLoan()`
- `String getOthReferenceEntityObligations()`
- `LoanParticipationBuilder getIndirectLoanParticipation()`
- `Boolean getFullFaithAndCreditObLiability()`
- `Boolean getGeneralFundObligationLiability()`
- `Boolean getRevenueObligationLiability()`
- `Boolean getAccruedInterest()`
- `Boolean getNotBearer()`
- `Boolean getNotDomesticIssuance()`
- `Boolean getTransferable()`
- `SpecifiedCurrencyBuilder getSpecifiedCurrency()`
- `Boolean getNotDomesticLaw()`
- `Boolean getNotContingent()`
- `PCDeliverableObligationCharacBuilder getAssignableLoan()`
- `PCDeliverableObligationCharacBuilder getConsentRequiredLoan()`
- `NotDomesticCurrencyBuilder getNotDomesticCurrency()`
- `Boolean getNotSubordinated()`
- `Boolean getNotSovereignLender()`
- `PeriodBuilder getMaximumMaturity()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `DeliverableObligationsBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `boolean hasData()`
- `DeliverableObligationsBuilder toBuilder()`
- `DeliverableObligationsBuilder prune()`

