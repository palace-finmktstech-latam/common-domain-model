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
- `getExecuted()` → `CreditLimitUtilisationPositionBuilder` [Getter]
- `getPending()` → `CreditLimitUtilisationPositionBuilder` [Getter]
- `setExecuted(CreditLimitUtilisationPosition arg0)` → `CreditLimitUtilisationBuilder` [Setter]
- `getOrCreateExecuted()` → `CreditLimitUtilisationPositionBuilder` [Getter]
- `getOrCreatePending()` → `CreditLimitUtilisationPositionBuilder` [Getter]
- `setPending(CreditLimitUtilisationPosition arg0)` → `CreditLimitUtilisationBuilder` [Setter]

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
- `setShortPosition(BigDecimal arg0)` → `CreditLimitUtilisationPositionBuilder` [Setter]
- `setLongPosition(BigDecimal arg0)` → `CreditLimitUtilisationPositionBuilder` [Setter]
- `setGlobal(BigDecimal arg0)` → `CreditLimitUtilisationPositionBuilder` [Setter]

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
- `setItemValue(String arg0)` → `CustomisedWorkflowBuilder` [Setter]
- `setItemName(String arg0)` → `CustomisedWorkflowBuilder` [Setter]

### EventInstruction
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `EventInstruction` [Builder]
- `getEffectiveDate()` → `Date` [Getter]
- `getInstruction()` → `List` [Getter]
- `getCorporateActionIntent()` → `CorporateActionTypeEnum` [Getter]
- `getPackageInformation()` → `IdentifiedList` [Getter]
- `getEventDate()` → `Date` [Getter]
- `getIntent()` → `EventIntentEnum` [Getter]

### EventInstructionBuilder
**Implements:** `EventInstruction` `RosettaModelObjectBuilder` 

**Key Methods:**
- `setIntent(EventIntentEnum arg0)` → `EventInstructionBuilder` [Setter]
- `setEffectiveDate(Date arg0)` → `EventInstructionBuilder` [Setter]
- `setEventDate(Date arg0)` → `EventInstructionBuilder` [Setter]
- `setCorporateActionIntent(CorporateActionTypeEnum arg0)` → `EventInstructionBuilder` [Setter]
- `getInstruction()` → `List` [Getter]
- `getPackageInformation()` → `IdentifiedListBuilder` [Getter]
- `getOrCreatePackageInformation()` → `IdentifiedListBuilder` [Getter]
- `setPackageInformation(IdentifiedList arg0)` → `EventInstructionBuilder` [Setter]
- `getOrCreateInstruction(int arg0)` → `InstructionBuilder` [Getter]
- `setInstruction(List arg0)` → `EventInstructionBuilder` [Setter]

### EventTimestamp
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `EventTimestamp` [Builder]
- `getDateTime()` → `ZonedDateTime` [Getter]
- `getQualification()` → `EventTimestampQualificationEnum` [Getter]

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
- `getClipSize()` → `Integer` [Getter]
- `getAmountUtilized()` → `BigDecimal` [Getter]
- `getLimitType()` → `FieldWithMetaCreditLimitTypeEnum` [Getter]
- `getUtilization()` → `CreditLimitUtilisation` [Getter]
- `getAmountRemaining()` → `BigDecimal` [Getter]
- `getVelocity()` → `Velocity` [Getter]

### LimitApplicableBuilder
**Implements:** `LimitApplicable` `RosettaModelObjectBuilder` 

**Key Methods:**
- `getCurrency()` → `FieldWithMetaStringBuilder` [Getter]
- `setCurrency(FieldWithMetaString arg0)` → `LimitApplicableBuilder` [Setter]
- `getLimitType()` → `FieldWithMetaCreditLimitTypeEnumBuilder` [Getter]
- `getUtilization()` → `CreditLimitUtilisationBuilder` [Getter]
- `getOrCreateLimitType()` → `FieldWithMetaCreditLimitTypeEnumBuilder` [Getter]
- `setLimitTypeValue(CreditLimitTypeEnum arg0)` → `LimitApplicableBuilder` [Setter]
- `setClipSize(Integer arg0)` → `LimitApplicableBuilder` [Setter]
- `setUtilization(CreditLimitUtilisation arg0)` → `LimitApplicableBuilder` [Setter]
- `setAmountUtilized(BigDecimal arg0)` → `LimitApplicableBuilder` [Setter]
- `setAmountRemaining(BigDecimal arg0)` → `LimitApplicableBuilder` [Setter]

