# VarianceCapFloorBuilder

**Full Name:** `cdm.product.asset.VarianceCapFloor$VarianceCapFloorBuilder`

**Package:** `cdm.product.asset`

## Type: Interface

### Implemented Interfaces

- `cdm.product.asset.VarianceCapFloor`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`

### Methods

#### Setter Methods

- `VarianceCapFloorBuilder setUnadjustedVarianceCap(BigDecimal arg0)`
- `VarianceCapFloorBuilder setBoundedVariance(BoundedVariance arg0)`
- `VarianceCapFloorBuilder setVarianceCap(Boolean arg0)`

#### Getter Methods

- `BoundedVarianceBuilder getBoundedVariance()`
- `BoundedVarianceBuilder getOrCreateBoundedVariance()`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `VarianceCapFloorBuilder prune()`

