# StrikeSpreadBuilderImpl

**Full Name:** `cdm.product.template.StrikeSpread$StrikeSpreadBuilderImpl`

**Package:** `cdm.product.template`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.product.template.StrikeSpread$StrikeSpreadBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| upperStrike | `OptionStrikeBuilder` |  |
| upperStrikeNumberOfOptions | `BigDecimal` |  |

### Methods

#### Builder Methods

- `StrikeSpread build()`

#### Setter Methods

- `StrikeSpreadBuilder setUpperStrikeNumberOfOptions(BigDecimal arg0)`
- `StrikeSpreadBuilder setUpperStrike(OptionStrike arg0)`

#### Getter Methods

- `BigDecimal getUpperStrikeNumberOfOptions()`
- `OptionStrikeBuilder getUpperStrike()`
- `OptionStrikeBuilder getOrCreateUpperStrike()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `StrikeSpreadBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `boolean hasData()`
- `StrikeSpreadBuilder toBuilder()`
- `StrikeSpreadBuilder prune()`

