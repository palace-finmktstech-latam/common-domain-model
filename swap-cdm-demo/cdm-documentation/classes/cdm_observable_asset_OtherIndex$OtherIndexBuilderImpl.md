# OtherIndexBuilderImpl

**Full Name:** `cdm.observable.asset.OtherIndex$OtherIndexBuilderImpl`

**Package:** `cdm.observable.asset`

## Type: Concrete Class

### Inheritance

**Extends:**
- `cdm.observable.asset.IndexBase$IndexBaseBuilderImpl`

### Implemented Interfaces

- `cdm.observable.asset.OtherIndex$OtherIndexBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| description | `String` |  |

### Methods

#### Builder Methods

- `OtherIndex build()`

#### Setter Methods

- `OtherIndexBuilder setName(FieldWithMetaString arg0)`
- `OtherIndexBuilder setIsExchangeListed(Boolean arg0)`
- `OtherIndexBuilder setRelatedExchange(List arg0)`
- `OtherIndexBuilder setExchange(LegalEntity arg0)`
- `OtherIndexBuilder setProvider(LegalEntity arg0)`
- `OtherIndexBuilder setAssetClass(AssetClassEnum arg0)`
- `OtherIndexBuilder setTaxonomy(List arg0)`
- `OtherIndexBuilder setDescription(String arg0)`
- `OtherIndexBuilder setIdentifier(List arg0)`
- `OtherIndexBuilder setNameValue(String arg0)`

#### Getter Methods

- `String getDescription()`

#### Adder Methods

- `OtherIndexBuilder addRelatedExchange(LegalEntity arg0)`
- `OtherIndexBuilder addRelatedExchange(List arg0)`
- `OtherIndexBuilder addRelatedExchange(LegalEntity arg0, int arg1)`
- `OtherIndexBuilder addTaxonomy(Taxonomy arg0)`
- `OtherIndexBuilder addTaxonomy(Taxonomy arg0, int arg1)`
- `OtherIndexBuilder addTaxonomy(List arg0)`
- `OtherIndexBuilder addIdentifier(List arg0)`
- `OtherIndexBuilder addIdentifier(AssetIdentifier arg0, int arg1)`
- `OtherIndexBuilder addIdentifier(AssetIdentifier arg0)`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `OtherIndexBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `boolean hasData()`
- `OtherIndexBuilder toBuilder()`
- `OtherIndexBuilder prune()`

