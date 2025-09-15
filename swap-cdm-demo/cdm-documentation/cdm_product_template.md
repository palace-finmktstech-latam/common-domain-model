# Package: cdm.product.template

## Enums

### AssetPayoutTradeTypeEnum
**Values:**
- `Repo`
- `Buy/Sell-Back`

### AveragingInOutEnum
**Values:**
- `In`
- `Out`
- `Both`

### CallingPartyEnum
**Values:**
- `InitialBuyer`
- `InitialSeller`
- `Either`
- `AsDefinedInMasterAgreement`

### ExerciseNoticeGiverEnum
**Values:**
- `Buyer`
- `Seller`
- `Both`
- `AsSpecifiedInMasterAgreement`

### ExpirationTimeTypeEnum
**Values:**
- `Close`
- `Open`
- `OSP`
- `SpecificTime`
- `XETRA`
- `DerivativesClose`
- `AsSpecifiedInMasterConfirmation`

### MarginTypeEnum
**Values:**
- `Cash`
- `Instrument`

### OptionExerciseStyleEnum
**Values:**
- `European`
- `Bermuda`
- `American`

### OptionTypeEnum
**Values:**
- `Put`
- `Call`
- `Payer`
- `Receiver`
- `Straddle`

### RepoDurationEnum
**Values:**
- `Overnight`
- `Term`

## Interfaces

### Asian
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `Asian` [Builder]
- `getStrikeFactor()` → `BigDecimal` [Getter]
- `getAveragingPeriodOut()` → `AveragingPeriod` [Getter]
- `getAveragingInOut()` → `AveragingInOutEnum` [Getter]
- `getAveragingPeriodIn()` → `AveragingPeriod` [Getter]

### AsianBuilder
**Implements:** `Asian` `RosettaModelObjectBuilder` 

**Key Methods:**
- `getOrCreateAveragingPeriodIn()` → `AveragingPeriodBuilder` [Getter]
- `getOrCreateAveragingPeriodOut()` → `AveragingPeriodBuilder` [Getter]
- `setAveragingPeriodIn(AveragingPeriod arg0)` → `AsianBuilder` [Setter]
- `getAveragingPeriodOut()` → `AveragingPeriodBuilder` [Getter]
- `setAveragingInOut(AveragingInOutEnum arg0)` → `AsianBuilder` [Setter]
- `getAveragingPeriodIn()` → `AveragingPeriodBuilder` [Getter]
- `setAveragingPeriodOut(AveragingPeriod arg0)` → `AsianBuilder` [Setter]
- `setStrikeFactor(BigDecimal arg0)` → `AsianBuilder` [Setter]

### AssetLeg
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `AssetLeg` [Builder]
- `getSettlementDate()` → `AdjustableOrRelativeDate` [Getter]
- `getDeliveryMethod()` → `DeliveryMethodEnum` [Getter]

### AssetLegBuilder
**Implements:** `AssetLeg` `RosettaModelObjectBuilder` 

**Key Methods:**
- `getSettlementDate()` → `AdjustableOrRelativeDateBuilder` [Getter]
- `getOrCreateSettlementDate()` → `AdjustableOrRelativeDateBuilder` [Getter]
- `setSettlementDate(AdjustableOrRelativeDate arg0)` → `AssetLegBuilder` [Setter]
- `setDeliveryMethod(DeliveryMethodEnum arg0)` → `AssetLegBuilder` [Setter]

### AssetPayout
**Implements:** `PayoutBase` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `AssetPayout` [Builder]
- `getDividendTerms()` → `DividendTerms` [Getter]
- `getAssetLeg()` → `List` [Getter]
- `getTradeType()` → `AssetPayoutTradeTypeEnum` [Getter]
- `getUnderlier()` → `Asset` [Getter]
- `getMinimumFee()` → `Money` [Getter]

### AssetPayoutBuilder
**Implements:** `AssetPayout` `PayoutBase$PayoutBaseBuilder` 

**Key Methods:**
- `getDividendTerms()` → `DividendTermsBuilder` [Getter]
- `getAssetLeg()` → `List` [Getter]
- `getOrCreateUnderlier()` → `AssetBuilder` [Getter]
- `getUnderlier()` → `AssetBuilder` [Getter]
- `setUnderlier(Asset arg0)` → `AssetPayoutBuilder` [Setter]
- `setPrincipalPayment(PrincipalPayments arg0)` → `AssetPayoutBuilder` [Setter]
- `setPayerReceiver(PayerReceiver arg0)` → `AssetPayoutBuilder` [Setter]
- `getMinimumFee()` → `MoneyBuilder` [Getter]
- `setMinimumFee(Money arg0)` → `AssetPayoutBuilder` [Setter]
- `getOrCreateAssetLeg(int arg0)` → `AssetLegBuilder` [Getter]

### AutomaticExercise
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `AutomaticExercise` [Builder]
- `getIsApplicable()` → `Boolean` [Getter]
- `getThresholdRate()` → `BigDecimal` [Getter]

### AutomaticExerciseBuilder
**Implements:** `AutomaticExercise` `RosettaModelObjectBuilder` 

**Key Methods:**
- `setIsApplicable(Boolean arg0)` → `AutomaticExerciseBuilder` [Setter]
- `setThresholdRate(BigDecimal arg0)` → `AutomaticExerciseBuilder` [Setter]

### AveragingCalculation
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `AveragingCalculation` [Builder]
- `getAveragingMethod()` → `AveragingCalculationMethod` [Getter]
- `getPrecision()` → `Rounding` [Getter]

### AveragingCalculationBuilder
**Implements:** `AveragingCalculation` `RosettaModelObjectBuilder` 

**Key Methods:**
- `setAveragingMethod(AveragingCalculationMethod arg0)` → `AveragingCalculationBuilder` [Setter]
- `getOrCreateAveragingMethod()` → `AveragingCalculationMethodBuilder` [Getter]
- `getOrCreatePrecision()` → `RoundingBuilder` [Getter]
- `setPrecision(Rounding arg0)` → `AveragingCalculationBuilder` [Setter]
- `getAveragingMethod()` → `AveragingCalculationMethodBuilder` [Getter]
- `getPrecision()` → `RoundingBuilder` [Getter]

### AveragingStrikeFeature
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `AveragingStrikeFeature` [Builder]
- `getAveragingCalculation()` → `AveragingCalculation` [Getter]
- `getObservationTerms()` → `ObservationTerms` [Getter]

### AveragingStrikeFeatureBuilder
**Implements:** `AveragingStrikeFeature` `RosettaModelObjectBuilder` 

**Key Methods:**
- `getOrCreateObservationTerms()` → `ObservationTermsBuilder` [Getter]
- `setObservationTerms(ObservationTerms arg0)` → `AveragingStrikeFeatureBuilder` [Setter]
- `getOrCreateAveragingCalculation()` → `AveragingCalculationBuilder` [Getter]
- `getAveragingCalculation()` → `AveragingCalculationBuilder` [Getter]
- `setAveragingCalculation(AveragingCalculation arg0)` → `AveragingStrikeFeatureBuilder` [Setter]
- `getObservationTerms()` → `ObservationTermsBuilder` [Getter]

### Barrier
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `Barrier` [Builder]
- `getBarrierFloor()` → `TriggerEvent` [Getter]
- `getBarrierCap()` → `TriggerEvent` [Getter]

### BarrierBuilder
**Implements:** `Barrier` `RosettaModelObjectBuilder` 

**Key Methods:**
- `setBarrierFloor(TriggerEvent arg0)` → `BarrierBuilder` [Setter]
- `getOrCreateBarrierCap()` → `TriggerEventBuilder` [Getter]
- `getOrCreateBarrierFloor()` → `TriggerEventBuilder` [Getter]
- `setBarrierCap(TriggerEvent arg0)` → `BarrierBuilder` [Setter]
- `getBarrierFloor()` → `TriggerEventBuilder` [Getter]
- `getBarrierCap()` → `TriggerEventBuilder` [Getter]

### CalculationSchedule
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `CalculationSchedule` [Builder]
- `getSchedulePeriod()` → `List` [Getter]

### CalculationScheduleBuilder
**Implements:** `CalculationSchedule` `RosettaModelObjectBuilder` 

**Key Methods:**
- `getSchedulePeriod()` → `List` [Getter]
- `getOrCreateSchedulePeriod(int arg0)` → `SchedulePeriodBuilder` [Getter]
- `setSchedulePeriod(List arg0)` → `CalculationScheduleBuilder` [Setter]

### CalendarSpread
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `CalendarSpread` [Builder]
- `getExpirationDateTwo()` → `AdjustableOrRelativeDate` [Getter]

### CalendarSpreadBuilder
**Implements:** `CalendarSpread` `RosettaModelObjectBuilder` 

**Key Methods:**
- `getOrCreateExpirationDateTwo()` → `AdjustableOrRelativeDateBuilder` [Getter]
- `getExpirationDateTwo()` → `AdjustableOrRelativeDateBuilder` [Getter]
- `setExpirationDateTwo(AdjustableOrRelativeDate arg0)` → `CalendarSpreadBuilder` [Setter]

### CancelableProvision
**Implements:** `BuyerSeller` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `CancelableProvision` [Builder]
- `getExerciseTerms()` → `ExerciseTerms` [Getter]
- `getFollowUpConfirmation()` → `Boolean` [Getter]
- `getEffectivePeriod()` → `Period` [Getter]
- `getExerciseNotice()` → `ExerciseNotice` [Getter]
- `getLatestCancelationTime()` → `BusinessCenterTime` [Getter]
- `getInitialFee()` → `Transfer` [Getter]
- `getEarliestDate()` → `AdjustableOrRelativeDate` [Getter]
- `getExpirationDate()` → `AdjustableOrRelativeDate` [Getter]

### CancelableProvisionAdjustedDates
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `CancelableProvisionAdjustedDates` [Builder]
- `getCancellationEvent()` → `List` [Getter]

### CancelableProvisionAdjustedDatesBuilder
**Implements:** `CancelableProvisionAdjustedDates` `RosettaModelObjectBuilder` 

**Key Methods:**
- `getOrCreateCancellationEvent(int arg0)` → `CancellationEventBuilder` [Getter]
- `getCancellationEvent()` → `List` [Getter]
- `setCancellationEvent(List arg0)` → `CancelableProvisionAdjustedDatesBuilder` [Setter]

### CancelableProvisionBuilder
**Implements:** `CancelableProvision` `BuyerSeller$BuyerSellerBuilder` 

**Key Methods:**
- `setEffectiveDate(AdjustableOrRelativeDates arg0)` → `CancelableProvisionBuilder` [Setter]
- `getOrCreateEffectiveDate()` → `AdjustableOrRelativeDatesBuilder` [Getter]
- `setExerciseTerms(ExerciseTerms arg0)` → `CancelableProvisionBuilder` [Setter]
- `getOrCreateExerciseTerms()` → `ExerciseTermsBuilder` [Getter]
- `getExerciseTerms()` → `ExerciseTermsBuilder` [Getter]
- `getEffectivePeriod()` → `PeriodBuilder` [Getter]
- `getExerciseNotice()` → `ExerciseNoticeBuilder` [Getter]
- `getLatestCancelationTime()` → `BusinessCenterTimeBuilder` [Getter]
- `getInitialFee()` → `TransferBuilder` [Getter]
- `getEarliestDate()` → `AdjustableOrRelativeDateBuilder` [Getter]

### CancellationEvent
**Implements:** `RosettaModelObject` `GlobalKey` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `CancellationEvent` [Builder]
- `getAdjustedEarlyTerminationDate()` → `Date` [Getter]
- `getAdjustedExerciseDate()` → `Date` [Getter]
- `getMeta()` → `MetaFields` [Getter]

### CancellationEventBuilder
**Implements:** `CancellationEvent` `RosettaModelObjectBuilder` `GlobalKey$GlobalKeyBuilder` 

**Key Methods:**
- `getOrCreateMeta()` → `MetaFieldsBuilder` [Getter]
- `setAdjustedEarlyTerminationDate(Date arg0)` → `CancellationEventBuilder` [Setter]
- `setAdjustedExerciseDate(Date arg0)` → `CancellationEventBuilder` [Setter]
- `setMeta(MetaFields arg0)` → `CancellationEventBuilder` [Setter]
- `getMeta()` → `MetaFieldsBuilder` [Getter]

### Composite
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `Composite` [Builder]
- `getDeterminationMethod()` → `DeterminationMethodEnum` [Getter]
- `getRelativeDate()` → `RelativeDateOffset` [Getter]
- `getFxSpotRateSource()` → `FxSpotRateSource` [Getter]
- `getFixingTime()` → `BusinessCenterTime` [Getter]

### CompositeBuilder
**Implements:** `Composite` `RosettaModelObjectBuilder` 

**Key Methods:**
- `getOrCreateFxSpotRateSource()` → `FxSpotRateSourceBuilder` [Getter]
- `setDeterminationMethod(DeterminationMethodEnum arg0)` → `CompositeBuilder` [Setter]
- `getOrCreateRelativeDate()` → `RelativeDateOffsetBuilder` [Getter]
- `setRelativeDate(RelativeDateOffset arg0)` → `CompositeBuilder` [Setter]
- `getRelativeDate()` → `RelativeDateOffsetBuilder` [Getter]
- `getFxSpotRateSource()` → `FxSpotRateSourceBuilder` [Getter]
- `setFixingTime(BusinessCenterTime arg0)` → `CompositeBuilder` [Setter]
- `getFixingTime()` → `BusinessCenterTimeBuilder` [Getter]
- `setFxSpotRateSource(FxSpotRateSource arg0)` → `CompositeBuilder` [Setter]
- `getOrCreateFixingTime()` → `BusinessCenterTimeBuilder` [Getter]

### ConstituentWeight
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `ConstituentWeight` [Builder]
- `getBasketPercentage()` → `BigDecimal` [Getter]
- `getOpenUnits()` → `BigDecimal` [Getter]

### ConstituentWeightBuilder
**Implements:** `ConstituentWeight` `RosettaModelObjectBuilder` 

**Key Methods:**
- `setOpenUnits(BigDecimal arg0)` → `ConstituentWeightBuilder` [Setter]
- `setBasketPercentage(BigDecimal arg0)` → `ConstituentWeightBuilder` [Setter]

### DividendTerms
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `DividendTerms` [Builder]
- `getManufacturedIncomeRequirement()` → `DividendPayoutRatio` [Getter]
- `getMinimumBillingAmount()` → `Money` [Getter]
- `getDividendEntitlement()` → `DividendEntitlementEnum` [Getter]

### DividendTermsBuilder
**Implements:** `DividendTerms` `RosettaModelObjectBuilder` 

**Key Methods:**
- `getOrCreateManufacturedIncomeRequirement()` → `DividendPayoutRatioBuilder` [Getter]
- `getOrCreateMinimumBillingAmount()` → `MoneyBuilder` [Getter]
- `setManufacturedIncomeRequirement(DividendPayoutRatio arg0)` → `DividendTermsBuilder` [Setter]
- `getManufacturedIncomeRequirement()` → `DividendPayoutRatioBuilder` [Getter]
- `getMinimumBillingAmount()` → `MoneyBuilder` [Getter]
- `setMinimumBillingAmount(Money arg0)` → `DividendTermsBuilder` [Setter]
- `setDividendEntitlement(DividendEntitlementEnum arg0)` → `DividendTermsBuilder` [Setter]

### EarlyTerminationEvent
**Implements:** `RosettaModelObject` `GlobalKey` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `EarlyTerminationEvent` [Builder]
- `getAdjustedEarlyTerminationDate()` → `Date` [Getter]
- `getAdjustedCashSettlementPaymentDate()` → `Date` [Getter]
- `getAdjustedExerciseFeePaymentDate()` → `Date` [Getter]
- `getAdjustedCashSettlementValuationDate()` → `Date` [Getter]
- `getAdjustedExerciseDate()` → `Date` [Getter]
- `getMeta()` → `MetaFields` [Getter]

### EarlyTerminationEventBuilder
**Implements:** `EarlyTerminationEvent` `RosettaModelObjectBuilder` `GlobalKey$GlobalKeyBuilder` 

**Key Methods:**
- `getOrCreateMeta()` → `MetaFieldsBuilder` [Getter]
- `setAdjustedEarlyTerminationDate(Date arg0)` → `EarlyTerminationEventBuilder` [Setter]
- `setAdjustedCashSettlementValuationDate(Date arg0)` → `EarlyTerminationEventBuilder` [Setter]
- `setAdjustedExerciseFeePaymentDate(Date arg0)` → `EarlyTerminationEventBuilder` [Setter]
- `setAdjustedCashSettlementPaymentDate(Date arg0)` → `EarlyTerminationEventBuilder` [Setter]
- `setAdjustedExerciseDate(Date arg0)` → `EarlyTerminationEventBuilder` [Setter]
- `setMeta(MetaFields arg0)` → `EarlyTerminationEventBuilder` [Setter]
- `getMeta()` → `MetaFieldsBuilder` [Getter]

### EarlyTerminationProvision
**Implements:** `RosettaModelObject` `GlobalKey` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `EarlyTerminationProvision` [Builder]
- `getMandatoryEarlyTerminationDateTenor()` → `Period` [Getter]
- `getMandatoryEarlyTermination()` → `MandatoryEarlyTermination` [Getter]
- `getOptionalEarlyTermination()` → `OptionalEarlyTermination` [Getter]
- `getOptionalEarlyTerminationParameters()` → `ExercisePeriod` [Getter]
- `getMeta()` → `MetaFields` [Getter]

### EarlyTerminationProvisionBuilder
**Implements:** `EarlyTerminationProvision` `RosettaModelObjectBuilder` `GlobalKey$GlobalKeyBuilder` 

**Key Methods:**
- `getOrCreateOptionalEarlyTerminationParameters()` → `ExercisePeriodBuilder` [Getter]
- `getOrCreateMandatoryEarlyTerminationDateTenor()` → `PeriodBuilder` [Getter]
- `getOrCreateMeta()` → `MetaFieldsBuilder` [Getter]
- `getOrCreateMandatoryEarlyTermination()` → `MandatoryEarlyTerminationBuilder` [Getter]
- `setOptionalEarlyTermination(OptionalEarlyTermination arg0)` → `EarlyTerminationProvisionBuilder` [Setter]
- `setMandatoryEarlyTermination(MandatoryEarlyTermination arg0)` → `EarlyTerminationProvisionBuilder` [Setter]
- `setMandatoryEarlyTerminationDateTenor(Period arg0)` → `EarlyTerminationProvisionBuilder` [Setter]
- `setOptionalEarlyTerminationParameters(ExercisePeriod arg0)` → `EarlyTerminationProvisionBuilder` [Setter]
- `getOrCreateOptionalEarlyTermination()` → `OptionalEarlyTerminationBuilder` [Getter]
- `getMandatoryEarlyTerminationDateTenor()` → `PeriodBuilder` [Getter]

### EconomicTerms
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `EconomicTerms` [Builder]
- `getTerminationProvision()` → `TerminationProvision` [Getter]
- `getNonStandardisedTerms()` → `Boolean` [Getter]
- `getCalculationAgent()` → `CalculationAgent` [Getter]
- `getEffectiveDate()` → `AdjustableOrRelativeDate` [Getter]
- `getTerminationDate()` → `AdjustableOrRelativeDate` [Getter]
- `getCollateral()` → `Collateral` [Getter]
- `getPayout()` → `List` [Getter]
- `getDateAdjustments()` → `BusinessDayAdjustments` [Getter]

### EconomicTermsBuilder
**Implements:** `EconomicTerms` `RosettaModelObjectBuilder` 

**Key Methods:**
- `setPayout(List arg0)` → `EconomicTermsBuilder` [Setter]
- `setCollateral(Collateral arg0)` → `EconomicTermsBuilder` [Setter]
- `getOrCreateCollateral()` → `CollateralBuilder` [Getter]
- `setEffectiveDate(AdjustableOrRelativeDate arg0)` → `EconomicTermsBuilder` [Setter]
- `getOrCreatePayout(int arg0)` → `PayoutBuilder` [Getter]
- `setDateAdjustments(BusinessDayAdjustments arg0)` → `EconomicTermsBuilder` [Setter]
- `getOrCreateDateAdjustments()` → `BusinessDayAdjustmentsBuilder` [Getter]
- `setTerminationProvision(TerminationProvision arg0)` → `EconomicTermsBuilder` [Setter]
- `setNonStandardisedTerms(Boolean arg0)` → `EconomicTermsBuilder` [Setter]
- `setCalculationAgent(CalculationAgent arg0)` → `EconomicTermsBuilder` [Setter]

### EvergreenProvision
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `EvergreenProvision` [Builder]
- `getSinglePartyOption()` → `PartyRole` [Getter]
- `getNoticePeriod()` → `RelativeDateOffset` [Getter]
- `getExtensionFrequency()` → `AdjustableRelativeOrPeriodicDates` [Getter]
- `getNoticeDeadlinePeriod()` → `RelativeDateOffset` [Getter]
- `getNoticeDeadlineDateTime()` → `ZonedDateTime` [Getter]
- `getFinalPeriodFeeAdjustment()` → `Price` [Getter]

### EvergreenProvisionBuilder
**Implements:** `EvergreenProvision` `RosettaModelObjectBuilder` 

**Key Methods:**
- `getSinglePartyOption()` → `PartyRoleBuilder` [Getter]
- `getNoticePeriod()` → `RelativeDateOffsetBuilder` [Getter]
- `getExtensionFrequency()` → `AdjustableRelativeOrPeriodicDatesBuilder` [Getter]
- `getOrCreateNoticePeriod()` → `RelativeDateOffsetBuilder` [Getter]
- `getOrCreateSinglePartyOption()` → `PartyRoleBuilder` [Getter]
- `getOrCreateFinalPeriodFeeAdjustment()` → `PriceBuilder` [Getter]
- `setFinalPeriodFeeAdjustment(Price arg0)` → `EvergreenProvisionBuilder` [Setter]
- `getOrCreateExtensionFrequency()` → `AdjustableRelativeOrPeriodicDatesBuilder` [Getter]
- `setExtensionFrequency(AdjustableRelativeOrPeriodicDates arg0)` → `EvergreenProvisionBuilder` [Setter]
- `setNoticePeriod(RelativeDateOffset arg0)` → `EvergreenProvisionBuilder` [Setter]

