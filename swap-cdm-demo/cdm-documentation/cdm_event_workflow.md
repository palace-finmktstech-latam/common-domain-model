# Package: cdm.event.workflow

## Enums

### CreditLimitTypeEnum
**Values:**
- `CS01`
- `DV01`
- `IM`
- `Notional`
- `NPV`
- `PV01`

### EventTimestampQualificationEnum
**Values:**
- `clearingDateTime`
- `clearingConfirmationDateTime`
- `clearingReceiptDateTime`
- `clearingSubmissionDateTime`
- `confirmationDateTime`
- `eventCreationDateTime`
- `eventExpirationDateTime`
- `eventProcessingDateTime`
- `eventSentDateTime`
- `eventSubmittedDateTime`
- `executionDateTime`
- `transactionCreationDateTime`

### LimitLevelEnum
**Values:**
- `Account`
- `Customer`
- `House`

### WarehouseIdentityEnum
**Values:**
- `DTCC_TIW_Gold`

### WorkflowStatusEnum
**Values:**
- `Accepted`
- `Alleged`
- `Amended`
- `Cancelled`
- `Certain`
- `Cleared`
- `Pending`
- `Rejected`
- `Submitted`
- `Terminated`
- `Uncertain`
- `Unconfirmed`
- `Affirmed`
- `Confirmed`

## Interfaces

### CreditLimitInformation
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `CreditLimitInformation` [Builder]
- `getLimitApplicable()` → `List` [Getter]

### CreditLimitInformationBuilder
**Implements:** `CreditLimitInformation` `RosettaModelObjectBuilder` 

**Key Methods:**
- `setLimitApplicable(List arg0)` → `CreditLimitInformationBuilder` [Setter]
- `getLimitApplicable()` → `List` [Getter]
- `getOrCreateLimitApplicable(int arg0)` → `LimitApplicableExtendedBuilder` [Getter]

### CreditLimitUtilisation
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `CreditLimitUtilisation` [Builder]
- `getExecuted()` → `CreditLimitUtilisationPosition` [Getter]
- `getPending()` → `CreditLimitUtilisationPosition` [Getter]

### CreditLimitUtilisationBuilder
**Implements:** `CreditLimitUtilisation` `RosettaModelObjectBuilder` 

**Key Methods:**
- `setPending(CreditLimitUtilisationPosition arg0)` → `CreditLimitUtilisationBuilder` [Setter]
- `getExecuted()` → `CreditLimitUtilisationPositionBuilder` [Getter]
- `getPending()` → `CreditLimitUtilisationPositionBuilder` [Getter]
- `setExecuted(CreditLimitUtilisationPosition arg0)` → `CreditLimitUtilisationBuilder` [Setter]
- `getOrCreateExecuted()` → `CreditLimitUtilisationPositionBuilder` [Getter]
- `getOrCreatePending()` → `CreditLimitUtilisationPositionBuilder` [Getter]

### CreditLimitUtilisationPosition
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `CreditLimitUtilisationPosition` [Builder]
- `getGlobal()` → `BigDecimal` [Getter]
- `getLongPosition()` → `BigDecimal` [Getter]
- `getShortPosition()` → `BigDecimal` [Getter]

### CreditLimitUtilisationPositionBuilder
**Implements:** `CreditLimitUtilisationPosition` `RosettaModelObjectBuilder` 

**Key Methods:**
- `setGlobal(BigDecimal arg0)` → `CreditLimitUtilisationPositionBuilder` [Setter]
- `setLongPosition(BigDecimal arg0)` → `CreditLimitUtilisationPositionBuilder` [Setter]
- `setShortPosition(BigDecimal arg0)` → `CreditLimitUtilisationPositionBuilder` [Setter]

### CustomisedWorkflow
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `CustomisedWorkflow` [Builder]
- `getItemValue()` → `String` [Getter]
- `getItemName()` → `String` [Getter]

### CustomisedWorkflowBuilder
**Implements:** `CustomisedWorkflow` `RosettaModelObjectBuilder` 

**Key Methods:**
- `setItemName(String arg0)` → `CustomisedWorkflowBuilder` [Setter]
- `setItemValue(String arg0)` → `CustomisedWorkflowBuilder` [Setter]

### EventInstruction
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `EventInstruction` [Builder]
- `getEffectiveDate()` → `Date` [Getter]
- `getPackageInformation()` → `IdentifiedList` [Getter]
- `getCorporateActionIntent()` → `CorporateActionTypeEnum` [Getter]
- `getInstruction()` → `List` [Getter]
- `getEventDate()` → `Date` [Getter]
- `getIntent()` → `EventIntentEnum` [Getter]

### EventInstructionBuilder
**Implements:** `EventInstruction` `RosettaModelObjectBuilder` 

