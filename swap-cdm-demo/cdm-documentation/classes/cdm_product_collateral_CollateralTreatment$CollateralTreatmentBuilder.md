# CollateralTreatmentBuilder

**Full Name:** `cdm.product.collateral.CollateralTreatment$CollateralTreatmentBuilder`

**Package:** `cdm.product.collateral`

## Type: Interface

### Implemented Interfaces

- `cdm.product.collateral.CollateralTreatment`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`

### Methods

#### Setter Methods

- `CollateralTreatmentBuilder setValuationTreatment(CollateralValuationTreatment arg0)`
- `CollateralTreatmentBuilder setIsIncluded(Boolean arg0)`
- `CollateralTreatmentBuilder setConcentrationLimit(List arg0)`

#### Getter Methods

- `CollateralValuationTreatmentBuilder getValuationTreatment()`
- `List getConcentrationLimit()`
- `CollateralValuationTreatmentBuilder getOrCreateValuationTreatment()`
- `ConcentrationLimitBuilder getOrCreateConcentrationLimit(int arg0)`

#### Adder Methods

- `CollateralTreatmentBuilder addConcentrationLimit(List arg0)`
- `CollateralTreatmentBuilder addConcentrationLimit(ConcentrationLimit arg0)`
- `CollateralTreatmentBuilder addConcentrationLimit(ConcentrationLimit arg0, int arg1)`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `CollateralTreatmentBuilder prune()`

