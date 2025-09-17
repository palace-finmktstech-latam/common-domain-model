# Package: cdm.product.common.schedule

## Enums

### PayRelativeToEnum
**Values:**
- `CalculationPeriodStartDate`
- `CalculationPeriodEndDate`
- `LastPricingDate`
- `ResetDate`
- `ValuationDate`

### ResetRelativeToEnum
**Values:**
- `CalculationPeriodStartDate`
- `CalculationPeriodEndDate`

### StubPeriodTypeEnum
**Values:**
- `ShortInitial`
- `ShortFinal`
- `LongInitial`
- `LongFinal`

### WeeklyRollConventionEnum
**Values:**
- `MON`
- `TUE`
- `WED`
- `THU`
- `FRI`
- `SAT`
- `SUN`
- `TBILL`

## Interfaces

### AmountSchedule
**Implements:** `Schedule` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `AmountSchedule` [Builder]
- `getCurrency()` → `List` [Getter]

### AmountScheduleBuilder
**Implements:** `AmountSchedule` `Schedule$ScheduleBuilder` 

**Key Methods:**
- `setValue(BigDecimal arg0)` → `AmountScheduleBuilder` [Setter]
- `getCurrency()` → `List` [Getter]
- `setCurrency(List arg0)` → `AmountScheduleBuilder` [Setter]
- `setCurrencyValue(List arg0)` → `AmountScheduleBuilder` [Setter]
- `setDatedValue(List arg0)` → `AmountScheduleBuilder` [Setter]
- `getOrCreateCurrency(int arg0)` → `FieldWithMetaStringBuilder` [Getter]

### AveragingObservationList
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `AveragingObservationList` [Builder]
- `getAveragingObservation()` → `List` [Getter]

### AveragingObservationListBuilder
**Implements:** `AveragingObservationList` `RosettaModelObjectBuilder` 

**Key Methods:**
- `getAveragingObservation()` → `List` [Getter]
- `setAveragingObservation(List arg0)` → `AveragingObservationListBuilder` [Setter]
- `getOrCreateAveragingObservation(int arg0)` → `WeightedAveragingObservationBuilder` [Getter]

### AveragingPeriod
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `AveragingPeriod` [Builder]
- `getSchedule()` → `List` [Getter]
- `getMarketDisruption()` → `FieldWithMetaMarketDisruptionEnum` [Getter]
- `getAveragingObservations()` → `AveragingObservationList` [Getter]
- `getAveragingDateTimes()` → `DateTimeList` [Getter]

### AveragingPeriodBuilder
**Implements:** `AveragingPeriod` `RosettaModelObjectBuilder` 

**Key Methods:**
- `getSchedule()` → `List` [Getter]
- `getOrCreateSchedule(int arg0)` → `AveragingScheduleBuilder` [Getter]
- `setSchedule(List arg0)` → `AveragingPeriodBuilder` [Setter]
- `setAveragingDateTimes(DateTimeList arg0)` → `AveragingPeriodBuilder` [Setter]
- `setMarketDisruptionValue(MarketDisruptionEnum arg0)` → `AveragingPeriodBuilder` [Setter]
- `setMarketDisruption(FieldWithMetaMarketDisruptionEnum arg0)` → `AveragingPeriodBuilder` [Setter]
- `setAveragingObservations(AveragingObservationList arg0)` → `AveragingPeriodBuilder` [Setter]
- `getMarketDisruption()` → `FieldWithMetaMarketDisruptionEnumBuilder` [Getter]
- `getAveragingObservations()` → `AveragingObservationListBuilder` [Getter]
- `getAveragingDateTimes()` → `DateTimeListBuilder` [Getter]

### CalculationPeriod
**Implements:** `CalculationPeriodBase` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `CalculationPeriod` [Builder]
- `getForecastRate()` → `BigDecimal` [Getter]
- `getUnadjustedEndDate()` → `Date` [Getter]
- `getFloatingRateDefinition()` → `FloatingRateDefinition` [Getter]
- `getDayCountYearFraction()` → `BigDecimal` [Getter]
- `getUnadjustedStartDate()` → `Date` [Getter]
- `getForecastAmount()` → `Money` [Getter]
- `getFxLinkedNotionalAmount()` → `FxLinkedNotionalAmount` [Getter]
- `getCalculationPeriodNumberOfDays()` → `Integer` [Getter]

### CalculationPeriodBase
**Implements:** `RosettaModelObject` `GlobalKey` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `CalculationPeriodBase` [Builder]
- `getMeta()` → `MetaFields` [Getter]
- `getAdjustedEndDate()` → `Date` [Getter]
- `getAdjustedStartDate()` → `Date` [Getter]

### CalculationPeriodBaseBuilder
**Implements:** `CalculationPeriodBase` `RosettaModelObjectBuilder` `GlobalKey$GlobalKeyBuilder` 

**Key Methods:**
- `getOrCreateMeta()` → `MetaFieldsBuilder` [Getter]
- `getMeta()` → `MetaFieldsBuilder` [Getter]
- `setMeta(MetaFields arg0)` → `CalculationPeriodBaseBuilder` [Setter]
- `setAdjustedStartDate(Date arg0)` → `CalculationPeriodBaseBuilder` [Setter]
- `setAdjustedEndDate(Date arg0)` → `CalculationPeriodBaseBuilder` [Setter]

### CalculationPeriodBuilder
**Implements:** `CalculationPeriod` `CalculationPeriodBase$CalculationPeriodBaseBuilder` 

**Key Methods:**
- `setMeta(MetaFields arg0)` → `CalculationPeriodBuilder` [Setter]
- `getOrCreateForecastAmount()` → `MoneyBuilder` [Getter]
- `setFxLinkedNotionalAmount(FxLinkedNotionalAmount arg0)` → `CalculationPeriodBuilder` [Setter]
- `setForecastRate(BigDecimal arg0)` → `CalculationPeriodBuilder` [Setter]
- `setForecastAmount(Money arg0)` → `CalculationPeriodBuilder` [Setter]
- `setNotionalAmount(BigDecimal arg0)` → `CalculationPeriodBuilder` [Setter]
- `setFloatingRateDefinition(FloatingRateDefinition arg0)` → `CalculationPeriodBuilder` [Setter]
- `getFloatingRateDefinition()` → `FloatingRateDefinitionBuilder` [Getter]
- `setUnadjustedEndDate(Date arg0)` → `CalculationPeriodBuilder` [Setter]
- `setDayCountYearFraction(BigDecimal arg0)` → `CalculationPeriodBuilder` [Setter]

### CalculationPeriodData
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `CalculationPeriodData` [Builder]
- `getEndDate()` → `Date` [Getter]
- `getDaysInLeapYearPeriod()` → `Integer` [Getter]
- `getStartDate()` → `Date` [Getter]
- `getIsFirstPeriod()` → `Boolean` [Getter]
- `getDaysInPeriod()` → `Integer` [Getter]
- `getIsLastPeriod()` → `Boolean` [Getter]

### CalculationPeriodDataBuilder
**Implements:** `CalculationPeriodData` `RosettaModelObjectBuilder` 

**Key Methods:**
- `setEndDate(Date arg0)` → `CalculationPeriodDataBuilder` [Setter]
- `setDaysInPeriod(Integer arg0)` → `CalculationPeriodDataBuilder` [Setter]
- `setDaysInLeapYearPeriod(Integer arg0)` → `CalculationPeriodDataBuilder` [Setter]
- `setStartDate(Date arg0)` → `CalculationPeriodDataBuilder` [Setter]
- `setIsFirstPeriod(Boolean arg0)` → `CalculationPeriodDataBuilder` [Setter]
- `setIsLastPeriod(Boolean arg0)` → `CalculationPeriodDataBuilder` [Setter]

### CalculationPeriodDates
**Implements:** `RosettaModelObject` `GlobalKey` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `CalculationPeriodDates` [Builder]
- `getEffectiveDate()` → `AdjustableOrRelativeDate` [Getter]
- `getTerminationDate()` → `AdjustableOrRelativeDate` [Getter]
- `getMeta()` → `MetaFields` [Getter]
- `getStubPeriodType()` → `StubPeriodTypeEnum` [Getter]
- `getFirstPeriodStartDate()` → `AdjustableOrRelativeDate` [Getter]
- `getFirstRegularPeriodStartDate()` → `Date` [Getter]
- `getFirstCompoundingPeriodEndDate()` → `Date` [Getter]
- `getLastRegularPeriodEndDate()` → `Date` [Getter]

### CalculationPeriodDatesBuilder
**Implements:** `CalculationPeriodDates` `RosettaModelObjectBuilder` `GlobalKey$GlobalKeyBuilder` 

**Key Methods:**
- `getOrCreateMeta()` → `MetaFieldsBuilder` [Getter]
- `getEffectiveDate()` → `AdjustableOrRelativeDateBuilder` [Getter]
- `getTerminationDate()` → `AdjustableOrRelativeDateBuilder` [Getter]
- `setTerminationDate(AdjustableOrRelativeDate arg0)` → `CalculationPeriodDatesBuilder` [Setter]
- `getMeta()` → `MetaFieldsBuilder` [Getter]
- `setMeta(MetaFields arg0)` → `CalculationPeriodDatesBuilder` [Setter]
- `getOrCreateCalculationPeriodDatesAdjustments()` → `BusinessDayAdjustmentsBuilder` [Getter]
- `setFirstPeriodStartDate(AdjustableOrRelativeDate arg0)` → `CalculationPeriodDatesBuilder` [Setter]
- `setStubPeriodType(StubPeriodTypeEnum arg0)` → `CalculationPeriodDatesBuilder` [Setter]
- `setLastRegularPeriodEndDate(Date arg0)` → `CalculationPeriodDatesBuilder` [Setter]

### DateRelativeToCalculationPeriodDates
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `DateRelativeToCalculationPeriodDates` [Builder]
- `getCalculationPeriodDatesReference()` → `List` [Getter]

### DateRelativeToCalculationPeriodDatesBuilder
**Implements:** `DateRelativeToCalculationPeriodDates` `RosettaModelObjectBuilder` 

**Key Methods:**
- `getOrCreateCalculationPeriodDatesReference(int arg0)` → `ReferenceWithMetaCalculationPeriodDatesBuilder` [Getter]
- `getCalculationPeriodDatesReference()` → `List` [Getter]
- `setCalculationPeriodDatesReference(List arg0)` → `DateRelativeToCalculationPeriodDatesBuilder` [Setter]
- `setCalculationPeriodDatesReferenceValue(List arg0)` → `DateRelativeToCalculationPeriodDatesBuilder` [Setter]

