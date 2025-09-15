# Package: cdm.observable.event

## Enums

### IndexEventConsequenceEnum
**Values:**
- `CalculationAgentAdjustment`
- `NegotiatedCloseOut`
- `CancellationAndPayment`
- `RelatedExchange`

### MarketDisruptionEnum
**Values:**
- `ModifiedPostponement`
- `Omission`
- `Postponement`

### RestructuringEnum
**Values:**
- `ModModR`
- `ModR`
- `R`

### ShareExtraordinaryEventEnum
**Values:**
- `AlternativeObligation`
- `CancellationAndPayment`
- `OptionsExchange`
- `CalculationAgent`
- `ModifiedCalculationAgent`
- `PartialCancellationAndPayment`
- `Component`

### TriggerTimeTypeEnum
**Values:**
- `Closing`
- `Anytime`

### TriggerTypeEnum
**Values:**
- `EqualOrLess`
- `EqualOrGreater`
- `Equal`
- `Less`
- `Greater`

## Interfaces

### CreditEventNotice
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `CreditEventNotice` [Builder]
- `getBusinessCenter()` → `BusinessCenterEnum` [Getter]
- `getNotifyingParty()` → `List` [Getter]
- `getPubliclyAvailableInformation()` → `PubliclyAvailableInformation` [Getter]

### CreditEventNoticeBuilder
**Implements:** `CreditEventNotice` `RosettaModelObjectBuilder` 

**Key Methods:**
- `setBusinessCenter(BusinessCenterEnum arg0)` → `CreditEventNoticeBuilder` [Setter]
- `setNotifyingParty(List arg0)` → `CreditEventNoticeBuilder` [Setter]
- `getOrCreatePubliclyAvailableInformation()` → `PubliclyAvailableInformationBuilder` [Getter]
- `setPubliclyAvailableInformation(PubliclyAvailableInformation arg0)` → `CreditEventNoticeBuilder` [Setter]
- `getPubliclyAvailableInformation()` → `PubliclyAvailableInformationBuilder` [Getter]

### CreditEvents
**Implements:** `RosettaModelObject` `GlobalKey` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `CreditEvents` [Builder]
- `getCreditEventNotice()` → `CreditEventNotice` [Getter]
- `getRestructuring()` → `Restructuring` [Getter]
- `getFailureToPay()` → `FailureToPay` [Getter]
- `getDefaultRequirement()` → `Money` [Getter]
- `getGovernmentalIntervention()` → `Boolean` [Getter]
- `getDistressedRatingsDowngrade()` → `Boolean` [Getter]
- `getBankruptcy()` → `Boolean` [Getter]
- `getObligationAcceleration()` → `Boolean` [Getter]

### CreditEventsBuilder
**Implements:** `CreditEvents` `RosettaModelObjectBuilder` `GlobalKey$GlobalKeyBuilder` 

**Key Methods:**
- `setFailureToPayPrincipal(Boolean arg0)` → `CreditEventsBuilder` [Setter]
- `setWritedown(Boolean arg0)` → `CreditEventsBuilder` [Setter]
- `getOrCreateFailureToPay()` → `FailureToPayBuilder` [Getter]
- `setFailureToPay(FailureToPay arg0)` → `CreditEventsBuilder` [Setter]
- `setObligationAcceleration(Boolean arg0)` → `CreditEventsBuilder` [Setter]
- `setRepudiationMoratorium(Boolean arg0)` → `CreditEventsBuilder` [Setter]
- `getOrCreateRestructuring()` → `RestructuringBuilder` [Getter]
- `setBankruptcy(Boolean arg0)` → `CreditEventsBuilder` [Setter]
- `setImpliedWritedown(Boolean arg0)` → `CreditEventsBuilder` [Setter]
- `setFailureToPayInterest(Boolean arg0)` → `CreditEventsBuilder` [Setter]

### DeterminationMethodology
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `DeterminationMethodology` [Builder]
- `getDeterminationMethod()` → `DeterminationMethodEnum` [Getter]
- `getAveragingMethod()` → `AveragingCalculationMethodEnum` [Getter]

### DeterminationMethodologyBuilder
**Implements:** `DeterminationMethodology` `RosettaModelObjectBuilder` 

**Key Methods:**
- `setAveragingMethod(AveragingCalculationMethodEnum arg0)` → `DeterminationMethodologyBuilder` [Setter]
- `setDeterminationMethod(DeterminationMethodEnum arg0)` → `DeterminationMethodologyBuilder` [Setter]