### LimitApplicableExtended
**Implements:** `LimitApplicable` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `LimitApplicableExtended` [Builder]
- `getLimitImpactDueToTrade()` → `BigDecimal` [Getter]
- `getLimitAmount()` → `BigDecimal` [Getter]
- `getLimitLevel()` → `FieldWithMetaLimitLevelEnum` [Getter]

### LimitApplicableExtendedBuilder
**Implements:** `LimitApplicableExtended` `LimitApplicable$LimitApplicableBuilder` 

**Key Methods:**
- `setCurrency(FieldWithMetaString arg0)` → `LimitApplicableExtendedBuilder` [Setter]
- `getLimitLevel()` → `FieldWithMetaLimitLevelEnumBuilder` [Getter]
- `getOrCreateLimitLevel()` → `FieldWithMetaLimitLevelEnumBuilder` [Getter]
- `setLimitTypeValue(CreditLimitTypeEnum arg0)` → `LimitApplicableExtendedBuilder` [Setter]
- `setClipSize(Integer arg0)` → `LimitApplicableExtendedBuilder` [Setter]
- `setUtilization(CreditLimitUtilisation arg0)` → `LimitApplicableExtendedBuilder` [Setter]
- `setAmountUtilized(BigDecimal arg0)` → `LimitApplicableExtendedBuilder` [Setter]
- `setAmountRemaining(BigDecimal arg0)` → `LimitApplicableExtendedBuilder` [Setter]
- `setVelocity(Velocity arg0)` → `LimitApplicableExtendedBuilder` [Setter]
- `setLimitLevel(FieldWithMetaLimitLevelEnum arg0)` → `LimitApplicableExtendedBuilder` [Setter]

### MessageInformation
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `MessageInformation` [Builder]
- `getMessageId()` → `FieldWithMetaString` [Getter]
- `getSentTo()` → `List` [Getter]
- `getCopyTo()` → `List` [Getter]
- `getSentBy()` → `FieldWithMetaString` [Getter]

### MessageInformationBuilder
**Implements:** `MessageInformation` `RosettaModelObjectBuilder` 

**Key Methods:**
- `getMessageId()` → `FieldWithMetaStringBuilder` [Getter]
- `getOrCreateSentTo(int arg0)` → `FieldWithMetaStringBuilder` [Getter]
- `getOrCreateCopyTo(int arg0)` → `FieldWithMetaStringBuilder` [Getter]
- `setMessageIdValue(String arg0)` → `MessageInformationBuilder` [Setter]
- `setSentByValue(String arg0)` → `MessageInformationBuilder` [Setter]
- `getOrCreateMessageId()` → `FieldWithMetaStringBuilder` [Getter]
- `setMessageId(FieldWithMetaString arg0)` → `MessageInformationBuilder` [Setter]
- `setSentToValue(List arg0)` → `MessageInformationBuilder` [Setter]
- `getOrCreateSentBy()` → `FieldWithMetaStringBuilder` [Getter]
- `setCopyToValue(List arg0)` → `MessageInformationBuilder` [Setter]

### PartyCustomisedWorkflow
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `PartyCustomisedWorkflow` [Builder]
- `getPartyName()` → `String` [Getter]
- `getCustomisedWorkflow()` → `List` [Getter]
- `getPartyReference()` → `ReferenceWithMetaParty` [Getter]

### PartyCustomisedWorkflowBuilder
**Implements:** `PartyCustomisedWorkflow` `RosettaModelObjectBuilder` 

**Key Methods:**
- `getCustomisedWorkflow()` → `List` [Getter]
- `setCustomisedWorkflow(List arg0)` → `PartyCustomisedWorkflowBuilder` [Setter]
- `setPartyName(String arg0)` → `PartyCustomisedWorkflowBuilder` [Setter]
- `getPartyReference()` → `ReferenceWithMetaPartyBuilder` [Getter]
- `setPartyReferenceValue(Party arg0)` → `PartyCustomisedWorkflowBuilder` [Setter]
- `getOrCreatePartyReference()` → `ReferenceWithMetaPartyBuilder` [Getter]
- `getOrCreateCustomisedWorkflow(int arg0)` → `CustomisedWorkflowBuilder` [Getter]
- `setPartyReference(ReferenceWithMetaParty arg0)` → `PartyCustomisedWorkflowBuilder` [Setter]

