# AsianBuilderImpl

**Full Name:** `cdm.product.template.Asian$AsianBuilderImpl`

**Package:** `cdm.product.template`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.product.template.Asian$AsianBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| averagingInOut | `AveragingInOutEnum` |  |
| strikeFactor | `BigDecimal` |  |
| averagingPeriodIn | `AveragingPeriodBuilder` |  |
| averagingPeriodOut | `AveragingPeriodBuilder` |  |

### Methods

#### Builder Methods

- `Asian build()`

#### Setter Methods

- `AsianBuilder setAveragingPeriodIn(AveragingPeriod arg0)`
- `AsianBuilder setAveragingInOut(AveragingInOutEnum arg0)`
- `AsianBuilder setAveragingPeriodOut(AveragingPeriod arg0)`
- `AsianBuilder setStrikeFactor(BigDecimal arg0)`

#### Getter Methods

- `AveragingPeriodBuilder getOrCreateAveragingPeriodIn()`
- `AveragingPeriodBuilder getOrCreateAveragingPeriodOut()`
- `BigDecimal getStrikeFactor()`
- `AveragingPeriodBuilder getAveragingPeriodOut()`
- `AveragingInOutEnum getAveragingInOut()`
- `AveragingPeriodBuilder getAveragingPeriodIn()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `AsianBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `boolean hasData()`
- `AsianBuilder toBuilder()`
- `AsianBuilder prune()`

