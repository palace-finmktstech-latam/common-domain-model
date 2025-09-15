# Package: cdm.base.math

## Enums

### ArithmeticOperationEnum
**Values:**
- `Add`
- `Subtract`
- `Multiply`
- `Divide`
- `Max`
- `Min`

### AveragingCalculationMethodEnum
**Values:**
- `Arithmetic`
- `Geometric`
- `Harmonic`

### AveragingWeightingMethodEnum
**Values:**
- `Unweighted`
- `Weighted`

### CapacityUnitEnum
**Values:**
- `ALW`
- `BBL`
- `BCF`
- `BDFT`
- `CBM`
- `CER`
- `CRT`
- `DAG`
- `DAY`
- `DMTU`
- `ENVCRD`
- `ENVOFST`
- `FEU`
- `G`
- `GBBSH`
- `GBBTU`
- `GBCWT`
- `GBGAL`
- `GBMBTU`
- `GBMMBTU`
- `GBT`
- `GBTHM`
- `GJ`
- `GW`
- `GWH`
- `HL`
- `HOGB`
- `ISOBTU`
- `ISOMBTU`
- `ISOMMBTU`
- `ISOTHM`
- `J`
- `KG`
- `KL`
- `KW`
- `KWD`
- `KWH`
- `KWM`
- `KWMIN`
- `KWY`
- `L`
- `LB`
- `MB`
- `MBF`
- `MJ`
- `MMBF`
- `MMBBL`
- `MSF`
- `MT`
- `MW`
- `MWD`
- `MWH`
- `MWM`
- `MWMIN`
- `MWY`
- `OZT`
- `SGB`
- `TEU`
- `USBSH`
- `USBTU`
- `USCWT`
- `USGAL`
- `USMBTU`
- `USMMBTU`
- `UST`
- `USTHM`

### CompareOp
**Values:**
- `GreaterThan`
- `GreaterThanOrEquals`
- `Equals`
- `LessThanOrEquals`
- `LessThan`

### FinancialUnitEnum
**Values:**
- `Contract`
- `ContractualProduct`
- `IndexUnit`
- `LogNormalVolatility`
- `Share`
- `ValuePerDay`
- `ValuePerPercent`
- `Weight`

### QuantifierEnum
**Values:**
- `All`
- `Any`

### QuantityChangeDirectionEnum
**Values:**
- `Increase`
- `Decrease`
- `Replace`

### RoundingDirectionEnum
**Values:**
- `Up`
- `Down`
- `Nearest`

### RoundingModeEnum
**Values:**
- `Down`
- `Up`

### WeatherUnitEnum
**Values:**
- `CDD`
- `CPD`
- `HDD`

## Interfaces

### AveragingCalculationMethod
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `AveragingCalculationMethod` [Builder]
- `getCalculationMethod()` → `AveragingCalculationMethodEnum` [Getter]
- `getIsWeighted()` → `Boolean` [Getter]

### AveragingCalculationMethodBuilder
**Implements:** `AveragingCalculationMethod` `RosettaModelObjectBuilder` 

**Key Methods:**
- `setIsWeighted(Boolean arg0)` → `AveragingCalculationMethodBuilder` [Setter]
- `setCalculationMethod(AveragingCalculationMethodEnum arg0)` → `AveragingCalculationMethodBuilder` [Setter]

### DatedValue
**Implements:** `RosettaModelObject` `GlobalKey` 

**Key Methods:**
- `getValue()` → `BigDecimal` [Getter]
- `getType()` → `Class` [Getter]
- `build()` → `DatedValue` [Builder]
- `getDate()` → `Date` [Getter]
- `getMeta()` → `MetaFields` [Getter]

### DatedValueBuilder
**Implements:** `DatedValue` `RosettaModelObjectBuilder` `GlobalKey$GlobalKeyBuilder` 

**Key Methods:**
- `setValue(BigDecimal arg0)` → `DatedValueBuilder` [Setter]
- `setDate(Date arg0)` → `DatedValueBuilder` [Setter]
- `getOrCreateMeta()` → `MetaFieldsBuilder` [Getter]
- `setMeta(MetaFields arg0)` → `DatedValueBuilder` [Setter]
- `getMeta()` → `MetaFieldsBuilder` [Getter]

### Measure
**Implements:** `MeasureBase` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `Measure` [Builder]

