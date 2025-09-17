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

- `ReferenceSwapCurveBuilder setMakeWholeAmount(MakeWholeAmount arg0)`
- `ReferenceSwapCurveBuilder setSwapUnwindValue(SwapCurveValuation arg0)`

#### Getter Methods

- `MakeWholeAmountBuilder getMakeWholeAmount()`
- `SwapCurveValuationBuilder getSwapUnwindValue()`
- `MakeWholeAmountBuilder getOrCreateMakeWholeAmount()`
- `SwapCurveValuationBuilder getOrCreateSwapUnwindValue()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `ReferenceSwapCurveBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `ReferenceSwapCurveBuilder prune()`
- `ReferenceSwapCurveBuilder toBuilder()`
- `boolean hasData()`

