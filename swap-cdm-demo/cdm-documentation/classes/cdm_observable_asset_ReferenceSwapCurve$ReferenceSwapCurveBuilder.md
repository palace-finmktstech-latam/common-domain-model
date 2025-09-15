# ReferenceSwapCurveBuilder

**Full Name:** `cdm.observable.asset.ReferenceSwapCurve$ReferenceSwapCurveBuilder`

**Package:** `cdm.observable.asset`

## Type: Interface

### Implemented Interfaces

- `cdm.observable.asset.ReferenceSwapCurve`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`

### Methods

#### Setter Methods

- `ReferenceSwapCurveBuilder setSwapUnwindValue(SwapCurveValuation arg0)`
- `ReferenceSwapCurveBuilder setMakeWholeAmount(MakeWholeAmount arg0)`

#### Getter Methods

- `MakeWholeAmountBuilder getOrCreateMakeWholeAmount()`
- `SwapCurveValuationBuilder getOrCreateSwapUnwindValue()`
- `SwapCurveValuationBuilder getSwapUnwindValue()`
- `MakeWholeAmountBuilder getMakeWholeAmount()`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `ReferenceSwapCurveBuilder prune()`

