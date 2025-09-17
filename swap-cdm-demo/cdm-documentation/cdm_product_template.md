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
- `getAveragingPeriodOut()` → `AveragingPeriod` [Getter]
- `getAveragingInOut()` → `AveragingInOutEnum` [Getter]
- `getStrikeFactor()` → `BigDecimal` [Getter]
- `getAveragingPeriodIn()` → `AveragingPeriod` [Getter]

### AsianBuilder
**Implements:** `Asian` `RosettaModelObjectBuilder` 

**Key Methods:**
- `getAveragingPeriodOut()` → `AveragingPeriodBuilder` [Getter]
- `getAveragingPeriodIn()` → `AveragingPeriodBuilder` [Getter]
- `setAveragingInOut(AveragingInOutEnum arg0)` → `AsianBuilder` [Setter]
- `setAveragingPeriodIn(AveragingPeriod arg0)` → `AsianBuilder` [Setter]
- `setStrikeFactor(BigDecimal arg0)` → `AsianBuilder` [Setter]
- `setAveragingPeriodOut(AveragingPeriod arg0)` → `AsianBuilder` [Setter]
- `getOrCreateAveragingPeriodIn()` → `AveragingPeriodBuilder` [Getter]
- `getOrCreateAveragingPeriodOut()` → `AveragingPeriodBuilder` [Getter]

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
- `setSettlementDate(AdjustableOrRelativeDate arg0)` → `AssetLegBuilder` [Setter]
- `getOrCreateSettlementDate()` → `AdjustableOrRelativeDateBuilder` [Getter]
- `getSettlementDate()` → `AdjustableOrRelativeDateBuilder` [Getter]
- `setDeliveryMethod(DeliveryMethodEnum arg0)` → `AssetLegBuilder` [Setter]

### AssetPayout
**Implements:** `PayoutBase` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `AssetPayout` [Builder]
- `getUnderlier()` → `Asset` [Getter]
- `getAssetLeg()` → `List` [Getter]
- `getDividendTerms()` → `DividendTerms` [Getter]
- `getTradeType()` → `AssetPayoutTradeTypeEnum` [Getter]
- `getMinimumFee()` → `Money` [Getter]

### AssetPayoutBuilder
**Implements:** `AssetPayout` `PayoutBase$PayoutBaseBuilder` 

**Key Methods:**
- `getOrCreateUnderlier()` → `AssetBuilder` [Getter]
- `getUnderlier()` → `AssetBuilder` [Getter]
- `setUnderlier(Asset arg0)` → `AssetPayoutBuilder` [Setter]
- `setPayerReceiver(PayerReceiver arg0)` → `AssetPayoutBuilder` [Setter]
- `setPriceQuantity(ResolvablePriceQuantity arg0)` → `AssetPayoutBuilder` [Setter]
- `setSettlementTerms(SettlementTerms arg0)` → `AssetPayoutBuilder` [Setter]
- `setPrincipalPayment(PrincipalPayments arg0)` → `AssetPayoutBuilder` [Setter]
- `getOrCreateAssetLeg(int arg0)` → `AssetLegBuilder` [Getter]
- `getOrCreateDividendTerms()` → `DividendTermsBuilder` [Getter]
- `setAssetLeg(List arg0)` → `AssetPayoutBuilder` [Setter]

### AutomaticExercise
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `AutomaticExercise` [Builder]
- `getThresholdRate()` → `BigDecimal` [Getter]
- `getIsApplicable()` → `Boolean` [Getter]

### AutomaticExerciseBuilder
**Implements:** `AutomaticExercise` `RosettaModelObjectBuilder` 

**Key Methods:**
- `setThresholdRate(BigDecimal arg0)` → `AutomaticExerciseBuilder` [Setter]
- `setIsApplicable(Boolean arg0)` → `AutomaticExerciseBuilder` [Setter]

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
- `getAveragingMethod()` → `AveragingCalculationMethodBuilder` [Getter]
- `getPrecision()` → `RoundingBuilder` [Getter]
- `getOrCreateAveragingMethod()` → `AveragingCalculationMethodBuilder` [Getter]
- `setPrecision(Rounding arg0)` → `AveragingCalculationBuilder` [Setter]
- `setAveragingMethod(AveragingCalculationMethod arg0)` → `AveragingCalculationBuilder` [Setter]
- `getOrCreatePrecision()` → `RoundingBuilder` [Getter]

### AveragingStrikeFeature
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `AveragingStrikeFeature` [Builder]
- `getObservationTerms()` → `ObservationTerms` [Getter]
- `getAveragingCalculation()` → `AveragingCalculation` [Getter]

### AveragingStrikeFeatureBuilder
**Implements:** `AveragingStrikeFeature` `RosettaModelObjectBuilder` 

**Key Methods:**
- `getObservationTerms()` → `ObservationTermsBuilder` [Getter]
- `setObservationTerms(ObservationTerms arg0)` → `AveragingStrikeFeatureBuilder` [Setter]
- `getOrCreateObservationTerms()` → `ObservationTermsBuilder` [Getter]
- `getAveragingCalculation()` → `AveragingCalculationBuilder` [Getter]
- `setAveragingCalculation(AveragingCalculation arg0)` → `AveragingStrikeFeatureBuilder` [Setter]
- `getOrCreateAveragingCalculation()` → `AveragingCalculationBuilder` [Getter]

### Barrier
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `Barrier` [Builder]
- `getBarrierCap()` → `TriggerEvent` [Getter]
- `getBarrierFloor()` → `TriggerEvent` [Getter]

### BarrierBuilder
**Implements:** `Barrier` `RosettaModelObjectBuilder` 

**Key Methods:**
- `getOrCreateBarrierCap()` → `TriggerEventBuilder` [Getter]
- `getOrCreateBarrierFloor()` → `TriggerEventBuilder` [Getter]
- `setBarrierFloor(TriggerEvent arg0)` → `BarrierBuilder` [Setter]
- `setBarrierCap(TriggerEvent arg0)` → `BarrierBuilder` [Setter]
- `getBarrierCap()` → `TriggerEventBuilder` [Getter]
- `getBarrierFloor()` → `TriggerEventBuilder` [Getter]

### CalculationSchedule
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `CalculationSchedule` [Builder]
- `getSchedulePeriod()` → `List` [Getter]

### CalculationScheduleBuilder
**Implements:** `CalculationSchedule` `RosettaModelObjectBuilder` 

**Key Methods:**
- `getOrCreateSchedulePeriod(int arg0)` → `SchedulePeriodBuilder` [Getter]
- `setSchedulePeriod(List arg0)` → `CalculationScheduleBuilder` [Setter]
- `getSchedulePeriod()` → `List` [Getter]

### CalendarSpread
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `CalendarSpread` [Builder]
- `getExpirationDateTwo()` → `AdjustableOrRelativeDate` [Getter]

### CalendarSpreadBuilder
**Implements:** `CalendarSpread` `RosettaModelObjectBuilder` 

**Key Methods:**
- `setExpirationDateTwo(AdjustableOrRelativeDate arg0)` → `CalendarSpreadBuilder` [Setter]
- `getExpirationDateTwo()` → `AdjustableOrRelativeDateBuilder` [Getter]
- `getOrCreateExpirationDateTwo()` → `AdjustableOrRelativeDateBuilder` [Getter]

### CancelableProvision
**Implements:** `BuyerSeller` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `CancelableProvision` [Builder]
- `getEffectiveDate()` → `AdjustableOrRelativeDates` [Getter]
- `getExerciseTerms()` → `ExerciseTerms` [Getter]
- `getEffectivePeriod()` → `Period` [Getter]
- `getExerciseNotice()` → `ExerciseNotice` [Getter]
- `getEarliestDate()` → `AdjustableOrRelativeDate` [Getter]
- `getExpirationDate()` → `AdjustableOrRelativeDate` [Getter]
- `getFollowUpConfirmation()` → `Boolean` [Getter]
- `getCallingParty()` → `CallingPartyEnum` [Getter]

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
- `getEffectiveDate()` → `AdjustableOrRelativeDatesBuilder` [Getter]
- `setFinalCalculationPeriodDateAdjustment(List arg0)` → `CancelableProvisionBuilder` [Setter]
- `setEarliestCancellationTime(BusinessCenterTime arg0)` → `CancelableProvisionBuilder` [Setter]
- `getOrCreateLatestCancelationTime()` → `BusinessCenterTimeBuilder` [Getter]
- `setCancelableProvisionAdjustedDates(CancelableProvisionAdjustedDates arg0)` → `CancelableProvisionBuilder` [Setter]
- `getOrCreateEarliestCancellationTime()` → `BusinessCenterTimeBuilder` [Getter]
- `getOrCreateCancelableProvisionAdjustedDates()` → `CancelableProvisionAdjustedDatesBuilder` [Getter]
- `getOrCreateFinalCalculationPeriodDateAdjustment(int arg0)` → `FinalCalculationPeriodDateAdjustmentBuilder` [Getter]
- `getOrCreateEffectiveDate()` → `AdjustableOrRelativeDatesBuilder` [Getter]
- `getExerciseTerms()` → `ExerciseTermsBuilder` [Getter]

### CancellationEvent
**Implements:** `RosettaModelObject` `GlobalKey` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `CancellationEvent` [Builder]
- `getAdjustedExerciseDate()` → `Date` [Getter]
- `getMeta()` → `MetaFields` [Getter]
- `getAdjustedEarlyTerminationDate()` → `Date` [Getter]

### CancellationEventBuilder
**Implements:** `CancellationEvent` `RosettaModelObjectBuilder` `GlobalKey$GlobalKeyBuilder` 

**Key Methods:**
- `getOrCreateMeta()` → `MetaFieldsBuilder` [Getter]
- `setAdjustedEarlyTerminationDate(Date arg0)` → `CancellationEventBuilder` [Setter]
- `setAdjustedExerciseDate(Date arg0)` → `CancellationEventBuilder` [Setter]
- `getMeta()` → `MetaFieldsBuilder` [Getter]
- `setMeta(MetaFields arg0)` → `CancellationEventBuilder` [Setter]

### Composite
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `Composite` [Builder]
- `getRelativeDate()` → `RelativeDateOffset` [Getter]
- `getDeterminationMethod()` → `DeterminationMethodEnum` [Getter]
- `getFxSpotRateSource()` → `FxSpotRateSource` [Getter]
- `getFixingTime()` → `BusinessCenterTime` [Getter]

### CompositeBuilder
**Implements:** `Composite` `RosettaModelObjectBuilder` 

**Key Methods:**
- `getRelativeDate()` → `RelativeDateOffsetBuilder` [Getter]
- `setDeterminationMethod(DeterminationMethodEnum arg0)` → `CompositeBuilder` [Setter]
- `getFxSpotRateSource()` → `FxSpotRateSourceBuilder` [Getter]
- `getFixingTime()` → `BusinessCenterTimeBuilder` [Getter]
- `setFixingTime(BusinessCenterTime arg0)` → `CompositeBuilder` [Setter]
- `getOrCreateFixingTime()` → `BusinessCenterTimeBuilder` [Getter]
- `setFxSpotRateSource(FxSpotRateSource arg0)` → `CompositeBuilder` [Setter]
- `getOrCreateFxSpotRateSource()` → `FxSpotRateSourceBuilder` [Getter]
- `setRelativeDate(RelativeDateOffset arg0)` → `CompositeBuilder` [Setter]
- `getOrCreateRelativeDate()` → `RelativeDateOffsetBuilder` [Getter]

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
- `setBasketPercentage(BigDecimal arg0)` → `ConstituentWeightBuilder` [Setter]
- `setOpenUnits(BigDecimal arg0)` → `ConstituentWeightBuilder` [Setter]

### DividendTerms
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `DividendTerms` [Builder]
- `getDividendEntitlement()` → `DividendEntitlementEnum` [Getter]
- `getMinimumBillingAmount()` → `Money` [Getter]
- `getManufacturedIncomeRequirement()` → `DividendPayoutRatio` [Getter]

### DividendTermsBuilder
**Implements:** `DividendTerms` `RosettaModelObjectBuilder` 

**Key Methods:**
- `getOrCreateManufacturedIncomeRequirement()` → `DividendPayoutRatioBuilder` [Getter]
- `setDividendEntitlement(DividendEntitlementEnum arg0)` → `DividendTermsBuilder` [Setter]
- `getMinimumBillingAmount()` → `MoneyBuilder` [Getter]
- `setMinimumBillingAmount(Money arg0)` → `DividendTermsBuilder` [Setter]
- `setManufacturedIncomeRequirement(DividendPayoutRatio arg0)` → `DividendTermsBuilder` [Setter]
- `getManufacturedIncomeRequirement()` → `DividendPayoutRatioBuilder` [Getter]
- `getOrCreateMinimumBillingAmount()` → `MoneyBuilder` [Getter]

### EarlyTerminationEvent
**Implements:** `RosettaModelObject` `GlobalKey` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `EarlyTerminationEvent` [Builder]
- `getAdjustedCashSettlementPaymentDate()` → `Date` [Getter]
- `getAdjustedCashSettlementValuationDate()` → `Date` [Getter]
- `getAdjustedExerciseFeePaymentDate()` → `Date` [Getter]
- `getAdjustedExerciseDate()` → `Date` [Getter]
- `getMeta()` → `MetaFields` [Getter]
- `getAdjustedEarlyTerminationDate()` → `Date` [Getter]

### EarlyTerminationEventBuilder
**Implements:** `EarlyTerminationEvent` `RosettaModelObjectBuilder` `GlobalKey$GlobalKeyBuilder` 

**Key Methods:**
- `getOrCreateMeta()` → `MetaFieldsBuilder` [Getter]
- `setAdjustedEarlyTerminationDate(Date arg0)` → `EarlyTerminationEventBuilder` [Setter]
- `setAdjustedCashSettlementPaymentDate(Date arg0)` → `EarlyTerminationEventBuilder` [Setter]
- `setAdjustedExerciseFeePaymentDate(Date arg0)` → `EarlyTerminationEventBuilder` [Setter]
- `setAdjustedCashSettlementValuationDate(Date arg0)` → `EarlyTerminationEventBuilder` [Setter]
- `setAdjustedExerciseDate(Date arg0)` → `EarlyTerminationEventBuilder` [Setter]
- `getMeta()` → `MetaFieldsBuilder` [Getter]
- `setMeta(MetaFields arg0)` → `EarlyTerminationEventBuilder` [Setter]

### EarlyTerminationProvision
**Implements:** `RosettaModelObject` `GlobalKey` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `EarlyTerminationProvision` [Builder]
- `getMeta()` → `MetaFields` [Getter]
- `getMandatoryEarlyTerminationDateTenor()` → `Period` [Getter]
- `getOptionalEarlyTerminationParameters()` → `ExercisePeriod` [Getter]
- `getMandatoryEarlyTermination()` → `MandatoryEarlyTermination` [Getter]
- `getOptionalEarlyTermination()` → `OptionalEarlyTermination` [Getter]

### EarlyTerminationProvisionBuilder
**Implements:** `EarlyTerminationProvision` `RosettaModelObjectBuilder` `GlobalKey$GlobalKeyBuilder` 

**Key Methods:**
- `getOrCreateMeta()` → `MetaFieldsBuilder` [Getter]
- `getOrCreateOptionalEarlyTermination()` → `OptionalEarlyTerminationBuilder` [Getter]
- `setMandatoryEarlyTermination(MandatoryEarlyTermination arg0)` → `EarlyTerminationProvisionBuilder` [Setter]
- `setOptionalEarlyTermination(OptionalEarlyTermination arg0)` → `EarlyTerminationProvisionBuilder` [Setter]
- `setMandatoryEarlyTerminationDateTenor(Period arg0)` → `EarlyTerminationProvisionBuilder` [Setter]
- `getOrCreateMandatoryEarlyTermination()` → `MandatoryEarlyTerminationBuilder` [Getter]
- `setOptionalEarlyTerminationParameters(ExercisePeriod arg0)` → `EarlyTerminationProvisionBuilder` [Setter]
- `getMeta()` → `MetaFieldsBuilder` [Getter]
- `setMeta(MetaFields arg0)` → `EarlyTerminationProvisionBuilder` [Setter]
- `getOrCreateMandatoryEarlyTerminationDateTenor()` → `PeriodBuilder` [Getter]

### EconomicTerms
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `EconomicTerms` [Builder]
- `getCollateral()` → `Collateral` [Getter]
- `getEffectiveDate()` → `AdjustableOrRelativeDate` [Getter]
- `getTerminationDate()` → `AdjustableOrRelativeDate` [Getter]
- `getPayout()` → `List` [Getter]
- `getCalculationAgent()` → `CalculationAgent` [Getter]
- `getTerminationProvision()` → `TerminationProvision` [Getter]
- `getNonStandardisedTerms()` → `Boolean` [Getter]
- `getDateAdjustments()` → `BusinessDayAdjustments` [Getter]

### EconomicTermsBuilder
**Implements:** `EconomicTerms` `RosettaModelObjectBuilder` 

**Key Methods:**
- `getCollateral()` → `CollateralBuilder` [Getter]
- `getEffectiveDate()` → `AdjustableOrRelativeDateBuilder` [Getter]
- `getTerminationDate()` → `AdjustableOrRelativeDateBuilder` [Getter]
- `setTerminationDate(AdjustableOrRelativeDate arg0)` → `EconomicTermsBuilder` [Setter]
- `setPayout(List arg0)` → `EconomicTermsBuilder` [Setter]
- `setCollateral(Collateral arg0)` → `EconomicTermsBuilder` [Setter]
- `getOrCreateCollateral()` → `CollateralBuilder` [Getter]
- `getPayout()` → `List` [Getter]
- `setCalculationAgent(CalculationAgent arg0)` → `EconomicTermsBuilder` [Setter]
- `getCalculationAgent()` → `CalculationAgentBuilder` [Getter]

