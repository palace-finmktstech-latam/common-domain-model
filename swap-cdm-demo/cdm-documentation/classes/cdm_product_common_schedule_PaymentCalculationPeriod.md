# PaymentCalculationPeriod

**Full Name:** `cdm.product.common.schedule.PaymentCalculationPeriod`

**Package:** `cdm.product.common.schedule`

## Type: Interface

### Implemented Interfaces

- `com.rosetta.model.lib.RosettaModelObject`
- `com.rosetta.model.lib.GlobalKey`

### Methods

#### Builder Methods

- `PaymentCalculationPeriod build()`

#### Getter Methods

- `Class getType()`
- `MetaFields getMeta()`
- `Money getForecastPaymentAmount()`
- `Money getPresentValueAmount()`
- `Money getFixedPaymentAmount()`
- `BigDecimal getDiscountFactor()`
- `Date getUnadjustedPaymentDate()`
- `Date getAdjustedPaymentDate()`
- `List getCalculationPeriod()`

#### Other Methods

- `void process(RosettaPath arg0, Processor arg1)`
- `PaymentCalculationPeriodBuilder toBuilder()`
- `RosettaMetaData metaData()`

### Annotations

- **RuneDataType**
- **RosettaDataType**

