# SettlementDate

**Full Name:** `cdm.product.common.settlement.SettlementDate`

**Package:** `cdm.product.common.settlement`

## Type: Interface

### Implemented Interfaces

- `com.rosetta.model.lib.RosettaModelObject`
- `com.rosetta.model.lib.GlobalKey`

### Methods

#### Builder Methods

- `SettlementDate build()`

#### Getter Methods

- `Class getType()`
- `Boolean getPaymentDelay()`
- `BusinessDateRange getBusinessDateRange()`
- `Date getValueDate()`
- `AdjustableDates getAdjustableDates()`
- `Integer getCashSettlementBusinessDays()`
- `AdjustableOrAdjustedOrRelativeDate getAdjustableOrRelativeDate()`
- `MetaFields getMeta()`

#### Other Methods

- `void process(RosettaPath arg0, Processor arg1)`
- `SettlementDateBuilder toBuilder()`
- `RosettaMetaData metaData()`

### Annotations

- **RuneDataType**
- **RosettaDataType**