### EvergreenProvision
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `EvergreenProvision` [Builder]
- `getSinglePartyOption()` → `PartyRole` [Getter]
- `getExtensionFrequency()` → `AdjustableRelativeOrPeriodicDates` [Getter]
- `getNoticePeriod()` → `RelativeDateOffset` [Getter]
- `getFinalPeriodFeeAdjustment()` → `Price` [Getter]
- `getNoticeDeadlinePeriod()` → `RelativeDateOffset` [Getter]
- `getNoticeDeadlineDateTime()` → `ZonedDateTime` [Getter]

### EvergreenProvisionBuilder
**Implements:** `EvergreenProvision` `RosettaModelObjectBuilder` 

**Key Methods:**
- `setExtensionFrequency(AdjustableRelativeOrPeriodicDates arg0)` → `EvergreenProvisionBuilder` [Setter]
- `getOrCreateNoticePeriod()` → `RelativeDateOffsetBuilder` [Getter]
- `setNoticePeriod(RelativeDateOffset arg0)` → `EvergreenProvisionBuilder` [Setter]
- `setFinalPeriodFeeAdjustment(Price arg0)` → `EvergreenProvisionBuilder` [Setter]
- `getOrCreateExtensionFrequency()` → `AdjustableRelativeOrPeriodicDatesBuilder` [Getter]
- `getOrCreateFinalPeriodFeeAdjustment()` → `PriceBuilder` [Getter]
- `getSinglePartyOption()` → `PartyRoleBuilder` [Getter]
- `getExtensionFrequency()` → `AdjustableRelativeOrPeriodicDatesBuilder` [Getter]
- `getNoticePeriod()` → `RelativeDateOffsetBuilder` [Getter]
- `getFinalPeriodFeeAdjustment()` → `PriceBuilder` [Getter]

### ExerciseFee
**Implements:** `PayerReceiver` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `ExerciseFee` [Builder]
- `getFeePaymentDate()` → `RelativeDateOffset` [Getter]
- `getNotionalReference()` → `ReferenceWithMetaMoney` [Getter]
- `getFeeAmount()` → `BigDecimal` [Getter]
- `getFeeRate()` → `BigDecimal` [Getter]

### ExerciseFeeBuilder
**Implements:** `ExerciseFee` `PayerReceiver$PayerReceiverBuilder` 

**Key Methods:**
- `setFeeRate(BigDecimal arg0)` → `ExerciseFeeBuilder` [Setter]
- `getFeePaymentDate()` → `RelativeDateOffsetBuilder` [Getter]
- `setNotionalReferenceValue(Money arg0)` → `ExerciseFeeBuilder` [Setter]
- `setNotionalReference(ReferenceWithMetaMoney arg0)` → `ExerciseFeeBuilder` [Setter]
- `setFeePaymentDate(RelativeDateOffset arg0)` → `ExerciseFeeBuilder` [Setter]
- `getOrCreateFeePaymentDate()` → `RelativeDateOffsetBuilder` [Getter]
- `getNotionalReference()` → `ReferenceWithMetaMoneyBuilder` [Getter]
- `setReceiver(CounterpartyRoleEnum arg0)` → `ExerciseFeeBuilder` [Setter]
- `setPayer(CounterpartyRoleEnum arg0)` → `ExerciseFeeBuilder` [Setter]
- `setFeeAmount(BigDecimal arg0)` → `ExerciseFeeBuilder` [Setter]

### ExerciseFeeSchedule
**Implements:** `PayerReceiver` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `ExerciseFeeSchedule` [Builder]
- `getFeePaymentDate()` → `RelativeDateOffset` [Getter]
- `getFeeAmountSchedule()` → `AmountSchedule` [Getter]
- `getFeeRateSchedule()` → `Schedule` [Getter]
- `getNotionalReference()` → `ReferenceWithMetaMoney` [Getter]

### ExerciseFeeScheduleBuilder
**Implements:** `ExerciseFeeSchedule` `PayerReceiver$PayerReceiverBuilder` 

**Key Methods:**
- `getOrCreateFeeRateSchedule()` → `ScheduleBuilder` [Getter]
- `getFeePaymentDate()` → `RelativeDateOffsetBuilder` [Getter]
- `setNotionalReferenceValue(Money arg0)` → `ExerciseFeeScheduleBuilder` [Setter]
- `getFeeAmountSchedule()` → `AmountScheduleBuilder` [Getter]
- `setNotionalReference(ReferenceWithMetaMoney arg0)` → `ExerciseFeeScheduleBuilder` [Setter]
- `getFeeRateSchedule()` → `ScheduleBuilder` [Getter]
- `setFeeAmountSchedule(AmountSchedule arg0)` → `ExerciseFeeScheduleBuilder` [Setter]
- `setFeeRateSchedule(Schedule arg0)` → `ExerciseFeeScheduleBuilder` [Setter]
- `setFeePaymentDate(RelativeDateOffset arg0)` → `ExerciseFeeScheduleBuilder` [Setter]
- `getOrCreateFeePaymentDate()` → `RelativeDateOffsetBuilder` [Getter]

### ExerciseNotice
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `ExerciseNotice` [Builder]
- `getBusinessCenter()` → `FieldWithMetaBusinessCenterEnum` [Getter]
- `getExerciseNoticeReceiver()` → `AncillaryRoleEnum` [Getter]
- `getExerciseNoticeGiver()` → `ExerciseNoticeGiverEnum` [Getter]

### ExerciseNoticeBuilder
**Implements:** `ExerciseNotice` `RosettaModelObjectBuilder` 

**Key Methods:**
- `getBusinessCenter()` → `FieldWithMetaBusinessCenterEnumBuilder` [Getter]
- `setBusinessCenterValue(BusinessCenterEnum arg0)` → `ExerciseNoticeBuilder` [Setter]
- `getOrCreateBusinessCenter()` → `FieldWithMetaBusinessCenterEnumBuilder` [Getter]
- `setBusinessCenter(FieldWithMetaBusinessCenterEnum arg0)` → `ExerciseNoticeBuilder` [Setter]
- `setExerciseNoticeGiver(ExerciseNoticeGiverEnum arg0)` → `ExerciseNoticeBuilder` [Setter]
- `setExerciseNoticeReceiver(AncillaryRoleEnum arg0)` → `ExerciseNoticeBuilder` [Setter]

### ExercisePeriod
**Implements:** `RosettaModelObject` `GlobalKey` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `ExercisePeriod` [Builder]
- `getEarliestExerciseDateTenor()` → `Period` [Getter]
- `getExerciseFrequency()` → `Period` [Getter]
- `getMeta()` → `MetaFields` [Getter]

### ExercisePeriodBuilder
**Implements:** `ExercisePeriod` `RosettaModelObjectBuilder` `GlobalKey$GlobalKeyBuilder` 

**Key Methods:**
- `getOrCreateMeta()` → `MetaFieldsBuilder` [Getter]
- `setExerciseFrequency(Period arg0)` → `ExercisePeriodBuilder` [Setter]
- `getEarliestExerciseDateTenor()` → `PeriodBuilder` [Getter]
- `getOrCreateExerciseFrequency()` → `PeriodBuilder` [Getter]
- `setEarliestExerciseDateTenor(Period arg0)` → `ExercisePeriodBuilder` [Setter]
- `getOrCreateEarliestExerciseDateTenor()` → `PeriodBuilder` [Getter]
- `getExerciseFrequency()` → `PeriodBuilder` [Getter]
- `getMeta()` → `MetaFieldsBuilder` [Getter]
- `setMeta(MetaFields arg0)` → `ExercisePeriodBuilder` [Setter]

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
- `getOrCreateManualExercise()` → `ManualExerciseBuilder` [Getter]
- `setFollowUpConfirmation(Boolean arg0)` → `ExerciseProcedureBuilder` [Setter]
- `getManualExercise()` → `ManualExerciseBuilder` [Getter]
- `setAutomaticExercise(AutomaticExercise arg0)` → `ExerciseProcedureBuilder` [Setter]
- `setManualExercise(ManualExercise arg0)` → `ExerciseProcedureBuilder` [Setter]
- `setLimitedRightToConfirm(Boolean arg0)` → `ExerciseProcedureBuilder` [Setter]
- `setSplitTicket(Boolean arg0)` → `ExerciseProcedureBuilder` [Setter]
- `getAutomaticExercise()` → `AutomaticExerciseBuilder` [Getter]
- `getOrCreateAutomaticExercise()` → `AutomaticExerciseBuilder` [Getter]

### ExerciseTerms
**Implements:** `RosettaModelObject` `GlobalKey` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `ExerciseTerms` [Builder]
- `getMeta()` → `MetaFields` [Getter]
- `getStyle()` → `OptionExerciseStyleEnum` [Getter]
- `getExpirationDate()` → `List` [Getter]
- `getExerciseFee()` → `ExerciseFee` [Getter]
- `getExerciseProcedure()` → `ExerciseProcedure` [Getter]
- `getRelevantUnderlyingDate()` → `AdjustableOrRelativeDates` [Getter]
- `getLatestExerciseTime()` → `BusinessCenterTime` [Getter]
- `getEarliestExerciseTime()` → `BusinessCenterTime` [Getter]

### ExerciseTermsBuilder
**Implements:** `ExerciseTerms` `RosettaModelObjectBuilder` `GlobalKey$GlobalKeyBuilder` 

**Key Methods:**
- `setExpirationTime(BusinessCenterTime arg0)` → `ExerciseTermsBuilder` [Setter]
- `getOrCreateMeta()` → `MetaFieldsBuilder` [Getter]
- `getMeta()` → `MetaFieldsBuilder` [Getter]
- `setMeta(MetaFields arg0)` → `ExerciseTermsBuilder` [Setter]
- `getExpirationDate()` → `List` [Getter]
- `setEarliestExerciseTime(BusinessCenterTime arg0)` → `ExerciseTermsBuilder` [Setter]
- `setLatestExerciseTime(BusinessCenterTime arg0)` → `ExerciseTermsBuilder` [Setter]
- `setExerciseDates(AdjustableOrRelativeDates arg0)` → `ExerciseTermsBuilder` [Setter]
- `setMultipleExercise(MultipleExercise arg0)` → `ExerciseTermsBuilder` [Setter]
- `setExerciseFee(ExerciseFee arg0)` → `ExerciseTermsBuilder` [Setter]

### ExtendibleProvision
**Implements:** `BuyerSeller` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `ExtendibleProvision` [Builder]
- `getExerciseTerms()` → `ExerciseTerms` [Getter]
- `getSinglePartyOption()` → `PartyRole` [Getter]
- `getExtensionTerm()` → `RelativeDateOffset` [Getter]
- `getExerciseNotice()` → `ExerciseNotice` [Getter]
- `getFollowUpConfirmation()` → `Boolean` [Getter]
- `getCallingParty()` → `CallingPartyEnum` [Getter]
- `getExtensionPeriod()` → `AdjustableRelativeOrPeriodicDates` [Getter]
- `getExtendibleProvisionAdjustedDates()` → `ExtendibleProvisionAdjustedDates` [Getter]

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
- `getOrCreateExtensionPeriod()` → `AdjustableRelativeOrPeriodicDatesBuilder` [Getter]
- `setExtensionTerm(RelativeDateOffset arg0)` → `ExtendibleProvisionBuilder` [Setter]
- `getOrCreateExtensionTerm()` → `RelativeDateOffsetBuilder` [Getter]
- `setExtendibleProvisionAdjustedDates(ExtendibleProvisionAdjustedDates arg0)` → `ExtendibleProvisionBuilder` [Setter]
- `getOrCreateExtendibleProvisionAdjustedDates()` → `ExtendibleProvisionAdjustedDatesBuilder` [Getter]
- `getExerciseTerms()` → `ExerciseTermsBuilder` [Getter]
- `getSinglePartyOption()` → `PartyRoleBuilder` [Getter]
- `getExtensionTerm()` → `RelativeDateOffsetBuilder` [Getter]
- `getExerciseNotice()` → `ExerciseNoticeBuilder` [Getter]

### ExtensionEvent
**Implements:** `RosettaModelObject` `GlobalKey` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `ExtensionEvent` [Builder]
- `getAdjustedExerciseDate()` → `Date` [Getter]
- `getMeta()` → `MetaFields` [Getter]
- `getAdjustedExtendedTerminationDate()` → `Date` [Getter]

### ExtensionEventBuilder
**Implements:** `ExtensionEvent` `RosettaModelObjectBuilder` `GlobalKey$GlobalKeyBuilder` 

**Key Methods:**
- `getOrCreateMeta()` → `MetaFieldsBuilder` [Getter]
- `setAdjustedExtendedTerminationDate(Date arg0)` → `ExtensionEventBuilder` [Setter]
- `setAdjustedExerciseDate(Date arg0)` → `ExtensionEventBuilder` [Setter]
- `getMeta()` → `MetaFieldsBuilder` [Getter]
- `setMeta(MetaFields arg0)` → `ExtensionEventBuilder` [Setter]

### FixedPricePayout
**Implements:** `PayoutBase` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `FixedPricePayout` [Builder]
- `getPaymentDates()` → `PaymentDates` [Getter]
- `getSchedule()` → `CalculationSchedule` [Getter]
- `getFixedPrice()` → `FixedPrice` [Getter]

### FixedPricePayoutBuilder
**Implements:** `FixedPricePayout` `PayoutBase$PayoutBaseBuilder` 

**Key Methods:**
- `setPayerReceiver(PayerReceiver arg0)` → `FixedPricePayoutBuilder` [Setter]
- `setPriceQuantity(ResolvablePriceQuantity arg0)` → `FixedPricePayoutBuilder` [Setter]
- `setSettlementTerms(SettlementTerms arg0)` → `FixedPricePayoutBuilder` [Setter]
- `setPaymentDates(PaymentDates arg0)` → `FixedPricePayoutBuilder` [Setter]
- `getPaymentDates()` → `PaymentDatesBuilder` [Getter]
- `getOrCreatePaymentDates()` → `PaymentDatesBuilder` [Getter]
- `getSchedule()` → `CalculationScheduleBuilder` [Getter]
- `setPrincipalPayment(PrincipalPayments arg0)` → `FixedPricePayoutBuilder` [Setter]
- `getOrCreateSchedule()` → `CalculationScheduleBuilder` [Getter]
- `setSchedule(CalculationSchedule arg0)` → `FixedPricePayoutBuilder` [Setter]

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
- `getComposite()` → `CompositeBuilder` [Getter]
- `setComposite(Composite arg0)` → `FxFeatureBuilder` [Setter]
- `getReferenceCurrency()` → `FieldWithMetaStringBuilder` [Getter]
- `getCrossCurrency()` → `CompositeBuilder` [Getter]
- `setReferenceCurrency(FieldWithMetaString arg0)` → `FxFeatureBuilder` [Setter]
- `getOrCreateQuanto()` → `QuantoBuilder` [Getter]
- `setReferenceCurrencyValue(String arg0)` → `FxFeatureBuilder` [Setter]
- `getOrCreateCrossCurrency()` → `CompositeBuilder` [Getter]
- `setCrossCurrency(Composite arg0)` → `FxFeatureBuilder` [Setter]
- `getOrCreateReferenceCurrency()` → `FieldWithMetaStringBuilder` [Getter]

### Knock
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `Knock` [Builder]
- `getKnockOut()` → `TriggerEvent` [Getter]
- `getKnockIn()` → `TriggerEvent` [Getter]

### KnockBuilder
**Implements:** `Knock` `RosettaModelObjectBuilder` 

**Key Methods:**
- `setKnockIn(TriggerEvent arg0)` → `KnockBuilder` [Setter]
- `getKnockOut()` → `TriggerEventBuilder` [Getter]
- `getKnockIn()` → `TriggerEventBuilder` [Getter]
- `getOrCreateKnockIn()` → `TriggerEventBuilder` [Getter]
- `getOrCreateKnockOut()` → `TriggerEventBuilder` [Getter]
- `setKnockOut(TriggerEvent arg0)` → `KnockBuilder` [Setter]

### MandatoryEarlyTermination
**Implements:** `RosettaModelObject` `GlobalKey` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `MandatoryEarlyTermination` [Builder]
- `getMandatoryEarlyTerminationAdjustedDates()` → `MandatoryEarlyTerminationAdjustedDates` [Getter]
- `getMandatoryEarlyTerminationDate()` → `AdjustableDate` [Getter]
- `getMeta()` → `MetaFields` [Getter]
- `getCalculationAgent()` → `CalculationAgent` [Getter]
- `getCashSettlement()` → `SettlementTerms` [Getter]

### MandatoryEarlyTerminationAdjustedDates
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `MandatoryEarlyTerminationAdjustedDates` [Builder]
- `getAdjustedCashSettlementPaymentDate()` → `Date` [Getter]
- `getAdjustedCashSettlementValuationDate()` → `Date` [Getter]
- `getAdjustedEarlyTerminationDate()` → `Date` [Getter]

### MandatoryEarlyTerminationAdjustedDatesBuilder
**Implements:** `MandatoryEarlyTerminationAdjustedDates` `RosettaModelObjectBuilder` 

**Key Methods:**
- `setAdjustedEarlyTerminationDate(Date arg0)` → `MandatoryEarlyTerminationAdjustedDatesBuilder` [Setter]
- `setAdjustedCashSettlementPaymentDate(Date arg0)` → `MandatoryEarlyTerminationAdjustedDatesBuilder` [Setter]
- `setAdjustedCashSettlementValuationDate(Date arg0)` → `MandatoryEarlyTerminationAdjustedDatesBuilder` [Setter]

### MandatoryEarlyTerminationBuilder
**Implements:** `MandatoryEarlyTermination` `RosettaModelObjectBuilder` `GlobalKey$GlobalKeyBuilder` 

