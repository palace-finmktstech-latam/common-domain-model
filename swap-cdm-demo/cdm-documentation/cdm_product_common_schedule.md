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
- `setDatedValue(List arg0)` → `AmountScheduleBuilder` [Setter]
- `getOrCreateCurrency(int arg0)` → `FieldWithMetaStringBuilder` [Getter]
- `setCurrencyValue(List arg0)` → `AmountScheduleBuilder` [Setter]

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
- `setSchedule(List arg0)` → `AveragingPeriodBuilder` [Setter]
- `getOrCreateSchedule(int arg0)` → `AveragingScheduleBuilder` [Getter]
- `setMarketDisruptionValue(MarketDisruptionEnum arg0)` → `AveragingPeriodBuilder` [Setter]
- `setMarketDisruption(FieldWithMetaMarketDisruptionEnum arg0)` → `AveragingPeriodBuilder` [Setter]
- `setAveragingObservations(AveragingObservationList arg0)` → `AveragingPeriodBuilder` [Setter]
- `setAveragingDateTimes(DateTimeList arg0)` → `AveragingPeriodBuilder` [Setter]
- `getOrCreateMarketDisruption()` → `FieldWithMetaMarketDisruptionEnumBuilder` [Getter]
- `getOrCreateAveragingObservations()` → `AveragingObservationListBuilder` [Getter]
- `getOrCreateAveragingDateTimes()` → `DateTimeListBuilder` [Getter]

### CalculationPeriod
**Implements:** `CalculationPeriodBase` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `CalculationPeriod` [Builder]
- `getNotionalAmount()` → `BigDecimal` [Getter]
- `getFixedRate()` → `BigDecimal` [Getter]
- `getDayCountYearFraction()` → `BigDecimal` [Getter]
- `getForecastAmount()` → `Money` [Getter]
- `getFxLinkedNotionalAmount()` → `FxLinkedNotionalAmount` [Getter]
- `getFloatingRateDefinition()` → `FloatingRateDefinition` [Getter]
- `getUnadjustedStartDate()` → `Date` [Getter]
- `getUnadjustedEndDate()` → `Date` [Getter]

### CalculationPeriodBase
**Implements:** `RosettaModelObject` `GlobalKey` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `CalculationPeriodBase` [Builder]
- `getAdjustedStartDate()` → `Date` [Getter]
- `getAdjustedEndDate()` → `Date` [Getter]
- `getMeta()` → `MetaFields` [Getter]

### CalculationPeriodBaseBuilder
**Implements:** `CalculationPeriodBase` `RosettaModelObjectBuilder` `GlobalKey$GlobalKeyBuilder` 

**Key Methods:**
- `setAdjustedEndDate(Date arg0)` → `CalculationPeriodBaseBuilder` [Setter]
- `setAdjustedStartDate(Date arg0)` → `CalculationPeriodBaseBuilder` [Setter]
- `getOrCreateMeta()` → `MetaFieldsBuilder` [Getter]
- `setMeta(MetaFields arg0)` → `CalculationPeriodBaseBuilder` [Setter]
- `getMeta()` → `MetaFieldsBuilder` [Getter]

### CalculationPeriodBuilder
**Implements:** `CalculationPeriod` `CalculationPeriodBase$CalculationPeriodBaseBuilder` 

**Key Methods:**
- `setFixedRate(BigDecimal arg0)` → `CalculationPeriodBuilder` [Setter]
- `setAdjustedEndDate(Date arg0)` → `CalculationPeriodBuilder` [Setter]
- `setAdjustedStartDate(Date arg0)` → `CalculationPeriodBuilder` [Setter]
- `getOrCreateForecastAmount()` → `MoneyBuilder` [Getter]
- `getForecastAmount()` → `MoneyBuilder` [Getter]
- `getFxLinkedNotionalAmount()` → `FxLinkedNotionalAmountBuilder` [Getter]
- `getFloatingRateDefinition()` → `FloatingRateDefinitionBuilder` [Getter]
- `setUnadjustedStartDate(Date arg0)` → `CalculationPeriodBuilder` [Setter]
- `setNotionalAmount(BigDecimal arg0)` → `CalculationPeriodBuilder` [Setter]
- `setUnadjustedEndDate(Date arg0)` → `CalculationPeriodBuilder` [Setter]

### CalculationPeriodData
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `CalculationPeriodData` [Builder]
- `getStartDate()` → `Date` [Getter]
- `getDaysInPeriod()` → `Integer` [Getter]
- `getDaysInLeapYearPeriod()` → `Integer` [Getter]
- `getIsFirstPeriod()` → `Boolean` [Getter]
- `getIsLastPeriod()` → `Boolean` [Getter]
- `getEndDate()` → `Date` [Getter]

### CalculationPeriodDataBuilder
**Implements:** `CalculationPeriodData` `RosettaModelObjectBuilder` 

**Key Methods:**
- `setStartDate(Date arg0)` → `CalculationPeriodDataBuilder` [Setter]
- `setDaysInLeapYearPeriod(Integer arg0)` → `CalculationPeriodDataBuilder` [Setter]
- `setDaysInPeriod(Integer arg0)` → `CalculationPeriodDataBuilder` [Setter]
- `setIsLastPeriod(Boolean arg0)` → `CalculationPeriodDataBuilder` [Setter]
- `setIsFirstPeriod(Boolean arg0)` → `CalculationPeriodDataBuilder` [Setter]
- `setEndDate(Date arg0)` → `CalculationPeriodDataBuilder` [Setter]

### CalculationPeriodDates
**Implements:** `RosettaModelObject` `GlobalKey` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `CalculationPeriodDates` [Builder]
- `getFirstPeriodStartDate()` → `AdjustableOrRelativeDate` [Getter]
- `getStubPeriodType()` → `StubPeriodTypeEnum` [Getter]
- `getEffectiveDate()` → `AdjustableOrRelativeDate` [Getter]
- `getTerminationDate()` → `AdjustableOrRelativeDate` [Getter]
- `getFirstRegularPeriodStartDate()` → `Date` [Getter]
- `getFirstCompoundingPeriodEndDate()` → `Date` [Getter]
- `getCalculationPeriodDatesAdjustments()` → `BusinessDayAdjustments` [Getter]
- `getCalculationPeriodFrequency()` → `CalculationPeriodFrequency` [Getter]

### CalculationPeriodDatesBuilder
**Implements:** `CalculationPeriodDates` `RosettaModelObjectBuilder` `GlobalKey$GlobalKeyBuilder` 

**Key Methods:**
- `setEffectiveDate(AdjustableOrRelativeDate arg0)` → `CalculationPeriodDatesBuilder` [Setter]
- `getFirstPeriodStartDate()` → `AdjustableOrRelativeDateBuilder` [Getter]
- `getOrCreateTerminationDate()` → `AdjustableOrRelativeDateBuilder` [Getter]
- `getOrCreateEffectiveDate()` → `AdjustableOrRelativeDateBuilder` [Getter]
- `getEffectiveDate()` → `AdjustableOrRelativeDateBuilder` [Getter]
- `getOrCreateMeta()` → `MetaFieldsBuilder` [Getter]
- `setTerminationDate(AdjustableOrRelativeDate arg0)` → `CalculationPeriodDatesBuilder` [Setter]
- `getTerminationDate()` → `AdjustableOrRelativeDateBuilder` [Getter]
- `setStubPeriodType(StubPeriodTypeEnum arg0)` → `CalculationPeriodDatesBuilder` [Setter]
- `setFirstPeriodStartDate(AdjustableOrRelativeDate arg0)` → `CalculationPeriodDatesBuilder` [Setter]

