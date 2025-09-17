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
- `getObservations()` → `CalculatedRateObservations` [Getter]
- `getAggregateValue()` → `BigDecimal` [Getter]
- `getCalculatedRate()` → `BigDecimal` [Getter]
- `getGrowthFactor()` → `List` [Getter]
- `getCompoundedGrowth()` → `List` [Getter]
- `getWeightedRates()` → `List` [Getter]
- `getAggregateWeight()` → `BigDecimal` [Getter]

### CalculatedRateDetailsBuilder
**Implements:** `CalculatedRateDetails` `RosettaModelObjectBuilder` 

**Key Methods:**
- `getObservations()` → `CalculatedRateObservationsBuilder` [Getter]
- `setObservations(CalculatedRateObservations arg0)` → `CalculatedRateDetailsBuilder` [Setter]
- `getOrCreateObservations()` → `CalculatedRateObservationsBuilder` [Getter]
- `setCalculatedRate(BigDecimal arg0)` → `CalculatedRateDetailsBuilder` [Setter]
- `setCompoundedGrowth(List arg0)` → `CalculatedRateDetailsBuilder` [Setter]
- `setWeightedRates(List arg0)` → `CalculatedRateDetailsBuilder` [Setter]
- `setAggregateWeight(BigDecimal arg0)` → `CalculatedRateDetailsBuilder` [Setter]
- `setGrowthFactor(List arg0)` → `CalculatedRateDetailsBuilder` [Setter]
- `setAggregateValue(BigDecimal arg0)` → `CalculatedRateDetailsBuilder` [Setter]

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
- `setProcessedRates(List arg0)` → `CalculatedRateObservationsBuilder` [Setter]
- `setObservedRates(List arg0)` → `CalculatedRateObservationsBuilder` [Setter]
- `setWeights(List arg0)` → `CalculatedRateObservationsBuilder` [Setter]

### FallbackRateParameters
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `FallbackRateParameters` [Builder]
- `getEffectiveDate()` → `Date` [Getter]
- `getSpreadAdjustment()` → `BigDecimal` [Getter]
- `getCalculationParameters()` → `FloatingRateCalculationParameters` [Getter]
- `getFloatingRateIndex()` → `FloatingRateIndexEnum` [Getter]

### FallbackRateParametersBuilder
**Implements:** `FallbackRateParameters` `RosettaModelObjectBuilder` 

**Key Methods:**
- `setCalculationParameters(FloatingRateCalculationParameters arg0)` → `FallbackRateParametersBuilder` [Setter]
- `getOrCreateCalculationParameters()` → `FloatingRateCalculationParametersBuilder` [Getter]
- `getCalculationParameters()` → `FloatingRateCalculationParametersBuilder` [Getter]
- `setEffectiveDate(Date arg0)` → `FallbackRateParametersBuilder` [Setter]
- `setSpreadAdjustment(BigDecimal arg0)` → `FallbackRateParametersBuilder` [Setter]
- `setFloatingRateIndex(FloatingRateIndexEnum arg0)` → `FallbackRateParametersBuilder` [Setter]

### FloatingRateCalculationParameters
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `FloatingRateCalculationParameters` [Builder]
- `getCalculationMethod()` → `CalculationMethodEnum` [Getter]
- `getLookbackCalculation()` → `OffsetCalculation` [Getter]
- `getApplicableBusinessDays()` → `BusinessCenters` [Getter]
- `getLockoutCalculation()` → `OffsetCalculation` [Getter]
- `getObservationParameters()` → `ObservationParameters` [Getter]
- `getObservationShiftCalculation()` → `ObservationShiftCalculation` [Getter]

### FloatingRateCalculationParametersBuilder
**Implements:** `FloatingRateCalculationParameters` `RosettaModelObjectBuilder` 

**Key Methods:**
- `getLookbackCalculation()` → `OffsetCalculationBuilder` [Getter]
- `getApplicableBusinessDays()` → `BusinessCentersBuilder` [Getter]
- `getLockoutCalculation()` → `OffsetCalculationBuilder` [Getter]
- `getObservationParameters()` → `ObservationParametersBuilder` [Getter]
- `getObservationShiftCalculation()` → `ObservationShiftCalculationBuilder` [Getter]
- `setApplicableBusinessDays(BusinessCenters arg0)` → `FloatingRateCalculationParametersBuilder` [Setter]
- `setCalculationMethod(CalculationMethodEnum arg0)` → `FloatingRateCalculationParametersBuilder` [Setter]
- `setLookbackCalculation(OffsetCalculation arg0)` → `FloatingRateCalculationParametersBuilder` [Setter]
- `setObservationParameters(ObservationParameters arg0)` → `FloatingRateCalculationParametersBuilder` [Setter]
- `setLockoutCalculation(OffsetCalculation arg0)` → `FloatingRateCalculationParametersBuilder` [Setter]

