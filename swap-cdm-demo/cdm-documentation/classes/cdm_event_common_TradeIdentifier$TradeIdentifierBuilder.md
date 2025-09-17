# TradeIdentifierBuilder

**Full Name:** `cdm.event.common.TradeIdentifier$TradeIdentifierBuilder`

**Package:** `cdm.event.common`

## Type: Interface

### Implemented Interfaces

- `cdm.event.common.TradeIdentifier`
- `cdm.base.staticdata.identifier.Identifier$IdentifierBuilder`

### Methods

#### Setter Methods

- `TradeIdentifierBuilder setIssuerReferenceValue(Party arg0)`
- `TradeIdentifierBuilder setIssuerValue(String arg0)`
- `TradeIdentifierBuilder setIssuer(FieldWithMetaString arg0)`
- `TradeIdentifierBuilder setMeta(MetaFields arg0)`
- `TradeIdentifierBuilder setIdentifierType(TradeIdentifierTypeEnum arg0)`
- `TradeIdentifierBuilder setIssuerReference(ReferenceWithMetaParty arg0)`
- `TradeIdentifierBuilder setAssignedIdentifier(List arg0)`

#### Adder Methods

- `TradeIdentifierBuilder addAssignedIdentifier(AssignedIdentifier arg0, int arg1)`
- `TradeIdentifierBuilder addAssignedIdentifier(AssignedIdentifier arg0)`
- `TradeIdentifierBuilder addAssignedIdentifier(List arg0)`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `TradeIdentifierBuilder prune()`