### ExerciseFee
**Implements:** `PayerReceiver` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `ExerciseFee` [Builder]
- `getFeeRate()` → `BigDecimal` [Getter]
- `getNotionalReference()` → `ReferenceWithMetaMoney` [Getter]
- `getFeePaymentDate()` → `RelativeDateOffset` [Getter]
- `getFeeAmount()` → `BigDecimal` [Getter]

### ExerciseFeeBuilder
**Implements:** `ExerciseFee` `PayerReceiver$PayerReceiverBuilder` 

**Key Methods:**
- `setReceiver(CounterpartyRoleEnum arg0)` → `ExerciseFeeBuilder` [Setter]
- `getOrCreateNotionalReference()` → `ReferenceWithMetaMoneyBuilder` [Getter]
- `getNotionalReference()` → `ReferenceWithMetaMoneyBuilder` [Getter]
- `getFeePaymentDate()` → `RelativeDateOffsetBuilder` [Getter]
- `getOrCreateFeePaymentDate()` → `RelativeDateOffsetBuilder` [Getter]
- `setNotionalReference(ReferenceWithMetaMoney arg0)` → `ExerciseFeeBuilder` [Setter]
- `setFeePaymentDate(RelativeDateOffset arg0)` → `ExerciseFeeBuilder` [Setter]
- `setNotionalReferenceValue(Money arg0)` → `ExerciseFeeBuilder` [Setter]
- `setFeeAmount(BigDecimal arg0)` → `ExerciseFeeBuilder` [Setter]
- `setPayer(CounterpartyRoleEnum arg0)` → `ExerciseFeeBuilder` [Setter]

### ExerciseFeeSchedule
**Implements:** `PayerReceiver` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `ExerciseFeeSchedule` [Builder]
- `getNotionalReference()` → `ReferenceWithMetaMoney` [Getter]
- `getFeeAmountSchedule()` → `AmountSchedule` [Getter]
- `getFeePaymentDate()` → `RelativeDateOffset` [Getter]
- `getFeeRateSchedule()` → `Schedule` [Getter]

### ExerciseFeeScheduleBuilder
**Implements:** `ExerciseFeeSchedule` `PayerReceiver$PayerReceiverBuilder` 

**Key Methods:**
- `setReceiver(CounterpartyRoleEnum arg0)` → `ExerciseFeeScheduleBuilder` [Setter]
- `getOrCreateNotionalReference()` → `ReferenceWithMetaMoneyBuilder` [Getter]
- `getOrCreateFeeAmountSchedule()` → `AmountScheduleBuilder` [Getter]
- `getOrCreateFeeRateSchedule()` → `ScheduleBuilder` [Getter]
- `setFeeRateSchedule(Schedule arg0)` → `ExerciseFeeScheduleBuilder` [Setter]
- `getNotionalReference()` → `ReferenceWithMetaMoneyBuilder` [Getter]
- `getFeeAmountSchedule()` → `AmountScheduleBuilder` [Getter]
- `getFeePaymentDate()` → `RelativeDateOffsetBuilder` [Getter]
- `getOrCreateFeePaymentDate()` → `RelativeDateOffsetBuilder` [Getter]
- `setNotionalReference(ReferenceWithMetaMoney arg0)` → `ExerciseFeeScheduleBuilder` [Setter]

### ExerciseNotice
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `ExerciseNotice` [Builder]
- `getExerciseNoticeReceiver()` → `AncillaryRoleEnum` [Getter]
- `getExerciseNoticeGiver()` → `ExerciseNoticeGiverEnum` [Getter]
- `getBusinessCenter()` → `FieldWithMetaBusinessCenterEnum` [Getter]

### ExerciseNoticeBuilder
**Implements:** `ExerciseNotice` `RosettaModelObjectBuilder` 

**Key Methods:**
- `getOrCreateBusinessCenter()` → `FieldWithMetaBusinessCenterEnumBuilder` [Getter]
- `setBusinessCenterValue(BusinessCenterEnum arg0)` → `ExerciseNoticeBuilder` [Setter]
- `setBusinessCenter(FieldWithMetaBusinessCenterEnum arg0)` → `ExerciseNoticeBuilder` [Setter]
- `setExerciseNoticeReceiver(AncillaryRoleEnum arg0)` → `ExerciseNoticeBuilder` [Setter]
- `setExerciseNoticeGiver(ExerciseNoticeGiverEnum arg0)` → `ExerciseNoticeBuilder` [Setter]
- `getBusinessCenter()` → `FieldWithMetaBusinessCenterEnumBuilder` [Getter]

### ExercisePeriod
**Implements:** `RosettaModelObject` `GlobalKey` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `ExercisePeriod` [Builder]
- `getExerciseFrequency()` → `Period` [Getter]
- `getEarliestExerciseDateTenor()` → `Period` [Getter]
- `getMeta()` → `MetaFields` [Getter]

### ExercisePeriodBuilder
**Implements:** `ExercisePeriod` `RosettaModelObjectBuilder` `GlobalKey$GlobalKeyBuilder` 

**Key Methods:**
- `setExerciseFrequency(Period arg0)` → `ExercisePeriodBuilder` [Setter]
- `getExerciseFrequency()` → `PeriodBuilder` [Getter]
- `getOrCreateMeta()` → `MetaFieldsBuilder` [Getter]
- `getEarliestExerciseDateTenor()` → `PeriodBuilder` [Getter]
- `setEarliestExerciseDateTenor(Period arg0)` → `ExercisePeriodBuilder` [Setter]
- `getOrCreateExerciseFrequency()` → `PeriodBuilder` [Getter]
- `getOrCreateEarliestExerciseDateTenor()` → `PeriodBuilder` [Getter]
- `setMeta(MetaFields arg0)` → `ExercisePeriodBuilder` [Setter]
- `getMeta()` → `MetaFieldsBuilder` [Getter]

### ExerciseProcedure
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `ExerciseProcedure` [Builder]
- `getFollowUpConfirmation()` → `Boolean` [Getter]
- `getLimitedRightToConfirm()` → `Boolean` [Getter]
- `getManualExercise()` → `ManualExercise` [Getter]
- `getSplitTicket()` → `Boolean` [Getter]
- `getAutomaticExercise()` → `AutomaticExercise` [Getter]

### ExerciseProcedureBuilder
**Implements:** `ExerciseProcedure` `RosettaModelObjectBuilder` 

**Key Methods:**
- `getOrCreateAutomaticExercise()` → `AutomaticExerciseBuilder` [Getter]
- `getOrCreateManualExercise()` → `ManualExerciseBuilder` [Getter]
- `setManualExercise(ManualExercise arg0)` → `ExerciseProcedureBuilder` [Setter]
- `setFollowUpConfirmation(Boolean arg0)` → `ExerciseProcedureBuilder` [Setter]
- `setLimitedRightToConfirm(Boolean arg0)` → `ExerciseProcedureBuilder` [Setter]
- `setSplitTicket(Boolean arg0)` → `ExerciseProcedureBuilder` [Setter]
- `getManualExercise()` → `ManualExerciseBuilder` [Getter]
- `setAutomaticExercise(AutomaticExercise arg0)` → `ExerciseProcedureBuilder` [Setter]
- `getAutomaticExercise()` → `AutomaticExerciseBuilder` [Getter]

### ExerciseTerms
**Implements:** `RosettaModelObject` `GlobalKey` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `ExerciseTerms` [Builder]
- `getStyle()` → `OptionExerciseStyleEnum` [Getter]
- `getExpirationTimeType()` → `ExpirationTimeTypeEnum` [Getter]
- `getCommencementDate()` → `AdjustableOrRelativeDate` [Getter]
- `getLatestExerciseTime()` → `BusinessCenterTime` [Getter]
- `getExerciseFeeSchedule()` → `ExerciseFeeSchedule` [Getter]
- `getEarliestExerciseTime()` → `BusinessCenterTime` [Getter]
- `getMultipleExercise()` → `MultipleExercise` [Getter]
- `getExpirationTime()` → `BusinessCenterTime` [Getter]

### ExerciseTermsBuilder
**Implements:** `ExerciseTerms` `RosettaModelObjectBuilder` `GlobalKey$GlobalKeyBuilder` 

**Key Methods:**
- `setExpirationTime(BusinessCenterTime arg0)` → `ExerciseTermsBuilder` [Setter]
- `setStyle(OptionExerciseStyleEnum arg0)` → `ExerciseTermsBuilder` [Setter]
- `getCommencementDate()` → `AdjustableOrRelativeDateBuilder` [Getter]
- `getLatestExerciseTime()` → `BusinessCenterTimeBuilder` [Getter]
- `getExerciseFeeSchedule()` → `ExerciseFeeScheduleBuilder` [Getter]
- `getEarliestExerciseTime()` → `BusinessCenterTimeBuilder` [Getter]
- `getMultipleExercise()` → `MultipleExerciseBuilder` [Getter]
- `getExpirationTime()` → `BusinessCenterTimeBuilder` [Getter]
- `getExerciseFee()` → `ExerciseFeeBuilder` [Getter]
- `getRelevantUnderlyingDate()` → `AdjustableOrRelativeDatesBuilder` [Getter]

### ExtendibleProvision
**Implements:** `BuyerSeller` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `ExtendibleProvision` [Builder]
- `getSinglePartyOption()` → `PartyRole` [Getter]
- `getExerciseTerms()` → `ExerciseTerms` [Getter]
- `getFollowUpConfirmation()` → `Boolean` [Getter]
- `getExtensionTerm()` → `RelativeDateOffset` [Getter]
- `getExerciseNotice()` → `ExerciseNotice` [Getter]
- `getExtensionPeriod()` → `AdjustableRelativeOrPeriodicDates` [Getter]
- `getCallingParty()` → `CallingPartyEnum` [Getter]
- `getNoticeDeadlinePeriod()` → `RelativeDateOffset` [Getter]

### ExtendibleProvisionAdjustedDates
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `ExtendibleProvisionAdjustedDates` [Builder]
- `getExtensionEvent()` → `List` [Getter]

### ExtendibleProvisionAdjustedDatesBuilder
**Implements:** `ExtendibleProvisionAdjustedDates` `RosettaModelObjectBuilder` 

**Key Methods:**
- `setExtensionEvent(List arg0)` → `ExtendibleProvisionAdjustedDatesBuilder` [Setter]
- `getOrCreateExtensionEvent(int arg0)` → `ExtensionEventBuilder` [Getter]
- `getExtensionEvent()` → `List` [Getter]

### ExtendibleProvisionBuilder
**Implements:** `ExtendibleProvision` `BuyerSeller$BuyerSellerBuilder` 

**Key Methods:**
- `setExtensionPeriod(AdjustableRelativeOrPeriodicDates arg0)` → `ExtendibleProvisionBuilder` [Setter]
- `getOrCreateExtensionTerm()` → `RelativeDateOffsetBuilder` [Getter]
- `setExtensionTerm(RelativeDateOffset arg0)` → `ExtendibleProvisionBuilder` [Setter]
- `getOrCreateExtensionPeriod()` → `AdjustableRelativeOrPeriodicDatesBuilder` [Getter]
- `setExerciseTerms(ExerciseTerms arg0)` → `ExtendibleProvisionBuilder` [Setter]
- `getOrCreateExerciseTerms()` → `ExerciseTermsBuilder` [Getter]
- `getSinglePartyOption()` → `PartyRoleBuilder` [Getter]
- `getExerciseTerms()` → `ExerciseTermsBuilder` [Getter]
- `getExtensionTerm()` → `RelativeDateOffsetBuilder` [Getter]
- `getExerciseNotice()` → `ExerciseNoticeBuilder` [Getter]

### ExtensionEvent
**Implements:** `RosettaModelObject` `GlobalKey` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `ExtensionEvent` [Builder]
- `getAdjustedExtendedTerminationDate()` → `Date` [Getter]
- `getAdjustedExerciseDate()` → `Date` [Getter]
- `getMeta()` → `MetaFields` [Getter]

### ExtensionEventBuilder
**Implements:** `ExtensionEvent` `RosettaModelObjectBuilder` `GlobalKey$GlobalKeyBuilder` 

**Key Methods:**
- `getOrCreateMeta()` → `MetaFieldsBuilder` [Getter]
- `setAdjustedExtendedTerminationDate(Date arg0)` → `ExtensionEventBuilder` [Setter]
- `setAdjustedExerciseDate(Date arg0)` → `ExtensionEventBuilder` [Setter]
- `setMeta(MetaFields arg0)` → `ExtensionEventBuilder` [Setter]
- `getMeta()` → `MetaFieldsBuilder` [Getter]

### FixedPricePayout
**Implements:** `PayoutBase` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `FixedPricePayout` [Builder]
- `getSchedule()` → `CalculationSchedule` [Getter]
- `getFixedPrice()` → `FixedPrice` [Getter]
- `getPaymentDates()` → `PaymentDates` [Getter]

### FixedPricePayoutBuilder
**Implements:** `FixedPricePayout` `PayoutBase$PayoutBaseBuilder` 

**Key Methods:**
- `getSchedule()` → `CalculationScheduleBuilder` [Getter]
- `setSchedule(CalculationSchedule arg0)` → `FixedPricePayoutBuilder` [Setter]
- `setPrincipalPayment(PrincipalPayments arg0)` → `FixedPricePayoutBuilder` [Setter]
- `getOrCreateSchedule()` → `CalculationScheduleBuilder` [Getter]
- `setPayerReceiver(PayerReceiver arg0)` → `FixedPricePayoutBuilder` [Setter]
- `getFixedPrice()` → `FixedPriceBuilder` [Getter]
- `getOrCreateFixedPrice()` → `FixedPriceBuilder` [Getter]
- `setFixedPrice(FixedPrice arg0)` → `FixedPricePayoutBuilder` [Setter]
- `getPaymentDates()` → `PaymentDatesBuilder` [Getter]
- `setPaymentDates(PaymentDates arg0)` → `FixedPricePayoutBuilder` [Setter]

### FxFeature
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `FxFeature` [Builder]
- `getComposite()` → `Composite` [Getter]
- `getReferenceCurrency()` → `FieldWithMetaString` [Getter]
- `getCrossCurrency()` → `Composite` [Getter]
- `getQuanto()` → `Quanto` [Getter]

### FxFeatureBuilder
**Implements:** `FxFeature` `RosettaModelObjectBuilder` 

**Key Methods:**
- `getOrCreateComposite()` → `CompositeBuilder` [Getter]
- `getComposite()` → `CompositeBuilder` [Getter]
- `setComposite(Composite arg0)` → `FxFeatureBuilder` [Setter]
- `getOrCreateQuanto()` → `QuantoBuilder` [Getter]
- `getReferenceCurrency()` → `FieldWithMetaStringBuilder` [Getter]
- `getCrossCurrency()` → `CompositeBuilder` [Getter]
- `setCrossCurrency(Composite arg0)` → `FxFeatureBuilder` [Setter]
- `setReferenceCurrency(FieldWithMetaString arg0)` → `FxFeatureBuilder` [Setter]
- `setReferenceCurrencyValue(String arg0)` → `FxFeatureBuilder` [Setter]
- `getOrCreateCrossCurrency()` → `CompositeBuilder` [Getter]

### Knock
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `Knock` [Builder]
- `getKnockIn()` → `TriggerEvent` [Getter]
- `getKnockOut()` → `TriggerEvent` [Getter]

### KnockBuilder
**Implements:** `Knock` `RosettaModelObjectBuilder` 

**Key Methods:**
- `getKnockIn()` → `TriggerEventBuilder` [Getter]
- `getOrCreateKnockOut()` → `TriggerEventBuilder` [Getter]
- `setKnockOut(TriggerEvent arg0)` → `KnockBuilder` [Setter]
- `getOrCreateKnockIn()` → `TriggerEventBuilder` [Getter]
- `getKnockOut()` → `TriggerEventBuilder` [Getter]
- `setKnockIn(TriggerEvent arg0)` → `KnockBuilder` [Setter]

### MandatoryEarlyTermination
**Implements:** `RosettaModelObject` `GlobalKey` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `MandatoryEarlyTermination` [Builder]
- `getCalculationAgent()` → `CalculationAgent` [Getter]
- `getMandatoryEarlyTerminationDate()` → `AdjustableDate` [Getter]
- `getMandatoryEarlyTerminationAdjustedDates()` → `MandatoryEarlyTerminationAdjustedDates` [Getter]
- `getCashSettlement()` → `SettlementTerms` [Getter]
- `getMeta()` → `MetaFields` [Getter]

### MandatoryEarlyTerminationAdjustedDates
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `MandatoryEarlyTerminationAdjustedDates` [Builder]
- `getAdjustedEarlyTerminationDate()` → `Date` [Getter]
- `getAdjustedCashSettlementPaymentDate()` → `Date` [Getter]
- `getAdjustedCashSettlementValuationDate()` → `Date` [Getter]

### MandatoryEarlyTerminationAdjustedDatesBuilder
**Implements:** `MandatoryEarlyTerminationAdjustedDates` `RosettaModelObjectBuilder` 

**Key Methods:**
- `setAdjustedEarlyTerminationDate(Date arg0)` → `MandatoryEarlyTerminationAdjustedDatesBuilder` [Setter]
- `setAdjustedCashSettlementValuationDate(Date arg0)` → `MandatoryEarlyTerminationAdjustedDatesBuilder` [Setter]
- `setAdjustedCashSettlementPaymentDate(Date arg0)` → `MandatoryEarlyTerminationAdjustedDatesBuilder` [Setter]

### MandatoryEarlyTerminationBuilder
**Implements:** `MandatoryEarlyTermination` `RosettaModelObjectBuilder` `GlobalKey$GlobalKeyBuilder` 

**Key Methods:**
- `setCalculationAgent(CalculationAgent arg0)` → `MandatoryEarlyTerminationBuilder` [Setter]
- `getCalculationAgent()` → `CalculationAgentBuilder` [Getter]
- `getOrCreateMeta()` → `MetaFieldsBuilder` [Getter]
- `getMandatoryEarlyTerminationDate()` → `AdjustableDateBuilder` [Getter]
- `getMandatoryEarlyTerminationAdjustedDates()` → `MandatoryEarlyTerminationAdjustedDatesBuilder` [Getter]
- `getOrCreateMandatoryEarlyTerminationDate()` → `AdjustableDateBuilder` [Getter]
- `setMandatoryEarlyTerminationAdjustedDates(MandatoryEarlyTerminationAdjustedDates arg0)` → `MandatoryEarlyTerminationBuilder` [Setter]
- `setMandatoryEarlyTerminationDate(AdjustableDate arg0)` → `MandatoryEarlyTerminationBuilder` [Setter]
- `getCashSettlement()` → `SettlementTermsBuilder` [Getter]
- `getOrCreateCalculationAgent()` → `CalculationAgentBuilder` [Getter]

### ManualExercise
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `ManualExercise` [Builder]
- `getExerciseNotice()` → `ExerciseNotice` [Getter]
- `getFallbackExercise()` → `Boolean` [Getter]

### ManualExerciseBuilder
**Implements:** `ManualExercise` `RosettaModelObjectBuilder` 

**Key Methods:**
- `getExerciseNotice()` → `ExerciseNoticeBuilder` [Getter]
- `setExerciseNotice(ExerciseNotice arg0)` → `ManualExerciseBuilder` [Setter]
- `getOrCreateExerciseNotice()` → `ExerciseNoticeBuilder` [Getter]
- `setFallbackExercise(Boolean arg0)` → `ManualExerciseBuilder` [Setter]

### MultipleExercise
**Implements:** `PartialExercise` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `MultipleExercise` [Builder]
- `getMaximumNumberOfOptions()` → `Integer` [Getter]
- `getMaximumNotionalAmount()` → `BigDecimal` [Getter]

### MultipleExerciseBuilder
**Implements:** `MultipleExercise` `PartialExercise$PartialExerciseBuilder` 

**Key Methods:**
- `setMinimumNumberOfOptions(Integer arg0)` → `MultipleExerciseBuilder` [Setter]
- `setIntegralMultipleAmount(BigDecimal arg0)` → `MultipleExerciseBuilder` [Setter]
- `setMinimumNotionalAmount(BigDecimal arg0)` → `MultipleExerciseBuilder` [Setter]
- `setNotionaReference(ReferenceWithMetaMoney arg0)` → `MultipleExerciseBuilder` [Setter]
- `setNotionaReferenceValue(Money arg0)` → `MultipleExerciseBuilder` [Setter]
- `setMaximumNotionalAmount(BigDecimal arg0)` → `MultipleExerciseBuilder` [Setter]
- `setMaximumNumberOfOptions(Integer arg0)` → `MultipleExerciseBuilder` [Setter]

### NonTransferableProduct
**Implements:** `RosettaModelObject` `GlobalKey` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `NonTransferableProduct` [Builder]
- `getEconomicTerms()` → `EconomicTerms` [Getter]
- `getMeta()` → `MetaFields` [Getter]
- `getTaxonomy()` → `List` [Getter]
- `getIdentifier()` → `List` [Getter]

### NonTransferableProductBuilder
**Implements:** `NonTransferableProduct` `RosettaModelObjectBuilder` `GlobalKey$GlobalKeyBuilder` 