### Velocity
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `Velocity` [Builder]
- `getPeriod()` → `PeriodTimeEnum` [Getter]
- `getPeriodMultiplier()` → `Integer` [Getter]

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
- `getOrCreateSteps(int arg0)` → `WorkflowStepBuilder` [Getter]
- `setSteps(List arg0)` → `WorkflowBuilder` [Setter]
- `getSteps()` → `List` [Getter]

### WorkflowState
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `WorkflowState` [Builder]
- `getComment()` → `String` [Getter]
- `getPartyCustomisedWorkflow()` → `List` [Getter]
- `getWarehouseIdentity()` → `WarehouseIdentityEnum` [Getter]
- `getWorkflowStatus()` → `WorkflowStatusEnum` [Getter]

### WorkflowStateBuilder
**Implements:** `WorkflowState` `RosettaModelObjectBuilder` 

**Key Methods:**
- `setComment(String arg0)` → `WorkflowStateBuilder` [Setter]
- `setWorkflowStatus(WorkflowStatusEnum arg0)` → `WorkflowStateBuilder` [Setter]
- `setWarehouseIdentity(WarehouseIdentityEnum arg0)` → `WorkflowStateBuilder` [Setter]
- `getPartyCustomisedWorkflow()` → `List` [Getter]
- `setPartyCustomisedWorkflow(List arg0)` → `WorkflowStateBuilder` [Setter]
- `getOrCreatePartyCustomisedWorkflow(int arg0)` → `PartyCustomisedWorkflowBuilder` [Getter]

### WorkflowStep
**Implements:** `RosettaModelObject` `GlobalKey` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `WorkflowStep` [Builder]
- `getTimestamp()` → `List` [Getter]
- `getAction()` → `ActionEnum` [Getter]
- `getLineage()` → `Lineage` [Getter]
- `getPreviousWorkflowStep()` → `ReferenceWithMetaWorkflowStep` [Getter]
- `getProposedEvent()` → `EventInstruction` [Getter]
- `getApproval()` → `List` [Getter]
- `getRejected()` → `Boolean` [Getter]
- `getBusinessEvent()` → `BusinessEvent` [Getter]

### WorkflowStepApproval
**Implements:** `RosettaModelObject` `GlobalKey` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `WorkflowStepApproval` [Builder]
- `getTimestamp()` → `EventTimestamp` [Getter]
- `getRejectedReason()` → `String` [Getter]
- `getApproved()` → `Boolean` [Getter]
- `getParty()` → `ReferenceWithMetaParty` [Getter]
- `getMeta()` → `MetaFields` [Getter]

### WorkflowStepApprovalBuilder
**Implements:** `WorkflowStepApproval` `RosettaModelObjectBuilder` `GlobalKey$GlobalKeyBuilder` 

**Key Methods:**
- `getTimestamp()` → `EventTimestampBuilder` [Getter]
- `getOrCreateTimestamp()` → `EventTimestampBuilder` [Getter]
- `setApproved(Boolean arg0)` → `WorkflowStepApprovalBuilder` [Setter]
- `setPartyValue(Party arg0)` → `WorkflowStepApprovalBuilder` [Setter]
- `setRejectedReason(String arg0)` → `WorkflowStepApprovalBuilder` [Setter]
- `setTimestamp(EventTimestamp arg0)` → `WorkflowStepApprovalBuilder` [Setter]
- `getOrCreateMeta()` → `MetaFieldsBuilder` [Getter]
- `getParty()` → `ReferenceWithMetaPartyBuilder` [Getter]
- `getOrCreateParty()` → `ReferenceWithMetaPartyBuilder` [Getter]
- `setParty(ReferenceWithMetaParty arg0)` → `WorkflowStepApprovalBuilder` [Setter]

### WorkflowStepBuilder
**Implements:** `WorkflowStep` `RosettaModelObjectBuilder` `GlobalKey$GlobalKeyBuilder` 

