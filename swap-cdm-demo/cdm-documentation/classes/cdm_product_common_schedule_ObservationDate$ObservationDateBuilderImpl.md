# ObservationDateBuilderImpl

**Full Name:** `cdm.product.common.schedule.ObservationDate$ObservationDateBuilderImpl`

**Package:** `cdm.product.common.schedule`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.product.common.schedule.ObservationDate$ObservationDateBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| unadjustedDate | `Date` |  |
| adjustedDate | `Date` |  |
| weight | `BigDecimal` |  |
| observationReference | `String` |  |
| meta | `MetaFieldsBuilder` |  |

### Methods

#### Builder Methods

- `ObservationDate build()`

#### Setter Methods

- `ObservationDateBuilder setUnadjustedDate(Date arg0)`
- `ObservationDateBuilder setAdjustedDate(Date arg0)`
- `ObservationDateBuilder setObservationReference(String arg0)`
- `ObservationDateBuilder setWeight(BigDecimal arg0)`
- `ObservationDateBuilder setMeta(MetaFields arg0)`

#### Getter Methods

- `Date getAdjustedDate()`
- `Date getUnadjustedDate()`
- `BigDecimal getWeight()`
- `MetaFieldsBuilder getOrCreateMeta()`
- `String getObservationReference()`
- `MetaFieldsBuilder getMeta()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `ObservationDateBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `boolean hasData()`
- `ObservationDateBuilder toBuilder()`
- `ObservationDateBuilder prune()`