### FailureToPay
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `FailureToPay` [Builder]
- `getGracePeriodExtension()` → `GracePeriodExtension` [Getter]
- `getPaymentRequirement()` → `Money` [Getter]
- `getApplicable()` → `Boolean` [Getter]

### FailureToPayBuilder
**Implements:** `FailureToPay` `RosettaModelObjectBuilder` 

**Key Methods:**
- `setPaymentRequirement(Money arg0)` → `FailureToPayBuilder` [Setter]
- `getGracePeriodExtension()` → `GracePeriodExtensionBuilder` [Getter]
- `setGracePeriodExtension(GracePeriodExtension arg0)` → `FailureToPayBuilder` [Setter]
- `getPaymentRequirement()` → `MoneyBuilder` [Getter]
- `getOrCreatePaymentRequirement()` → `MoneyBuilder` [Getter]
- `getOrCreateGracePeriodExtension()` → `GracePeriodExtensionBuilder` [Getter]
- `setApplicable(Boolean arg0)` → `FailureToPayBuilder` [Setter]

### FeaturePayment
**Implements:** `RosettaModelObject` `GlobalKey` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `FeaturePayment` [Builder]
- `getCurrency()` → `FieldWithMetaString` [Getter]
- `getTime()` → `TimeTypeEnum` [Getter]
- `getLevelPercentage()` → `BigDecimal` [Getter]
- `getPayerReceiver()` → `PartyReferencePayerReceiver` [Getter]
- `getPaymentDate()` → `AdjustableOrRelativeDate` [Getter]
- `getMeta()` → `MetaFields` [Getter]
- `getAmount()` → `BigDecimal` [Getter]

### FeaturePaymentBuilder
**Implements:** `FeaturePayment` `RosettaModelObjectBuilder` `GlobalKey$GlobalKeyBuilder` 

**Key Methods:**
- `getCurrency()` → `FieldWithMetaStringBuilder` [Getter]
- `setCurrency(FieldWithMetaString arg0)` → `FeaturePaymentBuilder` [Setter]
- `setTime(TimeTypeEnum arg0)` → `FeaturePaymentBuilder` [Setter]
- `setLevelPercentage(BigDecimal arg0)` → `FeaturePaymentBuilder` [Setter]
- `getPayerReceiver()` → `PartyReferencePayerReceiverBuilder` [Getter]
- `getOrCreatePayerReceiver()` → `PartyReferencePayerReceiverBuilder` [Getter]
- `setPayerReceiver(PartyReferencePayerReceiver arg0)` → `FeaturePaymentBuilder` [Setter]
- `getOrCreateMeta()` → `MetaFieldsBuilder` [Getter]
- `getOrCreateCurrency()` → `FieldWithMetaStringBuilder` [Getter]
- `getPaymentDate()` → `AdjustableOrRelativeDateBuilder` [Getter]

### GracePeriodExtension
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `GracePeriodExtension` [Builder]
- `getGracePeriod()` → `Offset` [Getter]
- `getApplicable()` → `Boolean` [Getter]

### GracePeriodExtensionBuilder
**Implements:** `GracePeriodExtension` `RosettaModelObjectBuilder` 

**Key Methods:**
- `getOrCreateGracePeriod()` → `OffsetBuilder` [Getter]
- `getGracePeriod()` → `OffsetBuilder` [Getter]
- `setGracePeriod(Offset arg0)` → `GracePeriodExtensionBuilder` [Setter]
- `setApplicable(Boolean arg0)` → `GracePeriodExtensionBuilder` [Setter]

### Observation
**Implements:** `RosettaModelObject` `GlobalKey` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `Observation` [Builder]
- `getObservedValue()` → `Price` [Getter]
- `getObservationIdentifier()` → `ObservationIdentifier` [Getter]
- `getMeta()` → `MetaFields` [Getter]

### ObservationBuilder
**Implements:** `Observation` `RosettaModelObjectBuilder` `GlobalKey$GlobalKeyBuilder` 

