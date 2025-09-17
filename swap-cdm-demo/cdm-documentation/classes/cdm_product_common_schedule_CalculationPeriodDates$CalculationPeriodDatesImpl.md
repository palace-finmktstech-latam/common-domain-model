# CalculationPeriodDatesImpl

**Full Name:** `cdm.product.common.schedule.CalculationPeriodDates$CalculationPeriodDatesImpl`

**Package:** `cdm.product.common.schedule`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.product.common.schedule.CalculationPeriodDates`

### Methods

#### Builder Methods

- `CalculationPeriodDates build()`

#### Setter Methods

- `void setBuilderFields(CalculationPeriodDatesBuilder arg0)`

#### Getter Methods

- `AdjustableOrRelativeDate getEffectiveDate()`
- `AdjustableOrRelativeDate getTerminationDate()`
- `MetaFields getMeta()`
- `StubPeriodTypeEnum getStubPeriodType()`
- `AdjustableOrRelativeDate getFirstPeriodStartDate()`
- `Date getFirstRegularPeriodStartDate()`
- `Date getFirstCompoundingPeriodEndDate()`
- `Date getLastRegularPeriodEndDate()`
- `BusinessDayAdjustments getCalculationPeriodDatesAdjustments()`
- `CalculationPeriodFrequency getCalculationPeriodFrequency()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `CalculationPeriodDatesBuilder toBuilder()`