### DateRelativeToCalculationPeriodDates
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `DateRelativeToCalculationPeriodDates` [Builder]
- `getCalculationPeriodDatesReference()` → `List` [Getter]

### DateRelativeToCalculationPeriodDatesBuilder
**Implements:** `DateRelativeToCalculationPeriodDates` `RosettaModelObjectBuilder` 

**Key Methods:**
- `getCalculationPeriodDatesReference()` → `List` [Getter]
- `setCalculationPeriodDatesReference(List arg0)` → `DateRelativeToCalculationPeriodDatesBuilder` [Setter]
- `getOrCreateCalculationPeriodDatesReference(int arg0)` → `ReferenceWithMetaCalculationPeriodDatesBuilder` [Getter]
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
- `setPaymentDatesReference(List arg0)` → `DateRelativeToPaymentDatesBuilder` [Setter]
- `getPaymentDatesReference()` → `List` [Getter]
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
- `setSwapStreamReferenceValue(InterestRatePayout arg0)` → `FinalCalculationPeriodDateAdjustmentBuilder` [Setter]
- `getOrCreateSwapStreamReference()` → `ReferenceWithMetaInterestRatePayoutBuilder` [Getter]
- `getRelevantUnderlyingDateReference()` → `ReferenceWithMetaAdjustableOrRelativeDatesBuilder` [Getter]
- `getOrCreateRelevantUnderlyingDateReference()` → `ReferenceWithMetaAdjustableOrRelativeDatesBuilder` [Getter]
- `setRelevantUnderlyingDateReferenceValue(AdjustableOrRelativeDates arg0)` → `FinalCalculationPeriodDateAdjustmentBuilder` [Setter]
- `setRelevantUnderlyingDateReference(ReferenceWithMetaAdjustableOrRelativeDates arg0)` → `FinalCalculationPeriodDateAdjustmentBuilder` [Setter]

### FxLinkedNotionalAmount
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `FxLinkedNotionalAmount` [Builder]
- `getNotionalAmount()` → `BigDecimal` [Getter]
- `getResetDate()` → `Date` [Getter]
- `getObservedFxSpotRate()` → `BigDecimal` [Getter]
- `getAdjustedFxSpotFixingDate()` → `Date` [Getter]

### FxLinkedNotionalAmountBuilder
**Implements:** `FxLinkedNotionalAmount` `RosettaModelObjectBuilder` 

**Key Methods:**
- `setNotionalAmount(BigDecimal arg0)` → `FxLinkedNotionalAmountBuilder` [Setter]
- `setObservedFxSpotRate(BigDecimal arg0)` → `FxLinkedNotionalAmountBuilder` [Setter]
- `setAdjustedFxSpotFixingDate(Date arg0)` → `FxLinkedNotionalAmountBuilder` [Setter]
- `setResetDate(Date arg0)` → `FxLinkedNotionalAmountBuilder` [Setter]

### FxLinkedNotionalSchedule
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `FxLinkedNotionalSchedule` [Builder]
- `getVaryingNotionalFixingDates()` → `RelativeDateOffset` [Getter]
- `getFxSpotRateSource()` → `FxSpotRateSource` [Getter]
- `getFixingTime()` → `BusinessCenterTime` [Getter]
- `getVaryingNotionalInterimExchangePaymentDates()` → `RelativeDateOffset` [Getter]
- `getVaryingNotionalCurrency()` → `FieldWithMetaString` [Getter]

### FxLinkedNotionalScheduleBuilder
**Implements:** `FxLinkedNotionalSchedule` `RosettaModelObjectBuilder` 

**Key Methods:**
- `getOrCreateFxSpotRateSource()` → `FxSpotRateSourceBuilder` [Getter]
- `getOrCreateVaryingNotionalCurrency()` → `FieldWithMetaStringBuilder` [Getter]
- `getOrCreateVaryingNotionalFixingDates()` → `RelativeDateOffsetBuilder` [Getter]
- `getVaryingNotionalFixingDates()` → `RelativeDateOffsetBuilder` [Getter]
- `setVaryingNotionalCurrencyValue(String arg0)` → `FxLinkedNotionalScheduleBuilder` [Setter]
- `setVaryingNotionalFixingDates(RelativeDateOffset arg0)` → `FxLinkedNotionalScheduleBuilder` [Setter]
- `getFxSpotRateSource()` → `FxSpotRateSourceBuilder` [Getter]
- `setFixingTime(BusinessCenterTime arg0)` → `FxLinkedNotionalScheduleBuilder` [Setter]
- `getFixingTime()` → `BusinessCenterTimeBuilder` [Getter]
- `setFxSpotRateSource(FxSpotRateSource arg0)` → `FxLinkedNotionalScheduleBuilder` [Setter]

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
- `getLagDuration()` → `OffsetBuilder` [Getter]
- `getOrCreateLagDuration()` → `OffsetBuilder` [Getter]
- `setLagDuration(Offset arg0)` → `LagBuilder` [Setter]
- `getOrCreateFirstObservationDateOffset()` → `OffsetBuilder` [Getter]
- `setFirstObservationDateOffset(Offset arg0)` → `LagBuilder` [Setter]
- `getFirstObservationDateOffset()` → `OffsetBuilder` [Getter]

### ObservationDate
**Implements:** `RosettaModelObject` `GlobalKey` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `ObservationDate` [Builder]
- `getAdjustedDate()` → `Date` [Getter]
- `getUnadjustedDate()` → `Date` [Getter]
- `getWeight()` → `BigDecimal` [Getter]
- `getObservationReference()` → `String` [Getter]
- `getMeta()` → `MetaFields` [Getter]

### ObservationDateBuilder
**Implements:** `ObservationDate` `RosettaModelObjectBuilder` `GlobalKey$GlobalKeyBuilder` 

**Key Methods:**
- `setUnadjustedDate(Date arg0)` → `ObservationDateBuilder` [Setter]
- `setAdjustedDate(Date arg0)` → `ObservationDateBuilder` [Setter]
- `getOrCreateMeta()` → `MetaFieldsBuilder` [Getter]
- `setObservationReference(String arg0)` → `ObservationDateBuilder` [Setter]
- `setWeight(BigDecimal arg0)` → `ObservationDateBuilder` [Setter]
- `setMeta(MetaFields arg0)` → `ObservationDateBuilder` [Setter]
- `getMeta()` → `MetaFieldsBuilder` [Getter]

### ObservationDates
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `ObservationDates` [Builder]
- `getObservationSchedule()` → `ObservationSchedule` [Getter]
- `getPeriodicSchedule()` → `PeriodicDates` [Getter]
- `getParametricDates()` → `ParametricDates` [Getter]

### ObservationDatesBuilder
**Implements:** `ObservationDates` `RosettaModelObjectBuilder` 

**Key Methods:**
- `getOrCreateParametricDates()` → `ParametricDatesBuilder` [Getter]
- `getObservationSchedule()` → `ObservationScheduleBuilder` [Getter]
- `setPeriodicSchedule(PeriodicDates arg0)` → `ObservationDatesBuilder` [Setter]
- `setObservationSchedule(ObservationSchedule arg0)` → `ObservationDatesBuilder` [Setter]
- `getPeriodicSchedule()` → `PeriodicDatesBuilder` [Getter]
- `getParametricDates()` → `ParametricDatesBuilder` [Getter]
- `setParametricDates(ParametricDates arg0)` → `ObservationDatesBuilder` [Setter]
- `getOrCreatePeriodicSchedule()` → `PeriodicDatesBuilder` [Getter]
- `getOrCreateObservationSchedule()` → `ObservationScheduleBuilder` [Getter]

### ObservationSchedule
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `ObservationSchedule` [Builder]
- `getObservationDate()` → `List` [Getter]
- `getDateAdjustments()` → `BusinessDayAdjustments` [Getter]

