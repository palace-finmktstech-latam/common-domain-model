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

- `ExecutionDetailsBuilder setPackageReference(IdentifiedList arg0)`
- `ExecutionDetailsBuilder setExecutionVenue(LegalEntity arg0)`
- `ExecutionDetailsBuilder setExecutionType(ExecutionTypeEnum arg0)`
- `ExecutionDetailsBuilder setMeta(MetaFields arg0)`

#### Getter Methods

- `MetaFieldsBuilder getOrCreateMeta()`
- `ExecutionTypeEnum getExecutionType()`
- `IdentifiedListBuilder getPackageReference()`
- `LegalEntityBuilder getExecutionVenue()`
- `LegalEntityBuilder getOrCreateExecutionVenue()`
- `IdentifiedListBuilder getOrCreatePackageReference()`
- `MetaFieldsBuilder getMeta()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `ExecutionDetailsBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `ExecutionDetailsBuilder prune()`
- `ExecutionDetailsBuilder toBuilder()`
- `boolean hasData()`

