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
- `getCalculationPeriod()` → `CalculationPeriodBase` [Getter]
- `getCalculatedAmount()` → `BigDecimal` [Getter]
- `getCalculationPeriodNotionalAmount()` → `Money` [Getter]
- `getSpreadExclusiveCalculatedAMount()` → `BigDecimal` [Getter]
- `getAppliedRate()` → `BigDecimal` [Getter]
- `getFloatingRate()` → `FloatingRateSettingDetails` [Getter]
- `getProcessingDetails()` → `FloatingRateProcessingDetails` [Getter]

### FloatingAmountCalculationDetailsBuilder
**Implements:** `FloatingAmountCalculationDetails` `RosettaModelObjectBuilder` 

**Key Methods:**
- `setCalculatedAmount(BigDecimal arg0)` → `FloatingAmountCalculationDetailsBuilder` [Setter]
- `setCalculationPeriod(CalculationPeriodBase arg0)` → `FloatingAmountCalculationDetailsBuilder` [Setter]
- `setYearFraction(BigDecimal arg0)` → `FloatingAmountCalculationDetailsBuilder` [Setter]
- `getCalculationPeriod()` → `CalculationPeriodBaseBuilder` [Getter]
- `getOrCreateCalculationPeriod()` → `CalculationPeriodBaseBuilder` [Getter]
- `getCalculationPeriodNotionalAmount()` → `MoneyBuilder` [Getter]
- `setCalculationPeriodNotionalAmount(Money arg0)` → `FloatingAmountCalculationDetailsBuilder` [Setter]
- `getOrCreateCalculationPeriodNotionalAmount()` → `MoneyBuilder` [Getter]
- `getOrCreateProcessingDetails()` → `FloatingRateProcessingDetailsBuilder` [Getter]
- `setSpreadExclusiveCalculatedAMount(BigDecimal arg0)` → `FloatingAmountCalculationDetailsBuilder` [Setter]

### FloatingRateProcessingDetails
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `FloatingRateProcessingDetails` [Builder]
- `getRawRate()` → `BigDecimal` [Getter]
- `getProcessingParameters()` → `FloatingRateProcessingParameters` [Getter]
- `getSpreadExclusiveRate()` → `BigDecimal` [Getter]
- `getProcessedRate()` → `BigDecimal` [Getter]

### FloatingRateProcessingDetailsBuilder
**Implements:** `FloatingRateProcessingDetails` `RosettaModelObjectBuilder` 

**Key Methods:**
- `getOrCreateProcessingParameters()` → `FloatingRateProcessingParametersBuilder` [Getter]
- `setRawRate(BigDecimal arg0)` → `FloatingRateProcessingDetailsBuilder` [Setter]
- `getProcessingParameters()` → `FloatingRateProcessingParametersBuilder` [Getter]
- `setProcessingParameters(FloatingRateProcessingParameters arg0)` → `FloatingRateProcessingDetailsBuilder` [Setter]
- `setProcessedRate(BigDecimal arg0)` → `FloatingRateProcessingDetailsBuilder` [Setter]
- `setSpreadExclusiveRate(BigDecimal arg0)` → `FloatingRateProcessingDetailsBuilder` [Setter]

### FloatingRateProcessingParameters
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `FloatingRateProcessingParameters` [Builder]
- `getMultiplier()` → `BigDecimal` [Getter]
- `getTreatment()` → `RateTreatmentEnum` [Getter]
- `getFloorRate()` → `BigDecimal` [Getter]
- `getRounding()` → `Rounding` [Getter]
- `getNegativeTreatment()` → `NegativeInterestRateTreatmentEnum` [Getter]
- `getInitialRate()` → `Price` [Getter]
- `getCapRate()` → `BigDecimal` [Getter]
- `getSpread()` → `BigDecimal` [Getter]

### FloatingRateProcessingParametersBuilder
**Implements:** `FloatingRateProcessingParameters` `RosettaModelObjectBuilder` 

