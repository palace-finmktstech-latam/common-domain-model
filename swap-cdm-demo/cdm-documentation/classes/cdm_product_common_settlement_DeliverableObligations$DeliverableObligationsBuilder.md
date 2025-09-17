# DeliverableObligationsBuilder

**Full Name:** `cdm.product.common.settlement.DeliverableObligations$DeliverableObligationsBuilder`

**Package:** `cdm.product.common.settlement`

## Type: Interface

### Implemented Interfaces

- `cdm.product.common.settlement.DeliverableObligations`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`

### Methods

#### Setter Methods

- `DeliverableObligationsBuilder setAccruedInterest(Boolean arg0)`
- `DeliverableObligationsBuilder setConsentRequiredLoan(PCDeliverableObligationCharac arg0)`
- `DeliverableObligationsBuilder setMaximumMaturity(Period arg0)`
- `DeliverableObligationsBuilder setAcceleratedOrMatured(Boolean arg0)`
- `DeliverableObligationsBuilder setSpecifiedCurrency(SpecifiedCurrency arg0)`
- `DeliverableObligationsBuilder setNotSovereignLender(Boolean arg0)`
- `DeliverableObligationsBuilder setCategory(ObligationCategoryEnum arg0)`
- `DeliverableObligationsBuilder setNotBearer(Boolean arg0)`
- `DeliverableObligationsBuilder setNotSubordinated(Boolean arg0)`
- `DeliverableObligationsBuilder setNotContingent(Boolean arg0)`
- `DeliverableObligationsBuilder setNotDomesticIssuance(Boolean arg0)`
- `DeliverableObligationsBuilder setTransferable(Boolean arg0)`
- `DeliverableObligationsBuilder setNotDomesticCurrency(NotDomesticCurrency arg0)`
- `DeliverableObligationsBuilder setDirectLoanParticipation(LoanParticipation arg0)`
- `DeliverableObligationsBuilder setNotDomesticLaw(Boolean arg0)`
- `DeliverableObligationsBuilder setExcluded(String arg0)`
- `DeliverableObligationsBuilder setAssignableLoan(PCDeliverableObligationCharac arg0)`
- `DeliverableObligationsBuilder setIndirectLoanParticipation(LoanParticipation arg0)`
- `DeliverableObligationsBuilder setFullFaithAndCreditObLiability(Boolean arg0)`
- `DeliverableObligationsBuilder setOthReferenceEntityObligations(String arg0)`
- `DeliverableObligationsBuilder setGeneralFundObligationLiability(Boolean arg0)`
- `DeliverableObligationsBuilder setRevenueObligationLiability(Boolean arg0)`
- `DeliverableObligationsBuilder setListed(Boolean arg0)`

#### Getter Methods

- `PCDeliverableObligationCharacBuilder getOrCreateAssignableLoan()`
- `PeriodBuilder getOrCreateMaximumMaturity()`
- `LoanParticipationBuilder getOrCreateDirectLoanParticipation()`
- `SpecifiedCurrencyBuilder getOrCreateSpecifiedCurrency()`
- `PCDeliverableObligationCharacBuilder getOrCreateConsentRequiredLoan()`
- `NotDomesticCurrencyBuilder getOrCreateNotDomesticCurrency()`
- `LoanParticipationBuilder getOrCreateIndirectLoanParticipation()`
- `SpecifiedCurrencyBuilder getSpecifiedCurrency()`
- `NotDomesticCurrencyBuilder getNotDomesticCurrency()`
- `PeriodBuilder getMaximumMaturity()`
- `PCDeliverableObligationCharacBuilder getAssignableLoan()`
- `PCDeliverableObligationCharacBuilder getConsentRequiredLoan()`
- `LoanParticipationBuilder getDirectLoanParticipation()`
- `LoanParticipationBuilder getIndirectLoanParticipation()`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `DeliverableObligationsBuilder prune()`

