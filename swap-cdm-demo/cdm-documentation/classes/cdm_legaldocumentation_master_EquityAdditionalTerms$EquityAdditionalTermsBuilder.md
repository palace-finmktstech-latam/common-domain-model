# EquityAdditionalTermsBuilder

**Full Name:** `cdm.legaldocumentation.master.EquityAdditionalTerms$EquityAdditionalTermsBuilder`

**Package:** `cdm.legaldocumentation.master`

## Type: Interface

### Implemented Interfaces

- `cdm.legaldocumentation.master.EquityAdditionalTerms`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`

### Methods

#### Setter Methods

- `EquityAdditionalTermsBuilder setExtraordinaryEvents(ExtraordinaryEvents arg0)`
- `EquityAdditionalTermsBuilder setSubstitutionProvision(UnderlierSubstitutionProvision arg0)`
- `EquityAdditionalTermsBuilder setDeterminationTerms(List arg0)`

#### Getter Methods

- `ExtraordinaryEventsBuilder getExtraordinaryEvents()`
- `List getDeterminationTerms()`
- `UnderlierSubstitutionProvisionBuilder getSubstitutionProvision()`
- `ExtraordinaryEventsBuilder getOrCreateExtraordinaryEvents()`
- `DeterminationRolesAndTermsBuilder getOrCreateDeterminationTerms(int arg0)`
- `UnderlierSubstitutionProvisionBuilder getOrCreateSubstitutionProvision()`

#### Adder Methods

- `EquityAdditionalTermsBuilder addDeterminationTerms(DeterminationRolesAndTerms arg0, int arg1)`
- `EquityAdditionalTermsBuilder addDeterminationTerms(List arg0)`
- `EquityAdditionalTermsBuilder addDeterminationTerms(DeterminationRolesAndTerms arg0)`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `EquityAdditionalTermsBuilder prune()`

