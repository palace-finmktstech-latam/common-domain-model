# AncillaryEntityBuilderImpl

**Full Name:** `cdm.base.staticdata.party.AncillaryEntity$AncillaryEntityBuilderImpl`

**Package:** `cdm.base.staticdata.party`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.base.staticdata.party.AncillaryEntity$AncillaryEntityBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| ancillaryParty | `AncillaryRoleEnum` |  |
| legalEntity | `LegalEntityBuilder` |  |

### Methods

#### Builder Methods

- `AncillaryEntity build()`

#### Setter Methods

- `AncillaryEntityBuilder setAncillaryParty(AncillaryRoleEnum arg0)`
- `AncillaryEntityBuilder setLegalEntity(LegalEntity arg0)`

#### Getter Methods

- `AncillaryRoleEnum getAncillaryParty()`
- `LegalEntityBuilder getOrCreateLegalEntity()`
- `LegalEntityBuilder getLegalEntity()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `AncillaryEntityBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `AncillaryEntityBuilder prune()`
- `AncillaryEntityBuilder toBuilder()`
- `boolean hasData()`

