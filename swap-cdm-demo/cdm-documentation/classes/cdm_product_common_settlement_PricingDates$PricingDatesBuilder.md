# PricingDatesBuilder

**Full Name:** `cdm.product.common.settlement.PricingDates$PricingDatesBuilder`

**Package:** `cdm.product.common.settlement`

## Type: Interface

### Implemented Interfaces

- `cdm.product.common.settlement.PricingDates`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`

### Methods

#### Setter Methods

- `PricingDatesBuilder setSpecifiedDates(List arg0)`
- `PricingDatesBuilder setParametricDates(ParametricDates arg0)`

#### Getter Methods

- `List getSpecifiedDates()`
- `AdjustableDatesBuilder getOrCreateSpecifiedDates(int arg0)`
- `ParametricDatesBuilder getOrCreateParametricDates()`
- `ParametricDatesBuilder getParametricDates()`

#### Adder Methods

- `PricingDatesBuilder addSpecifiedDates(List arg0)`
- `PricingDatesBuilder addSpecifiedDates(AdjustableDates arg0, int arg1)`
- `PricingDatesBuilder addSpecifiedDates(AdjustableDates arg0)`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `PricingDatesBuilder prune()`

