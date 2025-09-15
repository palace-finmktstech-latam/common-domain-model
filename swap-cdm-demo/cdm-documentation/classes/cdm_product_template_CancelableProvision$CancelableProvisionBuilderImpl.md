# CancelableProvisionBuilderImpl

**Full Name:** `cdm.product.template.CancelableProvision$CancelableProvisionBuilderImpl`

**Package:** `cdm.product.template`

## Type: Concrete Class

### Inheritance

**Extends:**
- `cdm.base.staticdata.party.BuyerSeller$BuyerSellerBuilderImpl`

### Implemented Interfaces

- `cdm.product.template.CancelableProvision$CancelableProvisionBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| exerciseNotice | `ExerciseNoticeBuilder` |  |
| followUpConfirmation | `Boolean` |  |
| cancelableProvisionAdjustedDates | `CancelableProvisionAdjustedDatesBuilder` |  |
| finalCalculationPeriodDateAdjustment | `java.util.List<cdm.product.common.schedule.FinalCalculationPeriodDateAdjustment$FinalCalculationPeriodDateAdjustmentBuilder>` |  |
| initialFee | `TransferBuilder` |  |
| callingParty | `CallingPartyEnum` |  |
| earliestDate | `AdjustableOrRelativeDateBuilder` |  |
| expirationDate | `AdjustableOrRelativeDateBuilder` |  |
| effectiveDate | `AdjustableOrRelativeDatesBuilder` |  |
| effectivePeriod | `PeriodBuilder` |  |
| earliestCancellationTime | `BusinessCenterTimeBuilder` |  |
| latestCancelationTime | `BusinessCenterTimeBuilder` |  |
| exerciseTerms | `ExerciseTermsBuilder` |  |

### Methods

#### Builder Methods

- `CancelableProvision build()`

#### Setter Methods

- `CancelableProvisionBuilder setEffectiveDate(AdjustableOrRelativeDates arg0)`
- `CancelableProvisionBuilder setExerciseTerms(ExerciseTerms arg0)`
- `CancelableProvisionBuilder setCancelableProvisionAdjustedDates(CancelableProvisionAdjustedDates arg0)`
- `CancelableProvisionBuilder setEarliestCancellationTime(BusinessCenterTime arg0)`
- `CancelableProvisionBuilder setFinalCalculationPeriodDateAdjustment(List arg0)`
- `CancelableProvisionBuilder setFollowUpConfirmation(Boolean arg0)`
- `CancelableProvisionBuilder setExerciseNotice(ExerciseNotice arg0)`
- `CancelableProvisionBuilder setExpirationDate(AdjustableOrRelativeDate arg0)`
- `CancelableProvisionBuilder setInitialFee(Transfer arg0)`
- `CancelableProvisionBuilder setCallingParty(CallingPartyEnum arg0)`
- `CancelableProvisionBuilder setEffectivePeriod(Period arg0)`
- `CancelableProvisionBuilder setEarliestDate(AdjustableOrRelativeDate arg0)`
- `CancelableProvisionBuilder setLatestCancelationTime(BusinessCenterTime arg0)`
- `CancelableProvisionBuilder setSeller(CounterpartyRoleEnum arg0)`
- `CancelableProvisionBuilder setBuyer(CounterpartyRoleEnum arg0)`

#### Getter Methods

- `AdjustableOrRelativeDatesBuilder getOrCreateEffectiveDate()`
- `ExerciseTermsBuilder getOrCreateExerciseTerms()`
- `ExerciseTermsBuilder getExerciseTerms()`
- `Boolean getFollowUpConfirmation()`
- `PeriodBuilder getEffectivePeriod()`
- `ExerciseNoticeBuilder getExerciseNotice()`
- `BusinessCenterTimeBuilder getLatestCancelationTime()`
- `TransferBuilder getInitialFee()`
- `AdjustableOrRelativeDateBuilder getEarliestDate()`
- `AdjustableOrRelativeDateBuilder getExpirationDate()`
- `CallingPartyEnum getCallingParty()`
- `AdjustableOrRelativeDatesBuilder getEffectiveDate()`
- `BusinessCenterTimeBuilder getOrCreateEarliestCancellationTime()`
- `BusinessCenterTimeBuilder getOrCreateLatestCancelationTime()`
- `ExerciseNoticeBuilder getOrCreateExerciseNotice()`
- `AdjustableOrRelativeDateBuilder getOrCreateExpirationDate()`
- `AdjustableOrRelativeDateBuilder getOrCreateEarliestDate()`
- `PeriodBuilder getOrCreateEffectivePeriod()`
- `TransferBuilder getOrCreateInitialFee()`
- `CancelableProvisionAdjustedDatesBuilder getOrCreateCancelableProvisionAdjustedDates()`
- `FinalCalculationPeriodDateAdjustmentBuilder getOrCreateFinalCalculationPeriodDateAdjustment(int arg0)`
- `List getFinalCalculationPeriodDateAdjustment()`
- `CancelableProvisionAdjustedDatesBuilder getCancelableProvisionAdjustedDates()`
- `BusinessCenterTimeBuilder getEarliestCancellationTime()`

#### Adder Methods

- `CancelableProvisionBuilder addFinalCalculationPeriodDateAdjustment(FinalCalculationPeriodDateAdjustment arg0, int arg1)`
- `CancelableProvisionBuilder addFinalCalculationPeriodDateAdjustment(List arg0)`
- `CancelableProvisionBuilder addFinalCalculationPeriodDateAdjustment(FinalCalculationPeriodDateAdjustment arg0)`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `CancelableProvisionBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `boolean hasData()`
- `CancelableProvisionBuilder toBuilder()`
- `CancelableProvisionBuilder prune()`

