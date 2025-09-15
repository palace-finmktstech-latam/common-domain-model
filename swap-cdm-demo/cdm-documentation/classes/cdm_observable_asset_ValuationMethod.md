# ValuationMethod

**Full Name:** `cdm.observable.asset.ValuationMethod`

**Package:** `cdm.observable.asset`

## Type: Interface

### Implemented Interfaces

- `com.rosetta.model.lib.RosettaModelObject`

### Methods

#### Builder Methods

- `ValuationMethod build()`

#### Getter Methods

- `Class getType()`
- `ValuationSource getValuationSource()`
- `Money getQuotationAmount()`
- `Money getMinimumQuotationAmount()`
- `QuotationRateTypeEnum getQuotationMethod()`
- `ValuationMethodEnum getValuationMethod()`
- `CashCollateralValuationMethod getCashCollateralValuationMethod()`

#### Other Methods

- `void process(RosettaPath arg0, Processor arg1)`
- `ValuationMethodBuilder toBuilder()`
- `RosettaMetaData metaData()`

### Annotations

- **RuneDataType**
- **RosettaDataType**

