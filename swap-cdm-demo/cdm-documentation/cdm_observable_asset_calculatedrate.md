# Package: cdm.observable.asset.calculatedrate

## Enums

### CalculationMethodEnum
**Values:**
- `Averaging`
- `Compounding`
- `CompoundedIndex`

### CalculationShiftMethodEnum
**Values:**
- `Lookback`
- `ObservationPeriodShift`
- `RateCutOff`
- `NoShift`

### InflationCalculationMethodEnum
**Values:**
- `Ratio`
- `Return`
- `Spread`

### InflationCalculationStyleEnum
**Values:**
- `YearOnYear`
- `ZeroCoupon`

### ObservationPeriodDatesEnum
**Values:**
- `SetInAdvance`
- `Standard`
- `FixingDate`

## Interfaces

### CalculatedRateDetails
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `CalculatedRateDetails` [Builder]
- `getAggregateValue()` → `BigDecimal` [Getter]
- `getObservations()` → `CalculatedRateObservations` [Getter]
- `getCalculatedRate()` → `BigDecimal` [Getter]
- `getWeightedRates()` → `List` [Getter]
- `getCompoundedGrowth()` → `List` [Getter]
- `getGrowthFactor()` → `List` [Getter]
- `getAggregateWeight()` → `BigDecimal` [Getter]

### CalculatedRateDetailsBuilder
**Implements:** `CalculatedRateDetails` `RosettaModelObjectBuilder` 

**Key Methods:**
- `getObservations()` → `CalculatedRateObservationsBuilder` [Getter]
- `setCalculatedRate(BigDecimal arg0)` → `CalculatedRateDetailsBuilder` [Setter]
- `getOrCreateObservations()` → `CalculatedRateObservationsBuilder` [Getter]
- `setObservations(CalculatedRateObservations arg0)` → `CalculatedRateDetailsBuilder` [Setter]
- `setAggregateValue(BigDecimal arg0)` → `CalculatedRateDetailsBuilder` [Setter]
- `setAggregateWeight(BigDecimal arg0)` → `CalculatedRateDetailsBuilder` [Setter]
- `setGrowthFactor(List arg0)` → `CalculatedRateDetailsBuilder` [Setter]
- `setCompoundedGrowth(List arg0)` → `CalculatedRateDetailsBuilder` [Setter]
- `setWeightedRates(List arg0)` → `CalculatedRateDetailsBuilder` [Setter]

### CalculatedRateObservationDatesAndWeights
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `CalculatedRateObservationDatesAndWeights` [Builder]
- `getObservationDates()` → `List` [Getter]
- `getWeights()` → `List` [Getter]

### CalculatedRateObservationDatesAndWeightsBuilder
**Implements:** `CalculatedRateObservationDatesAndWeights` `RosettaModelObjectBuilder` 

**Key Methods:**
- `setObservationDates(List arg0)` → `CalculatedRateObservationDatesAndWeightsBuilder` [Setter]
- `setWeights(List arg0)` → `CalculatedRateObservationDatesAndWeightsBuilder` [Setter]

### CalculatedRateObservations
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `CalculatedRateObservations` [Builder]
- `getObservationDates()` → `List` [Getter]
- `getObservedRates()` → `List` [Getter]
- `getProcessedRates()` → `List` [Getter]
- `getWeights()` → `List` [Getter]

### CalculatedRateObservationsBuilder
**Implements:** `CalculatedRateObservations` `RosettaModelObjectBuilder` 

**Key Methods:**
- `setObservationDates(List arg0)` → `CalculatedRateObservationsBuilder` [Setter]
- `setObservedRates(List arg0)` → `CalculatedRateObservationsBuilder` [Setter]
- `setProcessedRates(List arg0)` → `CalculatedRateObservationsBuilder` [Setter]
- `setWeights(List arg0)` → `CalculatedRateObservationsBuilder` [Setter]

### FallbackRateParameters
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `FallbackRateParameters` [Builder]
- `getCalculationParameters()` → `FloatingRateCalculationParameters` [Getter]
- `getFloatingRateIndex()` → `FloatingRateIndexEnum` [Getter]
- `getEffectiveDate()` → `Date` [Getter]
- `getSpreadAdjustment()` → `BigDecimal` [Getter]

