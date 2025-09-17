# CreditLimitUtilisationBuilder

**Full Name:** `cdm.event.workflow.CreditLimitUtilisation$CreditLimitUtilisationBuilder`

**Package:** `cdm.event.workflow`

## Type: Interface

### Implemented Interfaces

- `cdm.event.workflow.CreditLimitUtilisation`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`

### Methods

#### Setter Methods

- `CreditLimitUtilisationBuilder setPending(CreditLimitUtilisationPosition arg0)`
- `CreditLimitUtilisationBuilder setExecuted(CreditLimitUtilisationPosition arg0)`

#### Getter Methods

- `CreditLimitUtilisationPositionBuilder getExecuted()`
- `CreditLimitUtilisationPositionBuilder getPending()`
- `CreditLimitUtilisationPositionBuilder getOrCreateExecuted()`
- `CreditLimitUtilisationPositionBuilder getOrCreatePending()`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `CreditLimitUtilisationBuilder prune()`

