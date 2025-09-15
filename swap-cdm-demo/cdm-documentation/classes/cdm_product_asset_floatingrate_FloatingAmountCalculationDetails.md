# FloatingAmountCalculationDetails

**Full Name:** `cdm.product.asset.floatingrate.FloatingAmountCalculationDetails`

**Package:** `cdm.product.asset.floatingrate`

## Type: Interface

### Implemented Interfaces

- `com.rosetta.model.lib.RosettaModelObject`

### Methods

#### Builder Methods

- `FloatingAmountCalculationDetails build()`

#### Getter Methods

- `Class getType()`
- `BigDecimal getYearFraction()`
- `BigDecimal getCalculatedAmount()`
- `FloatingRateSettingDetails getFloatingRate()`
- `CalculationPeriodBase getCalculationPeriod()`
- `FloatingRateProcessingDetails getProcessingDetails()`
- `BigDecimal getAppliedRate()`
- `BigDecimal getSpreadExclusiveCalculatedAMount()`
- `Money getCalculationPeriodNotionalAmount()`

#### Other Methods

- `void process(RosettaPath arg0, Processor arg1)`
- `FloatingAmountCalculationDetailsBuilder toBuilder()`
- `RosettaMetaData metaData()`

### Annotations

- **RuneDataType**
- **RosettaDataType**

