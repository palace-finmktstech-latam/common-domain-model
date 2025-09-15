# InitialFixingDateBuilderImpl

**Full Name:** `cdm.product.common.schedule.InitialFixingDate$InitialFixingDateBuilderImpl`

**Package:** `cdm.product.common.schedule`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.product.common.schedule.InitialFixingDate$InitialFixingDateBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| relativeDateOffset | `RelativeDateOffsetBuilder` |  |
| initialFixingDate | `Date` |  |

### Methods

#### Builder Methods

- `InitialFixingDate build()`

#### Setter Methods

- `InitialFixingDateBuilder setInitialFixingDate(Date arg0)`
- `InitialFixingDateBuilder setRelativeDateOffset(RelativeDateOffset arg0)`

#### Getter Methods

- `Date getInitialFixingDate()`
- `RelativeDateOffsetBuilder getRelativeDateOffset()`
- `RelativeDateOffsetBuilder getOrCreateRelativeDateOffset()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `InitialFixingDateBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `boolean hasData()`
- `InitialFixingDateBuilder toBuilder()`
- `InitialFixingDateBuilder prune()`

