# AccountBuilder

**Full Name:** `cdm.base.staticdata.party.Account$AccountBuilder`

**Package:** `cdm.base.staticdata.party`

## Type: Interface

### Implemented Interfaces

- `cdm.base.staticdata.party.Account`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`
- `com.rosetta.model.lib.GlobalKey$GlobalKeyBuilder`

### Methods

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

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `AccountBuilder prune()`

