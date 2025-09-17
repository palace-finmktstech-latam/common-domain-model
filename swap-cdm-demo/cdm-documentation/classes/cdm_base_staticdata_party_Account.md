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
- `MetaFields getMeta()`
- `ReferenceWithMetaParty getPartyReference()`
- `FieldWithMetaString getAccountNumber()`
- `ReferenceWithMetaParty getServicingParty()`
- `FieldWithMetaString getAccountName()`
- `ReferenceWithMetaParty getAccountBeneficiary()`
- `FieldWithMetaAccountTypeEnum getAccountType()`

#### Other Methods

- `void process(RosettaPath arg0, Processor arg1)`
- `AccountBuilder toBuilder()`
- `RosettaMetaData metaData()`

### Annotations

- **RuneDataType**
- **RosettaDataType**

