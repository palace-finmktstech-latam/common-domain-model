# BondReferenceBuilder

**Full Name:** `cdm.product.asset.BondReference$BondReferenceBuilder`

**Package:** `cdm.product.asset`

## Type: Interface

### Implemented Interfaces

- `cdm.product.asset.BondReference`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`

### Methods

#### Setter Methods

- `BondReferenceBuilder setDiscrepancyClause(Boolean arg0)`
- `BondReferenceBuilder setConditionPrecedentBond(Boolean arg0)`
- `BondReferenceBuilder setCouponRate(FixedRateSpecification arg0)`
- `BondReferenceBuilder setBond(Security arg0)`

#### Getter Methods

- `SecurityBuilder getOrCreateBond()`
- `FixedRateSpecificationBuilder getOrCreateCouponRate()`
- `FixedRateSpecificationBuilder getCouponRate()`
- `SecurityBuilder getBond()`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `BondReferenceBuilder prune()`

