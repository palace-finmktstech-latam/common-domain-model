# CommodityProductDefinitionBuilder

**Full Name:** `cdm.base.staticdata.asset.common.CommodityProductDefinition$CommodityProductDefinitionBuilder`

**Package:** `cdm.base.staticdata.asset.common`

## Type: Interface

### Implemented Interfaces

- `cdm.base.staticdata.asset.common.CommodityProductDefinition`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`

### Methods

#### Setter Methods

- `CommodityProductDefinitionBuilder setPriceSource(PriceSource arg0)`
- `CommodityProductDefinitionBuilder setExchangeId(FieldWithMetaString arg0)`
- `CommodityProductDefinitionBuilder setCommodityInfoPublisher(CommodityInformationPublisherEnum arg0)`
- `CommodityProductDefinitionBuilder setReferenceFramework(CommodityReferenceFramework arg0)`
- `CommodityProductDefinitionBuilder setExchangeIdValue(String arg0)`

#### Getter Methods

- `FieldWithMetaStringBuilder getExchangeId()`
- `PriceSourceBuilder getPriceSource()`
- `FieldWithMetaStringBuilder getOrCreateExchangeId()`
- `CommodityReferenceFrameworkBuilder getReferenceFramework()`
- `PriceSourceBuilder getOrCreatePriceSource()`
- `CommodityReferenceFrameworkBuilder getOrCreateReferenceFramework()`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `CommodityProductDefinitionBuilder prune()`

