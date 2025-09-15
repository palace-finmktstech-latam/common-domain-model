# EarlyTerminationProvisionBuilder

**Full Name:** `cdm.product.template.EarlyTerminationProvision$EarlyTerminationProvisionBuilder`

**Package:** `cdm.product.template`

## Type: Interface

### Implemented Interfaces

- `cdm.product.template.EarlyTerminationProvision`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`
- `com.rosetta.model.lib.GlobalKey$GlobalKeyBuilder`

### Methods

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

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `EarlyTerminationProvisionBuilder prune()`

