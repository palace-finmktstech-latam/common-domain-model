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

- `NaturalPersonRoleBuilder setRole(List arg0)`
- `NaturalPersonRoleBuilder setPersonReference(ReferenceWithMetaNaturalPerson arg0)`
- `NaturalPersonRoleBuilder setPersonReferenceValue(NaturalPerson arg0)`
- `NaturalPersonRoleBuilder setRoleValue(List arg0)`

#### Getter Methods

- `List getRole()`
- `ReferenceWithMetaNaturalPersonBuilder getOrCreatePersonReference()`
- `FieldWithMetaNaturalPersonRoleEnumBuilder getOrCreateRole(int arg0)`
- `ReferenceWithMetaNaturalPersonBuilder getPersonReference()`

#### Adder Methods

- `NaturalPersonRoleBuilder addRole(FieldWithMetaNaturalPersonRoleEnum arg0, int arg1)`
- `NaturalPersonRoleBuilder addRole(FieldWithMetaNaturalPersonRoleEnum arg0)`
- `NaturalPersonRoleBuilder addRole(List arg0)`
- `NaturalPersonRoleBuilder addRoleValue(NaturalPersonRoleEnum arg0)`
- `NaturalPersonRoleBuilder addRoleValue(List arg0)`
- `NaturalPersonRoleBuilder addRoleValue(NaturalPersonRoleEnum arg0, int arg1)`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `NaturalPersonRoleBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `NaturalPersonRoleBuilder prune()`
- `NaturalPersonRoleBuilder toBuilder()`
- `boolean hasData()`

