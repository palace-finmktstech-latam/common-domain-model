# CashBuilderImpl

**Full Name:** `cdm.base.staticdata.asset.common.Cash$CashBuilderImpl`

**Package:** `cdm.base.staticdata.asset.common`

## Type: Concrete Class

### Inheritance

**Extends:**
- `cdm.base.staticdata.asset.common.AssetBase$AssetBaseBuilderImpl`

### Implemented Interfaces

- `cdm.base.staticdata.asset.common.Cash$CashBuilder`

### Methods

#### Builder Methods

- `Cash build()`

#### Setter Methods

- `CashBuilder setIdentifier(List arg0)`
- `CashBuilder setTaxonomy(List arg0)`
- `CashBuilder setExchange(LegalEntity arg0)`
- `CashBuilder setIsExchangeListed(Boolean arg0)`
- `CashBuilder setRelatedExchange(List arg0)`

#### Adder Methods

- `CashBuilder addIdentifier(AssetIdentifier arg0, int arg1)`
- `CashBuilder addIdentifier(AssetIdentifier arg0)`
- `CashBuilder addIdentifier(List arg0)`
- `CashBuilder addTaxonomy(Taxonomy arg0, int arg1)`
- `CashBuilder addTaxonomy(Taxonomy arg0)`
- `CashBuilder addTaxonomy(List arg0)`
- `CashBuilder addRelatedExchange(LegalEntity arg0)`
- `CashBuilder addRelatedExchange(List arg0)`
- `CashBuilder addRelatedExchange(LegalEntity arg0, int arg1)`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `CashBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `CashBuilder prune()`
- `CashBuilder toBuilder()`
- `boolean hasData()`

