# PrincipalPayment

**Full Name:** `cdm.product.common.settlement.PrincipalPayment`

**Package:** `cdm.product.common.settlement`

## Type: Interface

### Implemented Interfaces

- `com.rosetta.model.lib.RosettaModelObject`
- `com.rosetta.model.lib.GlobalKey`

### Methods

#### Builder Methods

- `PrincipalPayment build()`

#### Getter Methods

- `Class getType()`
- `PayerReceiver getPayerReceiver()`
- `Money getPresentValuePrincipalAmount()`
- `BigDecimal getDiscountFactor()`
- `MetaFields getMeta()`
- `AdjustableDate getPrincipalPaymentDate()`
- `Money getPrincipalAmount()`

#### Other Methods

- `void process(RosettaPath arg0, Processor arg1)`
- `PrincipalPaymentBuilder toBuilder()`
- `RosettaMetaData metaData()`

### Annotations

- **RuneDataType**
- **RosettaDataType**

