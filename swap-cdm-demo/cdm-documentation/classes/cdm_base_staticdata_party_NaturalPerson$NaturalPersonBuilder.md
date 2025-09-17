# NaturalPersonBuilder

**Full Name:** `cdm.base.staticdata.party.NaturalPerson$NaturalPersonBuilder`

**Package:** `cdm.base.staticdata.party`

## Type: Interface

### Implemented Interfaces

- `cdm.base.staticdata.party.NaturalPerson`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`
- `com.rosetta.model.lib.GlobalKey$GlobalKeyBuilder`

### Methods

#### Setter Methods

- `NaturalPersonBuilder setMeta(MetaFields arg0)`
- `NaturalPersonBuilder setContactInformation(ContactInformation arg0)`
- `NaturalPersonBuilder setSurname(String arg0)`
- `NaturalPersonBuilder setInitial(List arg0)`
- `NaturalPersonBuilder setSuffix(String arg0)`
- `NaturalPersonBuilder setPersonId(List arg0)`
- `NaturalPersonBuilder setFirstName(String arg0)`
- `NaturalPersonBuilder setHonorific(String arg0)`
- `NaturalPersonBuilder setDateOfBirth(Date arg0)`
- `NaturalPersonBuilder setMiddleName(List arg0)`
- `NaturalPersonBuilder setPersonIdValue(List arg0)`

#### Getter Methods

- `MetaFieldsBuilder getOrCreateMeta()`
- `ContactInformationBuilder getContactInformation()`
- `MetaFieldsBuilder getMeta()`
- `ContactInformationBuilder getOrCreateContactInformation()`
- `List getPersonId()`
- `FieldWithMetaPersonIdentifierBuilder getOrCreatePersonId(int arg0)`

#### Adder Methods

- `NaturalPersonBuilder addInitial(String arg0)`
- `NaturalPersonBuilder addInitial(List arg0)`
- `NaturalPersonBuilder addInitial(String arg0, int arg1)`
- `NaturalPersonBuilder addPersonId(List arg0)`
- `NaturalPersonBuilder addPersonId(FieldWithMetaPersonIdentifier arg0, int arg1)`
- `NaturalPersonBuilder addPersonId(FieldWithMetaPersonIdentifier arg0)`
- `NaturalPersonBuilder addPersonIdValue(PersonIdentifier arg0)`
- `NaturalPersonBuilder addPersonIdValue(PersonIdentifier arg0, int arg1)`
- `NaturalPersonBuilder addPersonIdValue(List arg0)`
- `NaturalPersonBuilder addMiddleName(List arg0)`
- `NaturalPersonBuilder addMiddleName(String arg0, int arg1)`
- `NaturalPersonBuilder addMiddleName(String arg0)`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `NaturalPersonBuilder prune()`