### MeasureBase
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getValue()` → `BigDecimal` [Getter]
- `getType()` → `Class` [Getter]
- `build()` → `MeasureBase` [Builder]
- `getUnit()` → `UnitType` [Getter]

### MeasureBaseBuilder
**Implements:** `MeasureBase` `RosettaModelObjectBuilder` 

**Key Methods:**
- `setValue(BigDecimal arg0)` → `MeasureBaseBuilder` [Setter]
- `getOrCreateUnit()` → `UnitTypeBuilder` [Getter]
- `getUnit()` → `UnitTypeBuilder` [Getter]
- `setUnit(UnitType arg0)` → `MeasureBaseBuilder` [Setter]

### MeasureBuilder
**Implements:** `Measure` `MeasureBase$MeasureBaseBuilder` 

**Key Methods:**
- `setValue(BigDecimal arg0)` → `MeasureBuilder` [Setter]
- `setUnit(UnitType arg0)` → `MeasureBuilder` [Setter]

### MeasureSchedule
**Implements:** `MeasureBase` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `MeasureSchedule` [Builder]
- `getDatedValue()` → `List` [Getter]

### MeasureScheduleBuilder
**Implements:** `MeasureSchedule` `MeasureBase$MeasureBaseBuilder` 

**Key Methods:**
- `setValue(BigDecimal arg0)` → `MeasureScheduleBuilder` [Setter]
- `getDatedValue()` → `List` [Getter]
- `setDatedValue(List arg0)` → `MeasureScheduleBuilder` [Setter]
- `getOrCreateDatedValue(int arg0)` → `DatedValueBuilder` [Getter]
- `setUnit(UnitType arg0)` → `MeasureScheduleBuilder` [Setter]

### MoneyBound
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `MoneyBound` [Builder]
- `getInclusive()` → `Boolean` [Getter]
- `getMoney()` → `Money` [Getter]

### MoneyBoundBuilder
**Implements:** `MoneyBound` `RosettaModelObjectBuilder` 

**Key Methods:**
- `setInclusive(Boolean arg0)` → `MoneyBoundBuilder` [Setter]
- `getOrCreateMoney()` → `MoneyBuilder` [Getter]
- `setMoney(Money arg0)` → `MoneyBoundBuilder` [Setter]
- `getMoney()` → `MoneyBuilder` [Getter]

### MoneyRange
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `MoneyRange` [Builder]
- `getLowerBound()` → `MoneyBound` [Getter]
- `getUpperBound()` → `MoneyBound` [Getter]

### MoneyRangeBuilder
**Implements:** `MoneyRange` `RosettaModelObjectBuilder` 

**Key Methods:**
- `setLowerBound(MoneyBound arg0)` → `MoneyRangeBuilder` [Setter]
- `setUpperBound(MoneyBound arg0)` → `MoneyRangeBuilder` [Setter]
- `getOrCreateUpperBound()` → `MoneyBoundBuilder` [Getter]
- `getOrCreateLowerBound()` → `MoneyBoundBuilder` [Getter]
- `getLowerBound()` → `MoneyBoundBuilder` [Getter]
- `getUpperBound()` → `MoneyBoundBuilder` [Getter]

### NonNegativeQuantity
**Implements:** `Quantity` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `NonNegativeQuantity` [Builder]

### NonNegativeQuantityBuilder
**Implements:** `NonNegativeQuantity` `Quantity$QuantityBuilder` 

**Key Methods:**
- `setValue(BigDecimal arg0)` → `NonNegativeQuantityBuilder` [Setter]
- `setMultiplier(Measure arg0)` → `NonNegativeQuantityBuilder` [Setter]
- `setDatedValue(List arg0)` → `NonNegativeQuantityBuilder` [Setter]
- `setFrequency(Frequency arg0)` → `NonNegativeQuantityBuilder` [Setter]
- `setUnit(UnitType arg0)` → `NonNegativeQuantityBuilder` [Setter]

### NonNegativeQuantitySchedule
**Implements:** `QuantitySchedule` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `NonNegativeQuantitySchedule` [Builder]

### NonNegativeQuantityScheduleBuilder
**Implements:** `NonNegativeQuantitySchedule` `QuantitySchedule$QuantityScheduleBuilder` 

**Key Methods:**
- `setValue(BigDecimal arg0)` → `NonNegativeQuantityScheduleBuilder` [Setter]
- `setMultiplier(Measure arg0)` → `NonNegativeQuantityScheduleBuilder` [Setter]
- `setDatedValue(List arg0)` → `NonNegativeQuantityScheduleBuilder` [Setter]
- `setFrequency(Frequency arg0)` → `NonNegativeQuantityScheduleBuilder` [Setter]
- `setUnit(UnitType arg0)` → `NonNegativeQuantityScheduleBuilder` [Setter]

### NonNegativeStep
**Implements:** `RosettaModelObject` `GlobalKey` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `NonNegativeStep` [Builder]
- `getMeta()` → `MetaFields` [Getter]
- `getStepDate()` → `Date` [Getter]
- `getStepValue()` → `BigDecimal` [Getter]

### NonNegativeStepBuilder
**Implements:** `NonNegativeStep` `RosettaModelObjectBuilder` `GlobalKey$GlobalKeyBuilder` 

**Key Methods:**
- `getOrCreateMeta()` → `MetaFieldsBuilder` [Getter]
- `setMeta(MetaFields arg0)` → `NonNegativeStepBuilder` [Setter]
- `getMeta()` → `MetaFieldsBuilder` [Getter]
- `setStepDate(Date arg0)` → `NonNegativeStepBuilder` [Setter]
- `setStepValue(BigDecimal arg0)` → `NonNegativeStepBuilder` [Setter]

### NumberBound
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `NumberBound` [Builder]
- `getNumber()` → `BigDecimal` [Getter]
- `getInclusive()` → `Boolean` [Getter]

### NumberBoundBuilder
**Implements:** `NumberBound` `RosettaModelObjectBuilder` 

**Key Methods:**
- `setInclusive(Boolean arg0)` → `NumberBoundBuilder` [Setter]
- `setNumber(BigDecimal arg0)` → `NumberBoundBuilder` [Setter]

### NumberRange
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `NumberRange` [Builder]
- `getLowerBound()` → `NumberBound` [Getter]
- `getUpperBound()` → `NumberBound` [Getter]

### NumberRangeBuilder
**Implements:** `NumberRange` `RosettaModelObjectBuilder` 

**Key Methods:**
- `setLowerBound(NumberBound arg0)` → `NumberRangeBuilder` [Setter]
- `setUpperBound(NumberBound arg0)` → `NumberRangeBuilder` [Setter]
- `getOrCreateUpperBound()` → `NumberBoundBuilder` [Getter]
- `getOrCreateLowerBound()` → `NumberBoundBuilder` [Getter]
- `getLowerBound()` → `NumberBoundBuilder` [Getter]
- `getUpperBound()` → `NumberBoundBuilder` [Getter]

### Quantity
**Implements:** `QuantitySchedule` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `Quantity` [Builder]

### QuantityBuilder
**Implements:** `Quantity` `QuantitySchedule$QuantityScheduleBuilder` 

**Key Methods:**
- `setValue(BigDecimal arg0)` → `QuantityBuilder` [Setter]
- `setMultiplier(Measure arg0)` → `QuantityBuilder` [Setter]
- `setDatedValue(List arg0)` → `QuantityBuilder` [Setter]
- `setFrequency(Frequency arg0)` → `QuantityBuilder` [Setter]
- `setUnit(UnitType arg0)` → `QuantityBuilder` [Setter]

### QuantitySchedule
**Implements:** `MeasureSchedule` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `QuantitySchedule` [Builder]
- `getMultiplier()` → `Measure` [Getter]
- `getFrequency()` → `Frequency` [Getter]

### QuantityScheduleBuilder
**Implements:** `QuantitySchedule` `MeasureSchedule$MeasureScheduleBuilder` 

**Key Methods:**
- `setValue(BigDecimal arg0)` → `QuantityScheduleBuilder` [Setter]
- `getMultiplier()` → `MeasureBuilder` [Getter]
- `setMultiplier(Measure arg0)` → `QuantityScheduleBuilder` [Setter]
- `getFrequency()` → `FrequencyBuilder` [Getter]
- `setDatedValue(List arg0)` → `QuantityScheduleBuilder` [Setter]
- `getOrCreateFrequency()` → `FrequencyBuilder` [Getter]
- `getOrCreateMultiplier()` → `MeasureBuilder` [Getter]
- `setFrequency(Frequency arg0)` → `QuantityScheduleBuilder` [Setter]
- `setUnit(UnitType arg0)` → `QuantityScheduleBuilder` [Setter]

### Rounding
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `Rounding` [Builder]
- `getRoundingDirection()` → `RoundingDirectionEnum` [Getter]
- `getPrecision()` → `Integer` [Getter]

### RoundingBuilder
**Implements:** `Rounding` `RosettaModelObjectBuilder` 

**Key Methods:**
- `setRoundingDirection(RoundingDirectionEnum arg0)` → `RoundingBuilder` [Setter]
- `setPrecision(Integer arg0)` → `RoundingBuilder` [Setter]

### Schedule
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getValue()` → `BigDecimal` [Getter]
- `getType()` → `Class` [Getter]
- `build()` → `Schedule` [Builder]
- `getDatedValue()` → `List` [Getter]