**Key Methods:**
- `setObservationIdentifier(ObservationIdentifier arg0)` → `ObservationBuilder` [Setter]
- `getOrCreateObservedValue()` → `PriceBuilder` [Getter]
- `setObservedValue(Price arg0)` → `ObservationBuilder` [Setter]
- `getOrCreateMeta()` → `MetaFieldsBuilder` [Getter]
- `getOrCreateObservationIdentifier()` → `ObservationIdentifierBuilder` [Getter]
- `getObservedValue()` → `PriceBuilder` [Getter]
- `getObservationIdentifier()` → `ObservationIdentifierBuilder` [Getter]
- `setMeta(MetaFields arg0)` → `ObservationBuilder` [Setter]
- `getMeta()` → `MetaFieldsBuilder` [Getter]

### ObservationIdentifier
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `ObservationIdentifier` [Builder]
- `getObservationDate()` → `Date` [Getter]
- `getObservable()` → `Observable` [Getter]
- `getObservationTime()` → `TimeZone` [Getter]
- `getInformationSource()` → `InformationSource` [Getter]
- `getDeterminationMethodology()` → `DeterminationMethodology` [Getter]

### ObservationIdentifierBuilder
**Implements:** `ObservationIdentifier` `RosettaModelObjectBuilder` 

**Key Methods:**
- `getOrCreateObservable()` → `ObservableBuilder` [Getter]
- `getOrCreateObservationTime()` → `TimeZoneBuilder` [Getter]
- `getObservable()` → `ObservableBuilder` [Getter]
- `getObservationTime()` → `TimeZoneBuilder` [Getter]
- `setObservationTime(TimeZone arg0)` → `ObservationIdentifierBuilder` [Setter]
- `setInformationSource(InformationSource arg0)` → `ObservationIdentifierBuilder` [Setter]
- `setObservable(Observable arg0)` → `ObservationIdentifierBuilder` [Setter]
- `getInformationSource()` → `InformationSourceBuilder` [Getter]
- `setObservationDate(Date arg0)` → `ObservationIdentifierBuilder` [Setter]
- `getOrCreateInformationSource()` → `InformationSourceBuilder` [Getter]

### PubliclyAvailableInformation
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `PubliclyAvailableInformation` [Builder]
- `getStandardPublicSources()` → `Boolean` [Getter]
- `getPublicSource()` → `List` [Getter]
- `getSpecifiedNumber()` → `Integer` [Getter]

### PubliclyAvailableInformationBuilder
**Implements:** `PubliclyAvailableInformation` `RosettaModelObjectBuilder` 

**Key Methods:**
- `setStandardPublicSources(Boolean arg0)` → `PubliclyAvailableInformationBuilder` [Setter]
- `setPublicSource(List arg0)` → `PubliclyAvailableInformationBuilder` [Setter]
- `setSpecifiedNumber(Integer arg0)` → `PubliclyAvailableInformationBuilder` [Setter]

### Restructuring
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `Restructuring` [Builder]
- `getRestructuringType()` → `FieldWithMetaRestructuringEnum` [Getter]
- `getApplicable()` → `Boolean` [Getter]
- `getMultipleHolderObligation()` → `Boolean` [Getter]
- `getMultipleCreditEventNotices()` → `Boolean` [Getter]

### RestructuringBuilder
**Implements:** `Restructuring` `RosettaModelObjectBuilder` 

**Key Methods:**
- `setRestructuringType(FieldWithMetaRestructuringEnum arg0)` → `RestructuringBuilder` [Setter]
- `setRestructuringTypeValue(RestructuringEnum arg0)` → `RestructuringBuilder` [Setter]
- `setMultipleHolderObligation(Boolean arg0)` → `RestructuringBuilder` [Setter]
- `setMultipleCreditEventNotices(Boolean arg0)` → `RestructuringBuilder` [Setter]
- `getOrCreateRestructuringType()` → `FieldWithMetaRestructuringEnumBuilder` [Getter]
- `getRestructuringType()` → `FieldWithMetaRestructuringEnumBuilder` [Getter]
- `setApplicable(Boolean arg0)` → `RestructuringBuilder` [Setter]

### Trigger
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `Trigger` [Builder]
- `getLevel()` → `List` [Getter]
- `getTriggerTimeType()` → `TriggerTimeTypeEnum` [Getter]
- `getCreditEventsReference()` → `ReferenceWithMetaCreditEvents` [Getter]
- `getTriggerType()` → `TriggerTypeEnum` [Getter]
- `getCreditEvents()` → `CreditEvents` [Getter]

### TriggerBuilder
**Implements:** `Trigger` `RosettaModelObjectBuilder` 

