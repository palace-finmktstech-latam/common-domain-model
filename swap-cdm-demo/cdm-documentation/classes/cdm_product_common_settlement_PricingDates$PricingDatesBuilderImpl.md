# PricingDatesBuilderImpl

**Full Name:** `cdm.product.common.settlement.PricingDates$PricingDatesBuilderImpl`

**Package:** `cdm.product.common.settlement`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.product.common.settlement.PricingDates$PricingDatesBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| specifiedDates | `java.util.List<cdm.base.datetime.AdjustableDates$AdjustableDatesBuilder>` |  |
| parametricDates | `ParametricDatesBuilder` |  |

### Methods

#### Builder Methods

- `PricingDates build()`

#### Setter Methods

- `PricingDatesBuilder setParametricDates(ParametricDates arg0)`
- `PricingDatesBuilder setSpecifiedDates(List arg0)`

#### Getter Methods

- `ParametricDatesBuilder getParametricDates()`
- `ParametricDatesBuilder getOrCreateParametricDates()`
- `AdjustableDatesBuilder getOrCreateSpecifiedDates(int arg0)`
- `List getSpecifiedDates()`

#### Adder Methods

- `PricingDatesBuilder addSpecifiedDates(AdjustableDates arg0, int arg1)`
- `PricingDatesBuilder addSpecifiedDates(AdjustableDates arg0)`
- `PricingDatesBuilder addSpecifiedDates(List arg0)`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `PricingDatesBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `PricingDatesBuilder prune()`
- `PricingDatesBuilder toBuilder()`
- `boolean hasData()`

