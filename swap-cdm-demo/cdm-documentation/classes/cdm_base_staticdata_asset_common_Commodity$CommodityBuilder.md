# CommodityBuilder

**Full Name:** `cdm.base.staticdata.asset.common.Commodity$CommodityBuilder`

**Package:** `cdm.base.staticdata.asset.common`

## Type: Interface

### Implemented Interfaces

- `cdm.base.staticdata.asset.common.Commodity`
- `cdm.base.staticdata.asset.common.AssetBase$AssetBaseBuilder`

### Methods

#### Setter Methods

- `CommodityBuilder setIdentifier(List arg0)`
- `CommodityBuilder setDescription(String arg0)`
- `CommodityBuilder setTaxonomy(List arg0)`
- `CommodityBuilder setExchange(LegalEntity arg0)`
- `CommodityBuilder setIsExchangeListed(Boolean arg0)`
- `CommodityBuilder setRelatedExchange(List arg0)`
- `CommodityBuilder setPriceQuoteType(QuotationSideEnum arg0)`
- `CommodityBuilder setDeliveryDateReference(DeliveryDateParameters arg0)`
- `CommodityBuilder setCommodityProductDefinition(CommodityProductDefinition arg0)`

#### Getter Methods

- `DeliveryDateParametersBuilder getDeliveryDateReference()`
- `CommodityProductDefinitionBuilder getCommodityProductDefinition()`
- `DeliveryDateParametersBuilder getOrCreateDeliveryDateReference()`
- `CommodityProductDefinitionBuilder getOrCreateCommodityProductDefinition()`

#### Adder Methods

- `CommodityBuilder addIdentifier(AssetIdentifier arg0)`
- `CommodityBuilder addIdentifier(AssetIdentifier arg0, int arg1)`
- `CommodityBuilder addIdentifier(List arg0)`
- `CommodityBuilder addTaxonomy(List arg0)`
- `CommodityBuilder addTaxonomy(Taxonomy arg0)`
- `CommodityBuilder addTaxonomy(Taxonomy arg0, int arg1)`
- `CommodityBuilder addRelatedExchange(List arg0)`
- `CommodityBuilder addRelatedExchange(LegalEntity arg0, int arg1)`
- `CommodityBuilder addRelatedExchange(LegalEntity arg0)`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `CommodityBuilder prune()`

