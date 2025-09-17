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
- `getPubliclyAvailableInformation()` → `PubliclyAvailableInformation` [Getter]
- `getNotifyingParty()` → `List` [Getter]
- `getBusinessCenter()` → `BusinessCenterEnum` [Getter]

### CreditEventNoticeBuilder
**Implements:** `CreditEventNotice` `RosettaModelObjectBuilder` 

**Key Methods:**
- `getPubliclyAvailableInformation()` → `PubliclyAvailableInformationBuilder` [Getter]
- `getOrCreatePubliclyAvailableInformation()` → `PubliclyAvailableInformationBuilder` [Getter]
- `setPubliclyAvailableInformation(PubliclyAvailableInformation arg0)` → `CreditEventNoticeBuilder` [Setter]
- `setBusinessCenter(BusinessCenterEnum arg0)` → `CreditEventNoticeBuilder` [Setter]
- `setNotifyingParty(List arg0)` → `CreditEventNoticeBuilder` [Setter]

### CreditEvents
**Implements:** `RosettaModelObject` `GlobalKey` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `CreditEvents` [Builder]
- `getBankruptcy()` → `Boolean` [Getter]
- `getGovernmentalIntervention()` → `Boolean` [Getter]
- `getMeta()` → `MetaFields` [Getter]
- `getDefaultRequirement()` → `Money` [Getter]
- `getFailureToPay()` → `FailureToPay` [Getter]
- `getRestructuring()` → `Restructuring` [Getter]
- `getCreditEventNotice()` → `CreditEventNotice` [Getter]
- `getFailureToPayPrincipal()` → `Boolean` [Getter]

### CreditEventsBuilder
**Implements:** `CreditEvents` `RosettaModelObjectBuilder` `GlobalKey$GlobalKeyBuilder` 

**Key Methods:**
- `getOrCreateMeta()` → `MetaFieldsBuilder` [Getter]
- `getMeta()` → `MetaFieldsBuilder` [Getter]
- `setMeta(MetaFields arg0)` → `CreditEventsBuilder` [Setter]
- `getDefaultRequirement()` → `MoneyBuilder` [Getter]
- `getFailureToPay()` → `FailureToPayBuilder` [Getter]
- `getRestructuring()` → `RestructuringBuilder` [Getter]
- `getCreditEventNotice()` → `CreditEventNoticeBuilder` [Getter]
- `setImpliedWritedown(Boolean arg0)` → `CreditEventsBuilder` [Setter]
- `getOrCreateRestructuring()` → `RestructuringBuilder` [Getter]
- `setBankruptcy(Boolean arg0)` → `CreditEventsBuilder` [Setter]

### DeterminationMethodology
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `DeterminationMethodology` [Builder]
- `getAveragingMethod()` → `AveragingCalculationMethodEnum` [Getter]
- `getDeterminationMethod()` → `DeterminationMethodEnum` [Getter]

### DeterminationMethodologyBuilder
**Implements:** `DeterminationMethodology` `RosettaModelObjectBuilder` 

**Key Methods:**
- `setDeterminationMethod(DeterminationMethodEnum arg0)` → `DeterminationMethodologyBuilder` [Setter]
- `setAveragingMethod(AveragingCalculationMethodEnum arg0)` → `DeterminationMethodologyBuilder` [Setter]

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
- `setApplicable(Boolean arg0)` → `FailureToPayBuilder` [Setter]
- `getGracePeriodExtension()` → `GracePeriodExtensionBuilder` [Getter]
- `getPaymentRequirement()` → `MoneyBuilder` [Getter]
- `setPaymentRequirement(Money arg0)` → `FailureToPayBuilder` [Setter]
- `setGracePeriodExtension(GracePeriodExtension arg0)` → `FailureToPayBuilder` [Setter]
- `getOrCreateGracePeriodExtension()` → `GracePeriodExtensionBuilder` [Getter]
- `getOrCreatePaymentRequirement()` → `MoneyBuilder` [Getter]

