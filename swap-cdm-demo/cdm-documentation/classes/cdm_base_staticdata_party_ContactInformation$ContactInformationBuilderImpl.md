# ContactInformationBuilderImpl

**Full Name:** `cdm.base.staticdata.party.ContactInformation$ContactInformationBuilderImpl`

**Package:** `cdm.base.staticdata.party`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.base.staticdata.party.ContactInformation$ContactInformationBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| telephone | `java.util.List<cdm.base.staticdata.party.TelephoneNumber$TelephoneNumberBuilder>` |  |
| address | `java.util.List<cdm.base.staticdata.party.Address$AddressBuilder>` |  |
| email | `java.util.List<java.lang.String>` |  |
| webPage | `java.util.List<java.lang.String>` |  |

### Methods

#### Builder Methods

- `ContactInformation build()`

#### Setter Methods

- `ContactInformationBuilder setAddress(List arg0)`
- `ContactInformationBuilder setEmail(List arg0)`
- `ContactInformationBuilder setWebPage(List arg0)`
- `ContactInformationBuilder setTelephone(List arg0)`

#### Getter Methods

- `List getAddress()`
- `List getEmail()`
- `List getWebPage()`
- `TelephoneNumberBuilder getOrCreateTelephone(int arg0)`
- `AddressBuilder getOrCreateAddress(int arg0)`
- `List getTelephone()`

#### Adder Methods

- `ContactInformationBuilder addAddress(List arg0)`
- `ContactInformationBuilder addAddress(Address arg0, int arg1)`
- `ContactInformationBuilder addAddress(Address arg0)`
- `ContactInformationBuilder addWebPage(String arg0)`
- `ContactInformationBuilder addWebPage(String arg0, int arg1)`
- `ContactInformationBuilder addWebPage(List arg0)`
- `ContactInformationBuilder addEmail(String arg0, int arg1)`
- `ContactInformationBuilder addEmail(String arg0)`
- `ContactInformationBuilder addEmail(List arg0)`
- `ContactInformationBuilder addTelephone(List arg0)`
- `ContactInformationBuilder addTelephone(TelephoneNumber arg0)`
- `ContactInformationBuilder addTelephone(TelephoneNumber arg0, int arg1)`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `ContactInformationBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `ContactInformationBuilder prune()`
- `ContactInformationBuilder toBuilder()`
- `boolean hasData()`

