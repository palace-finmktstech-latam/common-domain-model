# CalculatedRateDetailsBuilder

**Full Name:** `cdm.observable.asset.calculatedrate.CalculatedRateDetails$CalculatedRateDetailsBuilder`

**Package:** `cdm.observable.asset.calculatedrate`

## Type: Interface

### Implemented Interfaces

- `cdm.observable.asset.calculatedrate.CalculatedRateDetails`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`

### Methods

#### Setter Methods

- `CalculatedRateDetailsBuilder setObservations(CalculatedRateObservations arg0)`
- `CalculatedRateDetailsBuilder setCalculatedRate(BigDecimal arg0)`
- `CalculatedRateDetailsBuilder setCompoundedGrowth(List arg0)`
- `CalculatedRateDetailsBuilder setWeightedRates(List arg0)`
- `CalculatedRateDetailsBuilder setAggregateWeight(BigDecimal arg0)`
- `CalculatedRateDetailsBuilder setGrowthFactor(List arg0)`
- `CalculatedRateDetailsBuilder setAggregateValue(BigDecimal arg0)`

#### Getter Methods

- `CalculatedRateObservationsBuilder getObservations()`
- `CalculatedRateObservationsBuilder getOrCreateObservations()`

#### Adder Methods

- `CalculatedRateDetailsBuilder addWeightedRates(BigDecimal arg0)`
- `CalculatedRateDetailsBuilder addWeightedRates(List arg0)`
- `CalculatedRateDetailsBuilder addWeightedRates(BigDecimal arg0, int arg1)`
- `CalculatedRateDetailsBuilder addGrowthFactor(BigDecimal arg0)`
- `CalculatedRateDetailsBuilder addGrowthFactor(List arg0)`
- `CalculatedRateDetailsBuilder addGrowthFactor(BigDecimal arg0, int arg1)`
- `CalculatedRateDetailsBuilder addCompoundedGrowth(BigDecimal arg0)`
- `CalculatedRateDetailsBuilder addCompoundedGrowth(BigDecimal arg0, int arg1)`
- `CalculatedRateDetailsBuilder addCompoundedGrowth(List arg0)`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `CalculatedRateDetailsBuilder prune()`

