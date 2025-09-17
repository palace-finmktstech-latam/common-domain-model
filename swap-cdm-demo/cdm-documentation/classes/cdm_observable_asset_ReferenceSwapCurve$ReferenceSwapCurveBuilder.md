# ReferenceSwapCurveBuilder

**Full Name:** `cdm.observable.asset.ReferenceSwapCurve$ReferenceSwapCurveBuilder`

**Package:** `cdm.observable.asset`

## Type: Interface

### Implemented Interfaces

- `cdm.observable.asset.ReferenceSwapCurve`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`

### Methods

#### Setter Methods

- `ReferenceSwapCurveBuilder setMakeWholeAmount(MakeWholeAmount arg0)`
- `ReferenceSwapCurveBuilder setSwapUnwindValue(SwapCurveValuation arg0)`

#### Getter Methods

- `MakeWholeAmountBuilder getMakeWholeAmount()`
- `SwapCurveValuationBuilder getSwapUnwindValue()`
- `MakeWholeAmountBuilder getOrCreateMakeWholeAmount()`
- `SwapCurveValuationBuilder getOrCreateSwapUnwindValue()`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `ReferenceSwapCurveBuilder prune()`

