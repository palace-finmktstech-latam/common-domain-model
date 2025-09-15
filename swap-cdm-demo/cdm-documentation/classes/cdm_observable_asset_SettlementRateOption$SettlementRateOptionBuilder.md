# SettlementRateOptionBuilder

**Full Name:** `cdm.observable.asset.SettlementRateOption$SettlementRateOptionBuilder`

**Package:** `cdm.observable.asset`

## Type: Interface

### Implemented Interfaces

- `cdm.observable.asset.SettlementRateOption`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`

### Methods

#### Setter Methods

- `SettlementRateOptionBuilder setSettlementRateOption(FieldWithMetaSettlementRateOptionEnum arg0)`
- `SettlementRateOptionBuilder setPriceSourceDisruption(PriceSourceDisruption arg0)`
- `SettlementRateOptionBuilder setSettlementRateOptionValue(SettlementRateOptionEnum arg0)`

#### Getter Methods

- `PriceSourceDisruptionBuilder getPriceSourceDisruption()`
- `FieldWithMetaSettlementRateOptionEnumBuilder getSettlementRateOption()`
- `FieldWithMetaSettlementRateOptionEnumBuilder getOrCreateSettlementRateOption()`
- `PriceSourceDisruptionBuilder getOrCreatePriceSourceDisruption()`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `SettlementRateOptionBuilder prune()`

