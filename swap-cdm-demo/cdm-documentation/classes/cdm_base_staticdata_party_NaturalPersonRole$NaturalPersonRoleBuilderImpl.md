# NaturalPersonRoleBuilderImpl

**Full Name:** `cdm.base.staticdata.party.NaturalPersonRole$NaturalPersonRoleBuilderImpl`

**Package:** `cdm.base.staticdata.party`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.base.staticdata.party.NaturalPersonRole$NaturalPersonRoleBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| personReference | `ReferenceWithMetaNaturalPersonBuilder` |  |
| role | `java.util.List<cdm.base.staticdata.party.metafields.FieldWithMetaNaturalPersonRoleEnum$FieldWithMetaNaturalPersonRoleEnumBuilder>` |  |

### Methods

#### Builder Methods

- `NaturalPersonRole build()`

#### Setter Methods

- `NaturalPersonRoleBuilder setPersonReference(ReferenceWithMetaNaturalPerson arg0)`
- `NaturalPersonRoleBuilder setRoleValue(List arg0)`
- `NaturalPersonRoleBuilder setPersonReferenceValue(NaturalPerson arg0)`
- `NaturalPersonRoleBuilder setRole(List arg0)`

#### Getter Methods

- `ReferenceWithMetaNaturalPersonBuilder getPersonReference()`
- `FieldWithMetaNaturalPersonRoleEnumBuilder getOrCreateRole(int arg0)`
- `ReferenceWithMetaNaturalPersonBuilder getOrCreatePersonReference()`
- `List getRole()`

#### Adder Methods

- `NaturalPersonRoleBuilder addRoleValue(NaturalPersonRoleEnum arg0)`
- `NaturalPersonRoleBuilder addRoleValue(NaturalPersonRoleEnum arg0, int arg1)`
- `NaturalPersonRoleBuilder addRoleValue(List arg0)`
- `NaturalPersonRoleBuilder addRole(FieldWithMetaNaturalPersonRoleEnum arg0, int arg1)`
- `NaturalPersonRoleBuilder addRole(FieldWithMetaNaturalPersonRoleEnum arg0)`
- `NaturalPersonRoleBuilder addRole(List arg0)`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `NaturalPersonRoleBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `boolean hasData()`
- `NaturalPersonRoleBuilder toBuilder()`
- `NaturalPersonRoleBuilder prune()`