### ObservationParameters
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `ObservationParameters` [Builder]
- `getObservationCapRate()` → `BigDecimal` [Getter]
- `getObservationFloorRate()` → `BigDecimal` [Getter]

### ObservationParametersBuilder
**Implements:** `ObservationParameters` `RosettaModelObjectBuilder` 

**Key Methods:**
- `setObservationFloorRate(BigDecimal arg0)` → `ObservationParametersBuilder` [Setter]
- `setObservationCapRate(BigDecimal arg0)` → `ObservationParametersBuilder` [Setter]

### ObservationShiftCalculation
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `ObservationShiftCalculation` [Builder]
- `getCalculationBase()` → `ObservationPeriodDatesEnum` [Getter]
- `getAdditionalBusinessDays()` → `BusinessCenters` [Getter]
- `getOffsetDays()` → `Integer` [Getter]

### ObservationShiftCalculationBuilder
**Implements:** `ObservationShiftCalculation` `RosettaModelObjectBuilder` 

**Key Methods:**
- `getAdditionalBusinessDays()` → `BusinessCentersBuilder` [Getter]
- `setOffsetDays(Integer arg0)` → `ObservationShiftCalculationBuilder` [Setter]
- `setCalculationBase(ObservationPeriodDatesEnum arg0)` → `ObservationShiftCalculationBuilder` [Setter]
- `setAdditionalBusinessDays(BusinessCenters arg0)` → `ObservationShiftCalculationBuilder` [Setter]
- `getOrCreateAdditionalBusinessDays()` → `BusinessCentersBuilder` [Getter]

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
- `getObservations()` → `CalculatedRateObservationsBuilder` [Getter]
- `getAggregateValue()` → `BigDecimal` [Getter]
- `setObservations(CalculatedRateObservations arg0)` → `CalculatedRateDetailsBuilder` [Setter]
- `getOrCreateObservations()` → `CalculatedRateObservationsBuilder` [Getter]
- `setCalculatedRate(BigDecimal arg0)` → `CalculatedRateDetailsBuilder` [Setter]
- `getCalculatedRate()` → `BigDecimal` [Getter]
- `getGrowthFactor()` → `List` [Getter]
- `getCompoundedGrowth()` → `List` [Getter]
- `getWeightedRates()` → `List` [Getter]

### CalculatedRateDetailsImpl
**Implements:** `CalculatedRateDetails` 

**Key Methods:**
- `build()` → `CalculatedRateDetails` [Builder]
- `setBuilderFields(CalculatedRateDetailsBuilder arg0)` → `void` [Setter]
- `getObservations()` → `CalculatedRateObservations` [Getter]
- `getAggregateValue()` → `BigDecimal` [Getter]
- `getCalculatedRate()` → `BigDecimal` [Getter]
- `getGrowthFactor()` → `List` [Getter]
- `getCompoundedGrowth()` → `List` [Getter]
- `getWeightedRates()` → `List` [Getter]
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
- `setProcessedRates(List arg0)` → `CalculatedRateObservationsBuilder` [Setter]
- `getObservedRates()` → `List` [Getter]
- `setObservedRates(List arg0)` → `CalculatedRateObservationsBuilder` [Setter]
- `getProcessedRates()` → `List` [Getter]
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
- `getEffectiveDate()` → `Date` [Getter]
- `getSpreadAdjustment()` → `BigDecimal` [Getter]
- `setCalculationParameters(FloatingRateCalculationParameters arg0)` → `FallbackRateParametersBuilder` [Setter]
- `getOrCreateCalculationParameters()` → `FloatingRateCalculationParametersBuilder` [Getter]
- `getCalculationParameters()` → `FloatingRateCalculationParametersBuilder` [Getter]
- `setEffectiveDate(Date arg0)` → `FallbackRateParametersBuilder` [Setter]
- `setSpreadAdjustment(BigDecimal arg0)` → `FallbackRateParametersBuilder` [Setter]
- `getFloatingRateIndex()` → `FloatingRateIndexEnum` [Getter]
- `setFloatingRateIndex(FloatingRateIndexEnum arg0)` → `FallbackRateParametersBuilder` [Setter]

### FallbackRateParametersImpl
**Implements:** `FallbackRateParameters` 

