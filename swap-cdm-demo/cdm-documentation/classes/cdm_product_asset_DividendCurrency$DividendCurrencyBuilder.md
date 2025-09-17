# DividendCurrencyBuilder

**Full Name:** `cdm.product.asset.DividendCurrency$DividendCurrencyBuilder`

**Package:** `cdm.product.asset`

## Type: Interface

### Implemented Interfaces

- `cdm.product.asset.DividendCurrency`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`

### Methods

#### Setter Methods

- `DividendCurrencyBuilder setCurrency(FieldWithMetaString arg0)`
- `DividendCurrencyBuilder setCurrencyValue(String arg0)`
- `DividendCurrencyBuilder setDeterminationMethod(DeterminationMethodEnum arg0)`
- `DividendCurrencyBuilder setCurrencyReference(ReferenceWithMetaString arg0)`
- `DividendCurrencyBuilder setCurrencyReferenceValue(String arg0)`

#### Getter Methods

- `FieldWithMetaStringBuilder getCurrency()`
- `ReferenceWithMetaStringBuilder getCurrencyReference()`
- `ReferenceWithMetaStringBuilder getOrCreateCurrencyReference()`
- `FieldWithMetaStringBuilder getOrCreateCurrency()`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `DividendCurrencyBuilder prune()`

