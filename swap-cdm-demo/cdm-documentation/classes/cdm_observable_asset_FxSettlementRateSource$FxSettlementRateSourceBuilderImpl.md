# FxSettlementRateSourceBuilderImpl

**Full Name:** `cdm.observable.asset.FxSettlementRateSource$FxSettlementRateSourceBuilderImpl`

**Package:** `cdm.observable.asset`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.observable.asset.FxSettlementRateSource$FxSettlementRateSourceBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| settlementRateOption | `FieldWithMetaStringBuilder` |  |
| nonstandardSettlementRate | `FxInformationSourceBuilder` |  |

### Methods

#### Builder Methods

- `FxSettlementRateSource build()`

#### Setter Methods

- `FxSettlementRateSourceBuilder setSettlementRateOption(FieldWithMetaString arg0)`
- `FxSettlementRateSourceBuilder setSettlementRateOptionValue(String arg0)`
- `FxSettlementRateSourceBuilder setNonstandardSettlementRate(FxInformationSource arg0)`

#### Getter Methods

- `FieldWithMetaStringBuilder getSettlementRateOption()`
- `FieldWithMetaStringBuilder getOrCreateSettlementRateOption()`
- `FxInformationSourceBuilder getNonstandardSettlementRate()`
- `FxInformationSourceBuilder getOrCreateNonstandardSettlementRate()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `FxSettlementRateSourceBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `boolean hasData()`
- `FxSettlementRateSourceBuilder toBuilder()`
- `FxSettlementRateSourceBuilder prune()`

