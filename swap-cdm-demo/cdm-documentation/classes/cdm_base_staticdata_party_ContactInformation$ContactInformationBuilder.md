# ContactInformationBuilder

**Full Name:** `cdm.base.staticdata.party.ContactInformation$ContactInformationBuilder`

**Package:** `cdm.base.staticdata.party`

## Type: Interface

### Implemented Interfaces

- `cdm.base.staticdata.party.ContactInformation`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`

### Methods

#### Setter Methods

- `ContactInformationBuilder setAddress(List arg0)`
- `ContactInformationBuilder setEmail(List arg0)`
- `ContactInformationBuilder setWebPage(List arg0)`
- `ContactInformationBuilder setTelephone(List arg0)`

#### Getter Methods

- `List getAddress()`
- `TelephoneNumberBuilder getOrCreateTelephone(int arg0)`
- `AddressBuilder getOrCreateAddress(int arg0)`
- `List getTelephone()`

#### Adder Methods

- `ContactInformationBuilder addAddress(Address arg0, int arg1)`
- `ContactInformationBuilder addAddress(List arg0)`
- `ContactInformationBuilder addAddress(Address arg0)`
- `ContactInformationBuilder addWebPage(String arg0)`
- `ContactInformationBuilder addWebPage(String arg0, int arg1)`
- `ContactInformationBuilder addWebPage(List arg0)`
- `ContactInformationBuilder addEmail(List arg0)`
- `ContactInformationBuilder addEmail(String arg0)`
- `ContactInformationBuilder addEmail(String arg0, int arg1)`
- `ContactInformationBuilder addTelephone(TelephoneNumber arg0, int arg1)`
- `ContactInformationBuilder addTelephone(List arg0)`
- `ContactInformationBuilder addTelephone(TelephoneNumber arg0)`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `ContactInformationBuilder prune()`