### FallbackRateParametersBuilder
**Implements:** `FallbackRateParameters` `RosettaModelObjectBuilder` 

**Key Methods:**
- `setEffectiveDate(Date arg0)` → `FallbackRateParametersBuilder` [Setter]
- `getCalculationParameters()` → `FloatingRateCalculationParametersBuilder` [Getter]
- `setFloatingRateIndex(FloatingRateIndexEnum arg0)` → `FallbackRateParametersBuilder` [Setter]
- `setCalculationParameters(FloatingRateCalculationParameters arg0)` → `FallbackRateParametersBuilder` [Setter]
- `getOrCreateCalculationParameters()` → `FloatingRateCalculationParametersBuilder` [Getter]
- `setSpreadAdjustment(BigDecimal arg0)` → `FallbackRateParametersBuilder` [Setter]

### FloatingRateCalculationParameters
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `FloatingRateCalculationParameters` [Builder]
- `getCalculationMethod()` → `CalculationMethodEnum` [Getter]
- `getLookbackCalculation()` → `OffsetCalculation` [Getter]
- `getObservationParameters()` → `ObservationParameters` [Getter]
- `getLockoutCalculation()` → `OffsetCalculation` [Getter]
- `getApplicableBusinessDays()` → `BusinessCenters` [Getter]
- `getObservationShiftCalculation()` → `ObservationShiftCalculation` [Getter]

### FloatingRateCalculationParametersBuilder
**Implements:** `FloatingRateCalculationParameters` `RosettaModelObjectBuilder` 

**Key Methods:**
- `setCalculationMethod(CalculationMethodEnum arg0)` → `FloatingRateCalculationParametersBuilder` [Setter]
- `getLookbackCalculation()` → `OffsetCalculationBuilder` [Getter]
- `getObservationParameters()` → `ObservationParametersBuilder` [Getter]
- `getLockoutCalculation()` → `OffsetCalculationBuilder` [Getter]
- `getApplicableBusinessDays()` → `BusinessCentersBuilder` [Getter]
- `getObservationShiftCalculation()` → `ObservationShiftCalculationBuilder` [Getter]
- `getOrCreateLockoutCalculation()` → `OffsetCalculationBuilder` [Getter]
- `getOrCreateApplicableBusinessDays()` → `BusinessCentersBuilder` [Getter]
- `getOrCreateLookbackCalculation()` → `OffsetCalculationBuilder` [Getter]
- `getOrCreateObservationParameters()` → `ObservationParametersBuilder` [Getter]

### ObservationParameters
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `ObservationParameters` [Builder]
- `getObservationFloorRate()` → `BigDecimal` [Getter]
- `getObservationCapRate()` → `BigDecimal` [Getter]

### ObservationParametersBuilder
**Implements:** `ObservationParameters` `RosettaModelObjectBuilder` 

**Key Methods:**
- `setObservationCapRate(BigDecimal arg0)` → `ObservationParametersBuilder` [Setter]
- `setObservationFloorRate(BigDecimal arg0)` → `ObservationParametersBuilder` [Setter]

### ObservationShiftCalculation
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `ObservationShiftCalculation` [Builder]
- `getAdditionalBusinessDays()` → `BusinessCenters` [Getter]
- `getCalculationBase()` → `ObservationPeriodDatesEnum` [Getter]
- `getOffsetDays()` → `Integer` [Getter]

### ObservationShiftCalculationBuilder
**Implements:** `ObservationShiftCalculation` `RosettaModelObjectBuilder` 

**Key Methods:**
- `getOrCreateAdditionalBusinessDays()` → `BusinessCentersBuilder` [Getter]
- `setOffsetDays(Integer arg0)` → `ObservationShiftCalculationBuilder` [Setter]
- `getAdditionalBusinessDays()` → `BusinessCentersBuilder` [Getter]
- `setCalculationBase(ObservationPeriodDatesEnum arg0)` → `ObservationShiftCalculationBuilder` [Setter]
- `setAdditionalBusinessDays(BusinessCenters arg0)` → `ObservationShiftCalculationBuilder` [Setter]