**Key Methods:**
- `setEventDate(Date arg0)` → `EventInstructionBuilder` [Setter]
- `getOrCreatePackageInformation()` → `IdentifiedListBuilder` [Getter]
- `setIntent(EventIntentEnum arg0)` → `EventInstructionBuilder` [Setter]
- `getPackageInformation()` → `IdentifiedListBuilder` [Getter]
- `getInstruction()` → `List` [Getter]
- `setPackageInformation(IdentifiedList arg0)` → `EventInstructionBuilder` [Setter]
- `getOrCreateInstruction(int arg0)` → `InstructionBuilder` [Getter]
- `setCorporateActionIntent(CorporateActionTypeEnum arg0)` → `EventInstructionBuilder` [Setter]
- `setInstruction(List arg0)` → `EventInstructionBuilder` [Setter]
- `setEffectiveDate(Date arg0)` → `EventInstructionBuilder` [Setter]

### EventTimestamp
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `EventTimestamp` [Builder]
- `getQualification()` → `EventTimestampQualificationEnum` [Getter]
- `getDateTime()` → `ZonedDateTime` [Getter]

### EventTimestampBuilder
**Implements:** `EventTimestamp` `RosettaModelObjectBuilder` 

**Key Methods:**
- `setQualification(EventTimestampQualificationEnum arg0)` → `EventTimestampBuilder` [Setter]
- `setDateTime(ZonedDateTime arg0)` → `EventTimestampBuilder` [Setter]

### LimitApplicable
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `LimitApplicable` [Builder]
- `getCurrency()` → `FieldWithMetaString` [Getter]
- `getLimitType()` → `FieldWithMetaCreditLimitTypeEnum` [Getter]
- `getClipSize()` → `Integer` [Getter]
- `getUtilization()` → `CreditLimitUtilisation` [Getter]
- `getAmountRemaining()` → `BigDecimal` [Getter]
- `getAmountUtilized()` → `BigDecimal` [Getter]
- `getVelocity()` → `Velocity` [Getter]

### LimitApplicableBuilder
**Implements:** `LimitApplicable` `RosettaModelObjectBuilder` 

**Key Methods:**
- `getCurrency()` → `FieldWithMetaStringBuilder` [Getter]
- `setCurrency(FieldWithMetaString arg0)` → `LimitApplicableBuilder` [Setter]
- `setCurrencyValue(String arg0)` → `LimitApplicableBuilder` [Setter]
- `getLimitType()` → `FieldWithMetaCreditLimitTypeEnumBuilder` [Getter]
- `getUtilization()` → `CreditLimitUtilisationBuilder` [Getter]
- `getVelocity()` → `VelocityBuilder` [Getter]
- `setClipSize(Integer arg0)` → `LimitApplicableBuilder` [Setter]
- `getOrCreateUtilization()` → `CreditLimitUtilisationBuilder` [Getter]
- `setUtilization(CreditLimitUtilisation arg0)` → `LimitApplicableBuilder` [Setter]
- `getOrCreateVelocity()` → `VelocityBuilder` [Getter]

### LimitApplicableExtended
**Implements:** `LimitApplicable` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `LimitApplicableExtended` [Builder]
- `getLimitLevel()` → `FieldWithMetaLimitLevelEnum` [Getter]
- `getLimitAmount()` → `BigDecimal` [Getter]
- `getLimitImpactDueToTrade()` → `BigDecimal` [Getter]

### LimitApplicableExtendedBuilder
**Implements:** `LimitApplicableExtended` `LimitApplicable$LimitApplicableBuilder` 

**Key Methods:**
- `setCurrency(FieldWithMetaString arg0)` → `LimitApplicableExtendedBuilder` [Setter]
- `setCurrencyValue(String arg0)` → `LimitApplicableExtendedBuilder` [Setter]
- `getLimitLevel()` → `FieldWithMetaLimitLevelEnumBuilder` [Getter]
- `setLimitImpactDueToTrade(BigDecimal arg0)` → `LimitApplicableExtendedBuilder` [Setter]
- `setClipSize(Integer arg0)` → `LimitApplicableExtendedBuilder` [Setter]
- `setLimitAmount(BigDecimal arg0)` → `LimitApplicableExtendedBuilder` [Setter]
- `setLimitLevel(FieldWithMetaLimitLevelEnum arg0)` → `LimitApplicableExtendedBuilder` [Setter]
- `setUtilization(CreditLimitUtilisation arg0)` → `LimitApplicableExtendedBuilder` [Setter]
- `setLimitTypeValue(CreditLimitTypeEnum arg0)` → `LimitApplicableExtendedBuilder` [Setter]
- `setLimitLevelValue(LimitLevelEnum arg0)` → `LimitApplicableExtendedBuilder` [Setter]

### MessageInformation
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `MessageInformation` [Builder]
- `getMessageId()` → `FieldWithMetaString` [Getter]
- `getSentTo()` → `List` [Getter]
- `getSentBy()` → `FieldWithMetaString` [Getter]
- `getCopyTo()` → `List` [Getter]

### MessageInformationBuilder
**Implements:** `MessageInformation` `RosettaModelObjectBuilder` 