### ObservationScheduleBuilder
**Implements:** `ObservationSchedule` `RosettaModelObjectBuilder` 

**Key Methods:**
- `getObservationDate()` → `List` [Getter]
- `setDateAdjustments(BusinessDayAdjustments arg0)` → `ObservationScheduleBuilder` [Setter]
- `getOrCreateDateAdjustments()` → `BusinessDayAdjustmentsBuilder` [Getter]
- `setObservationDate(List arg0)` → `ObservationScheduleBuilder` [Setter]
- `getOrCreateObservationDate(int arg0)` → `ObservationDateBuilder` [Getter]
- `getDateAdjustments()` → `BusinessDayAdjustmentsBuilder` [Getter]

### ObservationTerms
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `ObservationTerms` [Builder]
- `getObservationTime()` → `BusinessCenterTime` [Getter]
- `getObservationTimeType()` → `TimeTypeEnum` [Getter]
- `getInformationSource()` → `FxSpotRateSource` [Getter]
- `getNumberOfObservationDates()` → `Integer` [Getter]
- `getPrecision()` → `Rounding` [Getter]
- `getCalculationPeriodDates()` → `CalculationPeriodDates` [Getter]
- `getObservationDates()` → `ObservationDates` [Getter]

### ObservationTermsBuilder
**Implements:** `ObservationTerms` `RosettaModelObjectBuilder` 

**Key Methods:**
- `getOrCreateObservationTime()` → `BusinessCenterTimeBuilder` [Getter]
- `getOrCreatePrecision()` → `RoundingBuilder` [Getter]
- `setPrecision(Rounding arg0)` → `ObservationTermsBuilder` [Setter]
- `getObservationTime()` → `BusinessCenterTimeBuilder` [Getter]
- `setObservationTime(BusinessCenterTime arg0)` → `ObservationTermsBuilder` [Setter]
- `setInformationSource(FxSpotRateSource arg0)` → `ObservationTermsBuilder` [Setter]
- `getInformationSource()` → `FxSpotRateSourceBuilder` [Getter]
- `setCalculationPeriodDates(CalculationPeriodDates arg0)` → `ObservationTermsBuilder` [Setter]
- `setObservationTimeType(TimeTypeEnum arg0)` → `ObservationTermsBuilder` [Setter]
- `setObservationDates(ObservationDates arg0)` → `ObservationTermsBuilder` [Setter]

### ParametricDates
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `ParametricDates` [Builder]
- `getDayOfWeek()` → `List` [Getter]
- `getBusinessCenters()` → `BusinessCenters` [Getter]
- `getDayType()` → `DayTypeEnum` [Getter]
- `getDayDistribution()` → `DayDistributionEnum` [Getter]
- `getDayFrequency()` → `BigDecimal` [Getter]
- `getLag()` → `Lag` [Getter]

### ParametricDatesBuilder
**Implements:** `ParametricDates` `RosettaModelObjectBuilder` 

**Key Methods:**
- `setDayOfWeek(List arg0)` → `ParametricDatesBuilder` [Setter]
- `setBusinessCenters(BusinessCenters arg0)` → `ParametricDatesBuilder` [Setter]
- `getOrCreateBusinessCenters()` → `BusinessCentersBuilder` [Getter]
- `getBusinessCenters()` → `BusinessCentersBuilder` [Getter]
- `setDayType(DayTypeEnum arg0)` → `ParametricDatesBuilder` [Setter]
- `setDayDistribution(DayDistributionEnum arg0)` → `ParametricDatesBuilder` [Setter]
- `setDayFrequency(BigDecimal arg0)` → `ParametricDatesBuilder` [Setter]
- `getOrCreateLag()` → `LagBuilder` [Getter]
- `setLag(Lag arg0)` → `ParametricDatesBuilder` [Setter]
- `getLag()` → `LagBuilder` [Getter]

### PaymentCalculationPeriod
**Implements:** `RosettaModelObject` `GlobalKey` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `PaymentCalculationPeriod` [Builder]
- `getCalculationPeriod()` → `List` [Getter]
- `getAdjustedPaymentDate()` → `Date` [Getter]
- `getFixedPaymentAmount()` → `Money` [Getter]
- `getPresentValueAmount()` → `Money` [Getter]
- `getForecastPaymentAmount()` → `Money` [Getter]
- `getUnadjustedPaymentDate()` → `Date` [Getter]
- `getDiscountFactor()` → `BigDecimal` [Getter]
- `getMeta()` → `MetaFields` [Getter]

### PaymentCalculationPeriodBuilder
**Implements:** `PaymentCalculationPeriod` `RosettaModelObjectBuilder` `GlobalKey$GlobalKeyBuilder` 

**Key Methods:**
- `setCalculationPeriod(List arg0)` → `PaymentCalculationPeriodBuilder` [Setter]
- `getCalculationPeriod()` → `List` [Getter]
- `getOrCreateMeta()` → `MetaFieldsBuilder` [Getter]
- `setAdjustedPaymentDate(Date arg0)` → `PaymentCalculationPeriodBuilder` [Setter]
- `setPresentValueAmount(Money arg0)` → `PaymentCalculationPeriodBuilder` [Setter]
- `getFixedPaymentAmount()` → `MoneyBuilder` [Getter]
- `setFixedPaymentAmount(Money arg0)` → `PaymentCalculationPeriodBuilder` [Setter]
- `setForecastPaymentAmount(Money arg0)` → `PaymentCalculationPeriodBuilder` [Setter]
- `getPresentValueAmount()` → `MoneyBuilder` [Getter]
- `setUnadjustedPaymentDate(Date arg0)` → `PaymentCalculationPeriodBuilder` [Setter]

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
- `setInterimPaymentDates(List arg0)` → `PaymentDateScheduleBuilder` [Setter]
- `getInterimPaymentDates()` → `List` [Getter]
- `getFinalPaymentDate()` → `AdjustableOrRelativeDateBuilder` [Getter]
- `setFinalPaymentDate(AdjustableOrRelativeDate arg0)` → `PaymentDateScheduleBuilder` [Setter]
- `getOrCreateFinalPaymentDate()` → `AdjustableOrRelativeDateBuilder` [Getter]
- `getOrCreateInterimPaymentDates(int arg0)` → `AdjustableRelativeOrPeriodicDatesBuilder` [Getter]

### PaymentDates
**Implements:** `RosettaModelObject` `GlobalKey` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `PaymentDates` [Builder]
- `getPaymentFrequency()` → `Frequency` [Getter]
- `getFirstPaymentDate()` → `Date` [Getter]
- `getPayRelativeTo()` → `PayRelativeToEnum` [Getter]
- `getPaymentDateSchedule()` → `PaymentDateSchedule` [Getter]
- `getPaymentDatesAdjustments()` → `BusinessDayAdjustments` [Getter]
- `getLastRegularPaymentDate()` → `Date` [Getter]
- `getPaymentDaysOffset()` → `Offset` [Getter]
- `getMeta()` → `MetaFields` [Getter]

### PaymentDatesBuilder
**Implements:** `PaymentDates` `RosettaModelObjectBuilder` `GlobalKey$GlobalKeyBuilder` 