**Key Methods:**
- `getTimestamp()` → `List` [Getter]
- `getOrCreateWorkflowState()` → `WorkflowStateBuilder` [Getter]
- `getOrCreateApproval(int arg0)` → `WorkflowStepApprovalBuilder` [Getter]
- `getOrCreateProposedEvent()` → `EventInstructionBuilder` [Getter]
- `getOrCreateEventIdentifier(int arg0)` → `IdentifierBuilder` [Getter]
- `getOrCreateBusinessEvent()` → `BusinessEventBuilder` [Getter]
- `setBusinessEvent(BusinessEvent arg0)` → `WorkflowStepBuilder` [Setter]
- `getOrCreateTimestamp(int arg0)` → `EventTimestampBuilder` [Getter]
- `setProposedEvent(EventInstruction arg0)` → `WorkflowStepBuilder` [Setter]
- `setApproval(List arg0)` → `WorkflowStepBuilder` [Setter]

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
- `getLimitApplicable()` → `List` [Getter]
- `setBuilderFields(CreditLimitInformationBuilder arg0)` → `void` [Setter]

### CreditLimitUtilisationBuilderImpl
**Implements:** `CreditLimitUtilisation$CreditLimitUtilisationBuilder` 

**Fields:**
- `CreditLimitUtilisationPositionBuilder executed`
- `CreditLimitUtilisationPositionBuilder pending`

**Key Methods:**
- `build()` → `CreditLimitUtilisation` [Builder]
- `getExecuted()` → `CreditLimitUtilisationPositionBuilder` [Getter]
- `getPending()` → `CreditLimitUtilisationPositionBuilder` [Getter]
- `setExecuted(CreditLimitUtilisationPosition arg0)` → `CreditLimitUtilisationBuilder` [Setter]
- `getOrCreateExecuted()` → `CreditLimitUtilisationPositionBuilder` [Getter]
- `getOrCreatePending()` → `CreditLimitUtilisationPositionBuilder` [Getter]
- `setPending(CreditLimitUtilisationPosition arg0)` → `CreditLimitUtilisationBuilder` [Setter]

### CreditLimitUtilisationImpl
**Implements:** `CreditLimitUtilisation` 

**Key Methods:**
- `build()` → `CreditLimitUtilisation` [Builder]
- `getExecuted()` → `CreditLimitUtilisationPosition` [Getter]
- `getPending()` → `CreditLimitUtilisationPosition` [Getter]
- `setBuilderFields(CreditLimitUtilisationBuilder arg0)` → `void` [Setter]

### CreditLimitUtilisationPositionBuilderImpl
**Implements:** `CreditLimitUtilisationPosition$CreditLimitUtilisationPositionBuilder` 

**Fields:**
- `BigDecimal shortPosition`
- `BigDecimal longPosition`
- `BigDecimal global`

**Key Methods:**
- `build()` → `CreditLimitUtilisationPosition` [Builder]
- `getGlobal()` → `BigDecimal` [Getter]
- `getLongPosition()` → `BigDecimal` [Getter]
- `getShortPosition()` → `BigDecimal` [Getter]
- `setShortPosition(BigDecimal arg0)` → `CreditLimitUtilisationPositionBuilder` [Setter]
- `setLongPosition(BigDecimal arg0)` → `CreditLimitUtilisationPositionBuilder` [Setter]
- `setGlobal(BigDecimal arg0)` → `CreditLimitUtilisationPositionBuilder` [Setter]

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
- `setItemValue(String arg0)` → `CustomisedWorkflowBuilder` [Setter]
- `setItemName(String arg0)` → `CustomisedWorkflowBuilder` [Setter]
- `getItemValue()` → `String` [Getter]
- `getItemName()` → `String` [Getter]

### CustomisedWorkflowImpl
**Implements:** `CustomisedWorkflow` 

**Key Methods:**
- `build()` → `CustomisedWorkflow` [Builder]
- `getItemValue()` → `String` [Getter]
- `getItemName()` → `String` [Getter]
- `setBuilderFields(CustomisedWorkflowBuilder arg0)` → `void` [Setter]

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
- `setIntent(EventIntentEnum arg0)` → `EventInstructionBuilder` [Setter]
- `setEffectiveDate(Date arg0)` → `EventInstructionBuilder` [Setter]
- `getEffectiveDate()` → `Date` [Getter]
- `setEventDate(Date arg0)` → `EventInstructionBuilder` [Setter]
- `setCorporateActionIntent(CorporateActionTypeEnum arg0)` → `EventInstructionBuilder` [Setter]
- `getInstruction()` → `List` [Getter]
- `getCorporateActionIntent()` → `CorporateActionTypeEnum` [Getter]
- `getPackageInformation()` → `IdentifiedListBuilder` [Getter]
- `getEventDate()` → `Date` [Getter]

