# ExtendibleProvisionBuilder

**Full Name:** `cdm.product.template.ExtendibleProvision$ExtendibleProvisionBuilder`

**Package:** `cdm.product.template`

## Type: Interface

### Implemented Interfaces

- `cdm.product.template.ExtendibleProvision`
- `cdm.base.staticdata.party.BuyerSeller$BuyerSellerBuilder`

### Methods

#### Setter Methods

- `ExtendibleProvisionBuilder setExtensionPeriod(AdjustableRelativeOrPeriodicDates arg0)`
- `ExtendibleProvisionBuilder setExtensionTerm(RelativeDateOffset arg0)`
- `ExtendibleProvisionBuilder setExtendibleProvisionAdjustedDates(ExtendibleProvisionAdjustedDates arg0)`
- `ExtendibleProvisionBuilder setExerciseTerms(ExerciseTerms arg0)`
- `ExtendibleProvisionBuilder setExerciseNotice(ExerciseNotice arg0)`
- `ExtendibleProvisionBuilder setFollowUpConfirmation(Boolean arg0)`
- `ExtendibleProvisionBuilder setNoticeDeadlineDateTime(ZonedDateTime arg0)`
- `ExtendibleProvisionBuilder setNoticeDeadlinePeriod(RelativeDateOffset arg0)`
- `ExtendibleProvisionBuilder setCallingParty(CallingPartyEnum arg0)`
- `ExtendibleProvisionBuilder setSinglePartyOption(PartyRole arg0)`
- `ExtendibleProvisionBuilder setBuyer(CounterpartyRoleEnum arg0)`
- `ExtendibleProvisionBuilder setSeller(CounterpartyRoleEnum arg0)`

#### Getter Methods

- `AdjustableRelativeOrPeriodicDatesBuilder getOrCreateExtensionPeriod()`
- `RelativeDateOffsetBuilder getOrCreateExtensionTerm()`
- `ExtendibleProvisionAdjustedDatesBuilder getOrCreateExtendibleProvisionAdjustedDates()`
- `ExerciseTermsBuilder getExerciseTerms()`
- `PartyRoleBuilder getSinglePartyOption()`
- `RelativeDateOffsetBuilder getExtensionTerm()`
- `ExerciseNoticeBuilder getExerciseNotice()`
- `AdjustableRelativeOrPeriodicDatesBuilder getExtensionPeriod()`
- `ExerciseTermsBuilder getOrCreateExerciseTerms()`
- `ExtendibleProvisionAdjustedDatesBuilder getExtendibleProvisionAdjustedDates()`
- `ExerciseNoticeBuilder getOrCreateExerciseNotice()`
- `RelativeDateOffsetBuilder getOrCreateNoticeDeadlinePeriod()`
- `RelativeDateOffsetBuilder getNoticeDeadlinePeriod()`
- `PartyRoleBuilder getOrCreateSinglePartyOption()`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `ExtendibleProvisionBuilder prune()`

