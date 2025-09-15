# ExecutionDetailsBuilderImpl

**Full Name:** `cdm.event.common.ExecutionDetails$ExecutionDetailsBuilderImpl`

**Package:** `cdm.event.common`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.event.common.ExecutionDetails$ExecutionDetailsBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| executionType | `ExecutionTypeEnum` |  |
| executionVenue | `LegalEntityBuilder` |  |
| packageReference | `IdentifiedListBuilder` |  |
| meta | `MetaFieldsBuilder` |  |

### Methods

#### Builder Methods

- `ExecutionDetails build()`

#### Setter Methods

- `ExecutionDetailsBuilder setExecutionType(ExecutionTypeEnum arg0)`
- `ExecutionDetailsBuilder setExecutionVenue(LegalEntity arg0)`
- `ExecutionDetailsBuilder setPackageReference(IdentifiedList arg0)`
- `ExecutionDetailsBuilder setMeta(MetaFields arg0)`

#### Getter Methods

- `IdentifiedListBuilder getPackageReference()`
- `ExecutionTypeEnum getExecutionType()`
- `LegalEntityBuilder getExecutionVenue()`
- `MetaFieldsBuilder getOrCreateMeta()`
- `LegalEntityBuilder getOrCreateExecutionVenue()`
- `IdentifiedListBuilder getOrCreatePackageReference()`
- `MetaFieldsBuilder getMeta()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `ExecutionDetailsBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `boolean hasData()`
- `ExecutionDetailsBuilder toBuilder()`
- `ExecutionDetailsBuilder prune()`