### ScheduleBuilder
**Implements:** `Schedule` `RosettaModelObjectBuilder` 

**Key Methods:**
- `setValue(BigDecimal arg0)` → `ScheduleBuilder` [Setter]
- `getDatedValue()` → `List` [Getter]
- `setDatedValue(List arg0)` → `ScheduleBuilder` [Setter]
- `getOrCreateDatedValue(int arg0)` → `DatedValueBuilder` [Getter]

### UnitType
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `UnitType` [Builder]
- `getCurrency()` → `FieldWithMetaString` [Getter]
- `getWeatherUnit()` → `WeatherUnitEnum` [Getter]
- `getCapacityUnit()` → `CapacityUnitEnum` [Getter]
- `getFinancialUnit()` → `FinancialUnitEnum` [Getter]

### UnitTypeBuilder
**Implements:** `UnitType` `RosettaModelObjectBuilder` 

**Key Methods:**
- `getCurrency()` → `FieldWithMetaStringBuilder` [Getter]
- `setCurrency(FieldWithMetaString arg0)` → `UnitTypeBuilder` [Setter]
- `setWeatherUnit(WeatherUnitEnum arg0)` → `UnitTypeBuilder` [Setter]
- `setCapacityUnit(CapacityUnitEnum arg0)` → `UnitTypeBuilder` [Setter]
- `getOrCreateCurrency()` → `FieldWithMetaStringBuilder` [Getter]
- `setFinancialUnit(FinancialUnitEnum arg0)` → `UnitTypeBuilder` [Setter]
- `setCurrencyValue(String arg0)` → `UnitTypeBuilder` [Setter]

