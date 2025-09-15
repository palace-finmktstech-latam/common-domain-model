# InstrumentBaseBuilderImpl

**Full Name:** `cdm.base.staticdata.asset.common.InstrumentBase$InstrumentBaseBuilderImpl`

**Package:** `cdm.base.staticdata.asset.common`

## Type: Concrete Class

### Inheritance

**Extends:**
- `cdm.base.staticdata.asset.common.AssetBase$AssetBaseBuilderImpl`

### Implemented Interfaces

- `cdm.base.staticdata.asset.common.InstrumentBase$InstrumentBaseBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| instrumentType | `InstrumentTypeEnum` |  |

### Methods

#### Builder Methods

- `InstrumentBase build()`

#### Setter Methods

- `InstrumentBaseBuilder setIsExchangeListed(Boolean arg0)`
- `InstrumentBaseBuilder setRelatedExchange(List arg0)`
- `InstrumentBaseBuilder setExchange(LegalEntity arg0)`
- `InstrumentBaseBuilder setInstrumentType(InstrumentTypeEnum arg0)`
- `InstrumentBaseBuilder setTaxonomy(List arg0)`
- `InstrumentBaseBuilder setIdentifier(List arg0)`

#### Getter Methods

- `InstrumentTypeEnum getInstrumentType()`

#### Adder Methods

- `InstrumentBaseBuilder addRelatedExchange(LegalEntity arg0)`
- `InstrumentBaseBuilder addRelatedExchange(List arg0)`
- `InstrumentBaseBuilder addRelatedExchange(LegalEntity arg0, int arg1)`
- `InstrumentBaseBuilder addTaxonomy(List arg0)`
- `InstrumentBaseBuilder addTaxonomy(Taxonomy arg0, int arg1)`
- `InstrumentBaseBuilder addTaxonomy(Taxonomy arg0)`
- `InstrumentBaseBuilder addIdentifier(AssetIdentifier arg0, int arg1)`
- `InstrumentBaseBuilder addIdentifier(AssetIdentifier arg0)`
- `InstrumentBaseBuilder addIdentifier(List arg0)`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `InstrumentBaseBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `boolean hasData()`
- `InstrumentBaseBuilder toBuilder()`
- `InstrumentBaseBuilder prune()`

