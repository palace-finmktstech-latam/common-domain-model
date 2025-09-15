# ExtendibleProvision

**Full Name:** `cdm.product.template.ExtendibleProvision`

**Package:** `cdm.product.template`

## Type: Interface

### Implemented Interfaces

- `cdm.base.staticdata.party.BuyerSeller`

### Methods

#### Builder Methods

- `ExtendibleProvision build()`

#### Getter Methods

- `Class getType()`
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

- `void process(RosettaPath arg0, Processor arg1)`
- `ExtendibleProvisionBuilder toBuilder()`
- `RosettaMetaData metaData()`

### Annotations

- **RuneDataType**
- **RosettaDataType**

