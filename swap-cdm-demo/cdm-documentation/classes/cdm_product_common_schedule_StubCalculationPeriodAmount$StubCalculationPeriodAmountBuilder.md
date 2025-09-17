# StubCalculationPeriodAmountBuilder

**Full Name:** `cdm.product.common.schedule.StubCalculationPeriodAmount$StubCalculationPeriodAmountBuilder`

**Package:** `cdm.product.common.schedule`

## Type: Interface

### Implemented Interfaces

- `cdm.product.common.schedule.StubCalculationPeriodAmount`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`

### Methods

#### Setter Methods

- `StubCalculationPeriodAmountBuilder setInitialStub(StubValue arg0)`
- `StubCalculationPeriodAmountBuilder setFinalStub(StubValue arg0)`
- `StubCalculationPeriodAmountBuilder setCalculationPeriodDatesReference(ReferenceWithMetaCalculationPeriodDates arg0)`
- `StubCalculationPeriodAmountBuilder setCalculationPeriodDatesReferenceValue(CalculationPeriodDates arg0)`

#### Getter Methods

- `StubValueBuilder getInitialStub()`
- `StubValueBuilder getFinalStub()`
- `StubValueBuilder getOrCreateInitialStub()`
- `StubValueBuilder getOrCreateFinalStub()`
- `ReferenceWithMetaCalculationPeriodDatesBuilder getOrCreateCalculationPeriodDatesReference()`
- `ReferenceWithMetaCalculationPeriodDatesBuilder getCalculationPeriodDatesReference()`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `StubCalculationPeriodAmountBuilder prune()`