### EventInstructionImpl
**Implements:** `EventInstruction` 

**Key Methods:**
- `build()` → `EventInstruction` [Builder]
- `getEffectiveDate()` → `Date` [Getter]
- `setBuilderFields(EventInstructionBuilder arg0)` → `void` [Setter]
- `getInstruction()` → `List` [Getter]
- `getCorporateActionIntent()` → `CorporateActionTypeEnum` [Getter]
- `getPackageInformation()` → `IdentifiedList` [Getter]
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
- `getDateTime()` → `ZonedDateTime` [Getter]
- `getQualification()` → `EventTimestampQualificationEnum` [Getter]
- `setDateTime(ZonedDateTime arg0)` → `EventTimestampBuilder` [Setter]

### EventTimestampImpl
**Implements:** `EventTimestamp` 

**Key Methods:**
- `build()` → `EventTimestamp` [Builder]
- `getDateTime()` → `ZonedDateTime` [Getter]
- `getQualification()` → `EventTimestampQualificationEnum` [Getter]
- `setBuilderFields(EventTimestampBuilder arg0)` → `void` [Setter]

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
- `getClipSize()` → `Integer` [Getter]
- `getAmountUtilized()` → `BigDecimal` [Getter]
- `getLimitType()` → `FieldWithMetaCreditLimitTypeEnumBuilder` [Getter]
- `getUtilization()` → `CreditLimitUtilisationBuilder` [Getter]
- `getAmountRemaining()` → `BigDecimal` [Getter]
- `getOrCreateLimitType()` → `FieldWithMetaCreditLimitTypeEnumBuilder` [Getter]
- `setLimitTypeValue(CreditLimitTypeEnum arg0)` → `LimitApplicableBuilder` [Setter]

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
- `getLimitImpactDueToTrade()` → `BigDecimal` [Getter]
- `getLimitAmount()` → `BigDecimal` [Getter]
- `getLimitLevel()` → `FieldWithMetaLimitLevelEnumBuilder` [Getter]
- `getOrCreateLimitLevel()` → `FieldWithMetaLimitLevelEnumBuilder` [Getter]
- `setLimitTypeValue(CreditLimitTypeEnum arg0)` → `LimitApplicableExtendedBuilder` [Setter]
- `setClipSize(Integer arg0)` → `LimitApplicableExtendedBuilder` [Setter]
- `setUtilization(CreditLimitUtilisation arg0)` → `LimitApplicableExtendedBuilder` [Setter]
- `setAmountUtilized(BigDecimal arg0)` → `LimitApplicableExtendedBuilder` [Setter]

### LimitApplicableExtendedImpl
**Extends:** `LimitApplicable$LimitApplicableImpl` 
**Implements:** `LimitApplicableExtended` 

**Key Methods:**
- `build()` → `LimitApplicableExtended` [Builder]
- `getLimitImpactDueToTrade()` → `BigDecimal` [Getter]
- `getLimitAmount()` → `BigDecimal` [Getter]
- `getLimitLevel()` → `FieldWithMetaLimitLevelEnum` [Getter]
- `setBuilderFields(LimitApplicableExtendedBuilder arg0)` → `void` [Setter]

### LimitApplicableImpl
**Implements:** `LimitApplicable` 