**Key Methods:**
- `setTaxonomy(List arg0)` → `NonTransferableProductBuilder` [Setter]
- `getOrCreateTaxonomy(int arg0)` → `ProductTaxonomyBuilder` [Getter]
- `setEconomicTerms(EconomicTerms arg0)` → `NonTransferableProductBuilder` [Setter]
- `getEconomicTerms()` → `EconomicTermsBuilder` [Getter]
- `getOrCreateIdentifier(int arg0)` → `ProductIdentifierBuilder` [Getter]
- `setIdentifier(List arg0)` → `NonTransferableProductBuilder` [Setter]
- `getOrCreateMeta()` → `MetaFieldsBuilder` [Getter]
- `getOrCreateEconomicTerms()` → `EconomicTermsBuilder` [Getter]
- `setMeta(MetaFields arg0)` → `NonTransferableProductBuilder` [Setter]
- `getMeta()` → `MetaFieldsBuilder` [Getter]

### OptionFeature
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `OptionFeature` [Builder]
- `getStrategyFeature()` → `StrategyFeature` [Getter]
- `getAveragingFeature()` → `AveragingCalculation` [Getter]
- `getFxFeature()` → `List` [Getter]
- `getPassThrough()` → `PassThrough` [Getter]
- `getBarrier()` → `Barrier` [Getter]
- `getKnock()` → `Knock` [Getter]

### OptionFeatureBuilder
**Implements:** `OptionFeature` `RosettaModelObjectBuilder` 

**Key Methods:**
- `setBarrier(Barrier arg0)` → `OptionFeatureBuilder` [Setter]
- `setKnock(Knock arg0)` → `OptionFeatureBuilder` [Setter]
- `getStrategyFeature()` → `StrategyFeatureBuilder` [Getter]
- `getAveragingFeature()` → `AveragingCalculationBuilder` [Getter]
- `getFxFeature()` → `List` [Getter]
- `getPassThrough()` → `PassThroughBuilder` [Getter]
- `getOrCreateBarrier()` → `BarrierBuilder` [Getter]
- `getOrCreateStrategyFeature()` → `StrategyFeatureBuilder` [Getter]
- `getOrCreateAveragingFeature()` → `AveragingCalculationBuilder` [Getter]
- `setFxFeature(List arg0)` → `OptionFeatureBuilder` [Setter]

### OptionPayout
**Implements:** `PayoutBase` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `OptionPayout` [Builder]
- `getStrike()` → `OptionStrike` [Getter]
- `getUnderlier()` → `Underlier` [Getter]
- `getSchedule()` → `CalculationSchedule` [Getter]
- `getDelivery()` → `AssetDeliveryInformation` [Getter]
- `getBuyerSeller()` → `BuyerSeller` [Getter]
- `getExerciseTerms()` → `ExerciseTerms` [Getter]
- `getFeature()` → `OptionFeature` [Getter]
- `getObservationTerms()` → `ObservationTerms` [Getter]

### OptionPayoutBuilder
**Implements:** `OptionPayout` `PayoutBase$PayoutBaseBuilder` 

**Key Methods:**
- `getOrCreateObservationTerms()` → `ObservationTermsBuilder` [Getter]
- `getStrike()` → `OptionStrikeBuilder` [Getter]
- `setStrike(OptionStrike arg0)` → `OptionPayoutBuilder` [Setter]
- `getOrCreateUnderlier()` → `UnderlierBuilder` [Getter]
- `getUnderlier()` → `UnderlierBuilder` [Getter]
- `setUnderlier(Underlier arg0)` → `OptionPayoutBuilder` [Setter]
- `getOrCreateBuyerSeller()` → `BuyerSellerBuilder` [Getter]
- `getSchedule()` → `CalculationScheduleBuilder` [Getter]
- `setDelivery(AssetDeliveryInformation arg0)` → `OptionPayoutBuilder` [Setter]
- `setExerciseTerms(ExerciseTerms arg0)` → `OptionPayoutBuilder` [Setter]

### OptionStrike
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `OptionStrike` [Builder]
- `getStrikeReference()` → `ReferenceWithMetaFixedRateSpecification` [Getter]
- `getAveragingStrikeFeature()` → `AveragingStrikeFeature` [Getter]
- `getStrikePrice()` → `Price` [Getter]
- `getReferenceSwapCurve()` → `ReferenceSwapCurve` [Getter]

### OptionStrikeBuilder
**Implements:** `OptionStrike` `RosettaModelObjectBuilder` 

**Key Methods:**
- `getStrikeReference()` → `ReferenceWithMetaFixedRateSpecificationBuilder` [Getter]
- `getAveragingStrikeFeature()` → `AveragingStrikeFeatureBuilder` [Getter]
- `getStrikePrice()` → `PriceBuilder` [Getter]
- `getReferenceSwapCurve()` → `ReferenceSwapCurveBuilder` [Getter]
- `getOrCreateReferenceSwapCurve()` → `ReferenceSwapCurveBuilder` [Getter]
- `getOrCreateAveragingStrikeFeature()` → `AveragingStrikeFeatureBuilder` [Getter]
- `setStrikePrice(Price arg0)` → `OptionStrikeBuilder` [Setter]
- `setReferenceSwapCurve(ReferenceSwapCurve arg0)` → `OptionStrikeBuilder` [Setter]
- `getOrCreateStrikeReference()` → `ReferenceWithMetaFixedRateSpecificationBuilder` [Getter]
- `setStrikeReference(ReferenceWithMetaFixedRateSpecification arg0)` → `OptionStrikeBuilder` [Setter]

### OptionalEarlyTermination
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `OptionalEarlyTermination` [Builder]
- `getCalculationAgent()` → `CalculationAgent` [Getter]
- `getSinglePartyOption()` → `BuyerSeller` [Getter]
- `getExerciseTerms()` → `ExerciseTerms` [Getter]
- `getFollowUpConfirmation()` → `Boolean` [Getter]
- `getExerciseNotice()` → `List` [Getter]
- `getOptionalEarlyTerminationAdjustedDates()` → `OptionalEarlyTerminationAdjustedDates` [Getter]
- `getCashSettlement()` → `SettlementTerms` [Getter]
- `getMutualEarlyTermination()` → `Boolean` [Getter]

### OptionalEarlyTerminationAdjustedDates
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `OptionalEarlyTerminationAdjustedDates` [Builder]
- `getEarlyTerminationEvent()` → `List` [Getter]

### OptionalEarlyTerminationAdjustedDatesBuilder
**Implements:** `OptionalEarlyTerminationAdjustedDates` `RosettaModelObjectBuilder` 

**Key Methods:**
- `getOrCreateEarlyTerminationEvent(int arg0)` → `EarlyTerminationEventBuilder` [Getter]
- `setEarlyTerminationEvent(List arg0)` → `OptionalEarlyTerminationAdjustedDatesBuilder` [Setter]
- `getEarlyTerminationEvent()` → `List` [Getter]

### OptionalEarlyTerminationBuilder
**Implements:** `OptionalEarlyTermination` `RosettaModelObjectBuilder` 

**Key Methods:**
- `setCalculationAgent(CalculationAgent arg0)` → `OptionalEarlyTerminationBuilder` [Setter]
- `getCalculationAgent()` → `CalculationAgentBuilder` [Getter]
- `setExerciseTerms(ExerciseTerms arg0)` → `OptionalEarlyTerminationBuilder` [Setter]
- `getOrCreateExerciseTerms()` → `ExerciseTermsBuilder` [Getter]
- `getSinglePartyOption()` → `BuyerSellerBuilder` [Getter]
- `getExerciseTerms()` → `ExerciseTermsBuilder` [Getter]
- `getExerciseNotice()` → `List` [Getter]
- `getOptionalEarlyTerminationAdjustedDates()` → `OptionalEarlyTerminationAdjustedDatesBuilder` [Getter]
- `getOrCreateSinglePartyOption()` → `BuyerSellerBuilder` [Getter]
- `setOptionalEarlyTerminationAdjustedDates(OptionalEarlyTerminationAdjustedDates arg0)` → `OptionalEarlyTerminationBuilder` [Setter]

### PartialExercise
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `PartialExercise` [Builder]
- `getNotionaReference()` → `ReferenceWithMetaMoney` [Getter]
- `getIntegralMultipleAmount()` → `BigDecimal` [Getter]
- `getMinimumNotionalAmount()` → `BigDecimal` [Getter]
- `getMinimumNumberOfOptions()` → `Integer` [Getter]

### PartialExerciseBuilder
**Implements:** `PartialExercise` `RosettaModelObjectBuilder` 

**Key Methods:**
- `getOrCreateNotionaReference()` → `ReferenceWithMetaMoneyBuilder` [Getter]
- `getNotionaReference()` → `ReferenceWithMetaMoneyBuilder` [Getter]
- `setMinimumNumberOfOptions(Integer arg0)` → `PartialExerciseBuilder` [Setter]
- `setIntegralMultipleAmount(BigDecimal arg0)` → `PartialExerciseBuilder` [Setter]
- `setMinimumNotionalAmount(BigDecimal arg0)` → `PartialExerciseBuilder` [Setter]
- `setNotionaReference(ReferenceWithMetaMoney arg0)` → `PartialExerciseBuilder` [Setter]
- `setNotionaReferenceValue(Money arg0)` → `PartialExerciseBuilder` [Setter]

### PassThrough
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `PassThrough` [Builder]
- `getPassThroughItem()` → `List` [Getter]

### PassThroughBuilder
**Implements:** `PassThrough` `RosettaModelObjectBuilder` 

**Key Methods:**
- `getPassThroughItem()` → `List` [Getter]
- `setPassThroughItem(List arg0)` → `PassThroughBuilder` [Setter]
- `getOrCreatePassThroughItem(int arg0)` → `PassThroughItemBuilder` [Getter]

### PassThroughItem
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `PassThroughItem` [Builder]
- `getPayerReceiver()` → `PayerReceiver` [Getter]
- `getPassThroughPercentage()` → `BigDecimal` [Getter]

### PassThroughItemBuilder
**Implements:** `PassThroughItem` `RosettaModelObjectBuilder` 

**Key Methods:**
- `getPayerReceiver()` → `PayerReceiverBuilder` [Getter]
- `getOrCreatePayerReceiver()` → `PayerReceiverBuilder` [Getter]
- `setPayerReceiver(PayerReceiver arg0)` → `PassThroughItemBuilder` [Setter]
- `setPassThroughPercentage(BigDecimal arg0)` → `PassThroughItemBuilder` [Setter]

### Payout
**Implements:** `RosettaModelObject` `GlobalKey` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `Payout` [Builder]
- `getCreditDefaultPayout()` → `CreditDefaultPayout` [Getter]
- `getInterestRatePayout()` → `InterestRatePayout` [Getter]
- `getMeta()` → `MetaFields` [Getter]
- `getCommodityPayout()` → `CommodityPayout` [Getter]
- `getPerformancePayout()` → `PerformancePayout` [Getter]
- `getSettlementPayout()` → `SettlementPayout` [Getter]
- `getAssetPayout()` → `AssetPayout` [Getter]
- `getFixedPricePayout()` → `FixedPricePayout` [Getter]

### PayoutBuilder
**Implements:** `Payout` `RosettaModelObjectBuilder` `GlobalKey$GlobalKeyBuilder` 

**Key Methods:**
- `getCreditDefaultPayout()` → `CreditDefaultPayoutBuilder` [Getter]
- `setAssetPayout(AssetPayout arg0)` → `PayoutBuilder` [Setter]
- `setCommodityPayout(CommodityPayout arg0)` → `PayoutBuilder` [Setter]
- `setOptionPayout(OptionPayout arg0)` → `PayoutBuilder` [Setter]
- `setCreditDefaultPayout(CreditDefaultPayout arg0)` → `PayoutBuilder` [Setter]
- `setSettlementPayout(SettlementPayout arg0)` → `PayoutBuilder` [Setter]
- `setFixedPricePayout(FixedPricePayout arg0)` → `PayoutBuilder` [Setter]
- `getOrCreateAssetPayout()` → `AssetPayoutBuilder` [Getter]
- `getOrCreateCommodityPayout()` → `CommodityPayoutBuilder` [Getter]
- `getOrCreateOptionPayout()` → `OptionPayoutBuilder` [Getter]

### PerformancePayout
**Implements:** `PayoutBase` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `PerformancePayout` [Builder]
- `getInterimValuationPrice()` → `List` [Getter]
- `getPortfolioReturnTerms()` → `List` [Getter]
- `getFinalValuationPrice()` → `List` [Getter]
- `getInitialValuationPrice()` → `List` [Getter]
- `getUnderlier()` → `Underlier` [Getter]
- `getFxFeature()` → `List` [Getter]
- `getReturnTerms()` → `ReturnTerms` [Getter]
- `getObservationTerms()` → `ObservationTerms` [Getter]

### PerformancePayoutBuilder
**Implements:** `PerformancePayout` `PayoutBase$PayoutBaseBuilder` 

**Key Methods:**
- `getOrCreateObservationTerms()` → `ObservationTermsBuilder` [Getter]
- `getInterimValuationPrice()` → `List` [Getter]
- `getPortfolioReturnTerms()` → `List` [Getter]
- `getFinalValuationPrice()` → `List` [Getter]
- `getInitialValuationPrice()` → `List` [Getter]
- `getOrCreateUnderlier()` → `UnderlierBuilder` [Getter]
- `getUnderlier()` → `UnderlierBuilder` [Getter]
- `setUnderlier(Underlier arg0)` → `PerformancePayoutBuilder` [Setter]
- `setObservationTerms(ObservationTerms arg0)` → `PerformancePayoutBuilder` [Setter]
- `setPrincipalPayment(PrincipalPayments arg0)` → `PerformancePayoutBuilder` [Setter]

### PortfolioReturnTerms
**Implements:** `ReturnTerms` `GlobalKey` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `PortfolioReturnTerms` [Builder]
- `getInterimValuationPrice()` → `List` [Getter]
- `getFinalValuationPrice()` → `List` [Getter]
- `getInitialValuationPrice()` → `List` [Getter]
- `getUnderlier()` → `ReferenceWithMetaObservable` [Getter]
- `getPayerReceiver()` → `PayerReceiver` [Getter]
- `getQuantity()` → `ReferenceWithMetaNonNegativeQuantitySchedule` [Getter]
- `getMeta()` → `MetaFields` [Getter]

### PortfolioReturnTermsBuilder
**Implements:** `PortfolioReturnTerms` `ReturnTerms$ReturnTermsBuilder` `GlobalKey$GlobalKeyBuilder` 

**Key Methods:**
- `getInterimValuationPrice()` → `List` [Getter]
- `getFinalValuationPrice()` → `List` [Getter]
- `getInitialValuationPrice()` → `List` [Getter]
- `getOrCreateUnderlier()` → `ReferenceWithMetaObservableBuilder` [Getter]
- `getUnderlier()` → `ReferenceWithMetaObservableBuilder` [Getter]
- `setUnderlier(ReferenceWithMetaObservable arg0)` → `PortfolioReturnTermsBuilder` [Setter]
- `getPayerReceiver()` → `PayerReceiverBuilder` [Getter]
- `getQuantity()` → `ReferenceWithMetaNonNegativeQuantityScheduleBuilder` [Getter]
- `getOrCreateQuantity()` → `ReferenceWithMetaNonNegativeQuantityScheduleBuilder` [Getter]
- `getOrCreatePayerReceiver()` → `PayerReceiverBuilder` [Getter]

### Product
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `Product` [Builder]
- `getTransferableProduct()` → `TransferableProduct` [Getter]
- `getNonTransferableProduct()` → `NonTransferableProduct` [Getter]

### ProductBuilder
**Implements:** `Product` `RosettaModelObjectBuilder` 

**Key Methods:**
- `setTransferableProduct(TransferableProduct arg0)` → `ProductBuilder` [Setter]
- `setNonTransferableProduct(NonTransferableProduct arg0)` → `ProductBuilder` [Setter]
- `getTransferableProduct()` → `TransferableProductBuilder` [Getter]
- `getNonTransferableProduct()` → `NonTransferableProductBuilder` [Getter]
- `getOrCreateNonTransferableProduct()` → `NonTransferableProductBuilder` [Getter]
- `getOrCreateTransferableProduct()` → `TransferableProductBuilder` [Getter]

### Quanto
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `Quanto` [Builder]
- `getFxRate()` → `List` [Getter]
- `getFxSpotRateSource()` → `FxSpotRateSource` [Getter]
- `getFixingTime()` → `BusinessCenterTime` [Getter]

### QuantoBuilder
**Implements:** `Quanto` `RosettaModelObjectBuilder` 

**Key Methods:**
- `getOrCreateFxSpotRateSource()` → `FxSpotRateSourceBuilder` [Getter]
- `setFxRate(List arg0)` → `QuantoBuilder` [Setter]
- `getFxRate()` → `List` [Getter]
- `getFxSpotRateSource()` → `FxSpotRateSourceBuilder` [Getter]
- `setFixingTime(BusinessCenterTime arg0)` → `QuantoBuilder` [Setter]
- `getFixingTime()` → `BusinessCenterTimeBuilder` [Getter]
- `getOrCreateFxRate(int arg0)` → `FxRateBuilder` [Getter]
- `setFxSpotRateSource(FxSpotRateSource arg0)` → `QuantoBuilder` [Setter]
- `getOrCreateFixingTime()` → `BusinessCenterTimeBuilder` [Getter]

### ReturnTerms
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `ReturnTerms` [Builder]
- `getCorrelationReturnTerms()` → `CorrelationReturnTerms` [Getter]
- `getVarianceReturnTerms()` → `VarianceReturnTerms` [Getter]
- `getVolatilityReturnTerms()` → `VolatilityReturnTerms` [Getter]
- `getDividendReturnTerms()` → `DividendReturnTerms` [Getter]
- `getPriceReturnTerms()` → `PriceReturnTerms` [Getter]

### ReturnTermsBuilder
**Implements:** `ReturnTerms` `RosettaModelObjectBuilder` 

**Key Methods:**
- `getCorrelationReturnTerms()` → `CorrelationReturnTermsBuilder` [Getter]
- `getVarianceReturnTerms()` → `VarianceReturnTermsBuilder` [Getter]
- `getVolatilityReturnTerms()` → `VolatilityReturnTermsBuilder` [Getter]
- `getDividendReturnTerms()` → `DividendReturnTermsBuilder` [Getter]
- `getPriceReturnTerms()` → `PriceReturnTermsBuilder` [Getter]
- `setVarianceReturnTerms(VarianceReturnTerms arg0)` → `ReturnTermsBuilder` [Setter]
- `setVolatilityReturnTerms(VolatilityReturnTerms arg0)` → `ReturnTermsBuilder` [Setter]
- `setDividendReturnTerms(DividendReturnTerms arg0)` → `ReturnTermsBuilder` [Setter]
- `setPriceReturnTerms(PriceReturnTerms arg0)` → `ReturnTermsBuilder` [Setter]
- `setCorrelationReturnTerms(CorrelationReturnTerms arg0)` → `ReturnTermsBuilder` [Setter]

### SchedulePeriod
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `SchedulePeriod` [Builder]
- `getCalculationPeriod()` → `DateRange` [Getter]
- `getDeliveryPeriod()` → `CalculationScheduleDeliveryPeriods` [Getter]
- `getFixingPeriod()` → `DateRange` [Getter]
- `getPaymentDate()` → `Date` [Getter]

### SchedulePeriodBuilder
**Implements:** `SchedulePeriod` `RosettaModelObjectBuilder` 

**Key Methods:**
- `setCalculationPeriod(DateRange arg0)` → `SchedulePeriodBuilder` [Setter]
- `getCalculationPeriod()` → `DateRangeBuilder` [Getter]
- `getDeliveryPeriod()` → `CalculationScheduleDeliveryPeriodsBuilder` [Getter]
- `getFixingPeriod()` → `DateRangeBuilder` [Getter]
- `setDeliveryPeriod(CalculationScheduleDeliveryPeriods arg0)` → `SchedulePeriodBuilder` [Setter]
- `getOrCreateDeliveryPeriod()` → `CalculationScheduleDeliveryPeriodsBuilder` [Getter]
- `getOrCreateFixingPeriod()` → `DateRangeBuilder` [Getter]
- `setFixingPeriod(DateRange arg0)` → `SchedulePeriodBuilder` [Setter]
- `setPaymentDate(Date arg0)` → `SchedulePeriodBuilder` [Setter]
- `getOrCreateCalculationPeriod()` → `DateRangeBuilder` [Getter]

### SettlementPayout
**Implements:** `PayoutBase` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `SettlementPayout` [Builder]
- `getUnderlier()` → `Underlier` [Getter]
- `getSchedule()` → `CalculationSchedule` [Getter]
- `getDelivery()` → `AssetDeliveryInformation` [Getter]
- `getDeliveryTerm()` → `String` [Getter]

### SettlementPayoutBuilder
**Implements:** `SettlementPayout` `PayoutBase$PayoutBaseBuilder` 

**Key Methods:**
- `getOrCreateUnderlier()` → `UnderlierBuilder` [Getter]
- `getUnderlier()` → `UnderlierBuilder` [Getter]
- `setUnderlier(Underlier arg0)` → `SettlementPayoutBuilder` [Setter]
- `getSchedule()` → `CalculationScheduleBuilder` [Getter]
- `setDelivery(AssetDeliveryInformation arg0)` → `SettlementPayoutBuilder` [Setter]
- `getDelivery()` → `AssetDeliveryInformationBuilder` [Getter]
- `setSchedule(CalculationSchedule arg0)` → `SettlementPayoutBuilder` [Setter]
- `setPrincipalPayment(PrincipalPayments arg0)` → `SettlementPayoutBuilder` [Setter]
- `getOrCreateSchedule()` → `CalculationScheduleBuilder` [Getter]
- `getOrCreateDelivery()` → `AssetDeliveryInformationBuilder` [Getter]