**Key Methods:**
- `getOrCreateMeta()` → `MetaFieldsBuilder` [Getter]
- `getPaymentFrequency()` → `FrequencyBuilder` [Getter]
- `setPaymentDatesAdjustments(BusinessDayAdjustments arg0)` → `PaymentDatesBuilder` [Setter]
- `getPaymentDateSchedule()` → `PaymentDateScheduleBuilder` [Getter]
- `getPaymentDatesAdjustments()` → `BusinessDayAdjustmentsBuilder` [Getter]
- `setFirstPaymentDate(Date arg0)` → `PaymentDatesBuilder` [Setter]
- `setLastRegularPaymentDate(Date arg0)` → `PaymentDatesBuilder` [Setter]
- `setPaymentDaysOffset(Offset arg0)` → `PaymentDatesBuilder` [Setter]
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
- `setPriceValue(PriceSchedule arg0)` → `RateScheduleBuilder` [Setter]
- `setPrice(ReferenceWithMetaPriceSchedule arg0)` → `RateScheduleBuilder` [Setter]
- `getPrice()` → `ReferenceWithMetaPriceScheduleBuilder` [Getter]

### ResetDates
**Implements:** `RosettaModelObject` `GlobalKey` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `ResetDates` [Builder]
- `getResetFrequency()` → `ResetFrequency` [Getter]
- `getFinalFixingDate()` → `AdjustableDate` [Getter]
- `getRateCutOffDaysOffset()` → `Offset` [Getter]
- `getFixingDates()` → `RelativeDateOffset` [Getter]
- `getResetDatesAdjustments()` → `BusinessDayAdjustments` [Getter]
- `getInitialFixingDate()` → `InitialFixingDate` [Getter]
- `getResetRelativeTo()` → `ResetRelativeToEnum` [Getter]
- `getCalculationPeriodDatesReference()` → `ReferenceWithMetaCalculationPeriodDates` [Getter]

### ResetDatesBuilder
**Implements:** `ResetDates` `RosettaModelObjectBuilder` `GlobalKey$GlobalKeyBuilder` 

**Key Methods:**
- `getOrCreateMeta()` → `MetaFieldsBuilder` [Getter]
- `getResetFrequency()` → `ResetFrequencyBuilder` [Getter]
- `getFinalFixingDate()` → `AdjustableDateBuilder` [Getter]
- `getRateCutOffDaysOffset()` → `OffsetBuilder` [Getter]
- `getFixingDates()` → `RelativeDateOffsetBuilder` [Getter]
- `getResetDatesAdjustments()` → `BusinessDayAdjustmentsBuilder` [Getter]
- `getInitialFixingDate()` → `InitialFixingDateBuilder` [Getter]
- `getOrCreateFixingDates()` → `RelativeDateOffsetBuilder` [Getter]
- `setInitialFixingDate(InitialFixingDate arg0)` → `ResetDatesBuilder` [Setter]
- `getOrCreateResetFrequency()` → `ResetFrequencyBuilder` [Getter]

### ResetFrequency
**Implements:** `Frequency` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `ResetFrequency` [Builder]
- `getWeeklyRollConvention()` → `WeeklyRollConventionEnum` [Getter]

### ResetFrequencyBuilder
**Implements:** `ResetFrequency` `Frequency$FrequencyBuilder` 

**Key Methods:**
- `setPeriod(PeriodExtendedEnum arg0)` → `ResetFrequencyBuilder` [Setter]
- `setPeriodMultiplier(Integer arg0)` → `ResetFrequencyBuilder` [Setter]
- `setWeeklyRollConvention(WeeklyRollConventionEnum arg0)` → `ResetFrequencyBuilder` [Setter]
- `setMeta(MetaFields arg0)` → `ResetFrequencyBuilder` [Setter]

### StubCalculationPeriodAmount
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `StubCalculationPeriodAmount` [Builder]
- `getFinalStub()` → `StubValue` [Getter]
- `getInitialStub()` → `StubValue` [Getter]
- `getCalculationPeriodDatesReference()` → `ReferenceWithMetaCalculationPeriodDates` [Getter]

### StubCalculationPeriodAmountBuilder
**Implements:** `StubCalculationPeriodAmount` `RosettaModelObjectBuilder` 

**Key Methods:**
- `getFinalStub()` → `StubValueBuilder` [Getter]
- `getInitialStub()` → `StubValueBuilder` [Getter]
- `getOrCreateInitialStub()` → `StubValueBuilder` [Getter]
- `setFinalStub(StubValue arg0)` → `StubCalculationPeriodAmountBuilder` [Setter]
- `getOrCreateFinalStub()` → `StubValueBuilder` [Getter]
- `setInitialStub(StubValue arg0)` → `StubCalculationPeriodAmountBuilder` [Setter]
- `getCalculationPeriodDatesReference()` → `ReferenceWithMetaCalculationPeriodDatesBuilder` [Getter]
- `setCalculationPeriodDatesReference(ReferenceWithMetaCalculationPeriodDates arg0)` → `StubCalculationPeriodAmountBuilder` [Setter]
- `getOrCreateCalculationPeriodDatesReference()` → `ReferenceWithMetaCalculationPeriodDatesBuilder` [Getter]
- `setCalculationPeriodDatesReferenceValue(CalculationPeriodDates arg0)` → `StubCalculationPeriodAmountBuilder` [Setter]

### StubPeriod
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `StubPeriod` [Builder]
- `getFinalStub()` → `StubValue` [Getter]
- `getInitialStub()` → `StubValue` [Getter]
- `getCalculationPeriodDatesReference()` → `ReferenceWithMetaCalculationPeriodDates` [Getter]

### StubPeriodBuilder
**Implements:** `StubPeriod` `RosettaModelObjectBuilder` 

**Key Methods:**
- `getFinalStub()` → `StubValueBuilder` [Getter]
- `getInitialStub()` → `StubValueBuilder` [Getter]
- `getOrCreateInitialStub()` → `StubValueBuilder` [Getter]
- `setFinalStub(StubValue arg0)` → `StubPeriodBuilder` [Setter]
- `getOrCreateFinalStub()` → `StubValueBuilder` [Getter]
- `setInitialStub(StubValue arg0)` → `StubPeriodBuilder` [Setter]
- `getCalculationPeriodDatesReference()` → `ReferenceWithMetaCalculationPeriodDatesBuilder` [Getter]
- `setCalculationPeriodDatesReference(ReferenceWithMetaCalculationPeriodDates arg0)` → `StubPeriodBuilder` [Setter]
- `getOrCreateCalculationPeriodDatesReference()` → `ReferenceWithMetaCalculationPeriodDatesBuilder` [Getter]
- `setCalculationPeriodDatesReferenceValue(CalculationPeriodDates arg0)` → `StubPeriodBuilder` [Setter]

### WeightedAveragingObservation
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `WeightedAveragingObservation` [Builder]
- `getDateTime()` → `ZonedDateTime` [Getter]
- `getWeight()` → `BigDecimal` [Getter]
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
- `setDatedValue(List arg0)` → `AmountScheduleBuilder` [Setter]
- `getOrCreateCurrency(int arg0)` → `FieldWithMetaStringBuilder` [Getter]
- `setCurrencyValue(List arg0)` → `AmountScheduleBuilder` [Setter]

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
- `setSchedule(List arg0)` → `AveragingPeriodBuilder` [Setter]
- `getOrCreateSchedule(int arg0)` → `AveragingScheduleBuilder` [Getter]
- `setMarketDisruptionValue(MarketDisruptionEnum arg0)` → `AveragingPeriodBuilder` [Setter]
- `setMarketDisruption(FieldWithMetaMarketDisruptionEnum arg0)` → `AveragingPeriodBuilder` [Setter]
- `setAveragingObservations(AveragingObservationList arg0)` → `AveragingPeriodBuilder` [Setter]
- `setAveragingDateTimes(DateTimeList arg0)` → `AveragingPeriodBuilder` [Setter]
- `getOrCreateMarketDisruption()` → `FieldWithMetaMarketDisruptionEnumBuilder` [Getter]
- `getOrCreateAveragingObservations()` → `AveragingObservationListBuilder` [Getter]

