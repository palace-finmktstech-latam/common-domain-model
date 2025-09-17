# RestructuringBuilderImpl

**Full Name:** `cdm.observable.event.Restructuring$RestructuringBuilderImpl`

**Package:** `cdm.observable.event`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.observable.event.Restructuring$RestructuringBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| applicable | `Boolean` |  |
| restructuringType | `FieldWithMetaRestructuringEnumBuilder` |  |
| multipleHolderObligation | `Boolean` |  |
| multipleCreditEventNotices | `Boolean` |  |

### Methods

#### Builder Methods

- `Restructuring build()`

#### Setter Methods

- `RestructuringBuilder setApplicable(Boolean arg0)`
- `RestructuringBuilder setRestructuringTypeValue(RestructuringEnum arg0)`
- `RestructuringBuilder setRestructuringType(FieldWithMetaRestructuringEnum arg0)`
- `RestructuringBuilder setMultipleCreditEventNotices(Boolean arg0)`
- `RestructuringBuilder setMultipleHolderObligation(Boolean arg0)`

#### Getter Methods

- `Boolean getMultipleHolderObligation()`
- `Boolean getMultipleCreditEventNotices()`
- `FieldWithMetaRestructuringEnumBuilder getRestructuringType()`
- `FieldWithMetaRestructuringEnumBuilder getOrCreateRestructuringType()`
- `Boolean getApplicable()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `RestructuringBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `RestructuringBuilder prune()`
- `RestructuringBuilder toBuilder()`
- `boolean hasData()`

