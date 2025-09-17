# CommodityReferenceFrameworkBuilderImpl

**Full Name:** `cdm.base.staticdata.asset.common.CommodityReferenceFramework$CommodityReferenceFrameworkBuilderImpl`

**Package:** `cdm.base.staticdata.asset.common`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.base.staticdata.asset.common.CommodityReferenceFramework$CommodityReferenceFrameworkBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| commodityName | `String` |  |
| capacityUnit | `CapacityUnitEnum` |  |
| weatherUnit | `WeatherUnitEnum` |  |
| currency | `FieldWithMetaStringBuilder` |  |

### Methods

#### Builder Methods

- `CommodityReferenceFramework build()`

#### Setter Methods

- `CommodityReferenceFrameworkBuilder setCurrency(FieldWithMetaString arg0)`
- `CommodityReferenceFrameworkBuilder setCommodityName(String arg0)`
- `CommodityReferenceFrameworkBuilder setCurrencyValue(String arg0)`
- `CommodityReferenceFrameworkBuilder setCapacityUnit(CapacityUnitEnum arg0)`
- `CommodityReferenceFrameworkBuilder setWeatherUnit(WeatherUnitEnum arg0)`

#### Getter Methods

- `FieldWithMetaStringBuilder getCurrency()`
- `FieldWithMetaStringBuilder getOrCreateCurrency()`
- `CapacityUnitEnum getCapacityUnit()`
- `WeatherUnitEnum getWeatherUnit()`
- `String getCommodityName()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `CommodityReferenceFrameworkBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `CommodityReferenceFrameworkBuilder prune()`
- `CommodityReferenceFrameworkBuilder toBuilder()`
- `boolean hasData()`

