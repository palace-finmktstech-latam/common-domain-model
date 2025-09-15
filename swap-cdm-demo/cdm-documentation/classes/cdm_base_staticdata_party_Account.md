# Account

**Full Name:** `cdm.base.staticdata.party.Account`

**Package:** `cdm.base.staticdata.party`

## Type: Interface

### Implemented Interfaces

- `com.rosetta.model.lib.RosettaModelObject`
- `com.rosetta.model.lib.GlobalKey`

### Methods

#### Builder Methods

- `Account build()`

#### Getter Methods

- `Class getType()`
- `ReferenceWithMetaParty getPartyReference()`
- `ReferenceWithMetaParty getAccountBeneficiary()`
- `FieldWithMetaString getAccountName()`
- `FieldWithMetaString getAccountNumber()`
- `FieldWithMetaAccountTypeEnum getAccountType()`
- `ReferenceWithMetaParty getServicingParty()`
- `MetaFields getMeta()`

#### Other Methods

- `void process(RosettaPath arg0, Processor arg1)`
- `AccountBuilder toBuilder()`
- `RosettaMetaData metaData()`

### Annotations

- **RuneDataType**
- **RosettaDataType**

