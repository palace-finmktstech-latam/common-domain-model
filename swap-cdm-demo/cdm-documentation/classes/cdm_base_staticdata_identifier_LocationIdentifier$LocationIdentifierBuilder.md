# LocationIdentifierBuilder

**Full Name:** `cdm.base.staticdata.identifier.LocationIdentifier$LocationIdentifierBuilder`

**Package:** `cdm.base.staticdata.identifier`

## Type: Interface

### Implemented Interfaces

- `cdm.base.staticdata.identifier.LocationIdentifier`
- `cdm.base.staticdata.identifier.Identifier$IdentifierBuilder`

### Methods

#### Setter Methods

- `LocationIdentifierBuilder setIssuer(FieldWithMetaString arg0)`
- `LocationIdentifierBuilder setIssuerReferenceValue(Party arg0)`
- `LocationIdentifierBuilder setIssuerReference(ReferenceWithMetaParty arg0)`
- `LocationIdentifierBuilder setIssuerValue(String arg0)`
- `LocationIdentifierBuilder setAssignedIdentifier(List arg0)`
- `LocationIdentifierBuilder setLocationIdentifierType(CommodityLocationIdentifierTypeEnum arg0)`
- `LocationIdentifierBuilder setMeta(MetaFields arg0)`

#### Adder Methods

- `LocationIdentifierBuilder addAssignedIdentifier(AssignedIdentifier arg0)`
- `LocationIdentifierBuilder addAssignedIdentifier(AssignedIdentifier arg0, int arg1)`
- `LocationIdentifierBuilder addAssignedIdentifier(List arg0)`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `LocationIdentifierBuilder prune()`

