# CashSettlementTerms

**Full Name:** `cdm.product.common.settlement.CashSettlementTerms`

**Package:** `cdm.product.common.settlement`

## Type: Interface

### Implemented Interfaces

- `com.rosetta.model.lib.RosettaModelObject`
- `com.rosetta.model.lib.GlobalKey`

### Methods

#### Builder Methods

- `CashSettlementTerms build()`

#### Getter Methods

- `Class getType()`
- `Boolean getFixedSettlement()`
- `CashSettlementMethodEnum getCashSettlementMethod()`
- `ValuationMethod getValuationMethod()`
- `Money getCashSettlementAmount()`
- `BigDecimal getRecoveryFactor()`
- `BusinessCenterTime getValuationTime()`
- `ValuationDate getValuationDate()`
- `Boolean getAccruedInterest()`
- `MetaFields getMeta()`

#### Other Methods

- `void process(RosettaPath arg0, Processor arg1)`
- `CashSettlementTermsBuilder toBuilder()`
- `RosettaMetaData metaData()`

### Annotations

- **RuneDataType**
- **RosettaDataType**

