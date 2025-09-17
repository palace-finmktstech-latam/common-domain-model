# InformationSourceBuilder

**Full Name:** `cdm.observable.asset.InformationSource$InformationSourceBuilder`

**Package:** `cdm.observable.asset`

## Type: Interface

### Implemented Interfaces

- `cdm.observable.asset.InformationSource`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`

### Methods

#### Setter Methods

- `InformationSourceBuilder setSourcePageHeading(String arg0)`
- `InformationSourceBuilder setSourcePageValue(String arg0)`
- `InformationSourceBuilder setSourceProvider(FieldWithMetaInformationProviderEnum arg0)`
- `InformationSourceBuilder setSourcePage(FieldWithMetaString arg0)`
- `InformationSourceBuilder setSourceProviderValue(InformationProviderEnum arg0)`

#### Getter Methods

- `FieldWithMetaStringBuilder getSourcePage()`
- `FieldWithMetaStringBuilder getOrCreateSourcePage()`
- `FieldWithMetaInformationProviderEnumBuilder getOrCreateSourceProvider()`
- `FieldWithMetaInformationProviderEnumBuilder getSourceProvider()`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `InformationSourceBuilder prune()`

