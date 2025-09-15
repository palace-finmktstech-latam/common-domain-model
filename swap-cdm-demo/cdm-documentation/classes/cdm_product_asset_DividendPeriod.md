# DividendPeriod

**Full Name:** `cdm.product.asset.DividendPeriod`

**Package:** `cdm.product.asset`

## Type: Interface

### Implemented Interfaces

- `com.rosetta.model.lib.RosettaModelObject`

### Methods

#### Builder Methods

- `DividendPeriod build()`

#### Getter Methods

- `Class getType()`
- `ReferenceWithMetaBasketConstituent getBasketConstituent()`
- `DividendPaymentDate getStartDate()`
- `DividendPaymentDate getEndDate()`
- `DividendPaymentDate getDividendPaymentDate()`
- `AdjustableOrRelativeDate getDividendValuationDate()`
- `BusinessDayAdjustments getDateAdjustments()`

#### Other Methods

- `void process(RosettaPath arg0, Processor arg1)`
- `DividendPeriodBuilder toBuilder()`
- `RosettaMetaData metaData()`

### Annotations

- **RuneDataType**
- **RosettaDataType**

