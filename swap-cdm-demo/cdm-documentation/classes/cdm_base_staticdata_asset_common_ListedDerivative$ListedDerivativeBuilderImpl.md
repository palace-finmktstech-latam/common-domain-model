# ListedDerivativeBuilderImpl

**Full Name:** `cdm.base.staticdata.asset.common.ListedDerivative$ListedDerivativeBuilderImpl`

**Package:** `cdm.base.staticdata.asset.common`

## Type: Concrete Class

### Inheritance

**Extends:**
- `cdm.base.staticdata.asset.common.InstrumentBase$InstrumentBaseBuilderImpl`

### Implemented Interfaces

- `cdm.base.staticdata.asset.common.ListedDerivative$ListedDerivativeBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| deliveryTerm | `String` |  |
| optionType | `PutCallEnum` |  |
| strike | `BigDecimal` |  |

### Methods

#### Builder Methods

- `ListedDerivative build()`

#### Setter Methods

- `ListedDerivativeBuilder setIsExchangeListed(Boolean arg0)`
- `ListedDerivativeBuilder setRelatedExchange(List arg0)`
- `ListedDerivativeBuilder setExchange(LegalEntity arg0)`
- `ListedDerivativeBuilder setInstrumentType(InstrumentTypeEnum arg0)`
- `ListedDerivativeBuilder setTaxonomy(List arg0)`
- `ListedDerivativeBuilder setStrike(BigDecimal arg0)`
- `ListedDerivativeBuilder setOptionType(PutCallEnum arg0)`
- `ListedDerivativeBuilder setIdentifier(List arg0)`
- `ListedDerivativeBuilder setDeliveryTerm(String arg0)`

#### Getter Methods

- `BigDecimal getStrike()`
- `PutCallEnum getOptionType()`
- `String getDeliveryTerm()`

#### Adder Methods

- `ListedDerivativeBuilder addRelatedExchange(LegalEntity arg0)`
- `ListedDerivativeBuilder addRelatedExchange(LegalEntity arg0, int arg1)`
- `ListedDerivativeBuilder addRelatedExchange(List arg0)`
- `ListedDerivativeBuilder addTaxonomy(Taxonomy arg0)`
- `ListedDerivativeBuilder addTaxonomy(Taxonomy arg0, int arg1)`
- `ListedDerivativeBuilder addTaxonomy(List arg0)`
- `ListedDerivativeBuilder addIdentifier(AssetIdentifier arg0, int arg1)`
- `ListedDerivativeBuilder addIdentifier(List arg0)`
- `ListedDerivativeBuilder addIdentifier(AssetIdentifier arg0)`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `ListedDerivativeBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `boolean hasData()`
- `ListedDerivativeBuilder toBuilder()`
- `ListedDerivativeBuilder prune()`

