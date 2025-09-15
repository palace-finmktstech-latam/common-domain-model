# Package: cdm.product.asset.floatingrate.functions

## Abstract Classes

### ApplyCapsAndFloors
**Implements:** `RosettaFunction` 

### ApplyFinalRateRounding
**Implements:** `RosettaFunction` 

**Fields:**
- `RoundToPrecision roundToPrecision`

### ApplyFloatingRatePostSpreadProcessing
**Implements:** `RosettaFunction` 

**Fields:**
- `ApplyCapsAndFloors applyCapsAndFloors`
- `ApplyFinalRateRounding applyFinalRateRounding`

### ApplyFloatingRateProcessing
**Implements:** `RosettaFunction` 

**Fields:**
- `ModelObjectValidator objectValidator`
- `ApplyFloatingRatePostSpreadProcessing applyFloatingRatePostSpreadProcessing`
- `ApplyUSRateTreatment applyUSRateTreatment`
- `Max max`

### ApplyUSRateTreatment
**Implements:** `RosettaFunction` 

### CapRateAmount
**Implements:** `RosettaFunction` 

**Fields:**
- `GetRateScheduleAmount getRateScheduleAmount`

### DetermineFixingDate
**Implements:** `RosettaFunction` 

**Fields:**
- `AddBusinessDays addBusinessDays`
- `GetAllBusinessCenters getAllBusinessCenters`

### DetermineFloatingRateReset
**Implements:** `RosettaFunction` 

**Fields:**
- `ModelObjectValidator objectValidator`
- `GetFloatingRateProcessingType getFloatingRateProcessingType`
- `ProcessFloatingRateReset processFloatingRateReset`

### DetermineResetDate
**Implements:** `RosettaFunction` 

**Key Methods:**
- `isStart(ResetDates arg0, CalculationPeriodBase arg1)` → `MapperS` [Getter]

### EvaluateScreenRate
**Implements:** `RosettaFunction` 

**Fields:**
- `ModelObjectValidator objectValidator`
- `DetermineFixingDate determineFixingDate`
- `DetermineResetDate determineResetDate`
- `IndexValueObservation indexValueObservation`

### FloorRateAmount
**Implements:** `RosettaFunction` 

**Fields:**
- `GetRateScheduleAmount getRateScheduleAmount`

### GetCalculatedFROCalculationParameters
**Implements:** `RosettaFunction` 

**Fields:**
- `ModelObjectValidator objectValidator`

### GetFloatingRateProcessingParameters
**Implements:** `RosettaFunction` 

**Fields:**
- `ModelObjectValidator objectValidator`
- `CapRateAmount capRateAmount`
- `FloorRateAmount floorRateAmount`
- `MultiplierAmount multiplierAmount`
- `SpreadAmount spreadAmount`

### GetFloatingRateProcessingType
**Implements:** `RosettaFunction` 

**Fields:**
- `FloatingRateIndexMetadata floatingRateIndexMetadata`

**Key Methods:**
- `isCalculatedRate(FloatingRateSpecification arg0)` → `MapperS` [Getter]

### GetRateScheduleAmount
**Implements:** `RosettaFunction` 

**Fields:**
- `GetRateScheduleStepValues getRateScheduleStepValues`

### GetRateScheduleStepValues
**Implements:** `RosettaFunction` 

### MultiplierAmount
**Implements:** `RosettaFunction` 

**Fields:**
- `GetRateScheduleAmount getRateScheduleAmount`

### ProcessFloatingRateResetCOMPOUND_INDEX
**Implements:** `RosettaFunction` 

**Fields:**
- `ModelObjectValidator objectValidator`

### ProcessFloatingRateResetMODULAR
**Implements:** `RosettaFunction` 

**Fields:**
- `ModelObjectValidator objectValidator`
- `CalculationPeriod calculationPeriod`
- `Create_CalculationPeriodBase create_CalculationPeriodBase`
- `EvaluateCalculatedRate evaluateCalculatedRate`

### ProcessFloatingRateResetOIS
**Implements:** `RosettaFunction` 

**Fields:**
- `ModelObjectValidator objectValidator`
- `EvaluateCalculatedRate evaluateCalculatedRate`
- `GetCalculatedFROCalculationParameters getCalculatedFROCalculationParameters`

