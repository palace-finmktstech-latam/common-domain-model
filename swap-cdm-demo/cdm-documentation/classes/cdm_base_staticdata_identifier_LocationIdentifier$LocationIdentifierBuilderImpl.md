# LocationIdentifierBuilderImpl

**Full Name:** `cdm.base.staticdata.identifier.LocationIdentifier$LocationIdentifierBuilderImpl`

**Package:** `cdm.base.staticdata.identifier`

## Type: Concrete Class

### Inheritance

**Extends:**
- `cdm.base.staticdata.identifier.Identifier$IdentifierBuilderImpl`

### Implemented Interfaces

- `cdm.base.staticdata.identifier.LocationIdentifier$LocationIdentifierBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| locationIdentifierType | `CommodityLocationIdentifierTypeEnum` |  |

### Methods

#### Builder Methods

- `LocationIdentifier build()`

#### Setter Methods

- `LocationIdentifierBuilder setIssuerReferenceValue(Party arg0)`
- `LocationIdentifierBuilder setIssuerValue(String arg0)`
- `LocationIdentifierBuilder setIssuer(FieldWithMetaString arg0)`
- `LocationIdentifierBuilder setMeta(MetaFields arg0)`
- `LocationIdentifierBuilder setLocationIdentifierType(CommodityLocationIdentifierTypeEnum arg0)`
- `LocationIdentifierBuilder setIssuerReference(ReferenceWithMetaParty arg0)`
- `LocationIdentifierBuilder setAssignedIdentifier(List arg0)`

#### Getter Methods

- `CommodityLocationIdentifierTypeEnum getLocationIdentifierType()`

#### Adder Methods

- `LocationIdentifierBuilder addAssignedIdentifier(AssignedIdentifier arg0, int arg1)`
- `LocationIdentifierBuilder addAssignedIdentifier(AssignedIdentifier arg0)`
- `LocationIdentifierBuilder addAssignedIdentifier(List arg0)`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `LocationIdentifierBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `LocationIdentifierBuilder prune()`
- `LocationIdentifierBuilder toBuilder()`
- `boolean hasData()`