**Key Methods:**
- `setLevel(List arg0)` → `TriggerBuilder` [Setter]
- `getLevel()` → `List` [Getter]
- `getCreditEventsReference()` → `ReferenceWithMetaCreditEventsBuilder` [Getter]
- `getOrCreateLevel(int arg0)` → `PriceScheduleBuilder` [Getter]
- `setTriggerTimeType(TriggerTimeTypeEnum arg0)` → `TriggerBuilder` [Setter]
- `setTriggerType(TriggerTypeEnum arg0)` → `TriggerBuilder` [Setter]
- `setCreditEventsReference(ReferenceWithMetaCreditEvents arg0)` → `TriggerBuilder` [Setter]
- `getOrCreateCreditEvents()` → `CreditEventsBuilder` [Getter]
- `setCreditEvents(CreditEvents arg0)` → `TriggerBuilder` [Setter]
- `setCreditEventsReferenceValue(CreditEvents arg0)` → `TriggerBuilder` [Setter]

### TriggerEvent
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `TriggerEvent` [Builder]
- `getSchedule()` → `List` [Getter]
- `getTriggerDates()` → `DateList` [Getter]
- `getFeaturePayment()` → `FeaturePayment` [Getter]
- `getTrigger()` → `Trigger` [Getter]

### TriggerEventBuilder
**Implements:** `TriggerEvent` `RosettaModelObjectBuilder` 

**Key Methods:**
- `getOrCreateTrigger()` → `TriggerBuilder` [Getter]
- `getOrCreateFeaturePayment()` → `FeaturePaymentBuilder` [Getter]
- `setFeaturePayment(FeaturePayment arg0)` → `TriggerEventBuilder` [Setter]
- `setTriggerDates(DateList arg0)` → `TriggerEventBuilder` [Setter]
- `getOrCreateTriggerDates()` → `DateListBuilder` [Getter]
- `getSchedule()` → `List` [Getter]
- `setSchedule(List arg0)` → `TriggerEventBuilder` [Setter]
- `getOrCreateSchedule(int arg0)` → `AveragingScheduleBuilder` [Getter]
- `getTriggerDates()` → `DateListBuilder` [Getter]
- `getFeaturePayment()` → `FeaturePaymentBuilder` [Getter]

## Concrete Classes

### CreditEventNoticeBuilderImpl
**Implements:** `CreditEventNotice$CreditEventNoticeBuilder` 

**Fields:**
- `List (List) notifyingParty`
- `BusinessCenterEnum businessCenter`
- `PubliclyAvailableInformationBuilder publiclyAvailableInformation`

**Key Methods:**
- `build()` → `CreditEventNotice` [Builder]
- `setBusinessCenter(BusinessCenterEnum arg0)` → `CreditEventNoticeBuilder` [Setter]
- `setNotifyingParty(List arg0)` → `CreditEventNoticeBuilder` [Setter]
- `getBusinessCenter()` → `BusinessCenterEnum` [Getter]
- `getNotifyingParty()` → `List` [Getter]
- `getOrCreatePubliclyAvailableInformation()` → `PubliclyAvailableInformationBuilder` [Getter]
- `setPubliclyAvailableInformation(PubliclyAvailableInformation arg0)` → `CreditEventNoticeBuilder` [Setter]
- `getPubliclyAvailableInformation()` → `PubliclyAvailableInformationBuilder` [Getter]

### CreditEventNoticeImpl
**Implements:** `CreditEventNotice` 

**Key Methods:**
- `build()` → `CreditEventNotice` [Builder]
- `setBuilderFields(CreditEventNoticeBuilder arg0)` → `void` [Setter]
- `getBusinessCenter()` → `BusinessCenterEnum` [Getter]
- `getNotifyingParty()` → `List` [Getter]
- `getPubliclyAvailableInformation()` → `PubliclyAvailableInformation` [Getter]

### CreditEventsBuilderImpl
**Implements:** `CreditEvents$CreditEventsBuilder` 

**Fields:**
- `Boolean bankruptcy`
- `FailureToPayBuilder failureToPay`
- `Boolean failureToPayPrincipal`
- `Boolean failureToPayInterest`
- `Boolean obligationDefault`
- `Boolean obligationAcceleration`
- `Boolean repudiationMoratorium`
- `RestructuringBuilder restructuring`
- `Boolean governmentalIntervention`
- `Boolean distressedRatingsDowngrade`
- `Boolean maturityExtension`
- `Boolean writedown`
- `Boolean impliedWritedown`
- `MoneyBuilder defaultRequirement`
- `CreditEventNoticeBuilder creditEventNotice`
- `MetaFieldsBuilder meta`

