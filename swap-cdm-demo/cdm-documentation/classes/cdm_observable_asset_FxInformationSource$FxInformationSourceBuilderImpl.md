# FxInformationSourceBuilderImpl

**Full Name:** `cdm.observable.asset.FxInformationSource$FxInformationSourceBuilderImpl`

**Package:** `cdm.observable.asset`

## Type: Concrete Class

### Inheritance

**Extends:**
- `cdm.observable.asset.InformationSource$InformationSourceBuilderImpl`

### Implemented Interfaces

- `cdm.observable.asset.FxInformationSource$FxInformationSourceBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| fixingTime | `BusinessCenterTimeBuilder` |  |

### Methods

#### Builder Methods

- `FxInformationSource build()`

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

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `FxInformationSourceBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `boolean hasData()`
- `FxInformationSourceBuilder toBuilder()`
- `FxInformationSourceBuilder prune()`

