# PriceSchedule

**Full Name:** `cdm.observable.asset.PriceSchedule`

**Package:** `cdm.observable.asset`

## Type: Interface

### Implemented Interfaces

- `cdm.base.math.MeasureSchedule`

### Methods

#### Builder Methods

- `PriceSchedule build()`

#### Getter Methods

- `Class getType()`
- `UnitType getPerUnitOf()`
- `PriceTypeEnum getPriceType()`
- `PriceExpressionEnum getPriceExpression()`
- `ArithmeticOperationEnum getArithmeticOperator()`
- `PriceComposite getComposite()`
- `CashPrice getCashPrice()`

#### Other Methods

- `void process(RosettaPath arg0, Processor arg1)`
- `PriceScheduleBuilder toBuilder()`
- `RosettaMetaData metaData()`

### Annotations

- **RuneDataType**
- **RosettaDataType**

