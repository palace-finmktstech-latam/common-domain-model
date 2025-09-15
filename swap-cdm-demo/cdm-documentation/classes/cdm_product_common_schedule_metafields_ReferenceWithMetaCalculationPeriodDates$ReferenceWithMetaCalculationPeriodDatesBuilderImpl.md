# ReferenceWithMetaCalculationPeriodDatesBuilderImpl

**Full Name:** `cdm.product.common.schedule.metafields.ReferenceWithMetaCalculationPeriodDates$ReferenceWithMetaCalculationPeriodDatesBuilderImpl`

**Package:** `cdm.product.common.schedule.metafields`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.product.common.schedule.metafields.ReferenceWithMetaCalculationPeriodDates$ReferenceWithMetaCalculationPeriodDatesBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| value | `CalculationPeriodDatesBuilder` |  |
| globalReference | `String` |  |
| externalReference | `String` |  |
| reference | `ReferenceBuilder` |  |

### Methods

#### Builder Methods

- `ReferenceWithMetaCalculationPeriodDates build()`

#### Setter Methods

- `ReferenceWithMetaCalculationPeriodDatesBuilder setValue(CalculationPeriodDates arg0)`
- `ReferenceWithMetaCalculationPeriodDatesBuilder setExternalReference(String arg0)`
- `ReferenceWithMetaCalculationPeriodDatesBuilder setGlobalReference(String arg0)`
- `ReferenceWithMetaCalculationPeriodDatesBuilder setReference(Reference arg0)`

#### Getter Methods

- `ReferenceBuilder getReference()`
- `CalculationPeriodDatesBuilder getValue()`
- `CalculationPeriodDatesBuilder getOrCreateValue()`
- `ReferenceBuilder getOrCreateReference()`
- `String getExternalReference()`
- `String getGlobalReference()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `ReferenceWithMetaCalculationPeriodDatesBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `boolean hasData()`
- `ReferenceWithMetaCalculationPeriodDatesBuilder toBuilder()`
- `ReferenceWithMetaCalculationPeriodDatesBuilder prune()`