**Key Methods:**
- `getMessageId()` → `FieldWithMetaStringBuilder` [Getter]
- `getOrCreateCopyTo(int arg0)` → `FieldWithMetaStringBuilder` [Getter]
- `setMessageId(FieldWithMetaString arg0)` → `MessageInformationBuilder` [Setter]
- `getOrCreateMessageId()` → `FieldWithMetaStringBuilder` [Getter]
- `setMessageIdValue(String arg0)` → `MessageInformationBuilder` [Setter]
- `setSentToValue(List arg0)` → `MessageInformationBuilder` [Setter]
- `setSentByValue(String arg0)` → `MessageInformationBuilder` [Setter]
- `getOrCreateSentBy()` → `FieldWithMetaStringBuilder` [Getter]
- `setCopyToValue(List arg0)` → `MessageInformationBuilder` [Setter]
- `getOrCreateSentTo(int arg0)` → `FieldWithMetaStringBuilder` [Getter]

### PartyCustomisedWorkflow
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `PartyCustomisedWorkflow` [Builder]
- `getPartyReference()` → `ReferenceWithMetaParty` [Getter]
- `getPartyName()` → `String` [Getter]
- `getCustomisedWorkflow()` → `List` [Getter]

### PartyCustomisedWorkflowBuilder
**Implements:** `PartyCustomisedWorkflow` `RosettaModelObjectBuilder` 

**Key Methods:**
- `getPartyReference()` → `ReferenceWithMetaPartyBuilder` [Getter]
- `setPartyName(String arg0)` → `PartyCustomisedWorkflowBuilder` [Setter]
- `getCustomisedWorkflow()` → `List` [Getter]
- `setCustomisedWorkflow(List arg0)` → `PartyCustomisedWorkflowBuilder` [Setter]
- `setPartyReference(ReferenceWithMetaParty arg0)` → `PartyCustomisedWorkflowBuilder` [Setter]
- `getOrCreatePartyReference()` → `ReferenceWithMetaPartyBuilder` [Getter]
- `setPartyReferenceValue(Party arg0)` → `PartyCustomisedWorkflowBuilder` [Setter]
- `getOrCreateCustomisedWorkflow(int arg0)` → `CustomisedWorkflowBuilder` [Getter]

### Velocity
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `Velocity` [Builder]
- `getPeriodMultiplier()` → `Integer` [Getter]
- `getPeriod()` → `PeriodTimeEnum` [Getter]

### VelocityBuilder
**Implements:** `Velocity` `RosettaModelObjectBuilder` 

**Key Methods:**
- `setPeriod(PeriodTimeEnum arg0)` → `VelocityBuilder` [Setter]
- `setPeriodMultiplier(Integer arg0)` → `VelocityBuilder` [Setter]

### Workflow
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `Workflow` [Builder]
- `getSteps()` → `List` [Getter]

### WorkflowBuilder
**Implements:** `Workflow` `RosettaModelObjectBuilder` 

**Key Methods:**
- `getSteps()` → `List` [Getter]
- `setSteps(List arg0)` → `WorkflowBuilder` [Setter]
- `getOrCreateSteps(int arg0)` → `WorkflowStepBuilder` [Getter]

### WorkflowState
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `WorkflowState` [Builder]
- `getComment()` → `String` [Getter]
- `getPartyCustomisedWorkflow()` → `List` [Getter]
- `getWorkflowStatus()` → `WorkflowStatusEnum` [Getter]
- `getWarehouseIdentity()` → `WarehouseIdentityEnum` [Getter]

### WorkflowStateBuilder
**Implements:** `WorkflowState` `RosettaModelObjectBuilder` 

**Key Methods:**
- `setComment(String arg0)` → `WorkflowStateBuilder` [Setter]
- `getPartyCustomisedWorkflow()` → `List` [Getter]
- `setPartyCustomisedWorkflow(List arg0)` → `WorkflowStateBuilder` [Setter]
- `setWarehouseIdentity(WarehouseIdentityEnum arg0)` → `WorkflowStateBuilder` [Setter]
- `setWorkflowStatus(WorkflowStatusEnum arg0)` → `WorkflowStateBuilder` [Setter]
- `getOrCreatePartyCustomisedWorkflow(int arg0)` → `PartyCustomisedWorkflowBuilder` [Getter]

### WorkflowStep
**Implements:** `RosettaModelObject` `GlobalKey` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `WorkflowStep` [Builder]
- `getTimestamp()` → `List` [Getter]
- `getMeta()` → `MetaFields` [Getter]
- `getParty()` → `List` [Getter]
- `getAccount()` → `List` [Getter]
- `getAction()` → `ActionEnum` [Getter]
- `getLineage()` → `Lineage` [Getter]
- `getApproval()` → `List` [Getter]
- `getMessageInformation()` → `MessageInformation` [Getter]

