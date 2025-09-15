# NaturalPersonBuilderImpl

**Full Name:** `cdm.base.staticdata.party.NaturalPerson$NaturalPersonBuilderImpl`

**Package:** `cdm.base.staticdata.party`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.base.staticdata.party.NaturalPerson$NaturalPersonBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| personId | `java.util.List<cdm.base.staticdata.party.metafields.FieldWithMetaPersonIdentifier$FieldWithMetaPersonIdentifierBuilder>` |  |
| honorific | `String` |  |
| firstName | `String` |  |
| middleName | `java.util.List<java.lang.String>` |  |
| initial | `java.util.List<java.lang.String>` |  |
| surname | `String` |  |
| suffix | `String` |  |
| dateOfBirth | `Date` |  |
| contactInformation | `ContactInformationBuilder` |  |
| meta | `MetaFieldsBuilder` |  |

### Methods

#### Builder Methods

- `NaturalPerson build()`

#### Setter Methods

- `NaturalPersonBuilder setDateOfBirth(Date arg0)`
- `NaturalPersonBuilder setMiddleName(List arg0)`
- `NaturalPersonBuilder setPersonIdValue(List arg0)`
- `NaturalPersonBuilder setPersonId(List arg0)`
- `NaturalPersonBuilder setHonorific(String arg0)`
- `NaturalPersonBuilder setFirstName(String arg0)`
- `NaturalPersonBuilder setContactInformation(ContactInformation arg0)`
- `NaturalPersonBuilder setInitial(List arg0)`
- `NaturalPersonBuilder setSurname(String arg0)`
- `NaturalPersonBuilder setSuffix(String arg0)`
- `NaturalPersonBuilder setMeta(MetaFields arg0)`

#### Getter Methods

- `String getFirstName()`
- `List getMiddleName()`
- `Date getDateOfBirth()`
- `List getPersonId()`
- `String getHonorific()`
- `FieldWithMetaPersonIdentifierBuilder getOrCreatePersonId(int arg0)`
- `ContactInformationBuilder getContactInformation()`
- `MetaFieldsBuilder getOrCreateMeta()`
- `List getInitial()`
- `String getSurname()`
- `String getSuffix()`
- `ContactInformationBuilder getOrCreateContactInformation()`
- `MetaFieldsBuilder getMeta()`

#### Adder Methods

- `NaturalPersonBuilder addMiddleName(String arg0)`
- `NaturalPersonBuilder addMiddleName(String arg0, int arg1)`
- `NaturalPersonBuilder addMiddleName(List arg0)`
- `NaturalPersonBuilder addPersonId(FieldWithMetaPersonIdentifier arg0)`
- `NaturalPersonBuilder addPersonId(FieldWithMetaPersonIdentifier arg0, int arg1)`
- `NaturalPersonBuilder addPersonId(List arg0)`
- `NaturalPersonBuilder addPersonIdValue(List arg0)`
- `NaturalPersonBuilder addPersonIdValue(PersonIdentifier arg0)`
- `NaturalPersonBuilder addPersonIdValue(PersonIdentifier arg0, int arg1)`
- `NaturalPersonBuilder addInitial(String arg0)`
- `NaturalPersonBuilder addInitial(List arg0)`
- `NaturalPersonBuilder addInitial(String arg0, int arg1)`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `NaturalPersonBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `boolean hasData()`
- `NaturalPersonBuilder toBuilder()`
- `NaturalPersonBuilder prune()`