### DateRelativeToPaymentDates
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `DateRelativeToPaymentDates` [Builder]
- `getPaymentDatesReference()` → `List` [Getter]

### DateRelativeToPaymentDatesBuilder
**Implements:** `DateRelativeToPaymentDates` `RosettaModelObjectBuilder` 

**Key Methods:**
- `getPaymentDatesReference()` → `List` [Getter]
- `setPaymentDatesReference(List arg0)` → `DateRelativeToPaymentDatesBuilder` [Setter]
- `getOrCreatePaymentDatesReference(int arg0)` → `ReferenceWithMetaPaymentDatesBuilder` [Getter]
- `setPaymentDatesReferenceValue(List arg0)` → `DateRelativeToPaymentDatesBuilder` [Setter]

### DateRelativeToValuationDates
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `DateRelativeToValuationDates` [Builder]
- `getValuationDatesReference()` → `List` [Getter]

### DateRelativeToValuationDatesBuilder
**Implements:** `DateRelativeToValuationDates` `RosettaModelObjectBuilder` 

**Key Methods:**
- `setValuationDatesReference(List arg0)` → `DateRelativeToValuationDatesBuilder` [Setter]
- `getValuationDatesReference()` → `List` [Getter]
- `getOrCreateValuationDatesReference(int arg0)` → `ReferenceWithMetaPerformanceValuationDatesBuilder` [Getter]
- `setValuationDatesReferenceValue(List arg0)` → `DateRelativeToValuationDatesBuilder` [Setter]

### FinalCalculationPeriodDateAdjustment
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `FinalCalculationPeriodDateAdjustment` [Builder]
- `getBusinessDayConvention()` → `BusinessDayConventionEnum` [Getter]
- `getSwapStreamReference()` → `ReferenceWithMetaInterestRatePayout` [Getter]
- `getRelevantUnderlyingDateReference()` → `ReferenceWithMetaAdjustableOrRelativeDates` [Getter]

### FinalCalculationPeriodDateAdjustmentBuilder
**Implements:** `FinalCalculationPeriodDateAdjustment` `RosettaModelObjectBuilder` 

**Key Methods:**
- `setBusinessDayConvention(BusinessDayConventionEnum arg0)` → `FinalCalculationPeriodDateAdjustmentBuilder` [Setter]
- `getSwapStreamReference()` → `ReferenceWithMetaInterestRatePayoutBuilder` [Getter]
- `setSwapStreamReference(ReferenceWithMetaInterestRatePayout arg0)` → `FinalCalculationPeriodDateAdjustmentBuilder` [Setter]
- `getOrCreateSwapStreamReference()` → `ReferenceWithMetaInterestRatePayoutBuilder` [Getter]
- `setSwapStreamReferenceValue(InterestRatePayout arg0)` → `FinalCalculationPeriodDateAdjustmentBuilder` [Setter]
- `getRelevantUnderlyingDateReference()` → `ReferenceWithMetaAdjustableOrRelativeDatesBuilder` [Getter]
- `setRelevantUnderlyingDateReference(ReferenceWithMetaAdjustableOrRelativeDates arg0)` → `FinalCalculationPeriodDateAdjustmentBuilder` [Setter]
- `setRelevantUnderlyingDateReferenceValue(AdjustableOrRelativeDates arg0)` → `FinalCalculationPeriodDateAdjustmentBuilder` [Setter]
- `getOrCreateRelevantUnderlyingDateReference()` → `ReferenceWithMetaAdjustableOrRelativeDatesBuilder` [Getter]

### FxLinkedNotionalAmount
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `FxLinkedNotionalAmount` [Builder]
- `getResetDate()` → `Date` [Getter]
- `getObservedFxSpotRate()` → `BigDecimal` [Getter]
- `getAdjustedFxSpotFixingDate()` → `Date` [Getter]
- `getNotionalAmount()` → `BigDecimal` [Getter]

### FxLinkedNotionalAmountBuilder
**Implements:** `FxLinkedNotionalAmount` `RosettaModelObjectBuilder` 

**Key Methods:**
- `setResetDate(Date arg0)` → `FxLinkedNotionalAmountBuilder` [Setter]
- `setNotionalAmount(BigDecimal arg0)` → `FxLinkedNotionalAmountBuilder` [Setter]
- `setObservedFxSpotRate(BigDecimal arg0)` → `FxLinkedNotionalAmountBuilder` [Setter]
- `setAdjustedFxSpotFixingDate(Date arg0)` → `FxLinkedNotionalAmountBuilder` [Setter]

### FxLinkedNotionalSchedule
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `FxLinkedNotionalSchedule` [Builder]
- `getFxSpotRateSource()` → `FxSpotRateSource` [Getter]
- `getFixingTime()` → `BusinessCenterTime` [Getter]
- `getVaryingNotionalCurrency()` → `FieldWithMetaString` [Getter]
- `getVaryingNotionalInterimExchangePaymentDates()` → `RelativeDateOffset` [Getter]
- `getVaryingNotionalFixingDates()` → `RelativeDateOffset` [Getter]

### FxLinkedNotionalScheduleBuilder
**Implements:** `FxLinkedNotionalSchedule` `RosettaModelObjectBuilder` 

**Key Methods:**
- `getFxSpotRateSource()` → `FxSpotRateSourceBuilder` [Getter]
- `getFixingTime()` → `BusinessCenterTimeBuilder` [Getter]
- `setFixingTime(BusinessCenterTime arg0)` → `FxLinkedNotionalScheduleBuilder` [Setter]
- `getOrCreateFixingTime()` → `BusinessCenterTimeBuilder` [Getter]
- `setFxSpotRateSource(FxSpotRateSource arg0)` → `FxLinkedNotionalScheduleBuilder` [Setter]
- `getOrCreateFxSpotRateSource()` → `FxSpotRateSourceBuilder` [Getter]
- `getVaryingNotionalCurrency()` → `FieldWithMetaStringBuilder` [Getter]
- `setVaryingNotionalCurrency(FieldWithMetaString arg0)` → `FxLinkedNotionalScheduleBuilder` [Setter]
- `getOrCreateVaryingNotionalInterimExchangePaymentDates()` → `RelativeDateOffsetBuilder` [Getter]
- `setVaryingNotionalInterimExchangePaymentDates(RelativeDateOffset arg0)` → `FxLinkedNotionalScheduleBuilder` [Setter]

### InitialFixingDate
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `InitialFixingDate` [Builder]
- `getInitialFixingDate()` → `Date` [Getter]
- `getRelativeDateOffset()` → `RelativeDateOffset` [Getter]

### InitialFixingDateBuilder
**Implements:** `InitialFixingDate` `RosettaModelObjectBuilder` 

**Key Methods:**
- `setInitialFixingDate(Date arg0)` → `InitialFixingDateBuilder` [Setter]
- `getRelativeDateOffset()` → `RelativeDateOffsetBuilder` [Getter]
- `setRelativeDateOffset(RelativeDateOffset arg0)` → `InitialFixingDateBuilder` [Setter]
- `getOrCreateRelativeDateOffset()` → `RelativeDateOffsetBuilder` [Getter]

### Lag
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `Lag` [Builder]
- `getLagDuration()` → `Offset` [Getter]
- `getFirstObservationDateOffset()` → `Offset` [Getter]

### LagBuilder
**Implements:** `Lag` `RosettaModelObjectBuilder` 

**Key Methods:**
- `getOrCreateLagDuration()` → `OffsetBuilder` [Getter]
- `setLagDuration(Offset arg0)` → `LagBuilder` [Setter]
- `getLagDuration()` → `OffsetBuilder` [Getter]
- `setFirstObservationDateOffset(Offset arg0)` → `LagBuilder` [Setter]
- `getOrCreateFirstObservationDateOffset()` → `OffsetBuilder` [Getter]
- `getFirstObservationDateOffset()` → `OffsetBuilder` [Getter]

### ObservationDate
**Implements:** `RosettaModelObject` `GlobalKey` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `ObservationDate` [Builder]
- `getAdjustedDate()` → `Date` [Getter]
- `getUnadjustedDate()` → `Date` [Getter]
- `getWeight()` → `BigDecimal` [Getter]
- `getMeta()` → `MetaFields` [Getter]
- `getObservationReference()` → `String` [Getter]

### ObservationDateBuilder
**Implements:** `ObservationDate` `RosettaModelObjectBuilder` `GlobalKey$GlobalKeyBuilder` 

**Key Methods:**
- `getOrCreateMeta()` → `MetaFieldsBuilder` [Getter]
- `getMeta()` → `MetaFieldsBuilder` [Getter]
- `setMeta(MetaFields arg0)` → `ObservationDateBuilder` [Setter]
- `setObservationReference(String arg0)` → `ObservationDateBuilder` [Setter]
- `setUnadjustedDate(Date arg0)` → `ObservationDateBuilder` [Setter]
- `setAdjustedDate(Date arg0)` → `ObservationDateBuilder` [Setter]
- `setWeight(BigDecimal arg0)` → `ObservationDateBuilder` [Setter]

### ObservationDates
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `ObservationDates` [Builder]
- `getPeriodicSchedule()` → `PeriodicDates` [Getter]
- `getObservationSchedule()` → `ObservationSchedule` [Getter]
- `getParametricDates()` → `ParametricDates` [Getter]

### ObservationDatesBuilder
**Implements:** `ObservationDates` `RosettaModelObjectBuilder` 

**Key Methods:**
- `getPeriodicSchedule()` → `PeriodicDatesBuilder` [Getter]
- `getObservationSchedule()` → `ObservationScheduleBuilder` [Getter]
- `setPeriodicSchedule(PeriodicDates arg0)` → `ObservationDatesBuilder` [Setter]
- `getParametricDates()` → `ParametricDatesBuilder` [Getter]
- `setObservationSchedule(ObservationSchedule arg0)` → `ObservationDatesBuilder` [Setter]
- `getOrCreateParametricDates()` → `ParametricDatesBuilder` [Getter]
- `setParametricDates(ParametricDates arg0)` → `ObservationDatesBuilder` [Setter]
- `getOrCreatePeriodicSchedule()` → `PeriodicDatesBuilder` [Getter]
- `getOrCreateObservationSchedule()` → `ObservationScheduleBuilder` [Getter]

### ObservationSchedule
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `ObservationSchedule` [Builder]
- `getDateAdjustments()` → `BusinessDayAdjustments` [Getter]
- `getObservationDate()` → `List` [Getter]

### ObservationScheduleBuilder
**Implements:** `ObservationSchedule` `RosettaModelObjectBuilder` 

