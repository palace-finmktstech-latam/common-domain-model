# CancelableProvisionBuilder

**Full Name:** `cdm.product.template.CancelableProvision$CancelableProvisionBuilder`

**Package:** `cdm.product.template`

## Type: Interface

### Implemented Interfaces

- `cdm.product.template.CancelableProvision`
- `cdm.base.staticdata.party.BuyerSeller$BuyerSellerBuilder`

### Methods

#### Setter Methods

- `CancelableProvisionBuilder setFinalCalculationPeriodDateAdjustment(List arg0)`
- `CancelableProvisionBuilder setEarliestCancellationTime(BusinessCenterTime arg0)`
- `CancelableProvisionBuilder setCancelableProvisionAdjustedDates(CancelableProvisionAdjustedDates arg0)`
- `CancelableProvisionBuilder setExerciseTerms(ExerciseTerms arg0)`
- `CancelableProvisionBuilder setExerciseNotice(ExerciseNotice arg0)`
- `CancelableProvisionBuilder setFollowUpConfirmation(Boolean arg0)`
- `CancelableProvisionBuilder setExpirationDate(AdjustableOrRelativeDate arg0)`
- `CancelableProvisionBuilder setEffectiveDate(AdjustableOrRelativeDates arg0)`
- `CancelableProvisionBuilder setLatestCancelationTime(BusinessCenterTime arg0)`
- `CancelableProvisionBuilder setCallingParty(CallingPartyEnum arg0)`
- `CancelableProvisionBuilder setEffectivePeriod(Period arg0)`
- `CancelableProvisionBuilder setInitialFee(Transfer arg0)`
- `CancelableProvisionBuilder setEarliestDate(AdjustableOrRelativeDate arg0)`
- `CancelableProvisionBuilder setBuyer(CounterpartyRoleEnum arg0)`
- `CancelableProvisionBuilder setSeller(CounterpartyRoleEnum arg0)`

#### Getter Methods

- `AdjustableOrRelativeDatesBuilder getEffectiveDate()`
- `BusinessCenterTimeBuilder getOrCreateLatestCancelationTime()`
- `BusinessCenterTimeBuilder getOrCreateEarliestCancellationTime()`
- `CancelableProvisionAdjustedDatesBuilder getOrCreateCancelableProvisionAdjustedDates()`
- `FinalCalculationPeriodDateAdjustmentBuilder getOrCreateFinalCalculationPeriodDateAdjustment(int arg0)`
- `AdjustableOrRelativeDatesBuilder getOrCreateEffectiveDate()`
- `ExerciseTermsBuilder getExerciseTerms()`
- `PeriodBuilder getEffectivePeriod()`
- `ExerciseNoticeBuilder getExerciseNotice()`
- `AdjustableOrRelativeDateBuilder getEarliestDate()`
- `AdjustableOrRelativeDateBuilder getExpirationDate()`
- `BusinessCenterTimeBuilder getLatestCancelationTime()`
- `TransferBuilder getInitialFee()`
- `ExerciseTermsBuilder getOrCreateExerciseTerms()`
- `BusinessCenterTimeBuilder getEarliestCancellationTime()`
- `CancelableProvisionAdjustedDatesBuilder getCancelableProvisionAdjustedDates()`
- `List getFinalCalculationPeriodDateAdjustment()`
- `ExerciseNoticeBuilder getOrCreateExerciseNotice()`
- `AdjustableOrRelativeDateBuilder getOrCreateExpirationDate()`
- `AdjustableOrRelativeDateBuilder getOrCreateEarliestDate()`
- `TransferBuilder getOrCreateInitialFee()`
- `PeriodBuilder getOrCreateEffectivePeriod()`

#### Adder Methods

- `CancelableProvisionBuilder addFinalCalculationPeriodDateAdjustment(List arg0)`
- `CancelableProvisionBuilder addFinalCalculationPeriodDateAdjustment(FinalCalculationPeriodDateAdjustment arg0)`
- `CancelableProvisionBuilder addFinalCalculationPeriodDateAdjustment(FinalCalculationPeriodDateAdjustment arg0, int arg1)`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `CancelableProvisionBuilder prune()`

