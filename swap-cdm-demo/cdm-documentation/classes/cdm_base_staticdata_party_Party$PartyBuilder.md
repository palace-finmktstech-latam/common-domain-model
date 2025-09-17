# PartyBuilder

**Full Name:** `cdm.base.staticdata.party.Party$PartyBuilder`

**Package:** `cdm.base.staticdata.party`

## Type: Interface

### Implemented Interfaces

- `cdm.base.staticdata.party.Party`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`
- `com.rosetta.model.lib.GlobalKey$GlobalKeyBuilder`

### Methods

#### Setter Methods

- `PartyBuilder setName(FieldWithMetaString arg0)`
- `PartyBuilder setMeta(MetaFields arg0)`
- `PartyBuilder setAccount(Account arg0)`
- `PartyBuilder setNameValue(String arg0)`
- `PartyBuilder setBusinessUnit(List arg0)`
- `PartyBuilder setPersonRole(List arg0)`
- `PartyBuilder setContactInformation(ContactInformation arg0)`
- `PartyBuilder setPartyId(List arg0)`
- `PartyBuilder setPerson(List arg0)`

#### Getter Methods

- `FieldWithMetaStringBuilder getName()`
- `MetaFieldsBuilder getOrCreateMeta()`
- `ContactInformationBuilder getContactInformation()`
- `List getBusinessUnit()`
- `List getPersonRole()`
- `MetaFieldsBuilder getMeta()`
- `AccountBuilder getAccount()`
- `List getPerson()`
- `List getPartyId()`
- `AccountBuilder getOrCreateAccount()`
- `PartyIdentifierBuilder getOrCreatePartyId(int arg0)`
- `NaturalPersonBuilder getOrCreatePerson(int arg0)`
- `FieldWithMetaStringBuilder getOrCreateName()`
- `NaturalPersonRoleBuilder getOrCreatePersonRole(int arg0)`
- `BusinessUnitBuilder getOrCreateBusinessUnit(int arg0)`
- `ContactInformationBuilder getOrCreateContactInformation()`

#### Adder Methods

- `PartyBuilder addBusinessUnit(BusinessUnit arg0, int arg1)`
- `PartyBuilder addBusinessUnit(BusinessUnit arg0)`
- `PartyBuilder addBusinessUnit(List arg0)`
- `PartyBuilder addPersonRole(NaturalPersonRole arg0)`
- `PartyBuilder addPersonRole(NaturalPersonRole arg0, int arg1)`
- `PartyBuilder addPersonRole(List arg0)`
- `PartyBuilder addPerson(List arg0)`
- `PartyBuilder addPerson(NaturalPerson arg0)`
- `PartyBuilder addPerson(NaturalPerson arg0, int arg1)`
- `PartyBuilder addPartyId(PartyIdentifier arg0, int arg1)`
- `PartyBuilder addPartyId(List arg0)`
- `PartyBuilder addPartyId(PartyIdentifier arg0)`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `PartyBuilder prune()`