### OffsetCalculation
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `OffsetCalculation` [Builder]
- `getOffsetDays()` → `Integer` [Getter]

### OffsetCalculationBuilder
**Implements:** `OffsetCalculation` `RosettaModelObjectBuilder` 

**Key Methods:**
- `setOffsetDays(Integer arg0)` → `OffsetCalculationBuilder` [Setter]

## Concrete Classes

### CalculatedRateDetailsBuilderImpl
**Implements:** `CalculatedRateDetails$CalculatedRateDetailsBuilder` 

**Fields:**
- `CalculatedRateObservationsBuilder observations`
- `List (List) weightedRates`
- `List (List) growthFactor`
- `List (List) compoundedGrowth`
- `BigDecimal aggregateValue`
- `BigDecimal aggregateWeight`
- `BigDecimal calculatedRate`

**Key Methods:**
- `build()` → `CalculatedRateDetails` [Builder]
- `getAggregateValue()` → `BigDecimal` [Getter]
- `getObservations()` → `CalculatedRateObservationsBuilder` [Getter]
- `getCalculatedRate()` → `BigDecimal` [Getter]
- `setCalculatedRate(BigDecimal arg0)` → `CalculatedRateDetailsBuilder` [Setter]
- `getOrCreateObservations()` → `CalculatedRateObservationsBuilder` [Getter]
- `setObservations(CalculatedRateObservations arg0)` → `CalculatedRateDetailsBuilder` [Setter]
- `setAggregateValue(BigDecimal arg0)` → `CalculatedRateDetailsBuilder` [Setter]
- `getWeightedRates()` → `List` [Getter]
- `getCompoundedGrowth()` → `List` [Getter]

### CalculatedRateDetailsImpl
**Implements:** `CalculatedRateDetails` 

**Key Methods:**
- `build()` → `CalculatedRateDetails` [Builder]
- `getAggregateValue()` → `BigDecimal` [Getter]
- `getObservations()` → `CalculatedRateObservations` [Getter]
- `setBuilderFields(CalculatedRateDetailsBuilder arg0)` → `void` [Setter]
- `getCalculatedRate()` → `BigDecimal` [Getter]
- `getWeightedRates()` → `List` [Getter]
- `getCompoundedGrowth()` → `List` [Getter]
- `getGrowthFactor()` → `List` [Getter]
- `getAggregateWeight()` → `BigDecimal` [Getter]

### CalculatedRateObservationDatesAndWeightsBuilderImpl
**Implements:** `CalculatedRateObservationDatesAndWeights$CalculatedRateObservationDatesAndWeightsBuilder` 

**Fields:**
- `List (List) observationDates`
- `List (List) weights`

**Key Methods:**
- `build()` → `CalculatedRateObservationDatesAndWeights` [Builder]
- `setObservationDates(List arg0)` → `CalculatedRateObservationDatesAndWeightsBuilder` [Setter]
- `getObservationDates()` → `List` [Getter]
- `getWeights()` → `List` [Getter]
- `setWeights(List arg0)` → `CalculatedRateObservationDatesAndWeightsBuilder` [Setter]

### CalculatedRateObservationDatesAndWeightsImpl
**Implements:** `CalculatedRateObservationDatesAndWeights` 

**Key Methods:**
- `build()` → `CalculatedRateObservationDatesAndWeights` [Builder]
- `setBuilderFields(CalculatedRateObservationDatesAndWeightsBuilder arg0)` → `void` [Setter]
- `getObservationDates()` → `List` [Getter]
- `getWeights()` → `List` [Getter]

### CalculatedRateObservationsBuilderImpl
**Implements:** `CalculatedRateObservations$CalculatedRateObservationsBuilder` 

**Fields:**
- `List (List) observationDates`
- `List (List) weights`
- `List (List) observedRates`
- `List (List) processedRates`

