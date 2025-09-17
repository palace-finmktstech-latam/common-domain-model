# CompositeBuilder

**Full Name:** `cdm.product.template.Composite$CompositeBuilder`

**Package:** `cdm.product.template`

## Type: Interface

### Implemented Interfaces

- `cdm.product.template.Composite`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`

### Methods

#### Setter Methods

- `CompositeBuilder setDeterminationMethod(DeterminationMethodEnum arg0)`
- `CompositeBuilder setFixingTime(BusinessCenterTime arg0)`
- `CompositeBuilder setFxSpotRateSource(FxSpotRateSource arg0)`
- `CompositeBuilder setRelativeDate(RelativeDateOffset arg0)`

#### Getter Methods

- `RelativeDateOffsetBuilder getRelativeDate()`
- `FxSpotRateSourceBuilder getFxSpotRateSource()`
- `BusinessCenterTimeBuilder getFixingTime()`
- `BusinessCenterTimeBuilder getOrCreateFixingTime()`
- `FxSpotRateSourceBuilder getOrCreateFxSpotRateSource()`
- `RelativeDateOffsetBuilder getOrCreateRelativeDate()`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `CompositeBuilder prune()`

