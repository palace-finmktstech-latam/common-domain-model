# IndexBaseBuilderImpl

**Full Name:** `cdm.observable.asset.IndexBase$IndexBaseBuilderImpl`

**Package:** `cdm.observable.asset`

## Type: Concrete Class

### Inheritance

**Extends:**
- `cdm.base.staticdata.asset.common.AssetBase$AssetBaseBuilderImpl`

### Implemented Interfaces

- `cdm.observable.asset.IndexBase$IndexBaseBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| name | `FieldWithMetaStringBuilder` |  |
| provider | `LegalEntityBuilder` |  |
| assetClass | `AssetClassEnum` |  |

### Methods

#### Builder Methods

- `IndexBase build()`

#### Setter Methods

- `IndexBaseBuilder setName(FieldWithMetaString arg0)`
- `IndexBaseBuilder setIdentifier(List arg0)`
- `IndexBaseBuilder setTaxonomy(List arg0)`
- `IndexBaseBuilder setNameValue(String arg0)`
- `IndexBaseBuilder setExchange(LegalEntity arg0)`
- `IndexBaseBuilder setIsExchangeListed(Boolean arg0)`
- `IndexBaseBuilder setRelatedExchange(List arg0)`
- `IndexBaseBuilder setAssetClass(AssetClassEnum arg0)`
- `IndexBaseBuilder setProvider(LegalEntity arg0)`

#### Getter Methods

- `FieldWithMetaStringBuilder getName()`
- `LegalEntityBuilder getProvider()`
- `FieldWithMetaStringBuilder getOrCreateName()`
- `AssetClassEnum getAssetClass()`
- `LegalEntityBuilder getOrCreateProvider()`

#### Adder Methods

- `IndexBaseBuilder addIdentifier(List arg0)`
- `IndexBaseBuilder addIdentifier(AssetIdentifier arg0, int arg1)`
- `IndexBaseBuilder addIdentifier(AssetIdentifier arg0)`
- `IndexBaseBuilder addTaxonomy(List arg0)`
- `IndexBaseBuilder addTaxonomy(Taxonomy arg0, int arg1)`
- `IndexBaseBuilder addTaxonomy(Taxonomy arg0)`
- `IndexBaseBuilder addRelatedExchange(LegalEntity arg0, int arg1)`
- `IndexBaseBuilder addRelatedExchange(List arg0)`
- `IndexBaseBuilder addRelatedExchange(LegalEntity arg0)`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `IndexBaseBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `IndexBaseBuilder prune()`
- `IndexBaseBuilder toBuilder()`
- `boolean hasData()`