**Key Methods:**
- `build()` → `LimitApplicable` [Builder]
- `getCurrency()` → `FieldWithMetaString` [Getter]
- `getClipSize()` → `Integer` [Getter]
- `getAmountUtilized()` → `BigDecimal` [Getter]
- `getLimitType()` → `FieldWithMetaCreditLimitTypeEnum` [Getter]
- `getUtilization()` → `CreditLimitUtilisation` [Getter]
- `getAmountRemaining()` → `BigDecimal` [Getter]
- `getVelocity()` → `Velocity` [Getter]
- `setBuilderFields(LimitApplicableBuilder arg0)` → `void` [Setter]

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
- `getOrCreateSentTo(int arg0)` → `FieldWithMetaStringBuilder` [Getter]
- `getOrCreateCopyTo(int arg0)` → `FieldWithMetaStringBuilder` [Getter]
- `setMessageIdValue(String arg0)` → `MessageInformationBuilder` [Setter]
- `setSentByValue(String arg0)` → `MessageInformationBuilder` [Setter]
- `getOrCreateMessageId()` → `FieldWithMetaStringBuilder` [Getter]
- `setMessageId(FieldWithMetaString arg0)` → `MessageInformationBuilder` [Setter]
- `setSentToValue(List arg0)` → `MessageInformationBuilder` [Setter]
- `getOrCreateSentBy()` → `FieldWithMetaStringBuilder` [Getter]

### MessageInformationImpl
**Implements:** `MessageInformation` 

**Key Methods:**
- `build()` → `MessageInformation` [Builder]
- `getMessageId()` → `FieldWithMetaString` [Getter]
- `getSentTo()` → `List` [Getter]
- `getCopyTo()` → `List` [Getter]
- `getSentBy()` → `FieldWithMetaString` [Getter]
- `setBuilderFields(MessageInformationBuilder arg0)` → `void` [Setter]

### PartyCustomisedWorkflowBuilderImpl
**Implements:** `PartyCustomisedWorkflow$PartyCustomisedWorkflowBuilder` 

**Fields:**
- `ReferenceWithMetaPartyBuilder partyReference`
- `String partyName`
- `List (List) customisedWorkflow`

**Key Methods:**
- `build()` → `PartyCustomisedWorkflow` [Builder]
- `getPartyName()` → `String` [Getter]
- `getCustomisedWorkflow()` → `List` [Getter]
- `setCustomisedWorkflow(List arg0)` → `PartyCustomisedWorkflowBuilder` [Setter]
- `setPartyName(String arg0)` → `PartyCustomisedWorkflowBuilder` [Setter]
- `getPartyReference()` → `ReferenceWithMetaPartyBuilder` [Getter]
- `setPartyReferenceValue(Party arg0)` → `PartyCustomisedWorkflowBuilder` [Setter]
- `getOrCreatePartyReference()` → `ReferenceWithMetaPartyBuilder` [Getter]
- `getOrCreateCustomisedWorkflow(int arg0)` → `CustomisedWorkflowBuilder` [Getter]
- `setPartyReference(ReferenceWithMetaParty arg0)` → `PartyCustomisedWorkflowBuilder` [Setter]

### PartyCustomisedWorkflowImpl
**Implements:** `PartyCustomisedWorkflow` 

**Key Methods:**
- `build()` → `PartyCustomisedWorkflow` [Builder]
- `getPartyName()` → `String` [Getter]
- `getCustomisedWorkflow()` → `List` [Getter]
- `setBuilderFields(PartyCustomisedWorkflowBuilder arg0)` → `void` [Setter]
- `getPartyReference()` → `ReferenceWithMetaParty` [Getter]

### VelocityBuilderImpl
**Implements:** `Velocity$VelocityBuilder` 

**Fields:**
- `Integer periodMultiplier`
- `PeriodTimeEnum period`

**Key Methods:**
- `build()` → `Velocity` [Builder]
- `setPeriod(PeriodTimeEnum arg0)` → `VelocityBuilder` [Setter]
- `setPeriodMultiplier(Integer arg0)` → `VelocityBuilder` [Setter]
- `getPeriod()` → `PeriodTimeEnum` [Getter]
- `getPeriodMultiplier()` → `Integer` [Getter]

### VelocityImpl
**Implements:** `Velocity` 

**Key Methods:**
- `build()` → `Velocity` [Builder]
- `setBuilderFields(VelocityBuilder arg0)` → `void` [Setter]
- `getPeriod()` → `PeriodTimeEnum` [Getter]
- `getPeriodMultiplier()` → `Integer` [Getter]

### WorkflowBuilderImpl
**Implements:** `Workflow$WorkflowBuilder` 

**Fields:**
- `List (List) steps`

