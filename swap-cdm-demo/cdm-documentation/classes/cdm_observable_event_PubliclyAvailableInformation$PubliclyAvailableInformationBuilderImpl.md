# PubliclyAvailableInformationBuilderImpl

**Full Name:** `cdm.observable.event.PubliclyAvailableInformation$PubliclyAvailableInformationBuilderImpl`

**Package:** `cdm.observable.event`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.observable.event.PubliclyAvailableInformation$PubliclyAvailableInformationBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| standardPublicSources | `Boolean` |  |
| publicSource | `java.util.List<java.lang.String>` |  |
| specifiedNumber | `Integer` |  |

### Methods

#### Builder Methods

- `PubliclyAvailableInformation build()`

#### Setter Methods

- `PubliclyAvailableInformationBuilder setStandardPublicSources(Boolean arg0)`
- `PubliclyAvailableInformationBuilder setPublicSource(List arg0)`
- `PubliclyAvailableInformationBuilder setSpecifiedNumber(Integer arg0)`

#### Getter Methods

- `Boolean getStandardPublicSources()`
- `Integer getSpecifiedNumber()`
- `List getPublicSource()`

#### Adder Methods

- `PubliclyAvailableInformationBuilder addPublicSource(String arg0, int arg1)`
- `PubliclyAvailableInformationBuilder addPublicSource(List arg0)`
- `PubliclyAvailableInformationBuilder addPublicSource(String arg0)`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `PubliclyAvailableInformationBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `PubliclyAvailableInformationBuilder prune()`
- `PubliclyAvailableInformationBuilder toBuilder()`
- `boolean hasData()`

