# MultipleExerciseBuilderImpl

**Full Name:** `cdm.product.template.MultipleExercise$MultipleExerciseBuilderImpl`

**Package:** `cdm.product.template`

## Type: Concrete Class

### Inheritance

**Extends:**
- `cdm.product.template.PartialExercise$PartialExerciseBuilderImpl`

### Implemented Interfaces

- `cdm.product.template.MultipleExercise$MultipleExerciseBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| maximumNotionalAmount | `BigDecimal` |  |
| maximumNumberOfOptions | `Integer` |  |

### Methods

#### Builder Methods

- `MultipleExercise build()`

#### Setter Methods

- `MultipleExerciseBuilder setMinimumNotionalAmount(BigDecimal arg0)`
- `MultipleExerciseBuilder setNotionaReference(ReferenceWithMetaMoney arg0)`
- `MultipleExerciseBuilder setNotionaReferenceValue(Money arg0)`
- `MultipleExerciseBuilder setMinimumNumberOfOptions(Integer arg0)`
- `MultipleExerciseBuilder setIntegralMultipleAmount(BigDecimal arg0)`
- `MultipleExerciseBuilder setMaximumNotionalAmount(BigDecimal arg0)`
- `MultipleExerciseBuilder setMaximumNumberOfOptions(Integer arg0)`

#### Getter Methods

- `BigDecimal getMaximumNotionalAmount()`
- `Integer getMaximumNumberOfOptions()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `MultipleExerciseBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `MultipleExerciseBuilder prune()`
- `MultipleExerciseBuilder toBuilder()`
- `boolean hasData()`