### FeaturePayment
**Implements:** `RosettaModelObject` `GlobalKey` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `FeaturePayment` [Builder]
- `getCurrency()` → `FieldWithMetaString` [Getter]
- `getTime()` → `TimeTypeEnum` [Getter]
- `getPayerReceiver()` → `PartyReferencePayerReceiver` [Getter]
- `getAmount()` → `BigDecimal` [Getter]
- `getMeta()` → `MetaFields` [Getter]
- `getLevelPercentage()` → `BigDecimal` [Getter]
- `getPaymentDate()` → `AdjustableOrRelativeDate` [Getter]

### FeaturePaymentBuilder
**Implements:** `FeaturePayment` `RosettaModelObjectBuilder` `GlobalKey$GlobalKeyBuilder` 

**Key Methods:**
- `getCurrency()` → `FieldWithMetaStringBuilder` [Getter]
- `setCurrency(FieldWithMetaString arg0)` → `FeaturePaymentBuilder` [Setter]
- `setTime(TimeTypeEnum arg0)` → `FeaturePaymentBuilder` [Setter]
- `setPayerReceiver(PartyReferencePayerReceiver arg0)` → `FeaturePaymentBuilder` [Setter]
- `getOrCreatePayerReceiver()` → `PartyReferencePayerReceiverBuilder` [Getter]
- `getPayerReceiver()` → `PartyReferencePayerReceiverBuilder` [Getter]
- `getOrCreateMeta()` → `MetaFieldsBuilder` [Getter]
- `setCurrencyValue(String arg0)` → `FeaturePaymentBuilder` [Setter]
- `setAmount(BigDecimal arg0)` → `FeaturePaymentBuilder` [Setter]
- `getMeta()` → `MetaFieldsBuilder` [Getter]

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
- `setApplicable(Boolean arg0)` → `GracePeriodExtensionBuilder` [Setter]
- `setGracePeriod(Offset arg0)` → `GracePeriodExtensionBuilder` [Setter]
- `getOrCreateGracePeriod()` → `OffsetBuilder` [Getter]
- `getGracePeriod()` → `OffsetBuilder` [Getter]

### Observation
**Implements:** `RosettaModelObject` `GlobalKey` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `Observation` [Builder]
- `getObservationIdentifier()` → `ObservationIdentifier` [Getter]
- `getObservedValue()` → `Price` [Getter]
- `getMeta()` → `MetaFields` [Getter]

### ObservationBuilder
**Implements:** `Observation` `RosettaModelObjectBuilder` `GlobalKey$GlobalKeyBuilder` 

**Key Methods:**
- `getOrCreateMeta()` → `MetaFieldsBuilder` [Getter]
- `getObservationIdentifier()` → `ObservationIdentifierBuilder` [Getter]
- `getObservedValue()` → `PriceBuilder` [Getter]
- `getMeta()` → `MetaFieldsBuilder` [Getter]
- `setMeta(MetaFields arg0)` → `ObservationBuilder` [Setter]
- `getOrCreateObservedValue()` → `PriceBuilder` [Getter]
- `setObservationIdentifier(ObservationIdentifier arg0)` → `ObservationBuilder` [Setter]
- `setObservedValue(Price arg0)` → `ObservationBuilder` [Setter]
- `getOrCreateObservationIdentifier()` → `ObservationIdentifierBuilder` [Getter]

### ObservationIdentifier
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `ObservationIdentifier` [Builder]
- `getObservable()` → `Observable` [Getter]
- `getInformationSource()` → `InformationSource` [Getter]
- `getObservationTime()` → `TimeZone` [Getter]
- `getObservationDate()` → `Date` [Getter]
- `getDeterminationMethodology()` → `DeterminationMethodology` [Getter]

### ObservationIdentifierBuilder
**Implements:** `ObservationIdentifier` `RosettaModelObjectBuilder` 

**Key Methods:**
- `getObservable()` → `ObservableBuilder` [Getter]
- `getOrCreateObservable()` → `ObservableBuilder` [Getter]
- `setObservationDate(Date arg0)` → `ObservationIdentifierBuilder` [Setter]
- `getOrCreateDeterminationMethodology()` → `DeterminationMethodologyBuilder` [Getter]
- `setObservable(Observable arg0)` → `ObservationIdentifierBuilder` [Setter]
- `getInformationSource()` → `InformationSourceBuilder` [Getter]
- `setObservationTime(TimeZone arg0)` → `ObservationIdentifierBuilder` [Setter]
- `setInformationSource(InformationSource arg0)` → `ObservationIdentifierBuilder` [Setter]
- `getObservationTime()` → `TimeZoneBuilder` [Getter]
- `getOrCreateObservationTime()` → `TimeZoneBuilder` [Getter]

