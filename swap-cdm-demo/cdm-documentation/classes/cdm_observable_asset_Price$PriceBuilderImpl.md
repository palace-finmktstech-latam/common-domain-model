# PriceBuilderImpl

**Full Name:** `cdm.observable.asset.Price$PriceBuilderImpl`

**Package:** `cdm.observable.asset`

## Type: Concrete Class

### Inheritance

**Extends:**
- `cdm.observable.asset.PriceSchedule$PriceScheduleBuilderImpl`

### Implemented Interfaces

- `cdm.observable.asset.Price$PriceBuilder`

### Methods

#### Builder Methods

- `Price build()`

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

- `PriceBuilder addDatedValue(List arg0)`
- `PriceBuilder addDatedValue(DatedValue arg0)`
- `PriceBuilder addDatedValue(DatedValue arg0, int arg1)`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `PriceBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `boolean hasData()`
- `PriceBuilder toBuilder()`
- `PriceBuilder prune()`