### WorkflowStepApproval
**Implements:** `RosettaModelObject` `GlobalKey` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `WorkflowStepApproval` [Builder]
- `getTimestamp()` → `EventTimestamp` [Getter]
- `getMeta()` → `MetaFields` [Getter]
- `getParty()` → `ReferenceWithMetaParty` [Getter]
- `getRejectedReason()` → `String` [Getter]
- `getApproved()` → `Boolean` [Getter]

### WorkflowStepApprovalBuilder
**Implements:** `WorkflowStepApproval` `RosettaModelObjectBuilder` `GlobalKey$GlobalKeyBuilder` 

**Key Methods:**
- `getTimestamp()` → `EventTimestampBuilder` [Getter]
- `getOrCreateMeta()` → `MetaFieldsBuilder` [Getter]
- `setTimestamp(EventTimestamp arg0)` → `WorkflowStepApprovalBuilder` [Setter]
- `getMeta()` → `MetaFieldsBuilder` [Getter]
- `setMeta(MetaFields arg0)` → `WorkflowStepApprovalBuilder` [Setter]
- `getParty()` → `ReferenceWithMetaPartyBuilder` [Getter]
- `getOrCreateTimestamp()` → `EventTimestampBuilder` [Getter]
- `setApproved(Boolean arg0)` → `WorkflowStepApprovalBuilder` [Setter]
- `setPartyValue(Party arg0)` → `WorkflowStepApprovalBuilder` [Setter]
- `setRejectedReason(String arg0)` → `WorkflowStepApprovalBuilder` [Setter]

### WorkflowStepBuilder
**Implements:** `WorkflowStep` `RosettaModelObjectBuilder` `GlobalKey$GlobalKeyBuilder` 

**Key Methods:**
- `getTimestamp()` → `List` [Getter]
- `getOrCreateMeta()` → `MetaFieldsBuilder` [Getter]
- `getOrCreateCounterpartyPositionBusinessEvent()` → `CounterpartyPositionBusinessEventBuilder` [Getter]
- `setTimestamp(List arg0)` → `WorkflowStepBuilder` [Setter]
- `getMeta()` → `MetaFieldsBuilder` [Getter]
- `setMeta(MetaFields arg0)` → `WorkflowStepBuilder` [Setter]
- `getParty()` → `List` [Getter]
- `getAccount()` → `List` [Getter]
- `getOrCreateEventIdentifier(int arg0)` → `IdentifierBuilder` [Getter]
- `getOrCreateNextEvent()` → `EventInstructionBuilder` [Getter]

## Concrete Classes

### CreditLimitInformationBuilderImpl
**Implements:** `CreditLimitInformation$CreditLimitInformationBuilder` 

**Fields:**
- `List (List) limitApplicable`

**Key Methods:**
- `build()` → `CreditLimitInformation` [Builder]
- `setLimitApplicable(List arg0)` → `CreditLimitInformationBuilder` [Setter]
- `getLimitApplicable()` → `List` [Getter]
- `getOrCreateLimitApplicable(int arg0)` → `LimitApplicableExtendedBuilder` [Getter]

### CreditLimitInformationImpl
**Implements:** `CreditLimitInformation` 

**Key Methods:**
- `build()` → `CreditLimitInformation` [Builder]
- `setBuilderFields(CreditLimitInformationBuilder arg0)` → `void` [Setter]
- `getLimitApplicable()` → `List` [Getter]

### CreditLimitUtilisationBuilderImpl
**Implements:** `CreditLimitUtilisation$CreditLimitUtilisationBuilder` 

**Fields:**
- `CreditLimitUtilisationPositionBuilder executed`
- `CreditLimitUtilisationPositionBuilder pending`

**Key Methods:**
- `build()` → `CreditLimitUtilisation` [Builder]
- `setPending(CreditLimitUtilisationPosition arg0)` → `CreditLimitUtilisationBuilder` [Setter]
- `getExecuted()` → `CreditLimitUtilisationPositionBuilder` [Getter]
- `getPending()` → `CreditLimitUtilisationPositionBuilder` [Getter]
- `setExecuted(CreditLimitUtilisationPosition arg0)` → `CreditLimitUtilisationBuilder` [Setter]
- `getOrCreateExecuted()` → `CreditLimitUtilisationPositionBuilder` [Getter]
- `getOrCreatePending()` → `CreditLimitUtilisationPositionBuilder` [Getter]

### CreditLimitUtilisationImpl
**Implements:** `CreditLimitUtilisation` 

**Key Methods:**
- `build()` → `CreditLimitUtilisation` [Builder]
- `setBuilderFields(CreditLimitUtilisationBuilder arg0)` → `void` [Setter]
- `getExecuted()` → `CreditLimitUtilisationPosition` [Getter]
- `getPending()` → `CreditLimitUtilisationPosition` [Getter]

### CreditLimitUtilisationPositionBuilderImpl
**Implements:** `CreditLimitUtilisationPosition$CreditLimitUtilisationPositionBuilder` 