### PubliclyAvailableInformation
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `PubliclyAvailableInformation` [Builder]
- `getStandardPublicSources()` → `Boolean` [Getter]
- `getSpecifiedNumber()` → `Integer` [Getter]
- `getPublicSource()` → `List` [Getter]

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
- `getMultipleHolderObligation()` → `Boolean` [Getter]
- `getMultipleCreditEventNotices()` → `Boolean` [Getter]
- `getRestructuringType()` → `FieldWithMetaRestructuringEnum` [Getter]
- `getApplicable()` → `Boolean` [Getter]

### RestructuringBuilder
**Implements:** `Restructuring` `RosettaModelObjectBuilder` 

**Key Methods:**
- `setApplicable(Boolean arg0)` → `RestructuringBuilder` [Setter]
- `getRestructuringType()` → `FieldWithMetaRestructuringEnumBuilder` [Getter]
- `setRestructuringTypeValue(RestructuringEnum arg0)` → `RestructuringBuilder` [Setter]
- `setRestructuringType(FieldWithMetaRestructuringEnum arg0)` → `RestructuringBuilder` [Setter]
- `getOrCreateRestructuringType()` → `FieldWithMetaRestructuringEnumBuilder` [Getter]
- `setMultipleCreditEventNotices(Boolean arg0)` → `RestructuringBuilder` [Setter]
- `setMultipleHolderObligation(Boolean arg0)` → `RestructuringBuilder` [Setter]

### Trigger
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `Trigger` [Builder]
- `getLevel()` → `List` [Getter]
- `getCreditEvents()` → `CreditEvents` [Getter]
- `getTriggerTimeType()` → `TriggerTimeTypeEnum` [Getter]
- `getCreditEventsReference()` → `ReferenceWithMetaCreditEvents` [Getter]
- `getTriggerType()` → `TriggerTypeEnum` [Getter]

### TriggerBuilder
**Implements:** `Trigger` `RosettaModelObjectBuilder` 

**Key Methods:**
- `setLevel(List arg0)` → `TriggerBuilder` [Setter]
- `getLevel()` → `List` [Getter]
- `getCreditEvents()` → `CreditEventsBuilder` [Getter]
- `setTriggerTimeType(TriggerTimeTypeEnum arg0)` → `TriggerBuilder` [Setter]
- `setCreditEvents(CreditEvents arg0)` → `TriggerBuilder` [Setter]
- `setCreditEventsReference(ReferenceWithMetaCreditEvents arg0)` → `TriggerBuilder` [Setter]
- `getOrCreateCreditEvents()` → `CreditEventsBuilder` [Getter]
- `getOrCreateLevel(int arg0)` → `PriceScheduleBuilder` [Getter]
- `setTriggerType(TriggerTypeEnum arg0)` → `TriggerBuilder` [Setter]
- `getCreditEventsReference()` → `ReferenceWithMetaCreditEventsBuilder` [Getter]

### TriggerEvent
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `TriggerEvent` [Builder]
- `getTrigger()` → `Trigger` [Getter]
- `getSchedule()` → `List` [Getter]
- `getTriggerDates()` → `DateList` [Getter]
- `getFeaturePayment()` → `FeaturePayment` [Getter]

### TriggerEventBuilder
**Implements:** `TriggerEvent` `RosettaModelObjectBuilder` 

**Key Methods:**
- `getTrigger()` → `TriggerBuilder` [Getter]
- `getSchedule()` → `List` [Getter]
- `getOrCreateSchedule(int arg0)` → `AveragingScheduleBuilder` [Getter]
- `setSchedule(List arg0)` → `TriggerEventBuilder` [Setter]
- `getOrCreateTriggerDates()` → `DateListBuilder` [Getter]
- `getOrCreateTrigger()` → `TriggerBuilder` [Getter]
- `setTriggerDates(DateList arg0)` → `TriggerEventBuilder` [Setter]
- `getOrCreateFeaturePayment()` → `FeaturePaymentBuilder` [Getter]
- `setFeaturePayment(FeaturePayment arg0)` → `TriggerEventBuilder` [Setter]
- `getTriggerDates()` → `DateListBuilder` [Getter]

