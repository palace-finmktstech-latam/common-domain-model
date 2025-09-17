# AssignedIdentifierBuilderImpl

**Full Name:** `cdm.base.staticdata.identifier.AssignedIdentifier$AssignedIdentifierBuilderImpl`

**Package:** `cdm.base.staticdata.identifier`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.base.staticdata.identifier.AssignedIdentifier$AssignedIdentifierBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| identifier | `FieldWithMetaStringBuilder` |  |
| version | `Integer` |  |

### Methods

#### Builder Methods

- `AssignedIdentifier build()`

#### Setter Methods

- `AssignedIdentifierBuilder setVersion(Integer arg0)`
- `AssignedIdentifierBuilder setIdentifierValue(String arg0)`
- `AssignedIdentifierBuilder setIdentifier(FieldWithMetaString arg0)`

#### Getter Methods

- `Integer getVersion()`
- `FieldWithMetaStringBuilder getOrCreateIdentifier()`
- `FieldWithMetaStringBuilder getIdentifier()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `AssignedIdentifierBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `AssignedIdentifierBuilder prune()`
- `AssignedIdentifierBuilder toBuilder()`
- `boolean hasData()`

