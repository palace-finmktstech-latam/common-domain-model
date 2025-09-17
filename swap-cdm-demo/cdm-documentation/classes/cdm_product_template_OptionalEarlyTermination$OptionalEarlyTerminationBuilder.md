# OptionalEarlyTerminationBuilder

**Full Name:** `cdm.product.template.OptionalEarlyTermination$OptionalEarlyTerminationBuilder`

**Package:** `cdm.product.template`

## Type: Interface

### Implemented Interfaces

- `cdm.product.template.OptionalEarlyTermination`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`

### Methods

#### Setter Methods

- `OptionalEarlyTerminationBuilder setCalculationAgent(CalculationAgent arg0)`
- `OptionalEarlyTerminationBuilder setExerciseTerms(ExerciseTerms arg0)`
- `OptionalEarlyTerminationBuilder setExerciseNotice(List arg0)`
- `OptionalEarlyTerminationBuilder setFollowUpConfirmation(Boolean arg0)`
- `OptionalEarlyTerminationBuilder setCashSettlement(SettlementTerms arg0)`
- `OptionalEarlyTerminationBuilder setMutualEarlyTermination(Boolean arg0)`
- `OptionalEarlyTerminationBuilder setSinglePartyOption(BuyerSeller arg0)`
- `OptionalEarlyTerminationBuilder setOptionalEarlyTerminationAdjustedDates(OptionalEarlyTerminationAdjustedDates arg0)`

#### Getter Methods

- `OptionalEarlyTerminationAdjustedDatesBuilder getOrCreateOptionalEarlyTerminationAdjustedDates()`
- `CalculationAgentBuilder getCalculationAgent()`
- `ExerciseTermsBuilder getExerciseTerms()`
- `BuyerSellerBuilder getSinglePartyOption()`
- `List getExerciseNotice()`
- `ExerciseTermsBuilder getOrCreateExerciseTerms()`
- `SettlementTermsBuilder getCashSettlement()`
- `ExerciseNoticeBuilder getOrCreateExerciseNotice(int arg0)`
- `CalculationAgentBuilder getOrCreateCalculationAgent()`
- `SettlementTermsBuilder getOrCreateCashSettlement()`
- `OptionalEarlyTerminationAdjustedDatesBuilder getOptionalEarlyTerminationAdjustedDates()`
- `BuyerSellerBuilder getOrCreateSinglePartyOption()`

#### Adder Methods

- `OptionalEarlyTerminationBuilder addExerciseNotice(ExerciseNotice arg0, int arg1)`
- `OptionalEarlyTerminationBuilder addExerciseNotice(List arg0)`
- `OptionalEarlyTerminationBuilder addExerciseNotice(ExerciseNotice arg0)`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `OptionalEarlyTerminationBuilder prune()`