## Concrete Classes

### AveragingCalculationMethodBuilderImpl
**Implements:** `AveragingCalculationMethod$AveragingCalculationMethodBuilder` 

**Fields:**
- `Boolean isWeighted`
- `AveragingCalculationMethodEnum calculationMethod`

**Key Methods:**
- `build()` → `AveragingCalculationMethod` [Builder]
- `getCalculationMethod()` → `AveragingCalculationMethodEnum` [Getter]
- `setIsWeighted(Boolean arg0)` → `AveragingCalculationMethodBuilder` [Setter]
- `setCalculationMethod(AveragingCalculationMethodEnum arg0)` → `AveragingCalculationMethodBuilder` [Setter]
- `getIsWeighted()` → `Boolean` [Getter]

### AveragingCalculationMethodImpl
**Implements:** `AveragingCalculationMethod` 

**Key Methods:**
- `build()` → `AveragingCalculationMethod` [Builder]
- `getCalculationMethod()` → `AveragingCalculationMethodEnum` [Getter]
- `getIsWeighted()` → `Boolean` [Getter]
- `setBuilderFields(AveragingCalculationMethodBuilder arg0)` → `void` [Setter]

### DatedValueBuilderImpl
**Implements:** `DatedValue$DatedValueBuilder` 

**Fields:**
- `Date date`
- `BigDecimal value`
- `MetaFieldsBuilder meta`

**Key Methods:**
- `getValue()` → `BigDecimal` [Getter]
- `setValue(BigDecimal arg0)` → `DatedValueBuilder` [Setter]
- `build()` → `DatedValue` [Builder]
- `setDate(Date arg0)` → `DatedValueBuilder` [Setter]
- `getDate()` → `Date` [Getter]
- `getOrCreateMeta()` → `MetaFieldsBuilder` [Getter]
- `setMeta(MetaFields arg0)` → `DatedValueBuilder` [Setter]
- `getMeta()` → `MetaFieldsBuilder` [Getter]

