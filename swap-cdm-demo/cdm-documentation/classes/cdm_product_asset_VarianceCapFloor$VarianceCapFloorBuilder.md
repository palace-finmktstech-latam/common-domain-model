# VarianceCapFloorBuilder

**Full Name:** `cdm.product.asset.VarianceCapFloor$VarianceCapFloorBuilder`

**Package:** `cdm.product.asset`

## Type: Interface

### Implemented Interfaces

- `cdm.product.asset.VarianceCapFloor`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`

### Methods

#### Setter Methods

- `VarianceCapFloorBuilder setVarianceCap(Boolean arg0)`
- `VarianceCapFloorBuilder setUnadjustedVarianceCap(BigDecimal arg0)`
- `VarianceCapFloorBuilder setBoundedVariance(BoundedVariance arg0)`

#### Getter Methods

- `BoundedVarianceBuilder getOrCreateBoundedVariance()`
- `BoundedVarianceBuilder getBoundedVariance()`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `VarianceCapFloorBuilder prune()`

