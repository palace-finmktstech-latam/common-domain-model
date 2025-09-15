# ExecutionDetailsBuilder

**Full Name:** `cdm.event.common.ExecutionDetails$ExecutionDetailsBuilder`

**Package:** `cdm.event.common`

## Type: Interface

### Implemented Interfaces

- `cdm.event.common.ExecutionDetails`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`
- `com.rosetta.model.lib.GlobalKey$GlobalKeyBuilder`

### Methods

#### Setter Methods

- `ExecutionDetailsBuilder setExecutionType(ExecutionTypeEnum arg0)`
- `ExecutionDetailsBuilder setExecutionVenue(LegalEntity arg0)`
- `ExecutionDetailsBuilder setPackageReference(IdentifiedList arg0)`
- `ExecutionDetailsBuilder setMeta(MetaFields arg0)`

#### Getter Methods

- `IdentifiedListBuilder getPackageReference()`
- `LegalEntityBuilder getExecutionVenue()`
- `MetaFieldsBuilder getOrCreateMeta()`
- `LegalEntityBuilder getOrCreateExecutionVenue()`
- `IdentifiedListBuilder getOrCreatePackageReference()`
- `MetaFieldsBuilder getMeta()`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `ExecutionDetailsBuilder prune()`

