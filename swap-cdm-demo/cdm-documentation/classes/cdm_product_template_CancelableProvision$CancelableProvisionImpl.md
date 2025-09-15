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

- `ExerciseTerms getExerciseTerms()`
- `Boolean getFollowUpConfirmation()`
- `Period getEffectivePeriod()`
- `ExerciseNotice getExerciseNotice()`
- `BusinessCenterTime getLatestCancelationTime()`
- `Transfer getInitialFee()`
- `AdjustableOrRelativeDate getEarliestDate()`
- `AdjustableOrRelativeDate getExpirationDate()`
- `CallingPartyEnum getCallingParty()`
- `AdjustableOrRelativeDates getEffectiveDate()`
- `List getFinalCalculationPeriodDateAdjustment()`
- `CancelableProvisionAdjustedDates getCancelableProvisionAdjustedDates()`
- `BusinessCenterTime getEarliestCancellationTime()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `CancelableProvisionBuilder toBuilder()`

