# Package: cdm.product.asset.floatingrate

## Enums

### FloatingRateIndexProcessingTypeEnum
**Values:**
- `Screen`
- `CompoundIndex`
- `OIS`
- `OvernightAvg`
- `Modular`
- `RefBanks`

## Interfaces

### FloatingAmountCalculationDetails
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `FloatingAmountCalculationDetails` [Builder]
- `getYearFraction()` → `BigDecimal` [Getter]
- `getCalculatedAmount()` → `BigDecimal` [Getter]
- `getFloatingRate()` → `FloatingRateSettingDetails` [Getter]
- `getCalculationPeriod()` → `CalculationPeriodBase` [Getter]
- `getProcessingDetails()` → `FloatingRateProcessingDetails` [Getter]
- `getAppliedRate()` → `BigDecimal` [Getter]
- `getSpreadExclusiveCalculatedAMount()` → `BigDecimal` [Getter]
- `getCalculationPeriodNotionalAmount()` → `Money` [Getter]

### FloatingAmountCalculationDetailsBuilder
**Implements:** `FloatingAmountCalculationDetails` `RosettaModelObjectBuilder` 

**Key Methods:**
- `setCalculationPeriod(CalculationPeriodBase arg0)` → `FloatingAmountCalculationDetailsBuilder` [Setter]
- `setYearFraction(BigDecimal arg0)` → `FloatingAmountCalculationDetailsBuilder` [Setter]
- `setCalculatedAmount(BigDecimal arg0)` → `FloatingAmountCalculationDetailsBuilder` [Setter]
- `getFloatingRate()` → `FloatingRateSettingDetailsBuilder` [Getter]
- `getCalculationPeriod()` → `CalculationPeriodBaseBuilder` [Getter]
- `getProcessingDetails()` → `FloatingRateProcessingDetailsBuilder` [Getter]
- `setProcessingDetails(FloatingRateProcessingDetails arg0)` → `FloatingAmountCalculationDetailsBuilder` [Setter]
- `getOrCreateFloatingRate()` → `FloatingRateSettingDetailsBuilder` [Getter]
- `setFloatingRate(FloatingRateSettingDetails arg0)` → `FloatingAmountCalculationDetailsBuilder` [Setter]
- `setAppliedRate(BigDecimal arg0)` → `FloatingAmountCalculationDetailsBuilder` [Setter]

### FloatingRateProcessingDetails
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `FloatingRateProcessingDetails` [Builder]
- `getRawRate()` → `BigDecimal` [Getter]
- `getProcessingParameters()` → `FloatingRateProcessingParameters` [Getter]
- `getProcessedRate()` → `BigDecimal` [Getter]
- `getSpreadExclusiveRate()` → `BigDecimal` [Getter]

### FloatingRateProcessingDetailsBuilder
**Implements:** `FloatingRateProcessingDetails` `RosettaModelObjectBuilder` 

**Key Methods:**
- `setRawRate(BigDecimal arg0)` → `FloatingRateProcessingDetailsBuilder` [Setter]
- `getProcessingParameters()` → `FloatingRateProcessingParametersBuilder` [Getter]
- `setSpreadExclusiveRate(BigDecimal arg0)` → `FloatingRateProcessingDetailsBuilder` [Setter]
- `setProcessingParameters(FloatingRateProcessingParameters arg0)` → `FloatingRateProcessingDetailsBuilder` [Setter]
- `setProcessedRate(BigDecimal arg0)` → `FloatingRateProcessingDetailsBuilder` [Setter]
- `getOrCreateProcessingParameters()` → `FloatingRateProcessingParametersBuilder` [Getter]

### FloatingRateProcessingParameters
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `FloatingRateProcessingParameters` [Builder]
- `getMultiplier()` → `BigDecimal` [Getter]
- `getInitialRate()` → `Price` [Getter]
- `getRounding()` → `Rounding` [Getter]
- `getFloorRate()` → `BigDecimal` [Getter]
- `getSpread()` → `BigDecimal` [Getter]
- `getCapRate()` → `BigDecimal` [Getter]
- `getTreatment()` → `RateTreatmentEnum` [Getter]
- `getNegativeTreatment()` → `NegativeInterestRateTreatmentEnum` [Getter]

### FloatingRateProcessingParametersBuilder
**Implements:** `FloatingRateProcessingParameters` `RosettaModelObjectBuilder` 

**Key Methods:**
- `setMultiplier(BigDecimal arg0)` → `FloatingRateProcessingParametersBuilder` [Setter]
- `getInitialRate()` → `PriceBuilder` [Getter]
- `setRounding(Rounding arg0)` → `FloatingRateProcessingParametersBuilder` [Setter]
- `getOrCreateRounding()` → `RoundingBuilder` [Getter]
- `getRounding()` → `RoundingBuilder` [Getter]
- `setFloorRate(BigDecimal arg0)` → `FloatingRateProcessingParametersBuilder` [Setter]
- `setInitialRate(Price arg0)` → `FloatingRateProcessingParametersBuilder` [Setter]
- `getOrCreateInitialRate()` → `PriceBuilder` [Getter]
- `setSpread(BigDecimal arg0)` → `FloatingRateProcessingParametersBuilder` [Setter]
- `setCapRate(BigDecimal arg0)` → `FloatingRateProcessingParametersBuilder` [Setter]

