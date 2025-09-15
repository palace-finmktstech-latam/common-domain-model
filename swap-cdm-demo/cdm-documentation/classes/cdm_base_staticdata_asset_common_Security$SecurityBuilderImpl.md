# SecurityBuilderImpl

**Full Name:** `cdm.base.staticdata.asset.common.Security$SecurityBuilderImpl`

**Package:** `cdm.base.staticdata.asset.common`

## Type: Concrete Class

### Inheritance

**Extends:**
- `cdm.base.staticdata.asset.common.InstrumentBase$InstrumentBaseBuilderImpl`

### Implemented Interfaces

- `cdm.base.staticdata.asset.common.Security$SecurityBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| debtType | `DebtTypeBuilder` |  |
| equityType | `EquityTypeEnum` |  |
| fundType | `FundProductTypeEnum` |  |

### Methods

#### Builder Methods

- `Security build()`

#### Setter Methods

- `SecurityBuilder setIsExchangeListed(Boolean arg0)`
- `SecurityBuilder setRelatedExchange(List arg0)`
- `SecurityBuilder setExchange(LegalEntity arg0)`
- `SecurityBuilder setInstrumentType(InstrumentTypeEnum arg0)`
- `SecurityBuilder setDebtType(DebtType arg0)`
- `SecurityBuilder setEquityType(EquityTypeEnum arg0)`
- `SecurityBuilder setFundType(FundProductTypeEnum arg0)`
- `SecurityBuilder setTaxonomy(List arg0)`
- `SecurityBuilder setIdentifier(List arg0)`

#### Getter Methods

- `EquityTypeEnum getEquityType()`
- `FundProductTypeEnum getFundType()`
- `DebtTypeBuilder getOrCreateDebtType()`
- `DebtTypeBuilder getDebtType()`

#### Adder Methods

- `SecurityBuilder addRelatedExchange(LegalEntity arg0)`
- `SecurityBuilder addRelatedExchange(LegalEntity arg0, int arg1)`
- `SecurityBuilder addRelatedExchange(List arg0)`
- `SecurityBuilder addTaxonomy(Taxonomy arg0, int arg1)`
- `SecurityBuilder addTaxonomy(List arg0)`
- `SecurityBuilder addTaxonomy(Taxonomy arg0)`
- `SecurityBuilder addIdentifier(AssetIdentifier arg0, int arg1)`
- `SecurityBuilder addIdentifier(List arg0)`
- `SecurityBuilder addIdentifier(AssetIdentifier arg0)`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `SecurityBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `boolean hasData()`
- `SecurityBuilder toBuilder()`
- `SecurityBuilder prune()`

