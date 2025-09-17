# CancelableProvisionImpl

**Full Name:** `cdm.product.template.CancelableProvision$CancelableProvisionImpl`

**Package:** `cdm.product.template`

## Type: Concrete Class

### Inheritance

**Extends:**
- `cdm.base.staticdata.party.BuyerSeller$BuyerSellerImpl`

### Implemented Interfaces

- `cdm.product.template.CancelableProvision`

### Methods

#### Builder Methods

- `CancelableProvision build()`

#### Setter Methods

- `void setBuilderFields(CancelableProvisionBuilder arg0)`

#### Getter Methods

- `AdjustableOrRelativeDates getEffectiveDate()`
- `ExerciseTerms getExerciseTerms()`
- `Period getEffectivePeriod()`
- `ExerciseNotice getExerciseNotice()`
- `AdjustableOrRelativeDate getEarliestDate()`
- `AdjustableOrRelativeDate getExpirationDate()`
- `Boolean getFollowUpConfirmation()`
- `CallingPartyEnum getCallingParty()`
- `BusinessCenterTime getLatestCancelationTime()`
- `Transfer getInitialFee()`
- `BusinessCenterTime getEarliestCancellationTime()`
- `CancelableProvisionAdjustedDates getCancelableProvisionAdjustedDates()`
- `List getFinalCalculationPeriodDateAdjustment()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `CancelableProvisionBuilder toBuilder()`