**Key Methods:**
- `getOrCreateMeta()` → `MetaFieldsBuilder` [Getter]
- `getMandatoryEarlyTerminationAdjustedDates()` → `MandatoryEarlyTerminationAdjustedDatesBuilder` [Getter]
- `getOrCreateMandatoryEarlyTerminationDate()` → `AdjustableDateBuilder` [Getter]
- `getMandatoryEarlyTerminationDate()` → `AdjustableDateBuilder` [Getter]
- `setMandatoryEarlyTerminationAdjustedDates(MandatoryEarlyTerminationAdjustedDates arg0)` → `MandatoryEarlyTerminationBuilder` [Setter]
- `setMandatoryEarlyTerminationDate(AdjustableDate arg0)` → `MandatoryEarlyTerminationBuilder` [Setter]
- `getMeta()` → `MetaFieldsBuilder` [Getter]
- `setMeta(MetaFields arg0)` → `MandatoryEarlyTerminationBuilder` [Setter]
- `getOrCreateMandatoryEarlyTerminationAdjustedDates()` → `MandatoryEarlyTerminationAdjustedDatesBuilder` [Getter]
- `setCalculationAgent(CalculationAgent arg0)` → `MandatoryEarlyTerminationBuilder` [Setter]

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
- `setFallbackExercise(Boolean arg0)` → `ManualExerciseBuilder` [Setter]
- `getOrCreateExerciseNotice()` → `ExerciseNoticeBuilder` [Getter]

### MultipleExercise
**Implements:** `PartialExercise` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `MultipleExercise` [Builder]
- `getMaximumNotionalAmount()` → `BigDecimal` [Getter]
- `getMaximumNumberOfOptions()` → `Integer` [Getter]

### MultipleExerciseBuilder
**Implements:** `MultipleExercise` `PartialExercise$PartialExerciseBuilder` 

**Key Methods:**
- `setMinimumNotionalAmount(BigDecimal arg0)` → `MultipleExerciseBuilder` [Setter]
- `setNotionaReference(ReferenceWithMetaMoney arg0)` → `MultipleExerciseBuilder` [Setter]
- `setNotionaReferenceValue(Money arg0)` → `MultipleExerciseBuilder` [Setter]
- `setMinimumNumberOfOptions(Integer arg0)` → `MultipleExerciseBuilder` [Setter]
- `setIntegralMultipleAmount(BigDecimal arg0)` → `MultipleExerciseBuilder` [Setter]
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
- `getEconomicTerms()` → `EconomicTermsBuilder` [Getter]
- `setIdentifier(List arg0)` → `NonTransferableProductBuilder` [Setter]
- `getOrCreateIdentifier(int arg0)` → `ProductIdentifierBuilder` [Getter]
- `getOrCreateMeta()` → `MetaFieldsBuilder` [Getter]
- `getOrCreateEconomicTerms()` → `EconomicTermsBuilder` [Getter]
- `getMeta()` → `MetaFieldsBuilder` [Getter]
- `setMeta(MetaFields arg0)` → `NonTransferableProductBuilder` [Setter]
- `getTaxonomy()` → `List` [Getter]
- `getOrCreateTaxonomy(int arg0)` → `ProductTaxonomyBuilder` [Getter]
- `setTaxonomy(List arg0)` → `NonTransferableProductBuilder` [Setter]

### OptionFeature
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `OptionFeature` [Builder]
- `getBarrier()` → `Barrier` [Getter]
- `getKnock()` → `Knock` [Getter]
- `getStrategyFeature()` → `StrategyFeature` [Getter]
- `getFxFeature()` → `List` [Getter]
- `getAveragingFeature()` → `AveragingCalculation` [Getter]
- `getPassThrough()` → `PassThrough` [Getter]

### OptionFeatureBuilder
**Implements:** `OptionFeature` `RosettaModelObjectBuilder` 

**Key Methods:**
- `getOrCreateAveragingFeature()` → `AveragingCalculationBuilder` [Getter]
- `getOrCreateFxFeature(int arg0)` → `FxFeatureBuilder` [Getter]
- `setFxFeature(List arg0)` → `OptionFeatureBuilder` [Setter]
- `getBarrier()` → `BarrierBuilder` [Getter]
- `getKnock()` → `KnockBuilder` [Getter]
- `getStrategyFeature()` → `StrategyFeatureBuilder` [Getter]
- `getFxFeature()` → `List` [Getter]
- `getAveragingFeature()` → `AveragingCalculationBuilder` [Getter]
- `getPassThrough()` → `PassThroughBuilder` [Getter]
- `setStrategyFeature(StrategyFeature arg0)` → `OptionFeatureBuilder` [Setter]

### OptionPayout
**Implements:** `PayoutBase` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `OptionPayout` [Builder]
- `getUnderlier()` → `Underlier` [Getter]
- `getFeature()` → `OptionFeature` [Getter]
- `getObservationTerms()` → `ObservationTerms` [Getter]
- `getStrike()` → `OptionStrike` [Getter]
- `getExerciseTerms()` → `ExerciseTerms` [Getter]
- `getDelivery()` → `AssetDeliveryInformation` [Getter]
- `getBuyerSeller()` → `BuyerSeller` [Getter]
- `getSchedule()` → `CalculationSchedule` [Getter]

### OptionPayoutBuilder
**Implements:** `OptionPayout` `PayoutBase$PayoutBaseBuilder` 

**Key Methods:**
- `getOrCreateUnderlier()` → `UnderlierBuilder` [Getter]
- `getUnderlier()` → `UnderlierBuilder` [Getter]
- `setUnderlier(Underlier arg0)` → `OptionPayoutBuilder` [Setter]
- `setPayerReceiver(PayerReceiver arg0)` → `OptionPayoutBuilder` [Setter]
- `setFeature(OptionFeature arg0)` → `OptionPayoutBuilder` [Setter]
- `getFeature()` → `OptionFeatureBuilder` [Getter]
- `setPriceQuantity(ResolvablePriceQuantity arg0)` → `OptionPayoutBuilder` [Setter]
- `setSettlementTerms(SettlementTerms arg0)` → `OptionPayoutBuilder` [Setter]
- `getObservationTerms()` → `ObservationTermsBuilder` [Getter]
- `getStrike()` → `OptionStrikeBuilder` [Getter]

### OptionStrike
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `OptionStrike` [Builder]
- `getReferenceSwapCurve()` → `ReferenceSwapCurve` [Getter]
- `getAveragingStrikeFeature()` → `AveragingStrikeFeature` [Getter]
- `getStrikePrice()` → `Price` [Getter]
- `getStrikeReference()` → `ReferenceWithMetaFixedRateSpecification` [Getter]

### OptionStrikeBuilder
**Implements:** `OptionStrike` `RosettaModelObjectBuilder` 

**Key Methods:**
- `getOrCreateStrikePrice()` → `PriceBuilder` [Getter]
- `setStrikeReference(ReferenceWithMetaFixedRateSpecification arg0)` → `OptionStrikeBuilder` [Setter]
- `setStrikeReferenceValue(FixedRateSpecification arg0)` → `OptionStrikeBuilder` [Setter]
- `setReferenceSwapCurve(ReferenceSwapCurve arg0)` → `OptionStrikeBuilder` [Setter]
- `setStrikePrice(Price arg0)` → `OptionStrikeBuilder` [Setter]
- `getOrCreateStrikeReference()` → `ReferenceWithMetaFixedRateSpecificationBuilder` [Getter]
- `setAveragingStrikeFeature(AveragingStrikeFeature arg0)` → `OptionStrikeBuilder` [Setter]
- `getReferenceSwapCurve()` → `ReferenceSwapCurveBuilder` [Getter]
- `getAveragingStrikeFeature()` → `AveragingStrikeFeatureBuilder` [Getter]
- `getStrikePrice()` → `PriceBuilder` [Getter]

### OptionalEarlyTermination
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `OptionalEarlyTermination` [Builder]
- `getCalculationAgent()` → `CalculationAgent` [Getter]
- `getExerciseTerms()` → `ExerciseTerms` [Getter]
- `getSinglePartyOption()` → `BuyerSeller` [Getter]
- `getExerciseNotice()` → `List` [Getter]
- `getFollowUpConfirmation()` → `Boolean` [Getter]
- `getMutualEarlyTermination()` → `Boolean` [Getter]
- `getCashSettlement()` → `SettlementTerms` [Getter]
- `getOptionalEarlyTerminationAdjustedDates()` → `OptionalEarlyTerminationAdjustedDates` [Getter]

### OptionalEarlyTerminationAdjustedDates
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `OptionalEarlyTerminationAdjustedDates` [Builder]
- `getEarlyTerminationEvent()` → `List` [Getter]

### OptionalEarlyTerminationAdjustedDatesBuilder
**Implements:** `OptionalEarlyTerminationAdjustedDates` `RosettaModelObjectBuilder` 

**Key Methods:**
- `getEarlyTerminationEvent()` → `List` [Getter]
- `setEarlyTerminationEvent(List arg0)` → `OptionalEarlyTerminationAdjustedDatesBuilder` [Setter]
- `getOrCreateEarlyTerminationEvent(int arg0)` → `EarlyTerminationEventBuilder` [Getter]

### OptionalEarlyTerminationBuilder
**Implements:** `OptionalEarlyTermination` `RosettaModelObjectBuilder` 

**Key Methods:**
- `getOrCreateOptionalEarlyTerminationAdjustedDates()` → `OptionalEarlyTerminationAdjustedDatesBuilder` [Getter]
- `setCalculationAgent(CalculationAgent arg0)` → `OptionalEarlyTerminationBuilder` [Setter]
- `getCalculationAgent()` → `CalculationAgentBuilder` [Getter]
- `getExerciseTerms()` → `ExerciseTermsBuilder` [Getter]
- `getSinglePartyOption()` → `BuyerSellerBuilder` [Getter]
- `getExerciseNotice()` → `List` [Getter]
- `setExerciseTerms(ExerciseTerms arg0)` → `OptionalEarlyTerminationBuilder` [Setter]
- `getOrCreateExerciseTerms()` → `ExerciseTermsBuilder` [Getter]
- `getCashSettlement()` → `SettlementTermsBuilder` [Getter]
- `setExerciseNotice(List arg0)` → `OptionalEarlyTerminationBuilder` [Setter]

### PartialExercise
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `PartialExercise` [Builder]
- `getNotionaReference()` → `ReferenceWithMetaMoney` [Getter]
- `getIntegralMultipleAmount()` → `BigDecimal` [Getter]
- `getMinimumNumberOfOptions()` → `Integer` [Getter]
- `getMinimumNotionalAmount()` → `BigDecimal` [Getter]

### PartialExerciseBuilder
**Implements:** `PartialExercise` `RosettaModelObjectBuilder` 

**Key Methods:**
- `getNotionaReference()` → `ReferenceWithMetaMoneyBuilder` [Getter]
- `setMinimumNotionalAmount(BigDecimal arg0)` → `PartialExerciseBuilder` [Setter]
- `setNotionaReference(ReferenceWithMetaMoney arg0)` → `PartialExerciseBuilder` [Setter]
- `setNotionaReferenceValue(Money arg0)` → `PartialExerciseBuilder` [Setter]
- `setMinimumNumberOfOptions(Integer arg0)` → `PartialExerciseBuilder` [Setter]
- `setIntegralMultipleAmount(BigDecimal arg0)` → `PartialExerciseBuilder` [Setter]
- `getOrCreateNotionaReference()` → `ReferenceWithMetaMoneyBuilder` [Getter]

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
- `getOrCreatePassThroughItem(int arg0)` → `PassThroughItemBuilder` [Getter]
- `setPassThroughItem(List arg0)` → `PassThroughBuilder` [Setter]

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
- `setPayerReceiver(PayerReceiver arg0)` → `PassThroughItemBuilder` [Setter]
- `getOrCreatePayerReceiver()` → `PayerReceiverBuilder` [Getter]
- `getPayerReceiver()` → `PayerReceiverBuilder` [Getter]
- `setPassThroughPercentage(BigDecimal arg0)` → `PassThroughItemBuilder` [Setter]

### Payout
**Implements:** `RosettaModelObject` `GlobalKey` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `Payout` [Builder]
- `getCreditDefaultPayout()` → `CreditDefaultPayout` [Getter]
- `getInterestRatePayout()` → `InterestRatePayout` [Getter]
- `getMeta()` → `MetaFields` [Getter]
- `getAssetPayout()` → `AssetPayout` [Getter]
- `getCommodityPayout()` → `CommodityPayout` [Getter]
- `getOptionPayout()` → `OptionPayout` [Getter]
- `getFixedPricePayout()` → `FixedPricePayout` [Getter]
- `getPerformancePayout()` → `PerformancePayout` [Getter]

### PayoutBuilder
**Implements:** `Payout` `RosettaModelObjectBuilder` `GlobalKey$GlobalKeyBuilder` 

**Key Methods:**
- `getCreditDefaultPayout()` → `CreditDefaultPayoutBuilder` [Getter]
- `getOrCreateMeta()` → `MetaFieldsBuilder` [Getter]
- `getInterestRatePayout()` → `InterestRatePayoutBuilder` [Getter]
- `getMeta()` → `MetaFieldsBuilder` [Getter]
- `setMeta(MetaFields arg0)` → `PayoutBuilder` [Setter]
- `setOptionPayout(OptionPayout arg0)` → `PayoutBuilder` [Setter]
- `setSettlementPayout(SettlementPayout arg0)` → `PayoutBuilder` [Setter]
- `setCommodityPayout(CommodityPayout arg0)` → `PayoutBuilder` [Setter]
- `setFixedPricePayout(FixedPricePayout arg0)` → `PayoutBuilder` [Setter]
- `getOrCreateAssetPayout()` → `AssetPayoutBuilder` [Getter]

### PerformancePayout
**Implements:** `PayoutBase` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `PerformancePayout` [Builder]
- `getUnderlier()` → `Underlier` [Getter]
- `getValuationDates()` → `ValuationDates` [Getter]
- `getPaymentDates()` → `PaymentDates` [Getter]
- `getObservationTerms()` → `ObservationTerms` [Getter]
- `getFxFeature()` → `List` [Getter]
- `getReturnTerms()` → `ReturnTerms` [Getter]
- `getInitialValuationPrice()` → `List` [Getter]
- `getPortfolioReturnTerms()` → `List` [Getter]

### PerformancePayoutBuilder
**Implements:** `PerformancePayout` `PayoutBase$PayoutBaseBuilder` 

**Key Methods:**
- `getOrCreateUnderlier()` → `UnderlierBuilder` [Getter]
- `getUnderlier()` → `UnderlierBuilder` [Getter]
- `setUnderlier(Underlier arg0)` → `PerformancePayoutBuilder` [Setter]
- `setPayerReceiver(PayerReceiver arg0)` → `PerformancePayoutBuilder` [Setter]
- `setPriceQuantity(ResolvablePriceQuantity arg0)` → `PerformancePayoutBuilder` [Setter]
- `getValuationDates()` → `ValuationDatesBuilder` [Getter]
- `setSettlementTerms(SettlementTerms arg0)` → `PerformancePayoutBuilder` [Setter]
- `getOrCreateReturnTerms()` → `ReturnTermsBuilder` [Getter]
- `setValuationDates(ValuationDates arg0)` → `PerformancePayoutBuilder` [Setter]
- `setPaymentDates(PaymentDates arg0)` → `PerformancePayoutBuilder` [Setter]

### PortfolioReturnTerms
**Implements:** `ReturnTerms` `GlobalKey` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `PortfolioReturnTerms` [Builder]
- `getUnderlier()` → `ReferenceWithMetaObservable` [Getter]
- `getQuantity()` → `ReferenceWithMetaNonNegativeQuantitySchedule` [Getter]
- `getPayerReceiver()` → `PayerReceiver` [Getter]
- `getMeta()` → `MetaFields` [Getter]
- `getInitialValuationPrice()` → `List` [Getter]
- `getFinalValuationPrice()` → `List` [Getter]
- `getInterimValuationPrice()` → `List` [Getter]

### PortfolioReturnTermsBuilder
**Implements:** `PortfolioReturnTerms` `ReturnTerms$ReturnTermsBuilder` `GlobalKey$GlobalKeyBuilder` 

**Key Methods:**
- `getOrCreateUnderlier()` → `ReferenceWithMetaObservableBuilder` [Getter]
- `getUnderlier()` → `ReferenceWithMetaObservableBuilder` [Getter]
- `setUnderlier(ReferenceWithMetaObservable arg0)` → `PortfolioReturnTermsBuilder` [Setter]
- `getQuantity()` → `ReferenceWithMetaNonNegativeQuantityScheduleBuilder` [Getter]
- `setPayerReceiver(PayerReceiver arg0)` → `PortfolioReturnTermsBuilder` [Setter]
- `getOrCreatePayerReceiver()` → `PayerReceiverBuilder` [Getter]
- `setQuantity(ReferenceWithMetaNonNegativeQuantitySchedule arg0)` → `PortfolioReturnTermsBuilder` [Setter]
- `getPayerReceiver()` → `PayerReceiverBuilder` [Getter]
- `getOrCreateQuantity()` → `ReferenceWithMetaNonNegativeQuantityScheduleBuilder` [Getter]
- `getOrCreateMeta()` → `MetaFieldsBuilder` [Getter]

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
- `getTransferableProduct()` → `TransferableProductBuilder` [Getter]
- `getNonTransferableProduct()` → `NonTransferableProductBuilder` [Getter]
- `setNonTransferableProduct(NonTransferableProduct arg0)` → `ProductBuilder` [Setter]
- `setTransferableProduct(TransferableProduct arg0)` → `ProductBuilder` [Setter]
- `getOrCreateTransferableProduct()` → `TransferableProductBuilder` [Getter]
- `getOrCreateNonTransferableProduct()` → `NonTransferableProductBuilder` [Getter]

### Quanto
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `Quanto` [Builder]
- `getFxSpotRateSource()` → `FxSpotRateSource` [Getter]
- `getFixingTime()` → `BusinessCenterTime` [Getter]
- `getFxRate()` → `List` [Getter]

### QuantoBuilder
**Implements:** `Quanto` `RosettaModelObjectBuilder` 

