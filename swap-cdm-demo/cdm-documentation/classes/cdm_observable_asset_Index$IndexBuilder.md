# IndexBuilder

**Full Name:** `cdm.observable.asset.Index$IndexBuilder`

**Package:** `cdm.observable.asset`

## Type: Interface

### Implemented Interfaces

- `cdm.observable.asset.Index`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`

### Methods

#### Setter Methods

- `IndexBuilder setInterestRateIndexValue(InterestRateIndex arg0)`
- `IndexBuilder setCreditIndex(CreditIndex arg0)`
- `IndexBuilder setInterestRateIndex(FieldWithMetaInterestRateIndex arg0)`
- `IndexBuilder setOtherIndex(OtherIndex arg0)`
- `IndexBuilder setEquityIndex(EquityIndex arg0)`
- `IndexBuilder setForeignExchangeRateIndex(ForeignExchangeRateIndex arg0)`

#### Getter Methods

- `FieldWithMetaInterestRateIndexBuilder getInterestRateIndex()`
- `EquityIndexBuilder getEquityIndex()`
- `OtherIndexBuilder getOtherIndex()`
- `CreditIndexBuilder getCreditIndex()`
- `EquityIndexBuilder getOrCreateEquityIndex()`
- `CreditIndexBuilder getOrCreateCreditIndex()`
- `OtherIndexBuilder getOrCreateOtherIndex()`
- `FieldWithMetaInterestRateIndexBuilder getOrCreateInterestRateIndex()`
- `ForeignExchangeRateIndexBuilder getForeignExchangeRateIndex()`
- `ForeignExchangeRateIndexBuilder getOrCreateForeignExchangeRateIndex()`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `IndexBuilder prune()`

