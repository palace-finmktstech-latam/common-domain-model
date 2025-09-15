# NaturalPersonRoleBuilder

**Full Name:** `cdm.base.staticdata.party.NaturalPersonRole$NaturalPersonRoleBuilder`

**Package:** `cdm.base.staticdata.party`

## Type: Interface

### Implemented Interfaces

- `cdm.base.staticdata.party.NaturalPersonRole`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`

### Methods

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

- `NaturalPersonRoleBuilder addRoleValue(List arg0)`
- `NaturalPersonRoleBuilder addRoleValue(NaturalPersonRoleEnum arg0, int arg1)`
- `NaturalPersonRoleBuilder addRoleValue(NaturalPersonRoleEnum arg0)`
- `NaturalPersonRoleBuilder addRole(FieldWithMetaNaturalPersonRoleEnum arg0)`
- `NaturalPersonRoleBuilder addRole(List arg0)`
- `NaturalPersonRoleBuilder addRole(FieldWithMetaNaturalPersonRoleEnum arg0, int arg1)`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `NaturalPersonRoleBuilder prune()`