**Key Methods:**
- `build()` → `CreditEvents` [Builder]
- `setFailureToPayPrincipal(Boolean arg0)` → `CreditEventsBuilder` [Setter]
- `setWritedown(Boolean arg0)` → `CreditEventsBuilder` [Setter]
- `getOrCreateFailureToPay()` → `FailureToPayBuilder` [Getter]
- `setFailureToPay(FailureToPay arg0)` → `CreditEventsBuilder` [Setter]
- `setObligationAcceleration(Boolean arg0)` → `CreditEventsBuilder` [Setter]
- `setRepudiationMoratorium(Boolean arg0)` → `CreditEventsBuilder` [Setter]
- `getOrCreateRestructuring()` → `RestructuringBuilder` [Getter]
- `setBankruptcy(Boolean arg0)` → `CreditEventsBuilder` [Setter]
- `setImpliedWritedown(Boolean arg0)` → `CreditEventsBuilder` [Setter]

### CreditEventsImpl
**Implements:** `CreditEvents` 

**Key Methods:**
- `build()` → `CreditEvents` [Builder]
- `setBuilderFields(CreditEventsBuilder arg0)` → `void` [Setter]
- `getCreditEventNotice()` → `CreditEventNotice` [Getter]
- `getRestructuring()` → `Restructuring` [Getter]
- `getFailureToPay()` → `FailureToPay` [Getter]
- `getDefaultRequirement()` → `Money` [Getter]
- `getGovernmentalIntervention()` → `Boolean` [Getter]
- `getDistressedRatingsDowngrade()` → `Boolean` [Getter]
- `getBankruptcy()` → `Boolean` [Getter]
- `getObligationAcceleration()` → `Boolean` [Getter]

### DeterminationMethodologyBuilderImpl
**Implements:** `DeterminationMethodology$DeterminationMethodologyBuilder` 

**Fields:**
- `DeterminationMethodEnum determinationMethod`
- `AveragingCalculationMethodEnum averagingMethod`

**Key Methods:**
- `build()` → `DeterminationMethodology` [Builder]
- `setAveragingMethod(AveragingCalculationMethodEnum arg0)` → `DeterminationMethodologyBuilder` [Setter]
- `setDeterminationMethod(DeterminationMethodEnum arg0)` → `DeterminationMethodologyBuilder` [Setter]
- `getDeterminationMethod()` → `DeterminationMethodEnum` [Getter]
- `getAveragingMethod()` → `AveragingCalculationMethodEnum` [Getter]

### DeterminationMethodologyImpl
**Implements:** `DeterminationMethodology` 

**Key Methods:**
- `build()` → `DeterminationMethodology` [Builder]
- `setBuilderFields(DeterminationMethodologyBuilder arg0)` → `void` [Setter]
- `getDeterminationMethod()` → `DeterminationMethodEnum` [Getter]
- `getAveragingMethod()` → `AveragingCalculationMethodEnum` [Getter]

### FailureToPayBuilderImpl
**Implements:** `FailureToPay$FailureToPayBuilder` 

**Fields:**
- `Boolean applicable`
- `GracePeriodExtensionBuilder gracePeriodExtension`
- `MoneyBuilder paymentRequirement`

**Key Methods:**
- `build()` → `FailureToPay` [Builder]
- `setPaymentRequirement(Money arg0)` → `FailureToPayBuilder` [Setter]
- `getGracePeriodExtension()` → `GracePeriodExtensionBuilder` [Getter]
- `setGracePeriodExtension(GracePeriodExtension arg0)` → `FailureToPayBuilder` [Setter]
- `getPaymentRequirement()` → `MoneyBuilder` [Getter]
- `getOrCreatePaymentRequirement()` → `MoneyBuilder` [Getter]
- `getOrCreateGracePeriodExtension()` → `GracePeriodExtensionBuilder` [Getter]
- `setApplicable(Boolean arg0)` → `FailureToPayBuilder` [Setter]
- `getApplicable()` → `Boolean` [Getter]

### FailureToPayImpl
**Implements:** `FailureToPay` 

