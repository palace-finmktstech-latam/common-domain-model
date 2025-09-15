# QuotedCurrencyPairBuilderImpl

**Full Name:** `cdm.observable.asset.QuotedCurrencyPair$QuotedCurrencyPairBuilderImpl`

**Package:** `cdm.observable.asset`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.observable.asset.QuotedCurrencyPair$QuotedCurrencyPairBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| currency1 | `FieldWithMetaStringBuilder` |  |
| currency2 | `FieldWithMetaStringBuilder` |  |
| quoteBasis | `QuoteBasisEnum` |  |

### Methods

#### Builder Methods

- `QuotedCurrencyPair build()`

#### Setter Methods

- `QuotedCurrencyPairBuilder setCurrency1(FieldWithMetaString arg0)`
- `QuotedCurrencyPairBuilder setCurrency1Value(String arg0)`
- `QuotedCurrencyPairBuilder setCurrency2Value(String arg0)`
- `QuotedCurrencyPairBuilder setCurrency2(FieldWithMetaString arg0)`
- `QuotedCurrencyPairBuilder setQuoteBasis(QuoteBasisEnum arg0)`

#### Getter Methods

- `FieldWithMetaStringBuilder getOrCreateCurrency1()`
- `FieldWithMetaStringBuilder getOrCreateCurrency2()`
- `FieldWithMetaStringBuilder getCurrency1()`
- `FieldWithMetaStringBuilder getCurrency2()`
- `QuoteBasisEnum getQuoteBasis()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `QuotedCurrencyPairBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `boolean hasData()`
- `QuotedCurrencyPairBuilder toBuilder()`
- `QuotedCurrencyPairBuilder prune()`

