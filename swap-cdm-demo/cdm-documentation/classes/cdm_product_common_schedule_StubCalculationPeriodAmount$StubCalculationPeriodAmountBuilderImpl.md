# StubCalculationPeriodAmountBuilderImpl

**Full Name:** `cdm.product.common.schedule.StubCalculationPeriodAmount$StubCalculationPeriodAmountBuilderImpl`

**Package:** `cdm.product.common.schedule`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.product.common.schedule.StubCalculationPeriodAmount$StubCalculationPeriodAmountBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| calculationPeriodDatesReference | `ReferenceWithMetaCalculationPeriodDatesBuilder` |  |
| initialStub | `StubValueBuilder` |  |
| finalStub | `StubValueBuilder` |  |

### Methods

#### Builder Methods

- `StubCalculationPeriodAmount build()`

#### Setter Methods

- `StubCalculationPeriodAmountBuilder setFinalStub(StubValue arg0)`
- `StubCalculationPeriodAmountBuilder setInitialStub(StubValue arg0)`
- `StubCalculationPeriodAmountBuilder setCalculationPeriodDatesReference(ReferenceWithMetaCalculationPeriodDates arg0)`
- `StubCalculationPeriodAmountBuilder setCalculationPeriodDatesReferenceValue(CalculationPeriodDates arg0)`

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
- `StubCalculationPeriodAmountBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `boolean hasData()`
- `StubCalculationPeriodAmountBuilder toBuilder()`
- `StubCalculationPeriodAmountBuilder prune()`

