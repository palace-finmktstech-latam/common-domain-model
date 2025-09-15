# CreditLimitUtilisationBuilderImpl

**Full Name:** `cdm.event.workflow.CreditLimitUtilisation$CreditLimitUtilisationBuilderImpl`

**Package:** `cdm.event.workflow`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.event.workflow.CreditLimitUtilisation$CreditLimitUtilisationBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| executed | `CreditLimitUtilisationPositionBuilder` |  |
| pending | `CreditLimitUtilisationPositionBuilder` |  |

### Methods

#### Builder Methods

- `CreditLimitUtilisation build()`

#### Setter Methods

- `CreditLimitUtilisationBuilder setExecuted(CreditLimitUtilisationPosition arg0)`
- `CreditLimitUtilisationBuilder setPending(CreditLimitUtilisationPosition arg0)`

#### Getter Methods

- `CreditLimitUtilisationPositionBuilder getExecuted()`
- `CreditLimitUtilisationPositionBuilder getPending()`
- `CreditLimitUtilisationPositionBuilder getOrCreateExecuted()`
- `CreditLimitUtilisationPositionBuilder getOrCreatePending()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `CreditLimitUtilisationBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `boolean hasData()`
- `CreditLimitUtilisationBuilder toBuilder()`
- `CreditLimitUtilisationBuilder prune()`