**Fields:**
- `BigDecimal shortPosition`
- `BigDecimal longPosition`
- `BigDecimal global`

**Key Methods:**
- `build()` → `CreditLimitUtilisationPosition` [Builder]
- `getGlobal()` → `BigDecimal` [Getter]
- `setGlobal(BigDecimal arg0)` → `CreditLimitUtilisationPositionBuilder` [Setter]
- `getLongPosition()` → `BigDecimal` [Getter]
- `getShortPosition()` → `BigDecimal` [Getter]
- `setLongPosition(BigDecimal arg0)` → `CreditLimitUtilisationPositionBuilder` [Setter]
- `setShortPosition(BigDecimal arg0)` → `CreditLimitUtilisationPositionBuilder` [Setter]

### CreditLimitUtilisationPositionImpl
**Implements:** `CreditLimitUtilisationPosition` 

**Key Methods:**
- `build()` → `CreditLimitUtilisationPosition` [Builder]
- `getGlobal()` → `BigDecimal` [Getter]
- `setBuilderFields(CreditLimitUtilisationPositionBuilder arg0)` → `void` [Setter]
- `getLongPosition()` → `BigDecimal` [Getter]
- `getShortPosition()` → `BigDecimal` [Getter]

### CustomisedWorkflowBuilderImpl
**Implements:** `CustomisedWorkflow$CustomisedWorkflowBuilder` 

**Fields:**
- `String itemName`
- `String itemValue`

**Key Methods:**
- `build()` → `CustomisedWorkflow` [Builder]
- `getItemValue()` → `String` [Getter]
- `setItemName(String arg0)` → `CustomisedWorkflowBuilder` [Setter]
- `getItemName()` → `String` [Getter]
- `setItemValue(String arg0)` → `CustomisedWorkflowBuilder` [Setter]

### CustomisedWorkflowImpl
**Implements:** `CustomisedWorkflow` 

**Key Methods:**
- `build()` → `CustomisedWorkflow` [Builder]
- `setBuilderFields(CustomisedWorkflowBuilder arg0)` → `void` [Setter]
- `getItemValue()` → `String` [Getter]
- `getItemName()` → `String` [Getter]

### EventInstructionBuilderImpl
**Implements:** `EventInstruction$EventInstructionBuilder` 

**Fields:**
- `EventIntentEnum intent`
- `CorporateActionTypeEnum corporateActionIntent`
- `Date eventDate`
- `Date effectiveDate`
- `IdentifiedListBuilder packageInformation`
- `List (List) instruction`

**Key Methods:**
- `build()` → `EventInstruction` [Builder]
- `getEffectiveDate()` → `Date` [Getter]
- `setEventDate(Date arg0)` → `EventInstructionBuilder` [Setter]
- `getOrCreatePackageInformation()` → `IdentifiedListBuilder` [Getter]
- `setIntent(EventIntentEnum arg0)` → `EventInstructionBuilder` [Setter]
- `getPackageInformation()` → `IdentifiedListBuilder` [Getter]
- `getCorporateActionIntent()` → `CorporateActionTypeEnum` [Getter]
- `getInstruction()` → `List` [Getter]
- `getEventDate()` → `Date` [Getter]
- `getIntent()` → `EventIntentEnum` [Getter]

### EventInstructionImpl
**Implements:** `EventInstruction` 

**Key Methods:**
- `build()` → `EventInstruction` [Builder]
- `setBuilderFields(EventInstructionBuilder arg0)` → `void` [Setter]
- `getEffectiveDate()` → `Date` [Getter]
- `getPackageInformation()` → `IdentifiedList` [Getter]
- `getCorporateActionIntent()` → `CorporateActionTypeEnum` [Getter]
- `getInstruction()` → `List` [Getter]
- `getEventDate()` → `Date` [Getter]
- `getIntent()` → `EventIntentEnum` [Getter]

### EventTimestampBuilderImpl
**Implements:** `EventTimestamp$EventTimestampBuilder` 

**Fields:**
- `ZonedDateTime dateTime`
- `EventTimestampQualificationEnum qualification`

**Key Methods:**
- `build()` → `EventTimestamp` [Builder]
- `setQualification(EventTimestampQualificationEnum arg0)` → `EventTimestampBuilder` [Setter]
- `getQualification()` → `EventTimestampQualificationEnum` [Getter]
- `setDateTime(ZonedDateTime arg0)` → `EventTimestampBuilder` [Setter]
- `getDateTime()` → `ZonedDateTime` [Getter]

### EventTimestampImpl
**Implements:** `EventTimestamp` 

**Key Methods:**
- `build()` → `EventTimestamp` [Builder]
- `setBuilderFields(EventTimestampBuilder arg0)` → `void` [Setter]
- `getQualification()` → `EventTimestampQualificationEnum` [Getter]
- `getDateTime()` → `ZonedDateTime` [Getter]

### LimitApplicableBuilderImpl
**Implements:** `LimitApplicable$LimitApplicableBuilder` 

