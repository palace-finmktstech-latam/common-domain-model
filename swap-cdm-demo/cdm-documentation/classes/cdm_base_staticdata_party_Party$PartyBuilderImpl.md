# PartyBuilderImpl

**Full Name:** `cdm.base.staticdata.party.Party$PartyBuilderImpl`

**Package:** `cdm.base.staticdata.party`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.base.staticdata.party.Party$PartyBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| partyId | `java.util.List<cdm.base.staticdata.party.PartyIdentifier$PartyIdentifierBuilder>` |  |
| name | `FieldWithMetaStringBuilder` |  |
| businessUnit | `java.util.List<cdm.base.staticdata.party.BusinessUnit$BusinessUnitBuilder>` |  |
| person | `java.util.List<cdm.base.staticdata.party.NaturalPerson$NaturalPersonBuilder>` |  |
| personRole | `java.util.List<cdm.base.staticdata.party.NaturalPersonRole$NaturalPersonRoleBuilder>` |  |
| account | `AccountBuilder` |  |
| contactInformation | `ContactInformationBuilder` |  |
| meta | `MetaFieldsBuilder` |  |

### Methods

#### Builder Methods

- `Party build()`

#### Setter Methods

- `PartyBuilder setName(FieldWithMetaString arg0)`
- `PartyBuilder setAccount(Account arg0)`
- `PartyBuilder setPartyId(List arg0)`
- `PartyBuilder setPerson(List arg0)`
- `PartyBuilder setNameValue(String arg0)`
- `PartyBuilder setPersonRole(List arg0)`
- `PartyBuilder setContactInformation(ContactInformation arg0)`
- `PartyBuilder setBusinessUnit(List arg0)`
- `PartyBuilder setMeta(MetaFields arg0)`

#### Getter Methods

- `FieldWithMetaStringBuilder getName()`
- `List getBusinessUnit()`
- `List getPersonRole()`
- `ContactInformationBuilder getContactInformation()`
- `MetaFieldsBuilder getOrCreateMeta()`
- `AccountBuilder getOrCreateAccount()`
- `FieldWithMetaStringBuilder getOrCreateName()`
- `PartyIdentifierBuilder getOrCreatePartyId(int arg0)`
- `NaturalPersonRoleBuilder getOrCreatePersonRole(int arg0)`
- `NaturalPersonBuilder getOrCreatePerson(int arg0)`
- `BusinessUnitBuilder getOrCreateBusinessUnit(int arg0)`
- `AccountBuilder getAccount()`
- `ContactInformationBuilder getOrCreateContactInformation()`
- `List getPartyId()`
- `List getPerson()`
- `MetaFieldsBuilder getMeta()`

#### Adder Methods

- `PartyBuilder addPartyId(PartyIdentifier arg0)`
- `PartyBuilder addPartyId(List arg0)`
- `PartyBuilder addPartyId(PartyIdentifier arg0, int arg1)`
- `PartyBuilder addPerson(NaturalPerson arg0)`
- `PartyBuilder addPerson(NaturalPerson arg0, int arg1)`
- `PartyBuilder addPerson(List arg0)`
- `PartyBuilder addBusinessUnit(BusinessUnit arg0, int arg1)`
- `PartyBuilder addBusinessUnit(BusinessUnit arg0)`
- `PartyBuilder addBusinessUnit(List arg0)`
- `PartyBuilder addPersonRole(NaturalPersonRole arg0, int arg1)`
- `PartyBuilder addPersonRole(NaturalPersonRole arg0)`
- `PartyBuilder addPersonRole(List arg0)`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `PartyBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `boolean hasData()`
- `PartyBuilder toBuilder()`
- `PartyBuilder prune()`

