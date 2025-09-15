# ReferenceWithMetaPriceScheduleBuilderImpl

**Full Name:** `cdm.observable.asset.metafields.ReferenceWithMetaPriceSchedule$ReferenceWithMetaPriceScheduleBuilderImpl`

**Package:** `cdm.observable.asset.metafields`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.observable.asset.metafields.ReferenceWithMetaPriceSchedule$ReferenceWithMetaPriceScheduleBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| value | `PriceScheduleBuilder` |  |
| globalReference | `String` |  |
| externalReference | `String` |  |
| reference | `ReferenceBuilder` |  |

### Methods

#### Builder Methods

- `ReferenceWithMetaPriceSchedule build()`

#### Setter Methods

- `ReferenceWithMetaPriceScheduleBuilder setValue(PriceSchedule arg0)`
- `ReferenceWithMetaPriceScheduleBuilder setExternalReference(String arg0)`
- `ReferenceWithMetaPriceScheduleBuilder setGlobalReference(String arg0)`
- `ReferenceWithMetaPriceScheduleBuilder setReference(Reference arg0)`

#### Getter Methods

- `ReferenceBuilder getReference()`
- `PriceScheduleBuilder getValue()`
- `PriceScheduleBuilder getOrCreateValue()`
- `ReferenceBuilder getOrCreateReference()`
- `String getExternalReference()`
- `String getGlobalReference()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `ReferenceWithMetaPriceScheduleBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `boolean hasData()`
- `ReferenceWithMetaPriceScheduleBuilder toBuilder()`
- `ReferenceWithMetaPriceScheduleBuilder prune()`

