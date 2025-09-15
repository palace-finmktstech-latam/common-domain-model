# InstrumentBaseBuilder

**Full Name:** `cdm.base.staticdata.asset.common.InstrumentBase$InstrumentBaseBuilder`

**Package:** `cdm.base.staticdata.asset.common`

## Type: Interface

### Implemented Interfaces

- `cdm.base.staticdata.asset.common.InstrumentBase`
- `cdm.base.staticdata.asset.common.AssetBase$AssetBaseBuilder`

### Methods

#### Setter Methods

- `InstrumentBaseBuilder setIsExchangeListed(Boolean arg0)`
- `InstrumentBaseBuilder setRelatedExchange(List arg0)`
- `InstrumentBaseBuilder setExchange(LegalEntity arg0)`
- `InstrumentBaseBuilder setInstrumentType(InstrumentTypeEnum arg0)`
- `InstrumentBaseBuilder setTaxonomy(List arg0)`
- `InstrumentBaseBuilder setIdentifier(List arg0)`

#### Adder Methods

- `InstrumentBaseBuilder addRelatedExchange(LegalEntity arg0)`
- `InstrumentBaseBuilder addRelatedExchange(List arg0)`
- `InstrumentBaseBuilder addRelatedExchange(LegalEntity arg0, int arg1)`
- `InstrumentBaseBuilder addTaxonomy(Taxonomy arg0, int arg1)`
- `InstrumentBaseBuilder addTaxonomy(Taxonomy arg0)`
- `InstrumentBaseBuilder addTaxonomy(List arg0)`
- `InstrumentBaseBuilder addIdentifier(AssetIdentifier arg0, int arg1)`
- `InstrumentBaseBuilder addIdentifier(List arg0)`
- `InstrumentBaseBuilder addIdentifier(AssetIdentifier arg0)`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `InstrumentBaseBuilder prune()`

