# PartialExerciseBuilder

**Full Name:** `cdm.product.template.PartialExercise$PartialExerciseBuilder`

**Package:** `cdm.product.template`

## Type: Interface

### Implemented Interfaces

- `cdm.product.template.PartialExercise`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`

### Methods

#### Setter Methods

- `PartialExerciseBuilder setMinimumNumberOfOptions(Integer arg0)`
- `PartialExerciseBuilder setIntegralMultipleAmount(BigDecimal arg0)`
- `PartialExerciseBuilder setMinimumNotionalAmount(BigDecimal arg0)`
- `PartialExerciseBuilder setNotionaReference(ReferenceWithMetaMoney arg0)`
- `PartialExerciseBuilder setNotionaReferenceValue(Money arg0)`

#### Getter Methods

- `ReferenceWithMetaMoneyBuilder getOrCreateNotionaReference()`
- `ReferenceWithMetaMoneyBuilder getNotionaReference()`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `PartialExerciseBuilder prune()`

