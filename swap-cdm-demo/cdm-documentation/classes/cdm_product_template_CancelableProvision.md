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

- `void process(RosettaPath arg0, Processor arg1)`
- `CancelableProvisionBuilder toBuilder()`
- `RosettaMetaData metaData()`

### Annotations

- **RuneDataType**
- **RosettaDataType**