**Key Methods:**
- `getFxSpotRateSource()` → `FxSpotRateSourceBuilder` [Getter]
- `getFixingTime()` → `BusinessCenterTimeBuilder` [Getter]
- `setFixingTime(BusinessCenterTime arg0)` → `QuantoBuilder` [Setter]
- `getOrCreateFxRate(int arg0)` → `FxRateBuilder` [Getter]
- `getOrCreateFixingTime()` → `BusinessCenterTimeBuilder` [Getter]
- `setFxSpotRateSource(FxSpotRateSource arg0)` → `QuantoBuilder` [Setter]
- `getOrCreateFxSpotRateSource()` → `FxSpotRateSourceBuilder` [Getter]
- `setFxRate(List arg0)` → `QuantoBuilder` [Setter]
- `getFxRate()` → `List` [Getter]

### ReturnTerms
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `ReturnTerms` [Builder]
- `getPriceReturnTerms()` → `PriceReturnTerms` [Getter]
- `getVolatilityReturnTerms()` → `VolatilityReturnTerms` [Getter]
- `getDividendReturnTerms()` → `DividendReturnTerms` [Getter]
- `getCorrelationReturnTerms()` → `CorrelationReturnTerms` [Getter]
- `getVarianceReturnTerms()` → `VarianceReturnTerms` [Getter]

### ReturnTermsBuilder
**Implements:** `ReturnTerms` `RosettaModelObjectBuilder` 

**Key Methods:**
- `getOrCreatePriceReturnTerms()` → `PriceReturnTermsBuilder` [Getter]
- `setPriceReturnTerms(PriceReturnTerms arg0)` → `ReturnTermsBuilder` [Setter]
- `setVarianceReturnTerms(VarianceReturnTerms arg0)` → `ReturnTermsBuilder` [Setter]
- `setDividendReturnTerms(DividendReturnTerms arg0)` → `ReturnTermsBuilder` [Setter]
- `setVolatilityReturnTerms(VolatilityReturnTerms arg0)` → `ReturnTermsBuilder` [Setter]
- `setCorrelationReturnTerms(CorrelationReturnTerms arg0)` → `ReturnTermsBuilder` [Setter]
- `getOrCreateVarianceReturnTerms()` → `VarianceReturnTermsBuilder` [Getter]
- `getOrCreateCorrelationReturnTerms()` → `CorrelationReturnTermsBuilder` [Getter]
- `getOrCreateVolatilityReturnTerms()` → `VolatilityReturnTermsBuilder` [Getter]
- `getOrCreateDividendReturnTerms()` → `DividendReturnTermsBuilder` [Getter]

### SchedulePeriod
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `SchedulePeriod` [Builder]
- `getDeliveryPeriod()` → `CalculationScheduleDeliveryPeriods` [Getter]
- `getFixingPeriod()` → `DateRange` [Getter]
- `getCalculationPeriod()` → `DateRange` [Getter]
- `getPaymentDate()` → `Date` [Getter]

### SchedulePeriodBuilder
**Implements:** `SchedulePeriod` `RosettaModelObjectBuilder` 

**Key Methods:**
- `getDeliveryPeriod()` → `CalculationScheduleDeliveryPeriodsBuilder` [Getter]
- `getFixingPeriod()` → `DateRangeBuilder` [Getter]
- `setFixingPeriod(DateRange arg0)` → `SchedulePeriodBuilder` [Setter]
- `setDeliveryPeriod(CalculationScheduleDeliveryPeriods arg0)` → `SchedulePeriodBuilder` [Setter]
- `getOrCreateFixingPeriod()` → `DateRangeBuilder` [Getter]
- `getOrCreateDeliveryPeriod()` → `CalculationScheduleDeliveryPeriodsBuilder` [Getter]
- `setCalculationPeriod(DateRange arg0)` → `SchedulePeriodBuilder` [Setter]
- `getCalculationPeriod()` → `DateRangeBuilder` [Getter]
- `getOrCreateCalculationPeriod()` → `DateRangeBuilder` [Getter]
- `setPaymentDate(Date arg0)` → `SchedulePeriodBuilder` [Setter]

### SettlementPayout
**Implements:** `PayoutBase` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `SettlementPayout` [Builder]
- `getUnderlier()` → `Underlier` [Getter]
- `getDelivery()` → `AssetDeliveryInformation` [Getter]
- `getSchedule()` → `CalculationSchedule` [Getter]
- `getDeliveryTerm()` → `String` [Getter]

### SettlementPayoutBuilder
**Implements:** `SettlementPayout` `PayoutBase$PayoutBaseBuilder` 

**Key Methods:**
- `getOrCreateUnderlier()` → `UnderlierBuilder` [Getter]
- `getUnderlier()` → `UnderlierBuilder` [Getter]
- `setUnderlier(Underlier arg0)` → `SettlementPayoutBuilder` [Setter]
- `setPayerReceiver(PayerReceiver arg0)` → `SettlementPayoutBuilder` [Setter]
- `setPriceQuantity(ResolvablePriceQuantity arg0)` → `SettlementPayoutBuilder` [Setter]
- `setSettlementTerms(SettlementTerms arg0)` → `SettlementPayoutBuilder` [Setter]
- `getDelivery()` → `AssetDeliveryInformationBuilder` [Getter]
- `setDelivery(AssetDeliveryInformation arg0)` → `SettlementPayoutBuilder` [Setter]
- `getOrCreateDelivery()` → `AssetDeliveryInformationBuilder` [Getter]
- `getSchedule()` → `CalculationScheduleBuilder` [Getter]

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
- `setCalendarSpread(CalendarSpread arg0)` → `StrategyFeatureBuilder` [Setter]
- `getOrCreateStrikeSpread()` → `StrikeSpreadBuilder` [Getter]
- `getOrCreateCalendarSpread()` → `CalendarSpreadBuilder` [Getter]
- `setStrikeSpread(StrikeSpread arg0)` → `StrategyFeatureBuilder` [Setter]

### Strike
**Implements:** `RosettaModelObject` `GlobalKey` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `Strike` [Builder]
- `getMeta()` → `MetaFields` [Getter]
- `getStrikeRate()` → `BigDecimal` [Getter]
- `getBuyer()` → `PayerReceiverEnum` [Getter]
- `getSeller()` → `PayerReceiverEnum` [Getter]

### StrikeBuilder
**Implements:** `Strike` `RosettaModelObjectBuilder` `GlobalKey$GlobalKeyBuilder` 

**Key Methods:**
- `getOrCreateMeta()` → `MetaFieldsBuilder` [Getter]
- `getMeta()` → `MetaFieldsBuilder` [Getter]
- `setMeta(MetaFields arg0)` → `StrikeBuilder` [Setter]
- `setStrikeRate(BigDecimal arg0)` → `StrikeBuilder` [Setter]
- `setBuyer(PayerReceiverEnum arg0)` → `StrikeBuilder` [Setter]
- `setSeller(PayerReceiverEnum arg0)` → `StrikeBuilder` [Setter]

### StrikeSchedule
**Implements:** `RateSchedule` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `StrikeSchedule` [Builder]
- `getBuyer()` → `PayerReceiverEnum` [Getter]
- `getSeller()` → `PayerReceiverEnum` [Getter]

### StrikeScheduleBuilder
**Implements:** `StrikeSchedule` `RateSchedule$RateScheduleBuilder` 

**Key Methods:**
- `setPriceValue(PriceSchedule arg0)` → `StrikeScheduleBuilder` [Setter]
- `setPrice(ReferenceWithMetaPriceSchedule arg0)` → `StrikeScheduleBuilder` [Setter]
- `setBuyer(PayerReceiverEnum arg0)` → `StrikeScheduleBuilder` [Setter]
- `setSeller(PayerReceiverEnum arg0)` → `StrikeScheduleBuilder` [Setter]

### StrikeSpread
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `StrikeSpread` [Builder]
- `getUpperStrike()` → `OptionStrike` [Getter]
- `getUpperStrikeNumberOfOptions()` → `BigDecimal` [Getter]

### StrikeSpreadBuilder
**Implements:** `StrikeSpread` `RosettaModelObjectBuilder` 

**Key Methods:**
- `getUpperStrike()` → `OptionStrikeBuilder` [Getter]
- `getOrCreateUpperStrike()` → `OptionStrikeBuilder` [Getter]
- `setUpperStrike(OptionStrike arg0)` → `StrikeSpreadBuilder` [Setter]
- `setUpperStrikeNumberOfOptions(BigDecimal arg0)` → `StrikeSpreadBuilder` [Setter]

### TerminationProvision
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `TerminationProvision` [Builder]
- `getCancelableProvision()` → `CancelableProvision` [Getter]
- `getEvergreenProvision()` → `EvergreenProvision` [Getter]
- `getExtendibleProvision()` → `ExtendibleProvision` [Getter]
- `getEarlyTerminationProvision()` → `EarlyTerminationProvision` [Getter]

### TerminationProvisionBuilder
**Implements:** `TerminationProvision` `RosettaModelObjectBuilder` 

**Key Methods:**
- `getCancelableProvision()` → `CancelableProvisionBuilder` [Getter]
- `getEvergreenProvision()` → `EvergreenProvisionBuilder` [Getter]
- `setEvergreenProvision(EvergreenProvision arg0)` → `TerminationProvisionBuilder` [Setter]
- `setExtendibleProvision(ExtendibleProvision arg0)` → `TerminationProvisionBuilder` [Setter]
- `setCancelableProvision(CancelableProvision arg0)` → `TerminationProvisionBuilder` [Setter]
- `getExtendibleProvision()` → `ExtendibleProvisionBuilder` [Getter]
- `getOrCreateEarlyTerminationProvision()` → `EarlyTerminationProvisionBuilder` [Getter]
- `getOrCreateEvergreenProvision()` → `EvergreenProvisionBuilder` [Getter]
- `getOrCreateCancelableProvision()` → `CancelableProvisionBuilder` [Getter]
- `getOrCreateExtendibleProvision()` → `ExtendibleProvisionBuilder` [Getter]

### TradableProduct
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `TradableProduct` [Builder]
- `getAdjustment()` → `NotionalAdjustmentEnum` [Getter]
- `getCounterparty()` → `List` [Getter]
- `getTradeLot()` → `List` [Getter]
- `getAncillaryParty()` → `List` [Getter]
- `getProduct()` → `NonTransferableProduct` [Getter]

### TradableProductBuilder
**Implements:** `TradableProduct` `RosettaModelObjectBuilder` 

**Key Methods:**
- `getCounterparty()` → `List` [Getter]
- `getTradeLot()` → `List` [Getter]
- `getAncillaryParty()` → `List` [Getter]
- `getOrCreateTradeLot(int arg0)` → `TradeLotBuilder` [Getter]
- `setCounterparty(List arg0)` → `TradableProductBuilder` [Setter]
- `getOrCreateAncillaryParty(int arg0)` → `AncillaryPartyBuilder` [Getter]
- `getOrCreateCounterparty(int arg0)` → `CounterpartyBuilder` [Getter]
- `setAncillaryParty(List arg0)` → `TradableProductBuilder` [Setter]
- `getOrCreateProduct()` → `NonTransferableProductBuilder` [Getter]
- `getProduct()` → `NonTransferableProductBuilder` [Getter]

### TradeLot
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `TradeLot` [Builder]
- `getPriceQuantity()` → `List` [Getter]
- `getLotIdentifier()` → `List` [Getter]

### TradeLotBuilder
**Implements:** `TradeLot` `RosettaModelObjectBuilder` 

**Key Methods:**
- `getPriceQuantity()` → `List` [Getter]
- `getLotIdentifier()` → `List` [Getter]
- `getOrCreateLotIdentifier(int arg0)` → `IdentifierBuilder` [Getter]
- `setLotIdentifier(List arg0)` → `TradeLotBuilder` [Setter]
- `setPriceQuantity(List arg0)` → `TradeLotBuilder` [Setter]
- `getOrCreatePriceQuantity(int arg0)` → `PriceQuantityBuilder` [Getter]

### TransferableProduct
**Implements:** `Asset` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `TransferableProduct` [Builder]
- `getEconomicTerms()` → `EconomicTerms` [Getter]

### TransferableProductBuilder
**Implements:** `TransferableProduct` `Asset$AssetBuilder` 

**Key Methods:**
- `getEconomicTerms()` → `EconomicTermsBuilder` [Getter]
- `getOrCreateEconomicTerms()` → `EconomicTermsBuilder` [Getter]
- `setCommodity(Commodity arg0)` → `TransferableProductBuilder` [Setter]
- `setInstrument(Instrument arg0)` → `TransferableProductBuilder` [Setter]
- `setDigitalAsset(DigitalAsset arg0)` → `TransferableProductBuilder` [Setter]
- `setEconomicTerms(EconomicTerms arg0)` → `TransferableProductBuilder` [Setter]
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
- `getObservable()` → `ReferenceWithMetaObservableBuilder` [Getter]
- `getOrCreateObservable()` → `ReferenceWithMetaObservableBuilder` [Getter]
- `getOrCreateProduct()` → `ProductBuilder` [Getter]
- `setObservableValue(Observable arg0)` → `UnderlierBuilder` [Setter]
- `setObservable(ReferenceWithMetaObservable arg0)` → `UnderlierBuilder` [Setter]
- `getProduct()` → `ProductBuilder` [Getter]
- `setProduct(Product arg0)` → `UnderlierBuilder` [Setter]

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
- `getAveragingPeriodOut()` → `AveragingPeriodBuilder` [Getter]
- `getAveragingInOut()` → `AveragingInOutEnum` [Getter]
- `getStrikeFactor()` → `BigDecimal` [Getter]
- `getAveragingPeriodIn()` → `AveragingPeriodBuilder` [Getter]
- `setAveragingInOut(AveragingInOutEnum arg0)` → `AsianBuilder` [Setter]
- `setAveragingPeriodIn(AveragingPeriod arg0)` → `AsianBuilder` [Setter]
- `setStrikeFactor(BigDecimal arg0)` → `AsianBuilder` [Setter]
- `setAveragingPeriodOut(AveragingPeriod arg0)` → `AsianBuilder` [Setter]
- `getOrCreateAveragingPeriodIn()` → `AveragingPeriodBuilder` [Getter]

### AsianImpl
**Implements:** `Asian` 

**Key Methods:**
- `build()` → `Asian` [Builder]
- `setBuilderFields(AsianBuilder arg0)` → `void` [Setter]
- `getAveragingPeriodOut()` → `AveragingPeriod` [Getter]
- `getAveragingInOut()` → `AveragingInOutEnum` [Getter]
- `getStrikeFactor()` → `BigDecimal` [Getter]
- `getAveragingPeriodIn()` → `AveragingPeriod` [Getter]

### AssetLegBuilderImpl
**Implements:** `AssetLeg$AssetLegBuilder` 

**Fields:**
- `AdjustableOrRelativeDateBuilder settlementDate`
- `DeliveryMethodEnum deliveryMethod`

**Key Methods:**
- `build()` → `AssetLeg` [Builder]
- `setSettlementDate(AdjustableOrRelativeDate arg0)` → `AssetLegBuilder` [Setter]
- `getOrCreateSettlementDate()` → `AdjustableOrRelativeDateBuilder` [Getter]
- `getSettlementDate()` → `AdjustableOrRelativeDateBuilder` [Getter]
- `setDeliveryMethod(DeliveryMethodEnum arg0)` → `AssetLegBuilder` [Setter]
- `getDeliveryMethod()` → `DeliveryMethodEnum` [Getter]

### AssetLegImpl
**Implements:** `AssetLeg` 

**Key Methods:**
- `build()` → `AssetLeg` [Builder]
- `setBuilderFields(AssetLegBuilder arg0)` → `void` [Setter]
- `getSettlementDate()` → `AdjustableOrRelativeDate` [Getter]
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
- `getOrCreateUnderlier()` → `AssetBuilder` [Getter]
- `getUnderlier()` → `AssetBuilder` [Getter]
- `setUnderlier(Asset arg0)` → `AssetPayoutBuilder` [Setter]
- `setPayerReceiver(PayerReceiver arg0)` → `AssetPayoutBuilder` [Setter]
- `setPriceQuantity(ResolvablePriceQuantity arg0)` → `AssetPayoutBuilder` [Setter]
- `setSettlementTerms(SettlementTerms arg0)` → `AssetPayoutBuilder` [Setter]
- `setPrincipalPayment(PrincipalPayments arg0)` → `AssetPayoutBuilder` [Setter]
- `getOrCreateAssetLeg(int arg0)` → `AssetLegBuilder` [Getter]
- `getOrCreateDividendTerms()` → `DividendTermsBuilder` [Getter]

### AssetPayoutImpl
**Extends:** `PayoutBase$PayoutBaseImpl` 
**Implements:** `AssetPayout` 

**Key Methods:**
- `build()` → `AssetPayout` [Builder]
- `getUnderlier()` → `Asset` [Getter]
- `setBuilderFields(AssetPayoutBuilder arg0)` → `void` [Setter]
- `getAssetLeg()` → `List` [Getter]
- `getDividendTerms()` → `DividendTerms` [Getter]
- `getTradeType()` → `AssetPayoutTradeTypeEnum` [Getter]
- `getMinimumFee()` → `Money` [Getter]

### AutomaticExerciseBuilderImpl
**Implements:** `AutomaticExercise$AutomaticExerciseBuilder` 

**Fields:**
- `BigDecimal thresholdRate`
- `Boolean isApplicable`

**Key Methods:**
- `build()` → `AutomaticExercise` [Builder]
- `getThresholdRate()` → `BigDecimal` [Getter]
- `setThresholdRate(BigDecimal arg0)` → `AutomaticExerciseBuilder` [Setter]
- `getIsApplicable()` → `Boolean` [Getter]
- `setIsApplicable(Boolean arg0)` → `AutomaticExerciseBuilder` [Setter]

### AutomaticExerciseImpl
**Implements:** `AutomaticExercise` 

**Key Methods:**
- `build()` → `AutomaticExercise` [Builder]
- `setBuilderFields(AutomaticExerciseBuilder arg0)` → `void` [Setter]
- `getThresholdRate()` → `BigDecimal` [Getter]
- `getIsApplicable()` → `Boolean` [Getter]

