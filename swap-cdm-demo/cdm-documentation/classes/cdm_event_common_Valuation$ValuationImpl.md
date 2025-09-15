# ValuationImpl

**Full Name:** `cdm.event.common.Valuation$ValuationImpl`

**Package:** `cdm.event.common`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.event.common.Valuation`

### Methods

#### Builder Methods

- `Valuation build()`

#### Setter Methods

- `void setBuilderFields(ValuationBuilder arg0)`

#### Getter Methods

- `ValuationTypeEnum getMethod()`
- `ZonedDateTime getTimestamp()`
- `ValuationSourceEnum getSource()`
- `Price getPriceComponent()`
- `PriceTimingEnum getValuationTiming()`
- `BigDecimal getDelta()`
- `Money getAmount()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `ValuationBuilder toBuilder()`

