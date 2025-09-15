# PriceBuilder

**Full Name:** `cdm.observable.asset.Price$PriceBuilder`

**Package:** `cdm.observable.asset`

## Type: Interface

### Implemented Interfaces

- `cdm.observable.asset.Price`
- `cdm.observable.asset.PriceSchedule$PriceScheduleBuilder`

### Methods

#### Setter Methods

- `PriceBuilder setValue(BigDecimal arg0)`
- `PriceBuilder setPerUnitOf(UnitType arg0)`
- `PriceBuilder setPriceType(PriceTypeEnum arg0)`
- `PriceBuilder setCashPrice(CashPrice arg0)`
- `PriceBuilder setDatedValue(List arg0)`
- `PriceBuilder setComposite(PriceComposite arg0)`
- `PriceBuilder setArithmeticOperator(ArithmeticOperationEnum arg0)`
- `PriceBuilder setPriceExpression(PriceExpressionEnum arg0)`
- `PriceBuilder setUnit(UnitType arg0)`

#### Adder Methods

- `PriceBuilder addDatedValue(DatedValue arg0)`
- `PriceBuilder addDatedValue(DatedValue arg0, int arg1)`
- `PriceBuilder addDatedValue(List arg0)`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `PriceBuilder prune()`

