# AsianBuilder

**Full Name:** `cdm.product.template.Asian$AsianBuilder`

**Package:** `cdm.product.template`

## Type: Interface

### Implemented Interfaces

- `cdm.product.template.Asian`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`

### Methods

#### Setter Methods

- `AsianBuilder setAveragingPeriodIn(AveragingPeriod arg0)`
- `AsianBuilder setAveragingInOut(AveragingInOutEnum arg0)`
- `AsianBuilder setAveragingPeriodOut(AveragingPeriod arg0)`
- `AsianBuilder setStrikeFactor(BigDecimal arg0)`

#### Getter Methods

- `AveragingPeriodBuilder getOrCreateAveragingPeriodIn()`
- `AveragingPeriodBuilder getOrCreateAveragingPeriodOut()`
- `AveragingPeriodBuilder getAveragingPeriodOut()`
- `AveragingPeriodBuilder getAveragingPeriodIn()`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `AsianBuilder prune()`

