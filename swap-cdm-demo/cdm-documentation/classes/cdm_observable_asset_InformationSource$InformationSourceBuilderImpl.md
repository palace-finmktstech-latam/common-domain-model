# InformationSourceBuilderImpl

**Full Name:** `cdm.observable.asset.InformationSource$InformationSourceBuilderImpl`

**Package:** `cdm.observable.asset`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.observable.asset.InformationSource$InformationSourceBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| sourceProvider | `FieldWithMetaInformationProviderEnumBuilder` |  |
| sourcePage | `FieldWithMetaStringBuilder` |  |
| sourcePageHeading | `String` |  |

### Methods

#### Builder Methods

- `InformationSource build()`

#### Setter Methods

- `InformationSourceBuilder setSourcePageHeading(String arg0)`
- `InformationSourceBuilder setSourcePageValue(String arg0)`
- `InformationSourceBuilder setSourceProvider(FieldWithMetaInformationProviderEnum arg0)`
- `InformationSourceBuilder setSourcePage(FieldWithMetaString arg0)`
- `InformationSourceBuilder setSourceProviderValue(InformationProviderEnum arg0)`

#### Getter Methods

- `FieldWithMetaStringBuilder getSourcePage()`
- `String getSourcePageHeading()`
- `FieldWithMetaStringBuilder getOrCreateSourcePage()`
- `FieldWithMetaInformationProviderEnumBuilder getOrCreateSourceProvider()`
- `FieldWithMetaInformationProviderEnumBuilder getSourceProvider()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `InformationSourceBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `InformationSourceBuilder prune()`
- `InformationSourceBuilder toBuilder()`
- `boolean hasData()`

