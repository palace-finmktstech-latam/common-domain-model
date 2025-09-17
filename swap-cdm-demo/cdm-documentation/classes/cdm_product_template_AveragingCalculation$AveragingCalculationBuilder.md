# AveragingCalculationBuilder

**Full Name:** `cdm.product.template.AveragingCalculation$AveragingCalculationBuilder`

**Package:** `cdm.product.template`

## Type: Interface

### Implemented Interfaces

- `cdm.product.template.AveragingCalculation`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`

### Methods

#### Setter Methods

- `AveragingCalculationBuilder setPrecision(Rounding arg0)`
- `AveragingCalculationBuilder setAveragingMethod(AveragingCalculationMethod arg0)`

#### Getter Methods

- `AveragingCalculationMethodBuilder getAveragingMethod()`
- `RoundingBuilder getPrecision()`
- `AveragingCalculationMethodBuilder getOrCreateAveragingMethod()`
- `RoundingBuilder getOrCreatePrecision()`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `AveragingCalculationBuilder prune()`

