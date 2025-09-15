# MandatoryEarlyTerminationBuilder

**Full Name:** `cdm.product.template.MandatoryEarlyTermination$MandatoryEarlyTerminationBuilder`

**Package:** `cdm.product.template`

## Type: Interface

### Implemented Interfaces

- `cdm.product.template.MandatoryEarlyTermination`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`
- `com.rosetta.model.lib.GlobalKey$GlobalKeyBuilder`

### Methods

#### Setter Methods

- `MandatoryEarlyTerminationBuilder setCalculationAgent(CalculationAgent arg0)`
- `MandatoryEarlyTerminationBuilder setMandatoryEarlyTerminationAdjustedDates(MandatoryEarlyTerminationAdjustedDates arg0)`
- `MandatoryEarlyTerminationBuilder setMandatoryEarlyTerminationDate(AdjustableDate arg0)`
- `MandatoryEarlyTerminationBuilder setCashSettlement(SettlementTerms arg0)`
- `MandatoryEarlyTerminationBuilder setMeta(MetaFields arg0)`

#### Getter Methods

- `CalculationAgentBuilder getCalculationAgent()`
- `MetaFieldsBuilder getOrCreateMeta()`
- `AdjustableDateBuilder getMandatoryEarlyTerminationDate()`
- `MandatoryEarlyTerminationAdjustedDatesBuilder getMandatoryEarlyTerminationAdjustedDates()`
- `AdjustableDateBuilder getOrCreateMandatoryEarlyTerminationDate()`
- `SettlementTermsBuilder getCashSettlement()`
- `CalculationAgentBuilder getOrCreateCalculationAgent()`
- `SettlementTermsBuilder getOrCreateCashSettlement()`
- `MandatoryEarlyTerminationAdjustedDatesBuilder getOrCreateMandatoryEarlyTerminationAdjustedDates()`
- `MetaFieldsBuilder getMeta()`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `MandatoryEarlyTerminationBuilder prune()`

