# Package: cdm.observable.asset.fro

## Enums

### FloatingRateIndexCalculationMethodEnum
**Values:**
- `OIS Compounding`
- `Overnight Averaging`
- `Compounded Index`
- `All-In Compounded Index`

### FloatingRateIndexCategoryEnum
**Values:**
- `Screen Rate`
- `Calculated Rate`
- `Reference Banks Rate`

### FloatingRateIndexStyleEnum
**Values:**
- `Average FRO`
- `Compounded FRO`
- `Compounded Index`
- `Index`
- `Other`
- `Overnight Rate`
- `Published Average Rate`
- `Specified Formula`
- `Swap Rate`
- `Term Rate`

## Interfaces

### FloatingRateIndexCalculationDefaults
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getMethod()` → `FloatingRateIndexCalculationMethodEnum` [Getter]
- `getType()` → `Class` [Getter]
- `build()` → `FloatingRateIndexCalculationDefaults` [Builder]
- `getIndexStyle()` → `FloatingRateIndexStyleEnum` [Getter]
- `getCategory()` → `FloatingRateIndexCategoryEnum` [Getter]

### FloatingRateIndexCalculationDefaultsBuilder
**Implements:** `FloatingRateIndexCalculationDefaults` `RosettaModelObjectBuilder` 

**Key Methods:**
- `setMethod(FloatingRateIndexCalculationMethodEnum arg0)` → `FloatingRateIndexCalculationDefaultsBuilder` [Setter]
- `setCategory(FloatingRateIndexCategoryEnum arg0)` → `FloatingRateIndexCalculationDefaultsBuilder` [Setter]
- `setIndexStyle(FloatingRateIndexStyleEnum arg0)` → `FloatingRateIndexCalculationDefaultsBuilder` [Setter]

### FloatingRateIndexDefinition
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `FloatingRateIndexDefinition` [Builder]
- `getCalculationDefaults()` → `FloatingRateIndexCalculationDefaults` [Getter]
- `getFro()` → `FloatingRateIndexIdentification` [Getter]

### FloatingRateIndexDefinitionBuilder
**Implements:** `FloatingRateIndexDefinition` `RosettaModelObjectBuilder` 

**Key Methods:**
- `getCalculationDefaults()` → `FloatingRateIndexCalculationDefaultsBuilder` [Getter]
- `getFro()` → `FloatingRateIndexIdentificationBuilder` [Getter]
- `getOrCreateFro()` → `FloatingRateIndexIdentificationBuilder` [Getter]
- `setCalculationDefaults(FloatingRateIndexCalculationDefaults arg0)` → `FloatingRateIndexDefinitionBuilder` [Setter]
- `setFro(FloatingRateIndexIdentification arg0)` → `FloatingRateIndexDefinitionBuilder` [Setter]
- `getOrCreateCalculationDefaults()` → `FloatingRateIndexCalculationDefaultsBuilder` [Getter]

### FloatingRateIndexIdentification
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `FloatingRateIndexIdentification` [Builder]
- `getCurrency()` → `ISOCurrencyCodeEnum` [Getter]
- `getFloatingRateIndex()` → `FieldWithMetaFloatingRateIndexEnum` [Getter]
- `getFroType()` → `String` [Getter]

### FloatingRateIndexIdentificationBuilder
**Implements:** `FloatingRateIndexIdentification` `RosettaModelObjectBuilder` 

**Key Methods:**
- `setCurrency(ISOCurrencyCodeEnum arg0)` → `FloatingRateIndexIdentificationBuilder` [Setter]
- `setFloatingRateIndexValue(FloatingRateIndexEnum arg0)` → `FloatingRateIndexIdentificationBuilder` [Setter]
- `getFloatingRateIndex()` → `FieldWithMetaFloatingRateIndexEnumBuilder` [Getter]
- `setFloatingRateIndex(FieldWithMetaFloatingRateIndexEnum arg0)` → `FloatingRateIndexIdentificationBuilder` [Setter]
- `getOrCreateFloatingRateIndex()` → `FieldWithMetaFloatingRateIndexEnumBuilder` [Getter]
- `setFroType(String arg0)` → `FloatingRateIndexIdentificationBuilder` [Setter]

## Concrete Classes

### FloatingRateIndexCalculationDefaultsBuilderImpl
**Implements:** `FloatingRateIndexCalculationDefaults$FloatingRateIndexCalculationDefaultsBuilder` 

**Fields:**
- `FloatingRateIndexCategoryEnum category`
- `FloatingRateIndexStyleEnum indexStyle`
- `FloatingRateIndexCalculationMethodEnum method`

**Key Methods:**
- `getMethod()` → `FloatingRateIndexCalculationMethodEnum` [Getter]
- `build()` → `FloatingRateIndexCalculationDefaults` [Builder]
- `setMethod(FloatingRateIndexCalculationMethodEnum arg0)` → `FloatingRateIndexCalculationDefaultsBuilder` [Setter]
- `setCategory(FloatingRateIndexCategoryEnum arg0)` → `FloatingRateIndexCalculationDefaultsBuilder` [Setter]
- `getIndexStyle()` → `FloatingRateIndexStyleEnum` [Getter]
- `setIndexStyle(FloatingRateIndexStyleEnum arg0)` → `FloatingRateIndexCalculationDefaultsBuilder` [Setter]
- `getCategory()` → `FloatingRateIndexCategoryEnum` [Getter]

### FloatingRateIndexCalculationDefaultsImpl
**Implements:** `FloatingRateIndexCalculationDefaults` 

**Key Methods:**
- `getMethod()` → `FloatingRateIndexCalculationMethodEnum` [Getter]
- `build()` → `FloatingRateIndexCalculationDefaults` [Builder]
- `setBuilderFields(FloatingRateIndexCalculationDefaultsBuilder arg0)` → `void` [Setter]
- `getIndexStyle()` → `FloatingRateIndexStyleEnum` [Getter]
- `getCategory()` → `FloatingRateIndexCategoryEnum` [Getter]

### FloatingRateIndexDefinitionBuilderImpl
**Implements:** `FloatingRateIndexDefinition$FloatingRateIndexDefinitionBuilder` 

**Fields:**
- `FloatingRateIndexIdentificationBuilder fro`
- `FloatingRateIndexCalculationDefaultsBuilder calculationDefaults`

**Key Methods:**
- `build()` → `FloatingRateIndexDefinition` [Builder]
- `getCalculationDefaults()` → `FloatingRateIndexCalculationDefaultsBuilder` [Getter]
- `getFro()` → `FloatingRateIndexIdentificationBuilder` [Getter]
- `getOrCreateFro()` → `FloatingRateIndexIdentificationBuilder` [Getter]
- `setCalculationDefaults(FloatingRateIndexCalculationDefaults arg0)` → `FloatingRateIndexDefinitionBuilder` [Setter]
- `setFro(FloatingRateIndexIdentification arg0)` → `FloatingRateIndexDefinitionBuilder` [Setter]
- `getOrCreateCalculationDefaults()` → `FloatingRateIndexCalculationDefaultsBuilder` [Getter]

### FloatingRateIndexDefinitionImpl
**Implements:** `FloatingRateIndexDefinition` 

**Key Methods:**
- `build()` → `FloatingRateIndexDefinition` [Builder]
- `setBuilderFields(FloatingRateIndexDefinitionBuilder arg0)` → `void` [Setter]
- `getCalculationDefaults()` → `FloatingRateIndexCalculationDefaults` [Getter]
- `getFro()` → `FloatingRateIndexIdentification` [Getter]

### FloatingRateIndexIdentificationBuilderImpl
**Implements:** `FloatingRateIndexIdentification$FloatingRateIndexIdentificationBuilder` 

**Fields:**
- `FieldWithMetaFloatingRateIndexEnumBuilder floatingRateIndex`
- `ISOCurrencyCodeEnum currency`
- `String froType`

**Key Methods:**
- `build()` → `FloatingRateIndexIdentification` [Builder]
- `getCurrency()` → `ISOCurrencyCodeEnum` [Getter]
- `setCurrency(ISOCurrencyCodeEnum arg0)` → `FloatingRateIndexIdentificationBuilder` [Setter]
- `setFloatingRateIndexValue(FloatingRateIndexEnum arg0)` → `FloatingRateIndexIdentificationBuilder` [Setter]
- `getFloatingRateIndex()` → `FieldWithMetaFloatingRateIndexEnumBuilder` [Getter]
- `setFloatingRateIndex(FieldWithMetaFloatingRateIndexEnum arg0)` → `FloatingRateIndexIdentificationBuilder` [Setter]
- `getOrCreateFloatingRateIndex()` → `FieldWithMetaFloatingRateIndexEnumBuilder` [Getter]
- `getFroType()` → `String` [Getter]
- `setFroType(String arg0)` → `FloatingRateIndexIdentificationBuilder` [Setter]

### FloatingRateIndexIdentificationImpl
**Implements:** `FloatingRateIndexIdentification` 

**Key Methods:**
- `build()` → `FloatingRateIndexIdentification` [Builder]
- `getCurrency()` → `ISOCurrencyCodeEnum` [Getter]
- `setBuilderFields(FloatingRateIndexIdentificationBuilder arg0)` → `void` [Setter]
- `getFloatingRateIndex()` → `FieldWithMetaFloatingRateIndexEnum` [Getter]
- `getFroType()` → `String` [Getter]

