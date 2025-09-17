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

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `EarlyTerminationProvisionBuilder prune()`

