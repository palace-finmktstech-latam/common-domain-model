# InterestShortFallBuilder

**Full Name:** `cdm.product.asset.InterestShortFall$InterestShortFallBuilder`

**Package:** `cdm.product.asset`

## Type: Interface

### Implemented Interfaces

- `cdm.product.asset.InterestShortFall`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`

### Methods

#### Setter Methods

- `InterestShortFallBuilder setRateSourceValue(FloatingRateIndexEnum arg0)`
- `InterestShortFallBuilder setRateSource(FieldWithMetaFloatingRateIndexEnum arg0)`
- `InterestShortFallBuilder setCompounding(Boolean arg0)`
- `InterestShortFallBuilder setInterestShortfallCap(InterestShortfallCapEnum arg0)`

#### Getter Methods

- `FieldWithMetaFloatingRateIndexEnumBuilder getRateSource()`
- `FieldWithMetaFloatingRateIndexEnumBuilder getOrCreateRateSource()`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `InterestShortFallBuilder prune()`

