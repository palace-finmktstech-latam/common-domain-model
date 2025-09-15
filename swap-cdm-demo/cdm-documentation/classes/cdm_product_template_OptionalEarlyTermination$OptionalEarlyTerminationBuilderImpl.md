# OptionalEarlyTerminationBuilderImpl

**Full Name:** `cdm.product.template.OptionalEarlyTermination$OptionalEarlyTerminationBuilderImpl`

**Package:** `cdm.product.template`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.product.template.OptionalEarlyTermination$OptionalEarlyTerminationBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| singlePartyOption | `BuyerSellerBuilder` |  |
| mutualEarlyTermination | `Boolean` |  |
| exerciseNotice | `java.util.List<cdm.product.template.ExerciseNotice$ExerciseNoticeBuilder>` |  |
| followUpConfirmation | `Boolean` |  |
| calculationAgent | `CalculationAgentBuilder` |  |
| cashSettlement | `SettlementTermsBuilder` |  |
| optionalEarlyTerminationAdjustedDates | `OptionalEarlyTerminationAdjustedDatesBuilder` |  |
| exerciseTerms | `ExerciseTermsBuilder` |  |

### Methods

#### Builder Methods

- `OptionalEarlyTermination build()`

#### Setter Methods

- `OptionalEarlyTerminationBuilder setCalculationAgent(CalculationAgent arg0)`
- `OptionalEarlyTerminationBuilder setExerciseTerms(ExerciseTerms arg0)`
- `OptionalEarlyTerminationBuilder setOptionalEarlyTerminationAdjustedDates(OptionalEarlyTerminationAdjustedDates arg0)`
- `OptionalEarlyTerminationBuilder setFollowUpConfirmation(Boolean arg0)`
- `OptionalEarlyTerminationBuilder setExerciseNotice(List arg0)`
- `OptionalEarlyTerminationBuilder setCashSettlement(SettlementTerms arg0)`
- `OptionalEarlyTerminationBuilder setMutualEarlyTermination(Boolean arg0)`
- `OptionalEarlyTerminationBuilder setSinglePartyOption(BuyerSeller arg0)`

#### Getter Methods

- `CalculationAgentBuilder getCalculationAgent()`
- `ExerciseTermsBuilder getOrCreateExerciseTerms()`
- `BuyerSellerBuilder getSinglePartyOption()`
- `ExerciseTermsBuilder getExerciseTerms()`
- `Boolean getFollowUpConfirmation()`
- `List getExerciseNotice()`
- `OptionalEarlyTerminationAdjustedDatesBuilder getOptionalEarlyTerminationAdjustedDates()`
- `BuyerSellerBuilder getOrCreateSinglePartyOption()`
- `SettlementTermsBuilder getCashSettlement()`
- `Boolean getMutualEarlyTermination()`
- `ExerciseNoticeBuilder getOrCreateExerciseNotice(int arg0)`
- `CalculationAgentBuilder getOrCreateCalculationAgent()`
- `SettlementTermsBuilder getOrCreateCashSettlement()`
- `OptionalEarlyTerminationAdjustedDatesBuilder getOrCreateOptionalEarlyTerminationAdjustedDates()`

#### Adder Methods

- `OptionalEarlyTerminationBuilder addExerciseNotice(ExerciseNotice arg0, int arg1)`
- `OptionalEarlyTerminationBuilder addExerciseNotice(ExerciseNotice arg0)`
- `OptionalEarlyTerminationBuilder addExerciseNotice(List arg0)`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `OptionalEarlyTerminationBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `boolean hasData()`
- `OptionalEarlyTerminationBuilder toBuilder()`
- `OptionalEarlyTerminationBuilder prune()`

