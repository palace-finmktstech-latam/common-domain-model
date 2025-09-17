# IdentifierBuilderImpl

**Full Name:** `cdm.base.staticdata.identifier.Identifier$IdentifierBuilderImpl`

**Package:** `cdm.base.staticdata.identifier`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.base.staticdata.identifier.Identifier$IdentifierBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| issuerReference | `ReferenceWithMetaPartyBuilder` |  |
| issuer | `FieldWithMetaStringBuilder` |  |
| assignedIdentifier | `java.util.List<cdm.base.staticdata.identifier.AssignedIdentifier$AssignedIdentifierBuilder>` |  |
| meta | `MetaFieldsBuilder` |  |

### Methods

#### Builder Methods

- `Identifier build()`

#### Setter Methods

- `IdentifierBuilder setIssuerReferenceValue(Party arg0)`
- `IdentifierBuilder setIssuerValue(String arg0)`
- `IdentifierBuilder setIssuer(FieldWithMetaString arg0)`
- `IdentifierBuilder setMeta(MetaFields arg0)`
- `IdentifierBuilder setIssuerReference(ReferenceWithMetaParty arg0)`
- `IdentifierBuilder setAssignedIdentifier(List arg0)`

#### Getter Methods

- `MetaFieldsBuilder getOrCreateMeta()`
- `List getAssignedIdentifier()`
- `ReferenceWithMetaPartyBuilder getIssuerReference()`
- `MetaFieldsBuilder getMeta()`
- `FieldWithMetaStringBuilder getIssuer()`
- `AssignedIdentifierBuilder getOrCreateAssignedIdentifier(int arg0)`
- `ReferenceWithMetaPartyBuilder getOrCreateIssuerReference()`
- `FieldWithMetaStringBuilder getOrCreateIssuer()`

#### Adder Methods

- `IdentifierBuilder addAssignedIdentifier(AssignedIdentifier arg0, int arg1)`
- `IdentifierBuilder addAssignedIdentifier(List arg0)`
- `IdentifierBuilder addAssignedIdentifier(AssignedIdentifier arg0)`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `IdentifierBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `IdentifierBuilder prune()`
- `IdentifierBuilder toBuilder()`
- `boolean hasData()`

