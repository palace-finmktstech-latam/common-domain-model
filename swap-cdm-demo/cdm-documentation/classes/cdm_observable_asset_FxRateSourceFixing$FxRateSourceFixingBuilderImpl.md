# FxRateSourceFixingBuilderImpl

**Full Name:** `cdm.observable.asset.FxRateSourceFixing$FxRateSourceFixingBuilderImpl`

**Package:** `cdm.observable.asset`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.observable.asset.FxRateSourceFixing$FxRateSourceFixingBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| settlementRateSource | `FxSettlementRateSourceBuilder` |  |
| fixingDate | `AdjustableDateBuilder` |  |

### Methods

#### Builder Methods

- `FxRateSourceFixing build()`

#### Setter Methods

- `FxRateSourceFixingBuilder setSettlementRateSource(FxSettlementRateSource arg0)`
- `FxRateSourceFixingBuilder setFixingDate(AdjustableDate arg0)`

#### Getter Methods

- `FxSettlementRateSourceBuilder getOrCreateSettlementRateSource()`
- `AdjustableDateBuilder getOrCreateFixingDate()`
- `FxSettlementRateSourceBuilder getSettlementRateSource()`
- `AdjustableDateBuilder getFixingDate()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `FxRateSourceFixingBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `boolean hasData()`
- `FxRateSourceFixingBuilder toBuilder()`
- `FxRateSourceFixingBuilder prune()`