### AveragingCalculationBuilderImpl
**Implements:** `AveragingCalculation$AveragingCalculationBuilder` 

**Fields:**
- `AveragingCalculationMethodBuilder averagingMethod`
- `RoundingBuilder precision`

**Key Methods:**
- `build()` → `AveragingCalculation` [Builder]
- `getAveragingMethod()` → `AveragingCalculationMethodBuilder` [Getter]
- `getPrecision()` → `RoundingBuilder` [Getter]
- `getOrCreateAveragingMethod()` → `AveragingCalculationMethodBuilder` [Getter]
- `setPrecision(Rounding arg0)` → `AveragingCalculationBuilder` [Setter]
- `setAveragingMethod(AveragingCalculationMethod arg0)` → `AveragingCalculationBuilder` [Setter]
- `getOrCreatePrecision()` → `RoundingBuilder` [Getter]

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
- `getObservationTerms()` → `ObservationTermsBuilder` [Getter]
- `setObservationTerms(ObservationTerms arg0)` → `AveragingStrikeFeatureBuilder` [Setter]
- `getOrCreateObservationTerms()` → `ObservationTermsBuilder` [Getter]
- `getAveragingCalculation()` → `AveragingCalculationBuilder` [Getter]
- `setAveragingCalculation(AveragingCalculation arg0)` → `AveragingStrikeFeatureBuilder` [Setter]
- `getOrCreateAveragingCalculation()` → `AveragingCalculationBuilder` [Getter]

### AveragingStrikeFeatureImpl
**Implements:** `AveragingStrikeFeature` 

**Key Methods:**
- `build()` → `AveragingStrikeFeature` [Builder]
- `setBuilderFields(AveragingStrikeFeatureBuilder arg0)` → `void` [Setter]
- `getObservationTerms()` → `ObservationTerms` [Getter]
- `getAveragingCalculation()` → `AveragingCalculation` [Getter]

### BarrierBuilderImpl
**Implements:** `Barrier$BarrierBuilder` 

**Fields:**
- `TriggerEventBuilder barrierCap`
- `TriggerEventBuilder barrierFloor`

**Key Methods:**
- `build()` → `Barrier` [Builder]
- `getOrCreateBarrierCap()` → `TriggerEventBuilder` [Getter]
- `getOrCreateBarrierFloor()` → `TriggerEventBuilder` [Getter]
- `setBarrierFloor(TriggerEvent arg0)` → `BarrierBuilder` [Setter]
- `setBarrierCap(TriggerEvent arg0)` → `BarrierBuilder` [Setter]
- `getBarrierCap()` → `TriggerEventBuilder` [Getter]
- `getBarrierFloor()` → `TriggerEventBuilder` [Getter]

### BarrierImpl
**Implements:** `Barrier` 

**Key Methods:**
- `build()` → `Barrier` [Builder]
- `setBuilderFields(BarrierBuilder arg0)` → `void` [Setter]
- `getBarrierCap()` → `TriggerEvent` [Getter]
- `getBarrierFloor()` → `TriggerEvent` [Getter]

### CalculationScheduleBuilderImpl
**Implements:** `CalculationSchedule$CalculationScheduleBuilder` 

**Fields:**
- `List (List) schedulePeriod`

**Key Methods:**
- `build()` → `CalculationSchedule` [Builder]
- `getOrCreateSchedulePeriod(int arg0)` → `SchedulePeriodBuilder` [Getter]
- `setSchedulePeriod(List arg0)` → `CalculationScheduleBuilder` [Setter]
- `getSchedulePeriod()` → `List` [Getter]

### CalculationScheduleImpl
**Implements:** `CalculationSchedule` 

**Key Methods:**
- `build()` → `CalculationSchedule` [Builder]
- `setBuilderFields(CalculationScheduleBuilder arg0)` → `void` [Setter]
- `getSchedulePeriod()` → `List` [Getter]

### CalendarSpreadBuilderImpl
**Implements:** `CalendarSpread$CalendarSpreadBuilder` 

**Fields:**
- `AdjustableOrRelativeDateBuilder expirationDateTwo`

**Key Methods:**
- `build()` → `CalendarSpread` [Builder]
- `setExpirationDateTwo(AdjustableOrRelativeDate arg0)` → `CalendarSpreadBuilder` [Setter]
- `getExpirationDateTwo()` → `AdjustableOrRelativeDateBuilder` [Getter]
- `getOrCreateExpirationDateTwo()` → `AdjustableOrRelativeDateBuilder` [Getter]

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
- `getEffectiveDate()` → `AdjustableOrRelativeDatesBuilder` [Getter]
- `setFinalCalculationPeriodDateAdjustment(List arg0)` → `CancelableProvisionBuilder` [Setter]
- `setEarliestCancellationTime(BusinessCenterTime arg0)` → `CancelableProvisionBuilder` [Setter]
- `getOrCreateLatestCancelationTime()` → `BusinessCenterTimeBuilder` [Getter]
- `setCancelableProvisionAdjustedDates(CancelableProvisionAdjustedDates arg0)` → `CancelableProvisionBuilder` [Setter]
- `getOrCreateEarliestCancellationTime()` → `BusinessCenterTimeBuilder` [Getter]
- `getOrCreateCancelableProvisionAdjustedDates()` → `CancelableProvisionAdjustedDatesBuilder` [Getter]
- `getOrCreateFinalCalculationPeriodDateAdjustment(int arg0)` → `FinalCalculationPeriodDateAdjustmentBuilder` [Getter]
- `getOrCreateEffectiveDate()` → `AdjustableOrRelativeDatesBuilder` [Getter]

### CancelableProvisionImpl
**Extends:** `BuyerSeller$BuyerSellerImpl` 
**Implements:** `CancelableProvision` 

**Key Methods:**
- `build()` → `CancelableProvision` [Builder]
- `setBuilderFields(CancelableProvisionBuilder arg0)` → `void` [Setter]
- `getEffectiveDate()` → `AdjustableOrRelativeDates` [Getter]
- `getExerciseTerms()` → `ExerciseTerms` [Getter]
- `getEffectivePeriod()` → `Period` [Getter]
- `getExerciseNotice()` → `ExerciseNotice` [Getter]
- `getEarliestDate()` → `AdjustableOrRelativeDate` [Getter]
- `getExpirationDate()` → `AdjustableOrRelativeDate` [Getter]
- `getFollowUpConfirmation()` → `Boolean` [Getter]
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
- `setAdjustedEarlyTerminationDate(Date arg0)` → `CancellationEventBuilder` [Setter]
- `getAdjustedExerciseDate()` → `Date` [Getter]
- `setAdjustedExerciseDate(Date arg0)` → `CancellationEventBuilder` [Setter]
- `getMeta()` → `MetaFieldsBuilder` [Getter]
- `setMeta(MetaFields arg0)` → `CancellationEventBuilder` [Setter]
- `getAdjustedEarlyTerminationDate()` → `Date` [Getter]

### CancellationEventImpl
**Implements:** `CancellationEvent` 

**Key Methods:**
- `build()` → `CancellationEvent` [Builder]
- `setBuilderFields(CancellationEventBuilder arg0)` → `void` [Setter]
- `getAdjustedExerciseDate()` → `Date` [Getter]
- `getMeta()` → `MetaFields` [Getter]
- `getAdjustedEarlyTerminationDate()` → `Date` [Getter]

### CompositeBuilderImpl
**Implements:** `Composite$CompositeBuilder` 

**Fields:**
- `DeterminationMethodEnum determinationMethod`
- `RelativeDateOffsetBuilder relativeDate`
- `FxSpotRateSourceBuilder fxSpotRateSource`
- `BusinessCenterTimeBuilder fixingTime`

**Key Methods:**
- `build()` → `Composite` [Builder]
- `getRelativeDate()` → `RelativeDateOffsetBuilder` [Getter]
- `setDeterminationMethod(DeterminationMethodEnum arg0)` → `CompositeBuilder` [Setter]
- `getDeterminationMethod()` → `DeterminationMethodEnum` [Getter]
- `getFxSpotRateSource()` → `FxSpotRateSourceBuilder` [Getter]
- `getFixingTime()` → `BusinessCenterTimeBuilder` [Getter]
- `setFixingTime(BusinessCenterTime arg0)` → `CompositeBuilder` [Setter]
- `getOrCreateFixingTime()` → `BusinessCenterTimeBuilder` [Getter]
- `setFxSpotRateSource(FxSpotRateSource arg0)` → `CompositeBuilder` [Setter]
- `getOrCreateFxSpotRateSource()` → `FxSpotRateSourceBuilder` [Getter]

### CompositeImpl
**Implements:** `Composite` 

**Key Methods:**
- `build()` → `Composite` [Builder]
- `setBuilderFields(CompositeBuilder arg0)` → `void` [Setter]
- `getRelativeDate()` → `RelativeDateOffset` [Getter]
- `getDeterminationMethod()` → `DeterminationMethodEnum` [Getter]
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
- `setBasketPercentage(BigDecimal arg0)` → `ConstituentWeightBuilder` [Setter]
- `setOpenUnits(BigDecimal arg0)` → `ConstituentWeightBuilder` [Setter]

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
- `getDividendEntitlement()` → `DividendEntitlementEnum` [Getter]
- `setDividendEntitlement(DividendEntitlementEnum arg0)` → `DividendTermsBuilder` [Setter]
- `getMinimumBillingAmount()` → `MoneyBuilder` [Getter]
- `setMinimumBillingAmount(Money arg0)` → `DividendTermsBuilder` [Setter]
- `setManufacturedIncomeRequirement(DividendPayoutRatio arg0)` → `DividendTermsBuilder` [Setter]
- `getManufacturedIncomeRequirement()` → `DividendPayoutRatioBuilder` [Getter]
- `getOrCreateMinimumBillingAmount()` → `MoneyBuilder` [Getter]

### DividendTermsImpl
**Implements:** `DividendTerms` 

**Key Methods:**
- `build()` → `DividendTerms` [Builder]
- `setBuilderFields(DividendTermsBuilder arg0)` → `void` [Setter]
- `getDividendEntitlement()` → `DividendEntitlementEnum` [Getter]
- `getMinimumBillingAmount()` → `Money` [Getter]
- `getManufacturedIncomeRequirement()` → `DividendPayoutRatio` [Getter]

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
- `setAdjustedEarlyTerminationDate(Date arg0)` → `EarlyTerminationEventBuilder` [Setter]
- `getAdjustedCashSettlementPaymentDate()` → `Date` [Getter]
- `getAdjustedCashSettlementValuationDate()` → `Date` [Getter]
- `setAdjustedCashSettlementPaymentDate(Date arg0)` → `EarlyTerminationEventBuilder` [Setter]
- `setAdjustedExerciseFeePaymentDate(Date arg0)` → `EarlyTerminationEventBuilder` [Setter]
- `getAdjustedExerciseFeePaymentDate()` → `Date` [Getter]
- `setAdjustedCashSettlementValuationDate(Date arg0)` → `EarlyTerminationEventBuilder` [Setter]
- `getAdjustedExerciseDate()` → `Date` [Getter]

### EarlyTerminationEventImpl
**Implements:** `EarlyTerminationEvent` 

**Key Methods:**
- `build()` → `EarlyTerminationEvent` [Builder]
- `setBuilderFields(EarlyTerminationEventBuilder arg0)` → `void` [Setter]
- `getAdjustedCashSettlementPaymentDate()` → `Date` [Getter]
- `getAdjustedCashSettlementValuationDate()` → `Date` [Getter]
- `getAdjustedExerciseFeePaymentDate()` → `Date` [Getter]
- `getAdjustedExerciseDate()` → `Date` [Getter]
- `getMeta()` → `MetaFields` [Getter]
- `getAdjustedEarlyTerminationDate()` → `Date` [Getter]

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
- `getOrCreateMeta()` → `MetaFieldsBuilder` [Getter]
- `getOrCreateOptionalEarlyTermination()` → `OptionalEarlyTerminationBuilder` [Getter]
- `setMandatoryEarlyTermination(MandatoryEarlyTermination arg0)` → `EarlyTerminationProvisionBuilder` [Setter]
- `setOptionalEarlyTermination(OptionalEarlyTermination arg0)` → `EarlyTerminationProvisionBuilder` [Setter]
- `setMandatoryEarlyTerminationDateTenor(Period arg0)` → `EarlyTerminationProvisionBuilder` [Setter]
- `getOrCreateMandatoryEarlyTermination()` → `MandatoryEarlyTerminationBuilder` [Getter]
- `setOptionalEarlyTerminationParameters(ExercisePeriod arg0)` → `EarlyTerminationProvisionBuilder` [Setter]
- `getMeta()` → `MetaFieldsBuilder` [Getter]
- `setMeta(MetaFields arg0)` → `EarlyTerminationProvisionBuilder` [Setter]

### EarlyTerminationProvisionImpl
**Implements:** `EarlyTerminationProvision` 

**Key Methods:**
- `build()` → `EarlyTerminationProvision` [Builder]
- `setBuilderFields(EarlyTerminationProvisionBuilder arg0)` → `void` [Setter]
- `getMeta()` → `MetaFields` [Getter]
- `getMandatoryEarlyTerminationDateTenor()` → `Period` [Getter]
- `getOptionalEarlyTerminationParameters()` → `ExercisePeriod` [Getter]
- `getMandatoryEarlyTermination()` → `MandatoryEarlyTermination` [Getter]
- `getOptionalEarlyTermination()` → `OptionalEarlyTermination` [Getter]

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
- `getCollateral()` → `CollateralBuilder` [Getter]
- `getEffectiveDate()` → `AdjustableOrRelativeDateBuilder` [Getter]
- `getTerminationDate()` → `AdjustableOrRelativeDateBuilder` [Getter]
- `setTerminationDate(AdjustableOrRelativeDate arg0)` → `EconomicTermsBuilder` [Setter]
- `setPayout(List arg0)` → `EconomicTermsBuilder` [Setter]
- `setCollateral(Collateral arg0)` → `EconomicTermsBuilder` [Setter]
- `getOrCreateCollateral()` → `CollateralBuilder` [Getter]
- `getPayout()` → `List` [Getter]
- `setCalculationAgent(CalculationAgent arg0)` → `EconomicTermsBuilder` [Setter]

### EconomicTermsImpl
**Implements:** `EconomicTerms` 

**Key Methods:**
- `build()` → `EconomicTerms` [Builder]
- `setBuilderFields(EconomicTermsBuilder arg0)` → `void` [Setter]
- `getCollateral()` → `Collateral` [Getter]
- `getEffectiveDate()` → `AdjustableOrRelativeDate` [Getter]
- `getTerminationDate()` → `AdjustableOrRelativeDate` [Getter]
- `getPayout()` → `List` [Getter]
- `getCalculationAgent()` → `CalculationAgent` [Getter]
- `getTerminationProvision()` → `TerminationProvision` [Getter]
- `getNonStandardisedTerms()` → `Boolean` [Getter]
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
- `setExtensionFrequency(AdjustableRelativeOrPeriodicDates arg0)` → `EvergreenProvisionBuilder` [Setter]
- `getOrCreateNoticePeriod()` → `RelativeDateOffsetBuilder` [Getter]
- `setNoticePeriod(RelativeDateOffset arg0)` → `EvergreenProvisionBuilder` [Setter]
- `setFinalPeriodFeeAdjustment(Price arg0)` → `EvergreenProvisionBuilder` [Setter]
- `getOrCreateExtensionFrequency()` → `AdjustableRelativeOrPeriodicDatesBuilder` [Getter]
- `getOrCreateFinalPeriodFeeAdjustment()` → `PriceBuilder` [Getter]
- `getSinglePartyOption()` → `PartyRoleBuilder` [Getter]
- `getExtensionFrequency()` → `AdjustableRelativeOrPeriodicDatesBuilder` [Getter]
- `getNoticePeriod()` → `RelativeDateOffsetBuilder` [Getter]

### EvergreenProvisionImpl
**Implements:** `EvergreenProvision` 

**Key Methods:**
- `build()` → `EvergreenProvision` [Builder]
- `setBuilderFields(EvergreenProvisionBuilder arg0)` → `void` [Setter]
- `getSinglePartyOption()` → `PartyRole` [Getter]
- `getExtensionFrequency()` → `AdjustableRelativeOrPeriodicDates` [Getter]
- `getNoticePeriod()` → `RelativeDateOffset` [Getter]
- `getFinalPeriodFeeAdjustment()` → `Price` [Getter]
- `getNoticeDeadlinePeriod()` → `RelativeDateOffset` [Getter]
- `getNoticeDeadlineDateTime()` → `ZonedDateTime` [Getter]

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
- `setFeeRate(BigDecimal arg0)` → `ExerciseFeeBuilder` [Setter]
- `getFeePaymentDate()` → `RelativeDateOffsetBuilder` [Getter]
- `setNotionalReferenceValue(Money arg0)` → `ExerciseFeeBuilder` [Setter]
- `setNotionalReference(ReferenceWithMetaMoney arg0)` → `ExerciseFeeBuilder` [Setter]
- `setFeePaymentDate(RelativeDateOffset arg0)` → `ExerciseFeeBuilder` [Setter]
- `getOrCreateFeePaymentDate()` → `RelativeDateOffsetBuilder` [Getter]
- `getNotionalReference()` → `ReferenceWithMetaMoneyBuilder` [Getter]
- `getFeeAmount()` → `BigDecimal` [Getter]
- `setReceiver(CounterpartyRoleEnum arg0)` → `ExerciseFeeBuilder` [Setter]

### ExerciseFeeImpl
**Extends:** `PayerReceiver$PayerReceiverImpl` 
**Implements:** `ExerciseFee` 

