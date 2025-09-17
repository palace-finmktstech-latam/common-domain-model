# AsianBuilder

**Full Name:** `cdm.product.template.Asian$AsianBuilder`

**Package:** `cdm.product.template`

## Type: Interface

### Implemented Interfaces

- `cdm.product.template.Asian`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`

### Methods

#### Setter Methods

- `AsianBuilder setAveragingInOut(AveragingInOutEnum arg0)`
- `AsianBuilder setAveragingPeriodIn(AveragingPeriod arg0)`
- `AsianBuilder setStrikeFactor(BigDecimal arg0)`
- `AsianBuilder setAveragingPeriodOut(AveragingPeriod arg0)`

#### Getter Methods

- `AveragingPeriodBuilder getAveragingPeriodOut()`
- `AveragingPeriodBuilder getAveragingPeriodIn()`
- `AveragingPeriodBuilder getOrCreateAveragingPeriodIn()`
- `AveragingPeriodBuilder getOrCreateAveragingPeriodOut()`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `AsianBuilder prune()`

