# PriceCompositeBuilderImpl

**Full Name:** `cdm.observable.asset.PriceComposite$PriceCompositeBuilderImpl`

**Package:** `cdm.observable.asset`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.observable.asset.PriceComposite$PriceCompositeBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| baseValue | `BigDecimal` |  |
| operand | `BigDecimal` |  |
| arithmeticOperator | `ArithmeticOperationEnum` |  |
| operandType | `PriceOperandEnum` |  |

### Methods

#### Builder Methods

- `PriceComposite build()`

#### Setter Methods

- `PriceCompositeBuilder setOperandType(PriceOperandEnum arg0)`
- `PriceCompositeBuilder setBaseValue(BigDecimal arg0)`
- `PriceCompositeBuilder setOperand(BigDecimal arg0)`
- `PriceCompositeBuilder setArithmeticOperator(ArithmeticOperationEnum arg0)`

#### Getter Methods

- `BigDecimal getBaseValue()`
- `PriceOperandEnum getOperandType()`
- `ArithmeticOperationEnum getArithmeticOperator()`
- `BigDecimal getOperand()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `PriceCompositeBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `boolean hasData()`
- `PriceCompositeBuilder toBuilder()`
- `PriceCompositeBuilder prune()`

