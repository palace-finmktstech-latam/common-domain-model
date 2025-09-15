# ReferenceSwapCurveBuilderImpl

**Full Name:** `cdm.observable.asset.ReferenceSwapCurve$ReferenceSwapCurveBuilderImpl`

**Package:** `cdm.observable.asset`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.observable.asset.ReferenceSwapCurve$ReferenceSwapCurveBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| swapUnwindValue | `SwapCurveValuationBuilder` |  |
| makeWholeAmount | `MakeWholeAmountBuilder` |  |

### Methods

#### Builder Methods

- `ReferenceSwapCurve build()`

#### Setter Methods

- `ReferenceSwapCurveBuilder setSwapUnwindValue(SwapCurveValuation arg0)`
- `ReferenceSwapCurveBuilder setMakeWholeAmount(MakeWholeAmount arg0)`

#### Getter Methods

- `MakeWholeAmountBuilder getOrCreateMakeWholeAmount()`
- `SwapCurveValuationBuilder getOrCreateSwapUnwindValue()`
- `SwapCurveValuationBuilder getSwapUnwindValue()`
- `MakeWholeAmountBuilder getMakeWholeAmount()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `ReferenceSwapCurveBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `boolean hasData()`
- `ReferenceSwapCurveBuilder toBuilder()`
- `ReferenceSwapCurveBuilder prune()`

