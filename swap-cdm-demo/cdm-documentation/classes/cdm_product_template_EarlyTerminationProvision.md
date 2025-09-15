# EarlyTerminationProvision

**Full Name:** `cdm.product.template.EarlyTerminationProvision`

**Package:** `cdm.product.template`

## Type: Interface

### Implemented Interfaces

- `com.rosetta.model.lib.RosettaModelObject`
- `com.rosetta.model.lib.GlobalKey`

### Methods

#### Builder Methods

- `EarlyTerminationProvision build()`

#### Getter Methods

- `Class getType()`
- `Period getMandatoryEarlyTerminationDateTenor()`
- `MandatoryEarlyTermination getMandatoryEarlyTermination()`
- `OptionalEarlyTermination getOptionalEarlyTermination()`
- `ExercisePeriod getOptionalEarlyTerminationParameters()`
- `MetaFields getMeta()`

#### Other Methods

- `void process(RosettaPath arg0, Processor arg1)`
- `EarlyTerminationProvisionBuilder toBuilder()`
- `RosettaMetaData metaData()`

### Annotations

- **RuneDataType**
- **RosettaDataType**

