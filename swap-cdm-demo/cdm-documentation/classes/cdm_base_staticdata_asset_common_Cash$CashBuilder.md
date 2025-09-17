# CashBuilder

**Full Name:** `cdm.base.staticdata.asset.common.Cash$CashBuilder`

**Package:** `cdm.base.staticdata.asset.common`

## Type: Interface

### Implemented Interfaces

- `cdm.base.staticdata.asset.common.Cash`
- `cdm.base.staticdata.asset.common.AssetBase$AssetBaseBuilder`

### Methods

#### Setter Methods

- `CashBuilder setIdentifier(List arg0)`
- `CashBuilder setTaxonomy(List arg0)`
- `CashBuilder setExchange(LegalEntity arg0)`
- `CashBuilder setIsExchangeListed(Boolean arg0)`
- `CashBuilder setRelatedExchange(List arg0)`

#### Adder Methods

- `CashBuilder addIdentifier(AssetIdentifier arg0)`
- `CashBuilder addIdentifier(AssetIdentifier arg0, int arg1)`
- `CashBuilder addIdentifier(List arg0)`
- `CashBuilder addTaxonomy(Taxonomy arg0)`
- `CashBuilder addTaxonomy(Taxonomy arg0, int arg1)`
- `CashBuilder addTaxonomy(List arg0)`
- `CashBuilder addRelatedExchange(List arg0)`
- `CashBuilder addRelatedExchange(LegalEntity arg0, int arg1)`
- `CashBuilder addRelatedExchange(LegalEntity arg0)`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `CashBuilder prune()`

