# PriceSourceBuilderImpl

**Full Name:** `cdm.base.staticdata.asset.common.PriceSource$PriceSourceBuilderImpl`

**Package:** `cdm.base.staticdata.asset.common`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.base.staticdata.asset.common.PriceSource$PriceSourceBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| pricePublisher | `FieldWithMetaStringBuilder` |  |
| priceSourceLocation | `String` |  |
| priceSourceHeading | `String` |  |
| priceSourceTime | `LocalTime` |  |

### Methods

#### Builder Methods

- `PriceSource build()`

#### Setter Methods

- `PriceSourceBuilder setPricePublisher(FieldWithMetaString arg0)`
- `PriceSourceBuilder setPricePublisherValue(String arg0)`
- `PriceSourceBuilder setPriceSourceLocation(String arg0)`
- `PriceSourceBuilder setPriceSourceHeading(String arg0)`
- `PriceSourceBuilder setPriceSourceTime(LocalTime arg0)`

#### Getter Methods

- `String getPriceSourceHeading()`
- `String getPriceSourceLocation()`
- `LocalTime getPriceSourceTime()`
- `FieldWithMetaStringBuilder getPricePublisher()`
- `FieldWithMetaStringBuilder getOrCreatePricePublisher()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `PriceSourceBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `boolean hasData()`
- `PriceSourceBuilder toBuilder()`
- `PriceSourceBuilder prune()`