### FloatingRateSettingDetails
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `FloatingRateSettingDetails` [Builder]
- `getObservationDate()` → `Date` [Getter]
- `getFloatingRate()` → `BigDecimal` [Getter]
- `getCalculationDetails()` → `CalculatedRateDetails` [Getter]
- `getResetDate()` → `Date` [Getter]

### FloatingRateSettingDetailsBuilder
**Implements:** `FloatingRateSettingDetails` `RosettaModelObjectBuilder` 

**Key Methods:**
- `setCalculationDetails(CalculatedRateDetails arg0)` → `FloatingRateSettingDetailsBuilder` [Setter]
- `getCalculationDetails()` → `CalculatedRateDetailsBuilder` [Getter]
- `setFloatingRate(BigDecimal arg0)` → `FloatingRateSettingDetailsBuilder` [Setter]
- `setObservationDate(Date arg0)` → `FloatingRateSettingDetailsBuilder` [Setter]
- `getOrCreateCalculationDetails()` → `CalculatedRateDetailsBuilder` [Getter]
- `setResetDate(Date arg0)` → `FloatingRateSettingDetailsBuilder` [Setter]

## Concrete Classes

### FloatingAmountCalculationDetailsBuilderImpl
**Implements:** `FloatingAmountCalculationDetails$FloatingAmountCalculationDetailsBuilder` 

**Fields:**
- `CalculationPeriodBaseBuilder calculationPeriod`
- `MoneyBuilder calculationPeriodNotionalAmount`
- `FloatingRateSettingDetailsBuilder floatingRate`
- `FloatingRateProcessingDetailsBuilder processingDetails`
- `BigDecimal appliedRate`
- `BigDecimal yearFraction`
- `BigDecimal calculatedAmount`
- `BigDecimal spreadExclusiveCalculatedAMount`

**Key Methods:**
- `build()` → `FloatingAmountCalculationDetails` [Builder]
- `getYearFraction()` → `BigDecimal` [Getter]
- `setCalculationPeriod(CalculationPeriodBase arg0)` → `FloatingAmountCalculationDetailsBuilder` [Setter]
- `setYearFraction(BigDecimal arg0)` → `FloatingAmountCalculationDetailsBuilder` [Setter]
- `setCalculatedAmount(BigDecimal arg0)` → `FloatingAmountCalculationDetailsBuilder` [Setter]
- `getCalculatedAmount()` → `BigDecimal` [Getter]
- `getFloatingRate()` → `FloatingRateSettingDetailsBuilder` [Getter]
- `getCalculationPeriod()` → `CalculationPeriodBaseBuilder` [Getter]
- `getProcessingDetails()` → `FloatingRateProcessingDetailsBuilder` [Getter]
- `setProcessingDetails(FloatingRateProcessingDetails arg0)` → `FloatingAmountCalculationDetailsBuilder` [Setter]

### FloatingAmountCalculationDetailsImpl
**Implements:** `FloatingAmountCalculationDetails` 

**Key Methods:**
- `build()` → `FloatingAmountCalculationDetails` [Builder]
- `getYearFraction()` → `BigDecimal` [Getter]
- `getCalculatedAmount()` → `BigDecimal` [Getter]
- `getFloatingRate()` → `FloatingRateSettingDetails` [Getter]
- `getCalculationPeriod()` → `CalculationPeriodBase` [Getter]
- `getProcessingDetails()` → `FloatingRateProcessingDetails` [Getter]
- `getAppliedRate()` → `BigDecimal` [Getter]
- `setBuilderFields(FloatingAmountCalculationDetailsBuilder arg0)` → `void` [Setter]
- `getSpreadExclusiveCalculatedAMount()` → `BigDecimal` [Getter]
- `getCalculationPeriodNotionalAmount()` → `Money` [Getter]

### FloatingRateProcessingDetailsBuilderImpl
**Implements:** `FloatingRateProcessingDetails$FloatingRateProcessingDetailsBuilder` 

**Fields:**
- `BigDecimal rawRate`
- `FloatingRateProcessingParametersBuilder processingParameters`
- `BigDecimal processedRate`
- `BigDecimal spreadExclusiveRate`

**Key Methods:**
- `build()` → `FloatingRateProcessingDetails` [Builder]
- `getRawRate()` → `BigDecimal` [Getter]
- `setRawRate(BigDecimal arg0)` → `FloatingRateProcessingDetailsBuilder` [Setter]
- `getProcessingParameters()` → `FloatingRateProcessingParametersBuilder` [Getter]
- `getProcessedRate()` → `BigDecimal` [Getter]
- `setSpreadExclusiveRate(BigDecimal arg0)` → `FloatingRateProcessingDetailsBuilder` [Setter]
- `setProcessingParameters(FloatingRateProcessingParameters arg0)` → `FloatingRateProcessingDetailsBuilder` [Setter]
- `setProcessedRate(BigDecimal arg0)` → `FloatingRateProcessingDetailsBuilder` [Setter]
- `getSpreadExclusiveRate()` → `BigDecimal` [Getter]
- `getOrCreateProcessingParameters()` → `FloatingRateProcessingParametersBuilder` [Getter]

