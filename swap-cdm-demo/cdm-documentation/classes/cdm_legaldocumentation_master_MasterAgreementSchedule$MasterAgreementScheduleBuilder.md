# MasterAgreementScheduleBuilder

**Full Name:** `cdm.legaldocumentation.master.MasterAgreementSchedule$MasterAgreementScheduleBuilder`

**Package:** `cdm.legaldocumentation.master`

## Type: Interface

### Implemented Interfaces

- `cdm.legaldocumentation.master.MasterAgreementSchedule`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`

### Methods

#### Setter Methods

- `MasterAgreementScheduleBuilder setClause(List arg0)`

#### Getter Methods

- `MasterAgreementClauseBuilder getOrCreateClause(int arg0)`
- `List getClause()`

#### Adder Methods

- `MasterAgreementScheduleBuilder addClause(List arg0)`
- `MasterAgreementScheduleBuilder addClause(MasterAgreementClause arg0, int arg1)`
- `MasterAgreementScheduleBuilder addClause(MasterAgreementClause arg0)`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `MasterAgreementScheduleBuilder prune()`

