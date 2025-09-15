# PartyContactInformationBuilder

**Full Name:** `cdm.base.staticdata.party.PartyContactInformation$PartyContactInformationBuilder`

**Package:** `cdm.base.staticdata.party`

## Type: Interface

### Implemented Interfaces

- `cdm.base.staticdata.party.PartyContactInformation`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`

### Methods

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

#### Adder Methods

- `PartyContactInformationBuilder addPerson(NaturalPerson arg0, int arg1)`
- `PartyContactInformationBuilder addPerson(List arg0)`
- `PartyContactInformationBuilder addPerson(NaturalPerson arg0)`
- `PartyContactInformationBuilder addBusinessUnit(List arg0)`
- `PartyContactInformationBuilder addBusinessUnit(BusinessUnit arg0, int arg1)`
- `PartyContactInformationBuilder addBusinessUnit(BusinessUnit arg0)`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `PartyContactInformationBuilder prune()`

