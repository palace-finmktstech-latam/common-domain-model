# StubPeriodBuilderImpl

**Full Name:** `cdm.product.common.schedule.StubPeriod$StubPeriodBuilderImpl`

**Package:** `cdm.product.common.schedule`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.product.common.schedule.StubPeriod$StubPeriodBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| calculationPeriodDatesReference | `ReferenceWithMetaCalculationPeriodDatesBuilder` |  |
| initialStub | `StubValueBuilder` |  |
| finalStub | `StubValueBuilder` |  |

### Methods

#### Builder Methods

- `StubPeriod build()`

#### Setter Methods

- `StubPeriodBuilder setFinalStub(StubValue arg0)`
- `StubPeriodBuilder setInitialStub(StubValue arg0)`
- `StubPeriodBuilder setCalculationPeriodDatesReference(ReferenceWithMetaCalculationPeriodDates arg0)`
- `StubPeriodBuilder setCalculationPeriodDatesReferenceValue(CalculationPeriodDates arg0)`

#### Getter Methods

- `StubValueBuilder getFinalStub()`
- `StubValueBuilder getInitialStub()`
- `StubValueBuilder getOrCreateInitialStub()`
- `StubValueBuilder getOrCreateFinalStub()`
- `ReferenceWithMetaCalculationPeriodDatesBuilder getCalculationPeriodDatesReference()`
- `ReferenceWithMetaCalculationPeriodDatesBuilder getOrCreateCalculationPeriodDatesReference()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `StubPeriodBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `boolean hasData()`
- `StubPeriodBuilder toBuilder()`
- `StubPeriodBuilder prune()`

