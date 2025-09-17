# ClosedStateBuilderImpl

**Full Name:** `cdm.legaldocumentation.common.ClosedState$ClosedStateBuilderImpl`

**Package:** `cdm.legaldocumentation.common`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.legaldocumentation.common.ClosedState$ClosedStateBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| state | `ClosedStateEnum` |  |
| activityDate | `Date` |  |
| effectiveDate | `Date` |  |
| lastPaymentDate | `Date` |  |

### Methods

#### Builder Methods

- `ClosedState build()`

#### Setter Methods

- `ClosedStateBuilder setState(ClosedStateEnum arg0)`
- `ClosedStateBuilder setActivityDate(Date arg0)`
- `ClosedStateBuilder setLastPaymentDate(Date arg0)`
- `ClosedStateBuilder setEffectiveDate(Date arg0)`

#### Getter Methods

- `ClosedStateEnum getState()`
- `Date getEffectiveDate()`
- `Date getLastPaymentDate()`
- `Date getActivityDate()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `ClosedStateBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `ClosedStateBuilder prune()`
- `ClosedStateBuilder toBuilder()`
- `boolean hasData()`

