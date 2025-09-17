# UnitTypeBuilderImpl

**Full Name:** `cdm.base.math.UnitType$UnitTypeBuilderImpl`

**Package:** `cdm.base.math`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.base.math.UnitType$UnitTypeBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| capacityUnit | `CapacityUnitEnum` |  |
| weatherUnit | `WeatherUnitEnum` |  |
| financialUnit | `FinancialUnitEnum` |  |
| currency | `FieldWithMetaStringBuilder` |  |

### Methods

#### Builder Methods

- `UnitType build()`

#### Setter Methods

- `UnitTypeBuilder setCurrency(FieldWithMetaString arg0)`
- `UnitTypeBuilder setCurrencyValue(String arg0)`
- `UnitTypeBuilder setFinancialUnit(FinancialUnitEnum arg0)`
- `UnitTypeBuilder setCapacityUnit(CapacityUnitEnum arg0)`
- `UnitTypeBuilder setWeatherUnit(WeatherUnitEnum arg0)`

#### Getter Methods

- `FieldWithMetaStringBuilder getCurrency()`
- `FinancialUnitEnum getFinancialUnit()`
- `FieldWithMetaStringBuilder getOrCreateCurrency()`
- `CapacityUnitEnum getCapacityUnit()`
- `WeatherUnitEnum getWeatherUnit()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `UnitTypeBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `UnitTypeBuilder prune()`
- `UnitTypeBuilder toBuilder()`
- `boolean hasData()`

