# IdentifierBuilder

**Full Name:** `cdm.base.staticdata.identifier.Identifier$IdentifierBuilder`

**Package:** `cdm.base.staticdata.identifier`

## Type: Interface

### Implemented Interfaces

- `cdm.base.staticdata.identifier.Identifier`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`
- `com.rosetta.model.lib.GlobalKey$GlobalKeyBuilder`

### Methods

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
- `IdentifierBuilder addAssignedIdentifier(AssignedIdentifier arg0)`
- `IdentifierBuilder addAssignedIdentifier(List arg0)`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `IdentifierBuilder prune()`