### AveragingPeriodImpl
**Implements:** `AveragingPeriod` 

**Key Methods:**
- `build()` → `AveragingPeriod` [Builder]
- `getSchedule()` → `List` [Getter]
- `setBuilderFields(AveragingPeriodBuilder arg0)` → `void` [Setter]
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
- `getAdjustedStartDate()` → `Date` [Getter]
- `setAdjustedEndDate(Date arg0)` → `CalculationPeriodBaseBuilder` [Setter]
- `getAdjustedEndDate()` → `Date` [Getter]
- `setAdjustedStartDate(Date arg0)` → `CalculationPeriodBaseBuilder` [Setter]
- `getOrCreateMeta()` → `MetaFieldsBuilder` [Getter]
- `setMeta(MetaFields arg0)` → `CalculationPeriodBaseBuilder` [Setter]
- `getMeta()` → `MetaFieldsBuilder` [Getter]

### CalculationPeriodBaseImpl
**Implements:** `CalculationPeriodBase` 

**Key Methods:**
- `build()` → `CalculationPeriodBase` [Builder]
- `getAdjustedStartDate()` → `Date` [Getter]
- `getAdjustedEndDate()` → `Date` [Getter]
- `setBuilderFields(CalculationPeriodBaseBuilder arg0)` → `void` [Setter]
- `getMeta()` → `MetaFields` [Getter]

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
- `setFixedRate(BigDecimal arg0)` → `CalculationPeriodBuilder` [Setter]
- `getNotionalAmount()` → `BigDecimal` [Getter]
- `getFixedRate()` → `BigDecimal` [Getter]
- `setAdjustedEndDate(Date arg0)` → `CalculationPeriodBuilder` [Setter]
- `setAdjustedStartDate(Date arg0)` → `CalculationPeriodBuilder` [Setter]
- `getDayCountYearFraction()` → `BigDecimal` [Getter]
- `getOrCreateForecastAmount()` → `MoneyBuilder` [Getter]
- `getForecastAmount()` → `MoneyBuilder` [Getter]
- `getFxLinkedNotionalAmount()` → `FxLinkedNotionalAmountBuilder` [Getter]

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
- `getStartDate()` → `Date` [Getter]
- `getDaysInPeriod()` → `Integer` [Getter]
- `getDaysInLeapYearPeriod()` → `Integer` [Getter]
- `getIsFirstPeriod()` → `Boolean` [Getter]
- `getIsLastPeriod()` → `Boolean` [Getter]
- `setStartDate(Date arg0)` → `CalculationPeriodDataBuilder` [Setter]
- `setDaysInLeapYearPeriod(Integer arg0)` → `CalculationPeriodDataBuilder` [Setter]
- `setDaysInPeriod(Integer arg0)` → `CalculationPeriodDataBuilder` [Setter]
- `setIsLastPeriod(Boolean arg0)` → `CalculationPeriodDataBuilder` [Setter]

### CalculationPeriodDataImpl
**Implements:** `CalculationPeriodData` 

**Key Methods:**
- `build()` → `CalculationPeriodData` [Builder]
- `getStartDate()` → `Date` [Getter]
- `getDaysInPeriod()` → `Integer` [Getter]
- `getDaysInLeapYearPeriod()` → `Integer` [Getter]
- `getIsFirstPeriod()` → `Boolean` [Getter]
- `getIsLastPeriod()` → `Boolean` [Getter]
- `getEndDate()` → `Date` [Getter]
- `setBuilderFields(CalculationPeriodDataBuilder arg0)` → `void` [Setter]

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
- `setEffectiveDate(AdjustableOrRelativeDate arg0)` → `CalculationPeriodDatesBuilder` [Setter]
- `getFirstPeriodStartDate()` → `AdjustableOrRelativeDateBuilder` [Getter]
- `getStubPeriodType()` → `StubPeriodTypeEnum` [Getter]
- `getOrCreateTerminationDate()` → `AdjustableOrRelativeDateBuilder` [Getter]
- `getOrCreateEffectiveDate()` → `AdjustableOrRelativeDateBuilder` [Getter]
- `getEffectiveDate()` → `AdjustableOrRelativeDateBuilder` [Getter]
- `getOrCreateMeta()` → `MetaFieldsBuilder` [Getter]
- `setTerminationDate(AdjustableOrRelativeDate arg0)` → `CalculationPeriodDatesBuilder` [Setter]
- `getTerminationDate()` → `AdjustableOrRelativeDateBuilder` [Getter]

### CalculationPeriodDatesImpl
**Implements:** `CalculationPeriodDates` 

**Key Methods:**
- `build()` → `CalculationPeriodDates` [Builder]
- `getFirstPeriodStartDate()` → `AdjustableOrRelativeDate` [Getter]
- `getStubPeriodType()` → `StubPeriodTypeEnum` [Getter]
- `getEffectiveDate()` → `AdjustableOrRelativeDate` [Getter]
- `setBuilderFields(CalculationPeriodDatesBuilder arg0)` → `void` [Setter]
- `getTerminationDate()` → `AdjustableOrRelativeDate` [Getter]
- `getFirstRegularPeriodStartDate()` → `Date` [Getter]
- `getFirstCompoundingPeriodEndDate()` → `Date` [Getter]
- `getCalculationPeriodDatesAdjustments()` → `BusinessDayAdjustments` [Getter]
- `getCalculationPeriodFrequency()` → `CalculationPeriodFrequency` [Getter]

### CalculationPeriodImpl
**Extends:** `CalculationPeriodBase$CalculationPeriodBaseImpl` 
**Implements:** `CalculationPeriod` 

**Key Methods:**
- `build()` → `CalculationPeriod` [Builder]
- `getNotionalAmount()` → `BigDecimal` [Getter]
- `getFixedRate()` → `BigDecimal` [Getter]
- `setBuilderFields(CalculationPeriodBuilder arg0)` → `void` [Setter]
- `getDayCountYearFraction()` → `BigDecimal` [Getter]
- `getForecastAmount()` → `Money` [Getter]
- `getFxLinkedNotionalAmount()` → `FxLinkedNotionalAmount` [Getter]
- `getFloatingRateDefinition()` → `FloatingRateDefinition` [Getter]
- `getUnadjustedStartDate()` → `Date` [Getter]
- `getUnadjustedEndDate()` → `Date` [Getter]

### DateRelativeToCalculationPeriodDatesBuilderImpl
**Implements:** `DateRelativeToCalculationPeriodDates$DateRelativeToCalculationPeriodDatesBuilder` 

**Fields:**
- `List (List) calculationPeriodDatesReference`

**Key Methods:**
- `build()` → `DateRelativeToCalculationPeriodDates` [Builder]
- `getCalculationPeriodDatesReference()` → `List` [Getter]
- `setCalculationPeriodDatesReference(List arg0)` → `DateRelativeToCalculationPeriodDatesBuilder` [Setter]
- `getOrCreateCalculationPeriodDatesReference(int arg0)` → `ReferenceWithMetaCalculationPeriodDatesBuilder` [Getter]
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
- `setPaymentDatesReference(List arg0)` → `DateRelativeToPaymentDatesBuilder` [Setter]
- `getPaymentDatesReference()` → `List` [Getter]
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
- `getBusinessDayConvention()` → `BusinessDayConventionEnum` [Getter]
- `setBusinessDayConvention(BusinessDayConventionEnum arg0)` → `FinalCalculationPeriodDateAdjustmentBuilder` [Setter]
- `getSwapStreamReference()` → `ReferenceWithMetaInterestRatePayoutBuilder` [Getter]
- `setSwapStreamReference(ReferenceWithMetaInterestRatePayout arg0)` → `FinalCalculationPeriodDateAdjustmentBuilder` [Setter]
- `setSwapStreamReferenceValue(InterestRatePayout arg0)` → `FinalCalculationPeriodDateAdjustmentBuilder` [Setter]
- `getOrCreateSwapStreamReference()` → `ReferenceWithMetaInterestRatePayoutBuilder` [Getter]
- `getRelevantUnderlyingDateReference()` → `ReferenceWithMetaAdjustableOrRelativeDatesBuilder` [Getter]
- `getOrCreateRelevantUnderlyingDateReference()` → `ReferenceWithMetaAdjustableOrRelativeDatesBuilder` [Getter]
- `setRelevantUnderlyingDateReferenceValue(AdjustableOrRelativeDates arg0)` → `FinalCalculationPeriodDateAdjustmentBuilder` [Setter]

