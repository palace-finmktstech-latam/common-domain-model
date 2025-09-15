# OptionalEarlyTermination

**Full Name:** `cdm.product.template.OptionalEarlyTermination`

**Package:** `cdm.product.template`

## Type: Interface

### Implemented Interfaces

- `com.rosetta.model.lib.RosettaModelObject`

### Methods

#### Builder Methods

- `OptionalEarlyTermination build()`

#### Getter Methods

- `Class getType()`
- `CalculationAgent getCalculationAgent()`
- `BuyerSeller getSinglePartyOption()`
- `ExerciseTerms getExerciseTerms()`
- `Boolean getFollowUpConfirmation()`
- `List getExerciseNotice()`
- `OptionalEarlyTerminationAdjustedDates getOptionalEarlyTerminationAdjustedDates()`
- `SettlementTerms getCashSettlement()`
- `Boolean getMutualEarlyTermination()`

#### Other Methods

- `void process(RosettaPath arg0, Processor arg1)`
- `OptionalEarlyTerminationBuilder toBuilder()`
- `RosettaMetaData metaData()`

### Annotations

- **RuneDataType**
- **RosettaDataType**

