# Package: cdm.observable.asset.processor

## Concrete Classes

### 

### CalculationAgentPartyMappingProcessor
**Extends:** `MappingProcessor` 

**Key Methods:**
- `getAncillaryRoleEnum()` → `Optional` [Getter]

### CommoditySchedulesMappingProcessor
**Extends:** `MappingProcessor` 

**Key Methods:**
- `setDatedValue(List arg0, int arg1, LocalDate arg2)` → `void` [Setter]
- `getNextPeriodStartDate(PeriodEnum arg0, LocalDate arg1, int arg2, boolean arg3)` → `LocalDate` [Getter]

### FloatingRateCalculationMappingProcessor
**Extends:** `MappingProcessor` 

**Key Methods:**
- `getStep(Path arg0, Path arg1, int arg2)` → `Optional` [Getter]
- `getSteps(Path arg0, Path arg1)` → `List` [Getter]

### IndexAssetClassMappingProcessor
**Extends:** `MappingProcessor` 

**Key Methods:**
- `setAssetClass(RosettaModelObjectBuilder arg0, AssetClassEnum arg1)` → `void` [Setter]

### NumberOfOptionsMappingProcessor
**Extends:** `MappingProcessor` 

**Key Methods:**
- `setAmountAndUnit(Path arg0, NonNegativeQuantityScheduleBuilder arg1, int arg2)` → `void` [Setter]
- `setMultiplierAndUnit(Path arg0, NonNegativeQuantityScheduleBuilder arg1)` → `void` [Setter]

### OrePriceMappingProcessor
**Extends:** `MappingProcessor` 

### OreQuantityMappingProcessor
**Extends:** `MappingProcessor` 

### PriceQuantityHelper

### PriceUnitTypeHelper

**Key Methods:**
- `getPackageSpreadCurrency(Path arg0)` → `Optional` [Getter]
- `getNonNullMappingId(Path arg0, String arg1)` → `Optional` [Getter]
- `setFxOptionRateUnits(PriceScheduleBuilder arg0, Path arg1, String arg2)` → `void` [Setter]
- `getPerUnitOfIndexOrShare()` → `FinancialUnitEnum` [Getter]
- `getBasePath(Path arg0)` → `Path` [Getter]

### PriceUnitTypeMappingProcessor
**Extends:** `MappingProcessor` 

### TotalNotionalQuantityMappingProcessor
**Extends:** `MappingProcessor` 

**Key Methods:**
- `getCapacityUnitEnum(Path arg0)` → `Optional` [Getter]
- `getTotalNotionalQuantity(Path arg0, int arg1)` → `Optional` [Getter]

### VegaNotionalAmountMappingProcessor
**Extends:** `VegaNotionalAmountMappingProcessor` 