**Key Methods:**
- `setMultiplier(BigDecimal arg0)` → `FloatingRateProcessingParametersBuilder` [Setter]
- `setTreatment(RateTreatmentEnum arg0)` → `FloatingRateProcessingParametersBuilder` [Setter]
- `setInitialRate(Price arg0)` → `FloatingRateProcessingParametersBuilder` [Setter]
- `getOrCreateInitialRate()` → `PriceBuilder` [Getter]
- `setFloorRate(BigDecimal arg0)` → `FloatingRateProcessingParametersBuilder` [Setter]
- `getOrCreateRounding()` → `RoundingBuilder` [Getter]
- `getRounding()` → `RoundingBuilder` [Getter]
- `setRounding(Rounding arg0)` → `FloatingRateProcessingParametersBuilder` [Setter]
- `setNegativeTreatment(NegativeInterestRateTreatmentEnum arg0)` → `FloatingRateProcessingParametersBuilder` [Setter]
- `getInitialRate()` → `PriceBuilder` [Getter]

### FloatingRateSettingDetails
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `FloatingRateSettingDetails` [Builder]
- `getResetDate()` → `Date` [Getter]
- `getObservationDate()` → `Date` [Getter]
- `getCalculationDetails()` → `CalculatedRateDetails` [Getter]
- `getFloatingRate()` → `BigDecimal` [Getter]

### FloatingRateSettingDetailsBuilder
**Implements:** `FloatingRateSettingDetails` `RosettaModelObjectBuilder` 

**Key Methods:**
- `setResetDate(Date arg0)` → `FloatingRateSettingDetailsBuilder` [Setter]
- `setObservationDate(Date arg0)` → `FloatingRateSettingDetailsBuilder` [Setter]
- `getOrCreateCalculationDetails()` → `CalculatedRateDetailsBuilder` [Getter]
- `setCalculationDetails(CalculatedRateDetails arg0)` → `FloatingRateSettingDetailsBuilder` [Setter]
- `getCalculationDetails()` → `CalculatedRateDetailsBuilder` [Getter]
- `setFloatingRate(BigDecimal arg0)` → `FloatingRateSettingDetailsBuilder` [Setter]

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
- `setCalculatedAmount(BigDecimal arg0)` → `FloatingAmountCalculationDetailsBuilder` [Setter]
- `setCalculationPeriod(CalculationPeriodBase arg0)` → `FloatingAmountCalculationDetailsBuilder` [Setter]
- `setYearFraction(BigDecimal arg0)` → `FloatingAmountCalculationDetailsBuilder` [Setter]
- `getCalculationPeriod()` → `CalculationPeriodBaseBuilder` [Getter]
- `getCalculatedAmount()` → `BigDecimal` [Getter]
- `getOrCreateCalculationPeriod()` → `CalculationPeriodBaseBuilder` [Getter]
- `getCalculationPeriodNotionalAmount()` → `MoneyBuilder` [Getter]
- `setCalculationPeriodNotionalAmount(Money arg0)` → `FloatingAmountCalculationDetailsBuilder` [Setter]

### FloatingAmountCalculationDetailsImpl
**Implements:** `FloatingAmountCalculationDetails` 

**Key Methods:**
- `build()` → `FloatingAmountCalculationDetails` [Builder]
- `setBuilderFields(FloatingAmountCalculationDetailsBuilder arg0)` → `void` [Setter]
- `getYearFraction()` → `BigDecimal` [Getter]
- `getCalculationPeriod()` → `CalculationPeriodBase` [Getter]
- `getCalculatedAmount()` → `BigDecimal` [Getter]
- `getCalculationPeriodNotionalAmount()` → `Money` [Getter]
- `getSpreadExclusiveCalculatedAMount()` → `BigDecimal` [Getter]
- `getAppliedRate()` → `BigDecimal` [Getter]
- `getFloatingRate()` → `FloatingRateSettingDetails` [Getter]
- `getProcessingDetails()` → `FloatingRateProcessingDetails` [Getter]

### FloatingRateProcessingDetailsBuilderImpl
**Implements:** `FloatingRateProcessingDetails$FloatingRateProcessingDetailsBuilder` 

**Fields:**
- `BigDecimal rawRate`
- `FloatingRateProcessingParametersBuilder processingParameters`
- `BigDecimal processedRate`
- `BigDecimal spreadExclusiveRate`

