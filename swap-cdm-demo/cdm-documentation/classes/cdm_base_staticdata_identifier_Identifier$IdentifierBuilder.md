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

- `IdentifierBuilder setIssuer(FieldWithMetaString arg0)`
- `IdentifierBuilder setIssuerReferenceValue(Party arg0)`
- `IdentifierBuilder setIssuerReference(ReferenceWithMetaParty arg0)`
- `IdentifierBuilder setIssuerValue(String arg0)`
- `IdentifierBuilder setAssignedIdentifier(List arg0)`
- `IdentifierBuilder setMeta(MetaFields arg0)`

#### Getter Methods

- `FieldWithMetaStringBuilder getOrCreateIssuer()`
- `ReferenceWithMetaPartyBuilder getOrCreateIssuerReference()`
- `ReferenceWithMetaPartyBuilder getIssuerReference()`
- `List getAssignedIdentifier()`
- `MetaFieldsBuilder getOrCreateMeta()`
- `FieldWithMetaStringBuilder getIssuer()`
- `AssignedIdentifierBuilder getOrCreateAssignedIdentifier(int arg0)`
- `MetaFieldsBuilder getMeta()`

#### Adder Methods

- `IdentifierBuilder addAssignedIdentifier(AssignedIdentifier arg0)`
- `IdentifierBuilder addAssignedIdentifier(List arg0)`
- `IdentifierBuilder addAssignedIdentifier(AssignedIdentifier arg0, int arg1)`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `IdentifierBuilder prune()`

