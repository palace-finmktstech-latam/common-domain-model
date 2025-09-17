# PrincipalPayments

**Full Name:** `cdm.product.common.settlement.PrincipalPayments`

**Package:** `cdm.product.common.settlement`

## Type: Interface

### Implemented Interfaces

- `com.rosetta.model.lib.RosettaModelObject`
- `com.rosetta.model.lib.GlobalKey`

### Methods

#### Builder Methods

- `PrincipalPayments build()`

#### Getter Methods

- `Class getType()`
- `MetaFields getMeta()`
- `Boolean getInitialPayment()`
- `Boolean getIntermediatePayment()`
- `Boolean getFinalPayment()`
- `PrincipalPaymentSchedule getPrincipalPaymentSchedule()`
- `List getVaryingLegNotionalCurrency()`

#### Other Methods

- `void process(RosettaPath arg0, Processor arg1)`
- `PrincipalPaymentsBuilder toBuilder()`
- `RosettaMetaData metaData()`

### Annotations

- **RuneDataType**
- **RosettaDataType**