### StrategyFeature
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `StrategyFeature` [Builder]
- `getStrikeSpread()` → `StrikeSpread` [Getter]
- `getCalendarSpread()` → `CalendarSpread` [Getter]

### StrategyFeatureBuilder
**Implements:** `StrategyFeature` `RosettaModelObjectBuilder` 

**Key Methods:**
- `getStrikeSpread()` → `StrikeSpreadBuilder` [Getter]
- `getCalendarSpread()` → `CalendarSpreadBuilder` [Getter]
- `setStrikeSpread(StrikeSpread arg0)` → `StrategyFeatureBuilder` [Setter]
- `getOrCreateCalendarSpread()` → `CalendarSpreadBuilder` [Getter]
- `setCalendarSpread(CalendarSpread arg0)` → `StrategyFeatureBuilder` [Setter]
- `getOrCreateStrikeSpread()` → `StrikeSpreadBuilder` [Getter]

### Strike
**Implements:** `RosettaModelObject` `GlobalKey` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `Strike` [Builder]
- `getSeller()` → `PayerReceiverEnum` [Getter]
- `getBuyer()` → `PayerReceiverEnum` [Getter]
- `getStrikeRate()` → `BigDecimal` [Getter]
- `getMeta()` → `MetaFields` [Getter]

### StrikeBuilder
**Implements:** `Strike` `RosettaModelObjectBuilder` `GlobalKey$GlobalKeyBuilder` 

**Key Methods:**
- `getOrCreateMeta()` → `MetaFieldsBuilder` [Getter]
- `setStrikeRate(BigDecimal arg0)` → `StrikeBuilder` [Setter]
- `setSeller(PayerReceiverEnum arg0)` → `StrikeBuilder` [Setter]
- `setBuyer(PayerReceiverEnum arg0)` → `StrikeBuilder` [Setter]
- `setMeta(MetaFields arg0)` → `StrikeBuilder` [Setter]
- `getMeta()` → `MetaFieldsBuilder` [Getter]

### StrikeSchedule
**Implements:** `RateSchedule` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `StrikeSchedule` [Builder]
- `getSeller()` → `PayerReceiverEnum` [Getter]
- `getBuyer()` → `PayerReceiverEnum` [Getter]

### StrikeScheduleBuilder
**Implements:** `StrikeSchedule` `RateSchedule$RateScheduleBuilder` 

**Key Methods:**
- `setPriceValue(PriceSchedule arg0)` → `StrikeScheduleBuilder` [Setter]
- `setPrice(ReferenceWithMetaPriceSchedule arg0)` → `StrikeScheduleBuilder` [Setter]
- `setSeller(PayerReceiverEnum arg0)` → `StrikeScheduleBuilder` [Setter]
- `setBuyer(PayerReceiverEnum arg0)` → `StrikeScheduleBuilder` [Setter]

### StrikeSpread
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `StrikeSpread` [Builder]
- `getUpperStrikeNumberOfOptions()` → `BigDecimal` [Getter]
- `getUpperStrike()` → `OptionStrike` [Getter]

### StrikeSpreadBuilder
**Implements:** `StrikeSpread` `RosettaModelObjectBuilder` 

**Key Methods:**
- `setUpperStrikeNumberOfOptions(BigDecimal arg0)` → `StrikeSpreadBuilder` [Setter]
- `getUpperStrike()` → `OptionStrikeBuilder` [Getter]
- `setUpperStrike(OptionStrike arg0)` → `StrikeSpreadBuilder` [Setter]
- `getOrCreateUpperStrike()` → `OptionStrikeBuilder` [Getter]

### TerminationProvision
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `TerminationProvision` [Builder]
- `getEvergreenProvision()` → `EvergreenProvision` [Getter]
- `getExtendibleProvision()` → `ExtendibleProvision` [Getter]
- `getCancelableProvision()` → `CancelableProvision` [Getter]
- `getEarlyTerminationProvision()` → `EarlyTerminationProvision` [Getter]

### TerminationProvisionBuilder
**Implements:** `TerminationProvision` `RosettaModelObjectBuilder` 

**Key Methods:**
- `setCancelableProvision(CancelableProvision arg0)` → `TerminationProvisionBuilder` [Setter]
- `getEvergreenProvision()` → `EvergreenProvisionBuilder` [Getter]
- `setExtendibleProvision(ExtendibleProvision arg0)` → `TerminationProvisionBuilder` [Setter]
- `setEvergreenProvision(EvergreenProvision arg0)` → `TerminationProvisionBuilder` [Setter]
- `getExtendibleProvision()` → `ExtendibleProvisionBuilder` [Getter]
- `getCancelableProvision()` → `CancelableProvisionBuilder` [Getter]
- `getOrCreateEarlyTerminationProvision()` → `EarlyTerminationProvisionBuilder` [Getter]
- `getOrCreateCancelableProvision()` → `CancelableProvisionBuilder` [Getter]
- `setEarlyTerminationProvision(EarlyTerminationProvision arg0)` → `TerminationProvisionBuilder` [Setter]
- `getOrCreateExtendibleProvision()` → `ExtendibleProvisionBuilder` [Getter]

### TradableProduct
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `TradableProduct` [Builder]
- `getCounterparty()` → `List` [Getter]
- `getAncillaryParty()` → `List` [Getter]
- `getTradeLot()` → `List` [Getter]
- `getAdjustment()` → `NotionalAdjustmentEnum` [Getter]
- `getProduct()` → `NonTransferableProduct` [Getter]

### TradableProductBuilder
**Implements:** `TradableProduct` `RosettaModelObjectBuilder` 

**Key Methods:**
- `getOrCreateAncillaryParty(int arg0)` → `AncillaryPartyBuilder` [Getter]
- `setCounterparty(List arg0)` → `TradableProductBuilder` [Setter]
- `getOrCreateCounterparty(int arg0)` → `CounterpartyBuilder` [Getter]
- `setAncillaryParty(List arg0)` → `TradableProductBuilder` [Setter]
- `setAdjustment(NotionalAdjustmentEnum arg0)` → `TradableProductBuilder` [Setter]
- `setTradeLot(List arg0)` → `TradableProductBuilder` [Setter]
- `getOrCreateTradeLot(int arg0)` → `TradeLotBuilder` [Getter]
- `getOrCreateProduct()` → `NonTransferableProductBuilder` [Getter]
- `setProduct(NonTransferableProduct arg0)` → `TradableProductBuilder` [Setter]
- `getCounterparty()` → `List` [Getter]

### TradeLot
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `TradeLot` [Builder]
- `getLotIdentifier()` → `List` [Getter]
- `getPriceQuantity()` → `List` [Getter]

### TradeLotBuilder
**Implements:** `TradeLot` `RosettaModelObjectBuilder` 

**Key Methods:**
- `getOrCreateLotIdentifier(int arg0)` → `IdentifierBuilder` [Getter]
- `setLotIdentifier(List arg0)` → `TradeLotBuilder` [Setter]
- `getLotIdentifier()` → `List` [Getter]
- `getPriceQuantity()` → `List` [Getter]
- `getOrCreatePriceQuantity(int arg0)` → `PriceQuantityBuilder` [Getter]
- `setPriceQuantity(List arg0)` → `TradeLotBuilder` [Setter]

### TransferableProduct
**Implements:** `Asset` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `TransferableProduct` [Builder]
- `getEconomicTerms()` → `EconomicTerms` [Getter]

### TransferableProductBuilder
**Implements:** `TransferableProduct` `Asset$AssetBuilder` 

**Key Methods:**
- `setDigitalAsset(DigitalAsset arg0)` → `TransferableProductBuilder` [Setter]
- `setInstrument(Instrument arg0)` → `TransferableProductBuilder` [Setter]
- `setCommodity(Commodity arg0)` → `TransferableProductBuilder` [Setter]
- `setEconomicTerms(EconomicTerms arg0)` → `TransferableProductBuilder` [Setter]
- `getEconomicTerms()` → `EconomicTermsBuilder` [Getter]
- `getOrCreateEconomicTerms()` → `EconomicTermsBuilder` [Getter]
- `setCash(Cash arg0)` → `TransferableProductBuilder` [Setter]

### Underlier
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `Underlier` [Builder]
- `getObservable()` → `ReferenceWithMetaObservable` [Getter]
- `getProduct()` → `Product` [Getter]

### UnderlierBuilder
**Implements:** `Underlier` `RosettaModelObjectBuilder` 

**Key Methods:**
- `getOrCreateObservable()` → `ReferenceWithMetaObservableBuilder` [Getter]
- `getObservable()` → `ReferenceWithMetaObservableBuilder` [Getter]
- `setObservable(ReferenceWithMetaObservable arg0)` → `UnderlierBuilder` [Setter]
- `setObservableValue(Observable arg0)` → `UnderlierBuilder` [Setter]
- `getOrCreateProduct()` → `ProductBuilder` [Getter]
- `setProduct(Product arg0)` → `UnderlierBuilder` [Setter]
- `getProduct()` → `ProductBuilder` [Getter]

## Concrete Classes

### AsianBuilderImpl
**Implements:** `Asian$AsianBuilder` 

**Fields:**
- `AveragingInOutEnum averagingInOut`
- `BigDecimal strikeFactor`
- `AveragingPeriodBuilder averagingPeriodIn`
- `AveragingPeriodBuilder averagingPeriodOut`

**Key Methods:**
- `build()` → `Asian` [Builder]
- `getOrCreateAveragingPeriodIn()` → `AveragingPeriodBuilder` [Getter]
- `getOrCreateAveragingPeriodOut()` → `AveragingPeriodBuilder` [Getter]
- `getStrikeFactor()` → `BigDecimal` [Getter]
- `setAveragingPeriodIn(AveragingPeriod arg0)` → `AsianBuilder` [Setter]
- `getAveragingPeriodOut()` → `AveragingPeriodBuilder` [Getter]
- `setAveragingInOut(AveragingInOutEnum arg0)` → `AsianBuilder` [Setter]
- `getAveragingInOut()` → `AveragingInOutEnum` [Getter]
- `getAveragingPeriodIn()` → `AveragingPeriodBuilder` [Getter]
- `setAveragingPeriodOut(AveragingPeriod arg0)` → `AsianBuilder` [Setter]

### AsianImpl
**Implements:** `Asian` 

**Key Methods:**
- `build()` → `Asian` [Builder]
- `setBuilderFields(AsianBuilder arg0)` → `void` [Setter]
- `getStrikeFactor()` → `BigDecimal` [Getter]
- `getAveragingPeriodOut()` → `AveragingPeriod` [Getter]
- `getAveragingInOut()` → `AveragingInOutEnum` [Getter]
- `getAveragingPeriodIn()` → `AveragingPeriod` [Getter]

### AssetLegBuilderImpl
**Implements:** `AssetLeg$AssetLegBuilder` 

**Fields:**
- `AdjustableOrRelativeDateBuilder settlementDate`
- `DeliveryMethodEnum deliveryMethod`

**Key Methods:**
- `build()` → `AssetLeg` [Builder]
- `getSettlementDate()` → `AdjustableOrRelativeDateBuilder` [Getter]
- `getOrCreateSettlementDate()` → `AdjustableOrRelativeDateBuilder` [Getter]
- `setSettlementDate(AdjustableOrRelativeDate arg0)` → `AssetLegBuilder` [Setter]
- `setDeliveryMethod(DeliveryMethodEnum arg0)` → `AssetLegBuilder` [Setter]
- `getDeliveryMethod()` → `DeliveryMethodEnum` [Getter]

### AssetLegImpl
**Implements:** `AssetLeg` 

**Key Methods:**
- `build()` → `AssetLeg` [Builder]
- `getSettlementDate()` → `AdjustableOrRelativeDate` [Getter]
- `setBuilderFields(AssetLegBuilder arg0)` → `void` [Setter]
- `getDeliveryMethod()` → `DeliveryMethodEnum` [Getter]

### AssetPayoutBuilderImpl
**Extends:** `PayoutBase$PayoutBaseBuilderImpl` 
**Implements:** `AssetPayout$AssetPayoutBuilder` 

**Fields:**
- `List (List) assetLeg`
- `AssetBuilder underlier`
- `MoneyBuilder minimumFee`
- `DividendTermsBuilder dividendTerms`
- `AssetPayoutTradeTypeEnum tradeType`

**Key Methods:**
- `build()` → `AssetPayout` [Builder]
- `getDividendTerms()` → `DividendTermsBuilder` [Getter]
- `getAssetLeg()` → `List` [Getter]
- `getTradeType()` → `AssetPayoutTradeTypeEnum` [Getter]
- `getOrCreateUnderlier()` → `AssetBuilder` [Getter]
- `getUnderlier()` → `AssetBuilder` [Getter]
- `setUnderlier(Asset arg0)` → `AssetPayoutBuilder` [Setter]
- `setPrincipalPayment(PrincipalPayments arg0)` → `AssetPayoutBuilder` [Setter]
- `setPayerReceiver(PayerReceiver arg0)` → `AssetPayoutBuilder` [Setter]
- `getMinimumFee()` → `MoneyBuilder` [Getter]

### AssetPayoutImpl
**Extends:** `PayoutBase$PayoutBaseImpl` 
**Implements:** `AssetPayout` 

**Key Methods:**
- `build()` → `AssetPayout` [Builder]
- `getDividendTerms()` → `DividendTerms` [Getter]
- `getAssetLeg()` → `List` [Getter]
- `getTradeType()` → `AssetPayoutTradeTypeEnum` [Getter]
- `getUnderlier()` → `Asset` [Getter]
- `getMinimumFee()` → `Money` [Getter]
- `setBuilderFields(AssetPayoutBuilder arg0)` → `void` [Setter]

### AutomaticExerciseBuilderImpl
**Implements:** `AutomaticExercise$AutomaticExerciseBuilder` 

**Fields:**
- `BigDecimal thresholdRate`
- `Boolean isApplicable`

**Key Methods:**
- `build()` → `AutomaticExercise` [Builder]
- `getIsApplicable()` → `Boolean` [Getter]
- `setIsApplicable(Boolean arg0)` → `AutomaticExerciseBuilder` [Setter]
- `getThresholdRate()` → `BigDecimal` [Getter]
- `setThresholdRate(BigDecimal arg0)` → `AutomaticExerciseBuilder` [Setter]

### AutomaticExerciseImpl
**Implements:** `AutomaticExercise` 

**Key Methods:**
- `build()` → `AutomaticExercise` [Builder]
- `getIsApplicable()` → `Boolean` [Getter]
- `setBuilderFields(AutomaticExerciseBuilder arg0)` → `void` [Setter]
- `getThresholdRate()` → `BigDecimal` [Getter]

### AveragingCalculationBuilderImpl
**Implements:** `AveragingCalculation$AveragingCalculationBuilder` 

**Fields:**
- `AveragingCalculationMethodBuilder averagingMethod`
- `RoundingBuilder precision`

**Key Methods:**
- `build()` → `AveragingCalculation` [Builder]
- `setAveragingMethod(AveragingCalculationMethod arg0)` → `AveragingCalculationBuilder` [Setter]
- `getOrCreateAveragingMethod()` → `AveragingCalculationMethodBuilder` [Getter]
- `getOrCreatePrecision()` → `RoundingBuilder` [Getter]
- `setPrecision(Rounding arg0)` → `AveragingCalculationBuilder` [Setter]
- `getAveragingMethod()` → `AveragingCalculationMethodBuilder` [Getter]
- `getPrecision()` → `RoundingBuilder` [Getter]

### AveragingCalculationImpl
**Implements:** `AveragingCalculation` 

**Key Methods:**
- `build()` → `AveragingCalculation` [Builder]
- `setBuilderFields(AveragingCalculationBuilder arg0)` → `void` [Setter]
- `getAveragingMethod()` → `AveragingCalculationMethod` [Getter]
- `getPrecision()` → `Rounding` [Getter]

### AveragingStrikeFeatureBuilderImpl
**Implements:** `AveragingStrikeFeature$AveragingStrikeFeatureBuilder` 

**Fields:**
- `AveragingCalculationBuilder averagingCalculation`
- `ObservationTermsBuilder observationTerms`

**Key Methods:**
- `build()` → `AveragingStrikeFeature` [Builder]
- `getOrCreateObservationTerms()` → `ObservationTermsBuilder` [Getter]
- `setObservationTerms(ObservationTerms arg0)` → `AveragingStrikeFeatureBuilder` [Setter]
- `getOrCreateAveragingCalculation()` → `AveragingCalculationBuilder` [Getter]
- `getAveragingCalculation()` → `AveragingCalculationBuilder` [Getter]
- `setAveragingCalculation(AveragingCalculation arg0)` → `AveragingStrikeFeatureBuilder` [Setter]
- `getObservationTerms()` → `ObservationTermsBuilder` [Getter]

### AveragingStrikeFeatureImpl
**Implements:** `AveragingStrikeFeature` 

**Key Methods:**
- `build()` → `AveragingStrikeFeature` [Builder]
- `setBuilderFields(AveragingStrikeFeatureBuilder arg0)` → `void` [Setter]
- `getAveragingCalculation()` → `AveragingCalculation` [Getter]
- `getObservationTerms()` → `ObservationTerms` [Getter]

### BarrierBuilderImpl
**Implements:** `Barrier$BarrierBuilder` 

**Fields:**
- `TriggerEventBuilder barrierCap`
- `TriggerEventBuilder barrierFloor`

**Key Methods:**
- `build()` → `Barrier` [Builder]
- `setBarrierFloor(TriggerEvent arg0)` → `BarrierBuilder` [Setter]
- `getOrCreateBarrierCap()` → `TriggerEventBuilder` [Getter]
- `getOrCreateBarrierFloor()` → `TriggerEventBuilder` [Getter]
- `setBarrierCap(TriggerEvent arg0)` → `BarrierBuilder` [Setter]
- `getBarrierFloor()` → `TriggerEventBuilder` [Getter]
- `getBarrierCap()` → `TriggerEventBuilder` [Getter]

### BarrierImpl
**Implements:** `Barrier` 

**Key Methods:**
- `build()` → `Barrier` [Builder]
- `setBuilderFields(BarrierBuilder arg0)` → `void` [Setter]
- `getBarrierFloor()` → `TriggerEvent` [Getter]
- `getBarrierCap()` → `TriggerEvent` [Getter]

### CalculationScheduleBuilderImpl
**Implements:** `CalculationSchedule$CalculationScheduleBuilder` 

**Fields:**
- `List (List) schedulePeriod`

**Key Methods:**
- `build()` → `CalculationSchedule` [Builder]
- `getSchedulePeriod()` → `List` [Getter]
- `getOrCreateSchedulePeriod(int arg0)` → `SchedulePeriodBuilder` [Getter]
- `setSchedulePeriod(List arg0)` → `CalculationScheduleBuilder` [Setter]

### CalculationScheduleImpl
**Implements:** `CalculationSchedule` 

**Key Methods:**
- `build()` → `CalculationSchedule` [Builder]
- `getSchedulePeriod()` → `List` [Getter]
- `setBuilderFields(CalculationScheduleBuilder arg0)` → `void` [Setter]

### CalendarSpreadBuilderImpl
**Implements:** `CalendarSpread$CalendarSpreadBuilder` 

**Fields:**
- `AdjustableOrRelativeDateBuilder expirationDateTwo`

**Key Methods:**
- `build()` → `CalendarSpread` [Builder]
- `getOrCreateExpirationDateTwo()` → `AdjustableOrRelativeDateBuilder` [Getter]
- `getExpirationDateTwo()` → `AdjustableOrRelativeDateBuilder` [Getter]
- `setExpirationDateTwo(AdjustableOrRelativeDate arg0)` → `CalendarSpreadBuilder` [Setter]

### CalendarSpreadImpl
**Implements:** `CalendarSpread` 

**Key Methods:**
- `build()` → `CalendarSpread` [Builder]
- `setBuilderFields(CalendarSpreadBuilder arg0)` → `void` [Setter]
- `getExpirationDateTwo()` → `AdjustableOrRelativeDate` [Getter]

### CancelableProvisionAdjustedDatesBuilderImpl
**Implements:** `CancelableProvisionAdjustedDates$CancelableProvisionAdjustedDatesBuilder` 

**Fields:**
- `List (List) cancellationEvent`

**Key Methods:**
- `build()` → `CancelableProvisionAdjustedDates` [Builder]
- `getOrCreateCancellationEvent(int arg0)` → `CancellationEventBuilder` [Getter]
- `getCancellationEvent()` → `List` [Getter]
- `setCancellationEvent(List arg0)` → `CancelableProvisionAdjustedDatesBuilder` [Setter]

### CancelableProvisionAdjustedDatesImpl
**Implements:** `CancelableProvisionAdjustedDates` 

**Key Methods:**
- `build()` → `CancelableProvisionAdjustedDates` [Builder]
- `setBuilderFields(CancelableProvisionAdjustedDatesBuilder arg0)` → `void` [Setter]
- `getCancellationEvent()` → `List` [Getter]

### CancelableProvisionBuilderImpl
**Extends:** `BuyerSeller$BuyerSellerBuilderImpl` 
**Implements:** `CancelableProvision$CancelableProvisionBuilder` 

**Fields:**
- `ExerciseNoticeBuilder exerciseNotice`
- `Boolean followUpConfirmation`
- `CancelableProvisionAdjustedDatesBuilder cancelableProvisionAdjustedDates`
- `List (List) finalCalculationPeriodDateAdjustment`
- `TransferBuilder initialFee`
- `CallingPartyEnum callingParty`
- `AdjustableOrRelativeDateBuilder earliestDate`
- `AdjustableOrRelativeDateBuilder expirationDate`
- `AdjustableOrRelativeDatesBuilder effectiveDate`
- `PeriodBuilder effectivePeriod`
- `BusinessCenterTimeBuilder earliestCancellationTime`
- `BusinessCenterTimeBuilder latestCancelationTime`
- `ExerciseTermsBuilder exerciseTerms`

