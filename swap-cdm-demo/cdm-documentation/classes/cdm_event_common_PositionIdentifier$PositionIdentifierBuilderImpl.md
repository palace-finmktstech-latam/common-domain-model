# PositionIdentifierBuilderImpl

**Full Name:** `cdm.event.common.PositionIdentifier$PositionIdentifierBuilderImpl`

**Package:** `cdm.event.common`

## Type: Concrete Class

### Inheritance

**Extends:**
- `cdm.base.staticdata.identifier.Identifier$IdentifierBuilderImpl`

### Implemented Interfaces

- `cdm.event.common.PositionIdentifier$PositionIdentifierBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| identifierType | `TradeIdentifierTypeEnum` |  |

### Methods

#### Builder Methods

- `PositionIdentifier build()`

#### Setter Methods

- `PositionIdentifierBuilder setIssuer(FieldWithMetaString arg0)`
- `PositionIdentifierBuilder setIssuerReferenceValue(Party arg0)`
- `PositionIdentifierBuilder setIssuerReference(ReferenceWithMetaParty arg0)`
- `PositionIdentifierBuilder setIdentifierType(TradeIdentifierTypeEnum arg0)`
- `PositionIdentifierBuilder setIssuerValue(String arg0)`
- `PositionIdentifierBuilder setAssignedIdentifier(List arg0)`
- `PositionIdentifierBuilder setMeta(MetaFields arg0)`

#### Getter Methods

- `TradeIdentifierTypeEnum getIdentifierType()`

#### Adder Methods

- `PositionIdentifierBuilder addAssignedIdentifier(AssignedIdentifier arg0, int arg1)`
- `PositionIdentifierBuilder addAssignedIdentifier(AssignedIdentifier arg0)`
- `PositionIdentifierBuilder addAssignedIdentifier(List arg0)`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `PositionIdentifierBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `boolean hasData()`
- `PositionIdentifierBuilder toBuilder()`
- `PositionIdentifierBuilder prune()`

