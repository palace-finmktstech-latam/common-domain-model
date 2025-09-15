# PriceUnitTypeHelper

**Full Name:** `cdm.observable.asset.processor.PriceUnitTypeHelper`

**Package:** `cdm.observable.asset.processor`

## Type: Concrete Class

### Methods

#### Setter Methods

- `void setFxOptionRateUnits(PriceScheduleBuilder arg0, Path arg1, String arg2)`

#### Getter Methods

- `Optional getPackageSpreadCurrency(Path arg0)`
- `Optional getNonNullMappingId(Path arg0, String arg1)`
- `FinancialUnitEnum getPerUnitOfIndexOrShare()`
- `Path getBasePath(Path arg0)`

#### Other Methods

- `String[] toArray(List arg0)`
- `boolean exists(List arg0)`
- `UnitTypeBuilder toCurrencyUnitType(Mapping arg0)`
- `boolean updateCurrencyPerCapacityUnit(PriceScheduleBuilder arg0, Path arg1, String arg2, List arg3, List arg4)`
- `boolean updateCurrencyPerCurrencyUnit(PriceScheduleBuilder arg0, Path arg1, String arg2, String[] arg3)`
- `boolean updateCurrencyPerFinancialUnit(PriceScheduleBuilder arg0, Path arg1, String arg2, List arg3, FinancialUnitEnum arg4)`
- `boolean updateCurrencyPerCurrencyUnitFromQuotedCurrencyPair(PriceScheduleBuilder arg0, Path arg1, String arg2, List arg3)`
- `boolean updatePackagePrice(PriceScheduleBuilder arg0, Path arg1)`
- `boolean updateFxOption(PriceScheduleBuilder arg0, Path arg1)`
- `void updateBuilder(PriceScheduleBuilder arg0, UnitTypeBuilder arg1, UnitTypeBuilder arg2)`
- `UnitTypeBuilder toCapacityUnitEnumType(Mapping arg0)`
- `boolean mapUnitType(Path arg0, PriceScheduleBuilder arg1)`
- `boolean updatePackageSpread(PriceScheduleBuilder arg0, Path arg1)`
- `Mapping findReference(Path arg0, Mapping arg1)`

