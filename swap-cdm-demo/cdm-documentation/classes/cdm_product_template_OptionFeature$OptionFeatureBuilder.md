# OptionFeatureBuilder

**Full Name:** `cdm.product.template.OptionFeature$OptionFeatureBuilder`

**Package:** `cdm.product.template`

## Type: Interface

### Implemented Interfaces

- `cdm.product.template.OptionFeature`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`

### Methods

#### Setter Methods

- `OptionFeatureBuilder setFxFeature(List arg0)`
- `OptionFeatureBuilder setStrategyFeature(StrategyFeature arg0)`
- `OptionFeatureBuilder setPassThrough(PassThrough arg0)`
- `OptionFeatureBuilder setAveragingFeature(AveragingCalculation arg0)`
- `OptionFeatureBuilder setBarrier(Barrier arg0)`
- `OptionFeatureBuilder setKnock(Knock arg0)`

#### Getter Methods

- `AveragingCalculationBuilder getOrCreateAveragingFeature()`
- `FxFeatureBuilder getOrCreateFxFeature(int arg0)`
- `BarrierBuilder getBarrier()`
- `KnockBuilder getKnock()`
- `StrategyFeatureBuilder getStrategyFeature()`
- `List getFxFeature()`
- `AveragingCalculationBuilder getAveragingFeature()`
- `PassThroughBuilder getPassThrough()`
- `BarrierBuilder getOrCreateBarrier()`
- `PassThroughBuilder getOrCreatePassThrough()`
- `StrategyFeatureBuilder getOrCreateStrategyFeature()`
- `KnockBuilder getOrCreateKnock()`

#### Adder Methods

- `OptionFeatureBuilder addFxFeature(FxFeature arg0, int arg1)`
- `OptionFeatureBuilder addFxFeature(FxFeature arg0)`
- `OptionFeatureBuilder addFxFeature(List arg0)`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `OptionFeatureBuilder prune()`