### FinalCalculationPeriodDateAdjustmentImpl
**Implements:** `FinalCalculationPeriodDateAdjustment` 

**Key Methods:**
- `build()` → `FinalCalculationPeriodDateAdjustment` [Builder]
- `getBusinessDayConvention()` → `BusinessDayConventionEnum` [Getter]
- `getSwapStreamReference()` → `ReferenceWithMetaInterestRatePayout` [Getter]
- `setBuilderFields(FinalCalculationPeriodDateAdjustmentBuilder arg0)` → `void` [Setter]
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
- `getNotionalAmount()` → `BigDecimal` [Getter]
- `getResetDate()` → `Date` [Getter]
- `setNotionalAmount(BigDecimal arg0)` → `FxLinkedNotionalAmountBuilder` [Setter]
- `getObservedFxSpotRate()` → `BigDecimal` [Getter]
- `setObservedFxSpotRate(BigDecimal arg0)` → `FxLinkedNotionalAmountBuilder` [Setter]
- `getAdjustedFxSpotFixingDate()` → `Date` [Getter]
- `setAdjustedFxSpotFixingDate(Date arg0)` → `FxLinkedNotionalAmountBuilder` [Setter]
- `setResetDate(Date arg0)` → `FxLinkedNotionalAmountBuilder` [Setter]

### FxLinkedNotionalAmountImpl
**Implements:** `FxLinkedNotionalAmount` 

**Key Methods:**
- `build()` → `FxLinkedNotionalAmount` [Builder]
- `getNotionalAmount()` → `BigDecimal` [Getter]
- `getResetDate()` → `Date` [Getter]
- `setBuilderFields(FxLinkedNotionalAmountBuilder arg0)` → `void` [Setter]
- `getObservedFxSpotRate()` → `BigDecimal` [Getter]
- `getAdjustedFxSpotFixingDate()` → `Date` [Getter]

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
- `getOrCreateFxSpotRateSource()` → `FxSpotRateSourceBuilder` [Getter]
- `getOrCreateVaryingNotionalCurrency()` → `FieldWithMetaStringBuilder` [Getter]
- `getOrCreateVaryingNotionalFixingDates()` → `RelativeDateOffsetBuilder` [Getter]
- `getVaryingNotionalFixingDates()` → `RelativeDateOffsetBuilder` [Getter]
- `setVaryingNotionalCurrencyValue(String arg0)` → `FxLinkedNotionalScheduleBuilder` [Setter]
- `setVaryingNotionalFixingDates(RelativeDateOffset arg0)` → `FxLinkedNotionalScheduleBuilder` [Setter]
- `getFxSpotRateSource()` → `FxSpotRateSourceBuilder` [Getter]
- `setFixingTime(BusinessCenterTime arg0)` → `FxLinkedNotionalScheduleBuilder` [Setter]
- `getFixingTime()` → `BusinessCenterTimeBuilder` [Getter]

### FxLinkedNotionalScheduleImpl
**Implements:** `FxLinkedNotionalSchedule` 

**Key Methods:**
- `build()` → `FxLinkedNotionalSchedule` [Builder]
- `setBuilderFields(FxLinkedNotionalScheduleBuilder arg0)` → `void` [Setter]
- `getVaryingNotionalFixingDates()` → `RelativeDateOffset` [Getter]
- `getFxSpotRateSource()` → `FxSpotRateSource` [Getter]
- `getFixingTime()` → `BusinessCenterTime` [Getter]
- `getVaryingNotionalInterimExchangePaymentDates()` → `RelativeDateOffset` [Getter]
- `getVaryingNotionalCurrency()` → `FieldWithMetaString` [Getter]

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
- `getLagDuration()` → `OffsetBuilder` [Getter]
- `getOrCreateLagDuration()` → `OffsetBuilder` [Getter]
- `setLagDuration(Offset arg0)` → `LagBuilder` [Setter]
- `getOrCreateFirstObservationDateOffset()` → `OffsetBuilder` [Getter]
- `setFirstObservationDateOffset(Offset arg0)` → `LagBuilder` [Setter]
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
- `setUnadjustedDate(Date arg0)` → `ObservationDateBuilder` [Setter]
- `setAdjustedDate(Date arg0)` → `ObservationDateBuilder` [Setter]
- `getAdjustedDate()` → `Date` [Getter]
- `getUnadjustedDate()` → `Date` [Getter]
- `getWeight()` → `BigDecimal` [Getter]
- `getOrCreateMeta()` → `MetaFieldsBuilder` [Getter]
- `setObservationReference(String arg0)` → `ObservationDateBuilder` [Setter]
- `getObservationReference()` → `String` [Getter]
- `setWeight(BigDecimal arg0)` → `ObservationDateBuilder` [Setter]

### ObservationDateImpl
**Implements:** `ObservationDate` 

**Key Methods:**
- `build()` → `ObservationDate` [Builder]
- `getAdjustedDate()` → `Date` [Getter]
- `getUnadjustedDate()` → `Date` [Getter]
- `getWeight()` → `BigDecimal` [Getter]
- `setBuilderFields(ObservationDateBuilder arg0)` → `void` [Setter]
- `getObservationReference()` → `String` [Getter]
- `getMeta()` → `MetaFields` [Getter]

### ObservationDatesBuilderImpl
**Implements:** `ObservationDates$ObservationDatesBuilder` 

**Fields:**
- `ObservationScheduleBuilder observationSchedule`
- `PeriodicDatesBuilder periodicSchedule`
- `ParametricDatesBuilder parametricDates`

**Key Methods:**
- `build()` → `ObservationDates` [Builder]
- `getOrCreateParametricDates()` → `ParametricDatesBuilder` [Getter]
- `getObservationSchedule()` → `ObservationScheduleBuilder` [Getter]
- `setPeriodicSchedule(PeriodicDates arg0)` → `ObservationDatesBuilder` [Setter]
- `setObservationSchedule(ObservationSchedule arg0)` → `ObservationDatesBuilder` [Setter]
- `getPeriodicSchedule()` → `PeriodicDatesBuilder` [Getter]
- `getParametricDates()` → `ParametricDatesBuilder` [Getter]
- `setParametricDates(ParametricDates arg0)` → `ObservationDatesBuilder` [Setter]
- `getOrCreatePeriodicSchedule()` → `PeriodicDatesBuilder` [Getter]
- `getOrCreateObservationSchedule()` → `ObservationScheduleBuilder` [Getter]

### ObservationDatesImpl
**Implements:** `ObservationDates` 

**Key Methods:**
- `build()` → `ObservationDates` [Builder]
- `setBuilderFields(ObservationDatesBuilder arg0)` → `void` [Setter]
- `getObservationSchedule()` → `ObservationSchedule` [Getter]
- `getPeriodicSchedule()` → `PeriodicDates` [Getter]
- `getParametricDates()` → `ParametricDates` [Getter]

### ObservationScheduleBuilderImpl
**Implements:** `ObservationSchedule$ObservationScheduleBuilder` 