## Concrete Classes

### CreditEventNoticeBuilderImpl
**Implements:** `CreditEventNotice$CreditEventNoticeBuilder` 

**Fields:**
- `List (List) notifyingParty`
- `BusinessCenterEnum businessCenter`
- `PubliclyAvailableInformationBuilder publiclyAvailableInformation`

**Key Methods:**
- `build()` → `CreditEventNotice` [Builder]
- `getPubliclyAvailableInformation()` → `PubliclyAvailableInformationBuilder` [Getter]
- `getOrCreatePubliclyAvailableInformation()` → `PubliclyAvailableInformationBuilder` [Getter]
- `setPubliclyAvailableInformation(PubliclyAvailableInformation arg0)` → `CreditEventNoticeBuilder` [Setter]
- `getNotifyingParty()` → `List` [Getter]
- `getBusinessCenter()` → `BusinessCenterEnum` [Getter]
- `setBusinessCenter(BusinessCenterEnum arg0)` → `CreditEventNoticeBuilder` [Setter]
- `setNotifyingParty(List arg0)` → `CreditEventNoticeBuilder` [Setter]

### CreditEventNoticeImpl
**Implements:** `CreditEventNotice` 

**Key Methods:**
- `build()` → `CreditEventNotice` [Builder]
- `setBuilderFields(CreditEventNoticeBuilder arg0)` → `void` [Setter]
- `getPubliclyAvailableInformation()` → `PubliclyAvailableInformation` [Getter]
- `getNotifyingParty()` → `List` [Getter]
- `getBusinessCenter()` → `BusinessCenterEnum` [Getter]

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
- `getOrCreateMeta()` → `MetaFieldsBuilder` [Getter]
- `getBankruptcy()` → `Boolean` [Getter]
- `getGovernmentalIntervention()` → `Boolean` [Getter]
- `getMeta()` → `MetaFieldsBuilder` [Getter]
- `setMeta(MetaFields arg0)` → `CreditEventsBuilder` [Setter]
- `getDefaultRequirement()` → `MoneyBuilder` [Getter]
- `getFailureToPay()` → `FailureToPayBuilder` [Getter]
- `getRestructuring()` → `RestructuringBuilder` [Getter]
- `getCreditEventNotice()` → `CreditEventNoticeBuilder` [Getter]

### CreditEventsImpl
**Implements:** `CreditEvents` 

**Key Methods:**
- `build()` → `CreditEvents` [Builder]
- `setBuilderFields(CreditEventsBuilder arg0)` → `void` [Setter]
- `getBankruptcy()` → `Boolean` [Getter]
- `getGovernmentalIntervention()` → `Boolean` [Getter]
- `getMeta()` → `MetaFields` [Getter]
- `getDefaultRequirement()` → `Money` [Getter]
- `getFailureToPay()` → `FailureToPay` [Getter]
- `getRestructuring()` → `Restructuring` [Getter]
- `getCreditEventNotice()` → `CreditEventNotice` [Getter]
- `getFailureToPayPrincipal()` → `Boolean` [Getter]

### DeterminationMethodologyBuilderImpl
**Implements:** `DeterminationMethodology$DeterminationMethodologyBuilder` 

**Fields:**
- `DeterminationMethodEnum determinationMethod`
- `AveragingCalculationMethodEnum averagingMethod`

**Key Methods:**
- `build()` → `DeterminationMethodology` [Builder]
- `getAveragingMethod()` → `AveragingCalculationMethodEnum` [Getter]
- `setDeterminationMethod(DeterminationMethodEnum arg0)` → `DeterminationMethodologyBuilder` [Setter]
- `getDeterminationMethod()` → `DeterminationMethodEnum` [Getter]
- `setAveragingMethod(AveragingCalculationMethodEnum arg0)` → `DeterminationMethodologyBuilder` [Setter]

