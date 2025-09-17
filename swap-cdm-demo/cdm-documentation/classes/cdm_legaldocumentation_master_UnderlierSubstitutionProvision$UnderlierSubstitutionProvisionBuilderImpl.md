# UnderlierSubstitutionProvisionBuilderImpl

**Full Name:** `cdm.legaldocumentation.master.UnderlierSubstitutionProvision$UnderlierSubstitutionProvisionBuilderImpl`

**Package:** `cdm.legaldocumentation.master`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.legaldocumentation.master.UnderlierSubstitutionProvision$UnderlierSubstitutionProvisionBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| whoMaySubstitute | `java.util.List<cdm.base.staticdata.party.CounterpartyRoleEnum>` |  |
| substitutionBeSpokeTerms | `java.util.List<cdm.legaldocumentation.master.Clause$ClauseBuilder>` |  |
| substitutionTriggerEvents | `java.util.List<cdm.legaldocumentation.master.ExtraordinaryEvents$ExtraordinaryEventsBuilder>` |  |
| disputingParty | `CounterpartyRoleEnum` |  |

### Methods

#### Builder Methods

- `UnderlierSubstitutionProvision build()`

#### Setter Methods

- `UnderlierSubstitutionProvisionBuilder setDisputingParty(CounterpartyRoleEnum arg0)`
- `UnderlierSubstitutionProvisionBuilder setWhoMaySubstitute(List arg0)`
- `UnderlierSubstitutionProvisionBuilder setSubstitutionBeSpokeTerms(List arg0)`
- `UnderlierSubstitutionProvisionBuilder setSubstitutionTriggerEvents(List arg0)`

#### Getter Methods

- `CounterpartyRoleEnum getDisputingParty()`
- `List getWhoMaySubstitute()`
- `List getSubstitutionTriggerEvents()`
- `ClauseBuilder getOrCreateSubstitutionBeSpokeTerms(int arg0)`
- `ExtraordinaryEventsBuilder getOrCreateSubstitutionTriggerEvents(int arg0)`
- `List getSubstitutionBeSpokeTerms()`

#### Adder Methods

- `UnderlierSubstitutionProvisionBuilder addWhoMaySubstitute(List arg0)`
- `UnderlierSubstitutionProvisionBuilder addWhoMaySubstitute(CounterpartyRoleEnum arg0, int arg1)`
- `UnderlierSubstitutionProvisionBuilder addWhoMaySubstitute(CounterpartyRoleEnum arg0)`
- `UnderlierSubstitutionProvisionBuilder addSubstitutionBeSpokeTerms(Clause arg0)`
- `UnderlierSubstitutionProvisionBuilder addSubstitutionBeSpokeTerms(Clause arg0, int arg1)`
- `UnderlierSubstitutionProvisionBuilder addSubstitutionBeSpokeTerms(List arg0)`
- `UnderlierSubstitutionProvisionBuilder addSubstitutionTriggerEvents(List arg0)`
- `UnderlierSubstitutionProvisionBuilder addSubstitutionTriggerEvents(ExtraordinaryEvents arg0)`
- `UnderlierSubstitutionProvisionBuilder addSubstitutionTriggerEvents(ExtraordinaryEvents arg0, int arg1)`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `UnderlierSubstitutionProvisionBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `UnderlierSubstitutionProvisionBuilder prune()`
- `UnderlierSubstitutionProvisionBuilder toBuilder()`
- `boolean hasData()`

