# PriceScheduleBuilder

**Full Name:** `cdm.observable.asset.PriceSchedule$PriceScheduleBuilder`

**Package:** `cdm.observable.asset`

## Type: Interface

### Implemented Interfaces

- `cdm.observable.asset.PriceSchedule`
- `cdm.base.math.MeasureSchedule$MeasureScheduleBuilder`

### Methods

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

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `PriceScheduleBuilder prune()`