### DeterminationMethodologyImpl
**Implements:** `DeterminationMethodology` 

**Key Methods:**
- `build()` → `DeterminationMethodology` [Builder]
- `setBuilderFields(DeterminationMethodologyBuilder arg0)` → `void` [Setter]
- `getAveragingMethod()` → `AveragingCalculationMethodEnum` [Getter]
- `getDeterminationMethod()` → `DeterminationMethodEnum` [Getter]

### FailureToPayBuilderImpl
**Implements:** `FailureToPay$FailureToPayBuilder` 

**Fields:**
- `Boolean applicable`
- `GracePeriodExtensionBuilder gracePeriodExtension`
- `MoneyBuilder paymentRequirement`

**Key Methods:**
- `build()` → `FailureToPay` [Builder]
- `setApplicable(Boolean arg0)` → `FailureToPayBuilder` [Setter]
- `getGracePeriodExtension()` → `GracePeriodExtensionBuilder` [Getter]
- `getPaymentRequirement()` → `MoneyBuilder` [Getter]
- `setPaymentRequirement(Money arg0)` → `FailureToPayBuilder` [Setter]
- `setGracePeriodExtension(GracePeriodExtension arg0)` → `FailureToPayBuilder` [Setter]
- `getOrCreateGracePeriodExtension()` → `GracePeriodExtensionBuilder` [Getter]
- `getOrCreatePaymentRequirement()` → `MoneyBuilder` [Getter]
- `getApplicable()` → `Boolean` [Getter]

### FailureToPayImpl
**Implements:** `FailureToPay` 

**Key Methods:**
- `build()` → `FailureToPay` [Builder]
- `setBuilderFields(FailureToPayBuilder arg0)` → `void` [Setter]
- `getGracePeriodExtension()` → `GracePeriodExtension` [Getter]
- `getPaymentRequirement()` → `Money` [Getter]
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
- `setPayerReceiver(PartyReferencePayerReceiver arg0)` → `FeaturePaymentBuilder` [Setter]
- `getOrCreatePayerReceiver()` → `PartyReferencePayerReceiverBuilder` [Getter]
- `getPayerReceiver()` → `PartyReferencePayerReceiverBuilder` [Getter]
- `getOrCreateMeta()` → `MetaFieldsBuilder` [Getter]
- `setCurrencyValue(String arg0)` → `FeaturePaymentBuilder` [Setter]

### FeaturePaymentImpl
**Implements:** `FeaturePayment` 

**Key Methods:**
- `build()` → `FeaturePayment` [Builder]
- `getCurrency()` → `FieldWithMetaString` [Getter]
- `getTime()` → `TimeTypeEnum` [Getter]
- `setBuilderFields(FeaturePaymentBuilder arg0)` → `void` [Setter]
- `getPayerReceiver()` → `PartyReferencePayerReceiver` [Getter]
- `getAmount()` → `BigDecimal` [Getter]
- `getMeta()` → `MetaFields` [Getter]
- `getLevelPercentage()` → `BigDecimal` [Getter]
- `getPaymentDate()` → `AdjustableOrRelativeDate` [Getter]

### GracePeriodExtensionBuilderImpl
**Implements:** `GracePeriodExtension$GracePeriodExtensionBuilder` 

**Fields:**
- `Boolean applicable`
- `OffsetBuilder gracePeriod`

**Key Methods:**
- `build()` → `GracePeriodExtension` [Builder]
- `setApplicable(Boolean arg0)` → `GracePeriodExtensionBuilder` [Setter]
- `setGracePeriod(Offset arg0)` → `GracePeriodExtensionBuilder` [Setter]
- `getOrCreateGracePeriod()` → `OffsetBuilder` [Getter]
- `getGracePeriod()` → `OffsetBuilder` [Getter]
- `getApplicable()` → `Boolean` [Getter]

### GracePeriodExtensionImpl
**Implements:** `GracePeriodExtension` 

**Key Methods:**
- `build()` → `GracePeriodExtension` [Builder]
- `setBuilderFields(GracePeriodExtensionBuilder arg0)` → `void` [Setter]
- `getGracePeriod()` → `Offset` [Getter]
- `getApplicable()` → `Boolean` [Getter]