### DatedValueImpl
**Implements:** `DatedValue` 

**Key Methods:**
- `getValue()` → `BigDecimal` [Getter]
- `build()` → `DatedValue` [Builder]
- `getDate()` → `Date` [Getter]
- `setBuilderFields(DatedValueBuilder arg0)` → `void` [Setter]
- `getMeta()` → `MetaFields` [Getter]

### MeasureBaseBuilderImpl
**Implements:** `MeasureBase$MeasureBaseBuilder` 

**Fields:**
- `BigDecimal value`
- `UnitTypeBuilder unit`

**Key Methods:**
- `getValue()` → `BigDecimal` [Getter]
- `setValue(BigDecimal arg0)` → `MeasureBaseBuilder` [Setter]
- `build()` → `MeasureBase` [Builder]
- `getOrCreateUnit()` → `UnitTypeBuilder` [Getter]
- `getUnit()` → `UnitTypeBuilder` [Getter]
- `setUnit(UnitType arg0)` → `MeasureBaseBuilder` [Setter]

### MeasureBaseImpl
**Implements:** `MeasureBase` 

**Key Methods:**
- `getValue()` → `BigDecimal` [Getter]
- `build()` → `MeasureBase` [Builder]
- `setBuilderFields(MeasureBaseBuilder arg0)` → `void` [Setter]
- `getUnit()` → `UnitType` [Getter]

### MeasureBuilderImpl
**Extends:** `MeasureBase$MeasureBaseBuilderImpl` 
**Implements:** `Measure$MeasureBuilder` 

**Key Methods:**
- `setValue(BigDecimal arg0)` → `MeasureBuilder` [Setter]
- `build()` → `Measure` [Builder]
- `setUnit(UnitType arg0)` → `MeasureBuilder` [Setter]

### MeasureImpl
**Extends:** `MeasureBase$MeasureBaseImpl` 
**Implements:** `Measure` 

**Key Methods:**
- `build()` → `Measure` [Builder]
- `setBuilderFields(MeasureBuilder arg0)` → `void` [Setter]

### MeasureScheduleBuilderImpl
**Extends:** `MeasureBase$MeasureBaseBuilderImpl` 
**Implements:** `MeasureSchedule$MeasureScheduleBuilder` 

**Fields:**
- `List (List) datedValue`

**Key Methods:**
- `setValue(BigDecimal arg0)` → `MeasureScheduleBuilder` [Setter]
- `build()` → `MeasureSchedule` [Builder]
- `getDatedValue()` → `List` [Getter]
- `setDatedValue(List arg0)` → `MeasureScheduleBuilder` [Setter]
- `getOrCreateDatedValue(int arg0)` → `DatedValueBuilder` [Getter]
- `setUnit(UnitType arg0)` → `MeasureScheduleBuilder` [Setter]

### MeasureScheduleImpl
**Extends:** `MeasureBase$MeasureBaseImpl` 
**Implements:** `MeasureSchedule` 

**Key Methods:**
- `build()` → `MeasureSchedule` [Builder]
- `getDatedValue()` → `List` [Getter]
- `setBuilderFields(MeasureScheduleBuilder arg0)` → `void` [Setter]

### MoneyBoundBuilderImpl
**Implements:** `MoneyBound$MoneyBoundBuilder` 

**Fields:**
- `MoneyBuilder money`
- `Boolean inclusive`

**Key Methods:**
- `build()` → `MoneyBound` [Builder]
- `getInclusive()` → `Boolean` [Getter]
- `setInclusive(Boolean arg0)` → `MoneyBoundBuilder` [Setter]
- `getOrCreateMoney()` → `MoneyBuilder` [Getter]
- `setMoney(Money arg0)` → `MoneyBoundBuilder` [Setter]
- `getMoney()` → `MoneyBuilder` [Getter]

### MoneyBoundImpl
**Implements:** `MoneyBound` 

**Key Methods:**
- `build()` → `MoneyBound` [Builder]
- `getInclusive()` → `Boolean` [Getter]
- `setBuilderFields(MoneyBoundBuilder arg0)` → `void` [Setter]
- `getMoney()` → `Money` [Getter]

