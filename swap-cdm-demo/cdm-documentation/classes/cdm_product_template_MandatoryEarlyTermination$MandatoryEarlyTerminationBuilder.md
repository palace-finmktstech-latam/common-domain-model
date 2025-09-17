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

- `MandatoryEarlyTerminationBuilder setMandatoryEarlyTerminationAdjustedDates(MandatoryEarlyTerminationAdjustedDates arg0)`
- `MandatoryEarlyTerminationBuilder setMandatoryEarlyTerminationDate(AdjustableDate arg0)`
- `MandatoryEarlyTerminationBuilder setMeta(MetaFields arg0)`
- `MandatoryEarlyTerminationBuilder setCalculationAgent(CalculationAgent arg0)`
- `MandatoryEarlyTerminationBuilder setCashSettlement(SettlementTerms arg0)`

#### Getter Methods

- `MetaFieldsBuilder getOrCreateMeta()`
- `MandatoryEarlyTerminationAdjustedDatesBuilder getMandatoryEarlyTerminationAdjustedDates()`
- `AdjustableDateBuilder getOrCreateMandatoryEarlyTerminationDate()`
- `AdjustableDateBuilder getMandatoryEarlyTerminationDate()`
- `MetaFieldsBuilder getMeta()`
- `MandatoryEarlyTerminationAdjustedDatesBuilder getOrCreateMandatoryEarlyTerminationAdjustedDates()`
- `CalculationAgentBuilder getCalculationAgent()`
- `SettlementTermsBuilder getCashSettlement()`
- `CalculationAgentBuilder getOrCreateCalculationAgent()`
- `SettlementTermsBuilder getOrCreateCashSettlement()`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `MandatoryEarlyTerminationBuilder prune()`