**Fields:**
- `FieldWithMetaCreditLimitTypeEnumBuilder limitType`
- `Integer clipSize`
- `BigDecimal amountUtilized`
- `CreditLimitUtilisationBuilder utilization`
- `BigDecimal amountRemaining`
- `FieldWithMetaStringBuilder currency`
- `VelocityBuilder velocity`

**Key Methods:**
- `build()` → `LimitApplicable` [Builder]
- `getCurrency()` → `FieldWithMetaStringBuilder` [Getter]
- `setCurrency(FieldWithMetaString arg0)` → `LimitApplicableBuilder` [Setter]
- `setCurrencyValue(String arg0)` → `LimitApplicableBuilder` [Setter]
- `getLimitType()` → `FieldWithMetaCreditLimitTypeEnumBuilder` [Getter]
- `getClipSize()` → `Integer` [Getter]
- `getUtilization()` → `CreditLimitUtilisationBuilder` [Getter]
- `getAmountRemaining()` → `BigDecimal` [Getter]
- `getAmountUtilized()` → `BigDecimal` [Getter]
- `getVelocity()` → `VelocityBuilder` [Getter]

### LimitApplicableExtendedBuilderImpl
**Extends:** `LimitApplicable$LimitApplicableBuilderImpl` 
**Implements:** `LimitApplicableExtended$LimitApplicableExtendedBuilder` 

**Fields:**
- `FieldWithMetaLimitLevelEnumBuilder limitLevel`
- `BigDecimal limitAmount`
- `BigDecimal limitImpactDueToTrade`

**Key Methods:**
- `build()` → `LimitApplicableExtended` [Builder]
- `setCurrency(FieldWithMetaString arg0)` → `LimitApplicableExtendedBuilder` [Setter]
- `setCurrencyValue(String arg0)` → `LimitApplicableExtendedBuilder` [Setter]
- `getLimitLevel()` → `FieldWithMetaLimitLevelEnumBuilder` [Getter]
- `getLimitAmount()` → `BigDecimal` [Getter]
- `getLimitImpactDueToTrade()` → `BigDecimal` [Getter]
- `setLimitImpactDueToTrade(BigDecimal arg0)` → `LimitApplicableExtendedBuilder` [Setter]
- `setClipSize(Integer arg0)` → `LimitApplicableExtendedBuilder` [Setter]
- `setLimitAmount(BigDecimal arg0)` → `LimitApplicableExtendedBuilder` [Setter]
- `setLimitLevel(FieldWithMetaLimitLevelEnum arg0)` → `LimitApplicableExtendedBuilder` [Setter]

### LimitApplicableExtendedImpl
**Extends:** `LimitApplicable$LimitApplicableImpl` 
**Implements:** `LimitApplicableExtended` 

**Key Methods:**
- `build()` → `LimitApplicableExtended` [Builder]
- `setBuilderFields(LimitApplicableExtendedBuilder arg0)` → `void` [Setter]
- `getLimitLevel()` → `FieldWithMetaLimitLevelEnum` [Getter]
- `getLimitAmount()` → `BigDecimal` [Getter]
- `getLimitImpactDueToTrade()` → `BigDecimal` [Getter]

### LimitApplicableImpl
**Implements:** `LimitApplicable` 

**Key Methods:**
- `build()` → `LimitApplicable` [Builder]
- `getCurrency()` → `FieldWithMetaString` [Getter]
- `setBuilderFields(LimitApplicableBuilder arg0)` → `void` [Setter]
- `getLimitType()` → `FieldWithMetaCreditLimitTypeEnum` [Getter]
- `getClipSize()` → `Integer` [Getter]
- `getUtilization()` → `CreditLimitUtilisation` [Getter]
- `getAmountRemaining()` → `BigDecimal` [Getter]
- `getAmountUtilized()` → `BigDecimal` [Getter]
- `getVelocity()` → `Velocity` [Getter]

### MessageInformationBuilderImpl
**Implements:** `MessageInformation$MessageInformationBuilder` 

**Fields:**
- `FieldWithMetaStringBuilder messageId`
- `FieldWithMetaStringBuilder sentBy`
- `List (List) sentTo`
- `List (List) copyTo`

**Key Methods:**
- `build()` → `MessageInformation` [Builder]
- `getMessageId()` → `FieldWithMetaStringBuilder` [Getter]
- `getOrCreateCopyTo(int arg0)` → `FieldWithMetaStringBuilder` [Getter]
- `setMessageId(FieldWithMetaString arg0)` → `MessageInformationBuilder` [Setter]
- `getOrCreateMessageId()` → `FieldWithMetaStringBuilder` [Getter]
- `setMessageIdValue(String arg0)` → `MessageInformationBuilder` [Setter]
- `setSentToValue(List arg0)` → `MessageInformationBuilder` [Setter]
- `setSentByValue(String arg0)` → `MessageInformationBuilder` [Setter]
- `getOrCreateSentBy()` → `FieldWithMetaStringBuilder` [Getter]
- `setCopyToValue(List arg0)` → `MessageInformationBuilder` [Setter]

