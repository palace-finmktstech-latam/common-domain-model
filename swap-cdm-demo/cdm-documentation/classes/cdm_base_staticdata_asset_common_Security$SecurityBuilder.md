# SecurityBuilder

**Full Name:** `cdm.base.staticdata.asset.common.Security$SecurityBuilder`

**Package:** `cdm.base.staticdata.asset.common`

## Type: Interface

### Implemented Interfaces

- `cdm.base.staticdata.asset.common.Security`
- `cdm.base.staticdata.asset.common.InstrumentBase$InstrumentBaseBuilder`

### Methods

#### Setter Methods

- `SecurityBuilder setIdentifier(List arg0)`
- `SecurityBuilder setTaxonomy(List arg0)`
- `SecurityBuilder setExchange(LegalEntity arg0)`
- `SecurityBuilder setIsExchangeListed(Boolean arg0)`
- `SecurityBuilder setRelatedExchange(List arg0)`
- `SecurityBuilder setInstrumentType(InstrumentTypeEnum arg0)`
- `SecurityBuilder setEquityType(EquityTypeEnum arg0)`
- `SecurityBuilder setFundType(FundProductTypeEnum arg0)`
- `SecurityBuilder setDebtType(DebtType arg0)`

#### Getter Methods

- `DebtTypeBuilder getDebtType()`
- `DebtTypeBuilder getOrCreateDebtType()`

#### Adder Methods

- `SecurityBuilder addIdentifier(AssetIdentifier arg0, int arg1)`
- `SecurityBuilder addIdentifier(List arg0)`
- `SecurityBuilder addIdentifier(AssetIdentifier arg0)`
- `SecurityBuilder addTaxonomy(List arg0)`
- `SecurityBuilder addTaxonomy(Taxonomy arg0)`
- `SecurityBuilder addTaxonomy(Taxonomy arg0, int arg1)`
- `SecurityBuilder addRelatedExchange(LegalEntity arg0, int arg1)`
- `SecurityBuilder addRelatedExchange(LegalEntity arg0)`
- `SecurityBuilder addRelatedExchange(List arg0)`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `SecurityBuilder prune()`

