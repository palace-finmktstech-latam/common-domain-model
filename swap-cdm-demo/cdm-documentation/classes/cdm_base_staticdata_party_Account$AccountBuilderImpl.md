# AccountBuilderImpl

**Full Name:** `cdm.base.staticdata.party.Account$AccountBuilderImpl`

**Package:** `cdm.base.staticdata.party`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.base.staticdata.party.Account$AccountBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| partyReference | `ReferenceWithMetaPartyBuilder` |  |
| accountNumber | `FieldWithMetaStringBuilder` |  |
| accountName | `FieldWithMetaStringBuilder` |  |
| accountType | `FieldWithMetaAccountTypeEnumBuilder` |  |
| accountBeneficiary | `ReferenceWithMetaPartyBuilder` |  |
| servicingParty | `ReferenceWithMetaPartyBuilder` |  |
| meta | `MetaFieldsBuilder` |  |

### Methods

#### Builder Methods

- `Account build()`

#### Setter Methods

- `AccountBuilder setPartyReferenceValue(Party arg0)`
- `AccountBuilder setAccountNumber(FieldWithMetaString arg0)`
- `AccountBuilder setAccountNumberValue(String arg0)`
- `AccountBuilder setAccountTypeValue(AccountTypeEnum arg0)`
- `AccountBuilder setServicingPartyValue(Party arg0)`
- `AccountBuilder setAccountBeneficiary(ReferenceWithMetaParty arg0)`
- `AccountBuilder setAccountBeneficiaryValue(Party arg0)`
- `AccountBuilder setAccountType(FieldWithMetaAccountTypeEnum arg0)`
- `AccountBuilder setServicingParty(ReferenceWithMetaParty arg0)`
- `AccountBuilder setAccountNameValue(String arg0)`
- `AccountBuilder setAccountName(FieldWithMetaString arg0)`
- `AccountBuilder setMeta(MetaFields arg0)`
- `AccountBuilder setPartyReference(ReferenceWithMetaParty arg0)`

#### Getter Methods

- `MetaFieldsBuilder getOrCreateMeta()`
- `ReferenceWithMetaPartyBuilder getPartyReference()`
- `FieldWithMetaAccountTypeEnumBuilder getOrCreateAccountType()`
- `ReferenceWithMetaPartyBuilder getOrCreateServicingParty()`
- `ReferenceWithMetaPartyBuilder getAccountBeneficiary()`
- `FieldWithMetaStringBuilder getAccountName()`
- `ReferenceWithMetaPartyBuilder getOrCreatePartyReference()`
- `FieldWithMetaStringBuilder getOrCreateAccountNumber()`
- `FieldWithMetaStringBuilder getAccountNumber()`
- `FieldWithMetaAccountTypeEnumBuilder getAccountType()`
- `ReferenceWithMetaPartyBuilder getServicingParty()`
- `FieldWithMetaStringBuilder getOrCreateAccountName()`
- `ReferenceWithMetaPartyBuilder getOrCreateAccountBeneficiary()`
- `MetaFieldsBuilder getMeta()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `AccountBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `boolean hasData()`
- `AccountBuilder toBuilder()`
- `AccountBuilder prune()`