**Key Methods:**
- `build()` → `Workflow` [Builder]
- `getOrCreateSteps(int arg0)` → `WorkflowStepBuilder` [Getter]
- `setSteps(List arg0)` → `WorkflowBuilder` [Setter]
- `getSteps()` → `List` [Getter]

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
- `setWorkflowStatus(WorkflowStatusEnum arg0)` → `WorkflowStateBuilder` [Setter]
- `setWarehouseIdentity(WarehouseIdentityEnum arg0)` → `WorkflowStateBuilder` [Setter]
- `getPartyCustomisedWorkflow()` → `List` [Getter]
- `getWarehouseIdentity()` → `WarehouseIdentityEnum` [Getter]
- `setPartyCustomisedWorkflow(List arg0)` → `WorkflowStateBuilder` [Setter]
- `getWorkflowStatus()` → `WorkflowStatusEnum` [Getter]
- `getOrCreatePartyCustomisedWorkflow(int arg0)` → `PartyCustomisedWorkflowBuilder` [Getter]

### WorkflowStateImpl
**Implements:** `WorkflowState` 

**Key Methods:**
- `build()` → `WorkflowState` [Builder]
- `getComment()` → `String` [Getter]
- `getPartyCustomisedWorkflow()` → `List` [Getter]
- `getWarehouseIdentity()` → `WarehouseIdentityEnum` [Getter]
- `getWorkflowStatus()` → `WorkflowStatusEnum` [Getter]
- `setBuilderFields(WorkflowStateBuilder arg0)` → `void` [Setter]

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
- `getOrCreateTimestamp()` → `EventTimestampBuilder` [Getter]
- `getRejectedReason()` → `String` [Getter]
- `setApproved(Boolean arg0)` → `WorkflowStepApprovalBuilder` [Setter]
- `setPartyValue(Party arg0)` → `WorkflowStepApprovalBuilder` [Setter]
- `getApproved()` → `Boolean` [Getter]
- `setRejectedReason(String arg0)` → `WorkflowStepApprovalBuilder` [Setter]
- `setTimestamp(EventTimestamp arg0)` → `WorkflowStepApprovalBuilder` [Setter]
- `getOrCreateMeta()` → `MetaFieldsBuilder` [Getter]

### WorkflowStepApprovalImpl
**Implements:** `WorkflowStepApproval` 

**Key Methods:**
- `build()` → `WorkflowStepApproval` [Builder]
- `getTimestamp()` → `EventTimestamp` [Getter]
- `getRejectedReason()` → `String` [Getter]
- `getApproved()` → `Boolean` [Getter]
- `setBuilderFields(WorkflowStepApprovalBuilder arg0)` → `void` [Setter]
- `getParty()` → `ReferenceWithMetaParty` [Getter]
- `getMeta()` → `MetaFields` [Getter]

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
- `getOrCreateWorkflowState()` → `WorkflowStateBuilder` [Getter]
- `getOrCreateApproval(int arg0)` → `WorkflowStepApprovalBuilder` [Getter]
- `getOrCreateProposedEvent()` → `EventInstructionBuilder` [Getter]
- `getOrCreateEventIdentifier(int arg0)` → `IdentifierBuilder` [Getter]
- `getOrCreateBusinessEvent()` → `BusinessEventBuilder` [Getter]
- `setBusinessEvent(BusinessEvent arg0)` → `WorkflowStepBuilder` [Setter]
- `getOrCreateTimestamp(int arg0)` → `EventTimestampBuilder` [Getter]
- `setProposedEvent(EventInstruction arg0)` → `WorkflowStepBuilder` [Setter]

### WorkflowStepImpl
**Implements:** `WorkflowStep` 

**Key Methods:**
- `build()` → `WorkflowStep` [Builder]
- `getTimestamp()` → `List` [Getter]
- `setBuilderFields(WorkflowStepBuilder arg0)` → `void` [Setter]
- `getAction()` → `ActionEnum` [Getter]
- `getLineage()` → `Lineage` [Getter]
- `getPreviousWorkflowStep()` → `ReferenceWithMetaWorkflowStep` [Getter]
- `getProposedEvent()` → `EventInstruction` [Getter]
- `getApproval()` → `List` [Getter]
- `getRejected()` → `Boolean` [Getter]
- `getBusinessEvent()` → `BusinessEvent` [Getter]

