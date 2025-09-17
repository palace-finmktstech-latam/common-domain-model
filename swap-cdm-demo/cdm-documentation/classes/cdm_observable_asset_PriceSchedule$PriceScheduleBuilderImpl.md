# PriceScheduleBuilderImpl

**Full Name:** `cdm.observable.asset.PriceSchedule$PriceScheduleBuilderImpl`

**Package:** `cdm.observable.asset`

## Type: Concrete Class

### Inheritance

**Extends:**
- `cdm.base.math.MeasureSchedule$MeasureScheduleBuilderImpl`

### Implemented Interfaces

- `cdm.observable.asset.PriceSchedule$PriceScheduleBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| perUnitOf | `UnitTypeBuilder` |  |
| priceType | `PriceTypeEnum` |  |
| priceExpression | `PriceExpressionEnum` |  |
| composite | `PriceCompositeBuilder` |  |
| arithmeticOperator | `ArithmeticOperationEnum` |  |
| cashPrice | `CashPriceBuilder` |  |

### Methods

#### Builder Methods

- `PriceSchedule build()`

#### Setter Methods

- `PriceScheduleBuilder setValue(BigDecimal arg0)`
- `PriceScheduleBuilder setPerUnitOf(UnitType arg0)`
- `PriceScheduleBuilder setPriceExpression(PriceExpressionEnum arg0)`
- `PriceScheduleBuilder setDatedValue(List arg0)`
- `PriceScheduleBuilder setArithmeticOperator(ArithmeticOperationEnum arg0)`
- `PriceScheduleBuilder setPriceType(PriceTypeEnum arg0)`
- `PriceScheduleBuilder setComposite(PriceComposite arg0)`
- `PriceScheduleBuilder setCashPrice(CashPrice arg0)`
- `PriceScheduleBuilder setUnit(UnitType arg0)`

#### Getter Methods

- `UnitTypeBuilder getPerUnitOf()`
- `PriceTypeEnum getPriceType()`
- `PriceExpressionEnum getPriceExpression()`
- `ArithmeticOperationEnum getArithmeticOperator()`
- `PriceCompositeBuilder getComposite()`
- `CashPriceBuilder getCashPrice()`
- `UnitTypeBuilder getOrCreatePerUnitOf()`
- `PriceCompositeBuilder getOrCreateComposite()`
- `CashPriceBuilder getOrCreateCashPrice()`

#### Adder Methods

- `PriceScheduleBuilder addDatedValue(List arg0)`
- `PriceScheduleBuilder addDatedValue(DatedValue arg0, int arg1)`
- `PriceScheduleBuilder addDatedValue(DatedValue arg0)`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `PriceScheduleBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `PriceScheduleBuilder prune()`
- `PriceScheduleBuilder toBuilder()`
- `boolean hasData()`

