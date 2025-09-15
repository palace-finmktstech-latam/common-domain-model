# PartyContactInformationBuilderImpl

**Full Name:** `cdm.base.staticdata.party.PartyContactInformation$PartyContactInformationBuilderImpl`

**Package:** `cdm.base.staticdata.party`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.base.staticdata.party.PartyContactInformation$PartyContactInformationBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| partyReference | `ReferenceWithMetaPartyBuilder` |  |
| contactInformation | `ContactInformationBuilder` |  |
| businessUnit | `java.util.List<cdm.base.staticdata.party.BusinessUnit$BusinessUnitBuilder>` |  |
| person | `java.util.List<cdm.base.staticdata.party.NaturalPerson$NaturalPersonBuilder>` |  |
| additionalInformation | `String` |  |

### Methods

#### Builder Methods

- `PartyContactInformation build()`

#### Setter Methods

- `PartyContactInformationBuilder setPerson(List arg0)`
- `PartyContactInformationBuilder setPartyReferenceValue(Party arg0)`
- `PartyContactInformationBuilder setContactInformation(ContactInformation arg0)`
- `PartyContactInformationBuilder setBusinessUnit(List arg0)`
- `PartyContactInformationBuilder setPartyReference(ReferenceWithMetaParty arg0)`
- `PartyContactInformationBuilder setAdditionalInformation(String arg0)`

#### Getter Methods

- `List getBusinessUnit()`
- `ContactInformationBuilder getContactInformation()`
- `ReferenceWithMetaPartyBuilder getPartyReference()`
- `ReferenceWithMetaPartyBuilder getOrCreatePartyReference()`
- `NaturalPersonBuilder getOrCreatePerson(int arg0)`
- `BusinessUnitBuilder getOrCreateBusinessUnit(int arg0)`
- `ContactInformationBuilder getOrCreateContactInformation()`
- `List getPerson()`
- `String getAdditionalInformation()`

#### Adder Methods

- `PartyContactInformationBuilder addPerson(NaturalPerson arg0)`
- `PartyContactInformationBuilder addPerson(List arg0)`
- `PartyContactInformationBuilder addPerson(NaturalPerson arg0, int arg1)`
- `PartyContactInformationBuilder addBusinessUnit(BusinessUnit arg0)`
- `PartyContactInformationBuilder addBusinessUnit(BusinessUnit arg0, int arg1)`
- `PartyContactInformationBuilder addBusinessUnit(List arg0)`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `PartyContactInformationBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `boolean hasData()`
- `PartyContactInformationBuilder toBuilder()`
- `PartyContactInformationBuilder prune()`