**Key Methods:**
- `setObservationDate(List arg0)` → `ObservationScheduleBuilder` [Setter]
- `getOrCreateObservationDate(int arg0)` → `ObservationDateBuilder` [Getter]
- `getOrCreateDateAdjustments()` → `BusinessDayAdjustmentsBuilder` [Getter]
- `setDateAdjustments(BusinessDayAdjustments arg0)` → `ObservationScheduleBuilder` [Setter]
- `getDateAdjustments()` → `BusinessDayAdjustmentsBuilder` [Getter]
- `getObservationDate()` → `List` [Getter]

### ObservationTerms
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `ObservationTerms` [Builder]
- `getPrecision()` → `Rounding` [Getter]
- `getInformationSource()` → `FxSpotRateSource` [Getter]
- `getObservationTime()` → `BusinessCenterTime` [Getter]
- `getObservationTimeType()` → `TimeTypeEnum` [Getter]
- `getObservationDates()` → `ObservationDates` [Getter]
- `getNumberOfObservationDates()` → `Integer` [Getter]
- `getCalculationPeriodDates()` → `CalculationPeriodDates` [Getter]

### ObservationTermsBuilder
**Implements:** `ObservationTerms` `RosettaModelObjectBuilder` 

**Key Methods:**
- `getPrecision()` → `RoundingBuilder` [Getter]
- `getInformationSource()` → `FxSpotRateSourceBuilder` [Getter]
- `setObservationTime(BusinessCenterTime arg0)` → `ObservationTermsBuilder` [Setter]
- `setInformationSource(FxSpotRateSource arg0)` → `ObservationTermsBuilder` [Setter]
- `setCalculationPeriodDates(CalculationPeriodDates arg0)` → `ObservationTermsBuilder` [Setter]
- `setObservationDates(ObservationDates arg0)` → `ObservationTermsBuilder` [Setter]
- `setObservationTimeType(TimeTypeEnum arg0)` → `ObservationTermsBuilder` [Setter]
- `getOrCreateCalculationPeriodDates()` → `CalculationPeriodDatesBuilder` [Getter]
- `getOrCreateObservationDates()` → `ObservationDatesBuilder` [Getter]
- `setNumberOfObservationDates(Integer arg0)` → `ObservationTermsBuilder` [Setter]

### ParametricDates
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `ParametricDates` [Builder]
- `getDayOfWeek()` → `List` [Getter]
- `getDayFrequency()` → `BigDecimal` [Getter]
- `getDayDistribution()` → `DayDistributionEnum` [Getter]
- `getBusinessCenters()` → `BusinessCenters` [Getter]
- `getDayType()` → `DayTypeEnum` [Getter]
- `getLag()` → `Lag` [Getter]

### ParametricDatesBuilder
**Implements:** `ParametricDates` `RosettaModelObjectBuilder` 

**Key Methods:**
- `setDayOfWeek(List arg0)` → `ParametricDatesBuilder` [Setter]
- `setDayDistribution(DayDistributionEnum arg0)` → `ParametricDatesBuilder` [Setter]
- `getOrCreateLag()` → `LagBuilder` [Getter]
- `setDayFrequency(BigDecimal arg0)` → `ParametricDatesBuilder` [Setter]
- `getOrCreateBusinessCenters()` → `BusinessCentersBuilder` [Getter]
- `setBusinessCenters(BusinessCenters arg0)` → `ParametricDatesBuilder` [Setter]
- `getBusinessCenters()` → `BusinessCentersBuilder` [Getter]
- `setDayType(DayTypeEnum arg0)` → `ParametricDatesBuilder` [Setter]
- `getLag()` → `LagBuilder` [Getter]
- `setLag(Lag arg0)` → `ParametricDatesBuilder` [Setter]

### PaymentCalculationPeriod
**Implements:** `RosettaModelObject` `GlobalKey` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `PaymentCalculationPeriod` [Builder]
- `getMeta()` → `MetaFields` [Getter]
- `getForecastPaymentAmount()` → `Money` [Getter]
- `getPresentValueAmount()` → `Money` [Getter]
- `getFixedPaymentAmount()` → `Money` [Getter]
- `getDiscountFactor()` → `BigDecimal` [Getter]
- `getUnadjustedPaymentDate()` → `Date` [Getter]
- `getAdjustedPaymentDate()` → `Date` [Getter]
- `getCalculationPeriod()` → `List` [Getter]

### PaymentCalculationPeriodBuilder
**Implements:** `PaymentCalculationPeriod` `RosettaModelObjectBuilder` `GlobalKey$GlobalKeyBuilder` 

**Key Methods:**
- `getOrCreateMeta()` → `MetaFieldsBuilder` [Getter]
- `getMeta()` → `MetaFieldsBuilder` [Getter]
- `setMeta(MetaFields arg0)` → `PaymentCalculationPeriodBuilder` [Setter]
- `setAdjustedPaymentDate(Date arg0)` → `PaymentCalculationPeriodBuilder` [Setter]
- `getForecastPaymentAmount()` → `MoneyBuilder` [Getter]
- `getPresentValueAmount()` → `MoneyBuilder` [Getter]
- `getFixedPaymentAmount()` → `MoneyBuilder` [Getter]
- `setUnadjustedPaymentDate(Date arg0)` → `PaymentCalculationPeriodBuilder` [Setter]
- `setForecastPaymentAmount(Money arg0)` → `PaymentCalculationPeriodBuilder` [Setter]
- `setPresentValueAmount(Money arg0)` → `PaymentCalculationPeriodBuilder` [Setter]

### PaymentDateSchedule
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `PaymentDateSchedule` [Builder]
- `getInterimPaymentDates()` → `List` [Getter]
- `getFinalPaymentDate()` → `AdjustableOrRelativeDate` [Getter]

### PaymentDateScheduleBuilder
**Implements:** `PaymentDateSchedule` `RosettaModelObjectBuilder` 

**Key Methods:**
- `getInterimPaymentDates()` → `List` [Getter]
- `getFinalPaymentDate()` → `AdjustableOrRelativeDateBuilder` [Getter]
- `setInterimPaymentDates(List arg0)` → `PaymentDateScheduleBuilder` [Setter]
- `setFinalPaymentDate(AdjustableOrRelativeDate arg0)` → `PaymentDateScheduleBuilder` [Setter]
- `getOrCreateFinalPaymentDate()` → `AdjustableOrRelativeDateBuilder` [Getter]
- `getOrCreateInterimPaymentDates(int arg0)` → `AdjustableRelativeOrPeriodicDatesBuilder` [Getter]

### PaymentDates
**Implements:** `RosettaModelObject` `GlobalKey` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `PaymentDates` [Builder]
- `getMeta()` → `MetaFields` [Getter]
- `getPayRelativeTo()` → `PayRelativeToEnum` [Getter]
- `getPaymentDaysOffset()` → `Offset` [Getter]
- `getPaymentFrequency()` → `Frequency` [Getter]
- `getFirstPaymentDate()` → `Date` [Getter]
- `getPaymentDateSchedule()` → `PaymentDateSchedule` [Getter]
- `getLastRegularPaymentDate()` → `Date` [Getter]
- `getPaymentDatesAdjustments()` → `BusinessDayAdjustments` [Getter]

### PaymentDatesBuilder
**Implements:** `PaymentDates` `RosettaModelObjectBuilder` `GlobalKey$GlobalKeyBuilder` 

**Key Methods:**
- `getOrCreateMeta()` → `MetaFieldsBuilder` [Getter]
- `getMeta()` → `MetaFieldsBuilder` [Getter]
- `setMeta(MetaFields arg0)` → `PaymentDatesBuilder` [Setter]
- `getPaymentDaysOffset()` → `OffsetBuilder` [Getter]
- `getPaymentFrequency()` → `FrequencyBuilder` [Getter]
- `getPaymentDateSchedule()` → `PaymentDateScheduleBuilder` [Getter]
- `getPaymentDatesAdjustments()` → `BusinessDayAdjustmentsBuilder` [Getter]
- `setLastRegularPaymentDate(Date arg0)` → `PaymentDatesBuilder` [Setter]
- `setPaymentFrequency(Frequency arg0)` → `PaymentDatesBuilder` [Setter]
- `setPaymentDateSchedule(PaymentDateSchedule arg0)` → `PaymentDatesBuilder` [Setter]

### RateSchedule
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `RateSchedule` [Builder]
- `getPrice()` → `ReferenceWithMetaPriceSchedule` [Getter]

### RateScheduleBuilder
**Implements:** `RateSchedule` `RosettaModelObjectBuilder` 

**Key Methods:**
- `getOrCreatePrice()` → `ReferenceWithMetaPriceScheduleBuilder` [Getter]
- `getPrice()` → `ReferenceWithMetaPriceScheduleBuilder` [Getter]
- `setPriceValue(PriceSchedule arg0)` → `RateScheduleBuilder` [Setter]
- `setPrice(ReferenceWithMetaPriceSchedule arg0)` → `RateScheduleBuilder` [Setter]

### ResetDates
**Implements:** `RosettaModelObject` `GlobalKey` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `ResetDates` [Builder]
- `getMeta()` → `MetaFields` [Getter]
- `getFixingDates()` → `RelativeDateOffset` [Getter]
- `getInitialFixingDate()` → `InitialFixingDate` [Getter]
- `getResetRelativeTo()` → `ResetRelativeToEnum` [Getter]
- `getFinalFixingDate()` → `AdjustableDate` [Getter]
- `getRateCutOffDaysOffset()` → `Offset` [Getter]
- `getResetFrequency()` → `ResetFrequency` [Getter]
- `getResetDatesAdjustments()` → `BusinessDayAdjustments` [Getter]

### ResetDatesBuilder
**Implements:** `ResetDates` `RosettaModelObjectBuilder` `GlobalKey$GlobalKeyBuilder` 

**Key Methods:**
- `getOrCreateMeta()` → `MetaFieldsBuilder` [Getter]
- `getMeta()` → `MetaFieldsBuilder` [Getter]
- `setMeta(MetaFields arg0)` → `ResetDatesBuilder` [Setter]
- `getFixingDates()` → `RelativeDateOffsetBuilder` [Getter]
- `getInitialFixingDate()` → `InitialFixingDateBuilder` [Getter]
- `getFinalFixingDate()` → `AdjustableDateBuilder` [Getter]
- `getRateCutOffDaysOffset()` → `OffsetBuilder` [Getter]
- `getResetFrequency()` → `ResetFrequencyBuilder` [Getter]
- `getResetDatesAdjustments()` → `BusinessDayAdjustmentsBuilder` [Getter]
- `getOrCreateFinalFixingDate()` → `AdjustableDateBuilder` [Getter]