**Key Methods:**
- `build()` → `CancelableProvision` [Builder]
- `setEffectiveDate(AdjustableOrRelativeDates arg0)` → `CancelableProvisionBuilder` [Setter]
- `getOrCreateEffectiveDate()` → `AdjustableOrRelativeDatesBuilder` [Getter]
- `setExerciseTerms(ExerciseTerms arg0)` → `CancelableProvisionBuilder` [Setter]
- `getOrCreateExerciseTerms()` → `ExerciseTermsBuilder` [Getter]
- `getExerciseTerms()` → `ExerciseTermsBuilder` [Getter]
- `getFollowUpConfirmation()` → `Boolean` [Getter]
- `getEffectivePeriod()` → `PeriodBuilder` [Getter]
- `getExerciseNotice()` → `ExerciseNoticeBuilder` [Getter]
- `getLatestCancelationTime()` → `BusinessCenterTimeBuilder` [Getter]

### CancelableProvisionImpl
**Extends:** `BuyerSeller$BuyerSellerImpl` 
**Implements:** `CancelableProvision` 

**Key Methods:**
- `build()` → `CancelableProvision` [Builder]
- `getExerciseTerms()` → `ExerciseTerms` [Getter]
- `getFollowUpConfirmation()` → `Boolean` [Getter]
- `getEffectivePeriod()` → `Period` [Getter]
- `getExerciseNotice()` → `ExerciseNotice` [Getter]
- `getLatestCancelationTime()` → `BusinessCenterTime` [Getter]
- `getInitialFee()` → `Transfer` [Getter]
- `getEarliestDate()` → `AdjustableOrRelativeDate` [Getter]
- `getExpirationDate()` → `AdjustableOrRelativeDate` [Getter]
- `getCallingParty()` → `CallingPartyEnum` [Getter]

### CancellationEventBuilderImpl
**Implements:** `CancellationEvent$CancellationEventBuilder` 

**Fields:**
- `Date adjustedExerciseDate`
- `Date adjustedEarlyTerminationDate`
- `MetaFieldsBuilder meta`

**Key Methods:**
- `build()` → `CancellationEvent` [Builder]
- `getOrCreateMeta()` → `MetaFieldsBuilder` [Getter]
- `getAdjustedEarlyTerminationDate()` → `Date` [Getter]
- `setAdjustedEarlyTerminationDate(Date arg0)` → `CancellationEventBuilder` [Setter]
- `getAdjustedExerciseDate()` → `Date` [Getter]
- `setAdjustedExerciseDate(Date arg0)` → `CancellationEventBuilder` [Setter]
- `setMeta(MetaFields arg0)` → `CancellationEventBuilder` [Setter]
- `getMeta()` → `MetaFieldsBuilder` [Getter]

### CancellationEventImpl
**Implements:** `CancellationEvent` 

**Key Methods:**
- `build()` → `CancellationEvent` [Builder]
- `setBuilderFields(CancellationEventBuilder arg0)` → `void` [Setter]
- `getAdjustedEarlyTerminationDate()` → `Date` [Getter]
- `getAdjustedExerciseDate()` → `Date` [Getter]
- `getMeta()` → `MetaFields` [Getter]

### CompositeBuilderImpl
**Implements:** `Composite$CompositeBuilder` 

**Fields:**
- `DeterminationMethodEnum determinationMethod`
- `RelativeDateOffsetBuilder relativeDate`
- `FxSpotRateSourceBuilder fxSpotRateSource`
- `BusinessCenterTimeBuilder fixingTime`

**Key Methods:**
- `build()` → `Composite` [Builder]
- `getOrCreateFxSpotRateSource()` → `FxSpotRateSourceBuilder` [Getter]
- `setDeterminationMethod(DeterminationMethodEnum arg0)` → `CompositeBuilder` [Setter]
- `getDeterminationMethod()` → `DeterminationMethodEnum` [Getter]
- `getOrCreateRelativeDate()` → `RelativeDateOffsetBuilder` [Getter]
- `setRelativeDate(RelativeDateOffset arg0)` → `CompositeBuilder` [Setter]
- `getRelativeDate()` → `RelativeDateOffsetBuilder` [Getter]
- `getFxSpotRateSource()` → `FxSpotRateSourceBuilder` [Getter]
- `setFixingTime(BusinessCenterTime arg0)` → `CompositeBuilder` [Setter]
- `getFixingTime()` → `BusinessCenterTimeBuilder` [Getter]

### CompositeImpl
**Implements:** `Composite` 

**Key Methods:**
- `build()` → `Composite` [Builder]
- `setBuilderFields(CompositeBuilder arg0)` → `void` [Setter]
- `getDeterminationMethod()` → `DeterminationMethodEnum` [Getter]
- `getRelativeDate()` → `RelativeDateOffset` [Getter]
- `getFxSpotRateSource()` → `FxSpotRateSource` [Getter]
- `getFixingTime()` → `BusinessCenterTime` [Getter]

### ConstituentWeightBuilderImpl
**Implements:** `ConstituentWeight$ConstituentWeightBuilder` 

**Fields:**
- `BigDecimal openUnits`
- `BigDecimal basketPercentage`

**Key Methods:**
- `build()` → `ConstituentWeight` [Builder]
- `getBasketPercentage()` → `BigDecimal` [Getter]
- `getOpenUnits()` → `BigDecimal` [Getter]
- `setOpenUnits(BigDecimal arg0)` → `ConstituentWeightBuilder` [Setter]
- `setBasketPercentage(BigDecimal arg0)` → `ConstituentWeightBuilder` [Setter]

### ConstituentWeightImpl
**Implements:** `ConstituentWeight` 

**Key Methods:**
- `build()` → `ConstituentWeight` [Builder]
- `setBuilderFields(ConstituentWeightBuilder arg0)` → `void` [Setter]
- `getBasketPercentage()` → `BigDecimal` [Getter]
- `getOpenUnits()` → `BigDecimal` [Getter]

### DividendTermsBuilderImpl
**Implements:** `DividendTerms$DividendTermsBuilder` 

**Fields:**
- `DividendPayoutRatioBuilder manufacturedIncomeRequirement`
- `DividendEntitlementEnum dividendEntitlement`
- `MoneyBuilder minimumBillingAmount`

**Key Methods:**
- `build()` → `DividendTerms` [Builder]
- `getOrCreateManufacturedIncomeRequirement()` → `DividendPayoutRatioBuilder` [Getter]
- `getOrCreateMinimumBillingAmount()` → `MoneyBuilder` [Getter]
- `setManufacturedIncomeRequirement(DividendPayoutRatio arg0)` → `DividendTermsBuilder` [Setter]
- `getManufacturedIncomeRequirement()` → `DividendPayoutRatioBuilder` [Getter]
- `getMinimumBillingAmount()` → `MoneyBuilder` [Getter]
- `setMinimumBillingAmount(Money arg0)` → `DividendTermsBuilder` [Setter]
- `getDividendEntitlement()` → `DividendEntitlementEnum` [Getter]
- `setDividendEntitlement(DividendEntitlementEnum arg0)` → `DividendTermsBuilder` [Setter]

### DividendTermsImpl
**Implements:** `DividendTerms` 

**Key Methods:**
- `build()` → `DividendTerms` [Builder]
- `setBuilderFields(DividendTermsBuilder arg0)` → `void` [Setter]
- `getManufacturedIncomeRequirement()` → `DividendPayoutRatio` [Getter]
- `getMinimumBillingAmount()` → `Money` [Getter]
- `getDividendEntitlement()` → `DividendEntitlementEnum` [Getter]

### EarlyTerminationEventBuilderImpl
**Implements:** `EarlyTerminationEvent$EarlyTerminationEventBuilder` 

**Fields:**
- `Date adjustedExerciseDate`
- `Date adjustedEarlyTerminationDate`
- `Date adjustedCashSettlementValuationDate`
- `Date adjustedCashSettlementPaymentDate`
- `Date adjustedExerciseFeePaymentDate`
- `MetaFieldsBuilder meta`

**Key Methods:**
- `build()` → `EarlyTerminationEvent` [Builder]
- `getOrCreateMeta()` → `MetaFieldsBuilder` [Getter]
- `getAdjustedEarlyTerminationDate()` → `Date` [Getter]
- `setAdjustedEarlyTerminationDate(Date arg0)` → `EarlyTerminationEventBuilder` [Setter]
- `setAdjustedCashSettlementValuationDate(Date arg0)` → `EarlyTerminationEventBuilder` [Setter]
- `setAdjustedExerciseFeePaymentDate(Date arg0)` → `EarlyTerminationEventBuilder` [Setter]
- `setAdjustedCashSettlementPaymentDate(Date arg0)` → `EarlyTerminationEventBuilder` [Setter]
- `getAdjustedCashSettlementPaymentDate()` → `Date` [Getter]
- `getAdjustedExerciseFeePaymentDate()` → `Date` [Getter]
- `getAdjustedCashSettlementValuationDate()` → `Date` [Getter]

### EarlyTerminationEventImpl
**Implements:** `EarlyTerminationEvent` 

**Key Methods:**
- `build()` → `EarlyTerminationEvent` [Builder]
- `setBuilderFields(EarlyTerminationEventBuilder arg0)` → `void` [Setter]
- `getAdjustedEarlyTerminationDate()` → `Date` [Getter]
- `getAdjustedCashSettlementPaymentDate()` → `Date` [Getter]
- `getAdjustedExerciseFeePaymentDate()` → `Date` [Getter]
- `getAdjustedCashSettlementValuationDate()` → `Date` [Getter]
- `getAdjustedExerciseDate()` → `Date` [Getter]
- `getMeta()` → `MetaFields` [Getter]

### EarlyTerminationProvisionBuilderImpl
**Implements:** `EarlyTerminationProvision$EarlyTerminationProvisionBuilder` 

**Fields:**
- `MandatoryEarlyTerminationBuilder mandatoryEarlyTermination`
- `PeriodBuilder mandatoryEarlyTerminationDateTenor`
- `OptionalEarlyTerminationBuilder optionalEarlyTermination`
- `ExercisePeriodBuilder optionalEarlyTerminationParameters`
- `MetaFieldsBuilder meta`

**Key Methods:**
- `build()` → `EarlyTerminationProvision` [Builder]
- `getOrCreateOptionalEarlyTerminationParameters()` → `ExercisePeriodBuilder` [Getter]
- `getOrCreateMandatoryEarlyTerminationDateTenor()` → `PeriodBuilder` [Getter]
- `getOrCreateMeta()` → `MetaFieldsBuilder` [Getter]
- `getOrCreateMandatoryEarlyTermination()` → `MandatoryEarlyTerminationBuilder` [Getter]
- `setOptionalEarlyTermination(OptionalEarlyTermination arg0)` → `EarlyTerminationProvisionBuilder` [Setter]
- `setMandatoryEarlyTermination(MandatoryEarlyTermination arg0)` → `EarlyTerminationProvisionBuilder` [Setter]
- `setMandatoryEarlyTerminationDateTenor(Period arg0)` → `EarlyTerminationProvisionBuilder` [Setter]
- `setOptionalEarlyTerminationParameters(ExercisePeriod arg0)` → `EarlyTerminationProvisionBuilder` [Setter]
- `getOrCreateOptionalEarlyTermination()` → `OptionalEarlyTerminationBuilder` [Getter]

### EarlyTerminationProvisionImpl
**Implements:** `EarlyTerminationProvision` 

**Key Methods:**
- `build()` → `EarlyTerminationProvision` [Builder]
- `setBuilderFields(EarlyTerminationProvisionBuilder arg0)` → `void` [Setter]
- `getMandatoryEarlyTerminationDateTenor()` → `Period` [Getter]
- `getMandatoryEarlyTermination()` → `MandatoryEarlyTermination` [Getter]
- `getOptionalEarlyTermination()` → `OptionalEarlyTermination` [Getter]
- `getOptionalEarlyTerminationParameters()` → `ExercisePeriod` [Getter]
- `getMeta()` → `MetaFields` [Getter]

### EconomicTermsBuilderImpl
**Implements:** `EconomicTerms$EconomicTermsBuilder` 

**Fields:**
- `AdjustableOrRelativeDateBuilder effectiveDate`
- `AdjustableOrRelativeDateBuilder terminationDate`
- `BusinessDayAdjustmentsBuilder dateAdjustments`
- `List (List) payout`
- `TerminationProvisionBuilder terminationProvision`
- `CalculationAgentBuilder calculationAgent`
- `Boolean nonStandardisedTerms`
- `CollateralBuilder collateral`

**Key Methods:**
- `build()` → `EconomicTerms` [Builder]
- `setPayout(List arg0)` → `EconomicTermsBuilder` [Setter]
- `setCollateral(Collateral arg0)` → `EconomicTermsBuilder` [Setter]
- `getOrCreateCollateral()` → `CollateralBuilder` [Getter]
- `setEffectiveDate(AdjustableOrRelativeDate arg0)` → `EconomicTermsBuilder` [Setter]
- `getOrCreatePayout(int arg0)` → `PayoutBuilder` [Getter]
- `setDateAdjustments(BusinessDayAdjustments arg0)` → `EconomicTermsBuilder` [Setter]
- `getOrCreateDateAdjustments()` → `BusinessDayAdjustmentsBuilder` [Getter]
- `setTerminationProvision(TerminationProvision arg0)` → `EconomicTermsBuilder` [Setter]
- `setNonStandardisedTerms(Boolean arg0)` → `EconomicTermsBuilder` [Setter]

### EconomicTermsImpl
**Implements:** `EconomicTerms` 

**Key Methods:**
- `build()` → `EconomicTerms` [Builder]
- `getTerminationProvision()` → `TerminationProvision` [Getter]
- `getNonStandardisedTerms()` → `Boolean` [Getter]
- `getCalculationAgent()` → `CalculationAgent` [Getter]
- `getEffectiveDate()` → `AdjustableOrRelativeDate` [Getter]
- `setBuilderFields(EconomicTermsBuilder arg0)` → `void` [Setter]
- `getTerminationDate()` → `AdjustableOrRelativeDate` [Getter]
- `getCollateral()` → `Collateral` [Getter]
- `getPayout()` → `List` [Getter]
- `getDateAdjustments()` → `BusinessDayAdjustments` [Getter]

### EvergreenProvisionBuilderImpl
**Implements:** `EvergreenProvision$EvergreenProvisionBuilder` 

**Fields:**
- `PartyRoleBuilder singlePartyOption`
- `RelativeDateOffsetBuilder noticePeriod`
- `RelativeDateOffsetBuilder noticeDeadlinePeriod`
- `ZonedDateTime noticeDeadlineDateTime`
- `AdjustableRelativeOrPeriodicDatesBuilder extensionFrequency`
- `PriceBuilder finalPeriodFeeAdjustment`

**Key Methods:**
- `build()` → `EvergreenProvision` [Builder]
- `getSinglePartyOption()` → `PartyRoleBuilder` [Getter]
- `getNoticePeriod()` → `RelativeDateOffsetBuilder` [Getter]
- `getExtensionFrequency()` → `AdjustableRelativeOrPeriodicDatesBuilder` [Getter]
- `getOrCreateNoticePeriod()` → `RelativeDateOffsetBuilder` [Getter]
- `getOrCreateSinglePartyOption()` → `PartyRoleBuilder` [Getter]
- `getOrCreateFinalPeriodFeeAdjustment()` → `PriceBuilder` [Getter]
- `setFinalPeriodFeeAdjustment(Price arg0)` → `EvergreenProvisionBuilder` [Setter]
- `getOrCreateExtensionFrequency()` → `AdjustableRelativeOrPeriodicDatesBuilder` [Getter]
- `setExtensionFrequency(AdjustableRelativeOrPeriodicDates arg0)` → `EvergreenProvisionBuilder` [Setter]

### EvergreenProvisionImpl
**Implements:** `EvergreenProvision` 

**Key Methods:**
- `build()` → `EvergreenProvision` [Builder]
- `getSinglePartyOption()` → `PartyRole` [Getter]
- `getNoticePeriod()` → `RelativeDateOffset` [Getter]
- `getExtensionFrequency()` → `AdjustableRelativeOrPeriodicDates` [Getter]
- `setBuilderFields(EvergreenProvisionBuilder arg0)` → `void` [Setter]
- `getNoticeDeadlinePeriod()` → `RelativeDateOffset` [Getter]
- `getNoticeDeadlineDateTime()` → `ZonedDateTime` [Getter]
- `getFinalPeriodFeeAdjustment()` → `Price` [Getter]

### ExerciseFeeBuilderImpl
**Extends:** `PayerReceiver$PayerReceiverBuilderImpl` 
**Implements:** `ExerciseFee$ExerciseFeeBuilder` 

**Fields:**
- `ReferenceWithMetaMoneyBuilder notionalReference`
- `BigDecimal feeAmount`
- `BigDecimal feeRate`
- `RelativeDateOffsetBuilder feePaymentDate`

**Key Methods:**
- `build()` → `ExerciseFee` [Builder]
- `getFeeRate()` → `BigDecimal` [Getter]
- `setReceiver(CounterpartyRoleEnum arg0)` → `ExerciseFeeBuilder` [Setter]
- `getOrCreateNotionalReference()` → `ReferenceWithMetaMoneyBuilder` [Getter]
- `getNotionalReference()` → `ReferenceWithMetaMoneyBuilder` [Getter]
- `getFeePaymentDate()` → `RelativeDateOffsetBuilder` [Getter]
- `getOrCreateFeePaymentDate()` → `RelativeDateOffsetBuilder` [Getter]
- `setNotionalReference(ReferenceWithMetaMoney arg0)` → `ExerciseFeeBuilder` [Setter]
- `setFeePaymentDate(RelativeDateOffset arg0)` → `ExerciseFeeBuilder` [Setter]
- `setNotionalReferenceValue(Money arg0)` → `ExerciseFeeBuilder` [Setter]

### ExerciseFeeImpl
**Extends:** `PayerReceiver$PayerReceiverImpl` 
**Implements:** `ExerciseFee` 

**Key Methods:**
- `build()` → `ExerciseFee` [Builder]
- `getFeeRate()` → `BigDecimal` [Getter]
- `setBuilderFields(ExerciseFeeBuilder arg0)` → `void` [Setter]
- `getNotionalReference()` → `ReferenceWithMetaMoney` [Getter]
- `getFeePaymentDate()` → `RelativeDateOffset` [Getter]
- `getFeeAmount()` → `BigDecimal` [Getter]

### ExerciseFeeScheduleBuilderImpl
**Extends:** `PayerReceiver$PayerReceiverBuilderImpl` 
**Implements:** `ExerciseFeeSchedule$ExerciseFeeScheduleBuilder` 

**Fields:**
- `ReferenceWithMetaMoneyBuilder notionalReference`
- `AmountScheduleBuilder feeAmountSchedule`
- `ScheduleBuilder feeRateSchedule`
- `RelativeDateOffsetBuilder feePaymentDate`

**Key Methods:**
- `build()` → `ExerciseFeeSchedule` [Builder]
- `setReceiver(CounterpartyRoleEnum arg0)` → `ExerciseFeeScheduleBuilder` [Setter]
- `getOrCreateNotionalReference()` → `ReferenceWithMetaMoneyBuilder` [Getter]
- `getOrCreateFeeAmountSchedule()` → `AmountScheduleBuilder` [Getter]
- `getOrCreateFeeRateSchedule()` → `ScheduleBuilder` [Getter]
- `setFeeRateSchedule(Schedule arg0)` → `ExerciseFeeScheduleBuilder` [Setter]
- `getNotionalReference()` → `ReferenceWithMetaMoneyBuilder` [Getter]
- `getFeeAmountSchedule()` → `AmountScheduleBuilder` [Getter]
- `getFeePaymentDate()` → `RelativeDateOffsetBuilder` [Getter]
- `getOrCreateFeePaymentDate()` → `RelativeDateOffsetBuilder` [Getter]

### ExerciseFeeScheduleImpl
**Extends:** `PayerReceiver$PayerReceiverImpl` 
**Implements:** `ExerciseFeeSchedule` 

**Key Methods:**
- `build()` → `ExerciseFeeSchedule` [Builder]
- `setBuilderFields(ExerciseFeeScheduleBuilder arg0)` → `void` [Setter]
- `getNotionalReference()` → `ReferenceWithMetaMoney` [Getter]
- `getFeeAmountSchedule()` → `AmountSchedule` [Getter]
- `getFeePaymentDate()` → `RelativeDateOffset` [Getter]
- `getFeeRateSchedule()` → `Schedule` [Getter]

### ExerciseNoticeBuilderImpl
**Implements:** `ExerciseNotice$ExerciseNoticeBuilder` 

**Fields:**
- `ExerciseNoticeGiverEnum exerciseNoticeGiver`
- `AncillaryRoleEnum exerciseNoticeReceiver`
- `FieldWithMetaBusinessCenterEnumBuilder businessCenter`

**Key Methods:**
- `build()` → `ExerciseNotice` [Builder]
- `getOrCreateBusinessCenter()` → `FieldWithMetaBusinessCenterEnumBuilder` [Getter]
- `setBusinessCenterValue(BusinessCenterEnum arg0)` → `ExerciseNoticeBuilder` [Setter]
- `setBusinessCenter(FieldWithMetaBusinessCenterEnum arg0)` → `ExerciseNoticeBuilder` [Setter]
- `getExerciseNoticeReceiver()` → `AncillaryRoleEnum` [Getter]
- `getExerciseNoticeGiver()` → `ExerciseNoticeGiverEnum` [Getter]
- `setExerciseNoticeReceiver(AncillaryRoleEnum arg0)` → `ExerciseNoticeBuilder` [Setter]
- `setExerciseNoticeGiver(ExerciseNoticeGiverEnum arg0)` → `ExerciseNoticeBuilder` [Setter]
- `getBusinessCenter()` → `FieldWithMetaBusinessCenterEnumBuilder` [Getter]

