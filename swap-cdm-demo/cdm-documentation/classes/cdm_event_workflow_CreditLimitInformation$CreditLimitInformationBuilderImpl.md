# CreditLimitInformationBuilderImpl

**Full Name:** `cdm.event.workflow.CreditLimitInformation$CreditLimitInformationBuilderImpl`

**Package:** `cdm.event.workflow`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.event.workflow.CreditLimitInformation$CreditLimitInformationBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| limitApplicable | `java.util.List<cdm.event.workflow.LimitApplicableExtended$LimitApplicableExtendedBuilder>` |  |

### Methods

#### Builder Methods

- `CreditLimitInformation build()`

#### Setter Methods

- `CreditLimitInformationBuilder setLimitApplicable(List arg0)`

#### Getter Methods

- `List getLimitApplicable()`
- `LimitApplicableExtendedBuilder getOrCreateLimitApplicable(int arg0)`

#### Adder Methods

- `CreditLimitInformationBuilder addLimitApplicable(LimitApplicableExtended arg0)`
- `CreditLimitInformationBuilder addLimitApplicable(LimitApplicableExtended arg0, int arg1)`
- `CreditLimitInformationBuilder addLimitApplicable(List arg0)`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `CreditLimitInformationBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `boolean hasData()`
- `CreditLimitInformationBuilder toBuilder()`
- `CreditLimitInformationBuilder prune()`