### ResetFrequency
**Implements:** `Frequency` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `ResetFrequency` [Builder]
- `getWeeklyRollConvention()` → `WeeklyRollConventionEnum` [Getter]

### ResetFrequencyBuilder
**Implements:** `ResetFrequency` `Frequency$FrequencyBuilder` 

**Key Methods:**
- `setMeta(MetaFields arg0)` → `ResetFrequencyBuilder` [Setter]
- `setWeeklyRollConvention(WeeklyRollConventionEnum arg0)` → `ResetFrequencyBuilder` [Setter]
- `setPeriod(PeriodExtendedEnum arg0)` → `ResetFrequencyBuilder` [Setter]
- `setPeriodMultiplier(Integer arg0)` → `ResetFrequencyBuilder` [Setter]

### StubCalculationPeriodAmount
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `StubCalculationPeriodAmount` [Builder]
- `getInitialStub()` → `StubValue` [Getter]
- `getFinalStub()` → `StubValue` [Getter]
- `getCalculationPeriodDatesReference()` → `ReferenceWithMetaCalculationPeriodDates` [Getter]

### StubCalculationPeriodAmountBuilder
**Implements:** `StubCalculationPeriodAmount` `RosettaModelObjectBuilder` 

**Key Methods:**
- `getInitialStub()` → `StubValueBuilder` [Getter]
- `getFinalStub()` → `StubValueBuilder` [Getter]
- `getOrCreateInitialStub()` → `StubValueBuilder` [Getter]
- `setInitialStub(StubValue arg0)` → `StubCalculationPeriodAmountBuilder` [Setter]
- `getOrCreateFinalStub()` → `StubValueBuilder` [Getter]
- `setFinalStub(StubValue arg0)` → `StubCalculationPeriodAmountBuilder` [Setter]
- `getOrCreateCalculationPeriodDatesReference()` → `ReferenceWithMetaCalculationPeriodDatesBuilder` [Getter]
- `getCalculationPeriodDatesReference()` → `ReferenceWithMetaCalculationPeriodDatesBuilder` [Getter]
- `setCalculationPeriodDatesReference(ReferenceWithMetaCalculationPeriodDates arg0)` → `StubCalculationPeriodAmountBuilder` [Setter]
- `setCalculationPeriodDatesReferenceValue(CalculationPeriodDates arg0)` → `StubCalculationPeriodAmountBuilder` [Setter]

### StubPeriod
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `StubPeriod` [Builder]
- `getInitialStub()` → `StubValue` [Getter]
- `getFinalStub()` → `StubValue` [Getter]
- `getCalculationPeriodDatesReference()` → `ReferenceWithMetaCalculationPeriodDates` [Getter]

### StubPeriodBuilder
**Implements:** `StubPeriod` `RosettaModelObjectBuilder` 

**Key Methods:**
- `getInitialStub()` → `StubValueBuilder` [Getter]
- `getFinalStub()` → `StubValueBuilder` [Getter]
- `getOrCreateInitialStub()` → `StubValueBuilder` [Getter]
- `setInitialStub(StubValue arg0)` → `StubPeriodBuilder` [Setter]
- `getOrCreateFinalStub()` → `StubValueBuilder` [Getter]
- `setFinalStub(StubValue arg0)` → `StubPeriodBuilder` [Setter]
- `getOrCreateCalculationPeriodDatesReference()` → `ReferenceWithMetaCalculationPeriodDatesBuilder` [Getter]
- `getCalculationPeriodDatesReference()` → `ReferenceWithMetaCalculationPeriodDatesBuilder` [Getter]
- `setCalculationPeriodDatesReference(ReferenceWithMetaCalculationPeriodDates arg0)` → `StubPeriodBuilder` [Setter]
- `setCalculationPeriodDatesReferenceValue(CalculationPeriodDates arg0)` → `StubPeriodBuilder` [Setter]

### WeightedAveragingObservation
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `WeightedAveragingObservation` [Builder]
- `getWeight()` → `BigDecimal` [Getter]
- `getDateTime()` → `ZonedDateTime` [Getter]
- `getObservationNumber()` → `Integer` [Getter]

### WeightedAveragingObservationBuilder
**Implements:** `WeightedAveragingObservation` `RosettaModelObjectBuilder` 

**Key Methods:**
- `setDateTime(ZonedDateTime arg0)` → `WeightedAveragingObservationBuilder` [Setter]
- `setObservationNumber(Integer arg0)` → `WeightedAveragingObservationBuilder` [Setter]
- `setWeight(BigDecimal arg0)` → `WeightedAveragingObservationBuilder` [Setter]

## Concrete Classes

### AmountScheduleBuilderImpl
**Extends:** `Schedule$ScheduleBuilderImpl` 
**Implements:** `AmountSchedule$AmountScheduleBuilder` 

**Fields:**
- `List (List) currency`

**Key Methods:**
- `setValue(BigDecimal arg0)` → `AmountScheduleBuilder` [Setter]
- `build()` → `AmountSchedule` [Builder]
- `getCurrency()` → `List` [Getter]
- `setCurrency(List arg0)` → `AmountScheduleBuilder` [Setter]
- `setCurrencyValue(List arg0)` → `AmountScheduleBuilder` [Setter]
- `setDatedValue(List arg0)` → `AmountScheduleBuilder` [Setter]
- `getOrCreateCurrency(int arg0)` → `FieldWithMetaStringBuilder` [Getter]

### AmountScheduleImpl
**Extends:** `Schedule$ScheduleImpl` 
**Implements:** `AmountSchedule` 

**Key Methods:**
- `build()` → `AmountSchedule` [Builder]
- `getCurrency()` → `List` [Getter]
- `setBuilderFields(AmountScheduleBuilder arg0)` → `void` [Setter]

### AveragingObservationListBuilderImpl
**Implements:** `AveragingObservationList$AveragingObservationListBuilder` 

**Fields:**
- `List (List) averagingObservation`

**Key Methods:**
- `build()` → `AveragingObservationList` [Builder]
- `getAveragingObservation()` → `List` [Getter]
- `setAveragingObservation(List arg0)` → `AveragingObservationListBuilder` [Setter]
- `getOrCreateAveragingObservation(int arg0)` → `WeightedAveragingObservationBuilder` [Getter]

### AveragingObservationListImpl
**Implements:** `AveragingObservationList` 

**Key Methods:**
- `build()` → `AveragingObservationList` [Builder]
- `setBuilderFields(AveragingObservationListBuilder arg0)` → `void` [Setter]
- `getAveragingObservation()` → `List` [Getter]

### AveragingPeriodBuilderImpl
**Implements:** `AveragingPeriod$AveragingPeriodBuilder` 

**Fields:**
- `List (List) schedule`
- `DateTimeListBuilder averagingDateTimes`
- `AveragingObservationListBuilder averagingObservations`
- `FieldWithMetaMarketDisruptionEnumBuilder marketDisruption`

**Key Methods:**
- `build()` → `AveragingPeriod` [Builder]
- `getSchedule()` → `List` [Getter]
- `getOrCreateSchedule(int arg0)` → `AveragingScheduleBuilder` [Getter]
- `setSchedule(List arg0)` → `AveragingPeriodBuilder` [Setter]
- `setAveragingDateTimes(DateTimeList arg0)` → `AveragingPeriodBuilder` [Setter]
- `setMarketDisruptionValue(MarketDisruptionEnum arg0)` → `AveragingPeriodBuilder` [Setter]
- `setMarketDisruption(FieldWithMetaMarketDisruptionEnum arg0)` → `AveragingPeriodBuilder` [Setter]
- `setAveragingObservations(AveragingObservationList arg0)` → `AveragingPeriodBuilder` [Setter]
- `getMarketDisruption()` → `FieldWithMetaMarketDisruptionEnumBuilder` [Getter]
- `getAveragingObservations()` → `AveragingObservationListBuilder` [Getter]

### AveragingPeriodImpl
**Implements:** `AveragingPeriod` 

**Key Methods:**
- `build()` → `AveragingPeriod` [Builder]
- `setBuilderFields(AveragingPeriodBuilder arg0)` → `void` [Setter]
- `getSchedule()` → `List` [Getter]
- `getMarketDisruption()` → `FieldWithMetaMarketDisruptionEnum` [Getter]
- `getAveragingObservations()` → `AveragingObservationList` [Getter]
- `getAveragingDateTimes()` → `DateTimeList` [Getter]

### CalculationPeriodBaseBuilderImpl
**Implements:** `CalculationPeriodBase$CalculationPeriodBaseBuilder` 

**Fields:**
- `Date adjustedStartDate`
- `Date adjustedEndDate`
- `MetaFieldsBuilder meta`

**Key Methods:**
- `build()` → `CalculationPeriodBase` [Builder]
- `getOrCreateMeta()` → `MetaFieldsBuilder` [Getter]
- `getMeta()` → `MetaFieldsBuilder` [Getter]
- `setMeta(MetaFields arg0)` → `CalculationPeriodBaseBuilder` [Setter]
- `getAdjustedEndDate()` → `Date` [Getter]
- `getAdjustedStartDate()` → `Date` [Getter]
- `setAdjustedStartDate(Date arg0)` → `CalculationPeriodBaseBuilder` [Setter]
- `setAdjustedEndDate(Date arg0)` → `CalculationPeriodBaseBuilder` [Setter]

### CalculationPeriodBaseImpl
**Implements:** `CalculationPeriodBase` 

**Key Methods:**
- `build()` → `CalculationPeriodBase` [Builder]
- `setBuilderFields(CalculationPeriodBaseBuilder arg0)` → `void` [Setter]
- `getMeta()` → `MetaFields` [Getter]
- `getAdjustedEndDate()` → `Date` [Getter]
- `getAdjustedStartDate()` → `Date` [Getter]

### CalculationPeriodBuilderImpl
**Extends:** `CalculationPeriodBase$CalculationPeriodBaseBuilderImpl` 
**Implements:** `CalculationPeriod$CalculationPeriodBuilder` 

**Fields:**
- `Date unadjustedStartDate`
- `Date unadjustedEndDate`
- `Integer calculationPeriodNumberOfDays`
- `BigDecimal notionalAmount`
- `FxLinkedNotionalAmountBuilder fxLinkedNotionalAmount`
- `FloatingRateDefinitionBuilder floatingRateDefinition`
- `BigDecimal fixedRate`
- `BigDecimal dayCountYearFraction`
- `MoneyBuilder forecastAmount`
- `BigDecimal forecastRate`

