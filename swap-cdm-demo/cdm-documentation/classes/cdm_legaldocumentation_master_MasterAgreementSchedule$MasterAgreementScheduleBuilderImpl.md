# MasterAgreementScheduleBuilderImpl

**Full Name:** `cdm.legaldocumentation.master.MasterAgreementSchedule$MasterAgreementScheduleBuilderImpl`

**Package:** `cdm.legaldocumentation.master`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.legaldocumentation.master.MasterAgreementSchedule$MasterAgreementScheduleBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| clause | `java.util.List<cdm.legaldocumentation.master.MasterAgreementClause$MasterAgreementClauseBuilder>` |  |

### Methods

#### Builder Methods

- `MasterAgreementSchedule build()`

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

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `MasterAgreementScheduleBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `MasterAgreementScheduleBuilder prune()`
- `MasterAgreementScheduleBuilder toBuilder()`
- `boolean hasData()`

