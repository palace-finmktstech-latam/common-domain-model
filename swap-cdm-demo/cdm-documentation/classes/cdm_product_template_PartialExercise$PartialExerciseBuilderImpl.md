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

- `PartialExerciseBuilder setMinimumNumberOfOptions(Integer arg0)`
- `PartialExerciseBuilder setIntegralMultipleAmount(BigDecimal arg0)`
- `PartialExerciseBuilder setMinimumNotionalAmount(BigDecimal arg0)`
- `PartialExerciseBuilder setNotionaReference(ReferenceWithMetaMoney arg0)`
- `PartialExerciseBuilder setNotionaReferenceValue(Money arg0)`

#### Getter Methods

- `ReferenceWithMetaMoneyBuilder getOrCreateNotionaReference()`
- `ReferenceWithMetaMoneyBuilder getNotionaReference()`
- `BigDecimal getIntegralMultipleAmount()`
- `BigDecimal getMinimumNotionalAmount()`
- `Integer getMinimumNumberOfOptions()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `PartialExerciseBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `boolean hasData()`
- `PartialExerciseBuilder toBuilder()`
- `PartialExerciseBuilder prune()`

