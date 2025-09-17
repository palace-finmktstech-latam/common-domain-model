# PartialExerciseBuilderImpl

**Full Name:** `cdm.product.template.PartialExercise$PartialExerciseBuilderImpl`

**Package:** `cdm.product.template`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.product.template.PartialExercise$PartialExerciseBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| notionaReference | `ReferenceWithMetaMoneyBuilder` |  |
| integralMultipleAmount | `BigDecimal` |  |
| minimumNotionalAmount | `BigDecimal` |  |
| minimumNumberOfOptions | `Integer` |  |

### Methods

#### Builder Methods

- `PartialExercise build()`

#### Setter Methods

- `PartialExerciseBuilder setMinimumNotionalAmount(BigDecimal arg0)`
- `PartialExerciseBuilder setNotionaReference(ReferenceWithMetaMoney arg0)`
- `PartialExerciseBuilder setNotionaReferenceValue(Money arg0)`
- `PartialExerciseBuilder setMinimumNumberOfOptions(Integer arg0)`
- `PartialExerciseBuilder setIntegralMultipleAmount(BigDecimal arg0)`

#### Getter Methods

- `ReferenceWithMetaMoneyBuilder getNotionaReference()`
- `BigDecimal getIntegralMultipleAmount()`
- `Integer getMinimumNumberOfOptions()`
- `BigDecimal getMinimumNotionalAmount()`
- `ReferenceWithMetaMoneyBuilder getOrCreateNotionaReference()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `PartialExerciseBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `PartialExerciseBuilder prune()`
- `PartialExerciseBuilder toBuilder()`
- `boolean hasData()`