**Key Methods:**
- `build()` → `CalculatedRateObservations` [Builder]
- `setObservationDates(List arg0)` → `CalculatedRateObservationsBuilder` [Setter]
- `getObservationDates()` → `List` [Getter]
- `getObservedRates()` → `List` [Getter]
- `getProcessedRates()` → `List` [Getter]
- `setObservedRates(List arg0)` → `CalculatedRateObservationsBuilder` [Setter]
- `setProcessedRates(List arg0)` → `CalculatedRateObservationsBuilder` [Setter]
- `getWeights()` → `List` [Getter]
- `setWeights(List arg0)` → `CalculatedRateObservationsBuilder` [Setter]

### CalculatedRateObservationsImpl
**Implements:** `CalculatedRateObservations` 

**Key Methods:**
- `build()` → `CalculatedRateObservations` [Builder]
- `setBuilderFields(CalculatedRateObservationsBuilder arg0)` → `void` [Setter]
- `getObservationDates()` → `List` [Getter]
- `getObservedRates()` → `List` [Getter]
- `getProcessedRates()` → `List` [Getter]
- `getWeights()` → `List` [Getter]

### FallbackRateParametersBuilderImpl
**Implements:** `FallbackRateParameters$FallbackRateParametersBuilder` 

**Fields:**
- `FloatingRateIndexEnum floatingRateIndex`
- `Date effectiveDate`
- `FloatingRateCalculationParametersBuilder calculationParameters`
- `BigDecimal spreadAdjustment`

**Key Methods:**
- `build()` → `FallbackRateParameters` [Builder]
- `setEffectiveDate(Date arg0)` → `FallbackRateParametersBuilder` [Setter]
- `getCalculationParameters()` → `FloatingRateCalculationParametersBuilder` [Getter]
- `getFloatingRateIndex()` → `FloatingRateIndexEnum` [Getter]
- `setFloatingRateIndex(FloatingRateIndexEnum arg0)` → `FallbackRateParametersBuilder` [Setter]
- `getEffectiveDate()` → `Date` [Getter]
- `setCalculationParameters(FloatingRateCalculationParameters arg0)` → `FallbackRateParametersBuilder` [Setter]
- `getSpreadAdjustment()` → `BigDecimal` [Getter]
- `getOrCreateCalculationParameters()` → `FloatingRateCalculationParametersBuilder` [Getter]
- `setSpreadAdjustment(BigDecimal arg0)` → `FallbackRateParametersBuilder` [Setter]

### FallbackRateParametersImpl
**Implements:** `FallbackRateParameters` 

**Key Methods:**
- `build()` → `FallbackRateParameters` [Builder]
- `getCalculationParameters()` → `FloatingRateCalculationParameters` [Getter]
- `getFloatingRateIndex()` → `FloatingRateIndexEnum` [Getter]
- `getEffectiveDate()` → `Date` [Getter]
- `setBuilderFields(FallbackRateParametersBuilder arg0)` → `void` [Setter]
- `getSpreadAdjustment()` → `BigDecimal` [Getter]

### FloatingRateCalculationParametersBuilderImpl
**Implements:** `FloatingRateCalculationParameters$FloatingRateCalculationParametersBuilder` 

**Fields:**
- `CalculationMethodEnum calculationMethod`
- `ObservationShiftCalculationBuilder observationShiftCalculation`
- `OffsetCalculationBuilder lookbackCalculation`
- `OffsetCalculationBuilder lockoutCalculation`
- `BusinessCentersBuilder applicableBusinessDays`
- `ObservationParametersBuilder observationParameters`

**Key Methods:**
- `build()` → `FloatingRateCalculationParameters` [Builder]
- `getCalculationMethod()` → `CalculationMethodEnum` [Getter]
- `setCalculationMethod(CalculationMethodEnum arg0)` → `FloatingRateCalculationParametersBuilder` [Setter]
- `getLookbackCalculation()` → `OffsetCalculationBuilder` [Getter]
- `getObservationParameters()` → `ObservationParametersBuilder` [Getter]
- `getLockoutCalculation()` → `OffsetCalculationBuilder` [Getter]
- `getApplicableBusinessDays()` → `BusinessCentersBuilder` [Getter]
- `getObservationShiftCalculation()` → `ObservationShiftCalculationBuilder` [Getter]
- `getOrCreateLockoutCalculation()` → `OffsetCalculationBuilder` [Getter]
- `getOrCreateApplicableBusinessDays()` → `BusinessCentersBuilder` [Getter]

