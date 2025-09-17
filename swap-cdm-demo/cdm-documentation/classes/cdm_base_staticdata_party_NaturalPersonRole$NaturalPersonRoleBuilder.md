# NaturalPersonRoleBuilder

**Full Name:** `cdm.base.staticdata.party.NaturalPersonRole$NaturalPersonRoleBuilder`

**Package:** `cdm.base.staticdata.party`

## Type: Interface

### Implemented Interfaces

- `cdm.base.staticdata.party.NaturalPersonRole`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`

### Methods

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

- `NaturalPersonRoleBuilder addRole(List arg0)`
- `NaturalPersonRoleBuilder addRole(FieldWithMetaNaturalPersonRoleEnum arg0, int arg1)`
- `NaturalPersonRoleBuilder addRole(FieldWithMetaNaturalPersonRoleEnum arg0)`
- `NaturalPersonRoleBuilder addRoleValue(NaturalPersonRoleEnum arg0, int arg1)`
- `NaturalPersonRoleBuilder addRoleValue(NaturalPersonRoleEnum arg0)`
- `NaturalPersonRoleBuilder addRoleValue(List arg0)`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `NaturalPersonRoleBuilder prune()`

