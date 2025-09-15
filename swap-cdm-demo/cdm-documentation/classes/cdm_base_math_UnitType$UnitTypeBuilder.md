# UnitTypeBuilder

**Full Name:** `cdm.base.math.UnitType$UnitTypeBuilder`

**Package:** `cdm.base.math`

## Type: Interface

### Implemented Interfaces

- `cdm.base.math.UnitType`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`

### Methods

#### Setter Methods

- `UnitTypeBuilder setCurrency(FieldWithMetaString arg0)`
- `UnitTypeBuilder setWeatherUnit(WeatherUnitEnum arg0)`
- `UnitTypeBuilder setCapacityUnit(CapacityUnitEnum arg0)`
- `UnitTypeBuilder setFinancialUnit(FinancialUnitEnum arg0)`
- `UnitTypeBuilder setCurrencyValue(String arg0)`

#### Getter Methods

- `FieldWithMetaStringBuilder getCurrency()`
- `FieldWithMetaStringBuilder getOrCreateCurrency()`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `UnitTypeBuilder prune()`