### MessageInformationImpl
**Implements:** `MessageInformation` 

**Key Methods:**
- `build()` → `MessageInformation` [Builder]
- `setBuilderFields(MessageInformationBuilder arg0)` → `void` [Setter]
- `getMessageId()` → `FieldWithMetaString` [Getter]
- `getSentTo()` → `List` [Getter]
- `getSentBy()` → `FieldWithMetaString` [Getter]
- `getCopyTo()` → `List` [Getter]

### PartyCustomisedWorkflowBuilderImpl
**Implements:** `PartyCustomisedWorkflow$PartyCustomisedWorkflowBuilder` 

**Fields:**
- `ReferenceWithMetaPartyBuilder partyReference`
- `String partyName`
- `List (List) customisedWorkflow`

**Key Methods:**
- `build()` → `PartyCustomisedWorkflow` [Builder]
- `getPartyReference()` → `ReferenceWithMetaPartyBuilder` [Getter]
- `getPartyName()` → `String` [Getter]
- `setPartyName(String arg0)` → `PartyCustomisedWorkflowBuilder` [Setter]
- `getCustomisedWorkflow()` → `List` [Getter]
- `setCustomisedWorkflow(List arg0)` → `PartyCustomisedWorkflowBuilder` [Setter]
- `setPartyReference(ReferenceWithMetaParty arg0)` → `PartyCustomisedWorkflowBuilder` [Setter]
- `getOrCreatePartyReference()` → `ReferenceWithMetaPartyBuilder` [Getter]
- `setPartyReferenceValue(Party arg0)` → `PartyCustomisedWorkflowBuilder` [Setter]
- `getOrCreateCustomisedWorkflow(int arg0)` → `CustomisedWorkflowBuilder` [Getter]

### PartyCustomisedWorkflowImpl
**Implements:** `PartyCustomisedWorkflow` 

**Key Methods:**
- `build()` → `PartyCustomisedWorkflow` [Builder]
- `setBuilderFields(PartyCustomisedWorkflowBuilder arg0)` → `void` [Setter]
- `getPartyReference()` → `ReferenceWithMetaParty` [Getter]
- `getPartyName()` → `String` [Getter]
- `getCustomisedWorkflow()` → `List` [Getter]

### VelocityBuilderImpl
**Implements:** `Velocity$VelocityBuilder` 

**Fields:**
- `Integer periodMultiplier`
- `PeriodTimeEnum period`

**Key Methods:**
- `build()` → `Velocity` [Builder]
- `getPeriodMultiplier()` → `Integer` [Getter]
- `getPeriod()` → `PeriodTimeEnum` [Getter]
- `setPeriod(PeriodTimeEnum arg0)` → `VelocityBuilder` [Setter]
- `setPeriodMultiplier(Integer arg0)` → `VelocityBuilder` [Setter]

### VelocityImpl
**Implements:** `Velocity` 

**Key Methods:**
- `build()` → `Velocity` [Builder]
- `setBuilderFields(VelocityBuilder arg0)` → `void` [Setter]
- `getPeriodMultiplier()` → `Integer` [Getter]
- `getPeriod()` → `PeriodTimeEnum` [Getter]

### WorkflowBuilderImpl
**Implements:** `Workflow$WorkflowBuilder` 

**Fields:**
- `List (List) steps`

**Key Methods:**
- `build()` → `Workflow` [Builder]
- `getSteps()` → `List` [Getter]
- `setSteps(List arg0)` → `WorkflowBuilder` [Setter]
- `getOrCreateSteps(int arg0)` → `WorkflowStepBuilder` [Getter]

### WorkflowImpl
**Implements:** `Workflow` 

**Key Methods:**
- `build()` → `Workflow` [Builder]
- `setBuilderFields(WorkflowBuilder arg0)` → `void` [Setter]
- `getSteps()` → `List` [Getter]

### WorkflowStateBuilderImpl
**Implements:** `WorkflowState$WorkflowStateBuilder` 

**Fields:**
- `WorkflowStatusEnum workflowStatus`
- `String comment`
- `List (List) partyCustomisedWorkflow`
- `WarehouseIdentityEnum warehouseIdentity`

**Key Methods:**
- `build()` → `WorkflowState` [Builder]
- `setComment(String arg0)` → `WorkflowStateBuilder` [Setter]
- `getComment()` → `String` [Getter]
- `getPartyCustomisedWorkflow()` → `List` [Getter]
- `setPartyCustomisedWorkflow(List arg0)` → `WorkflowStateBuilder` [Setter]
- `setWarehouseIdentity(WarehouseIdentityEnum arg0)` → `WorkflowStateBuilder` [Setter]
- `setWorkflowStatus(WorkflowStatusEnum arg0)` → `WorkflowStateBuilder` [Setter]
- `getWorkflowStatus()` → `WorkflowStatusEnum` [Getter]
- `getWarehouseIdentity()` → `WarehouseIdentityEnum` [Getter]
- `getOrCreatePartyCustomisedWorkflow(int arg0)` → `PartyCustomisedWorkflowBuilder` [Getter]

