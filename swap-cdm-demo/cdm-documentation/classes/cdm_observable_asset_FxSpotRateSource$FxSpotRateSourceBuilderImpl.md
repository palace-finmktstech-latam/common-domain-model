# FxSpotRateSourceBuilderImpl

**Full Name:** `cdm.observable.asset.FxSpotRateSource$FxSpotRateSourceBuilderImpl`

**Package:** `cdm.observable.asset`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.observable.asset.FxSpotRateSource$FxSpotRateSourceBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| primarySource | `InformationSourceBuilder` |  |
| secondarySource | `InformationSourceBuilder` |  |

### Methods

#### Builder Methods

- `FxSpotRateSource build()`

#### Setter Methods

- `FxSpotRateSourceBuilder setSecondarySource(InformationSource arg0)`
- `FxSpotRateSourceBuilder setPrimarySource(InformationSource arg0)`

#### Getter Methods

- `InformationSourceBuilder getPrimarySource()`
- `InformationSourceBuilder getOrCreateSecondarySource()`
- `InformationSourceBuilder getOrCreatePrimarySource()`
- `InformationSourceBuilder getSecondarySource()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `FxSpotRateSourceBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `FxSpotRateSourceBuilder prune()`
- `FxSpotRateSourceBuilder toBuilder()`
- `boolean hasData()`

