# OptionFeatureBuilder

**Full Name:** `cdm.product.template.OptionFeature$OptionFeatureBuilder`

**Package:** `cdm.product.template`

## Type: Interface

### Implemented Interfaces

- `cdm.product.template.OptionFeature`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`

### Methods

#### Setter Methods

- `OptionFeatureBuilder setBarrier(Barrier arg0)`
- `OptionFeatureBuilder setKnock(Knock arg0)`
- `OptionFeatureBuilder setFxFeature(List arg0)`
- `OptionFeatureBuilder setStrategyFeature(StrategyFeature arg0)`
- `OptionFeatureBuilder setPassThrough(PassThrough arg0)`
- `OptionFeatureBuilder setAveragingFeature(AveragingCalculation arg0)`

#### Getter Methods

- `StrategyFeatureBuilder getStrategyFeature()`
- `AveragingCalculationBuilder getAveragingFeature()`
- `List getFxFeature()`
- `PassThroughBuilder getPassThrough()`
- `BarrierBuilder getOrCreateBarrier()`
- `StrategyFeatureBuilder getOrCreateStrategyFeature()`
- `AveragingCalculationBuilder getOrCreateAveragingFeature()`
- `FxFeatureBuilder getOrCreateFxFeature(int arg0)`
- `BarrierBuilder getBarrier()`
- `KnockBuilder getKnock()`
- `PassThroughBuilder getOrCreatePassThrough()`
- `KnockBuilder getOrCreateKnock()`

#### Adder Methods

- `OptionFeatureBuilder addFxFeature(List arg0)`
- `OptionFeatureBuilder addFxFeature(FxFeature arg0)`
- `OptionFeatureBuilder addFxFeature(FxFeature arg0, int arg1)`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `OptionFeatureBuilder prune()`

