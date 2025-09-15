# FxSettlementRateSourceBuilder

**Full Name:** `cdm.observable.asset.FxSettlementRateSource$FxSettlementRateSourceBuilder`

**Package:** `cdm.observable.asset`

## Type: Interface

### Implemented Interfaces

- `cdm.observable.asset.FxSettlementRateSource`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`

### Methods

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

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `FxSettlementRateSourceBuilder prune()`