**Key Methods:**
- `build()` → `ExerciseFee` [Builder]
- `setBuilderFields(ExerciseFeeBuilder arg0)` → `void` [Setter]
- `getFeePaymentDate()` → `RelativeDateOffset` [Getter]
- `getNotionalReference()` → `ReferenceWithMetaMoney` [Getter]
- `getFeeAmount()` → `BigDecimal` [Getter]
- `getFeeRate()` → `BigDecimal` [Getter]

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
- `getOrCreateFeeRateSchedule()` → `ScheduleBuilder` [Getter]
- `getFeePaymentDate()` → `RelativeDateOffsetBuilder` [Getter]
- `setNotionalReferenceValue(Money arg0)` → `ExerciseFeeScheduleBuilder` [Setter]
- `getFeeAmountSchedule()` → `AmountScheduleBuilder` [Getter]
- `setNotionalReference(ReferenceWithMetaMoney arg0)` → `ExerciseFeeScheduleBuilder` [Setter]
- `getFeeRateSchedule()` → `ScheduleBuilder` [Getter]
- `setFeeAmountSchedule(AmountSchedule arg0)` → `ExerciseFeeScheduleBuilder` [Setter]
- `setFeeRateSchedule(Schedule arg0)` → `ExerciseFeeScheduleBuilder` [Setter]
- `setFeePaymentDate(RelativeDateOffset arg0)` → `ExerciseFeeScheduleBuilder` [Setter]

### ExerciseFeeScheduleImpl
**Extends:** `PayerReceiver$PayerReceiverImpl` 
**Implements:** `ExerciseFeeSchedule` 

**Key Methods:**
- `build()` → `ExerciseFeeSchedule` [Builder]
- `setBuilderFields(ExerciseFeeScheduleBuilder arg0)` → `void` [Setter]
- `getFeePaymentDate()` → `RelativeDateOffset` [Getter]
- `getFeeAmountSchedule()` → `AmountSchedule` [Getter]
- `getFeeRateSchedule()` → `Schedule` [Getter]
- `getNotionalReference()` → `ReferenceWithMetaMoney` [Getter]

### ExerciseNoticeBuilderImpl
**Implements:** `ExerciseNotice$ExerciseNoticeBuilder` 

**Fields:**
- `ExerciseNoticeGiverEnum exerciseNoticeGiver`
- `AncillaryRoleEnum exerciseNoticeReceiver`
- `FieldWithMetaBusinessCenterEnumBuilder businessCenter`

**Key Methods:**
- `build()` → `ExerciseNotice` [Builder]
- `getBusinessCenter()` → `FieldWithMetaBusinessCenterEnumBuilder` [Getter]
- `setBusinessCenterValue(BusinessCenterEnum arg0)` → `ExerciseNoticeBuilder` [Setter]
- `getOrCreateBusinessCenter()` → `FieldWithMetaBusinessCenterEnumBuilder` [Getter]
- `setBusinessCenter(FieldWithMetaBusinessCenterEnum arg0)` → `ExerciseNoticeBuilder` [Setter]
- `getExerciseNoticeReceiver()` → `AncillaryRoleEnum` [Getter]
- `setExerciseNoticeGiver(ExerciseNoticeGiverEnum arg0)` → `ExerciseNoticeBuilder` [Setter]
- `getExerciseNoticeGiver()` → `ExerciseNoticeGiverEnum` [Getter]
- `setExerciseNoticeReceiver(AncillaryRoleEnum arg0)` → `ExerciseNoticeBuilder` [Setter]

### ExerciseNoticeImpl
**Implements:** `ExerciseNotice` 

**Key Methods:**
- `build()` → `ExerciseNotice` [Builder]
- `setBuilderFields(ExerciseNoticeBuilder arg0)` → `void` [Setter]
- `getBusinessCenter()` → `FieldWithMetaBusinessCenterEnum` [Getter]
- `getExerciseNoticeReceiver()` → `AncillaryRoleEnum` [Getter]
- `getExerciseNoticeGiver()` → `ExerciseNoticeGiverEnum` [Getter]

### ExercisePeriodBuilderImpl
**Implements:** `ExercisePeriod$ExercisePeriodBuilder` 

**Fields:**
- `PeriodBuilder earliestExerciseDateTenor`
- `PeriodBuilder exerciseFrequency`
- `MetaFieldsBuilder meta`

**Key Methods:**
- `build()` → `ExercisePeriod` [Builder]
- `getOrCreateMeta()` → `MetaFieldsBuilder` [Getter]
- `setExerciseFrequency(Period arg0)` → `ExercisePeriodBuilder` [Setter]
- `getEarliestExerciseDateTenor()` → `PeriodBuilder` [Getter]
- `getOrCreateExerciseFrequency()` → `PeriodBuilder` [Getter]
- `setEarliestExerciseDateTenor(Period arg0)` → `ExercisePeriodBuilder` [Setter]
- `getOrCreateEarliestExerciseDateTenor()` → `PeriodBuilder` [Getter]
- `getExerciseFrequency()` → `PeriodBuilder` [Getter]
- `getMeta()` → `MetaFieldsBuilder` [Getter]
- `setMeta(MetaFields arg0)` → `ExercisePeriodBuilder` [Setter]

### ExercisePeriodImpl
**Implements:** `ExercisePeriod` 

**Key Methods:**
- `build()` → `ExercisePeriod` [Builder]
- `setBuilderFields(ExercisePeriodBuilder arg0)` → `void` [Setter]
- `getEarliestExerciseDateTenor()` → `Period` [Getter]
- `getExerciseFrequency()` → `Period` [Getter]
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
- `getLimitedRightToConfirm()` → `Boolean` [Getter]
- `getOrCreateManualExercise()` → `ManualExerciseBuilder` [Getter]
- `setFollowUpConfirmation(Boolean arg0)` → `ExerciseProcedureBuilder` [Setter]
- `getManualExercise()` → `ManualExerciseBuilder` [Getter]
- `setAutomaticExercise(AutomaticExercise arg0)` → `ExerciseProcedureBuilder` [Setter]
- `setManualExercise(ManualExercise arg0)` → `ExerciseProcedureBuilder` [Setter]
- `setLimitedRightToConfirm(Boolean arg0)` → `ExerciseProcedureBuilder` [Setter]
- `getSplitTicket()` → `Boolean` [Getter]

### ExerciseProcedureImpl
**Implements:** `ExerciseProcedure` 

**Key Methods:**
- `build()` → `ExerciseProcedure` [Builder]
- `setBuilderFields(ExerciseProcedureBuilder arg0)` → `void` [Setter]
- `getFollowUpConfirmation()` → `Boolean` [Getter]
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
- `getOrCreateMeta()` → `MetaFieldsBuilder` [Getter]
- `getMeta()` → `MetaFieldsBuilder` [Getter]
- `setMeta(MetaFields arg0)` → `ExerciseTermsBuilder` [Setter]
- `getStyle()` → `OptionExerciseStyleEnum` [Getter]
- `getExpirationDate()` → `List` [Getter]
- `setEarliestExerciseTime(BusinessCenterTime arg0)` → `ExerciseTermsBuilder` [Setter]
- `setLatestExerciseTime(BusinessCenterTime arg0)` → `ExerciseTermsBuilder` [Setter]
- `setExerciseDates(AdjustableOrRelativeDates arg0)` → `ExerciseTermsBuilder` [Setter]

### ExerciseTermsImpl
**Implements:** `ExerciseTerms` 

**Key Methods:**
- `build()` → `ExerciseTerms` [Builder]
- `setBuilderFields(ExerciseTermsBuilder arg0)` → `void` [Setter]
- `getMeta()` → `MetaFields` [Getter]
- `getStyle()` → `OptionExerciseStyleEnum` [Getter]
- `getExpirationDate()` → `List` [Getter]
- `getExerciseFee()` → `ExerciseFee` [Getter]
- `getExerciseProcedure()` → `ExerciseProcedure` [Getter]
- `getRelevantUnderlyingDate()` → `AdjustableOrRelativeDates` [Getter]
- `getLatestExerciseTime()` → `BusinessCenterTime` [Getter]
- `getEarliestExerciseTime()` → `BusinessCenterTime` [Getter]

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
- `getOrCreateExtensionPeriod()` → `AdjustableRelativeOrPeriodicDatesBuilder` [Getter]
- `setExtensionTerm(RelativeDateOffset arg0)` → `ExtendibleProvisionBuilder` [Setter]
- `getOrCreateExtensionTerm()` → `RelativeDateOffsetBuilder` [Getter]
- `setExtendibleProvisionAdjustedDates(ExtendibleProvisionAdjustedDates arg0)` → `ExtendibleProvisionBuilder` [Setter]
- `getOrCreateExtendibleProvisionAdjustedDates()` → `ExtendibleProvisionAdjustedDatesBuilder` [Getter]
- `getExerciseTerms()` → `ExerciseTermsBuilder` [Getter]
- `getSinglePartyOption()` → `PartyRoleBuilder` [Getter]
- `getExtensionTerm()` → `RelativeDateOffsetBuilder` [Getter]

### ExtendibleProvisionImpl
**Extends:** `BuyerSeller$BuyerSellerImpl` 
**Implements:** `ExtendibleProvision` 

**Key Methods:**
- `build()` → `ExtendibleProvision` [Builder]
- `setBuilderFields(ExtendibleProvisionBuilder arg0)` → `void` [Setter]
- `getExerciseTerms()` → `ExerciseTerms` [Getter]
- `getSinglePartyOption()` → `PartyRole` [Getter]
- `getExtensionTerm()` → `RelativeDateOffset` [Getter]
- `getExerciseNotice()` → `ExerciseNotice` [Getter]
- `getFollowUpConfirmation()` → `Boolean` [Getter]
- `getCallingParty()` → `CallingPartyEnum` [Getter]
- `getExtensionPeriod()` → `AdjustableRelativeOrPeriodicDates` [Getter]
- `getExtendibleProvisionAdjustedDates()` → `ExtendibleProvisionAdjustedDates` [Getter]

### ExtensionEventBuilderImpl
**Implements:** `ExtensionEvent$ExtensionEventBuilder` 

**Fields:**
- `Date adjustedExerciseDate`
- `Date adjustedExtendedTerminationDate`
- `MetaFieldsBuilder meta`

**Key Methods:**
- `build()` → `ExtensionEvent` [Builder]
- `getOrCreateMeta()` → `MetaFieldsBuilder` [Getter]
- `setAdjustedExtendedTerminationDate(Date arg0)` → `ExtensionEventBuilder` [Setter]
- `getAdjustedExerciseDate()` → `Date` [Getter]
- `setAdjustedExerciseDate(Date arg0)` → `ExtensionEventBuilder` [Setter]
- `getMeta()` → `MetaFieldsBuilder` [Getter]
- `setMeta(MetaFields arg0)` → `ExtensionEventBuilder` [Setter]
- `getAdjustedExtendedTerminationDate()` → `Date` [Getter]

### ExtensionEventImpl
**Implements:** `ExtensionEvent` 

**Key Methods:**
- `build()` → `ExtensionEvent` [Builder]
- `setBuilderFields(ExtensionEventBuilder arg0)` → `void` [Setter]
- `getAdjustedExerciseDate()` → `Date` [Getter]
- `getMeta()` → `MetaFields` [Getter]
- `getAdjustedExtendedTerminationDate()` → `Date` [Getter]

### FixedPricePayoutBuilderImpl
**Extends:** `PayoutBase$PayoutBaseBuilderImpl` 
**Implements:** `FixedPricePayout$FixedPricePayoutBuilder` 

**Fields:**
- `PaymentDatesBuilder paymentDates`
- `FixedPriceBuilder fixedPrice`
- `CalculationScheduleBuilder schedule`

**Key Methods:**
- `build()` → `FixedPricePayout` [Builder]
- `setPayerReceiver(PayerReceiver arg0)` → `FixedPricePayoutBuilder` [Setter]
- `setPriceQuantity(ResolvablePriceQuantity arg0)` → `FixedPricePayoutBuilder` [Setter]
- `setSettlementTerms(SettlementTerms arg0)` → `FixedPricePayoutBuilder` [Setter]
- `setPaymentDates(PaymentDates arg0)` → `FixedPricePayoutBuilder` [Setter]
- `getPaymentDates()` → `PaymentDatesBuilder` [Getter]
- `getOrCreatePaymentDates()` → `PaymentDatesBuilder` [Getter]
- `getSchedule()` → `CalculationScheduleBuilder` [Getter]
- `setPrincipalPayment(PrincipalPayments arg0)` → `FixedPricePayoutBuilder` [Setter]
- `getOrCreateSchedule()` → `CalculationScheduleBuilder` [Getter]

### FixedPricePayoutImpl
**Extends:** `PayoutBase$PayoutBaseImpl` 
**Implements:** `FixedPricePayout` 

**Key Methods:**
- `build()` → `FixedPricePayout` [Builder]
- `setBuilderFields(FixedPricePayoutBuilder arg0)` → `void` [Setter]
- `getPaymentDates()` → `PaymentDates` [Getter]
- `getSchedule()` → `CalculationSchedule` [Getter]
- `getFixedPrice()` → `FixedPrice` [Getter]

### FxFeatureBuilderImpl
**Implements:** `FxFeature$FxFeatureBuilder` 

**Fields:**
- `FieldWithMetaStringBuilder referenceCurrency`
- `CompositeBuilder composite`
- `QuantoBuilder quanto`
- `CompositeBuilder crossCurrency`

**Key Methods:**
- `build()` → `FxFeature` [Builder]
- `getComposite()` → `CompositeBuilder` [Getter]
- `setComposite(Composite arg0)` → `FxFeatureBuilder` [Setter]
- `getReferenceCurrency()` → `FieldWithMetaStringBuilder` [Getter]
- `getCrossCurrency()` → `CompositeBuilder` [Getter]
- `setReferenceCurrency(FieldWithMetaString arg0)` → `FxFeatureBuilder` [Setter]
- `getOrCreateQuanto()` → `QuantoBuilder` [Getter]
- `setReferenceCurrencyValue(String arg0)` → `FxFeatureBuilder` [Setter]
- `getOrCreateCrossCurrency()` → `CompositeBuilder` [Getter]
- `setCrossCurrency(Composite arg0)` → `FxFeatureBuilder` [Setter]

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
- `setKnockIn(TriggerEvent arg0)` → `KnockBuilder` [Setter]
- `getKnockOut()` → `TriggerEventBuilder` [Getter]
- `getKnockIn()` → `TriggerEventBuilder` [Getter]
- `getOrCreateKnockIn()` → `TriggerEventBuilder` [Getter]
- `getOrCreateKnockOut()` → `TriggerEventBuilder` [Getter]
- `setKnockOut(TriggerEvent arg0)` → `KnockBuilder` [Setter]

### KnockImpl
**Implements:** `Knock` 

**Key Methods:**
- `build()` → `Knock` [Builder]
- `setBuilderFields(KnockBuilder arg0)` → `void` [Setter]
- `getKnockOut()` → `TriggerEvent` [Getter]
- `getKnockIn()` → `TriggerEvent` [Getter]

### MandatoryEarlyTerminationAdjustedDatesBuilderImpl
**Implements:** `MandatoryEarlyTerminationAdjustedDates$MandatoryEarlyTerminationAdjustedDatesBuilder` 

**Fields:**
- `Date adjustedEarlyTerminationDate`
- `Date adjustedCashSettlementValuationDate`
- `Date adjustedCashSettlementPaymentDate`

**Key Methods:**
- `build()` → `MandatoryEarlyTerminationAdjustedDates` [Builder]
- `setAdjustedEarlyTerminationDate(Date arg0)` → `MandatoryEarlyTerminationAdjustedDatesBuilder` [Setter]
- `getAdjustedCashSettlementPaymentDate()` → `Date` [Getter]
- `getAdjustedCashSettlementValuationDate()` → `Date` [Getter]
- `setAdjustedCashSettlementPaymentDate(Date arg0)` → `MandatoryEarlyTerminationAdjustedDatesBuilder` [Setter]
- `setAdjustedCashSettlementValuationDate(Date arg0)` → `MandatoryEarlyTerminationAdjustedDatesBuilder` [Setter]
- `getAdjustedEarlyTerminationDate()` → `Date` [Getter]

### MandatoryEarlyTerminationAdjustedDatesImpl
**Implements:** `MandatoryEarlyTerminationAdjustedDates` 

**Key Methods:**
- `build()` → `MandatoryEarlyTerminationAdjustedDates` [Builder]
- `setBuilderFields(MandatoryEarlyTerminationAdjustedDatesBuilder arg0)` → `void` [Setter]
- `getAdjustedCashSettlementPaymentDate()` → `Date` [Getter]
- `getAdjustedCashSettlementValuationDate()` → `Date` [Getter]
- `getAdjustedEarlyTerminationDate()` → `Date` [Getter]

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
- `getOrCreateMeta()` → `MetaFieldsBuilder` [Getter]
- `getMandatoryEarlyTerminationAdjustedDates()` → `MandatoryEarlyTerminationAdjustedDatesBuilder` [Getter]
- `getOrCreateMandatoryEarlyTerminationDate()` → `AdjustableDateBuilder` [Getter]
- `getMandatoryEarlyTerminationDate()` → `AdjustableDateBuilder` [Getter]
- `setMandatoryEarlyTerminationAdjustedDates(MandatoryEarlyTerminationAdjustedDates arg0)` → `MandatoryEarlyTerminationBuilder` [Setter]
- `setMandatoryEarlyTerminationDate(AdjustableDate arg0)` → `MandatoryEarlyTerminationBuilder` [Setter]
- `getMeta()` → `MetaFieldsBuilder` [Getter]
- `setMeta(MetaFields arg0)` → `MandatoryEarlyTerminationBuilder` [Setter]
- `getOrCreateMandatoryEarlyTerminationAdjustedDates()` → `MandatoryEarlyTerminationAdjustedDatesBuilder` [Getter]

### MandatoryEarlyTerminationImpl
**Implements:** `MandatoryEarlyTermination` 

**Key Methods:**
- `build()` → `MandatoryEarlyTermination` [Builder]
- `setBuilderFields(MandatoryEarlyTerminationBuilder arg0)` → `void` [Setter]
- `getMandatoryEarlyTerminationAdjustedDates()` → `MandatoryEarlyTerminationAdjustedDates` [Getter]
- `getMandatoryEarlyTerminationDate()` → `AdjustableDate` [Getter]
- `getMeta()` → `MetaFields` [Getter]
- `getCalculationAgent()` → `CalculationAgent` [Getter]
- `getCashSettlement()` → `SettlementTerms` [Getter]

