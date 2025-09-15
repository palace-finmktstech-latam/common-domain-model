# UnderlierSubstitutionProvisionBuilder

**Full Name:** `cdm.legaldocumentation.master.UnderlierSubstitutionProvision$UnderlierSubstitutionProvisionBuilder`

**Package:** `cdm.legaldocumentation.master`

## Type: Interface

### Implemented Interfaces

- `cdm.legaldocumentation.master.UnderlierSubstitutionProvision`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`

### Methods

#### Setter Methods

- `UnderlierSubstitutionProvisionBuilder setWhoMaySubstitute(List arg0)`
- `UnderlierSubstitutionProvisionBuilder setDisputingParty(CounterpartyRoleEnum arg0)`
- `UnderlierSubstitutionProvisionBuilder setSubstitutionTriggerEvents(List arg0)`
- `UnderlierSubstitutionProvisionBuilder setSubstitutionBeSpokeTerms(List arg0)`

#### Getter Methods

- `List getSubstitutionBeSpokeTerms()`
- `List getSubstitutionTriggerEvents()`
- `ClauseBuilder getOrCreateSubstitutionBeSpokeTerms(int arg0)`
- `ExtraordinaryEventsBuilder getOrCreateSubstitutionTriggerEvents(int arg0)`

#### Adder Methods

- `UnderlierSubstitutionProvisionBuilder addWhoMaySubstitute(List arg0)`
- `UnderlierSubstitutionProvisionBuilder addWhoMaySubstitute(CounterpartyRoleEnum arg0)`
- `UnderlierSubstitutionProvisionBuilder addWhoMaySubstitute(CounterpartyRoleEnum arg0, int arg1)`
- `UnderlierSubstitutionProvisionBuilder addSubstitutionBeSpokeTerms(Clause arg0, int arg1)`
- `UnderlierSubstitutionProvisionBuilder addSubstitutionBeSpokeTerms(Clause arg0)`
- `UnderlierSubstitutionProvisionBuilder addSubstitutionBeSpokeTerms(List arg0)`
- `UnderlierSubstitutionProvisionBuilder addSubstitutionTriggerEvents(List arg0)`
- `UnderlierSubstitutionProvisionBuilder addSubstitutionTriggerEvents(ExtraordinaryEvents arg0, int arg1)`
- `UnderlierSubstitutionProvisionBuilder addSubstitutionTriggerEvents(ExtraordinaryEvents arg0)`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `UnderlierSubstitutionProvisionBuilder prune()`

