# DividendCurrencyBuilderImpl

**Full Name:** `cdm.product.asset.DividendCurrency$DividendCurrencyBuilderImpl`

**Package:** `cdm.product.asset`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.product.asset.DividendCurrency$DividendCurrencyBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| currency | `FieldWithMetaStringBuilder` |  |
| determinationMethod | `DeterminationMethodEnum` |  |
| currencyReference | `ReferenceWithMetaStringBuilder` |  |

### Methods

#### Builder Methods

- `DividendCurrency build()`

#### Setter Methods

- `DividendCurrencyBuilder setCurrency(FieldWithMetaString arg0)`
- `DividendCurrencyBuilder setCurrencyValue(String arg0)`
- `DividendCurrencyBuilder setDeterminationMethod(DeterminationMethodEnum arg0)`
- `DividendCurrencyBuilder setCurrencyReference(ReferenceWithMetaString arg0)`
- `DividendCurrencyBuilder setCurrencyReferenceValue(String arg0)`

#### Getter Methods

- `FieldWithMetaStringBuilder getCurrency()`
- `DeterminationMethodEnum getDeterminationMethod()`
- `ReferenceWithMetaStringBuilder getCurrencyReference()`
- `ReferenceWithMetaStringBuilder getOrCreateCurrencyReference()`
- `FieldWithMetaStringBuilder getOrCreateCurrency()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `DividendCurrencyBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `DividendCurrencyBuilder prune()`
- `DividendCurrencyBuilder toBuilder()`
- `boolean hasData()`

