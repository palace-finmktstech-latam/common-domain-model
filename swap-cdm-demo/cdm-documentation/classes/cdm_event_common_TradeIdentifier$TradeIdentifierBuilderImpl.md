# TradeIdentifierBuilderImpl

**Full Name:** `cdm.event.common.TradeIdentifier$TradeIdentifierBuilderImpl`

**Package:** `cdm.event.common`

## Type: Concrete Class

### Inheritance

**Extends:**
- `cdm.base.staticdata.identifier.Identifier$IdentifierBuilderImpl`

### Implemented Interfaces

- `cdm.event.common.TradeIdentifier$TradeIdentifierBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| identifierType | `TradeIdentifierTypeEnum` |  |

### Methods

#### Builder Methods

- `TradeIdentifier build()`

#### Setter Methods

- `TradeIdentifierBuilder setIssuerReferenceValue(Party arg0)`
- `TradeIdentifierBuilder setIssuerValue(String arg0)`
- `TradeIdentifierBuilder setIssuer(FieldWithMetaString arg0)`
- `TradeIdentifierBuilder setMeta(MetaFields arg0)`
- `TradeIdentifierBuilder setIdentifierType(TradeIdentifierTypeEnum arg0)`
- `TradeIdentifierBuilder setIssuerReference(ReferenceWithMetaParty arg0)`
- `TradeIdentifierBuilder setAssignedIdentifier(List arg0)`

#### Getter Methods

- `TradeIdentifierTypeEnum getIdentifierType()`

#### Adder Methods

- `TradeIdentifierBuilder addAssignedIdentifier(AssignedIdentifier arg0, int arg1)`
- `TradeIdentifierBuilder addAssignedIdentifier(AssignedIdentifier arg0)`
- `TradeIdentifierBuilder addAssignedIdentifier(List arg0)`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `TradeIdentifierBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `TradeIdentifierBuilder prune()`
- `TradeIdentifierBuilder toBuilder()`
- `boolean hasData()`