### ManualExerciseBuilderImpl
**Implements:** `ManualExercise$ManualExerciseBuilder` 

**Fields:**
- `ExerciseNoticeBuilder exerciseNotice`
- `Boolean fallbackExercise`

**Key Methods:**
- `build()` → `ManualExercise` [Builder]
- `getExerciseNotice()` → `ExerciseNoticeBuilder` [Getter]
- `setExerciseNotice(ExerciseNotice arg0)` → `ManualExerciseBuilder` [Setter]
- `setFallbackExercise(Boolean arg0)` → `ManualExerciseBuilder` [Setter]
- `getFallbackExercise()` → `Boolean` [Getter]
- `getOrCreateExerciseNotice()` → `ExerciseNoticeBuilder` [Getter]

### ManualExerciseImpl
**Implements:** `ManualExercise` 

**Key Methods:**
- `build()` → `ManualExercise` [Builder]
- `setBuilderFields(ManualExerciseBuilder arg0)` → `void` [Setter]
- `getExerciseNotice()` → `ExerciseNotice` [Getter]
- `getFallbackExercise()` → `Boolean` [Getter]

### MultipleExerciseBuilderImpl
**Extends:** `PartialExercise$PartialExerciseBuilderImpl` 
**Implements:** `MultipleExercise$MultipleExerciseBuilder` 

**Fields:**
- `BigDecimal maximumNotionalAmount`
- `Integer maximumNumberOfOptions`

**Key Methods:**
- `build()` → `MultipleExercise` [Builder]
- `getMaximumNotionalAmount()` → `BigDecimal` [Getter]
- `getMaximumNumberOfOptions()` → `Integer` [Getter]
- `setMinimumNotionalAmount(BigDecimal arg0)` → `MultipleExerciseBuilder` [Setter]
- `setNotionaReference(ReferenceWithMetaMoney arg0)` → `MultipleExerciseBuilder` [Setter]
- `setNotionaReferenceValue(Money arg0)` → `MultipleExerciseBuilder` [Setter]
- `setMinimumNumberOfOptions(Integer arg0)` → `MultipleExerciseBuilder` [Setter]
- `setIntegralMultipleAmount(BigDecimal arg0)` → `MultipleExerciseBuilder` [Setter]
- `setMaximumNotionalAmount(BigDecimal arg0)` → `MultipleExerciseBuilder` [Setter]
- `setMaximumNumberOfOptions(Integer arg0)` → `MultipleExerciseBuilder` [Setter]

### MultipleExerciseImpl
**Extends:** `PartialExercise$PartialExerciseImpl` 
**Implements:** `MultipleExercise` 

**Key Methods:**
- `build()` → `MultipleExercise` [Builder]
- `setBuilderFields(MultipleExerciseBuilder arg0)` → `void` [Setter]
- `getMaximumNotionalAmount()` → `BigDecimal` [Getter]
- `getMaximumNumberOfOptions()` → `Integer` [Getter]

### NonTransferableProductBuilderImpl
**Implements:** `NonTransferableProduct$NonTransferableProductBuilder` 

**Fields:**
- `List (List) identifier`
- `List (List) taxonomy`
- `EconomicTermsBuilder economicTerms`
- `MetaFieldsBuilder meta`

**Key Methods:**
- `build()` → `NonTransferableProduct` [Builder]
- `getEconomicTerms()` → `EconomicTermsBuilder` [Getter]
- `setIdentifier(List arg0)` → `NonTransferableProductBuilder` [Setter]
- `getOrCreateIdentifier(int arg0)` → `ProductIdentifierBuilder` [Getter]
- `getOrCreateMeta()` → `MetaFieldsBuilder` [Getter]
- `getOrCreateEconomicTerms()` → `EconomicTermsBuilder` [Getter]
- `getMeta()` → `MetaFieldsBuilder` [Getter]
- `setMeta(MetaFields arg0)` → `NonTransferableProductBuilder` [Setter]
- `getTaxonomy()` → `List` [Getter]
- `getOrCreateTaxonomy(int arg0)` → `ProductTaxonomyBuilder` [Getter]

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
- `getOrCreateAveragingFeature()` → `AveragingCalculationBuilder` [Getter]
- `getOrCreateFxFeature(int arg0)` → `FxFeatureBuilder` [Getter]
- `setFxFeature(List arg0)` → `OptionFeatureBuilder` [Setter]
- `getBarrier()` → `BarrierBuilder` [Getter]
- `getKnock()` → `KnockBuilder` [Getter]
- `getStrategyFeature()` → `StrategyFeatureBuilder` [Getter]
- `getFxFeature()` → `List` [Getter]
- `getAveragingFeature()` → `AveragingCalculationBuilder` [Getter]
- `getPassThrough()` → `PassThroughBuilder` [Getter]

### OptionFeatureImpl
**Implements:** `OptionFeature` 

**Key Methods:**
- `build()` → `OptionFeature` [Builder]
- `setBuilderFields(OptionFeatureBuilder arg0)` → `void` [Setter]
- `getBarrier()` → `Barrier` [Getter]
- `getKnock()` → `Knock` [Getter]
- `getStrategyFeature()` → `StrategyFeature` [Getter]
- `getFxFeature()` → `List` [Getter]
- `getAveragingFeature()` → `AveragingCalculation` [Getter]
- `getPassThrough()` → `PassThrough` [Getter]

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
- `getOrCreateUnderlier()` → `UnderlierBuilder` [Getter]
- `getUnderlier()` → `UnderlierBuilder` [Getter]
- `setUnderlier(Underlier arg0)` → `OptionPayoutBuilder` [Setter]
- `setPayerReceiver(PayerReceiver arg0)` → `OptionPayoutBuilder` [Setter]
- `setFeature(OptionFeature arg0)` → `OptionPayoutBuilder` [Setter]
- `getFeature()` → `OptionFeatureBuilder` [Getter]
- `setPriceQuantity(ResolvablePriceQuantity arg0)` → `OptionPayoutBuilder` [Setter]
- `setSettlementTerms(SettlementTerms arg0)` → `OptionPayoutBuilder` [Setter]
- `getObservationTerms()` → `ObservationTermsBuilder` [Getter]

### OptionPayoutImpl
**Extends:** `PayoutBase$PayoutBaseImpl` 
**Implements:** `OptionPayout` 

**Key Methods:**
- `build()` → `OptionPayout` [Builder]
- `getUnderlier()` → `Underlier` [Getter]
- `setBuilderFields(OptionPayoutBuilder arg0)` → `void` [Setter]
- `getFeature()` → `OptionFeature` [Getter]
- `getObservationTerms()` → `ObservationTerms` [Getter]
- `getStrike()` → `OptionStrike` [Getter]
- `getExerciseTerms()` → `ExerciseTerms` [Getter]
- `getDelivery()` → `AssetDeliveryInformation` [Getter]
- `getBuyerSeller()` → `BuyerSeller` [Getter]
- `getSchedule()` → `CalculationSchedule` [Getter]

### OptionStrikeBuilderImpl
**Implements:** `OptionStrike$OptionStrikeBuilder` 

**Fields:**
- `PriceBuilder strikePrice`
- `ReferenceWithMetaFixedRateSpecificationBuilder strikeReference`
- `ReferenceSwapCurveBuilder referenceSwapCurve`
- `AveragingStrikeFeatureBuilder averagingStrikeFeature`

**Key Methods:**
- `build()` → `OptionStrike` [Builder]
- `getOrCreateStrikePrice()` → `PriceBuilder` [Getter]
- `setStrikeReference(ReferenceWithMetaFixedRateSpecification arg0)` → `OptionStrikeBuilder` [Setter]
- `setStrikeReferenceValue(FixedRateSpecification arg0)` → `OptionStrikeBuilder` [Setter]
- `setReferenceSwapCurve(ReferenceSwapCurve arg0)` → `OptionStrikeBuilder` [Setter]
- `setStrikePrice(Price arg0)` → `OptionStrikeBuilder` [Setter]
- `getOrCreateStrikeReference()` → `ReferenceWithMetaFixedRateSpecificationBuilder` [Getter]
- `setAveragingStrikeFeature(AveragingStrikeFeature arg0)` → `OptionStrikeBuilder` [Setter]
- `getReferenceSwapCurve()` → `ReferenceSwapCurveBuilder` [Getter]
- `getAveragingStrikeFeature()` → `AveragingStrikeFeatureBuilder` [Getter]

### OptionStrikeImpl
**Implements:** `OptionStrike` 

**Key Methods:**
- `build()` → `OptionStrike` [Builder]
- `setBuilderFields(OptionStrikeBuilder arg0)` → `void` [Setter]
- `getReferenceSwapCurve()` → `ReferenceSwapCurve` [Getter]
- `getAveragingStrikeFeature()` → `AveragingStrikeFeature` [Getter]
- `getStrikePrice()` → `Price` [Getter]
- `getStrikeReference()` → `ReferenceWithMetaFixedRateSpecification` [Getter]

### OptionalEarlyTerminationAdjustedDatesBuilderImpl
**Implements:** `OptionalEarlyTerminationAdjustedDates$OptionalEarlyTerminationAdjustedDatesBuilder` 

**Fields:**
- `List (List) earlyTerminationEvent`

**Key Methods:**
- `build()` → `OptionalEarlyTerminationAdjustedDates` [Builder]
- `getEarlyTerminationEvent()` → `List` [Getter]
- `setEarlyTerminationEvent(List arg0)` → `OptionalEarlyTerminationAdjustedDatesBuilder` [Setter]
- `getOrCreateEarlyTerminationEvent(int arg0)` → `EarlyTerminationEventBuilder` [Getter]

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
- `getOrCreateOptionalEarlyTerminationAdjustedDates()` → `OptionalEarlyTerminationAdjustedDatesBuilder` [Getter]
- `setCalculationAgent(CalculationAgent arg0)` → `OptionalEarlyTerminationBuilder` [Setter]
- `getCalculationAgent()` → `CalculationAgentBuilder` [Getter]
- `getExerciseTerms()` → `ExerciseTermsBuilder` [Getter]
- `getSinglePartyOption()` → `BuyerSellerBuilder` [Getter]
- `getExerciseNotice()` → `List` [Getter]
- `getFollowUpConfirmation()` → `Boolean` [Getter]
- `setExerciseTerms(ExerciseTerms arg0)` → `OptionalEarlyTerminationBuilder` [Setter]
- `getOrCreateExerciseTerms()` → `ExerciseTermsBuilder` [Getter]

### OptionalEarlyTerminationImpl
**Implements:** `OptionalEarlyTermination` 

**Key Methods:**
- `build()` → `OptionalEarlyTermination` [Builder]
- `setBuilderFields(OptionalEarlyTerminationBuilder arg0)` → `void` [Setter]
- `getCalculationAgent()` → `CalculationAgent` [Getter]
- `getExerciseTerms()` → `ExerciseTerms` [Getter]
- `getSinglePartyOption()` → `BuyerSeller` [Getter]
- `getExerciseNotice()` → `List` [Getter]
- `getFollowUpConfirmation()` → `Boolean` [Getter]
- `getMutualEarlyTermination()` → `Boolean` [Getter]
- `getCashSettlement()` → `SettlementTerms` [Getter]
- `getOptionalEarlyTerminationAdjustedDates()` → `OptionalEarlyTerminationAdjustedDates` [Getter]

### PartialExerciseBuilderImpl
**Implements:** `PartialExercise$PartialExerciseBuilder` 

**Fields:**
- `ReferenceWithMetaMoneyBuilder notionaReference`
- `BigDecimal integralMultipleAmount`
- `BigDecimal minimumNotionalAmount`
- `Integer minimumNumberOfOptions`

**Key Methods:**
- `build()` → `PartialExercise` [Builder]
- `getNotionaReference()` → `ReferenceWithMetaMoneyBuilder` [Getter]
- `getIntegralMultipleAmount()` → `BigDecimal` [Getter]
- `getMinimumNumberOfOptions()` → `Integer` [Getter]
- `getMinimumNotionalAmount()` → `BigDecimal` [Getter]
- `setMinimumNotionalAmount(BigDecimal arg0)` → `PartialExerciseBuilder` [Setter]
- `setNotionaReference(ReferenceWithMetaMoney arg0)` → `PartialExerciseBuilder` [Setter]
- `setNotionaReferenceValue(Money arg0)` → `PartialExerciseBuilder` [Setter]
- `setMinimumNumberOfOptions(Integer arg0)` → `PartialExerciseBuilder` [Setter]
- `setIntegralMultipleAmount(BigDecimal arg0)` → `PartialExerciseBuilder` [Setter]

### PartialExerciseImpl
**Implements:** `PartialExercise` 

**Key Methods:**
- `build()` → `PartialExercise` [Builder]
- `setBuilderFields(PartialExerciseBuilder arg0)` → `void` [Setter]
- `getNotionaReference()` → `ReferenceWithMetaMoney` [Getter]
- `getIntegralMultipleAmount()` → `BigDecimal` [Getter]
- `getMinimumNumberOfOptions()` → `Integer` [Getter]
- `getMinimumNotionalAmount()` → `BigDecimal` [Getter]

### PassThroughBuilderImpl
**Implements:** `PassThrough$PassThroughBuilder` 

**Fields:**
- `List (List) passThroughItem`

**Key Methods:**
- `build()` → `PassThrough` [Builder]
- `getPassThroughItem()` → `List` [Getter]
- `getOrCreatePassThroughItem(int arg0)` → `PassThroughItemBuilder` [Getter]
- `setPassThroughItem(List arg0)` → `PassThroughBuilder` [Setter]

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
- `setPayerReceiver(PayerReceiver arg0)` → `PassThroughItemBuilder` [Setter]
- `getOrCreatePayerReceiver()` → `PayerReceiverBuilder` [Getter]
- `getPayerReceiver()` → `PayerReceiverBuilder` [Getter]
- `setPassThroughPercentage(BigDecimal arg0)` → `PassThroughItemBuilder` [Setter]
- `getPassThroughPercentage()` → `BigDecimal` [Getter]

### PassThroughItemImpl
**Implements:** `PassThroughItem` 

**Key Methods:**
- `build()` → `PassThroughItem` [Builder]
- `setBuilderFields(PassThroughItemBuilder arg0)` → `void` [Setter]
- `getPayerReceiver()` → `PayerReceiver` [Getter]
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
- `getOrCreateMeta()` → `MetaFieldsBuilder` [Getter]
- `getInterestRatePayout()` → `InterestRatePayoutBuilder` [Getter]
- `getMeta()` → `MetaFieldsBuilder` [Getter]
- `setMeta(MetaFields arg0)` → `PayoutBuilder` [Setter]
- `setOptionPayout(OptionPayout arg0)` → `PayoutBuilder` [Setter]
- `setSettlementPayout(SettlementPayout arg0)` → `PayoutBuilder` [Setter]
- `setCommodityPayout(CommodityPayout arg0)` → `PayoutBuilder` [Setter]
- `setFixedPricePayout(FixedPricePayout arg0)` → `PayoutBuilder` [Setter]

### PayoutImpl
**Implements:** `Payout` 

**Key Methods:**
- `build()` → `Payout` [Builder]
- `getCreditDefaultPayout()` → `CreditDefaultPayout` [Getter]
- `setBuilderFields(PayoutBuilder arg0)` → `void` [Setter]
- `getInterestRatePayout()` → `InterestRatePayout` [Getter]
- `getMeta()` → `MetaFields` [Getter]
- `getAssetPayout()` → `AssetPayout` [Getter]
- `getCommodityPayout()` → `CommodityPayout` [Getter]
- `getOptionPayout()` → `OptionPayout` [Getter]
- `getFixedPricePayout()` → `FixedPricePayout` [Getter]
- `getPerformancePayout()` → `PerformancePayout` [Getter]

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
- `getOrCreateUnderlier()` → `UnderlierBuilder` [Getter]
- `getUnderlier()` → `UnderlierBuilder` [Getter]
- `setUnderlier(Underlier arg0)` → `PerformancePayoutBuilder` [Setter]
- `setPayerReceiver(PayerReceiver arg0)` → `PerformancePayoutBuilder` [Setter]
- `setPriceQuantity(ResolvablePriceQuantity arg0)` → `PerformancePayoutBuilder` [Setter]
- `getValuationDates()` → `ValuationDatesBuilder` [Getter]
- `setSettlementTerms(SettlementTerms arg0)` → `PerformancePayoutBuilder` [Setter]
- `getOrCreateReturnTerms()` → `ReturnTermsBuilder` [Getter]
- `setValuationDates(ValuationDates arg0)` → `PerformancePayoutBuilder` [Setter]

### PerformancePayoutImpl
**Extends:** `PayoutBase$PayoutBaseImpl` 
**Implements:** `PerformancePayout` 

**Key Methods:**
- `build()` → `PerformancePayout` [Builder]
- `getUnderlier()` → `Underlier` [Getter]
- `setBuilderFields(PerformancePayoutBuilder arg0)` → `void` [Setter]
- `getValuationDates()` → `ValuationDates` [Getter]
- `getPaymentDates()` → `PaymentDates` [Getter]
- `getObservationTerms()` → `ObservationTerms` [Getter]
- `getFxFeature()` → `List` [Getter]
- `getReturnTerms()` → `ReturnTerms` [Getter]
- `getInitialValuationPrice()` → `List` [Getter]
- `getPortfolioReturnTerms()` → `List` [Getter]

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
- `getOrCreateUnderlier()` → `ReferenceWithMetaObservableBuilder` [Getter]
- `getUnderlier()` → `ReferenceWithMetaObservableBuilder` [Getter]
- `setUnderlier(ReferenceWithMetaObservable arg0)` → `PortfolioReturnTermsBuilder` [Setter]
- `getQuantity()` → `ReferenceWithMetaNonNegativeQuantityScheduleBuilder` [Getter]
- `setPayerReceiver(PayerReceiver arg0)` → `PortfolioReturnTermsBuilder` [Setter]
- `getOrCreatePayerReceiver()` → `PayerReceiverBuilder` [Getter]
- `setQuantity(ReferenceWithMetaNonNegativeQuantitySchedule arg0)` → `PortfolioReturnTermsBuilder` [Setter]
- `getPayerReceiver()` → `PayerReceiverBuilder` [Getter]
- `getOrCreateQuantity()` → `ReferenceWithMetaNonNegativeQuantityScheduleBuilder` [Getter]