### FloatingRateProcessingDetailsImpl
**Implements:** `FloatingRateProcessingDetails` 

**Key Methods:**
- `build()` → `FloatingRateProcessingDetails` [Builder]
- `getRawRate()` → `BigDecimal` [Getter]
- `getProcessingParameters()` → `FloatingRateProcessingParameters` [Getter]
- `getProcessedRate()` → `BigDecimal` [Getter]
- `getSpreadExclusiveRate()` → `BigDecimal` [Getter]
- `setBuilderFields(FloatingRateProcessingDetailsBuilder arg0)` → `void` [Setter]

### FloatingRateProcessingParametersBuilderImpl
**Implements:** `FloatingRateProcessingParameters$FloatingRateProcessingParametersBuilder` 

**Fields:**
- `PriceBuilder initialRate`
- `BigDecimal multiplier`
- `BigDecimal spread`
- `RateTreatmentEnum treatment`
- `BigDecimal capRate`
- `BigDecimal floorRate`
- `RoundingBuilder rounding`
- `NegativeInterestRateTreatmentEnum negativeTreatment`

**Key Methods:**
- `build()` → `FloatingRateProcessingParameters` [Builder]
- `getMultiplier()` → `BigDecimal` [Getter]
- `setMultiplier(BigDecimal arg0)` → `FloatingRateProcessingParametersBuilder` [Setter]
- `getInitialRate()` → `PriceBuilder` [Getter]
- `setRounding(Rounding arg0)` → `FloatingRateProcessingParametersBuilder` [Setter]
- `getOrCreateRounding()` → `RoundingBuilder` [Getter]
- `getRounding()` → `RoundingBuilder` [Getter]
- `getFloorRate()` → `BigDecimal` [Getter]
- `setFloorRate(BigDecimal arg0)` → `FloatingRateProcessingParametersBuilder` [Setter]
- `setInitialRate(Price arg0)` → `FloatingRateProcessingParametersBuilder` [Setter]

### FloatingRateProcessingParametersImpl
**Implements:** `FloatingRateProcessingParameters` 

**Key Methods:**
- `build()` → `FloatingRateProcessingParameters` [Builder]
- `getMultiplier()` → `BigDecimal` [Getter]
- `getInitialRate()` → `Price` [Getter]
- `setBuilderFields(FloatingRateProcessingParametersBuilder arg0)` → `void` [Setter]
- `getRounding()` → `Rounding` [Getter]
- `getFloorRate()` → `BigDecimal` [Getter]
- `getSpread()` → `BigDecimal` [Getter]
- `getCapRate()` → `BigDecimal` [Getter]
- `getTreatment()` → `RateTreatmentEnum` [Getter]
- `getNegativeTreatment()` → `NegativeInterestRateTreatmentEnum` [Getter]

### FloatingRateSettingDetailsBuilderImpl
**Implements:** `FloatingRateSettingDetails$FloatingRateSettingDetailsBuilder` 

**Fields:**
- `CalculatedRateDetailsBuilder calculationDetails`
- `Date observationDate`
- `Date resetDate`
- `BigDecimal floatingRate`

**Key Methods:**
- `build()` → `FloatingRateSettingDetails` [Builder]
- `getObservationDate()` → `Date` [Getter]
- `getFloatingRate()` → `BigDecimal` [Getter]
- `setCalculationDetails(CalculatedRateDetails arg0)` → `FloatingRateSettingDetailsBuilder` [Setter]
- `getCalculationDetails()` → `CalculatedRateDetailsBuilder` [Getter]
- `setFloatingRate(BigDecimal arg0)` → `FloatingRateSettingDetailsBuilder` [Setter]
- `getResetDate()` → `Date` [Getter]
- `setObservationDate(Date arg0)` → `FloatingRateSettingDetailsBuilder` [Setter]
- `getOrCreateCalculationDetails()` → `CalculatedRateDetailsBuilder` [Getter]
- `setResetDate(Date arg0)` → `FloatingRateSettingDetailsBuilder` [Setter]

### FloatingRateSettingDetailsImpl
**Implements:** `FloatingRateSettingDetails` 

**Key Methods:**
- `build()` → `FloatingRateSettingDetails` [Builder]
- `getObservationDate()` → `Date` [Getter]
- `getFloatingRate()` → `BigDecimal` [Getter]
- `getCalculationDetails()` → `CalculatedRateDetails` [Getter]
- `getResetDate()` → `Date` [Getter]
- `setBuilderFields(FloatingRateSettingDetailsBuilder arg0)` → `void` [Setter]

