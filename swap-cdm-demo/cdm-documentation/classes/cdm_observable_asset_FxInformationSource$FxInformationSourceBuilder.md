# FxInformationSourceBuilder

**Full Name:** `cdm.observable.asset.FxInformationSource$FxInformationSourceBuilder`

**Package:** `cdm.observable.asset`

## Type: Interface

### Implemented Interfaces

- `cdm.observable.asset.FxInformationSource`
- `cdm.observable.asset.InformationSource$InformationSourceBuilder`

### Methods

#### Setter Methods

- `FxInformationSourceBuilder setSourcePage(FieldWithMetaString arg0)`
- `FxInformationSourceBuilder setSourceProvider(FieldWithMetaInformationProviderEnum arg0)`
- `FxInformationSourceBuilder setSourceProviderValue(InformationProviderEnum arg0)`
- `FxInformationSourceBuilder setSourcePageValue(String arg0)`
- `FxInformationSourceBuilder setSourcePageHeading(String arg0)`
- `FxInformationSourceBuilder setFixingTime(BusinessCenterTime arg0)`

#### Getter Methods

- `BusinessCenterTimeBuilder getFixingTime()`
- `BusinessCenterTimeBuilder getOrCreateFixingTime()`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `FxInformationSourceBuilder prune()`

