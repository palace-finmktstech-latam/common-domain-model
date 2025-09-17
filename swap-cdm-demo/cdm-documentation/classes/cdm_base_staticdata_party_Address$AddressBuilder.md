# AddressBuilder

**Full Name:** `cdm.base.staticdata.party.Address$AddressBuilder`

**Package:** `cdm.base.staticdata.party`

## Type: Interface

### Implemented Interfaces

- `cdm.base.staticdata.party.Address`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`

### Methods

#### Setter Methods

- `AddressBuilder setState(String arg0)`
- `AddressBuilder setCountry(FieldWithMetaString arg0)`
- `AddressBuilder setStreet(List arg0)`
- `AddressBuilder setCity(String arg0)`
- `AddressBuilder setCountryValue(String arg0)`
- `AddressBuilder setPostalCode(String arg0)`

#### Getter Methods

- `FieldWithMetaStringBuilder getCountry()`
- `FieldWithMetaStringBuilder getOrCreateCountry()`

#### Adder Methods

- `AddressBuilder addStreet(List arg0)`
- `AddressBuilder addStreet(String arg0, int arg1)`
- `AddressBuilder addStreet(String arg0)`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `AddressBuilder prune()`