### WorkflowStateImpl
**Implements:** `WorkflowState` 

**Key Methods:**
- `build()` → `WorkflowState` [Builder]
- `getComment()` → `String` [Getter]
- `setBuilderFields(WorkflowStateBuilder arg0)` → `void` [Setter]
- `getPartyCustomisedWorkflow()` → `List` [Getter]
- `getWorkflowStatus()` → `WorkflowStatusEnum` [Getter]
- `getWarehouseIdentity()` → `WarehouseIdentityEnum` [Getter]

### WorkflowStepApprovalBuilderImpl
**Implements:** `WorkflowStepApproval$WorkflowStepApprovalBuilder` 

**Fields:**
- `Boolean approved`
- `ReferenceWithMetaPartyBuilder party`
- `String rejectedReason`
- `EventTimestampBuilder timestamp`
- `MetaFieldsBuilder meta`

**Key Methods:**
- `build()` → `WorkflowStepApproval` [Builder]
- `getTimestamp()` → `EventTimestampBuilder` [Getter]
- `getOrCreateMeta()` → `MetaFieldsBuilder` [Getter]
- `setTimestamp(EventTimestamp arg0)` → `WorkflowStepApprovalBuilder` [Setter]
- `getMeta()` → `MetaFieldsBuilder` [Getter]
- `setMeta(MetaFields arg0)` → `WorkflowStepApprovalBuilder` [Setter]
- `getParty()` → `ReferenceWithMetaPartyBuilder` [Getter]
- `getOrCreateTimestamp()` → `EventTimestampBuilder` [Getter]
- `setApproved(Boolean arg0)` → `WorkflowStepApprovalBuilder` [Setter]
- `getRejectedReason()` → `String` [Getter]

### WorkflowStepApprovalImpl
**Implements:** `WorkflowStepApproval` 

**Key Methods:**
- `build()` → `WorkflowStepApproval` [Builder]
- `getTimestamp()` → `EventTimestamp` [Getter]
- `setBuilderFields(WorkflowStepApprovalBuilder arg0)` → `void` [Setter]
- `getMeta()` → `MetaFields` [Getter]
- `getParty()` → `ReferenceWithMetaParty` [Getter]
- `getRejectedReason()` → `String` [Getter]
- `getApproved()` → `Boolean` [Getter]

### WorkflowStepBuilderImpl
**Implements:** `WorkflowStep$WorkflowStepBuilder` 

**Fields:**
- `BusinessEventBuilder businessEvent`
- `CounterpartyPositionBusinessEventBuilder counterpartyPositionBusinessEvent`
- `EventInstructionBuilder proposedEvent`
- `Boolean rejected`
- `List (List) approval`
- `ReferenceWithMetaWorkflowStepBuilder previousWorkflowStep`
- `EventInstructionBuilder nextEvent`
- `MessageInformationBuilder messageInformation`
- `List (List) timestamp`
- `List (List) eventIdentifier`
- `ActionEnum action`
- `List (List) party`
- `List (List) account`
- `LineageBuilder lineage`
- `CreditLimitInformationBuilder creditLimitInformation`
- `WorkflowStateBuilder workflowState`
- `MetaFieldsBuilder meta`

**Key Methods:**
- `build()` → `WorkflowStep` [Builder]
- `getTimestamp()` → `List` [Getter]
- `getOrCreateMeta()` → `MetaFieldsBuilder` [Getter]
- `getOrCreateCounterpartyPositionBusinessEvent()` → `CounterpartyPositionBusinessEventBuilder` [Getter]
- `setTimestamp(List arg0)` → `WorkflowStepBuilder` [Setter]
- `getMeta()` → `MetaFieldsBuilder` [Getter]
- `setMeta(MetaFields arg0)` → `WorkflowStepBuilder` [Setter]
- `getParty()` → `List` [Getter]
- `getAccount()` → `List` [Getter]
- `getOrCreateEventIdentifier(int arg0)` → `IdentifierBuilder` [Getter]

### WorkflowStepImpl
**Implements:** `WorkflowStep` 

**Key Methods:**
- `build()` → `WorkflowStep` [Builder]
- `getTimestamp()` → `List` [Getter]
- `setBuilderFields(WorkflowStepBuilder arg0)` → `void` [Setter]
- `getMeta()` → `MetaFields` [Getter]
- `getParty()` → `List` [Getter]
- `getAccount()` → `List` [Getter]
- `getAction()` → `ActionEnum` [Getter]
- `getLineage()` → `Lineage` [Getter]
- `getApproval()` → `List` [Getter]
- `getMessageInformation()` → `MessageInformation` [Getter]

