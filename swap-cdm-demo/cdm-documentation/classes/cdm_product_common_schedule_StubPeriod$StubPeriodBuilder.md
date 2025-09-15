# StubPeriodBuilder

**Full Name:** `cdm.product.common.schedule.StubPeriod$StubPeriodBuilder`

**Package:** `cdm.product.common.schedule`

## Type: Interface

### Implemented Interfaces

- `cdm.product.common.schedule.StubPeriod`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`

### Methods

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

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `StubPeriodBuilder prune()`