**Fields:**
- `List (List) observationDate`
- `BusinessDayAdjustmentsBuilder dateAdjustments`

**Key Methods:**
- `build()` → `ObservationSchedule` [Builder]
- `getObservationDate()` → `List` [Getter]
- `setDateAdjustments(BusinessDayAdjustments arg0)` → `ObservationScheduleBuilder` [Setter]
- `getOrCreateDateAdjustments()` → `BusinessDayAdjustmentsBuilder` [Getter]
- `setObservationDate(List arg0)` → `ObservationScheduleBuilder` [Setter]
- `getOrCreateObservationDate(int arg0)` → `ObservationDateBuilder` [Getter]
- `getDateAdjustments()` → `BusinessDayAdjustmentsBuilder` [Getter]

### ObservationScheduleImpl
**Implements:** `ObservationSchedule` 

**Key Methods:**
- `build()` → `ObservationSchedule` [Builder]
- `getObservationDate()` → `List` [Getter]
- `setBuilderFields(ObservationScheduleBuilder arg0)` → `void` [Setter]
- `getDateAdjustments()` → `BusinessDayAdjustments` [Getter]

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
- `getOrCreateObservationTime()` → `BusinessCenterTimeBuilder` [Getter]
- `getOrCreatePrecision()` → `RoundingBuilder` [Getter]
- `setPrecision(Rounding arg0)` → `ObservationTermsBuilder` [Setter]
- `getObservationTime()` → `BusinessCenterTimeBuilder` [Getter]
- `getObservationTimeType()` → `TimeTypeEnum` [Getter]
- `setObservationTime(BusinessCenterTime arg0)` → `ObservationTermsBuilder` [Setter]
- `setInformationSource(FxSpotRateSource arg0)` → `ObservationTermsBuilder` [Setter]
- `getInformationSource()` → `FxSpotRateSourceBuilder` [Getter]
- `setCalculationPeriodDates(CalculationPeriodDates arg0)` → `ObservationTermsBuilder` [Setter]

### ObservationTermsImpl
**Implements:** `ObservationTerms` 

**Key Methods:**
- `build()` → `ObservationTerms` [Builder]
- `getObservationTime()` → `BusinessCenterTime` [Getter]
- `getObservationTimeType()` → `TimeTypeEnum` [Getter]
- `setBuilderFields(ObservationTermsBuilder arg0)` → `void` [Setter]
- `getInformationSource()` → `FxSpotRateSource` [Getter]
- `getNumberOfObservationDates()` → `Integer` [Getter]
- `getPrecision()` → `Rounding` [Getter]
- `getCalculationPeriodDates()` → `CalculationPeriodDates` [Getter]
- `getObservationDates()` → `ObservationDates` [Getter]

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
- `setBusinessCenters(BusinessCenters arg0)` → `ParametricDatesBuilder` [Setter]
- `getOrCreateBusinessCenters()` → `BusinessCentersBuilder` [Getter]
- `getBusinessCenters()` → `BusinessCentersBuilder` [Getter]
- `setDayType(DayTypeEnum arg0)` → `ParametricDatesBuilder` [Setter]
- `getDayType()` → `DayTypeEnum` [Getter]
- `setDayDistribution(DayDistributionEnum arg0)` → `ParametricDatesBuilder` [Setter]
- `getDayDistribution()` → `DayDistributionEnum` [Getter]

### ParametricDatesImpl
**Implements:** `ParametricDates` 

**Key Methods:**
- `build()` → `ParametricDates` [Builder]
- `getDayOfWeek()` → `List` [Getter]
- `getBusinessCenters()` → `BusinessCenters` [Getter]
- `getDayType()` → `DayTypeEnum` [Getter]
- `setBuilderFields(ParametricDatesBuilder arg0)` → `void` [Setter]
- `getDayDistribution()` → `DayDistributionEnum` [Getter]
- `getDayFrequency()` → `BigDecimal` [Getter]
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
- `setCalculationPeriod(List arg0)` → `PaymentCalculationPeriodBuilder` [Setter]
- `getCalculationPeriod()` → `List` [Getter]
- `getOrCreateMeta()` → `MetaFieldsBuilder` [Getter]
- `setAdjustedPaymentDate(Date arg0)` → `PaymentCalculationPeriodBuilder` [Setter]
- `setPresentValueAmount(Money arg0)` → `PaymentCalculationPeriodBuilder` [Setter]
- `getAdjustedPaymentDate()` → `Date` [Getter]
- `getFixedPaymentAmount()` → `MoneyBuilder` [Getter]
- `setFixedPaymentAmount(Money arg0)` → `PaymentCalculationPeriodBuilder` [Setter]
- `setForecastPaymentAmount(Money arg0)` → `PaymentCalculationPeriodBuilder` [Setter]

### PaymentCalculationPeriodImpl
**Implements:** `PaymentCalculationPeriod` 

**Key Methods:**
- `build()` → `PaymentCalculationPeriod` [Builder]
- `getCalculationPeriod()` → `List` [Getter]
- `setBuilderFields(PaymentCalculationPeriodBuilder arg0)` → `void` [Setter]
- `getAdjustedPaymentDate()` → `Date` [Getter]
- `getFixedPaymentAmount()` → `Money` [Getter]
- `getPresentValueAmount()` → `Money` [Getter]
- `getForecastPaymentAmount()` → `Money` [Getter]
- `getUnadjustedPaymentDate()` → `Date` [Getter]
- `getDiscountFactor()` → `BigDecimal` [Getter]
- `getMeta()` → `MetaFields` [Getter]

### PaymentDateScheduleBuilderImpl
**Implements:** `PaymentDateSchedule$PaymentDateScheduleBuilder` 

**Fields:**
- `List (List) interimPaymentDates`
- `AdjustableOrRelativeDateBuilder finalPaymentDate`

**Key Methods:**
- `build()` → `PaymentDateSchedule` [Builder]
- `setInterimPaymentDates(List arg0)` → `PaymentDateScheduleBuilder` [Setter]
- `getInterimPaymentDates()` → `List` [Getter]
- `getFinalPaymentDate()` → `AdjustableOrRelativeDateBuilder` [Getter]
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
- `getPaymentFrequency()` → `FrequencyBuilder` [Getter]
- `getFirstPaymentDate()` → `Date` [Getter]
- `setPaymentDatesAdjustments(BusinessDayAdjustments arg0)` → `PaymentDatesBuilder` [Setter]
- `getPayRelativeTo()` → `PayRelativeToEnum` [Getter]
- `getPaymentDateSchedule()` → `PaymentDateScheduleBuilder` [Getter]
- `getPaymentDatesAdjustments()` → `BusinessDayAdjustmentsBuilder` [Getter]
- `setFirstPaymentDate(Date arg0)` → `PaymentDatesBuilder` [Setter]
- `setLastRegularPaymentDate(Date arg0)` → `PaymentDatesBuilder` [Setter]

### PaymentDatesImpl
**Implements:** `PaymentDates` 

**Key Methods:**
- `build()` → `PaymentDates` [Builder]
- `setBuilderFields(PaymentDatesBuilder arg0)` → `void` [Setter]
- `getPaymentFrequency()` → `Frequency` [Getter]
- `getFirstPaymentDate()` → `Date` [Getter]
- `getPayRelativeTo()` → `PayRelativeToEnum` [Getter]
- `getPaymentDateSchedule()` → `PaymentDateSchedule` [Getter]
- `getPaymentDatesAdjustments()` → `BusinessDayAdjustments` [Getter]
- `getLastRegularPaymentDate()` → `Date` [Getter]
- `getPaymentDaysOffset()` → `Offset` [Getter]
- `getMeta()` → `MetaFields` [Getter]

