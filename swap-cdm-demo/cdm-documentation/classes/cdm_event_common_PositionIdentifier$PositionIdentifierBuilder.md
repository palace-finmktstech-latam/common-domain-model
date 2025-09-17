# PositionIdentifierBuilder

**Full Name:** `cdm.event.common.PositionIdentifier$PositionIdentifierBuilder`

**Package:** `cdm.event.common`

## Type: Interface

### Implemented Interfaces

- `cdm.event.common.PositionIdentifier`
- `cdm.base.staticdata.identifier.Identifier$IdentifierBuilder`

### Methods

#### Setter Methods

- `PositionIdentifierBuilder setIssuerReferenceValue(Party arg0)`
- `PositionIdentifierBuilder setIssuerValue(String arg0)`
- `PositionIdentifierBuilder setIssuer(FieldWithMetaString arg0)`
- `PositionIdentifierBuilder setMeta(MetaFields arg0)`
- `PositionIdentifierBuilder setIdentifierType(TradeIdentifierTypeEnum arg0)`
- `PositionIdentifierBuilder setIssuerReference(ReferenceWithMetaParty arg0)`
- `PositionIdentifierBuilder setAssignedIdentifier(List arg0)`

#### Adder Methods

- `PositionIdentifierBuilder addAssignedIdentifier(AssignedIdentifier arg0, int arg1)`
- `PositionIdentifierBuilder addAssignedIdentifier(AssignedIdentifier arg0)`
- `PositionIdentifierBuilder addAssignedIdentifier(List arg0)`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `PositionIdentifierBuilder prune()`