**Key Methods:**
- `build()` → `CalculationPeriod` [Builder]
- `setMeta(MetaFields arg0)` → `CalculationPeriodBuilder` [Setter]
- `getForecastRate()` → `BigDecimal` [Getter]
- `getOrCreateForecastAmount()` → `MoneyBuilder` [Getter]
- `setFxLinkedNotionalAmount(FxLinkedNotionalAmount arg0)` → `CalculationPeriodBuilder` [Setter]
- `getUnadjustedEndDate()` → `Date` [Getter]
- `setForecastRate(BigDecimal arg0)` → `CalculationPeriodBuilder` [Setter]
- `setForecastAmount(Money arg0)` → `CalculationPeriodBuilder` [Setter]
- `setNotionalAmount(BigDecimal arg0)` → `CalculationPeriodBuilder` [Setter]
- `setFloatingRateDefinition(FloatingRateDefinition arg0)` → `CalculationPeriodBuilder` [Setter]

### CalculationPeriodDataBuilderImpl
**Implements:** `CalculationPeriodData$CalculationPeriodDataBuilder` 

**Fields:**
- `Date startDate`
- `Date endDate`
- `Integer daysInPeriod`
- `Integer daysInLeapYearPeriod`
- `Boolean isFirstPeriod`
- `Boolean isLastPeriod`

**Key Methods:**
- `build()` → `CalculationPeriodData` [Builder]
- `setEndDate(Date arg0)` → `CalculationPeriodDataBuilder` [Setter]
- `getEndDate()` → `Date` [Getter]
- `getDaysInLeapYearPeriod()` → `Integer` [Getter]
- `setDaysInPeriod(Integer arg0)` → `CalculationPeriodDataBuilder` [Setter]
- `getStartDate()` → `Date` [Getter]
- `getIsFirstPeriod()` → `Boolean` [Getter]
- `setDaysInLeapYearPeriod(Integer arg0)` → `CalculationPeriodDataBuilder` [Setter]
- `getDaysInPeriod()` → `Integer` [Getter]
- `setStartDate(Date arg0)` → `CalculationPeriodDataBuilder` [Setter]

### CalculationPeriodDataImpl
**Implements:** `CalculationPeriodData` 

**Key Methods:**
- `build()` → `CalculationPeriodData` [Builder]
- `setBuilderFields(CalculationPeriodDataBuilder arg0)` → `void` [Setter]
- `getEndDate()` → `Date` [Getter]
- `getDaysInLeapYearPeriod()` → `Integer` [Getter]
- `getStartDate()` → `Date` [Getter]
- `getIsFirstPeriod()` → `Boolean` [Getter]
- `getDaysInPeriod()` → `Integer` [Getter]
- `getIsLastPeriod()` → `Boolean` [Getter]

### CalculationPeriodDatesBuilderImpl
**Implements:** `CalculationPeriodDates$CalculationPeriodDatesBuilder` 

**Fields:**
- `AdjustableOrRelativeDateBuilder effectiveDate`
- `AdjustableOrRelativeDateBuilder terminationDate`
- `BusinessDayAdjustmentsBuilder calculationPeriodDatesAdjustments`
- `AdjustableOrRelativeDateBuilder firstPeriodStartDate`
- `Date firstRegularPeriodStartDate`
- `Date firstCompoundingPeriodEndDate`
- `Date lastRegularPeriodEndDate`
- `StubPeriodTypeEnum stubPeriodType`
- `CalculationPeriodFrequencyBuilder calculationPeriodFrequency`
- `MetaFieldsBuilder meta`

**Key Methods:**
- `build()` → `CalculationPeriodDates` [Builder]
- `getOrCreateMeta()` → `MetaFieldsBuilder` [Getter]
- `getEffectiveDate()` → `AdjustableOrRelativeDateBuilder` [Getter]
- `getTerminationDate()` → `AdjustableOrRelativeDateBuilder` [Getter]
- `setTerminationDate(AdjustableOrRelativeDate arg0)` → `CalculationPeriodDatesBuilder` [Setter]
- `getMeta()` → `MetaFieldsBuilder` [Getter]
- `setMeta(MetaFields arg0)` → `CalculationPeriodDatesBuilder` [Setter]
- `getOrCreateCalculationPeriodDatesAdjustments()` → `BusinessDayAdjustmentsBuilder` [Getter]
- `setFirstPeriodStartDate(AdjustableOrRelativeDate arg0)` → `CalculationPeriodDatesBuilder` [Setter]
- `setStubPeriodType(StubPeriodTypeEnum arg0)` → `CalculationPeriodDatesBuilder` [Setter]

### CalculationPeriodDatesImpl
**Implements:** `CalculationPeriodDates` 

**Key Methods:**
- `build()` → `CalculationPeriodDates` [Builder]
- `setBuilderFields(CalculationPeriodDatesBuilder arg0)` → `void` [Setter]
- `getEffectiveDate()` → `AdjustableOrRelativeDate` [Getter]
- `getTerminationDate()` → `AdjustableOrRelativeDate` [Getter]
- `getMeta()` → `MetaFields` [Getter]
- `getStubPeriodType()` → `StubPeriodTypeEnum` [Getter]
- `getFirstPeriodStartDate()` → `AdjustableOrRelativeDate` [Getter]
- `getFirstRegularPeriodStartDate()` → `Date` [Getter]
- `getFirstCompoundingPeriodEndDate()` → `Date` [Getter]
- `getLastRegularPeriodEndDate()` → `Date` [Getter]

### CalculationPeriodImpl
**Extends:** `CalculationPeriodBase$CalculationPeriodBaseImpl` 
**Implements:** `CalculationPeriod` 

**Key Methods:**
- `build()` → `CalculationPeriod` [Builder]
- `setBuilderFields(CalculationPeriodBuilder arg0)` → `void` [Setter]
- `getForecastRate()` → `BigDecimal` [Getter]
- `getUnadjustedEndDate()` → `Date` [Getter]
- `getFloatingRateDefinition()` → `FloatingRateDefinition` [Getter]
- `getDayCountYearFraction()` → `BigDecimal` [Getter]
- `getUnadjustedStartDate()` → `Date` [Getter]
- `getForecastAmount()` → `Money` [Getter]
- `getFxLinkedNotionalAmount()` → `FxLinkedNotionalAmount` [Getter]
- `getCalculationPeriodNumberOfDays()` → `Integer` [Getter]

### DateRelativeToCalculationPeriodDatesBuilderImpl
**Implements:** `DateRelativeToCalculationPeriodDates$DateRelativeToCalculationPeriodDatesBuilder` 

**Fields:**
- `List (List) calculationPeriodDatesReference`

**Key Methods:**
- `build()` → `DateRelativeToCalculationPeriodDates` [Builder]
- `getOrCreateCalculationPeriodDatesReference(int arg0)` → `ReferenceWithMetaCalculationPeriodDatesBuilder` [Getter]
- `getCalculationPeriodDatesReference()` → `List` [Getter]
- `setCalculationPeriodDatesReference(List arg0)` → `DateRelativeToCalculationPeriodDatesBuilder` [Setter]
- `setCalculationPeriodDatesReferenceValue(List arg0)` → `DateRelativeToCalculationPeriodDatesBuilder` [Setter]

### DateRelativeToCalculationPeriodDatesImpl
**Implements:** `DateRelativeToCalculationPeriodDates` 

**Key Methods:**
- `build()` → `DateRelativeToCalculationPeriodDates` [Builder]
- `setBuilderFields(DateRelativeToCalculationPeriodDatesBuilder arg0)` → `void` [Setter]
- `getCalculationPeriodDatesReference()` → `List` [Getter]

### DateRelativeToPaymentDatesBuilderImpl
**Implements:** `DateRelativeToPaymentDates$DateRelativeToPaymentDatesBuilder` 

**Fields:**
- `List (List) paymentDatesReference`

**Key Methods:**
- `build()` → `DateRelativeToPaymentDates` [Builder]
- `getPaymentDatesReference()` → `List` [Getter]
- `setPaymentDatesReference(List arg0)` → `DateRelativeToPaymentDatesBuilder` [Setter]
- `getOrCreatePaymentDatesReference(int arg0)` → `ReferenceWithMetaPaymentDatesBuilder` [Getter]
- `setPaymentDatesReferenceValue(List arg0)` → `DateRelativeToPaymentDatesBuilder` [Setter]

### DateRelativeToPaymentDatesImpl
**Implements:** `DateRelativeToPaymentDates` 

**Key Methods:**
- `build()` → `DateRelativeToPaymentDates` [Builder]
- `setBuilderFields(DateRelativeToPaymentDatesBuilder arg0)` → `void` [Setter]
- `getPaymentDatesReference()` → `List` [Getter]

### DateRelativeToValuationDatesBuilderImpl
**Implements:** `DateRelativeToValuationDates$DateRelativeToValuationDatesBuilder` 

**Fields:**
- `List (List) valuationDatesReference`

**Key Methods:**
- `build()` → `DateRelativeToValuationDates` [Builder]
- `setValuationDatesReference(List arg0)` → `DateRelativeToValuationDatesBuilder` [Setter]
- `getValuationDatesReference()` → `List` [Getter]
- `getOrCreateValuationDatesReference(int arg0)` → `ReferenceWithMetaPerformanceValuationDatesBuilder` [Getter]
- `setValuationDatesReferenceValue(List arg0)` → `DateRelativeToValuationDatesBuilder` [Setter]

### DateRelativeToValuationDatesImpl
**Implements:** `DateRelativeToValuationDates` 

**Key Methods:**
- `build()` → `DateRelativeToValuationDates` [Builder]
- `setBuilderFields(DateRelativeToValuationDatesBuilder arg0)` → `void` [Setter]
- `getValuationDatesReference()` → `List` [Getter]

### FinalCalculationPeriodDateAdjustmentBuilderImpl
**Implements:** `FinalCalculationPeriodDateAdjustment$FinalCalculationPeriodDateAdjustmentBuilder` 

**Fields:**
- `ReferenceWithMetaAdjustableOrRelativeDatesBuilder relevantUnderlyingDateReference`
- `ReferenceWithMetaInterestRatePayoutBuilder swapStreamReference`
- `BusinessDayConventionEnum businessDayConvention`

