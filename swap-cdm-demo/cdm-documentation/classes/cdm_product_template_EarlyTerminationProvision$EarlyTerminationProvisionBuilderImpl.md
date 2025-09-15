# EarlyTerminationProvisionBuilderImpl

**Full Name:** `cdm.product.template.EarlyTerminationProvision$EarlyTerminationProvisionBuilderImpl`

**Package:** `cdm.product.template`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.product.template.EarlyTerminationProvision$EarlyTerminationProvisionBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| mandatoryEarlyTermination | `MandatoryEarlyTerminationBuilder` |  |
| mandatoryEarlyTerminationDateTenor | `PeriodBuilder` |  |
| optionalEarlyTermination | `OptionalEarlyTerminationBuilder` |  |
| optionalEarlyTerminationParameters | `ExercisePeriodBuilder` |  |
| meta | `MetaFieldsBuilder` |  |

### Methods

#### Builder Methods

- `EarlyTerminationProvision build()`

#### Setter Methods

- `EarlyTerminationProvisionBuilder setOptionalEarlyTermination(OptionalEarlyTermination arg0)`
- `EarlyTerminationProvisionBuilder setMandatoryEarlyTermination(MandatoryEarlyTermination arg0)`
- `EarlyTerminationProvisionBuilder setMandatoryEarlyTerminationDateTenor(Period arg0)`
- `EarlyTerminationProvisionBuilder setOptionalEarlyTerminationParameters(ExercisePeriod arg0)`
- `EarlyTerminationProvisionBuilder setMeta(MetaFields arg0)`

#### Getter Methods

- `ExercisePeriodBuilder getOrCreateOptionalEarlyTerminationParameters()`
- `PeriodBuilder getOrCreateMandatoryEarlyTerminationDateTenor()`
- `MetaFieldsBuilder getOrCreateMeta()`
- `MandatoryEarlyTerminationBuilder getOrCreateMandatoryEarlyTermination()`
- `OptionalEarlyTerminationBuilder getOrCreateOptionalEarlyTermination()`
- `PeriodBuilder getMandatoryEarlyTerminationDateTenor()`
- `MandatoryEarlyTerminationBuilder getMandatoryEarlyTermination()`
- `OptionalEarlyTerminationBuilder getOptionalEarlyTermination()`
- `ExercisePeriodBuilder getOptionalEarlyTerminationParameters()`
- `MetaFieldsBuilder getMeta()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `EarlyTerminationProvisionBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `boolean hasData()`
- `EarlyTerminationProvisionBuilder toBuilder()`
- `EarlyTerminationProvisionBuilder prune()`

