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
- `SettlementProvision getSettlementProvision()`
- `TransferSettlementEnum getTransferSettlementType()`
- `StandardSettlementStyleEnum getStandardSettlementStyle()`
- `SettlementTypeEnum getSettlementType()`
- `SettlementCentreEnum getSettlementCentre()`
- `SettlementDate getSettlementDate()`
- `FieldWithMetaString getSettlementCurrency()`
- `MetaFields getMeta()`

#### Other Methods

- `void process(RosettaPath arg0, Processor arg1)`
- `SettlementBaseBuilder toBuilder()`
- `RosettaMetaData metaData()`

### Annotations

- **RuneDataType**
- **RosettaDataType**