**Key Methods:**
- `build()` → `FinalCalculationPeriodDateAdjustment` [Builder]
- `setBusinessDayConvention(BusinessDayConventionEnum arg0)` → `FinalCalculationPeriodDateAdjustmentBuilder` [Setter]
- `getBusinessDayConvention()` → `BusinessDayConventionEnum` [Getter]
- `getSwapStreamReference()` → `ReferenceWithMetaInterestRatePayoutBuilder` [Getter]
- `setSwapStreamReference(ReferenceWithMetaInterestRatePayout arg0)` → `FinalCalculationPeriodDateAdjustmentBuilder` [Setter]
- `getOrCreateSwapStreamReference()` → `ReferenceWithMetaInterestRatePayoutBuilder` [Getter]
- `setSwapStreamReferenceValue(InterestRatePayout arg0)` → `FinalCalculationPeriodDateAdjustmentBuilder` [Setter]
- `getRelevantUnderlyingDateReference()` → `ReferenceWithMetaAdjustableOrRelativeDatesBuilder` [Getter]
- `setRelevantUnderlyingDateReference(ReferenceWithMetaAdjustableOrRelativeDates arg0)` → `FinalCalculationPeriodDateAdjustmentBuilder` [Setter]
- `setRelevantUnderlyingDateReferenceValue(AdjustableOrRelativeDates arg0)` → `FinalCalculationPeriodDateAdjustmentBuilder` [Setter]

### FinalCalculationPeriodDateAdjustmentImpl
**Implements:** `FinalCalculationPeriodDateAdjustment` 

**Key Methods:**
- `build()` → `FinalCalculationPeriodDateAdjustment` [Builder]
- `setBuilderFields(FinalCalculationPeriodDateAdjustmentBuilder arg0)` → `void` [Setter]
- `getBusinessDayConvention()` → `BusinessDayConventionEnum` [Getter]
- `getSwapStreamReference()` → `ReferenceWithMetaInterestRatePayout` [Getter]
- `getRelevantUnderlyingDateReference()` → `ReferenceWithMetaAdjustableOrRelativeDates` [Getter]

### FxLinkedNotionalAmountBuilderImpl
**Implements:** `FxLinkedNotionalAmount$FxLinkedNotionalAmountBuilder` 

**Fields:**
- `Date resetDate`
- `Date adjustedFxSpotFixingDate`
- `BigDecimal observedFxSpotRate`
- `BigDecimal notionalAmount`

**Key Methods:**
- `build()` → `FxLinkedNotionalAmount` [Builder]
- `getResetDate()` → `Date` [Getter]
- `setResetDate(Date arg0)` → `FxLinkedNotionalAmountBuilder` [Setter]
- `setNotionalAmount(BigDecimal arg0)` → `FxLinkedNotionalAmountBuilder` [Setter]
- `getObservedFxSpotRate()` → `BigDecimal` [Getter]
- `setObservedFxSpotRate(BigDecimal arg0)` → `FxLinkedNotionalAmountBuilder` [Setter]
- `setAdjustedFxSpotFixingDate(Date arg0)` → `FxLinkedNotionalAmountBuilder` [Setter]
- `getAdjustedFxSpotFixingDate()` → `Date` [Getter]
- `getNotionalAmount()` → `BigDecimal` [Getter]

### FxLinkedNotionalAmountImpl
**Implements:** `FxLinkedNotionalAmount` 

**Key Methods:**
- `build()` → `FxLinkedNotionalAmount` [Builder]
- `setBuilderFields(FxLinkedNotionalAmountBuilder arg0)` → `void` [Setter]
- `getResetDate()` → `Date` [Getter]
- `getObservedFxSpotRate()` → `BigDecimal` [Getter]
- `getAdjustedFxSpotFixingDate()` → `Date` [Getter]
- `getNotionalAmount()` → `BigDecimal` [Getter]

### FxLinkedNotionalScheduleBuilderImpl
**Implements:** `FxLinkedNotionalSchedule$FxLinkedNotionalScheduleBuilder` 

**Fields:**
- `FieldWithMetaStringBuilder varyingNotionalCurrency`
- `RelativeDateOffsetBuilder varyingNotionalFixingDates`
- `FxSpotRateSourceBuilder fxSpotRateSource`
- `BusinessCenterTimeBuilder fixingTime`
- `RelativeDateOffsetBuilder varyingNotionalInterimExchangePaymentDates`

**Key Methods:**
- `build()` → `FxLinkedNotionalSchedule` [Builder]
- `getFxSpotRateSource()` → `FxSpotRateSourceBuilder` [Getter]
- `getFixingTime()` → `BusinessCenterTimeBuilder` [Getter]
- `setFixingTime(BusinessCenterTime arg0)` → `FxLinkedNotionalScheduleBuilder` [Setter]
- `getOrCreateFixingTime()` → `BusinessCenterTimeBuilder` [Getter]
- `setFxSpotRateSource(FxSpotRateSource arg0)` → `FxLinkedNotionalScheduleBuilder` [Setter]
- `getOrCreateFxSpotRateSource()` → `FxSpotRateSourceBuilder` [Getter]
- `getVaryingNotionalCurrency()` → `FieldWithMetaStringBuilder` [Getter]
- `setVaryingNotionalCurrency(FieldWithMetaString arg0)` → `FxLinkedNotionalScheduleBuilder` [Setter]
- `getOrCreateVaryingNotionalInterimExchangePaymentDates()` → `RelativeDateOffsetBuilder` [Getter]

### FxLinkedNotionalScheduleImpl
**Implements:** `FxLinkedNotionalSchedule` 

**Key Methods:**
- `build()` → `FxLinkedNotionalSchedule` [Builder]
- `setBuilderFields(FxLinkedNotionalScheduleBuilder arg0)` → `void` [Setter]
- `getFxSpotRateSource()` → `FxSpotRateSource` [Getter]
- `getFixingTime()` → `BusinessCenterTime` [Getter]
- `getVaryingNotionalCurrency()` → `FieldWithMetaString` [Getter]
- `getVaryingNotionalInterimExchangePaymentDates()` → `RelativeDateOffset` [Getter]
- `getVaryingNotionalFixingDates()` → `RelativeDateOffset` [Getter]

### InitialFixingDateBuilderImpl
**Implements:** `InitialFixingDate$InitialFixingDateBuilder` 

**Fields:**
- `RelativeDateOffsetBuilder relativeDateOffset`
- `Date initialFixingDate`

**Key Methods:**
- `build()` → `InitialFixingDate` [Builder]
- `getInitialFixingDate()` → `Date` [Getter]
- `setInitialFixingDate(Date arg0)` → `InitialFixingDateBuilder` [Setter]
- `getRelativeDateOffset()` → `RelativeDateOffsetBuilder` [Getter]
- `setRelativeDateOffset(RelativeDateOffset arg0)` → `InitialFixingDateBuilder` [Setter]
- `getOrCreateRelativeDateOffset()` → `RelativeDateOffsetBuilder` [Getter]

### InitialFixingDateImpl
**Implements:** `InitialFixingDate` 

**Key Methods:**
- `build()` → `InitialFixingDate` [Builder]
- `setBuilderFields(InitialFixingDateBuilder arg0)` → `void` [Setter]
- `getInitialFixingDate()` → `Date` [Getter]
- `getRelativeDateOffset()` → `RelativeDateOffset` [Getter]

### LagBuilderImpl
**Implements:** `Lag$LagBuilder` 

**Fields:**
- `OffsetBuilder lagDuration`
- `OffsetBuilder firstObservationDateOffset`

**Key Methods:**
- `build()` → `Lag` [Builder]
- `getOrCreateLagDuration()` → `OffsetBuilder` [Getter]
- `setLagDuration(Offset arg0)` → `LagBuilder` [Setter]
- `getLagDuration()` → `OffsetBuilder` [Getter]
- `setFirstObservationDateOffset(Offset arg0)` → `LagBuilder` [Setter]
- `getOrCreateFirstObservationDateOffset()` → `OffsetBuilder` [Getter]
- `getFirstObservationDateOffset()` → `OffsetBuilder` [Getter]

### LagImpl
**Implements:** `Lag` 

**Key Methods:**
- `build()` → `Lag` [Builder]
- `setBuilderFields(LagBuilder arg0)` → `void` [Setter]
- `getLagDuration()` → `Offset` [Getter]
- `getFirstObservationDateOffset()` → `Offset` [Getter]

### ObservationDateBuilderImpl
**Implements:** `ObservationDate$ObservationDateBuilder` 

**Fields:**
- `Date unadjustedDate`
- `Date adjustedDate`
- `BigDecimal weight`
- `String observationReference`
- `MetaFieldsBuilder meta`

**Key Methods:**
- `build()` → `ObservationDate` [Builder]
- `getAdjustedDate()` → `Date` [Getter]
- `getUnadjustedDate()` → `Date` [Getter]
- `getOrCreateMeta()` → `MetaFieldsBuilder` [Getter]
- `getWeight()` → `BigDecimal` [Getter]
- `getMeta()` → `MetaFieldsBuilder` [Getter]
- `setMeta(MetaFields arg0)` → `ObservationDateBuilder` [Setter]
- `setObservationReference(String arg0)` → `ObservationDateBuilder` [Setter]
- `getObservationReference()` → `String` [Getter]
- `setUnadjustedDate(Date arg0)` → `ObservationDateBuilder` [Setter]

### ObservationDateImpl
**Implements:** `ObservationDate` 

**Key Methods:**
- `build()` → `ObservationDate` [Builder]
- `getAdjustedDate()` → `Date` [Getter]
- `getUnadjustedDate()` → `Date` [Getter]
- `setBuilderFields(ObservationDateBuilder arg0)` → `void` [Setter]
- `getWeight()` → `BigDecimal` [Getter]
- `getMeta()` → `MetaFields` [Getter]
- `getObservationReference()` → `String` [Getter]

### ObservationDatesBuilderImpl
**Implements:** `ObservationDates$ObservationDatesBuilder` 

**Fields:**
- `ObservationScheduleBuilder observationSchedule`
- `PeriodicDatesBuilder periodicSchedule`
- `ParametricDatesBuilder parametricDates`

**Key Methods:**
- `build()` → `ObservationDates` [Builder]
- `getPeriodicSchedule()` → `PeriodicDatesBuilder` [Getter]
- `getObservationSchedule()` → `ObservationScheduleBuilder` [Getter]
- `setPeriodicSchedule(PeriodicDates arg0)` → `ObservationDatesBuilder` [Setter]
- `getParametricDates()` → `ParametricDatesBuilder` [Getter]
- `setObservationSchedule(ObservationSchedule arg0)` → `ObservationDatesBuilder` [Setter]
- `getOrCreateParametricDates()` → `ParametricDatesBuilder` [Getter]
- `setParametricDates(ParametricDates arg0)` → `ObservationDatesBuilder` [Setter]
- `getOrCreatePeriodicSchedule()` → `PeriodicDatesBuilder` [Getter]
- `getOrCreateObservationSchedule()` → `ObservationScheduleBuilder` [Getter]

