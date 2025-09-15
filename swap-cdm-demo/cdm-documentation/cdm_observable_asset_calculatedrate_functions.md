# Package: cdm.observable.asset.calculatedrate.functions

## Abstract Classes

### ApplyAveragingFormula
**Implements:** `RosettaFunction` 

**Fields:**
- `ModelObjectValidator objectValidator`
- `VectorOperation vectorOperation`

### ApplyCompoundingFormula
**Implements:** `RosettaFunction` 

**Fields:**
- `ModelObjectValidator objectValidator`
- `VectorGrowthOperation vectorGrowthOperation`
- `VectorOperation vectorOperation`
- `VectorScalarOperation vectorScalarOperation`

### ComputeCalculationPeriodFIXING_DATE
**Implements:** `RosettaFunction` 

**Fields:**
- `ModelObjectValidator objectValidator`
- `AddBusinessDays addBusinessDays`
- `GetAllBusinessCenters getAllBusinessCenters`

**Key Methods:**
- `isStart(CalculationPeriodBase arg0, CalculationPeriodBase arg1, ObservationPeriodDatesEnum arg2, ResetDates arg3)` → `MapperS` [Getter]

### ComputeCalculationPeriodSET_IN_ADVANCE
**Implements:** `RosettaFunction` 

**Fields:**
- `ModelObjectValidator objectValidator`

### ComputeCalculationPeriodSTANDARD
**Implements:** `RosettaFunction` 

**Fields:**
- `ModelObjectValidator objectValidator`

### DetermineObservationPeriod
**Implements:** `RosettaFunction` 

**Fields:**
- `ModelObjectValidator objectValidator`
- `GenerateObservationPeriod generateObservationPeriod`
- `GetAllBusinessCenters getAllBusinessCenters`

### DetermineWeightingDates
**Implements:** `RosettaFunction` 

**Fields:**
- `AppendDateToList appendDateToList`
- `GenerateObservationDates generateObservationDates`
- `GetAllBusinessCenters getAllBusinessCenters`

### EvaluateCalculatedRate
**Implements:** `RosettaFunction` 

**Fields:**
- `ModelObjectValidator objectValidator`
- `ApplyAveragingFormula applyAveragingFormula`
- `ApplyCompoundingFormula applyCompoundingFormula`
- `GenerateObservationDatesAndWeights generateObservationDatesAndWeights`
- `IndexValueObservationMultiple indexValueObservationMultiple`
- `ProcessObservations processObservations`
- `YearFractionForOneDay yearFractionForOneDay`

**Key Methods:**
- `isCompounding(InterestRateIndex arg0, FloatingRateCalculationParameters arg1, ResetDates arg2, CalculationPeriodBase arg3, CalculationPeriodBase arg4, DayCountFractionEnum arg5)` → `MapperS` [Getter]

### GenerateObservationDates
**Implements:** `RosettaFunction` 

**Fields:**
- `AddBusinessDays addBusinessDays`
- `GenerateDateList generateDateList`

### GenerateObservationDatesAndWeights
**Implements:** `RosettaFunction` 

**Fields:**
- `ModelObjectValidator objectValidator`
- `ComputeCalculationPeriod computeCalculationPeriod`
- `DetermineObservationPeriod determineObservationPeriod`
- `GenerateObservationDates generateObservationDates`
- `GenerateWeightings generateWeightings`
- `GetAllBusinessCenters getAllBusinessCenters`

### GenerateObservationPeriod
**Implements:** `RosettaFunction` 

**Fields:**
- `ModelObjectValidator objectValidator`
- `AddBusinessDays addBusinessDays`

### GenerateWeightings
**Implements:** `RosettaFunction` 

**Fields:**
- `DetermineWeightingDates determineWeightingDates`
- `GenerateWeights generateWeights`

### GenerateWeights
**Implements:** `RosettaFunction` 

**Fields:**
- `AppendToVector appendToVector`
- `DateDifference dateDifference`
- `GenerateWeights generateWeights`
- `PopOffDateList popOffDateList`

### IndexValueObservation
**Implements:** `RosettaFunction` 

### IndexValueObservationMultiple
**Implements:** `RosettaFunction` 

**Fields:**
- `IndexValueObservation indexValueObservation`

### ProcessObservations
**Implements:** `RosettaFunction` 

**Fields:**
- `VectorScalarOperation vectorScalarOperation`

## Concrete Classes

### 

### ApplyAveragingFormulaDefault
**Extends:** `ApplyAveragingFormula` 

### ApplyCompoundingFormulaDefault
**Extends:** `ApplyCompoundingFormula` 

### ComputeCalculationPeriod
**Implements:** `RosettaFunction` 

**Fields:**
- `ComputeCalculationPeriodSET_IN_ADVANCE computeCalculationPeriodSetInAdvance`
- `ComputeCalculationPeriodSTANDARD computeCalculationPeriodStandard`
- `ComputeCalculationPeriodFIXING_DATE computeCalculationPeriodFixingDate`

### ComputeCalculationPeriodFIXING_DATEDefault
**Extends:** `ComputeCalculationPeriod$ComputeCalculationPeriodFIXING_DATE` 

**Key Methods:**
- `isStart(CalculationPeriodBase arg0, CalculationPeriodBase arg1, ObservationPeriodDatesEnum arg2, ResetDates arg3)` → `MapperS` [Getter]

### ComputeCalculationPeriodSET_IN_ADVANCEDefault
**Extends:** `ComputeCalculationPeriod$ComputeCalculationPeriodSET_IN_ADVANCE` 

### ComputeCalculationPeriodSTANDARDDefault
**Extends:** `ComputeCalculationPeriod$ComputeCalculationPeriodSTANDARD` 

### DetermineObservationPeriodDefault
**Extends:** `DetermineObservationPeriod` 

### DetermineWeightingDatesDefault
**Extends:** `DetermineWeightingDates` 

### EvaluateCalculatedRateDefault
**Extends:** `EvaluateCalculatedRate` 

**Key Methods:**
- `isCompounding(InterestRateIndex arg0, FloatingRateCalculationParameters arg1, ResetDates arg2, CalculationPeriodBase arg3, CalculationPeriodBase arg4, DayCountFractionEnum arg5)` → `MapperS` [Getter]

### GenerateObservationDatesAndWeightsDefault
**Extends:** `GenerateObservationDatesAndWeights` 

### GenerateObservationDatesDefault
**Extends:** `GenerateObservationDates` 

### GenerateObservationPeriodDefault
**Extends:** `GenerateObservationPeriod` 

### GenerateWeightingsDefault
**Extends:** `GenerateWeightings` 

### GenerateWeightsDefault
**Extends:** `GenerateWeights` 

### IndexValueObservationDefault
**Extends:** `IndexValueObservation` 

### IndexValueObservationMultipleDefault
**Extends:** `IndexValueObservationMultiple` 

### ProcessObservationsDefault
**Extends:** `ProcessObservations` 

