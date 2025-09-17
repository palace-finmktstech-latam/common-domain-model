# AddressBuilderImpl

**Full Name:** `cdm.base.staticdata.party.Address$AddressBuilderImpl`

**Package:** `cdm.base.staticdata.party`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.base.staticdata.party.Address$AddressBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| street | `java.util.List<java.lang.String>` |  |
| city | `String` |  |
| state | `String` |  |
| country | `FieldWithMetaStringBuilder` |  |
| postalCode | `String` |  |

### Methods

#### Builder Methods

- `Address build()`

#### Setter Methods

- `AddressBuilder setState(String arg0)`
- `AddressBuilder setCountry(FieldWithMetaString arg0)`
- `AddressBuilder setStreet(List arg0)`
- `AddressBuilder setCity(String arg0)`
- `AddressBuilder setCountryValue(String arg0)`
- `AddressBuilder setPostalCode(String arg0)`

#### Getter Methods

- `String getState()`
- `FieldWithMetaStringBuilder getCountry()`
- `String getCity()`
- `List getStreet()`
- `FieldWithMetaStringBuilder getOrCreateCountry()`
- `String getPostalCode()`

#### Adder Methods

- `AddressBuilder addStreet(List arg0)`
- `AddressBuilder addStreet(String arg0, int arg1)`
- `AddressBuilder addStreet(String arg0)`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `AddressBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `AddressBuilder prune()`
- `AddressBuilder toBuilder()`
- `boolean hasData()`