### ExerciseNoticeImpl
**Implements:** `ExerciseNotice` 

**Key Methods:**
- `build()` → `ExerciseNotice` [Builder]
- `setBuilderFields(ExerciseNoticeBuilder arg0)` → `void` [Setter]
- `getExerciseNoticeReceiver()` → `AncillaryRoleEnum` [Getter]
- `getExerciseNoticeGiver()` → `ExerciseNoticeGiverEnum` [Getter]
- `getBusinessCenter()` → `FieldWithMetaBusinessCenterEnum` [Getter]

### ExercisePeriodBuilderImpl
**Implements:** `ExercisePeriod$ExercisePeriodBuilder` 

**Fields:**
- `PeriodBuilder earliestExerciseDateTenor`
- `PeriodBuilder exerciseFrequency`
- `MetaFieldsBuilder meta`

**Key Methods:**
- `build()` → `ExercisePeriod` [Builder]
- `setExerciseFrequency(Period arg0)` → `ExercisePeriodBuilder` [Setter]
- `getExerciseFrequency()` → `PeriodBuilder` [Getter]
- `getOrCreateMeta()` → `MetaFieldsBuilder` [Getter]
- `getEarliestExerciseDateTenor()` → `PeriodBuilder` [Getter]
- `setEarliestExerciseDateTenor(Period arg0)` → `ExercisePeriodBuilder` [Setter]
- `getOrCreateExerciseFrequency()` → `PeriodBuilder` [Getter]
- `getOrCreateEarliestExerciseDateTenor()` → `PeriodBuilder` [Getter]
- `setMeta(MetaFields arg0)` → `ExercisePeriodBuilder` [Setter]
- `getMeta()` → `MetaFieldsBuilder` [Getter]

### ExercisePeriodImpl
**Implements:** `ExercisePeriod` 

**Key Methods:**
- `build()` → `ExercisePeriod` [Builder]
- `getExerciseFrequency()` → `Period` [Getter]
- `setBuilderFields(ExercisePeriodBuilder arg0)` → `void` [Setter]
- `getEarliestExerciseDateTenor()` → `Period` [Getter]
- `getMeta()` → `MetaFields` [Getter]

### ExerciseProcedureBuilderImpl
**Implements:** `ExerciseProcedure$ExerciseProcedureBuilder` 

**Fields:**
- `ManualExerciseBuilder manualExercise`
- `AutomaticExerciseBuilder automaticExercise`
- `Boolean followUpConfirmation`
- `Boolean limitedRightToConfirm`
- `Boolean splitTicket`

**Key Methods:**
- `build()` → `ExerciseProcedure` [Builder]
- `getFollowUpConfirmation()` → `Boolean` [Getter]
- `getOrCreateAutomaticExercise()` → `AutomaticExerciseBuilder` [Getter]
- `getOrCreateManualExercise()` → `ManualExerciseBuilder` [Getter]
- `setManualExercise(ManualExercise arg0)` → `ExerciseProcedureBuilder` [Setter]
- `setFollowUpConfirmation(Boolean arg0)` → `ExerciseProcedureBuilder` [Setter]
- `getLimitedRightToConfirm()` → `Boolean` [Getter]
- `setLimitedRightToConfirm(Boolean arg0)` → `ExerciseProcedureBuilder` [Setter]
- `setSplitTicket(Boolean arg0)` → `ExerciseProcedureBuilder` [Setter]
- `getManualExercise()` → `ManualExerciseBuilder` [Getter]

### ExerciseProcedureImpl
**Implements:** `ExerciseProcedure` 

**Key Methods:**
- `build()` → `ExerciseProcedure` [Builder]
- `getFollowUpConfirmation()` → `Boolean` [Getter]
- `setBuilderFields(ExerciseProcedureBuilder arg0)` → `void` [Setter]
- `getLimitedRightToConfirm()` → `Boolean` [Getter]
- `getManualExercise()` → `ManualExercise` [Getter]
- `getSplitTicket()` → `Boolean` [Getter]
- `getAutomaticExercise()` → `AutomaticExercise` [Getter]

### ExerciseTermsBuilderImpl
**Implements:** `ExerciseTerms$ExerciseTermsBuilder` 

**Fields:**
- `OptionExerciseStyleEnum style`
- `AdjustableOrRelativeDateBuilder commencementDate`
- `AdjustableOrRelativeDatesBuilder exerciseDates`
- `List (List) expirationDate`
- `AdjustableOrRelativeDatesBuilder relevantUnderlyingDate`
- `BusinessCenterTimeBuilder earliestExerciseTime`
- `BusinessCenterTimeBuilder latestExerciseTime`
- `BusinessCenterTimeBuilder expirationTime`
- `ExpirationTimeTypeEnum expirationTimeType`
- `MultipleExerciseBuilder multipleExercise`
- `ExerciseFeeScheduleBuilder exerciseFeeSchedule`
- `ExerciseProcedureBuilder exerciseProcedure`
- `ExerciseFeeBuilder exerciseFee`
- `PartialExerciseBuilder partialExercise`
- `MetaFieldsBuilder meta`

**Key Methods:**
- `build()` → `ExerciseTerms` [Builder]
- `setExpirationTime(BusinessCenterTime arg0)` → `ExerciseTermsBuilder` [Setter]
- `getStyle()` → `OptionExerciseStyleEnum` [Getter]
- `setStyle(OptionExerciseStyleEnum arg0)` → `ExerciseTermsBuilder` [Setter]
- `getExpirationTimeType()` → `ExpirationTimeTypeEnum` [Getter]
- `getCommencementDate()` → `AdjustableOrRelativeDateBuilder` [Getter]
- `getLatestExerciseTime()` → `BusinessCenterTimeBuilder` [Getter]
- `getExerciseFeeSchedule()` → `ExerciseFeeScheduleBuilder` [Getter]
- `getEarliestExerciseTime()` → `BusinessCenterTimeBuilder` [Getter]
- `getMultipleExercise()` → `MultipleExerciseBuilder` [Getter]

### ExerciseTermsImpl
**Implements:** `ExerciseTerms` 

**Key Methods:**
- `build()` → `ExerciseTerms` [Builder]
- `getStyle()` → `OptionExerciseStyleEnum` [Getter]
- `getExpirationTimeType()` → `ExpirationTimeTypeEnum` [Getter]
- `getCommencementDate()` → `AdjustableOrRelativeDate` [Getter]
- `getLatestExerciseTime()` → `BusinessCenterTime` [Getter]
- `getExerciseFeeSchedule()` → `ExerciseFeeSchedule` [Getter]
- `getEarliestExerciseTime()` → `BusinessCenterTime` [Getter]
- `getMultipleExercise()` → `MultipleExercise` [Getter]
- `getExpirationTime()` → `BusinessCenterTime` [Getter]
- `getExerciseFee()` → `ExerciseFee` [Getter]

### ExtendibleProvisionAdjustedDatesBuilderImpl
**Implements:** `ExtendibleProvisionAdjustedDates$ExtendibleProvisionAdjustedDatesBuilder` 

**Fields:**
- `List (List) extensionEvent`

**Key Methods:**
- `build()` → `ExtendibleProvisionAdjustedDates` [Builder]
- `setExtensionEvent(List arg0)` → `ExtendibleProvisionAdjustedDatesBuilder` [Setter]
- `getOrCreateExtensionEvent(int arg0)` → `ExtensionEventBuilder` [Getter]
- `getExtensionEvent()` → `List` [Getter]

### ExtendibleProvisionAdjustedDatesImpl
**Implements:** `ExtendibleProvisionAdjustedDates` 

**Key Methods:**
- `build()` → `ExtendibleProvisionAdjustedDates` [Builder]
- `setBuilderFields(ExtendibleProvisionAdjustedDatesBuilder arg0)` → `void` [Setter]
- `getExtensionEvent()` → `List` [Getter]

### ExtendibleProvisionBuilderImpl
**Extends:** `BuyerSeller$BuyerSellerBuilderImpl` 
**Implements:** `ExtendibleProvision$ExtendibleProvisionBuilder` 

**Fields:**
- `ExerciseNoticeBuilder exerciseNotice`
- `Boolean followUpConfirmation`
- `ExtendibleProvisionAdjustedDatesBuilder extendibleProvisionAdjustedDates`
- `CallingPartyEnum callingParty`
- `PartyRoleBuilder singlePartyOption`
- `RelativeDateOffsetBuilder noticeDeadlinePeriod`
- `ZonedDateTime noticeDeadlineDateTime`
- `RelativeDateOffsetBuilder extensionTerm`
- `AdjustableRelativeOrPeriodicDatesBuilder extensionPeriod`
- `ExerciseTermsBuilder exerciseTerms`

**Key Methods:**
- `build()` → `ExtendibleProvision` [Builder]
- `setExtensionPeriod(AdjustableRelativeOrPeriodicDates arg0)` → `ExtendibleProvisionBuilder` [Setter]
- `getOrCreateExtensionTerm()` → `RelativeDateOffsetBuilder` [Getter]
- `setExtensionTerm(RelativeDateOffset arg0)` → `ExtendibleProvisionBuilder` [Setter]
- `getOrCreateExtensionPeriod()` → `AdjustableRelativeOrPeriodicDatesBuilder` [Getter]
- `setExerciseTerms(ExerciseTerms arg0)` → `ExtendibleProvisionBuilder` [Setter]
- `getOrCreateExerciseTerms()` → `ExerciseTermsBuilder` [Getter]
- `getSinglePartyOption()` → `PartyRoleBuilder` [Getter]
- `getExerciseTerms()` → `ExerciseTermsBuilder` [Getter]
- `getFollowUpConfirmation()` → `Boolean` [Getter]

### ExtendibleProvisionImpl
**Extends:** `BuyerSeller$BuyerSellerImpl` 
**Implements:** `ExtendibleProvision` 

**Key Methods:**
- `build()` → `ExtendibleProvision` [Builder]
- `getSinglePartyOption()` → `PartyRole` [Getter]
- `getExerciseTerms()` → `ExerciseTerms` [Getter]
- `getFollowUpConfirmation()` → `Boolean` [Getter]
- `getExtensionTerm()` → `RelativeDateOffset` [Getter]
- `getExerciseNotice()` → `ExerciseNotice` [Getter]
- `getExtensionPeriod()` → `AdjustableRelativeOrPeriodicDates` [Getter]
- `getCallingParty()` → `CallingPartyEnum` [Getter]
- `setBuilderFields(ExtendibleProvisionBuilder arg0)` → `void` [Setter]
- `getNoticeDeadlinePeriod()` → `RelativeDateOffset` [Getter]

### ExtensionEventBuilderImpl
**Implements:** `ExtensionEvent$ExtensionEventBuilder` 

**Fields:**
- `Date adjustedExerciseDate`
- `Date adjustedExtendedTerminationDate`
- `MetaFieldsBuilder meta`

**Key Methods:**
- `build()` → `ExtensionEvent` [Builder]
- `getOrCreateMeta()` → `MetaFieldsBuilder` [Getter]
- `getAdjustedExtendedTerminationDate()` → `Date` [Getter]
- `setAdjustedExtendedTerminationDate(Date arg0)` → `ExtensionEventBuilder` [Setter]
- `getAdjustedExerciseDate()` → `Date` [Getter]
- `setAdjustedExerciseDate(Date arg0)` → `ExtensionEventBuilder` [Setter]
- `setMeta(MetaFields arg0)` → `ExtensionEventBuilder` [Setter]
- `getMeta()` → `MetaFieldsBuilder` [Getter]

### ExtensionEventImpl
**Implements:** `ExtensionEvent` 

**Key Methods:**
- `build()` → `ExtensionEvent` [Builder]
- `setBuilderFields(ExtensionEventBuilder arg0)` → `void` [Setter]
- `getAdjustedExtendedTerminationDate()` → `Date` [Getter]
- `getAdjustedExerciseDate()` → `Date` [Getter]
- `getMeta()` → `MetaFields` [Getter]

### FixedPricePayoutBuilderImpl
**Extends:** `PayoutBase$PayoutBaseBuilderImpl` 
**Implements:** `FixedPricePayout$FixedPricePayoutBuilder` 

**Fields:**
- `PaymentDatesBuilder paymentDates`
- `FixedPriceBuilder fixedPrice`
- `CalculationScheduleBuilder schedule`

**Key Methods:**
- `build()` → `FixedPricePayout` [Builder]
- `getSchedule()` → `CalculationScheduleBuilder` [Getter]
- `setSchedule(CalculationSchedule arg0)` → `FixedPricePayoutBuilder` [Setter]
- `setPrincipalPayment(PrincipalPayments arg0)` → `FixedPricePayoutBuilder` [Setter]
- `getOrCreateSchedule()` → `CalculationScheduleBuilder` [Getter]
- `setPayerReceiver(PayerReceiver arg0)` → `FixedPricePayoutBuilder` [Setter]
- `getFixedPrice()` → `FixedPriceBuilder` [Getter]
- `getOrCreateFixedPrice()` → `FixedPriceBuilder` [Getter]
- `setFixedPrice(FixedPrice arg0)` → `FixedPricePayoutBuilder` [Setter]
- `getPaymentDates()` → `PaymentDatesBuilder` [Getter]

### FixedPricePayoutImpl
**Extends:** `PayoutBase$PayoutBaseImpl` 
**Implements:** `FixedPricePayout` 

**Key Methods:**
- `build()` → `FixedPricePayout` [Builder]
- `getSchedule()` → `CalculationSchedule` [Getter]
- `setBuilderFields(FixedPricePayoutBuilder arg0)` → `void` [Setter]
- `getFixedPrice()` → `FixedPrice` [Getter]
- `getPaymentDates()` → `PaymentDates` [Getter]

### FxFeatureBuilderImpl
**Implements:** `FxFeature$FxFeatureBuilder` 

**Fields:**
- `FieldWithMetaStringBuilder referenceCurrency`
- `CompositeBuilder composite`
- `QuantoBuilder quanto`
- `CompositeBuilder crossCurrency`

**Key Methods:**
- `build()` → `FxFeature` [Builder]
- `getOrCreateComposite()` → `CompositeBuilder` [Getter]
- `getComposite()` → `CompositeBuilder` [Getter]
- `setComposite(Composite arg0)` → `FxFeatureBuilder` [Setter]
- `getOrCreateQuanto()` → `QuantoBuilder` [Getter]
- `getReferenceCurrency()` → `FieldWithMetaStringBuilder` [Getter]
- `getCrossCurrency()` → `CompositeBuilder` [Getter]
- `setCrossCurrency(Composite arg0)` → `FxFeatureBuilder` [Setter]
- `setReferenceCurrency(FieldWithMetaString arg0)` → `FxFeatureBuilder` [Setter]
- `setReferenceCurrencyValue(String arg0)` → `FxFeatureBuilder` [Setter]

### FxFeatureImpl
**Implements:** `FxFeature` 

**Key Methods:**
- `build()` → `FxFeature` [Builder]
- `getComposite()` → `Composite` [Getter]
- `setBuilderFields(FxFeatureBuilder arg0)` → `void` [Setter]
- `getReferenceCurrency()` → `FieldWithMetaString` [Getter]
- `getCrossCurrency()` → `Composite` [Getter]
- `getQuanto()` → `Quanto` [Getter]

### KnockBuilderImpl
**Implements:** `Knock$KnockBuilder` 

**Fields:**
- `TriggerEventBuilder knockIn`
- `TriggerEventBuilder knockOut`

**Key Methods:**
- `build()` → `Knock` [Builder]
- `getKnockIn()` → `TriggerEventBuilder` [Getter]
- `getOrCreateKnockOut()` → `TriggerEventBuilder` [Getter]
- `setKnockOut(TriggerEvent arg0)` → `KnockBuilder` [Setter]
- `getOrCreateKnockIn()` → `TriggerEventBuilder` [Getter]
- `getKnockOut()` → `TriggerEventBuilder` [Getter]
- `setKnockIn(TriggerEvent arg0)` → `KnockBuilder` [Setter]

### KnockImpl
**Implements:** `Knock` 

**Key Methods:**
- `build()` → `Knock` [Builder]
- `getKnockIn()` → `TriggerEvent` [Getter]
- `setBuilderFields(KnockBuilder arg0)` → `void` [Setter]
- `getKnockOut()` → `TriggerEvent` [Getter]

### MandatoryEarlyTerminationAdjustedDatesBuilderImpl
**Implements:** `MandatoryEarlyTerminationAdjustedDates$MandatoryEarlyTerminationAdjustedDatesBuilder` 

**Fields:**
- `Date adjustedEarlyTerminationDate`
- `Date adjustedCashSettlementValuationDate`
- `Date adjustedCashSettlementPaymentDate`

**Key Methods:**
- `build()` → `MandatoryEarlyTerminationAdjustedDates` [Builder]
- `getAdjustedEarlyTerminationDate()` → `Date` [Getter]
- `setAdjustedEarlyTerminationDate(Date arg0)` → `MandatoryEarlyTerminationAdjustedDatesBuilder` [Setter]
- `setAdjustedCashSettlementValuationDate(Date arg0)` → `MandatoryEarlyTerminationAdjustedDatesBuilder` [Setter]
- `setAdjustedCashSettlementPaymentDate(Date arg0)` → `MandatoryEarlyTerminationAdjustedDatesBuilder` [Setter]
- `getAdjustedCashSettlementPaymentDate()` → `Date` [Getter]
- `getAdjustedCashSettlementValuationDate()` → `Date` [Getter]

### MandatoryEarlyTerminationAdjustedDatesImpl
**Implements:** `MandatoryEarlyTerminationAdjustedDates` 

**Key Methods:**
- `build()` → `MandatoryEarlyTerminationAdjustedDates` [Builder]
- `setBuilderFields(MandatoryEarlyTerminationAdjustedDatesBuilder arg0)` → `void` [Setter]
- `getAdjustedEarlyTerminationDate()` → `Date` [Getter]
- `getAdjustedCashSettlementPaymentDate()` → `Date` [Getter]
- `getAdjustedCashSettlementValuationDate()` → `Date` [Getter]

### MandatoryEarlyTerminationBuilderImpl
**Implements:** `MandatoryEarlyTermination$MandatoryEarlyTerminationBuilder` 

**Fields:**
- `AdjustableDateBuilder mandatoryEarlyTerminationDate`
- `CalculationAgentBuilder calculationAgent`
- `SettlementTermsBuilder cashSettlement`
- `MandatoryEarlyTerminationAdjustedDatesBuilder mandatoryEarlyTerminationAdjustedDates`
- `MetaFieldsBuilder meta`

**Key Methods:**
- `build()` → `MandatoryEarlyTermination` [Builder]
- `setCalculationAgent(CalculationAgent arg0)` → `MandatoryEarlyTerminationBuilder` [Setter]
- `getCalculationAgent()` → `CalculationAgentBuilder` [Getter]
- `getOrCreateMeta()` → `MetaFieldsBuilder` [Getter]
- `getMandatoryEarlyTerminationDate()` → `AdjustableDateBuilder` [Getter]
- `getMandatoryEarlyTerminationAdjustedDates()` → `MandatoryEarlyTerminationAdjustedDatesBuilder` [Getter]
- `getOrCreateMandatoryEarlyTerminationDate()` → `AdjustableDateBuilder` [Getter]
- `setMandatoryEarlyTerminationAdjustedDates(MandatoryEarlyTerminationAdjustedDates arg0)` → `MandatoryEarlyTerminationBuilder` [Setter]
- `setMandatoryEarlyTerminationDate(AdjustableDate arg0)` → `MandatoryEarlyTerminationBuilder` [Setter]
- `getCashSettlement()` → `SettlementTermsBuilder` [Getter]

### MandatoryEarlyTerminationImpl
**Implements:** `MandatoryEarlyTermination` 

**Key Methods:**
- `build()` → `MandatoryEarlyTermination` [Builder]
- `getCalculationAgent()` → `CalculationAgent` [Getter]
- `setBuilderFields(MandatoryEarlyTerminationBuilder arg0)` → `void` [Setter]
- `getMandatoryEarlyTerminationDate()` → `AdjustableDate` [Getter]
- `getMandatoryEarlyTerminationAdjustedDates()` → `MandatoryEarlyTerminationAdjustedDates` [Getter]
- `getCashSettlement()` → `SettlementTerms` [Getter]
- `getMeta()` → `MetaFields` [Getter]

### ManualExerciseBuilderImpl
**Implements:** `ManualExercise$ManualExerciseBuilder` 

**Fields:**
- `ExerciseNoticeBuilder exerciseNotice`
- `Boolean fallbackExercise`

**Key Methods:**
- `build()` → `ManualExercise` [Builder]
- `getExerciseNotice()` → `ExerciseNoticeBuilder` [Getter]
- `setExerciseNotice(ExerciseNotice arg0)` → `ManualExerciseBuilder` [Setter]
- `getOrCreateExerciseNotice()` → `ExerciseNoticeBuilder` [Getter]
- `getFallbackExercise()` → `Boolean` [Getter]
- `setFallbackExercise(Boolean arg0)` → `ManualExerciseBuilder` [Setter]

### ManualExerciseImpl
**Implements:** `ManualExercise` 

**Key Methods:**
- `build()` → `ManualExercise` [Builder]
- `getExerciseNotice()` → `ExerciseNotice` [Getter]
- `setBuilderFields(ManualExerciseBuilder arg0)` → `void` [Setter]
- `getFallbackExercise()` → `Boolean` [Getter]

### MultipleExerciseBuilderImpl
**Extends:** `PartialExercise$PartialExerciseBuilderImpl` 
**Implements:** `MultipleExercise$MultipleExerciseBuilder` 

**Fields:**
- `BigDecimal maximumNotionalAmount`
- `Integer maximumNumberOfOptions`

