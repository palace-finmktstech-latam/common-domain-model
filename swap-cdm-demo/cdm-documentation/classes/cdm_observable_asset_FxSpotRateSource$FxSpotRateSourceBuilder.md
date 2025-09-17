# FxSpotRateSourceBuilder

**Full Name:** `cdm.observable.asset.FxSpotRateSource$FxSpotRateSourceBuilder`

**Package:** `cdm.observable.asset`

## Type: Interface

### Implemented Interfaces

- `cdm.observable.asset.FxSpotRateSource`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`

### Methods

#### Setter Methods

- `FxSpotRateSourceBuilder setSecondarySource(InformationSource arg0)`
- `FxSpotRateSourceBuilder setPrimarySource(InformationSource arg0)`

#### Getter Methods

- `InformationSourceBuilder getPrimarySource()`
- `InformationSourceBuilder getOrCreateSecondarySource()`
- `InformationSourceBuilder getOrCreatePrimarySource()`
- `InformationSourceBuilder getSecondarySource()`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `FxSpotRateSourceBuilder prune()`