**Key Methods:**
- `build()` → `FailureToPay` [Builder]
- `getGracePeriodExtension()` → `GracePeriodExtension` [Getter]
- `getPaymentRequirement()` → `Money` [Getter]
- `setBuilderFields(FailureToPayBuilder arg0)` → `void` [Setter]
- `getApplicable()` → `Boolean` [Getter]

### FeaturePaymentBuilderImpl
**Implements:** `FeaturePayment$FeaturePaymentBuilder` 

**Fields:**
- `PartyReferencePayerReceiverBuilder payerReceiver`
- `BigDecimal levelPercentage`
- `BigDecimal amount`
- `TimeTypeEnum time`
- `FieldWithMetaStringBuilder currency`
- `AdjustableOrRelativeDateBuilder paymentDate`
- `MetaFieldsBuilder meta`

**Key Methods:**
- `build()` → `FeaturePayment` [Builder]
- `getCurrency()` → `FieldWithMetaStringBuilder` [Getter]
- `setCurrency(FieldWithMetaString arg0)` → `FeaturePaymentBuilder` [Setter]
- `getTime()` → `TimeTypeEnum` [Getter]
- `setTime(TimeTypeEnum arg0)` → `FeaturePaymentBuilder` [Setter]
- `setLevelPercentage(BigDecimal arg0)` → `FeaturePaymentBuilder` [Setter]
- `getLevelPercentage()` → `BigDecimal` [Getter]
- `getPayerReceiver()` → `PartyReferencePayerReceiverBuilder` [Getter]
- `getOrCreatePayerReceiver()` → `PartyReferencePayerReceiverBuilder` [Getter]
- `setPayerReceiver(PartyReferencePayerReceiver arg0)` → `FeaturePaymentBuilder` [Setter]

### FeaturePaymentImpl
**Implements:** `FeaturePayment` 

**Key Methods:**
- `build()` → `FeaturePayment` [Builder]
- `getCurrency()` → `FieldWithMetaString` [Getter]
- `getTime()` → `TimeTypeEnum` [Getter]
- `getLevelPercentage()` → `BigDecimal` [Getter]
- `getPayerReceiver()` → `PartyReferencePayerReceiver` [Getter]
- `setBuilderFields(FeaturePaymentBuilder arg0)` → `void` [Setter]
- `getPaymentDate()` → `AdjustableOrRelativeDate` [Getter]
- `getMeta()` → `MetaFields` [Getter]
- `getAmount()` → `BigDecimal` [Getter]

### GracePeriodExtensionBuilderImpl
**Implements:** `GracePeriodExtension$GracePeriodExtensionBuilder` 

**Fields:**
- `Boolean applicable`
- `OffsetBuilder gracePeriod`

**Key Methods:**
- `build()` → `GracePeriodExtension` [Builder]
- `getOrCreateGracePeriod()` → `OffsetBuilder` [Getter]
- `getGracePeriod()` → `OffsetBuilder` [Getter]
- `setGracePeriod(Offset arg0)` → `GracePeriodExtensionBuilder` [Setter]
- `setApplicable(Boolean arg0)` → `GracePeriodExtensionBuilder` [Setter]
- `getApplicable()` → `Boolean` [Getter]

### GracePeriodExtensionImpl
**Implements:** `GracePeriodExtension` 

**Key Methods:**
- `build()` → `GracePeriodExtension` [Builder]
- `getGracePeriod()` → `Offset` [Getter]
- `setBuilderFields(GracePeriodExtensionBuilder arg0)` → `void` [Setter]
- `getApplicable()` → `Boolean` [Getter]

### ObservationBuilderImpl
**Implements:** `Observation$ObservationBuilder` 

**Fields:**
- `PriceBuilder observedValue`
- `ObservationIdentifierBuilder observationIdentifier`
- `MetaFieldsBuilder meta`

**Key Methods:**
- `build()` → `Observation` [Builder]
- `setObservationIdentifier(ObservationIdentifier arg0)` → `ObservationBuilder` [Setter]
- `getOrCreateObservedValue()` → `PriceBuilder` [Getter]
- `setObservedValue(Price arg0)` → `ObservationBuilder` [Setter]
- `getOrCreateMeta()` → `MetaFieldsBuilder` [Getter]
- `getOrCreateObservationIdentifier()` → `ObservationIdentifierBuilder` [Getter]
- `getObservedValue()` → `PriceBuilder` [Getter]
- `getObservationIdentifier()` → `ObservationIdentifierBuilder` [Getter]
- `setMeta(MetaFields arg0)` → `ObservationBuilder` [Setter]
- `getMeta()` → `MetaFieldsBuilder` [Getter]