**Key Methods:**
- `build()` → `MultipleExercise` [Builder]
- `getMaximumNumberOfOptions()` → `Integer` [Getter]
- `getMaximumNotionalAmount()` → `BigDecimal` [Getter]
- `setMinimumNumberOfOptions(Integer arg0)` → `MultipleExerciseBuilder` [Setter]
- `setIntegralMultipleAmount(BigDecimal arg0)` → `MultipleExerciseBuilder` [Setter]
- `setMinimumNotionalAmount(BigDecimal arg0)` → `MultipleExerciseBuilder` [Setter]
- `setNotionaReference(ReferenceWithMetaMoney arg0)` → `MultipleExerciseBuilder` [Setter]
- `setNotionaReferenceValue(Money arg0)` → `MultipleExerciseBuilder` [Setter]
- `setMaximumNotionalAmount(BigDecimal arg0)` → `MultipleExerciseBuilder` [Setter]
- `setMaximumNumberOfOptions(Integer arg0)` → `MultipleExerciseBuilder` [Setter]

### MultipleExerciseImpl
**Extends:** `PartialExercise$PartialExerciseImpl` 
**Implements:** `MultipleExercise` 

**Key Methods:**
- `build()` → `MultipleExercise` [Builder]
- `setBuilderFields(MultipleExerciseBuilder arg0)` → `void` [Setter]
- `getMaximumNumberOfOptions()` → `Integer` [Getter]
- `getMaximumNotionalAmount()` → `BigDecimal` [Getter]

### NonTransferableProductBuilderImpl
**Implements:** `NonTransferableProduct$NonTransferableProductBuilder` 

**Fields:**
- `List (List) identifier`
- `List (List) taxonomy`
- `EconomicTermsBuilder economicTerms`
- `MetaFieldsBuilder meta`

**Key Methods:**
- `build()` → `NonTransferableProduct` [Builder]
- `setTaxonomy(List arg0)` → `NonTransferableProductBuilder` [Setter]
- `getOrCreateTaxonomy(int arg0)` → `ProductTaxonomyBuilder` [Getter]
- `setEconomicTerms(EconomicTerms arg0)` → `NonTransferableProductBuilder` [Setter]
- `getEconomicTerms()` → `EconomicTermsBuilder` [Getter]
- `getOrCreateIdentifier(int arg0)` → `ProductIdentifierBuilder` [Getter]
- `setIdentifier(List arg0)` → `NonTransferableProductBuilder` [Setter]
- `getOrCreateMeta()` → `MetaFieldsBuilder` [Getter]
- `getOrCreateEconomicTerms()` → `EconomicTermsBuilder` [Getter]
- `setMeta(MetaFields arg0)` → `NonTransferableProductBuilder` [Setter]

### NonTransferableProductImpl
**Implements:** `NonTransferableProduct` 

**Key Methods:**
- `build()` → `NonTransferableProduct` [Builder]
- `getEconomicTerms()` → `EconomicTerms` [Getter]
- `setBuilderFields(NonTransferableProductBuilder arg0)` → `void` [Setter]
- `getMeta()` → `MetaFields` [Getter]
- `getTaxonomy()` → `List` [Getter]
- `getIdentifier()` → `List` [Getter]

### OptionFeatureBuilderImpl
**Implements:** `OptionFeature$OptionFeatureBuilder` 

**Fields:**
- `List (List) fxFeature`
- `StrategyFeatureBuilder strategyFeature`
- `AveragingCalculationBuilder averagingFeature`
- `BarrierBuilder barrier`
- `KnockBuilder knock`
- `PassThroughBuilder passThrough`

**Key Methods:**
- `build()` → `OptionFeature` [Builder]
- `setBarrier(Barrier arg0)` → `OptionFeatureBuilder` [Setter]
- `setKnock(Knock arg0)` → `OptionFeatureBuilder` [Setter]
- `getStrategyFeature()` → `StrategyFeatureBuilder` [Getter]
- `getAveragingFeature()` → `AveragingCalculationBuilder` [Getter]
- `getFxFeature()` → `List` [Getter]
- `getPassThrough()` → `PassThroughBuilder` [Getter]
- `getOrCreateBarrier()` → `BarrierBuilder` [Getter]
- `getOrCreateStrategyFeature()` → `StrategyFeatureBuilder` [Getter]
- `getOrCreateAveragingFeature()` → `AveragingCalculationBuilder` [Getter]

### OptionFeatureImpl
**Implements:** `OptionFeature` 

**Key Methods:**
- `build()` → `OptionFeature` [Builder]
- `getStrategyFeature()` → `StrategyFeature` [Getter]
- `getAveragingFeature()` → `AveragingCalculation` [Getter]
- `getFxFeature()` → `List` [Getter]
- `getPassThrough()` → `PassThrough` [Getter]
- `setBuilderFields(OptionFeatureBuilder arg0)` → `void` [Setter]
- `getBarrier()` → `Barrier` [Getter]
- `getKnock()` → `Knock` [Getter]

### OptionPayoutBuilderImpl
**Extends:** `PayoutBase$PayoutBaseBuilderImpl` 
**Implements:** `OptionPayout$OptionPayoutBuilder` 

**Fields:**
- `BuyerSellerBuilder buyerSeller`
- `OptionFeatureBuilder feature`
- `ObservationTermsBuilder observationTerms`
- `CalculationScheduleBuilder schedule`
- `AssetDeliveryInformationBuilder delivery`
- `UnderlierBuilder underlier`
- `OptionTypeEnum optionType`
- `ExerciseTermsBuilder exerciseTerms`
- `OptionStrikeBuilder strike`

**Key Methods:**
- `build()` → `OptionPayout` [Builder]
- `getOrCreateObservationTerms()` → `ObservationTermsBuilder` [Getter]
- `getStrike()` → `OptionStrikeBuilder` [Getter]
- `setStrike(OptionStrike arg0)` → `OptionPayoutBuilder` [Setter]
- `getOrCreateUnderlier()` → `UnderlierBuilder` [Getter]
- `getUnderlier()` → `UnderlierBuilder` [Getter]
- `setUnderlier(Underlier arg0)` → `OptionPayoutBuilder` [Setter]
- `getOrCreateBuyerSeller()` → `BuyerSellerBuilder` [Getter]
- `getSchedule()` → `CalculationScheduleBuilder` [Getter]
- `setDelivery(AssetDeliveryInformation arg0)` → `OptionPayoutBuilder` [Setter]

### OptionPayoutImpl
**Extends:** `PayoutBase$PayoutBaseImpl` 
**Implements:** `OptionPayout` 

**Key Methods:**
- `build()` → `OptionPayout` [Builder]
- `getStrike()` → `OptionStrike` [Getter]
- `getUnderlier()` → `Underlier` [Getter]
- `getSchedule()` → `CalculationSchedule` [Getter]
- `getDelivery()` → `AssetDeliveryInformation` [Getter]
- `getBuyerSeller()` → `BuyerSeller` [Getter]
- `getExerciseTerms()` → `ExerciseTerms` [Getter]
- `getFeature()` → `OptionFeature` [Getter]
- `setBuilderFields(OptionPayoutBuilder arg0)` → `void` [Setter]
- `getObservationTerms()` → `ObservationTerms` [Getter]

### OptionStrikeBuilderImpl
**Implements:** `OptionStrike$OptionStrikeBuilder` 

**Fields:**
- `PriceBuilder strikePrice`
- `ReferenceWithMetaFixedRateSpecificationBuilder strikeReference`
- `ReferenceSwapCurveBuilder referenceSwapCurve`
- `AveragingStrikeFeatureBuilder averagingStrikeFeature`

**Key Methods:**
- `build()` → `OptionStrike` [Builder]
- `getStrikeReference()` → `ReferenceWithMetaFixedRateSpecificationBuilder` [Getter]
- `getAveragingStrikeFeature()` → `AveragingStrikeFeatureBuilder` [Getter]
- `getStrikePrice()` → `PriceBuilder` [Getter]
- `getReferenceSwapCurve()` → `ReferenceSwapCurveBuilder` [Getter]
- `getOrCreateReferenceSwapCurve()` → `ReferenceSwapCurveBuilder` [Getter]
- `getOrCreateAveragingStrikeFeature()` → `AveragingStrikeFeatureBuilder` [Getter]
- `setStrikePrice(Price arg0)` → `OptionStrikeBuilder` [Setter]
- `setReferenceSwapCurve(ReferenceSwapCurve arg0)` → `OptionStrikeBuilder` [Setter]
- `getOrCreateStrikeReference()` → `ReferenceWithMetaFixedRateSpecificationBuilder` [Getter]

### OptionStrikeImpl
**Implements:** `OptionStrike` 

**Key Methods:**
- `build()` → `OptionStrike` [Builder]
- `getStrikeReference()` → `ReferenceWithMetaFixedRateSpecification` [Getter]
- `getAveragingStrikeFeature()` → `AveragingStrikeFeature` [Getter]
- `getStrikePrice()` → `Price` [Getter]
- `getReferenceSwapCurve()` → `ReferenceSwapCurve` [Getter]
- `setBuilderFields(OptionStrikeBuilder arg0)` → `void` [Setter]

### OptionalEarlyTerminationAdjustedDatesBuilderImpl
**Implements:** `OptionalEarlyTerminationAdjustedDates$OptionalEarlyTerminationAdjustedDatesBuilder` 

**Fields:**
- `List (List) earlyTerminationEvent`

**Key Methods:**
- `build()` → `OptionalEarlyTerminationAdjustedDates` [Builder]
- `getOrCreateEarlyTerminationEvent(int arg0)` → `EarlyTerminationEventBuilder` [Getter]
- `setEarlyTerminationEvent(List arg0)` → `OptionalEarlyTerminationAdjustedDatesBuilder` [Setter]
- `getEarlyTerminationEvent()` → `List` [Getter]

### OptionalEarlyTerminationAdjustedDatesImpl
**Implements:** `OptionalEarlyTerminationAdjustedDates` 

**Key Methods:**
- `build()` → `OptionalEarlyTerminationAdjustedDates` [Builder]
- `setBuilderFields(OptionalEarlyTerminationAdjustedDatesBuilder arg0)` → `void` [Setter]
- `getEarlyTerminationEvent()` → `List` [Getter]

### OptionalEarlyTerminationBuilderImpl
**Implements:** `OptionalEarlyTermination$OptionalEarlyTerminationBuilder` 

**Fields:**
- `BuyerSellerBuilder singlePartyOption`
- `Boolean mutualEarlyTermination`
- `List (List) exerciseNotice`
- `Boolean followUpConfirmation`
- `CalculationAgentBuilder calculationAgent`
- `SettlementTermsBuilder cashSettlement`
- `OptionalEarlyTerminationAdjustedDatesBuilder optionalEarlyTerminationAdjustedDates`
- `ExerciseTermsBuilder exerciseTerms`

**Key Methods:**
- `build()` → `OptionalEarlyTermination` [Builder]
- `setCalculationAgent(CalculationAgent arg0)` → `OptionalEarlyTerminationBuilder` [Setter]
- `getCalculationAgent()` → `CalculationAgentBuilder` [Getter]
- `setExerciseTerms(ExerciseTerms arg0)` → `OptionalEarlyTerminationBuilder` [Setter]
- `getOrCreateExerciseTerms()` → `ExerciseTermsBuilder` [Getter]
- `getSinglePartyOption()` → `BuyerSellerBuilder` [Getter]
- `getExerciseTerms()` → `ExerciseTermsBuilder` [Getter]
- `getFollowUpConfirmation()` → `Boolean` [Getter]
- `getExerciseNotice()` → `List` [Getter]
- `getOptionalEarlyTerminationAdjustedDates()` → `OptionalEarlyTerminationAdjustedDatesBuilder` [Getter]

### OptionalEarlyTerminationImpl
**Implements:** `OptionalEarlyTermination` 

**Key Methods:**
- `build()` → `OptionalEarlyTermination` [Builder]
- `getCalculationAgent()` → `CalculationAgent` [Getter]
- `getSinglePartyOption()` → `BuyerSeller` [Getter]
- `getExerciseTerms()` → `ExerciseTerms` [Getter]
- `getFollowUpConfirmation()` → `Boolean` [Getter]
- `getExerciseNotice()` → `List` [Getter]
- `setBuilderFields(OptionalEarlyTerminationBuilder arg0)` → `void` [Setter]
- `getOptionalEarlyTerminationAdjustedDates()` → `OptionalEarlyTerminationAdjustedDates` [Getter]
- `getCashSettlement()` → `SettlementTerms` [Getter]
- `getMutualEarlyTermination()` → `Boolean` [Getter]

### PartialExerciseBuilderImpl
**Implements:** `PartialExercise$PartialExerciseBuilder` 

**Fields:**
- `ReferenceWithMetaMoneyBuilder notionaReference`
- `BigDecimal integralMultipleAmount`
- `BigDecimal minimumNotionalAmount`
- `Integer minimumNumberOfOptions`

**Key Methods:**
- `build()` → `PartialExercise` [Builder]
- `getOrCreateNotionaReference()` → `ReferenceWithMetaMoneyBuilder` [Getter]
- `getNotionaReference()` → `ReferenceWithMetaMoneyBuilder` [Getter]
- `getIntegralMultipleAmount()` → `BigDecimal` [Getter]
- `getMinimumNotionalAmount()` → `BigDecimal` [Getter]
- `getMinimumNumberOfOptions()` → `Integer` [Getter]
- `setMinimumNumberOfOptions(Integer arg0)` → `PartialExerciseBuilder` [Setter]
- `setIntegralMultipleAmount(BigDecimal arg0)` → `PartialExerciseBuilder` [Setter]
- `setMinimumNotionalAmount(BigDecimal arg0)` → `PartialExerciseBuilder` [Setter]
- `setNotionaReference(ReferenceWithMetaMoney arg0)` → `PartialExerciseBuilder` [Setter]

### PartialExerciseImpl
**Implements:** `PartialExercise` 

**Key Methods:**
- `build()` → `PartialExercise` [Builder]
- `setBuilderFields(PartialExerciseBuilder arg0)` → `void` [Setter]
- `getNotionaReference()` → `ReferenceWithMetaMoney` [Getter]
- `getIntegralMultipleAmount()` → `BigDecimal` [Getter]
- `getMinimumNotionalAmount()` → `BigDecimal` [Getter]
- `getMinimumNumberOfOptions()` → `Integer` [Getter]

### PassThroughBuilderImpl
**Implements:** `PassThrough$PassThroughBuilder` 

**Fields:**
- `List (List) passThroughItem`

**Key Methods:**
- `build()` → `PassThrough` [Builder]
- `getPassThroughItem()` → `List` [Getter]
- `setPassThroughItem(List arg0)` → `PassThroughBuilder` [Setter]
- `getOrCreatePassThroughItem(int arg0)` → `PassThroughItemBuilder` [Getter]

### PassThroughImpl
**Implements:** `PassThrough` 

**Key Methods:**
- `build()` → `PassThrough` [Builder]
- `setBuilderFields(PassThroughBuilder arg0)` → `void` [Setter]
- `getPassThroughItem()` → `List` [Getter]

### PassThroughItemBuilderImpl
**Implements:** `PassThroughItem$PassThroughItemBuilder` 

**Fields:**
- `PayerReceiverBuilder payerReceiver`
- `BigDecimal passThroughPercentage`

**Key Methods:**
- `build()` → `PassThroughItem` [Builder]
- `getPayerReceiver()` → `PayerReceiverBuilder` [Getter]
- `getOrCreatePayerReceiver()` → `PayerReceiverBuilder` [Getter]
- `setPayerReceiver(PayerReceiver arg0)` → `PassThroughItemBuilder` [Setter]
- `setPassThroughPercentage(BigDecimal arg0)` → `PassThroughItemBuilder` [Setter]
- `getPassThroughPercentage()` → `BigDecimal` [Getter]

### PassThroughItemImpl
**Implements:** `PassThroughItem` 

**Key Methods:**
- `build()` → `PassThroughItem` [Builder]
- `getPayerReceiver()` → `PayerReceiver` [Getter]
- `setBuilderFields(PassThroughItemBuilder arg0)` → `void` [Setter]
- `getPassThroughPercentage()` → `BigDecimal` [Getter]

### PayoutBuilderImpl
**Implements:** `Payout$PayoutBuilder` 

**Fields:**
- `AssetPayoutBuilder assetPayout`
- `CommodityPayoutBuilder commodityPayout`
- `CreditDefaultPayoutBuilder creditDefaultPayout`
- `FixedPricePayoutBuilder fixedPricePayout`
- `InterestRatePayoutBuilder interestRatePayout`
- `OptionPayoutBuilder optionPayout`
- `PerformancePayoutBuilder performancePayout`
- `SettlementPayoutBuilder settlementPayout`
- `MetaFieldsBuilder meta`

**Key Methods:**
- `build()` → `Payout` [Builder]
- `getCreditDefaultPayout()` → `CreditDefaultPayoutBuilder` [Getter]
- `setAssetPayout(AssetPayout arg0)` → `PayoutBuilder` [Setter]
- `setCommodityPayout(CommodityPayout arg0)` → `PayoutBuilder` [Setter]
- `setOptionPayout(OptionPayout arg0)` → `PayoutBuilder` [Setter]
- `setCreditDefaultPayout(CreditDefaultPayout arg0)` → `PayoutBuilder` [Setter]
- `setSettlementPayout(SettlementPayout arg0)` → `PayoutBuilder` [Setter]
- `setFixedPricePayout(FixedPricePayout arg0)` → `PayoutBuilder` [Setter]
- `getOrCreateAssetPayout()` → `AssetPayoutBuilder` [Getter]
- `getOrCreateCommodityPayout()` → `CommodityPayoutBuilder` [Getter]

### PayoutImpl
**Implements:** `Payout` 

**Key Methods:**
- `build()` → `Payout` [Builder]
- `getCreditDefaultPayout()` → `CreditDefaultPayout` [Getter]
- `setBuilderFields(PayoutBuilder arg0)` → `void` [Setter]
- `getInterestRatePayout()` → `InterestRatePayout` [Getter]
- `getMeta()` → `MetaFields` [Getter]
- `getCommodityPayout()` → `CommodityPayout` [Getter]
- `getPerformancePayout()` → `PerformancePayout` [Getter]
- `getSettlementPayout()` → `SettlementPayout` [Getter]
- `getAssetPayout()` → `AssetPayout` [Getter]
- `getFixedPricePayout()` → `FixedPricePayout` [Getter]

### PerformancePayoutBuilderImpl
**Extends:** `PayoutBase$PayoutBaseBuilderImpl` 
**Implements:** `PerformancePayout$PerformancePayoutBuilder` 

**Fields:**
- `ObservationTermsBuilder observationTerms`
- `ValuationDatesBuilder valuationDates`
- `PaymentDatesBuilder paymentDates`
- `UnderlierBuilder underlier`
- `List (List) fxFeature`
- `ReturnTermsBuilder returnTerms`
- `List (List) portfolioReturnTerms`
- `List (List) initialValuationPrice`
- `List (List) interimValuationPrice`
- `List (List) finalValuationPrice`

**Key Methods:**
- `build()` → `PerformancePayout` [Builder]
- `getOrCreateObservationTerms()` → `ObservationTermsBuilder` [Getter]
- `getInterimValuationPrice()` → `List` [Getter]
- `getPortfolioReturnTerms()` → `List` [Getter]
- `getFinalValuationPrice()` → `List` [Getter]
- `getInitialValuationPrice()` → `List` [Getter]
- `getOrCreateUnderlier()` → `UnderlierBuilder` [Getter]
- `getUnderlier()` → `UnderlierBuilder` [Getter]
- `setUnderlier(Underlier arg0)` → `PerformancePayoutBuilder` [Setter]
- `setObservationTerms(ObservationTerms arg0)` → `PerformancePayoutBuilder` [Setter]

### PerformancePayoutImpl
**Extends:** `PayoutBase$PayoutBaseImpl` 
**Implements:** `PerformancePayout` 

**Key Methods:**
- `build()` → `PerformancePayout` [Builder]
- `getInterimValuationPrice()` → `List` [Getter]
- `getPortfolioReturnTerms()` → `List` [Getter]
- `getFinalValuationPrice()` → `List` [Getter]
- `getInitialValuationPrice()` → `List` [Getter]
- `getUnderlier()` → `Underlier` [Getter]
- `getFxFeature()` → `List` [Getter]
- `getReturnTerms()` → `ReturnTerms` [Getter]
- `setBuilderFields(PerformancePayoutBuilder arg0)` → `void` [Setter]
- `getObservationTerms()` → `ObservationTerms` [Getter]

### PortfolioReturnTermsBuilderImpl
**Extends:** `ReturnTerms$ReturnTermsBuilderImpl` 
**Implements:** `PortfolioReturnTerms$PortfolioReturnTermsBuilder` 

**Fields:**
- `PayerReceiverBuilder payerReceiver`
- `ReferenceWithMetaObservableBuilder underlier`
- `ReferenceWithMetaNonNegativeQuantityScheduleBuilder quantity`
- `List (List) initialValuationPrice`
- `List (List) interimValuationPrice`
- `List (List) finalValuationPrice`
- `MetaFieldsBuilder meta`

**Key Methods:**
- `build()` → `PortfolioReturnTerms` [Builder]
- `getInterimValuationPrice()` → `List` [Getter]
- `getFinalValuationPrice()` → `List` [Getter]
- `getInitialValuationPrice()` → `List` [Getter]
- `getOrCreateUnderlier()` → `ReferenceWithMetaObservableBuilder` [Getter]
- `getUnderlier()` → `ReferenceWithMetaObservableBuilder` [Getter]
- `setUnderlier(ReferenceWithMetaObservable arg0)` → `PortfolioReturnTermsBuilder` [Setter]
- `getPayerReceiver()` → `PayerReceiverBuilder` [Getter]
- `getQuantity()` → `ReferenceWithMetaNonNegativeQuantityScheduleBuilder` [Getter]
- `getOrCreateQuantity()` → `ReferenceWithMetaNonNegativeQuantityScheduleBuilder` [Getter]