### PortfolioReturnTermsImpl
**Extends:** `ReturnTerms$ReturnTermsImpl` 
**Implements:** `PortfolioReturnTerms` 

**Key Methods:**
- `build()` → `PortfolioReturnTerms` [Builder]
- `getUnderlier()` → `ReferenceWithMetaObservable` [Getter]
- `getQuantity()` → `ReferenceWithMetaNonNegativeQuantitySchedule` [Getter]
- `setBuilderFields(PortfolioReturnTermsBuilder arg0)` → `void` [Setter]
- `getPayerReceiver()` → `PayerReceiver` [Getter]
- `getMeta()` → `MetaFields` [Getter]
- `getInitialValuationPrice()` → `List` [Getter]
- `getFinalValuationPrice()` → `List` [Getter]
- `getInterimValuationPrice()` → `List` [Getter]

### ProductBuilderImpl
**Implements:** `Product$ProductBuilder` 

**Fields:**
- `TransferableProductBuilder transferableProduct`
- `NonTransferableProductBuilder nonTransferableProduct`

**Key Methods:**
- `build()` → `Product` [Builder]
- `getTransferableProduct()` → `TransferableProductBuilder` [Getter]
- `getNonTransferableProduct()` → `NonTransferableProductBuilder` [Getter]
- `setNonTransferableProduct(NonTransferableProduct arg0)` → `ProductBuilder` [Setter]
- `setTransferableProduct(TransferableProduct arg0)` → `ProductBuilder` [Setter]
- `getOrCreateTransferableProduct()` → `TransferableProductBuilder` [Getter]
- `getOrCreateNonTransferableProduct()` → `NonTransferableProductBuilder` [Getter]

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
- `getFxSpotRateSource()` → `FxSpotRateSourceBuilder` [Getter]
- `getFixingTime()` → `BusinessCenterTimeBuilder` [Getter]
- `setFixingTime(BusinessCenterTime arg0)` → `QuantoBuilder` [Setter]
- `getOrCreateFxRate(int arg0)` → `FxRateBuilder` [Getter]
- `getOrCreateFixingTime()` → `BusinessCenterTimeBuilder` [Getter]
- `setFxSpotRateSource(FxSpotRateSource arg0)` → `QuantoBuilder` [Setter]
- `getOrCreateFxSpotRateSource()` → `FxSpotRateSourceBuilder` [Getter]
- `setFxRate(List arg0)` → `QuantoBuilder` [Setter]
- `getFxRate()` → `List` [Getter]

### QuantoImpl
**Implements:** `Quanto` 

**Key Methods:**
- `build()` → `Quanto` [Builder]
- `setBuilderFields(QuantoBuilder arg0)` → `void` [Setter]
- `getFxSpotRateSource()` → `FxSpotRateSource` [Getter]
- `getFixingTime()` → `BusinessCenterTime` [Getter]
- `getFxRate()` → `List` [Getter]

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
- `getOrCreatePriceReturnTerms()` → `PriceReturnTermsBuilder` [Getter]
- `setPriceReturnTerms(PriceReturnTerms arg0)` → `ReturnTermsBuilder` [Setter]
- `setVarianceReturnTerms(VarianceReturnTerms arg0)` → `ReturnTermsBuilder` [Setter]
- `setDividendReturnTerms(DividendReturnTerms arg0)` → `ReturnTermsBuilder` [Setter]
- `setVolatilityReturnTerms(VolatilityReturnTerms arg0)` → `ReturnTermsBuilder` [Setter]
- `setCorrelationReturnTerms(CorrelationReturnTerms arg0)` → `ReturnTermsBuilder` [Setter]
- `getOrCreateVarianceReturnTerms()` → `VarianceReturnTermsBuilder` [Getter]
- `getOrCreateCorrelationReturnTerms()` → `CorrelationReturnTermsBuilder` [Getter]
- `getOrCreateVolatilityReturnTerms()` → `VolatilityReturnTermsBuilder` [Getter]

### ReturnTermsImpl
**Implements:** `ReturnTerms` 

**Key Methods:**
- `build()` → `ReturnTerms` [Builder]
- `setBuilderFields(ReturnTermsBuilder arg0)` → `void` [Setter]
- `getPriceReturnTerms()` → `PriceReturnTerms` [Getter]
- `getVolatilityReturnTerms()` → `VolatilityReturnTerms` [Getter]
- `getDividendReturnTerms()` → `DividendReturnTerms` [Getter]
- `getCorrelationReturnTerms()` → `CorrelationReturnTerms` [Getter]
- `getVarianceReturnTerms()` → `VarianceReturnTerms` [Getter]

### SchedulePeriodBuilderImpl
**Implements:** `SchedulePeriod$SchedulePeriodBuilder` 

**Fields:**
- `DateRangeBuilder calculationPeriod`
- `Date paymentDate`
- `DateRangeBuilder fixingPeriod`
- `CalculationScheduleDeliveryPeriodsBuilder deliveryPeriod`

**Key Methods:**
- `build()` → `SchedulePeriod` [Builder]
- `getDeliveryPeriod()` → `CalculationScheduleDeliveryPeriodsBuilder` [Getter]
- `getFixingPeriod()` → `DateRangeBuilder` [Getter]
- `setFixingPeriod(DateRange arg0)` → `SchedulePeriodBuilder` [Setter]
- `setDeliveryPeriod(CalculationScheduleDeliveryPeriods arg0)` → `SchedulePeriodBuilder` [Setter]
- `getOrCreateFixingPeriod()` → `DateRangeBuilder` [Getter]
- `getOrCreateDeliveryPeriod()` → `CalculationScheduleDeliveryPeriodsBuilder` [Getter]
- `setCalculationPeriod(DateRange arg0)` → `SchedulePeriodBuilder` [Setter]
- `getCalculationPeriod()` → `DateRangeBuilder` [Getter]
- `getOrCreateCalculationPeriod()` → `DateRangeBuilder` [Getter]

### SchedulePeriodImpl
**Implements:** `SchedulePeriod` 

**Key Methods:**
- `build()` → `SchedulePeriod` [Builder]
- `setBuilderFields(SchedulePeriodBuilder arg0)` → `void` [Setter]
- `getDeliveryPeriod()` → `CalculationScheduleDeliveryPeriods` [Getter]
- `getFixingPeriod()` → `DateRange` [Getter]
- `getCalculationPeriod()` → `DateRange` [Getter]
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
- `setPayerReceiver(PayerReceiver arg0)` → `SettlementPayoutBuilder` [Setter]
- `setPriceQuantity(ResolvablePriceQuantity arg0)` → `SettlementPayoutBuilder` [Setter]
- `setSettlementTerms(SettlementTerms arg0)` → `SettlementPayoutBuilder` [Setter]
- `getDelivery()` → `AssetDeliveryInformationBuilder` [Getter]
- `setDelivery(AssetDeliveryInformation arg0)` → `SettlementPayoutBuilder` [Setter]
- `getOrCreateDelivery()` → `AssetDeliveryInformationBuilder` [Getter]

### SettlementPayoutImpl
**Extends:** `PayoutBase$PayoutBaseImpl` 
**Implements:** `SettlementPayout` 

**Key Methods:**
- `build()` → `SettlementPayout` [Builder]
- `getUnderlier()` → `Underlier` [Getter]
- `setBuilderFields(SettlementPayoutBuilder arg0)` → `void` [Setter]
- `getDelivery()` → `AssetDeliveryInformation` [Getter]
- `getSchedule()` → `CalculationSchedule` [Getter]
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
- `setCalendarSpread(CalendarSpread arg0)` → `StrategyFeatureBuilder` [Setter]
- `getOrCreateStrikeSpread()` → `StrikeSpreadBuilder` [Getter]
- `getOrCreateCalendarSpread()` → `CalendarSpreadBuilder` [Getter]
- `setStrikeSpread(StrikeSpread arg0)` → `StrategyFeatureBuilder` [Setter]

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
- `getOrCreateMeta()` → `MetaFieldsBuilder` [Getter]
- `getMeta()` → `MetaFieldsBuilder` [Getter]
- `setMeta(MetaFields arg0)` → `StrikeBuilder` [Setter]
- `getStrikeRate()` → `BigDecimal` [Getter]
- `setStrikeRate(BigDecimal arg0)` → `StrikeBuilder` [Setter]
- `getBuyer()` → `PayerReceiverEnum` [Getter]
- `getSeller()` → `PayerReceiverEnum` [Getter]
- `setBuyer(PayerReceiverEnum arg0)` → `StrikeBuilder` [Setter]
- `setSeller(PayerReceiverEnum arg0)` → `StrikeBuilder` [Setter]

### StrikeImpl
**Implements:** `Strike` 

**Key Methods:**
- `build()` → `Strike` [Builder]
- `setBuilderFields(StrikeBuilder arg0)` → `void` [Setter]
- `getMeta()` → `MetaFields` [Getter]
- `getStrikeRate()` → `BigDecimal` [Getter]
- `getBuyer()` → `PayerReceiverEnum` [Getter]
- `getSeller()` → `PayerReceiverEnum` [Getter]

### StrikeScheduleBuilderImpl
**Extends:** `RateSchedule$RateScheduleBuilderImpl` 
**Implements:** `StrikeSchedule$StrikeScheduleBuilder` 

**Fields:**
- `PayerReceiverEnum buyer`
- `PayerReceiverEnum seller`

**Key Methods:**
- `build()` → `StrikeSchedule` [Builder]
- `setPriceValue(PriceSchedule arg0)` → `StrikeScheduleBuilder` [Setter]
- `getBuyer()` → `PayerReceiverEnum` [Getter]
- `getSeller()` → `PayerReceiverEnum` [Getter]
- `setPrice(ReferenceWithMetaPriceSchedule arg0)` → `StrikeScheduleBuilder` [Setter]
- `setBuyer(PayerReceiverEnum arg0)` → `StrikeScheduleBuilder` [Setter]
- `setSeller(PayerReceiverEnum arg0)` → `StrikeScheduleBuilder` [Setter]

### StrikeScheduleImpl
**Extends:** `RateSchedule$RateScheduleImpl` 
**Implements:** `StrikeSchedule` 

**Key Methods:**
- `build()` → `StrikeSchedule` [Builder]
- `setBuilderFields(StrikeScheduleBuilder arg0)` → `void` [Setter]
- `getBuyer()` → `PayerReceiverEnum` [Getter]
- `getSeller()` → `PayerReceiverEnum` [Getter]

### StrikeSpreadBuilderImpl
**Implements:** `StrikeSpread$StrikeSpreadBuilder` 

**Fields:**
- `OptionStrikeBuilder upperStrike`
- `BigDecimal upperStrikeNumberOfOptions`

**Key Methods:**
- `build()` → `StrikeSpread` [Builder]
- `getUpperStrike()` → `OptionStrikeBuilder` [Getter]
- `getOrCreateUpperStrike()` → `OptionStrikeBuilder` [Getter]
- `setUpperStrike(OptionStrike arg0)` → `StrikeSpreadBuilder` [Setter]
- `getUpperStrikeNumberOfOptions()` → `BigDecimal` [Getter]
- `setUpperStrikeNumberOfOptions(BigDecimal arg0)` → `StrikeSpreadBuilder` [Setter]

### StrikeSpreadImpl
**Implements:** `StrikeSpread` 

**Key Methods:**
- `build()` → `StrikeSpread` [Builder]
- `setBuilderFields(StrikeSpreadBuilder arg0)` → `void` [Setter]
- `getUpperStrike()` → `OptionStrike` [Getter]
- `getUpperStrikeNumberOfOptions()` → `BigDecimal` [Getter]

### TerminationProvisionBuilderImpl
**Implements:** `TerminationProvision$TerminationProvisionBuilder` 

**Fields:**
- `CancelableProvisionBuilder cancelableProvision`
- `EarlyTerminationProvisionBuilder earlyTerminationProvision`
- `EvergreenProvisionBuilder evergreenProvision`
- `ExtendibleProvisionBuilder extendibleProvision`

**Key Methods:**
- `build()` → `TerminationProvision` [Builder]
- `getCancelableProvision()` → `CancelableProvisionBuilder` [Getter]
- `getEvergreenProvision()` → `EvergreenProvisionBuilder` [Getter]
- `setEvergreenProvision(EvergreenProvision arg0)` → `TerminationProvisionBuilder` [Setter]
- `setExtendibleProvision(ExtendibleProvision arg0)` → `TerminationProvisionBuilder` [Setter]
- `setCancelableProvision(CancelableProvision arg0)` → `TerminationProvisionBuilder` [Setter]
- `getExtendibleProvision()` → `ExtendibleProvisionBuilder` [Getter]
- `getOrCreateEarlyTerminationProvision()` → `EarlyTerminationProvisionBuilder` [Getter]
- `getOrCreateEvergreenProvision()` → `EvergreenProvisionBuilder` [Getter]
- `getOrCreateCancelableProvision()` → `CancelableProvisionBuilder` [Getter]

### TerminationProvisionImpl
**Implements:** `TerminationProvision` 

**Key Methods:**
- `build()` → `TerminationProvision` [Builder]
- `setBuilderFields(TerminationProvisionBuilder arg0)` → `void` [Setter]
- `getCancelableProvision()` → `CancelableProvision` [Getter]
- `getEvergreenProvision()` → `EvergreenProvision` [Getter]
- `getExtendibleProvision()` → `ExtendibleProvision` [Getter]
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
- `getAdjustment()` → `NotionalAdjustmentEnum` [Getter]
- `getCounterparty()` → `List` [Getter]
- `getTradeLot()` → `List` [Getter]
- `getAncillaryParty()` → `List` [Getter]
- `getOrCreateTradeLot(int arg0)` → `TradeLotBuilder` [Getter]
- `setCounterparty(List arg0)` → `TradableProductBuilder` [Setter]
- `getOrCreateAncillaryParty(int arg0)` → `AncillaryPartyBuilder` [Getter]
- `getOrCreateCounterparty(int arg0)` → `CounterpartyBuilder` [Getter]
- `setAncillaryParty(List arg0)` → `TradableProductBuilder` [Setter]

### TradableProductImpl
**Implements:** `TradableProduct` 

**Key Methods:**
- `build()` → `TradableProduct` [Builder]
- `setBuilderFields(TradableProductBuilder arg0)` → `void` [Setter]
- `getAdjustment()` → `NotionalAdjustmentEnum` [Getter]
- `getCounterparty()` → `List` [Getter]
- `getTradeLot()` → `List` [Getter]
- `getAncillaryParty()` → `List` [Getter]
- `getProduct()` → `NonTransferableProduct` [Getter]

### TradeLotBuilderImpl
**Implements:** `TradeLot$TradeLotBuilder` 

**Fields:**
- `List (List) lotIdentifier`
- `List (List) priceQuantity`

**Key Methods:**
- `build()` → `TradeLot` [Builder]
- `getPriceQuantity()` → `List` [Getter]
- `getLotIdentifier()` → `List` [Getter]
- `getOrCreateLotIdentifier(int arg0)` → `IdentifierBuilder` [Getter]
- `setLotIdentifier(List arg0)` → `TradeLotBuilder` [Setter]
- `setPriceQuantity(List arg0)` → `TradeLotBuilder` [Setter]
- `getOrCreatePriceQuantity(int arg0)` → `PriceQuantityBuilder` [Getter]

### TradeLotImpl
**Implements:** `TradeLot` 

**Key Methods:**
- `build()` → `TradeLot` [Builder]
- `setBuilderFields(TradeLotBuilder arg0)` → `void` [Setter]
- `getPriceQuantity()` → `List` [Getter]
- `getLotIdentifier()` → `List` [Getter]

### TransferableProductBuilderImpl
**Extends:** `Asset$AssetBuilderImpl` 
**Implements:** `TransferableProduct$TransferableProductBuilder` 

**Fields:**
- `EconomicTermsBuilder economicTerms`

**Key Methods:**
- `build()` → `TransferableProduct` [Builder]
- `getEconomicTerms()` → `EconomicTermsBuilder` [Getter]
- `getOrCreateEconomicTerms()` → `EconomicTermsBuilder` [Getter]
- `setCommodity(Commodity arg0)` → `TransferableProductBuilder` [Setter]
- `setInstrument(Instrument arg0)` → `TransferableProductBuilder` [Setter]
- `setDigitalAsset(DigitalAsset arg0)` → `TransferableProductBuilder` [Setter]
- `setEconomicTerms(EconomicTerms arg0)` → `TransferableProductBuilder` [Setter]
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
- `getObservable()` → `ReferenceWithMetaObservableBuilder` [Getter]
- `getOrCreateObservable()` → `ReferenceWithMetaObservableBuilder` [Getter]
- `getOrCreateProduct()` → `ProductBuilder` [Getter]
- `setObservableValue(Observable arg0)` → `UnderlierBuilder` [Setter]
- `setObservable(ReferenceWithMetaObservable arg0)` → `UnderlierBuilder` [Setter]
- `getProduct()` → `ProductBuilder` [Getter]
- `setProduct(Product arg0)` → `UnderlierBuilder` [Setter]

### UnderlierImpl
**Implements:** `Underlier` 

**Key Methods:**
- `build()` → `Underlier` [Builder]
- `getObservable()` → `ReferenceWithMetaObservable` [Getter]
- `setBuilderFields(UnderlierBuilder arg0)` → `void` [Setter]
- `getProduct()` → `Product` [Getter]

