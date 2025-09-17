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
- `DividendPaymentDate getDividendPaymentDate()`
- `AdjustableOrRelativeDate getDividendValuationDate()`
- `BusinessDayAdjustments getDateAdjustments()`
- `DividendPaymentDate getEndDate()`
- `ReferenceWithMetaBasketConstituent getBasketConstituent()`
- `DividendPaymentDate getStartDate()`

#### Other Methods

- `void process(RosettaPath arg0, Processor arg1)`
- `DividendPeriodBuilder toBuilder()`
- `RosettaMetaData metaData()`

### Annotations

- **RuneDataType**
- **RosettaDataType**