### PortfolioReturnTermsImpl
**Extends:** `ReturnTerms$ReturnTermsImpl` 
**Implements:** `PortfolioReturnTerms` 

**Key Methods:**
- `build()` → `PortfolioReturnTerms` [Builder]
- `getInterimValuationPrice()` → `List` [Getter]
- `getFinalValuationPrice()` → `List` [Getter]
- `getInitialValuationPrice()` → `List` [Getter]
- `getUnderlier()` → `ReferenceWithMetaObservable` [Getter]
- `getPayerReceiver()` → `PayerReceiver` [Getter]
- `getQuantity()` → `ReferenceWithMetaNonNegativeQuantitySchedule` [Getter]
- `setBuilderFields(PortfolioReturnTermsBuilder arg0)` → `void` [Setter]
- `getMeta()` → `MetaFields` [Getter]

### ProductBuilderImpl
**Implements:** `Product$ProductBuilder` 

**Fields:**
- `TransferableProductBuilder transferableProduct`
- `NonTransferableProductBuilder nonTransferableProduct`

**Key Methods:**
- `build()` → `Product` [Builder]
- `setTransferableProduct(TransferableProduct arg0)` → `ProductBuilder` [Setter]
- `setNonTransferableProduct(NonTransferableProduct arg0)` → `ProductBuilder` [Setter]
- `getTransferableProduct()` → `TransferableProductBuilder` [Getter]
- `getNonTransferableProduct()` → `NonTransferableProductBuilder` [Getter]
- `getOrCreateNonTransferableProduct()` → `NonTransferableProductBuilder` [Getter]
- `getOrCreateTransferableProduct()` → `TransferableProductBuilder` [Getter]

### ProductImpl
**Implements:** `Product` 

**Key Methods:**
- `build()` → `Product` [Builder]
- `setBuilderFields(ProductBuilder arg0)` → `void` [Setter]
- `getTransferableProduct()` → `TransferableProduct` [Getter]
- `getNonTransferableProduct()` → `NonTransferableProduct` [Getter]

### QuantoBuilderImpl
**Implements:** `Quanto$QuantoBuilder` 

**Fields:**
- `List (List) fxRate`
- `FxSpotRateSourceBuilder fxSpotRateSource`
- `BusinessCenterTimeBuilder fixingTime`

**Key Methods:**
- `build()` → `Quanto` [Builder]
- `getOrCreateFxSpotRateSource()` → `FxSpotRateSourceBuilder` [Getter]
- `setFxRate(List arg0)` → `QuantoBuilder` [Setter]
- `getFxRate()` → `List` [Getter]
- `getFxSpotRateSource()` → `FxSpotRateSourceBuilder` [Getter]
- `setFixingTime(BusinessCenterTime arg0)` → `QuantoBuilder` [Setter]
- `getFixingTime()` → `BusinessCenterTimeBuilder` [Getter]
- `getOrCreateFxRate(int arg0)` → `FxRateBuilder` [Getter]
- `setFxSpotRateSource(FxSpotRateSource arg0)` → `QuantoBuilder` [Setter]
- `getOrCreateFixingTime()` → `BusinessCenterTimeBuilder` [Getter]

### QuantoImpl
**Implements:** `Quanto` 

**Key Methods:**
- `build()` → `Quanto` [Builder]
- `setBuilderFields(QuantoBuilder arg0)` → `void` [Setter]
- `getFxRate()` → `List` [Getter]
- `getFxSpotRateSource()` → `FxSpotRateSource` [Getter]
- `getFixingTime()` → `BusinessCenterTime` [Getter]

### ReturnTermsBuilderImpl
**Implements:** `ReturnTerms$ReturnTermsBuilder` 

**Fields:**
- `PriceReturnTermsBuilder priceReturnTerms`
- `DividendReturnTermsBuilder dividendReturnTerms`
- `VarianceReturnTermsBuilder varianceReturnTerms`
- `VolatilityReturnTermsBuilder volatilityReturnTerms`
- `CorrelationReturnTermsBuilder correlationReturnTerms`

**Key Methods:**
- `build()` → `ReturnTerms` [Builder]
- `getCorrelationReturnTerms()` → `CorrelationReturnTermsBuilder` [Getter]
- `getVarianceReturnTerms()` → `VarianceReturnTermsBuilder` [Getter]
- `getVolatilityReturnTerms()` → `VolatilityReturnTermsBuilder` [Getter]
- `getDividendReturnTerms()` → `DividendReturnTermsBuilder` [Getter]
- `getPriceReturnTerms()` → `PriceReturnTermsBuilder` [Getter]
- `setVarianceReturnTerms(VarianceReturnTerms arg0)` → `ReturnTermsBuilder` [Setter]
- `setVolatilityReturnTerms(VolatilityReturnTerms arg0)` → `ReturnTermsBuilder` [Setter]
- `setDividendReturnTerms(DividendReturnTerms arg0)` → `ReturnTermsBuilder` [Setter]
- `setPriceReturnTerms(PriceReturnTerms arg0)` → `ReturnTermsBuilder` [Setter]

### ReturnTermsImpl
**Implements:** `ReturnTerms` 

**Key Methods:**
- `build()` → `ReturnTerms` [Builder]
- `getCorrelationReturnTerms()` → `CorrelationReturnTerms` [Getter]
- `getVarianceReturnTerms()` → `VarianceReturnTerms` [Getter]
- `getVolatilityReturnTerms()` → `VolatilityReturnTerms` [Getter]
- `getDividendReturnTerms()` → `DividendReturnTerms` [Getter]
- `getPriceReturnTerms()` → `PriceReturnTerms` [Getter]
- `setBuilderFields(ReturnTermsBuilder arg0)` → `void` [Setter]

### SchedulePeriodBuilderImpl
**Implements:** `SchedulePeriod$SchedulePeriodBuilder` 

**Fields:**
- `DateRangeBuilder calculationPeriod`
- `Date paymentDate`
- `DateRangeBuilder fixingPeriod`
- `CalculationScheduleDeliveryPeriodsBuilder deliveryPeriod`

**Key Methods:**
- `build()` → `SchedulePeriod` [Builder]
- `setCalculationPeriod(DateRange arg0)` → `SchedulePeriodBuilder` [Setter]
- `getCalculationPeriod()` → `DateRangeBuilder` [Getter]
- `getDeliveryPeriod()` → `CalculationScheduleDeliveryPeriodsBuilder` [Getter]
- `getFixingPeriod()` → `DateRangeBuilder` [Getter]
- `setDeliveryPeriod(CalculationScheduleDeliveryPeriods arg0)` → `SchedulePeriodBuilder` [Setter]
- `getOrCreateDeliveryPeriod()` → `CalculationScheduleDeliveryPeriodsBuilder` [Getter]
- `getOrCreateFixingPeriod()` → `DateRangeBuilder` [Getter]
- `setFixingPeriod(DateRange arg0)` → `SchedulePeriodBuilder` [Setter]
- `getPaymentDate()` → `Date` [Getter]

### SchedulePeriodImpl
**Implements:** `SchedulePeriod` 

**Key Methods:**
- `build()` → `SchedulePeriod` [Builder]
- `getCalculationPeriod()` → `DateRange` [Getter]
- `setBuilderFields(SchedulePeriodBuilder arg0)` → `void` [Setter]
- `getDeliveryPeriod()` → `CalculationScheduleDeliveryPeriods` [Getter]
- `getFixingPeriod()` → `DateRange` [Getter]
- `getPaymentDate()` → `Date` [Getter]

### SettlementPayoutBuilderImpl
**Extends:** `PayoutBase$PayoutBaseBuilderImpl` 
**Implements:** `SettlementPayout$SettlementPayoutBuilder` 

**Fields:**
- `UnderlierBuilder underlier`
- `String deliveryTerm`
- `AssetDeliveryInformationBuilder delivery`
- `CalculationScheduleBuilder schedule`

**Key Methods:**
- `build()` → `SettlementPayout` [Builder]
- `getOrCreateUnderlier()` → `UnderlierBuilder` [Getter]
- `getUnderlier()` → `UnderlierBuilder` [Getter]
- `setUnderlier(Underlier arg0)` → `SettlementPayoutBuilder` [Setter]
- `getSchedule()` → `CalculationScheduleBuilder` [Getter]
- `setDelivery(AssetDeliveryInformation arg0)` → `SettlementPayoutBuilder` [Setter]
- `getDelivery()` → `AssetDeliveryInformationBuilder` [Getter]
- `setSchedule(CalculationSchedule arg0)` → `SettlementPayoutBuilder` [Setter]
- `setPrincipalPayment(PrincipalPayments arg0)` → `SettlementPayoutBuilder` [Setter]
- `getOrCreateSchedule()` → `CalculationScheduleBuilder` [Getter]

### SettlementPayoutImpl
**Extends:** `PayoutBase$PayoutBaseImpl` 
**Implements:** `SettlementPayout` 

**Key Methods:**
- `build()` → `SettlementPayout` [Builder]
- `getUnderlier()` → `Underlier` [Getter]
- `getSchedule()` → `CalculationSchedule` [Getter]
- `getDelivery()` → `AssetDeliveryInformation` [Getter]
- `setBuilderFields(SettlementPayoutBuilder arg0)` → `void` [Setter]
- `getDeliveryTerm()` → `String` [Getter]

### StrategyFeatureBuilderImpl
**Implements:** `StrategyFeature$StrategyFeatureBuilder` 

**Fields:**
- `StrikeSpreadBuilder strikeSpread`
- `CalendarSpreadBuilder calendarSpread`

**Key Methods:**
- `build()` → `StrategyFeature` [Builder]
- `getStrikeSpread()` → `StrikeSpreadBuilder` [Getter]
- `getCalendarSpread()` → `CalendarSpreadBuilder` [Getter]
- `setStrikeSpread(StrikeSpread arg0)` → `StrategyFeatureBuilder` [Setter]
- `getOrCreateCalendarSpread()` → `CalendarSpreadBuilder` [Getter]
- `setCalendarSpread(CalendarSpread arg0)` → `StrategyFeatureBuilder` [Setter]
- `getOrCreateStrikeSpread()` → `StrikeSpreadBuilder` [Getter]

### StrategyFeatureImpl
**Implements:** `StrategyFeature` 

**Key Methods:**
- `build()` → `StrategyFeature` [Builder]
- `setBuilderFields(StrategyFeatureBuilder arg0)` → `void` [Setter]
- `getStrikeSpread()` → `StrikeSpread` [Getter]
- `getCalendarSpread()` → `CalendarSpread` [Getter]

### StrikeBuilderImpl
**Implements:** `Strike$StrikeBuilder` 

**Fields:**
- `BigDecimal strikeRate`
- `PayerReceiverEnum buyer`
- `PayerReceiverEnum seller`
- `MetaFieldsBuilder meta`

**Key Methods:**
- `build()` → `Strike` [Builder]
- `getSeller()` → `PayerReceiverEnum` [Getter]
- `getBuyer()` → `PayerReceiverEnum` [Getter]
- `getOrCreateMeta()` → `MetaFieldsBuilder` [Getter]
- `getStrikeRate()` → `BigDecimal` [Getter]
- `setStrikeRate(BigDecimal arg0)` → `StrikeBuilder` [Setter]
- `setSeller(PayerReceiverEnum arg0)` → `StrikeBuilder` [Setter]
- `setBuyer(PayerReceiverEnum arg0)` → `StrikeBuilder` [Setter]
- `setMeta(MetaFields arg0)` → `StrikeBuilder` [Setter]
- `getMeta()` → `MetaFieldsBuilder` [Getter]

### StrikeImpl
**Implements:** `Strike` 

**Key Methods:**
- `build()` → `Strike` [Builder]
- `getSeller()` → `PayerReceiverEnum` [Getter]
- `getBuyer()` → `PayerReceiverEnum` [Getter]
- `setBuilderFields(StrikeBuilder arg0)` → `void` [Setter]
- `getStrikeRate()` → `BigDecimal` [Getter]
- `getMeta()` → `MetaFields` [Getter]

### StrikeScheduleBuilderImpl
**Extends:** `RateSchedule$RateScheduleBuilderImpl` 
**Implements:** `StrikeSchedule$StrikeScheduleBuilder` 

**Fields:**
- `PayerReceiverEnum buyer`
- `PayerReceiverEnum seller`

**Key Methods:**
- `build()` → `StrikeSchedule` [Builder]
- `getSeller()` → `PayerReceiverEnum` [Getter]
- `getBuyer()` → `PayerReceiverEnum` [Getter]
- `setPriceValue(PriceSchedule arg0)` → `StrikeScheduleBuilder` [Setter]
- `setPrice(ReferenceWithMetaPriceSchedule arg0)` → `StrikeScheduleBuilder` [Setter]
- `setSeller(PayerReceiverEnum arg0)` → `StrikeScheduleBuilder` [Setter]
- `setBuyer(PayerReceiverEnum arg0)` → `StrikeScheduleBuilder` [Setter]

### StrikeScheduleImpl
**Extends:** `RateSchedule$RateScheduleImpl` 
**Implements:** `StrikeSchedule` 

**Key Methods:**
- `build()` → `StrikeSchedule` [Builder]
- `getSeller()` → `PayerReceiverEnum` [Getter]
- `getBuyer()` → `PayerReceiverEnum` [Getter]
- `setBuilderFields(StrikeScheduleBuilder arg0)` → `void` [Setter]

### StrikeSpreadBuilderImpl
**Implements:** `StrikeSpread$StrikeSpreadBuilder` 

**Fields:**
- `OptionStrikeBuilder upperStrike`
- `BigDecimal upperStrikeNumberOfOptions`

**Key Methods:**
- `build()` → `StrikeSpread` [Builder]
- `getUpperStrikeNumberOfOptions()` → `BigDecimal` [Getter]
- `setUpperStrikeNumberOfOptions(BigDecimal arg0)` → `StrikeSpreadBuilder` [Setter]
- `getUpperStrike()` → `OptionStrikeBuilder` [Getter]
- `setUpperStrike(OptionStrike arg0)` → `StrikeSpreadBuilder` [Setter]
- `getOrCreateUpperStrike()` → `OptionStrikeBuilder` [Getter]

### StrikeSpreadImpl
**Implements:** `StrikeSpread` 

**Key Methods:**
- `build()` → `StrikeSpread` [Builder]
- `setBuilderFields(StrikeSpreadBuilder arg0)` → `void` [Setter]
- `getUpperStrikeNumberOfOptions()` → `BigDecimal` [Getter]
- `getUpperStrike()` → `OptionStrike` [Getter]

### TerminationProvisionBuilderImpl
**Implements:** `TerminationProvision$TerminationProvisionBuilder` 

**Fields:**
- `CancelableProvisionBuilder cancelableProvision`
- `EarlyTerminationProvisionBuilder earlyTerminationProvision`
- `EvergreenProvisionBuilder evergreenProvision`
- `ExtendibleProvisionBuilder extendibleProvision`

**Key Methods:**
- `build()` → `TerminationProvision` [Builder]
- `setCancelableProvision(CancelableProvision arg0)` → `TerminationProvisionBuilder` [Setter]
- `getEvergreenProvision()` → `EvergreenProvisionBuilder` [Getter]
- `setExtendibleProvision(ExtendibleProvision arg0)` → `TerminationProvisionBuilder` [Setter]
- `setEvergreenProvision(EvergreenProvision arg0)` → `TerminationProvisionBuilder` [Setter]
- `getExtendibleProvision()` → `ExtendibleProvisionBuilder` [Getter]
- `getCancelableProvision()` → `CancelableProvisionBuilder` [Getter]
- `getOrCreateEarlyTerminationProvision()` → `EarlyTerminationProvisionBuilder` [Getter]
- `getOrCreateCancelableProvision()` → `CancelableProvisionBuilder` [Getter]
- `setEarlyTerminationProvision(EarlyTerminationProvision arg0)` → `TerminationProvisionBuilder` [Setter]

### TerminationProvisionImpl
**Implements:** `TerminationProvision` 

**Key Methods:**
- `build()` → `TerminationProvision` [Builder]
- `getEvergreenProvision()` → `EvergreenProvision` [Getter]
- `getExtendibleProvision()` → `ExtendibleProvision` [Getter]
- `getCancelableProvision()` → `CancelableProvision` [Getter]
- `setBuilderFields(TerminationProvisionBuilder arg0)` → `void` [Setter]
- `getEarlyTerminationProvision()` → `EarlyTerminationProvision` [Getter]

### TradableProductBuilderImpl
**Implements:** `TradableProduct$TradableProductBuilder` 

**Fields:**
- `NonTransferableProductBuilder product`
- `List (List) tradeLot`
- `List (List) counterparty`
- `List (List) ancillaryParty`
- `NotionalAdjustmentEnum adjustment`

**Key Methods:**
- `build()` → `TradableProduct` [Builder]
- `getOrCreateAncillaryParty(int arg0)` → `AncillaryPartyBuilder` [Getter]
- `setCounterparty(List arg0)` → `TradableProductBuilder` [Setter]
- `getOrCreateCounterparty(int arg0)` → `CounterpartyBuilder` [Getter]
- `setAncillaryParty(List arg0)` → `TradableProductBuilder` [Setter]
- `setAdjustment(NotionalAdjustmentEnum arg0)` → `TradableProductBuilder` [Setter]
- `setTradeLot(List arg0)` → `TradableProductBuilder` [Setter]
- `getOrCreateTradeLot(int arg0)` → `TradeLotBuilder` [Getter]
- `getOrCreateProduct()` → `NonTransferableProductBuilder` [Getter]
- `setProduct(NonTransferableProduct arg0)` → `TradableProductBuilder` [Setter]

### TradableProductImpl
**Implements:** `TradableProduct` 

**Key Methods:**
- `build()` → `TradableProduct` [Builder]
- `setBuilderFields(TradableProductBuilder arg0)` → `void` [Setter]
- `getCounterparty()` → `List` [Getter]
- `getAncillaryParty()` → `List` [Getter]
- `getTradeLot()` → `List` [Getter]
- `getAdjustment()` → `NotionalAdjustmentEnum` [Getter]
- `getProduct()` → `NonTransferableProduct` [Getter]

### TradeLotBuilderImpl
**Implements:** `TradeLot$TradeLotBuilder` 

**Fields:**
- `List (List) lotIdentifier`
- `List (List) priceQuantity`

**Key Methods:**
- `build()` → `TradeLot` [Builder]
- `getOrCreateLotIdentifier(int arg0)` → `IdentifierBuilder` [Getter]
- `setLotIdentifier(List arg0)` → `TradeLotBuilder` [Setter]
- `getLotIdentifier()` → `List` [Getter]
- `getPriceQuantity()` → `List` [Getter]
- `getOrCreatePriceQuantity(int arg0)` → `PriceQuantityBuilder` [Getter]
- `setPriceQuantity(List arg0)` → `TradeLotBuilder` [Setter]

### TradeLotImpl
**Implements:** `TradeLot` 

**Key Methods:**
- `build()` → `TradeLot` [Builder]
- `getLotIdentifier()` → `List` [Getter]
- `getPriceQuantity()` → `List` [Getter]
- `setBuilderFields(TradeLotBuilder arg0)` → `void` [Setter]

### TransferableProductBuilderImpl
**Extends:** `Asset$AssetBuilderImpl` 
**Implements:** `TransferableProduct$TransferableProductBuilder` 

**Fields:**
- `EconomicTermsBuilder economicTerms`

**Key Methods:**
- `build()` → `TransferableProduct` [Builder]
- `setDigitalAsset(DigitalAsset arg0)` → `TransferableProductBuilder` [Setter]
- `setInstrument(Instrument arg0)` → `TransferableProductBuilder` [Setter]
- `setCommodity(Commodity arg0)` → `TransferableProductBuilder` [Setter]
- `setEconomicTerms(EconomicTerms arg0)` → `TransferableProductBuilder` [Setter]
- `getEconomicTerms()` → `EconomicTermsBuilder` [Getter]
- `getOrCreateEconomicTerms()` → `EconomicTermsBuilder` [Getter]
- `setCash(Cash arg0)` → `TransferableProductBuilder` [Setter]

### TransferableProductImpl
**Extends:** `Asset$AssetImpl` 
**Implements:** `TransferableProduct` 

**Key Methods:**
- `build()` → `TransferableProduct` [Builder]
- `getEconomicTerms()` → `EconomicTerms` [Getter]
- `setBuilderFields(TransferableProductBuilder arg0)` → `void` [Setter]

### UnderlierBuilderImpl
**Implements:** `Underlier$UnderlierBuilder` 

**Fields:**
- `ReferenceWithMetaObservableBuilder observable`
- `ProductBuilder product`

**Key Methods:**
- `build()` → `Underlier` [Builder]
- `getOrCreateObservable()` → `ReferenceWithMetaObservableBuilder` [Getter]
- `getObservable()` → `ReferenceWithMetaObservableBuilder` [Getter]
- `setObservable(ReferenceWithMetaObservable arg0)` → `UnderlierBuilder` [Setter]
- `setObservableValue(Observable arg0)` → `UnderlierBuilder` [Setter]
- `getOrCreateProduct()` → `ProductBuilder` [Getter]
- `setProduct(Product arg0)` → `UnderlierBuilder` [Setter]
- `getProduct()` → `ProductBuilder` [Getter]

### UnderlierImpl
**Implements:** `Underlier` 

**Key Methods:**
- `build()` → `Underlier` [Builder]
- `getObservable()` → `ReferenceWithMetaObservable` [Getter]
- `setBuilderFields(UnderlierBuilder arg0)` → `void` [Setter]
- `getProduct()` → `Product` [Getter]

