# CancelableProvision

**Full Name:** `cdm.product.template.CancelableProvision`

**Package:** `cdm.product.template`

## Type: Interface

### Implemented Interfaces

- `cdm.base.staticdata.party.BuyerSeller`

### Methods

#### Builder Methods

- `CancelableProvision build()`

#### Getter Methods

- `Class getType()`
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

- `void process(RosettaPath arg0, Processor arg1)`
- `CancelableProvisionBuilder toBuilder()`
- `RosettaMetaData metaData()`

### Annotations

- **RuneDataType**
- **RosettaDataType**

