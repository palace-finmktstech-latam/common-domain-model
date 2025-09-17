# StockSplitInstructionBuilderImpl

**Full Name:** `cdm.event.common.StockSplitInstruction$StockSplitInstructionBuilderImpl`

**Package:** `cdm.event.common`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.event.common.StockSplitInstruction$StockSplitInstructionBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| adjustmentRatio | `BigDecimal` |  |
| effectiveDate | `Date` |  |

### Methods

#### Builder Methods

- `StockSplitInstruction build()`

#### Setter Methods

- `StockSplitInstructionBuilder setAdjustmentRatio(BigDecimal arg0)`
- `StockSplitInstructionBuilder setEffectiveDate(Date arg0)`

#### Getter Methods

- `Date getEffectiveDate()`
- `BigDecimal getAdjustmentRatio()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `StockSplitInstructionBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `StockSplitInstructionBuilder prune()`
- `StockSplitInstructionBuilder toBuilder()`
- `boolean hasData()`