### ProcessFloatingRateResetOVERNIGHT_AVG
**Implements:** `RosettaFunction` 

**Fields:**
- `ModelObjectValidator objectValidator`
- `EvaluateCalculatedRate evaluateCalculatedRate`
- `GetCalculatedFROCalculationParameters getCalculatedFROCalculationParameters`

### ProcessFloatingRateResetSCREEN
**Implements:** `RosettaFunction` 

**Fields:**
- `ModelObjectValidator objectValidator`
- `EvaluateScreenRate evaluateScreenRate`

### SpreadAmount
**Implements:** `RosettaFunction` 

**Fields:**
- `GetRateScheduleAmount getRateScheduleAmount`

## Concrete Classes

### 

### ApplyCapsAndFloorsDefault
**Extends:** `ApplyCapsAndFloors` 

### ApplyFinalRateRoundingDefault
**Extends:** `ApplyFinalRateRounding` 

### ApplyFloatingRatePostSpreadProcessingDefault
**Extends:** `ApplyFloatingRatePostSpreadProcessing` 

### ApplyFloatingRateProcessingDefault
**Extends:** `ApplyFloatingRateProcessing` 

### ApplyUSRateTreatmentDefault
**Extends:** `ApplyUSRateTreatment` 

### CapRateAmountDefault
**Extends:** `CapRateAmount` 

### DetermineFixingDateDefault
**Extends:** `DetermineFixingDate` 

### DetermineFloatingRateResetDefault
**Extends:** `DetermineFloatingRateReset` 

### DetermineResetDateDefault
**Extends:** `DetermineResetDate` 

**Key Methods:**
- `isStart(ResetDates arg0, CalculationPeriodBase arg1)` → `MapperS` [Getter]

### EvaluateScreenRateDefault
**Extends:** `EvaluateScreenRate` 

### FloorRateAmountDefault
**Extends:** `FloorRateAmount` 

### GetCalculatedFROCalculationParametersDefault
**Extends:** `GetCalculatedFROCalculationParameters` 

### GetFloatingRateProcessingParametersDefault
**Extends:** `GetFloatingRateProcessingParameters` 

### GetFloatingRateProcessingTypeDefault
**Extends:** `GetFloatingRateProcessingType` 

**Key Methods:**
- `isCalculatedRate(FloatingRateSpecification arg0)` → `MapperS` [Getter]

### GetRateScheduleAmountDefault
**Extends:** `GetRateScheduleAmount` 

### GetRateScheduleStepValuesDefault
**Extends:** `GetRateScheduleStepValues` 

### MultiplierAmountDefault
**Extends:** `MultiplierAmount` 

### ProcessFloatingRateReset
**Implements:** `RosettaFunction` 

**Fields:**
- `ProcessFloatingRateResetSCREEN processFloatingRateResetScreen`
- `ProcessFloatingRateResetMODULAR processFloatingRateResetModular`
- `ProcessFloatingRateResetOIS processFloatingRateResetOIS`
- `ProcessFloatingRateResetOVERNIGHT_AVG processFloatingRateResetOvernightAvg`
- `ProcessFloatingRateResetCOMPOUND_INDEX processFloatingRateResetCompoundIndex`

### ProcessFloatingRateResetCOMPOUND_INDEXDefault
**Extends:** `ProcessFloatingRateReset$ProcessFloatingRateResetCOMPOUND_INDEX` 

### ProcessFloatingRateResetMODULARDefault
**Extends:** `ProcessFloatingRateReset$ProcessFloatingRateResetMODULAR` 

### ProcessFloatingRateResetOISDefault
**Extends:** `ProcessFloatingRateReset$ProcessFloatingRateResetOIS` 

### ProcessFloatingRateResetOVERNIGHT_AVGDefault
**Extends:** `ProcessFloatingRateReset$ProcessFloatingRateResetOVERNIGHT_AVG` 

### ProcessFloatingRateResetSCREENDefault
**Extends:** `ProcessFloatingRateReset$ProcessFloatingRateResetSCREEN` 

### SpreadAmountDefault
**Extends:** `SpreadAmount` 

