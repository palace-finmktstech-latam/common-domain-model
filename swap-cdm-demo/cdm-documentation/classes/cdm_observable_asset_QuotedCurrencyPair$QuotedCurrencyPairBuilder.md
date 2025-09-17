# QuotedCurrencyPairBuilder

**Full Name:** `cdm.observable.asset.QuotedCurrencyPair$QuotedCurrencyPairBuilder`

**Package:** `cdm.observable.asset`

## Type: Interface

### Implemented Interfaces

- `cdm.observable.asset.QuotedCurrencyPair`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`

### Methods

#### Setter Methods

- `QuotedCurrencyPairBuilder setCurrency2Value(String arg0)`
- `QuotedCurrencyPairBuilder setCurrency1(FieldWithMetaString arg0)`
- `QuotedCurrencyPairBuilder setCurrency1Value(String arg0)`
- `QuotedCurrencyPairBuilder setCurrency2(FieldWithMetaString arg0)`
- `QuotedCurrencyPairBuilder setQuoteBasis(QuoteBasisEnum arg0)`

#### Getter Methods

- `FieldWithMetaStringBuilder getOrCreateCurrency1()`
- `FieldWithMetaStringBuilder getOrCreateCurrency2()`
- `FieldWithMetaStringBuilder getCurrency2()`
- `FieldWithMetaStringBuilder getCurrency1()`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `QuotedCurrencyPairBuilder prune()`

