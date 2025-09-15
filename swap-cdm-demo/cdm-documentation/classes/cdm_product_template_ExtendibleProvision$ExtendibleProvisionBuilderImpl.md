# ExtendibleProvisionBuilderImpl

**Full Name:** `cdm.product.template.ExtendibleProvision$ExtendibleProvisionBuilderImpl`

**Package:** `cdm.product.template`

## Type: Concrete Class

### Inheritance

**Extends:**
- `cdm.base.staticdata.party.BuyerSeller$BuyerSellerBuilderImpl`

### Implemented Interfaces

- `cdm.product.template.ExtendibleProvision$ExtendibleProvisionBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| exerciseNotice | `ExerciseNoticeBuilder` |  |
| followUpConfirmation | `Boolean` |  |
| extendibleProvisionAdjustedDates | `ExtendibleProvisionAdjustedDatesBuilder` |  |
| callingParty | `CallingPartyEnum` |  |
| singlePartyOption | `PartyRoleBuilder` |  |
| noticeDeadlinePeriod | `RelativeDateOffsetBuilder` |  |
| noticeDeadlineDateTime | `ZonedDateTime` |  |
| extensionTerm | `RelativeDateOffsetBuilder` |  |
| extensionPeriod | `AdjustableRelativeOrPeriodicDatesBuilder` |  |
| exerciseTerms | `ExerciseTermsBuilder` |  |

### Methods

#### Builder Methods

- `ExtendibleProvision build()`

#### Setter Methods

- `ExtendibleProvisionBuilder setExtensionPeriod(AdjustableRelativeOrPeriodicDates arg0)`
- `ExtendibleProvisionBuilder setExtensionTerm(RelativeDateOffset arg0)`
- `ExtendibleProvisionBuilder setExerciseTerms(ExerciseTerms arg0)`
- `ExtendibleProvisionBuilder setExtendibleProvisionAdjustedDates(ExtendibleProvisionAdjustedDates arg0)`
- `ExtendibleProvisionBuilder setFollowUpConfirmation(Boolean arg0)`
- `ExtendibleProvisionBuilder setExerciseNotice(ExerciseNotice arg0)`
- `ExtendibleProvisionBuilder setCallingParty(CallingPartyEnum arg0)`
- `ExtendibleProvisionBuilder setNoticeDeadlineDateTime(ZonedDateTime arg0)`
- `ExtendibleProvisionBuilder setNoticeDeadlinePeriod(RelativeDateOffset arg0)`
- `ExtendibleProvisionBuilder setSeller(CounterpartyRoleEnum arg0)`
- `ExtendibleProvisionBuilder setBuyer(CounterpartyRoleEnum arg0)`
- `ExtendibleProvisionBuilder setSinglePartyOption(PartyRole arg0)`

#### Getter Methods

- `RelativeDateOffsetBuilder getOrCreateExtensionTerm()`
- `AdjustableRelativeOrPeriodicDatesBuilder getOrCreateExtensionPeriod()`
- `ExerciseTermsBuilder getOrCreateExerciseTerms()`
- `PartyRoleBuilder getSinglePartyOption()`
- `ExerciseTermsBuilder getExerciseTerms()`
- `Boolean getFollowUpConfirmation()`
- `RelativeDateOffsetBuilder getExtensionTerm()`
- `ExerciseNoticeBuilder getExerciseNotice()`
- `AdjustableRelativeOrPeriodicDatesBuilder getExtensionPeriod()`
- `CallingPartyEnum getCallingParty()`
- `ExtendibleProvisionAdjustedDatesBuilder getOrCreateExtendibleProvisionAdjustedDates()`
- `PartyRoleBuilder getOrCreateSinglePartyOption()`
- `ExerciseNoticeBuilder getOrCreateExerciseNotice()`
- `RelativeDateOffsetBuilder getNoticeDeadlinePeriod()`
- `ZonedDateTime getNoticeDeadlineDateTime()`
- `RelativeDateOffsetBuilder getOrCreateNoticeDeadlinePeriod()`
- `ExtendibleProvisionAdjustedDatesBuilder getExtendibleProvisionAdjustedDates()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `ExtendibleProvisionBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `boolean hasData()`
- `ExtendibleProvisionBuilder toBuilder()`
- `ExtendibleProvisionBuilder prune()`

