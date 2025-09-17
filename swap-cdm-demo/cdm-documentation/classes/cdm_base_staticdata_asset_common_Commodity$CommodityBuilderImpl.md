# CommodityBuilderImpl

**Full Name:** `cdm.base.staticdata.asset.common.Commodity$CommodityBuilderImpl`

**Package:** `cdm.base.staticdata.asset.common`

## Type: Concrete Class

### Inheritance

**Extends:**
- `cdm.base.staticdata.asset.common.AssetBase$AssetBaseBuilderImpl`

### Implemented Interfaces

- `cdm.base.staticdata.asset.common.Commodity$CommodityBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| commodityProductDefinition | `CommodityProductDefinitionBuilder` |  |
| priceQuoteType | `QuotationSideEnum` |  |
| deliveryDateReference | `DeliveryDateParametersBuilder` |  |
| description | `String` |  |

### Methods

#### Builder Methods

- `Commodity build()`

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

- `String getDescription()`
- `DeliveryDateParametersBuilder getDeliveryDateReference()`
- `QuotationSideEnum getPriceQuoteType()`
- `CommodityProductDefinitionBuilder getCommodityProductDefinition()`
- `DeliveryDateParametersBuilder getOrCreateDeliveryDateReference()`
- `CommodityProductDefinitionBuilder getOrCreateCommodityProductDefinition()`

#### Adder Methods

- `CommodityBuilder addIdentifier(AssetIdentifier arg0)`
- `CommodityBuilder addIdentifier(AssetIdentifier arg0, int arg1)`
- `CommodityBuilder addIdentifier(List arg0)`
- `CommodityBuilder addTaxonomy(Taxonomy arg0, int arg1)`
- `CommodityBuilder addTaxonomy(Taxonomy arg0)`
- `CommodityBuilder addTaxonomy(List arg0)`
- `CommodityBuilder addRelatedExchange(LegalEntity arg0)`
- `CommodityBuilder addRelatedExchange(LegalEntity arg0, int arg1)`
- `CommodityBuilder addRelatedExchange(List arg0)`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `CommodityBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `CommodityBuilder prune()`
- `CommodityBuilder toBuilder()`
- `boolean hasData()`

