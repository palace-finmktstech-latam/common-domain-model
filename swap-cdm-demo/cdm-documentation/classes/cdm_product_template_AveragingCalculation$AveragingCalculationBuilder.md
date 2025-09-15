# AveragingCalculationBuilder

**Full Name:** `cdm.product.template.AveragingCalculation$AveragingCalculationBuilder`

**Package:** `cdm.product.template`

## Type: Interface

### Implemented Interfaces

- `cdm.product.template.AveragingCalculation`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`

### Methods

#### Setter Methods

- `AveragingCalculationBuilder setAveragingMethod(AveragingCalculationMethod arg0)`
- `AveragingCalculationBuilder setPrecision(Rounding arg0)`

#### Getter Methods

- `AveragingCalculationMethodBuilder getOrCreateAveragingMethod()`
- `RoundingBuilder getOrCreatePrecision()`
- `AveragingCalculationMethodBuilder getAveragingMethod()`
- `RoundingBuilder getPrecision()`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `AveragingCalculationBuilder prune()`

