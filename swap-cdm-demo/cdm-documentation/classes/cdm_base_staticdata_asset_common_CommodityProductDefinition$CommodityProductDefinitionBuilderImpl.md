# CommodityProductDefinitionBuilderImpl

**Full Name:** `cdm.base.staticdata.asset.common.CommodityProductDefinition$CommodityProductDefinitionBuilderImpl`

**Package:** `cdm.base.staticdata.asset.common`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.base.staticdata.asset.common.CommodityProductDefinition$CommodityProductDefinitionBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| referenceFramework | `CommodityReferenceFrameworkBuilder` |  |
| priceSource | `PriceSourceBuilder` |  |
| commodityInfoPublisher | `CommodityInformationPublisherEnum` |  |
| exchangeId | `FieldWithMetaStringBuilder` |  |

### Methods

#### Builder Methods

- `CommodityProductDefinition build()`

#### Setter Methods

- `CommodityProductDefinitionBuilder setExchangeIdValue(String arg0)`
- `CommodityProductDefinitionBuilder setExchangeId(FieldWithMetaString arg0)`
- `CommodityProductDefinitionBuilder setReferenceFramework(CommodityReferenceFramework arg0)`
- `CommodityProductDefinitionBuilder setPriceSource(PriceSource arg0)`
- `CommodityProductDefinitionBuilder setCommodityInfoPublisher(CommodityInformationPublisherEnum arg0)`

#### Getter Methods

- `CommodityReferenceFrameworkBuilder getOrCreateReferenceFramework()`
- `PriceSourceBuilder getOrCreatePriceSource()`
- `FieldWithMetaStringBuilder getOrCreateExchangeId()`
- `CommodityReferenceFrameworkBuilder getReferenceFramework()`
- `FieldWithMetaStringBuilder getExchangeId()`
- `CommodityInformationPublisherEnum getCommodityInfoPublisher()`
- `PriceSourceBuilder getPriceSource()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `CommodityProductDefinitionBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `boolean hasData()`
- `CommodityProductDefinitionBuilder toBuilder()`
- `CommodityProductDefinitionBuilder prune()`