**Key Methods:**
- `build()` → `FloatingRateProcessingDetails` [Builder]
- `getOrCreateProcessingParameters()` → `FloatingRateProcessingParametersBuilder` [Getter]
- `setRawRate(BigDecimal arg0)` → `FloatingRateProcessingDetailsBuilder` [Setter]
- `getRawRate()` → `BigDecimal` [Getter]
- `getProcessingParameters()` → `FloatingRateProcessingParametersBuilder` [Getter]
- `getSpreadExclusiveRate()` → `BigDecimal` [Getter]
- `getProcessedRate()` → `BigDecimal` [Getter]
- `setProcessingParameters(FloatingRateProcessingParameters arg0)` → `FloatingRateProcessingDetailsBuilder` [Setter]
- `setProcessedRate(BigDecimal arg0)` → `FloatingRateProcessingDetailsBuilder` [Setter]
- `setSpreadExclusiveRate(BigDecimal arg0)` → `FloatingRateProcessingDetailsBuilder` [Setter]

### FloatingRateProcessingDetailsImpl
**Implements:** `FloatingRateProcessingDetails` 

**Key Methods:**
- `build()` → `FloatingRateProcessingDetails` [Builder]
- `setBuilderFields(FloatingRateProcessingDetailsBuilder arg0)` → `void` [Setter]
- `getRawRate()` → `BigDecimal` [Getter]
- `getProcessingParameters()` → `FloatingRateProcessingParameters` [Getter]
- `getSpreadExclusiveRate()` → `BigDecimal` [Getter]
- `getProcessedRate()` → `BigDecimal` [Getter]

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
- `getTreatment()` → `RateTreatmentEnum` [Getter]
- `setTreatment(RateTreatmentEnum arg0)` → `FloatingRateProcessingParametersBuilder` [Setter]
- `setInitialRate(Price arg0)` → `FloatingRateProcessingParametersBuilder` [Setter]
- `getOrCreateInitialRate()` → `PriceBuilder` [Getter]
- `getFloorRate()` → `BigDecimal` [Getter]
- `setFloorRate(BigDecimal arg0)` → `FloatingRateProcessingParametersBuilder` [Setter]
- `getOrCreateRounding()` → `RoundingBuilder` [Getter]

### FloatingRateProcessingParametersImpl
**Implements:** `FloatingRateProcessingParameters` 

**Key Methods:**
- `build()` → `FloatingRateProcessingParameters` [Builder]
- `getMultiplier()` → `BigDecimal` [Getter]
- `setBuilderFields(FloatingRateProcessingParametersBuilder arg0)` → `void` [Setter]
- `getTreatment()` → `RateTreatmentEnum` [Getter]
- `getFloorRate()` → `BigDecimal` [Getter]
- `getRounding()` → `Rounding` [Getter]
- `getNegativeTreatment()` → `NegativeInterestRateTreatmentEnum` [Getter]
- `getInitialRate()` → `Price` [Getter]
- `getCapRate()` → `BigDecimal` [Getter]
- `getSpread()` → `BigDecimal` [Getter]

### FloatingRateSettingDetailsBuilderImpl
**Implements:** `FloatingRateSettingDetails$FloatingRateSettingDetailsBuilder` 

**Fields:**
- `CalculatedRateDetailsBuilder calculationDetails`
- `Date observationDate`
- `Date resetDate`
- `BigDecimal floatingRate`

**Key Methods:**
- `build()` → `FloatingRateSettingDetails` [Builder]
- `getResetDate()` → `Date` [Getter]
- `setResetDate(Date arg0)` → `FloatingRateSettingDetailsBuilder` [Setter]
- `setObservationDate(Date arg0)` → `FloatingRateSettingDetailsBuilder` [Setter]
- `getObservationDate()` → `Date` [Getter]
- `getOrCreateCalculationDetails()` → `CalculatedRateDetailsBuilder` [Getter]
- `setCalculationDetails(CalculatedRateDetails arg0)` → `FloatingRateSettingDetailsBuilder` [Setter]
- `getCalculationDetails()` → `CalculatedRateDetailsBuilder` [Getter]
- `getFloatingRate()` → `BigDecimal` [Getter]
- `setFloatingRate(BigDecimal arg0)` → `FloatingRateSettingDetailsBuilder` [Setter]

### FloatingRateSettingDetailsImpl
**Implements:** `FloatingRateSettingDetails` 

**Key Methods:**
- `build()` → `FloatingRateSettingDetails` [Builder]
- `setBuilderFields(FloatingRateSettingDetailsBuilder arg0)` → `void` [Setter]
- `getResetDate()` → `Date` [Getter]
- `getObservationDate()` → `Date` [Getter]
- `getCalculationDetails()` → `CalculatedRateDetails` [Getter]
- `getFloatingRate()` → `BigDecimal` [Getter]

