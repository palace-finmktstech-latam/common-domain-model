# PriceSourceBuilder

**Full Name:** `cdm.base.staticdata.asset.common.PriceSource$PriceSourceBuilder`

**Package:** `cdm.base.staticdata.asset.common`

## Type: Interface

### Implemented Interfaces

- `cdm.base.staticdata.asset.common.PriceSource`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`

### Methods

#### Setter Methods

- `PriceSourceBuilder setPricePublisher(FieldWithMetaString arg0)`
- `PriceSourceBuilder setPriceSourceTime(LocalTime arg0)`
- `PriceSourceBuilder setPricePublisherValue(String arg0)`
- `PriceSourceBuilder setPriceSourceHeading(String arg0)`
- `PriceSourceBuilder setPriceSourceLocation(String arg0)`

#### Getter Methods

- `FieldWithMetaStringBuilder getOrCreatePricePublisher()`
- `FieldWithMetaStringBuilder getPricePublisher()`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `PriceSourceBuilder prune()`

