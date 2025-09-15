# CommodityProductDefinitionBuilder

**Full Name:** `cdm.base.staticdata.asset.common.CommodityProductDefinition$CommodityProductDefinitionBuilder`

**Package:** `cdm.base.staticdata.asset.common`

## Type: Interface

### Implemented Interfaces

- `cdm.base.staticdata.asset.common.CommodityProductDefinition`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`

### Methods

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
- `PriceSourceBuilder getPriceSource()`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `CommodityProductDefinitionBuilder prune()`