### ObservationBuilderImpl
**Implements:** `Observation$ObservationBuilder` 

**Fields:**
- `PriceBuilder observedValue`
- `ObservationIdentifierBuilder observationIdentifier`
- `MetaFieldsBuilder meta`

**Key Methods:**
- `build()` → `Observation` [Builder]
- `getOrCreateMeta()` → `MetaFieldsBuilder` [Getter]
- `getObservationIdentifier()` → `ObservationIdentifierBuilder` [Getter]
- `getObservedValue()` → `PriceBuilder` [Getter]
- `getMeta()` → `MetaFieldsBuilder` [Getter]
- `setMeta(MetaFields arg0)` → `ObservationBuilder` [Setter]
- `getOrCreateObservedValue()` → `PriceBuilder` [Getter]
- `setObservationIdentifier(ObservationIdentifier arg0)` → `ObservationBuilder` [Setter]
- `setObservedValue(Price arg0)` → `ObservationBuilder` [Setter]
- `getOrCreateObservationIdentifier()` → `ObservationIdentifierBuilder` [Getter]

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
- `getObservable()` → `ObservableBuilder` [Getter]
- `getOrCreateObservable()` → `ObservableBuilder` [Getter]
- `setObservationDate(Date arg0)` → `ObservationIdentifierBuilder` [Setter]
- `getOrCreateDeterminationMethodology()` → `DeterminationMethodologyBuilder` [Getter]
- `setObservable(Observable arg0)` → `ObservationIdentifierBuilder` [Setter]
- `getInformationSource()` → `InformationSourceBuilder` [Getter]
- `setObservationTime(TimeZone arg0)` → `ObservationIdentifierBuilder` [Setter]
- `setInformationSource(InformationSource arg0)` → `ObservationIdentifierBuilder` [Setter]
- `getObservationTime()` → `TimeZoneBuilder` [Getter]

### ObservationIdentifierImpl
**Implements:** `ObservationIdentifier` 

**Key Methods:**
- `build()` → `ObservationIdentifier` [Builder]
- `getObservable()` → `Observable` [Getter]
- `setBuilderFields(ObservationIdentifierBuilder arg0)` → `void` [Setter]
- `getInformationSource()` → `InformationSource` [Getter]
- `getObservationTime()` → `TimeZone` [Getter]
- `getObservationDate()` → `Date` [Getter]
- `getDeterminationMethodology()` → `DeterminationMethodology` [Getter]

### ObservationImpl
**Implements:** `Observation` 

**Key Methods:**
- `build()` → `Observation` [Builder]
- `setBuilderFields(ObservationBuilder arg0)` → `void` [Setter]
- `getObservationIdentifier()` → `ObservationIdentifier` [Getter]
- `getObservedValue()` → `Price` [Getter]
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
- `setStandardPublicSources(Boolean arg0)` → `PubliclyAvailableInformationBuilder` [Setter]
- `setPublicSource(List arg0)` → `PubliclyAvailableInformationBuilder` [Setter]
- `getSpecifiedNumber()` → `Integer` [Getter]
- `getPublicSource()` → `List` [Getter]
- `setSpecifiedNumber(Integer arg0)` → `PubliclyAvailableInformationBuilder` [Setter]

### PubliclyAvailableInformationImpl
**Implements:** `PubliclyAvailableInformation` 

**Key Methods:**
- `build()` → `PubliclyAvailableInformation` [Builder]
- `setBuilderFields(PubliclyAvailableInformationBuilder arg0)` → `void` [Setter]
- `getStandardPublicSources()` → `Boolean` [Getter]
- `getSpecifiedNumber()` → `Integer` [Getter]
- `getPublicSource()` → `List` [Getter]

### RestructuringBuilderImpl
**Implements:** `Restructuring$RestructuringBuilder` 

**Fields:**
- `Boolean applicable`
- `FieldWithMetaRestructuringEnumBuilder restructuringType`
- `Boolean multipleHolderObligation`
- `Boolean multipleCreditEventNotices`

