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
- `ExerciseTerms getExerciseTerms()`
- `PartyRole getSinglePartyOption()`
- `RelativeDateOffset getExtensionTerm()`
- `ExerciseNotice getExerciseNotice()`
- `Boolean getFollowUpConfirmation()`
- `CallingPartyEnum getCallingParty()`
- `AdjustableRelativeOrPeriodicDates getExtensionPeriod()`
- `ExtendibleProvisionAdjustedDates getExtendibleProvisionAdjustedDates()`
- `RelativeDateOffset getNoticeDeadlinePeriod()`
- `ZonedDateTime getNoticeDeadlineDateTime()`

#### Other Methods

- `void process(RosettaPath arg0, Processor arg1)`
- `ExtendibleProvisionBuilder toBuilder()`
- `RosettaMetaData metaData()`

### Annotations

- **RuneDataType**
- **RosettaDataType**

