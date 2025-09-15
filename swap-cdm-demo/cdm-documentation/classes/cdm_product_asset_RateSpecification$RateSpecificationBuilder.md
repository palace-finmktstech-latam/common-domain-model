# RateSpecificationBuilder

**Full Name:** `cdm.product.asset.RateSpecification$RateSpecificationBuilder`

**Package:** `cdm.product.asset`

## Type: Interface

### Implemented Interfaces

- `cdm.product.asset.RateSpecification`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`

### Methods

#### Setter Methods

- `RateSpecificationBuilder setFixedRateSpecification(FixedRateSpecification arg0)`
- `RateSpecificationBuilder setInflationRateSpecification(InflationRateSpecification arg0)`
- `RateSpecificationBuilder setFloatingRateSpecification(FloatingRateSpecification arg0)`

#### Getter Methods

- `FixedRateSpecificationBuilder getFixedRateSpecification()`
- `InflationRateSpecificationBuilder getInflationRateSpecification()`
- `InflationRateSpecificationBuilder getOrCreateInflationRateSpecification()`
- `FixedRateSpecificationBuilder getOrCreateFixedRateSpecification()`
- `FloatingRateSpecificationBuilder getOrCreateFloatingRateSpecification()`
- `FloatingRateSpecificationBuilder getFloatingRateSpecification()`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `RateSpecificationBuilder prune()`