### MoneyRangeBuilderImpl
**Implements:** `MoneyRange$MoneyRangeBuilder` 

**Fields:**
- `MoneyBoundBuilder lowerBound`
- `MoneyBoundBuilder upperBound`

**Key Methods:**
- `build()` → `MoneyRange` [Builder]
- `setLowerBound(MoneyBound arg0)` → `MoneyRangeBuilder` [Setter]
- `setUpperBound(MoneyBound arg0)` → `MoneyRangeBuilder` [Setter]
- `getOrCreateUpperBound()` → `MoneyBoundBuilder` [Getter]
- `getOrCreateLowerBound()` → `MoneyBoundBuilder` [Getter]
- `getLowerBound()` → `MoneyBoundBuilder` [Getter]
- `getUpperBound()` → `MoneyBoundBuilder` [Getter]

### MoneyRangeImpl
**Implements:** `MoneyRange` 

**Key Methods:**
- `build()` → `MoneyRange` [Builder]
- `setBuilderFields(MoneyRangeBuilder arg0)` → `void` [Setter]
- `getLowerBound()` → `MoneyBound` [Getter]
- `getUpperBound()` → `MoneyBound` [Getter]

### NonNegativeQuantityBuilderImpl
**Extends:** `Quantity$QuantityBuilderImpl` 
**Implements:** `NonNegativeQuantity$NonNegativeQuantityBuilder` 

**Key Methods:**
- `setValue(BigDecimal arg0)` → `NonNegativeQuantityBuilder` [Setter]
- `build()` → `NonNegativeQuantity` [Builder]
- `setMultiplier(Measure arg0)` → `NonNegativeQuantityBuilder` [Setter]
- `setDatedValue(List arg0)` → `NonNegativeQuantityBuilder` [Setter]
- `setFrequency(Frequency arg0)` → `NonNegativeQuantityBuilder` [Setter]
- `setUnit(UnitType arg0)` → `NonNegativeQuantityBuilder` [Setter]

### NonNegativeQuantityImpl
**Extends:** `Quantity$QuantityImpl` 
**Implements:** `NonNegativeQuantity` 

**Key Methods:**
- `build()` → `NonNegativeQuantity` [Builder]
- `setBuilderFields(NonNegativeQuantityBuilder arg0)` → `void` [Setter]

### NonNegativeQuantityScheduleBuilderImpl
**Extends:** `QuantitySchedule$QuantityScheduleBuilderImpl` 
**Implements:** `NonNegativeQuantitySchedule$NonNegativeQuantityScheduleBuilder` 

**Key Methods:**
- `setValue(BigDecimal arg0)` → `NonNegativeQuantityScheduleBuilder` [Setter]
- `build()` → `NonNegativeQuantitySchedule` [Builder]
- `setMultiplier(Measure arg0)` → `NonNegativeQuantityScheduleBuilder` [Setter]
- `setDatedValue(List arg0)` → `NonNegativeQuantityScheduleBuilder` [Setter]
- `setFrequency(Frequency arg0)` → `NonNegativeQuantityScheduleBuilder` [Setter]
- `setUnit(UnitType arg0)` → `NonNegativeQuantityScheduleBuilder` [Setter]

### NonNegativeQuantityScheduleImpl
**Extends:** `QuantitySchedule$QuantityScheduleImpl` 
**Implements:** `NonNegativeQuantitySchedule` 

**Key Methods:**
- `build()` → `NonNegativeQuantitySchedule` [Builder]
- `setBuilderFields(NonNegativeQuantityScheduleBuilder arg0)` → `void` [Setter]

### NonNegativeStepBuilderImpl
**Implements:** `NonNegativeStep$NonNegativeStepBuilder` 

**Fields:**
- `Date stepDate`
- `BigDecimal stepValue`
- `MetaFieldsBuilder meta`

**Key Methods:**
- `build()` → `NonNegativeStep` [Builder]
- `getOrCreateMeta()` → `MetaFieldsBuilder` [Getter]
- `setMeta(MetaFields arg0)` → `NonNegativeStepBuilder` [Setter]
- `getMeta()` → `MetaFieldsBuilder` [Getter]
- `getStepDate()` → `Date` [Getter]
- `getStepValue()` → `BigDecimal` [Getter]
- `setStepDate(Date arg0)` → `NonNegativeStepBuilder` [Setter]
- `setStepValue(BigDecimal arg0)` → `NonNegativeStepBuilder` [Setter]