**Key Methods:**
- `build()` → `Restructuring` [Builder]
- `getMultipleHolderObligation()` → `Boolean` [Getter]
- `getMultipleCreditEventNotices()` → `Boolean` [Getter]
- `setApplicable(Boolean arg0)` → `RestructuringBuilder` [Setter]
- `getRestructuringType()` → `FieldWithMetaRestructuringEnumBuilder` [Getter]
- `setRestructuringTypeValue(RestructuringEnum arg0)` → `RestructuringBuilder` [Setter]
- `setRestructuringType(FieldWithMetaRestructuringEnum arg0)` → `RestructuringBuilder` [Setter]
- `getOrCreateRestructuringType()` → `FieldWithMetaRestructuringEnumBuilder` [Getter]
- `setMultipleCreditEventNotices(Boolean arg0)` → `RestructuringBuilder` [Setter]
- `setMultipleHolderObligation(Boolean arg0)` → `RestructuringBuilder` [Setter]

### RestructuringImpl
**Implements:** `Restructuring` 

**Key Methods:**
- `build()` → `Restructuring` [Builder]
- `setBuilderFields(RestructuringBuilder arg0)` → `void` [Setter]
- `getMultipleHolderObligation()` → `Boolean` [Getter]
- `getMultipleCreditEventNotices()` → `Boolean` [Getter]
- `getRestructuringType()` → `FieldWithMetaRestructuringEnum` [Getter]
- `getApplicable()` → `Boolean` [Getter]

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
- `getCreditEvents()` → `CreditEventsBuilder` [Getter]
- `setTriggerTimeType(TriggerTimeTypeEnum arg0)` → `TriggerBuilder` [Setter]
- `setCreditEvents(CreditEvents arg0)` → `TriggerBuilder` [Setter]
- `setCreditEventsReference(ReferenceWithMetaCreditEvents arg0)` → `TriggerBuilder` [Setter]
- `getOrCreateCreditEvents()` → `CreditEventsBuilder` [Getter]
- `getOrCreateLevel(int arg0)` → `PriceScheduleBuilder` [Getter]
- `setTriggerType(TriggerTypeEnum arg0)` → `TriggerBuilder` [Setter]

### TriggerEventBuilderImpl
**Implements:** `TriggerEvent$TriggerEventBuilder` 

**Fields:**
- `List (List) schedule`
- `DateListBuilder triggerDates`
- `TriggerBuilder trigger`
- `FeaturePaymentBuilder featurePayment`

**Key Methods:**
- `build()` → `TriggerEvent` [Builder]
- `getTrigger()` → `TriggerBuilder` [Getter]
- `getSchedule()` → `List` [Getter]
- `getOrCreateSchedule(int arg0)` → `AveragingScheduleBuilder` [Getter]
- `setSchedule(List arg0)` → `TriggerEventBuilder` [Setter]
- `getOrCreateTriggerDates()` → `DateListBuilder` [Getter]
- `getOrCreateTrigger()` → `TriggerBuilder` [Getter]
- `setTriggerDates(DateList arg0)` → `TriggerEventBuilder` [Setter]
- `getOrCreateFeaturePayment()` → `FeaturePaymentBuilder` [Getter]
- `setFeaturePayment(FeaturePayment arg0)` → `TriggerEventBuilder` [Setter]

### TriggerEventImpl
**Implements:** `TriggerEvent` 

**Key Methods:**
- `build()` → `TriggerEvent` [Builder]
- `setBuilderFields(TriggerEventBuilder arg0)` → `void` [Setter]
- `getTrigger()` → `Trigger` [Getter]
- `getSchedule()` → `List` [Getter]
- `getTriggerDates()` → `DateList` [Getter]
- `getFeaturePayment()` → `FeaturePayment` [Getter]

### TriggerImpl
**Implements:** `Trigger` 

**Key Methods:**
- `build()` → `Trigger` [Builder]
- `getLevel()` → `List` [Getter]
- `setBuilderFields(TriggerBuilder arg0)` → `void` [Setter]
- `getCreditEvents()` → `CreditEvents` [Getter]
- `getTriggerTimeType()` → `TriggerTimeTypeEnum` [Getter]
- `getCreditEventsReference()` → `ReferenceWithMetaCreditEvents` [Getter]
- `getTriggerType()` → `TriggerTypeEnum` [Getter]

