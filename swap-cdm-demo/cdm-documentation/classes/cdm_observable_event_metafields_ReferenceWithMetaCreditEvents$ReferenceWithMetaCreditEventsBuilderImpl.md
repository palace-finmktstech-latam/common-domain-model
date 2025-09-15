# ReferenceWithMetaCreditEventsBuilderImpl

**Full Name:** `cdm.observable.event.metafields.ReferenceWithMetaCreditEvents$ReferenceWithMetaCreditEventsBuilderImpl`

**Package:** `cdm.observable.event.metafields`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.observable.event.metafields.ReferenceWithMetaCreditEvents$ReferenceWithMetaCreditEventsBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| value | `CreditEventsBuilder` |  |
| globalReference | `String` |  |
| externalReference | `String` |  |
| reference | `ReferenceBuilder` |  |

### Methods

#### Builder Methods

- `ReferenceWithMetaCreditEvents build()`

#### Setter Methods

- `ReferenceWithMetaCreditEventsBuilder setValue(CreditEvents arg0)`
- `ReferenceWithMetaCreditEventsBuilder setExternalReference(String arg0)`
- `ReferenceWithMetaCreditEventsBuilder setGlobalReference(String arg0)`
- `ReferenceWithMetaCreditEventsBuilder setReference(Reference arg0)`

#### Getter Methods

- `ReferenceBuilder getReference()`
- `CreditEventsBuilder getValue()`
- `CreditEventsBuilder getOrCreateValue()`
- `ReferenceBuilder getOrCreateReference()`
- `String getExternalReference()`
- `String getGlobalReference()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `ReferenceWithMetaCreditEventsBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `boolean hasData()`
- `ReferenceWithMetaCreditEventsBuilder toBuilder()`
- `ReferenceWithMetaCreditEventsBuilder prune()`