### NonNegativeStepImpl
**Implements:** `NonNegativeStep` 

**Key Methods:**
- `build()` → `NonNegativeStep` [Builder]
- `setBuilderFields(NonNegativeStepBuilder arg0)` → `void` [Setter]
- `getMeta()` → `MetaFields` [Getter]
- `getStepDate()` → `Date` [Getter]
- `getStepValue()` → `BigDecimal` [Getter]

### NumberBoundBuilderImpl
**Implements:** `NumberBound$NumberBoundBuilder` 

**Fields:**
- `BigDecimal number`
- `Boolean inclusive`

**Key Methods:**
- `build()` → `NumberBound` [Builder]
- `getNumber()` → `BigDecimal` [Getter]
- `getInclusive()` → `Boolean` [Getter]
- `setInclusive(Boolean arg0)` → `NumberBoundBuilder` [Setter]
- `setNumber(BigDecimal arg0)` → `NumberBoundBuilder` [Setter]

### NumberBoundImpl
**Implements:** `NumberBound` 

**Key Methods:**
- `build()` → `NumberBound` [Builder]
- `getNumber()` → `BigDecimal` [Getter]
- `getInclusive()` → `Boolean` [Getter]
- `setBuilderFields(NumberBoundBuilder arg0)` → `void` [Setter]

### NumberRangeBuilderImpl
**Implements:** `NumberRange$NumberRangeBuilder` 

**Fields:**
- `NumberBoundBuilder lowerBound`
- `NumberBoundBuilder upperBound`

**Key Methods:**
- `build()` → `NumberRange` [Builder]
- `setLowerBound(NumberBound arg0)` → `NumberRangeBuilder` [Setter]
- `setUpperBound(NumberBound arg0)` → `NumberRangeBuilder` [Setter]
- `getOrCreateUpperBound()` → `NumberBoundBuilder` [Getter]
- `getOrCreateLowerBound()` → `NumberBoundBuilder` [Getter]
- `getLowerBound()` → `NumberBoundBuilder` [Getter]
- `getUpperBound()` → `NumberBoundBuilder` [Getter]

### NumberRangeImpl
**Implements:** `NumberRange` 

**Key Methods:**
- `build()` → `NumberRange` [Builder]
- `setBuilderFields(NumberRangeBuilder arg0)` → `void` [Setter]
- `getLowerBound()` → `NumberBound` [Getter]
- `getUpperBound()` → `NumberBound` [Getter]

### QuantityBuilderImpl
**Extends:** `QuantitySchedule$QuantityScheduleBuilderImpl` 
**Implements:** `Quantity$QuantityBuilder` 

**Key Methods:**
- `setValue(BigDecimal arg0)` → `QuantityBuilder` [Setter]
- `build()` → `Quantity` [Builder]
- `setMultiplier(Measure arg0)` → `QuantityBuilder` [Setter]
- `setDatedValue(List arg0)` → `QuantityBuilder` [Setter]
- `setFrequency(Frequency arg0)` → `QuantityBuilder` [Setter]
- `setUnit(UnitType arg0)` → `QuantityBuilder` [Setter]

### QuantityImpl
**Extends:** `QuantitySchedule$QuantityScheduleImpl` 
**Implements:** `Quantity` 

**Key Methods:**
- `build()` → `Quantity` [Builder]
- `setBuilderFields(QuantityBuilder arg0)` → `void` [Setter]

### QuantityScheduleBuilderImpl
**Extends:** `MeasureSchedule$MeasureScheduleBuilderImpl` 
**Implements:** `QuantitySchedule$QuantityScheduleBuilder` 

**Fields:**
- `MeasureBuilder multiplier`
- `FrequencyBuilder frequency`

**Key Methods:**
- `setValue(BigDecimal arg0)` → `QuantityScheduleBuilder` [Setter]
- `build()` → `QuantitySchedule` [Builder]
- `getMultiplier()` → `MeasureBuilder` [Getter]
- `setMultiplier(Measure arg0)` → `QuantityScheduleBuilder` [Setter]
- `getFrequency()` → `FrequencyBuilder` [Getter]
- `setDatedValue(List arg0)` → `QuantityScheduleBuilder` [Setter]
- `getOrCreateFrequency()` → `FrequencyBuilder` [Getter]
- `getOrCreateMultiplier()` → `MeasureBuilder` [Getter]
- `setFrequency(Frequency arg0)` → `QuantityScheduleBuilder` [Setter]
- `setUnit(UnitType arg0)` → `QuantityScheduleBuilder` [Setter]