### ObservationIdentifierBuilderImpl
**Implements:** `ObservationIdentifier$ObservationIdentifierBuilder` 

**Fields:**
- `ObservableBuilder observable`
- `Date observationDate`
- `TimeZoneBuilder observationTime`
- `InformationSourceBuilder informationSource`
- `DeterminationMethodologyBuilder determinationMethodology`

**Key Methods:**
- `build()` → `ObservationIdentifier` [Builder]
- `getOrCreateObservable()` → `ObservableBuilder` [Getter]
- `getOrCreateObservationTime()` → `TimeZoneBuilder` [Getter]
- `getObservationDate()` → `Date` [Getter]
- `getObservable()` → `ObservableBuilder` [Getter]
- `getObservationTime()` → `TimeZoneBuilder` [Getter]
- `setObservationTime(TimeZone arg0)` → `ObservationIdentifierBuilder` [Setter]
- `setInformationSource(InformationSource arg0)` → `ObservationIdentifierBuilder` [Setter]
- `setObservable(Observable arg0)` → `ObservationIdentifierBuilder` [Setter]
- `getInformationSource()` → `InformationSourceBuilder` [Getter]

### ObservationIdentifierImpl
**Implements:** `ObservationIdentifier` 

**Key Methods:**
- `build()` → `ObservationIdentifier` [Builder]
- `getObservationDate()` → `Date` [Getter]
- `getObservable()` → `Observable` [Getter]
- `getObservationTime()` → `TimeZone` [Getter]
- `setBuilderFields(ObservationIdentifierBuilder arg0)` → `void` [Setter]
- `getInformationSource()` → `InformationSource` [Getter]
- `getDeterminationMethodology()` → `DeterminationMethodology` [Getter]

### ObservationImpl
**Implements:** `Observation` 

**Key Methods:**
- `build()` → `Observation` [Builder]
- `setBuilderFields(ObservationBuilder arg0)` → `void` [Setter]
- `getObservedValue()` → `Price` [Getter]
- `getObservationIdentifier()` → `ObservationIdentifier` [Getter]
- `getMeta()` → `MetaFields` [Getter]

### PubliclyAvailableInformationBuilderImpl
**Implements:** `PubliclyAvailableInformation$PubliclyAvailableInformationBuilder` 

**Fields:**
- `Boolean standardPublicSources`
- `List (List) publicSource`
- `Integer specifiedNumber`

**Key Methods:**
- `build()` → `PubliclyAvailableInformation` [Builder]
- `getStandardPublicSources()` → `Boolean` [Getter]
- `getPublicSource()` → `List` [Getter]
- `setStandardPublicSources(Boolean arg0)` → `PubliclyAvailableInformationBuilder` [Setter]
- `setPublicSource(List arg0)` → `PubliclyAvailableInformationBuilder` [Setter]
- `setSpecifiedNumber(Integer arg0)` → `PubliclyAvailableInformationBuilder` [Setter]
- `getSpecifiedNumber()` → `Integer` [Getter]

### PubliclyAvailableInformationImpl
**Implements:** `PubliclyAvailableInformation` 

**Key Methods:**
- `build()` → `PubliclyAvailableInformation` [Builder]
- `getStandardPublicSources()` → `Boolean` [Getter]
- `getPublicSource()` → `List` [Getter]
- `getSpecifiedNumber()` → `Integer` [Getter]
- `setBuilderFields(PubliclyAvailableInformationBuilder arg0)` → `void` [Setter]

### RestructuringBuilderImpl
**Implements:** `Restructuring$RestructuringBuilder` 

**Fields:**
- `Boolean applicable`
- `FieldWithMetaRestructuringEnumBuilder restructuringType`
- `Boolean multipleHolderObligation`
- `Boolean multipleCreditEventNotices`

**Key Methods:**
- `build()` → `Restructuring` [Builder]
- `setRestructuringType(FieldWithMetaRestructuringEnum arg0)` → `RestructuringBuilder` [Setter]
- `setRestructuringTypeValue(RestructuringEnum arg0)` → `RestructuringBuilder` [Setter]
- `setMultipleHolderObligation(Boolean arg0)` → `RestructuringBuilder` [Setter]
- `setMultipleCreditEventNotices(Boolean arg0)` → `RestructuringBuilder` [Setter]
- `getOrCreateRestructuringType()` → `FieldWithMetaRestructuringEnumBuilder` [Getter]
- `getRestructuringType()` → `FieldWithMetaRestructuringEnumBuilder` [Getter]
- `setApplicable(Boolean arg0)` → `RestructuringBuilder` [Setter]
- `getApplicable()` → `Boolean` [Getter]
- `getMultipleHolderObligation()` → `Boolean` [Getter]

