# MandatoryEarlyTerminationBuilderImpl

**Full Name:** `cdm.product.template.MandatoryEarlyTermination$MandatoryEarlyTerminationBuilderImpl`

**Package:** `cdm.product.template`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.product.template.MandatoryEarlyTermination$MandatoryEarlyTerminationBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| mandatoryEarlyTerminationDate | `AdjustableDateBuilder` |  |
| calculationAgent | `CalculationAgentBuilder` |  |
| cashSettlement | `SettlementTermsBuilder` |  |
| mandatoryEarlyTerminationAdjustedDates | `MandatoryEarlyTerminationAdjustedDatesBuilder` |  |
| meta | `MetaFieldsBuilder` |  |

### Methods

#### Builder Methods

- `MandatoryEarlyTermination build()`

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

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `MandatoryEarlyTerminationBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `MandatoryEarlyTerminationBuilder prune()`
- `MandatoryEarlyTerminationBuilder toBuilder()`
- `boolean hasData()`