### RateScheduleBuilderImpl
**Implements:** `RateSchedule$RateScheduleBuilder` 

**Fields:**
- `ReferenceWithMetaPriceScheduleBuilder price`

**Key Methods:**
- `build()` → `RateSchedule` [Builder]
- `getOrCreatePrice()` → `ReferenceWithMetaPriceScheduleBuilder` [Getter]
- `setPriceValue(PriceSchedule arg0)` → `RateScheduleBuilder` [Setter]
- `setPrice(ReferenceWithMetaPriceSchedule arg0)` → `RateScheduleBuilder` [Setter]
- `getPrice()` → `ReferenceWithMetaPriceScheduleBuilder` [Getter]

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
- `getResetFrequency()` → `ResetFrequencyBuilder` [Getter]
- `getFinalFixingDate()` → `AdjustableDateBuilder` [Getter]
- `getRateCutOffDaysOffset()` → `OffsetBuilder` [Getter]
- `getFixingDates()` → `RelativeDateOffsetBuilder` [Getter]
- `getResetDatesAdjustments()` → `BusinessDayAdjustmentsBuilder` [Getter]
- `getInitialFixingDate()` → `InitialFixingDateBuilder` [Getter]
- `getResetRelativeTo()` → `ResetRelativeToEnum` [Getter]
- `getOrCreateFixingDates()` → `RelativeDateOffsetBuilder` [Getter]

### ResetDatesImpl
**Implements:** `ResetDates` 

**Key Methods:**
- `build()` → `ResetDates` [Builder]
- `setBuilderFields(ResetDatesBuilder arg0)` → `void` [Setter]
- `getResetFrequency()` → `ResetFrequency` [Getter]
- `getFinalFixingDate()` → `AdjustableDate` [Getter]
- `getRateCutOffDaysOffset()` → `Offset` [Getter]
- `getFixingDates()` → `RelativeDateOffset` [Getter]
- `getResetDatesAdjustments()` → `BusinessDayAdjustments` [Getter]
- `getInitialFixingDate()` → `InitialFixingDate` [Getter]
- `getResetRelativeTo()` → `ResetRelativeToEnum` [Getter]
- `getCalculationPeriodDatesReference()` → `ReferenceWithMetaCalculationPeriodDates` [Getter]

### ResetFrequencyBuilderImpl
**Extends:** `Frequency$FrequencyBuilderImpl` 
**Implements:** `ResetFrequency$ResetFrequencyBuilder` 

**Fields:**
- `WeeklyRollConventionEnum weeklyRollConvention`

**Key Methods:**
- `build()` → `ResetFrequency` [Builder]
- `setPeriod(PeriodExtendedEnum arg0)` → `ResetFrequencyBuilder` [Setter]
- `setPeriodMultiplier(Integer arg0)` → `ResetFrequencyBuilder` [Setter]
- `getWeeklyRollConvention()` → `WeeklyRollConventionEnum` [Getter]
- `setWeeklyRollConvention(WeeklyRollConventionEnum arg0)` → `ResetFrequencyBuilder` [Setter]
- `setMeta(MetaFields arg0)` → `ResetFrequencyBuilder` [Setter]

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
- `getFinalStub()` → `StubValueBuilder` [Getter]
- `getInitialStub()` → `StubValueBuilder` [Getter]
- `getOrCreateInitialStub()` → `StubValueBuilder` [Getter]
- `setFinalStub(StubValue arg0)` → `StubCalculationPeriodAmountBuilder` [Setter]
- `getOrCreateFinalStub()` → `StubValueBuilder` [Getter]
- `setInitialStub(StubValue arg0)` → `StubCalculationPeriodAmountBuilder` [Setter]
- `getCalculationPeriodDatesReference()` → `ReferenceWithMetaCalculationPeriodDatesBuilder` [Getter]
- `setCalculationPeriodDatesReference(ReferenceWithMetaCalculationPeriodDates arg0)` → `StubCalculationPeriodAmountBuilder` [Setter]
- `getOrCreateCalculationPeriodDatesReference()` → `ReferenceWithMetaCalculationPeriodDatesBuilder` [Getter]

### StubCalculationPeriodAmountImpl
**Implements:** `StubCalculationPeriodAmount` 

**Key Methods:**
- `build()` → `StubCalculationPeriodAmount` [Builder]
- `setBuilderFields(StubCalculationPeriodAmountBuilder arg0)` → `void` [Setter]
- `getFinalStub()` → `StubValue` [Getter]
- `getInitialStub()` → `StubValue` [Getter]
- `getCalculationPeriodDatesReference()` → `ReferenceWithMetaCalculationPeriodDates` [Getter]

### StubPeriodBuilderImpl
**Implements:** `StubPeriod$StubPeriodBuilder` 

**Fields:**
- `ReferenceWithMetaCalculationPeriodDatesBuilder calculationPeriodDatesReference`
- `StubValueBuilder initialStub`
- `StubValueBuilder finalStub`

**Key Methods:**
- `build()` → `StubPeriod` [Builder]
- `getFinalStub()` → `StubValueBuilder` [Getter]
- `getInitialStub()` → `StubValueBuilder` [Getter]
- `getOrCreateInitialStub()` → `StubValueBuilder` [Getter]
- `setFinalStub(StubValue arg0)` → `StubPeriodBuilder` [Setter]
- `getOrCreateFinalStub()` → `StubValueBuilder` [Getter]
- `setInitialStub(StubValue arg0)` → `StubPeriodBuilder` [Setter]
- `getCalculationPeriodDatesReference()` → `ReferenceWithMetaCalculationPeriodDatesBuilder` [Getter]
- `setCalculationPeriodDatesReference(ReferenceWithMetaCalculationPeriodDates arg0)` → `StubPeriodBuilder` [Setter]
- `getOrCreateCalculationPeriodDatesReference()` → `ReferenceWithMetaCalculationPeriodDatesBuilder` [Getter]

### StubPeriodImpl
**Implements:** `StubPeriod` 

**Key Methods:**
- `build()` → `StubPeriod` [Builder]
- `setBuilderFields(StubPeriodBuilder arg0)` → `void` [Setter]
- `getFinalStub()` → `StubValue` [Getter]
- `getInitialStub()` → `StubValue` [Getter]
- `getCalculationPeriodDatesReference()` → `ReferenceWithMetaCalculationPeriodDates` [Getter]

### WeightedAveragingObservationBuilderImpl
**Implements:** `WeightedAveragingObservation$WeightedAveragingObservationBuilder` 

**Fields:**
- `ZonedDateTime dateTime`
- `Integer observationNumber`
- `BigDecimal weight`

**Key Methods:**
- `build()` → `WeightedAveragingObservation` [Builder]
- `getDateTime()` → `ZonedDateTime` [Getter]
- `setDateTime(ZonedDateTime arg0)` → `WeightedAveragingObservationBuilder` [Setter]
- `getWeight()` → `BigDecimal` [Getter]
- `getObservationNumber()` → `Integer` [Getter]
- `setObservationNumber(Integer arg0)` → `WeightedAveragingObservationBuilder` [Setter]
- `setWeight(BigDecimal arg0)` → `WeightedAveragingObservationBuilder` [Setter]

### WeightedAveragingObservationImpl
**Implements:** `WeightedAveragingObservation` 

**Key Methods:**
- `build()` → `WeightedAveragingObservation` [Builder]
- `getDateTime()` → `ZonedDateTime` [Getter]
- `getWeight()` → `BigDecimal` [Getter]
- `setBuilderFields(WeightedAveragingObservationBuilder arg0)` → `void` [Setter]
- `getObservationNumber()` → `Integer` [Getter]