### ObservationDatesImpl
**Implements:** `ObservationDates` 

**Key Methods:**
- `build()` → `ObservationDates` [Builder]
- `setBuilderFields(ObservationDatesBuilder arg0)` → `void` [Setter]
- `getPeriodicSchedule()` → `PeriodicDates` [Getter]
- `getObservationSchedule()` → `ObservationSchedule` [Getter]
- `getParametricDates()` → `ParametricDates` [Getter]

### ObservationScheduleBuilderImpl
**Implements:** `ObservationSchedule$ObservationScheduleBuilder` 

**Fields:**
- `List (List) observationDate`
- `BusinessDayAdjustmentsBuilder dateAdjustments`

**Key Methods:**
- `build()` → `ObservationSchedule` [Builder]
- `setObservationDate(List arg0)` → `ObservationScheduleBuilder` [Setter]
- `getOrCreateObservationDate(int arg0)` → `ObservationDateBuilder` [Getter]
- `getOrCreateDateAdjustments()` → `BusinessDayAdjustmentsBuilder` [Getter]
- `setDateAdjustments(BusinessDayAdjustments arg0)` → `ObservationScheduleBuilder` [Setter]
- `getDateAdjustments()` → `BusinessDayAdjustmentsBuilder` [Getter]
- `getObservationDate()` → `List` [Getter]

### ObservationScheduleImpl
**Implements:** `ObservationSchedule` 

**Key Methods:**
- `build()` → `ObservationSchedule` [Builder]
- `setBuilderFields(ObservationScheduleBuilder arg0)` → `void` [Setter]
- `getDateAdjustments()` → `BusinessDayAdjustments` [Getter]
- `getObservationDate()` → `List` [Getter]

### ObservationTermsBuilderImpl
**Implements:** `ObservationTerms$ObservationTermsBuilder` 

**Fields:**
- `BusinessCenterTimeBuilder observationTime`
- `TimeTypeEnum observationTimeType`
- `FxSpotRateSourceBuilder informationSource`
- `RoundingBuilder precision`
- `CalculationPeriodDatesBuilder calculationPeriodDates`
- `ObservationDatesBuilder observationDates`
- `Integer numberOfObservationDates`

**Key Methods:**
- `build()` → `ObservationTerms` [Builder]
- `getPrecision()` → `RoundingBuilder` [Getter]
- `getInformationSource()` → `FxSpotRateSourceBuilder` [Getter]
- `setObservationTime(BusinessCenterTime arg0)` → `ObservationTermsBuilder` [Setter]
- `setInformationSource(FxSpotRateSource arg0)` → `ObservationTermsBuilder` [Setter]
- `setCalculationPeriodDates(CalculationPeriodDates arg0)` → `ObservationTermsBuilder` [Setter]
- `setObservationDates(ObservationDates arg0)` → `ObservationTermsBuilder` [Setter]
- `setObservationTimeType(TimeTypeEnum arg0)` → `ObservationTermsBuilder` [Setter]
- `getOrCreateCalculationPeriodDates()` → `CalculationPeriodDatesBuilder` [Getter]
- `getOrCreateObservationDates()` → `ObservationDatesBuilder` [Getter]

### ObservationTermsImpl
**Implements:** `ObservationTerms` 

**Key Methods:**
- `build()` → `ObservationTerms` [Builder]
- `setBuilderFields(ObservationTermsBuilder arg0)` → `void` [Setter]
- `getPrecision()` → `Rounding` [Getter]
- `getInformationSource()` → `FxSpotRateSource` [Getter]
- `getObservationTime()` → `BusinessCenterTime` [Getter]
- `getObservationTimeType()` → `TimeTypeEnum` [Getter]
- `getObservationDates()` → `ObservationDates` [Getter]
- `getNumberOfObservationDates()` → `Integer` [Getter]
- `getCalculationPeriodDates()` → `CalculationPeriodDates` [Getter]

### ParametricDatesBuilderImpl
**Implements:** `ParametricDates$ParametricDatesBuilder` 

**Fields:**
- `DayTypeEnum dayType`
- `DayDistributionEnum dayDistribution`
- `List (List) dayOfWeek`
- `BigDecimal dayFrequency`
- `LagBuilder lag`
- `BusinessCentersBuilder businessCenters`

**Key Methods:**
- `build()` → `ParametricDates` [Builder]
- `getDayOfWeek()` → `List` [Getter]
- `setDayOfWeek(List arg0)` → `ParametricDatesBuilder` [Setter]
- `setDayDistribution(DayDistributionEnum arg0)` → `ParametricDatesBuilder` [Setter]
- `getOrCreateLag()` → `LagBuilder` [Getter]
- `getDayFrequency()` → `BigDecimal` [Getter]
- `getDayDistribution()` → `DayDistributionEnum` [Getter]
- `setDayFrequency(BigDecimal arg0)` → `ParametricDatesBuilder` [Setter]
- `getOrCreateBusinessCenters()` → `BusinessCentersBuilder` [Getter]
- `setBusinessCenters(BusinessCenters arg0)` → `ParametricDatesBuilder` [Setter]

### ParametricDatesImpl
**Implements:** `ParametricDates` 

**Key Methods:**
- `build()` → `ParametricDates` [Builder]
- `getDayOfWeek()` → `List` [Getter]
- `setBuilderFields(ParametricDatesBuilder arg0)` → `void` [Setter]
- `getDayFrequency()` → `BigDecimal` [Getter]
- `getDayDistribution()` → `DayDistributionEnum` [Getter]
- `getBusinessCenters()` → `BusinessCenters` [Getter]
- `getDayType()` → `DayTypeEnum` [Getter]
- `getLag()` → `Lag` [Getter]

### PaymentCalculationPeriodBuilderImpl
**Implements:** `PaymentCalculationPeriod$PaymentCalculationPeriodBuilder` 

**Fields:**
- `Date unadjustedPaymentDate`
- `Date adjustedPaymentDate`
- `List (List) calculationPeriod`
- `MoneyBuilder fixedPaymentAmount`
- `BigDecimal discountFactor`
- `MoneyBuilder forecastPaymentAmount`
- `MoneyBuilder presentValueAmount`
- `MetaFieldsBuilder meta`

**Key Methods:**
- `build()` → `PaymentCalculationPeriod` [Builder]
- `getOrCreateMeta()` → `MetaFieldsBuilder` [Getter]
- `getMeta()` → `MetaFieldsBuilder` [Getter]
- `setMeta(MetaFields arg0)` → `PaymentCalculationPeriodBuilder` [Setter]
- `setAdjustedPaymentDate(Date arg0)` → `PaymentCalculationPeriodBuilder` [Setter]
- `getForecastPaymentAmount()` → `MoneyBuilder` [Getter]
- `getPresentValueAmount()` → `MoneyBuilder` [Getter]
- `getFixedPaymentAmount()` → `MoneyBuilder` [Getter]
- `setUnadjustedPaymentDate(Date arg0)` → `PaymentCalculationPeriodBuilder` [Setter]
- `setForecastPaymentAmount(Money arg0)` → `PaymentCalculationPeriodBuilder` [Setter]

### PaymentCalculationPeriodImpl
**Implements:** `PaymentCalculationPeriod` 

**Key Methods:**
- `build()` → `PaymentCalculationPeriod` [Builder]
- `setBuilderFields(PaymentCalculationPeriodBuilder arg0)` → `void` [Setter]
- `getMeta()` → `MetaFields` [Getter]
- `getForecastPaymentAmount()` → `Money` [Getter]
- `getPresentValueAmount()` → `Money` [Getter]
- `getFixedPaymentAmount()` → `Money` [Getter]
- `getDiscountFactor()` → `BigDecimal` [Getter]
- `getUnadjustedPaymentDate()` → `Date` [Getter]
- `getAdjustedPaymentDate()` → `Date` [Getter]
- `getCalculationPeriod()` → `List` [Getter]

### PaymentDateScheduleBuilderImpl
**Implements:** `PaymentDateSchedule$PaymentDateScheduleBuilder` 

**Fields:**
- `List (List) interimPaymentDates`
- `AdjustableOrRelativeDateBuilder finalPaymentDate`

**Key Methods:**
- `build()` → `PaymentDateSchedule` [Builder]
- `getInterimPaymentDates()` → `List` [Getter]
- `getFinalPaymentDate()` → `AdjustableOrRelativeDateBuilder` [Getter]
- `setInterimPaymentDates(List arg0)` → `PaymentDateScheduleBuilder` [Setter]
- `setFinalPaymentDate(AdjustableOrRelativeDate arg0)` → `PaymentDateScheduleBuilder` [Setter]
- `getOrCreateFinalPaymentDate()` → `AdjustableOrRelativeDateBuilder` [Getter]
- `getOrCreateInterimPaymentDates(int arg0)` → `AdjustableRelativeOrPeriodicDatesBuilder` [Getter]

### PaymentDateScheduleImpl
**Implements:** `PaymentDateSchedule` 

**Key Methods:**
- `build()` → `PaymentDateSchedule` [Builder]
- `setBuilderFields(PaymentDateScheduleBuilder arg0)` → `void` [Setter]
- `getInterimPaymentDates()` → `List` [Getter]
- `getFinalPaymentDate()` → `AdjustableOrRelativeDate` [Getter]

### PaymentDatesBuilderImpl
**Implements:** `PaymentDates$PaymentDatesBuilder` 

**Fields:**
- `FrequencyBuilder paymentFrequency`
- `Date firstPaymentDate`
- `Date lastRegularPaymentDate`
- `PaymentDateScheduleBuilder paymentDateSchedule`
- `PayRelativeToEnum payRelativeTo`
- `OffsetBuilder paymentDaysOffset`
- `BusinessDayAdjustmentsBuilder paymentDatesAdjustments`
- `MetaFieldsBuilder meta`

**Key Methods:**
- `build()` → `PaymentDates` [Builder]
- `getOrCreateMeta()` → `MetaFieldsBuilder` [Getter]
- `getMeta()` → `MetaFieldsBuilder` [Getter]
- `setMeta(MetaFields arg0)` → `PaymentDatesBuilder` [Setter]
- `getPayRelativeTo()` → `PayRelativeToEnum` [Getter]
- `getPaymentDaysOffset()` → `OffsetBuilder` [Getter]
- `getPaymentFrequency()` → `FrequencyBuilder` [Getter]
- `getFirstPaymentDate()` → `Date` [Getter]
- `getPaymentDateSchedule()` → `PaymentDateScheduleBuilder` [Getter]
- `getLastRegularPaymentDate()` → `Date` [Getter]