### RestructuringImpl
**Implements:** `Restructuring` 

**Key Methods:**
- `build()` → `Restructuring` [Builder]
- `setBuilderFields(RestructuringBuilder arg0)` → `void` [Setter]
- `getRestructuringType()` → `FieldWithMetaRestructuringEnum` [Getter]
- `getApplicable()` → `Boolean` [Getter]
- `getMultipleHolderObligation()` → `Boolean` [Getter]
- `getMultipleCreditEventNotices()` → `Boolean` [Getter]

### TriggerBuilderImpl
**Implements:** `Trigger$TriggerBuilder` 

**Fields:**
- `List (List) level`
- `CreditEventsBuilder creditEvents`
- `ReferenceWithMetaCreditEventsBuilder creditEventsReference`
- `TriggerTypeEnum triggerType`
- `TriggerTimeTypeEnum triggerTimeType`

**Key Methods:**
- `build()` → `Trigger` [Builder]
- `setLevel(List arg0)` → `TriggerBuilder` [Setter]
- `getLevel()` → `List` [Getter]
- `getTriggerTimeType()` → `TriggerTimeTypeEnum` [Getter]
- `getCreditEventsReference()` → `ReferenceWithMetaCreditEventsBuilder` [Getter]
- `getOrCreateLevel(int arg0)` → `PriceScheduleBuilder` [Getter]
- `getTriggerType()` → `TriggerTypeEnum` [Getter]
- `setTriggerTimeType(TriggerTimeTypeEnum arg0)` → `TriggerBuilder` [Setter]
- `setTriggerType(TriggerTypeEnum arg0)` → `TriggerBuilder` [Setter]
- `setCreditEventsReference(ReferenceWithMetaCreditEvents arg0)` → `TriggerBuilder` [Setter]

### TriggerEventBuilderImpl
**Implements:** `TriggerEvent$TriggerEventBuilder` 

**Fields:**
- `List (List) schedule`
- `DateListBuilder triggerDates`
- `TriggerBuilder trigger`
- `FeaturePaymentBuilder featurePayment`

**Key Methods:**
- `build()` → `TriggerEvent` [Builder]
- `getOrCreateTrigger()` → `TriggerBuilder` [Getter]
- `getOrCreateFeaturePayment()` → `FeaturePaymentBuilder` [Getter]
- `setFeaturePayment(FeaturePayment arg0)` → `TriggerEventBuilder` [Setter]
- `setTriggerDates(DateList arg0)` → `TriggerEventBuilder` [Setter]
- `getOrCreateTriggerDates()` → `DateListBuilder` [Getter]
- `getSchedule()` → `List` [Getter]
- `setSchedule(List arg0)` → `TriggerEventBuilder` [Setter]
- `getOrCreateSchedule(int arg0)` → `AveragingScheduleBuilder` [Getter]
- `getTriggerDates()` → `DateListBuilder` [Getter]

### TriggerEventImpl
**Implements:** `TriggerEvent` 

**Key Methods:**
- `build()` → `TriggerEvent` [Builder]
- `getSchedule()` → `List` [Getter]
- `setBuilderFields(TriggerEventBuilder arg0)` → `void` [Setter]
- `getTriggerDates()` → `DateList` [Getter]
- `getFeaturePayment()` → `FeaturePayment` [Getter]
- `getTrigger()` → `Trigger` [Getter]

### TriggerImpl
**Implements:** `Trigger` 

**Key Methods:**
- `build()` → `Trigger` [Builder]
- `getLevel()` → `List` [Getter]
- `getTriggerTimeType()` → `TriggerTimeTypeEnum` [Getter]
- `getCreditEventsReference()` → `ReferenceWithMetaCreditEvents` [Getter]
- `getTriggerType()` → `TriggerTypeEnum` [Getter]
- `setBuilderFields(TriggerBuilder arg0)` → `void` [Setter]
- `getCreditEvents()` → `CreditEvents` [Getter]