### FloatingRateCalculationParametersImpl
**Implements:** `FloatingRateCalculationParameters` 

**Key Methods:**
- `build()` → `FloatingRateCalculationParameters` [Builder]
- `getCalculationMethod()` → `CalculationMethodEnum` [Getter]
- `setBuilderFields(FloatingRateCalculationParametersBuilder arg0)` → `void` [Setter]
- `getLookbackCalculation()` → `OffsetCalculation` [Getter]
- `getObservationParameters()` → `ObservationParameters` [Getter]
- `getLockoutCalculation()` → `OffsetCalculation` [Getter]
- `getApplicableBusinessDays()` → `BusinessCenters` [Getter]
- `getObservationShiftCalculation()` → `ObservationShiftCalculation` [Getter]

### ObservationParametersBuilderImpl
**Implements:** `ObservationParameters$ObservationParametersBuilder` 

**Fields:**
- `BigDecimal observationCapRate`
- `BigDecimal observationFloorRate`

**Key Methods:**
- `build()` → `ObservationParameters` [Builder]
- `getObservationFloorRate()` → `BigDecimal` [Getter]
- `getObservationCapRate()` → `BigDecimal` [Getter]
- `setObservationCapRate(BigDecimal arg0)` → `ObservationParametersBuilder` [Setter]
- `setObservationFloorRate(BigDecimal arg0)` → `ObservationParametersBuilder` [Setter]

### ObservationParametersImpl
**Implements:** `ObservationParameters` 

**Key Methods:**
- `build()` → `ObservationParameters` [Builder]
- `setBuilderFields(ObservationParametersBuilder arg0)` → `void` [Setter]
- `getObservationFloorRate()` → `BigDecimal` [Getter]
- `getObservationCapRate()` → `BigDecimal` [Getter]

### ObservationShiftCalculationBuilderImpl
**Implements:** `ObservationShiftCalculation$ObservationShiftCalculationBuilder` 

**Fields:**
- `Integer offsetDays`
- `ObservationPeriodDatesEnum calculationBase`
- `BusinessCentersBuilder additionalBusinessDays`

**Key Methods:**
- `build()` → `ObservationShiftCalculation` [Builder]
- `getOrCreateAdditionalBusinessDays()` → `BusinessCentersBuilder` [Getter]
- `setOffsetDays(Integer arg0)` → `ObservationShiftCalculationBuilder` [Setter]
- `getAdditionalBusinessDays()` → `BusinessCentersBuilder` [Getter]
- `getCalculationBase()` → `ObservationPeriodDatesEnum` [Getter]
- `getOffsetDays()` → `Integer` [Getter]
- `setCalculationBase(ObservationPeriodDatesEnum arg0)` → `ObservationShiftCalculationBuilder` [Setter]
- `setAdditionalBusinessDays(BusinessCenters arg0)` → `ObservationShiftCalculationBuilder` [Setter]

### ObservationShiftCalculationImpl
**Implements:** `ObservationShiftCalculation` 

**Key Methods:**
- `build()` → `ObservationShiftCalculation` [Builder]
- `setBuilderFields(ObservationShiftCalculationBuilder arg0)` → `void` [Setter]
- `getAdditionalBusinessDays()` → `BusinessCenters` [Getter]
- `getCalculationBase()` → `ObservationPeriodDatesEnum` [Getter]
- `getOffsetDays()` → `Integer` [Getter]

### OffsetCalculationBuilderImpl
**Implements:** `OffsetCalculation$OffsetCalculationBuilder` 

**Fields:**
- `Integer offsetDays`

**Key Methods:**
- `build()` → `OffsetCalculation` [Builder]
- `setOffsetDays(Integer arg0)` → `OffsetCalculationBuilder` [Setter]
- `getOffsetDays()` → `Integer` [Getter]

### OffsetCalculationImpl
**Implements:** `OffsetCalculation` 

**Key Methods:**
- `build()` → `OffsetCalculation` [Builder]
- `setBuilderFields(OffsetCalculationBuilder arg0)` → `void` [Setter]
- `getOffsetDays()` → `Integer` [Getter]

