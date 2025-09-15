# ExtendibleProvisionImpl

**Full Name:** `cdm.product.template.ExtendibleProvision$ExtendibleProvisionImpl`

**Package:** `cdm.product.template`

## Type: Concrete Class

### Inheritance

**Extends:**
- `cdm.base.staticdata.party.BuyerSeller$BuyerSellerImpl`

### Implemented Interfaces

- `cdm.product.template.ExtendibleProvision`

### Methods

#### Builder Methods

- `ExtendibleProvision build()`

#### Setter Methods

- `void setBuilderFields(ExtendibleProvisionBuilder arg0)`

#### Getter Methods

- `PartyRole getSinglePartyOption()`
- `ExerciseTerms getExerciseTerms()`
- `Boolean getFollowUpConfirmation()`
- `RelativeDateOffset getExtensionTerm()`
- `ExerciseNotice getExerciseNotice()`
- `AdjustableRelativeOrPeriodicDates getExtensionPeriod()`
- `CallingPartyEnum getCallingParty()`
- `RelativeDateOffset getNoticeDeadlinePeriod()`
- `ZonedDateTime getNoticeDeadlineDateTime()`
- `ExtendibleProvisionAdjustedDates getExtendibleProvisionAdjustedDates()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `ExtendibleProvisionBuilder toBuilder()`

