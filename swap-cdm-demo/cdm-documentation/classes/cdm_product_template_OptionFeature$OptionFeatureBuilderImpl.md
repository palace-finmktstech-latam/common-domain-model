# OptionFeatureBuilderImpl

**Full Name:** `cdm.product.template.OptionFeature$OptionFeatureBuilderImpl`

**Package:** `cdm.product.template`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.product.template.OptionFeature$OptionFeatureBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| fxFeature | `java.util.List<cdm.product.template.FxFeature$FxFeatureBuilder>` |  |
| strategyFeature | `StrategyFeatureBuilder` |  |
| averagingFeature | `AveragingCalculationBuilder` |  |
| barrier | `BarrierBuilder` |  |
| knock | `KnockBuilder` |  |
| passThrough | `PassThroughBuilder` |  |

### Methods

#### Builder Methods

- `OptionFeature build()`

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

- `OptionFeatureBuilder addFxFeature(List arg0)`
- `OptionFeatureBuilder addFxFeature(FxFeature arg0, int arg1)`
- `OptionFeatureBuilder addFxFeature(FxFeature arg0)`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `OptionFeatureBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `OptionFeatureBuilder prune()`
- `OptionFeatureBuilder toBuilder()`
- `boolean hasData()`