### QuantityScheduleImpl
**Extends:** `MeasureSchedule$MeasureScheduleImpl` 
**Implements:** `QuantitySchedule` 

**Key Methods:**
- `build()` → `QuantitySchedule` [Builder]
- `getMultiplier()` → `Measure` [Getter]
- `getFrequency()` → `Frequency` [Getter]
- `setBuilderFields(QuantityScheduleBuilder arg0)` → `void` [Setter]

### RoundingBuilderImpl
**Implements:** `Rounding$RoundingBuilder` 

**Fields:**
- `RoundingDirectionEnum roundingDirection`
- `Integer precision`

**Key Methods:**
- `build()` → `Rounding` [Builder]
- `getRoundingDirection()` → `RoundingDirectionEnum` [Getter]
- `setRoundingDirection(RoundingDirectionEnum arg0)` → `RoundingBuilder` [Setter]
- `setPrecision(Integer arg0)` → `RoundingBuilder` [Setter]
- `getPrecision()` → `Integer` [Getter]

### RoundingImpl
**Implements:** `Rounding` 

**Key Methods:**
- `build()` → `Rounding` [Builder]
- `getRoundingDirection()` → `RoundingDirectionEnum` [Getter]
- `setBuilderFields(RoundingBuilder arg0)` → `void` [Setter]
- `getPrecision()` → `Integer` [Getter]

### ScheduleBuilderImpl
**Implements:** `Schedule$ScheduleBuilder` 

**Fields:**
- `BigDecimal value`
- `List (List) datedValue`

**Key Methods:**
- `getValue()` → `BigDecimal` [Getter]
- `setValue(BigDecimal arg0)` → `ScheduleBuilder` [Setter]
- `build()` → `Schedule` [Builder]
- `getDatedValue()` → `List` [Getter]
- `setDatedValue(List arg0)` → `ScheduleBuilder` [Setter]
- `getOrCreateDatedValue(int arg0)` → `DatedValueBuilder` [Getter]

### ScheduleImpl
**Implements:** `Schedule` 

**Key Methods:**
- `getValue()` → `BigDecimal` [Getter]
- `build()` → `Schedule` [Builder]
- `getDatedValue()` → `List` [Getter]
- `setBuilderFields(ScheduleBuilder arg0)` → `void` [Setter]

### UnitTypeBuilderImpl
**Implements:** `UnitType$UnitTypeBuilder` 

**Fields:**
- `CapacityUnitEnum capacityUnit`
- `WeatherUnitEnum weatherUnit`
- `FinancialUnitEnum financialUnit`
- `FieldWithMetaStringBuilder currency`

**Key Methods:**
- `build()` → `UnitType` [Builder]
- `getCurrency()` → `FieldWithMetaStringBuilder` [Getter]
- `setCurrency(FieldWithMetaString arg0)` → `UnitTypeBuilder` [Setter]
- `setWeatherUnit(WeatherUnitEnum arg0)` → `UnitTypeBuilder` [Setter]
- `setCapacityUnit(CapacityUnitEnum arg0)` → `UnitTypeBuilder` [Setter]
- `getWeatherUnit()` → `WeatherUnitEnum` [Getter]
- `getCapacityUnit()` → `CapacityUnitEnum` [Getter]
- `getFinancialUnit()` → `FinancialUnitEnum` [Getter]
- `getOrCreateCurrency()` → `FieldWithMetaStringBuilder` [Getter]
- `setFinancialUnit(FinancialUnitEnum arg0)` → `UnitTypeBuilder` [Setter]

### UnitTypeImpl
**Implements:** `UnitType` 

**Key Methods:**
- `build()` → `UnitType` [Builder]
- `getCurrency()` → `FieldWithMetaString` [Getter]
- `getWeatherUnit()` → `WeatherUnitEnum` [Getter]
- `getCapacityUnit()` → `CapacityUnitEnum` [Getter]
- `setBuilderFields(UnitTypeBuilder arg0)` → `void` [Setter]
- `getFinancialUnit()` → `FinancialUnitEnum` [Getter]