### PaymentDatesImpl
**Implements:** `PaymentDates` 

**Key Methods:**
- `build()` → `PaymentDates` [Builder]
- `setBuilderFields(PaymentDatesBuilder arg0)` → `void` [Setter]
- `getMeta()` → `MetaFields` [Getter]
- `getPayRelativeTo()` → `PayRelativeToEnum` [Getter]
- `getPaymentDaysOffset()` → `Offset` [Getter]
- `getPaymentFrequency()` → `Frequency` [Getter]
- `getFirstPaymentDate()` → `Date` [Getter]
- `getPaymentDateSchedule()` → `PaymentDateSchedule` [Getter]
- `getLastRegularPaymentDate()` → `Date` [Getter]
- `getPaymentDatesAdjustments()` → `BusinessDayAdjustments` [Getter]

### RateScheduleBuilderImpl
**Implements:** `RateSchedule$RateScheduleBuilder` 

**Fields:**
- `ReferenceWithMetaPriceScheduleBuilder price`

**Key Methods:**
- `build()` → `RateSchedule` [Builder]
- `getOrCreatePrice()` → `ReferenceWithMetaPriceScheduleBuilder` [Getter]
- `getPrice()` → `ReferenceWithMetaPriceScheduleBuilder` [Getter]
- `setPriceValue(PriceSchedule arg0)` → `RateScheduleBuilder` [Setter]
- `setPrice(ReferenceWithMetaPriceSchedule arg0)` → `RateScheduleBuilder` [Setter]

### RateScheduleImpl
**Implements:** `RateSchedule` 

**Key Methods:**
- `build()` → `RateSchedule` [Builder]
- `setBuilderFields(RateScheduleBuilder arg0)` → `void` [Setter]
- `getPrice()` → `ReferenceWithMetaPriceSchedule` [Getter]

### ResetDatesBuilderImpl
**Implements:** `ResetDates$ResetDatesBuilder` 

**Fields:**
- `ReferenceWithMetaCalculationPeriodDatesBuilder calculationPeriodDatesReference`
- `ResetRelativeToEnum resetRelativeTo`
- `InitialFixingDateBuilder initialFixingDate`
- `RelativeDateOffsetBuilder fixingDates`
- `AdjustableDateBuilder finalFixingDate`
- `OffsetBuilder rateCutOffDaysOffset`
- `ResetFrequencyBuilder resetFrequency`
- `BusinessDayAdjustmentsBuilder resetDatesAdjustments`
- `MetaFieldsBuilder meta`

**Key Methods:**
- `build()` → `ResetDates` [Builder]
- `getOrCreateMeta()` → `MetaFieldsBuilder` [Getter]
- `getMeta()` → `MetaFieldsBuilder` [Getter]
- `setMeta(MetaFields arg0)` → `ResetDatesBuilder` [Setter]
- `getFixingDates()` → `RelativeDateOffsetBuilder` [Getter]
- `getInitialFixingDate()` → `InitialFixingDateBuilder` [Getter]
- `getResetRelativeTo()` → `ResetRelativeToEnum` [Getter]
- `getFinalFixingDate()` → `AdjustableDateBuilder` [Getter]
- `getRateCutOffDaysOffset()` → `OffsetBuilder` [Getter]
- `getResetFrequency()` → `ResetFrequencyBuilder` [Getter]

### ResetDatesImpl
**Implements:** `ResetDates` 

**Key Methods:**
- `build()` → `ResetDates` [Builder]
- `setBuilderFields(ResetDatesBuilder arg0)` → `void` [Setter]
- `getMeta()` → `MetaFields` [Getter]
- `getFixingDates()` → `RelativeDateOffset` [Getter]
- `getInitialFixingDate()` → `InitialFixingDate` [Getter]
- `getResetRelativeTo()` → `ResetRelativeToEnum` [Getter]
- `getFinalFixingDate()` → `AdjustableDate` [Getter]
- `getRateCutOffDaysOffset()` → `Offset` [Getter]
- `getResetFrequency()` → `ResetFrequency` [Getter]
- `getResetDatesAdjustments()` → `BusinessDayAdjustments` [Getter]

### ResetFrequencyBuilderImpl
**Extends:** `Frequency$FrequencyBuilderImpl` 
**Implements:** `ResetFrequency$ResetFrequencyBuilder` 

**Fields:**
- `WeeklyRollConventionEnum weeklyRollConvention`

**Key Methods:**
- `build()` → `ResetFrequency` [Builder]
- `setMeta(MetaFields arg0)` → `ResetFrequencyBuilder` [Setter]
- `getWeeklyRollConvention()` → `WeeklyRollConventionEnum` [Getter]
- `setWeeklyRollConvention(WeeklyRollConventionEnum arg0)` → `ResetFrequencyBuilder` [Setter]
- `setPeriod(PeriodExtendedEnum arg0)` → `ResetFrequencyBuilder` [Setter]
- `setPeriodMultiplier(Integer arg0)` → `ResetFrequencyBuilder` [Setter]

### ResetFrequencyImpl
**Extends:** `Frequency$FrequencyImpl` 
**Implements:** `ResetFrequency` 

**Key Methods:**
- `build()` → `ResetFrequency` [Builder]
- `setBuilderFields(ResetFrequencyBuilder arg0)` → `void` [Setter]
- `getWeeklyRollConvention()` → `WeeklyRollConventionEnum` [Getter]

### StubCalculationPeriodAmountBuilderImpl
**Implements:** `StubCalculationPeriodAmount$StubCalculationPeriodAmountBuilder` 

**Fields:**
- `ReferenceWithMetaCalculationPeriodDatesBuilder calculationPeriodDatesReference`
- `StubValueBuilder initialStub`
- `StubValueBuilder finalStub`

**Key Methods:**
- `build()` → `StubCalculationPeriodAmount` [Builder]
- `getInitialStub()` → `StubValueBuilder` [Getter]
- `getFinalStub()` → `StubValueBuilder` [Getter]
- `getOrCreateInitialStub()` → `StubValueBuilder` [Getter]
- `setInitialStub(StubValue arg0)` → `StubCalculationPeriodAmountBuilder` [Setter]
- `getOrCreateFinalStub()` → `StubValueBuilder` [Getter]
- `setFinalStub(StubValue arg0)` → `StubCalculationPeriodAmountBuilder` [Setter]
- `getOrCreateCalculationPeriodDatesReference()` → `ReferenceWithMetaCalculationPeriodDatesBuilder` [Getter]
- `getCalculationPeriodDatesReference()` → `ReferenceWithMetaCalculationPeriodDatesBuilder` [Getter]
- `setCalculationPeriodDatesReference(ReferenceWithMetaCalculationPeriodDates arg0)` → `StubCalculationPeriodAmountBuilder` [Setter]

### StubCalculationPeriodAmountImpl
**Implements:** `StubCalculationPeriodAmount` 

**Key Methods:**
- `build()` → `StubCalculationPeriodAmount` [Builder]
- `setBuilderFields(StubCalculationPeriodAmountBuilder arg0)` → `void` [Setter]
- `getInitialStub()` → `StubValue` [Getter]
- `getFinalStub()` → `StubValue` [Getter]
- `getCalculationPeriodDatesReference()` → `ReferenceWithMetaCalculationPeriodDates` [Getter]

### StubPeriodBuilderImpl
**Implements:** `StubPeriod$StubPeriodBuilder` 

**Fields:**
- `ReferenceWithMetaCalculationPeriodDatesBuilder calculationPeriodDatesReference`
- `StubValueBuilder initialStub`
- `StubValueBuilder finalStub`

**Key Methods:**
- `build()` → `StubPeriod` [Builder]
- `getInitialStub()` → `StubValueBuilder` [Getter]
- `getFinalStub()` → `StubValueBuilder` [Getter]
- `getOrCreateInitialStub()` → `StubValueBuilder` [Getter]
- `setInitialStub(StubValue arg0)` → `StubPeriodBuilder` [Setter]
- `getOrCreateFinalStub()` → `StubValueBuilder` [Getter]
- `setFinalStub(StubValue arg0)` → `StubPeriodBuilder` [Setter]
- `getOrCreateCalculationPeriodDatesReference()` → `ReferenceWithMetaCalculationPeriodDatesBuilder` [Getter]
- `getCalculationPeriodDatesReference()` → `ReferenceWithMetaCalculationPeriodDatesBuilder` [Getter]
- `setCalculationPeriodDatesReference(ReferenceWithMetaCalculationPeriodDates arg0)` → `StubPeriodBuilder` [Setter]

### StubPeriodImpl
**Implements:** `StubPeriod` 

**Key Methods:**
- `build()` → `StubPeriod` [Builder]
- `setBuilderFields(StubPeriodBuilder arg0)` → `void` [Setter]
- `getInitialStub()` → `StubValue` [Getter]
- `getFinalStub()` → `StubValue` [Getter]
- `getCalculationPeriodDatesReference()` → `ReferenceWithMetaCalculationPeriodDates` [Getter]

### WeightedAveragingObservationBuilderImpl
**Implements:** `WeightedAveragingObservation$WeightedAveragingObservationBuilder` 

**Fields:**
- `ZonedDateTime dateTime`
- `Integer observationNumber`
- `BigDecimal weight`

**Key Methods:**
- `build()` → `WeightedAveragingObservation` [Builder]
- `getWeight()` → `BigDecimal` [Getter]
- `setDateTime(ZonedDateTime arg0)` → `WeightedAveragingObservationBuilder` [Setter]
- `getDateTime()` → `ZonedDateTime` [Getter]
- `getObservationNumber()` → `Integer` [Getter]
- `setObservationNumber(Integer arg0)` → `WeightedAveragingObservationBuilder` [Setter]
- `setWeight(BigDecimal arg0)` → `WeightedAveragingObservationBuilder` [Setter]

### WeightedAveragingObservationImpl
**Implements:** `WeightedAveragingObservation` 

**Key Methods:**
- `build()` → `WeightedAveragingObservation` [Builder]
- `setBuilderFields(WeightedAveragingObservationBuilder arg0)` → `void` [Setter]
- `getWeight()` → `BigDecimal` [Getter]
- `getDateTime()` → `ZonedDateTime` [Getter]
- `getObservationNumber()` → `Integer` [Getter]

