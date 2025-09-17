# IndexBuilderImpl

**Full Name:** `cdm.observable.asset.Index$IndexBuilderImpl`

**Package:** `cdm.observable.asset`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.observable.asset.Index$IndexBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| creditIndex | `CreditIndexBuilder` |  |
| equityIndex | `EquityIndexBuilder` |  |
| interestRateIndex | `FieldWithMetaInterestRateIndexBuilder` |  |
| foreignExchangeRateIndex | `ForeignExchangeRateIndexBuilder` |  |
| otherIndex | `OtherIndexBuilder` |  |

### Methods

#### Builder Methods

- `Index build()`

#### Setter Methods

- `IndexBuilder setInterestRateIndexValue(InterestRateIndex arg0)`
- `IndexBuilder setCreditIndex(CreditIndex arg0)`
- `IndexBuilder setOtherIndex(OtherIndex arg0)`
- `IndexBuilder setEquityIndex(EquityIndex arg0)`
- `IndexBuilder setInterestRateIndex(FieldWithMetaInterestRateIndex arg0)`
- `IndexBuilder setForeignExchangeRateIndex(ForeignExchangeRateIndex arg0)`

#### Getter Methods

- `FieldWithMetaInterestRateIndexBuilder getInterestRateIndex()`
- `OtherIndexBuilder getOtherIndex()`
- `CreditIndexBuilder getCreditIndex()`
- `EquityIndexBuilder getEquityIndex()`
- `OtherIndexBuilder getOrCreateOtherIndex()`
- `CreditIndexBuilder getOrCreateCreditIndex()`
- `EquityIndexBuilder getOrCreateEquityIndex()`
- `ForeignExchangeRateIndexBuilder getOrCreateForeignExchangeRateIndex()`
- `FieldWithMetaInterestRateIndexBuilder getOrCreateInterestRateIndex()`
- `ForeignExchangeRateIndexBuilder getForeignExchangeRateIndex()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `IndexBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `IndexBuilder prune()`
- `IndexBuilder toBuilder()`
- `boolean hasData()`