**Key Methods:**
- `build()` → `FallbackRateParameters` [Builder]
- `setBuilderFields(FallbackRateParametersBuilder arg0)` → `void` [Setter]
- `getEffectiveDate()` → `Date` [Getter]
- `getSpreadAdjustment()` → `BigDecimal` [Getter]
- `getCalculationParameters()` → `FloatingRateCalculationParameters` [Getter]
- `getFloatingRateIndex()` → `FloatingRateIndexEnum` [Getter]

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
- `getLookbackCalculation()` → `OffsetCalculationBuilder` [Getter]
- `getApplicableBusinessDays()` → `BusinessCentersBuilder` [Getter]
- `getLockoutCalculation()` → `OffsetCalculationBuilder` [Getter]
- `getObservationParameters()` → `ObservationParametersBuilder` [Getter]
- `getObservationShiftCalculation()` → `ObservationShiftCalculationBuilder` [Getter]
- `setApplicableBusinessDays(BusinessCenters arg0)` → `FloatingRateCalculationParametersBuilder` [Setter]
- `setCalculationMethod(CalculationMethodEnum arg0)` → `FloatingRateCalculationParametersBuilder` [Setter]
- `setLookbackCalculation(OffsetCalculation arg0)` → `FloatingRateCalculationParametersBuilder` [Setter]

### FloatingRateCalculationParametersImpl
**Implements:** `FloatingRateCalculationParameters` 

**Key Methods:**
- `build()` → `FloatingRateCalculationParameters` [Builder]
- `setBuilderFields(FloatingRateCalculationParametersBuilder arg0)` → `void` [Setter]
- `getCalculationMethod()` → `CalculationMethodEnum` [Getter]
- `getLookbackCalculation()` → `OffsetCalculation` [Getter]
- `getApplicableBusinessDays()` → `BusinessCenters` [Getter]
- `getLockoutCalculation()` → `OffsetCalculation` [Getter]
- `getObservationParameters()` → `ObservationParameters` [Getter]
- `getObservationShiftCalculation()` → `ObservationShiftCalculation` [Getter]

### ObservationParametersBuilderImpl
**Implements:** `ObservationParameters$ObservationParametersBuilder` 

**Fields:**
- `BigDecimal observationCapRate`
- `BigDecimal observationFloorRate`

**Key Methods:**
- `build()` → `ObservationParameters` [Builder]
- `getObservationCapRate()` → `BigDecimal` [Getter]
- `getObservationFloorRate()` → `BigDecimal` [Getter]
- `setObservationFloorRate(BigDecimal arg0)` → `ObservationParametersBuilder` [Setter]
- `setObservationCapRate(BigDecimal arg0)` → `ObservationParametersBuilder` [Setter]

### ObservationParametersImpl
**Implements:** `ObservationParameters` 

**Key Methods:**
- `build()` → `ObservationParameters` [Builder]
- `setBuilderFields(ObservationParametersBuilder arg0)` → `void` [Setter]
- `getObservationCapRate()` → `BigDecimal` [Getter]
- `getObservationFloorRate()` → `BigDecimal` [Getter]

### ObservationShiftCalculationBuilderImpl
**Implements:** `ObservationShiftCalculation$ObservationShiftCalculationBuilder` 

**Fields:**
- `Integer offsetDays`
- `ObservationPeriodDatesEnum calculationBase`
- `BusinessCentersBuilder additionalBusinessDays`

**Key Methods:**
- `build()` → `ObservationShiftCalculation` [Builder]
- `getCalculationBase()` → `ObservationPeriodDatesEnum` [Getter]
- `getAdditionalBusinessDays()` → `BusinessCentersBuilder` [Getter]
- `getOffsetDays()` → `Integer` [Getter]
- `setOffsetDays(Integer arg0)` → `ObservationShiftCalculationBuilder` [Setter]
- `setCalculationBase(ObservationPeriodDatesEnum arg0)` → `ObservationShiftCalculationBuilder` [Setter]
- `setAdditionalBusinessDays(BusinessCenters arg0)` → `ObservationShiftCalculationBuilder` [Setter]
- `getOrCreateAdditionalBusinessDays()` → `BusinessCentersBuilder` [Getter]

### ObservationShiftCalculationImpl
**Implements:** `ObservationShiftCalculation` 

**Key Methods:**
- `build()` → `ObservationShiftCalculation` [Builder]
- `setBuilderFields(ObservationShiftCalculationBuilder arg0)` → `void` [Setter]
- `getCalculationBase()` → `ObservationPeriodDatesEnum` [Getter]
- `getAdditionalBusinessDays()` → `BusinessCenters` [Getter]
- `getOffsetDays()` → `Integer` [Getter]

### OffsetCalculationBuilderImpl
**Implements:** `OffsetCalculation$OffsetCalculationBuilder` 

**Fields:**
- `Integer offsetDays`

**Key Methods:**
- `build()` → `OffsetCalculation` [Builder]
- `getOffsetDays()` → `Integer` [Getter]
- `setOffsetDays(Integer arg0)` → `OffsetCalculationBuilder` [Setter]

### OffsetCalculationImpl
**Implements:** `OffsetCalculation` 

**Key Methods:**
- `build()` → `OffsetCalculation` [Builder]
- `setBuilderFields(OffsetCalculationBuilder arg0)` → `void` [Setter]
- `getOffsetDays()` → `Integer` [Getter]

