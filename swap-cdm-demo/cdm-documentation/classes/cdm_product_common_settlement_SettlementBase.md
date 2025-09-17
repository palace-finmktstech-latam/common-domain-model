# SettlementBase

**Full Name:** `cdm.product.common.settlement.SettlementBase`

**Package:** `cdm.product.common.settlement`

## Type: Interface

### Implemented Interfaces

- `com.rosetta.model.lib.RosettaModelObject`
- `com.rosetta.model.lib.GlobalKey`

### Methods

#### Builder Methods

- `SettlementBase build()`

#### Getter Methods

- `Class getType()`
- `SettlementDate getSettlementDate()`
- `MetaFields getMeta()`
- `FieldWithMetaString getSettlementCurrency()`
- `TransferSettlementEnum getTransferSettlementType()`
- `SettlementProvision getSettlementProvision()`
- `StandardSettlementStyleEnum getStandardSettlementStyle()`
- `SettlementTypeEnum getSettlementType()`
- `SettlementCentreEnum getSettlementCentre()`

#### Other Methods

- `void process(RosettaPath arg0, Processor arg1)`
- `SettlementBaseBuilder toBuilder()`
- `RosettaMetaData metaData()`

### Annotations

- **RuneDataType**
- **RosettaDataType**

