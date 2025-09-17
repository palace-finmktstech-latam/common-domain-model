# ListedDerivativeBuilder

**Full Name:** `cdm.base.staticdata.asset.common.ListedDerivative$ListedDerivativeBuilder`

**Package:** `cdm.base.staticdata.asset.common`

## Type: Interface

### Implemented Interfaces

- `cdm.base.staticdata.asset.common.ListedDerivative`
- `cdm.base.staticdata.asset.common.InstrumentBase$InstrumentBaseBuilder`

### Methods

#### Setter Methods

- `ListedDerivativeBuilder setIdentifier(List arg0)`
- `ListedDerivativeBuilder setTaxonomy(List arg0)`
- `ListedDerivativeBuilder setStrike(BigDecimal arg0)`
- `ListedDerivativeBuilder setOptionType(PutCallEnum arg0)`
- `ListedDerivativeBuilder setExchange(LegalEntity arg0)`
- `ListedDerivativeBuilder setIsExchangeListed(Boolean arg0)`
- `ListedDerivativeBuilder setRelatedExchange(List arg0)`
- `ListedDerivativeBuilder setInstrumentType(InstrumentTypeEnum arg0)`
- `ListedDerivativeBuilder setDeliveryTerm(String arg0)`

#### Adder Methods

- `ListedDerivativeBuilder addIdentifier(AssetIdentifier arg0)`
- `ListedDerivativeBuilder addIdentifier(AssetIdentifier arg0, int arg1)`
- `ListedDerivativeBuilder addIdentifier(List arg0)`
- `ListedDerivativeBuilder addTaxonomy(Taxonomy arg0)`
- `ListedDerivativeBuilder addTaxonomy(Taxonomy arg0, int arg1)`
- `ListedDerivativeBuilder addTaxonomy(List arg0)`
- `ListedDerivativeBuilder addRelatedExchange(LegalEntity arg0)`
- `ListedDerivativeBuilder addRelatedExchange(List arg0)`
- `ListedDerivativeBuilder addRelatedExchange(LegalEntity arg0, int arg1)`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `ListedDerivativeBuilder prune()`

