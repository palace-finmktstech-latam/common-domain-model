# TelephoneNumberBuilderImpl

**Full Name:** `cdm.base.staticdata.party.TelephoneNumber$TelephoneNumberBuilderImpl`

**Package:** `cdm.base.staticdata.party`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.base.staticdata.party.TelephoneNumber$TelephoneNumberBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| telephoneNumberType | `TelephoneTypeEnum` |  |
| number | `String` |  |

### Methods

#### Builder Methods

- `TelephoneNumber build()`

#### Setter Methods

- `TelephoneNumberBuilder setNumber(String arg0)`
- `TelephoneNumberBuilder setTelephoneNumberType(TelephoneTypeEnum arg0)`

#### Getter Methods

- `String getNumber()`
- `TelephoneTypeEnum getTelephoneNumberType()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `TelephoneNumberBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `TelephoneNumberBuilder prune()`
- `TelephoneNumberBuilder toBuilder()`
- `boolean hasData()`

