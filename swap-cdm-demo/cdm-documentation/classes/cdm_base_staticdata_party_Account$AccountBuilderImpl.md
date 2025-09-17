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

- `AccountBuilder setMeta(MetaFields arg0)`
- `AccountBuilder setPartyReference(ReferenceWithMetaParty arg0)`
- `AccountBuilder setAccountNumber(FieldWithMetaString arg0)`
- `AccountBuilder setAccountNameValue(String arg0)`
- `AccountBuilder setAccountType(FieldWithMetaAccountTypeEnum arg0)`
- `AccountBuilder setAccountName(FieldWithMetaString arg0)`
- `AccountBuilder setPartyReferenceValue(Party arg0)`
- `AccountBuilder setAccountTypeValue(AccountTypeEnum arg0)`
- `AccountBuilder setAccountNumberValue(String arg0)`
- `AccountBuilder setServicingParty(ReferenceWithMetaParty arg0)`
- `AccountBuilder setAccountBeneficiaryValue(Party arg0)`
- `AccountBuilder setAccountBeneficiary(ReferenceWithMetaParty arg0)`
- `AccountBuilder setServicingPartyValue(Party arg0)`

#### Getter Methods

- `MetaFieldsBuilder getOrCreateMeta()`
- `MetaFieldsBuilder getMeta()`
- `ReferenceWithMetaPartyBuilder getPartyReference()`
- `FieldWithMetaStringBuilder getAccountNumber()`
- `ReferenceWithMetaPartyBuilder getServicingParty()`
- `ReferenceWithMetaPartyBuilder getOrCreateServicingParty()`
- `ReferenceWithMetaPartyBuilder getOrCreatePartyReference()`
- `FieldWithMetaStringBuilder getOrCreateAccountName()`
- `FieldWithMetaStringBuilder getAccountName()`
- `FieldWithMetaAccountTypeEnumBuilder getOrCreateAccountType()`
- `FieldWithMetaStringBuilder getOrCreateAccountNumber()`
- `ReferenceWithMetaPartyBuilder getAccountBeneficiary()`
- `FieldWithMetaAccountTypeEnumBuilder getAccountType()`
- `ReferenceWithMetaPartyBuilder getOrCreateAccountBeneficiary()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `AccountBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `AccountBuilder prune()`
- `AccountBuilder toBuilder()`
- `boolean hasData()`

