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

- `EarlyTerminationProvisionBuilder setMandatoryEarlyTermination(MandatoryEarlyTermination arg0)`
- `EarlyTerminationProvisionBuilder setOptionalEarlyTermination(OptionalEarlyTermination arg0)`
- `EarlyTerminationProvisionBuilder setMandatoryEarlyTerminationDateTenor(Period arg0)`
- `EarlyTerminationProvisionBuilder setOptionalEarlyTerminationParameters(ExercisePeriod arg0)`
- `EarlyTerminationProvisionBuilder setMeta(MetaFields arg0)`

#### Getter Methods

- `MetaFieldsBuilder getOrCreateMeta()`
- `OptionalEarlyTerminationBuilder getOrCreateOptionalEarlyTermination()`
- `MandatoryEarlyTerminationBuilder getOrCreateMandatoryEarlyTermination()`
- `MetaFieldsBuilder getMeta()`
- `PeriodBuilder getOrCreateMandatoryEarlyTerminationDateTenor()`
- `ExercisePeriodBuilder getOrCreateOptionalEarlyTerminationParameters()`
- `PeriodBuilder getMandatoryEarlyTerminationDateTenor()`
- `ExercisePeriodBuilder getOptionalEarlyTerminationParameters()`
- `MandatoryEarlyTerminationBuilder getMandatoryEarlyTermination()`
- `OptionalEarlyTerminationBuilder getOptionalEarlyTermination()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `EarlyTerminationProvisionBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `EarlyTerminationProvisionBuilder prune()`
- `EarlyTerminationProvisionBuilder toBuilder()`
- `boolean hasData()`

