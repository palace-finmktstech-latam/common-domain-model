# FxRateSourceFixingBuilder

**Full Name:** `cdm.observable.asset.FxRateSourceFixing$FxRateSourceFixingBuilder`

**Package:** `cdm.observable.asset`

## Type: Interface

### Implemented Interfaces

- `cdm.observable.asset.FxRateSourceFixing`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`

### Methods

#### Setter Methods

- `FxRateSourceFixingBuilder setSettlementRateSource(FxSettlementRateSource arg0)`
- `FxRateSourceFixingBuilder setFixingDate(AdjustableDate arg0)`

#### Getter Methods

- `FxSettlementRateSourceBuilder getOrCreateSettlementRateSource()`
- `AdjustableDateBuilder getOrCreateFixingDate()`
- `FxSettlementRateSourceBuilder getSettlementRateSource()`
- `AdjustableDateBuilder getFixingDate()`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `FxRateSourceFixingBuilder prune()`

