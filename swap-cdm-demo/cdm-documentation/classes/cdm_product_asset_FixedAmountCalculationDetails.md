# FixedAmountCalculationDetails

**Full Name:** `cdm.product.asset.FixedAmountCalculationDetails`

**Package:** `cdm.product.asset`

## Type: Interface

### Implemented Interfaces

- `com.rosetta.model.lib.RosettaModelObject`

### Methods

#### Builder Methods

- `FixedAmountCalculationDetails build()`

#### Getter Methods

- `Class getType()`
- `BigDecimal getYearFraction()`
- `BigDecimal getFixedRate()`
- `BigDecimal getCalculatedAmount()`
- `CalculationPeriodBase getCalculationPeriod()`
- `Money getCalculationPeriodNotionalAmount()`

#### Other Methods

- `void process(RosettaPath arg0, Processor arg1)`
- `FixedAmountCalculationDetailsBuilder toBuilder()`
- `RosettaMetaData metaData()`

### Annotations

- **RuneDataType**
- **RosettaDataType**

