# EquityAdditionalTermsBuilderImpl

**Full Name:** `cdm.legaldocumentation.master.EquityAdditionalTerms$EquityAdditionalTermsBuilderImpl`

**Package:** `cdm.legaldocumentation.master`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.legaldocumentation.master.EquityAdditionalTerms$EquityAdditionalTermsBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| extraordinaryEvents | `ExtraordinaryEventsBuilder` |  |
| determinationTerms | `java.util.List<cdm.legaldocumentation.master.DeterminationRolesAndTerms$DeterminationRolesAndTermsBuilder>` |  |
| substitutionProvision | `UnderlierSubstitutionProvisionBuilder` |  |

### Methods

#### Builder Methods

- `EquityAdditionalTerms build()`

#### Setter Methods

- `EquityAdditionalTermsBuilder setExtraordinaryEvents(ExtraordinaryEvents arg0)`
- `EquityAdditionalTermsBuilder setSubstitutionProvision(UnderlierSubstitutionProvision arg0)`
- `EquityAdditionalTermsBuilder setDeterminationTerms(List arg0)`

#### Getter Methods

- `List getDeterminationTerms()`
- `UnderlierSubstitutionProvisionBuilder getSubstitutionProvision()`
- `ExtraordinaryEventsBuilder getExtraordinaryEvents()`
- `UnderlierSubstitutionProvisionBuilder getOrCreateSubstitutionProvision()`
- `ExtraordinaryEventsBuilder getOrCreateExtraordinaryEvents()`
- `DeterminationRolesAndTermsBuilder getOrCreateDeterminationTerms(int arg0)`

#### Adder Methods

- `EquityAdditionalTermsBuilder addDeterminationTerms(DeterminationRolesAndTerms arg0)`
- `EquityAdditionalTermsBuilder addDeterminationTerms(DeterminationRolesAndTerms arg0, int arg1)`
- `EquityAdditionalTermsBuilder addDeterminationTerms(List arg0)`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `EquityAdditionalTermsBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `EquityAdditionalTermsBuilder prune()`
- `EquityAdditionalTermsBuilder toBuilder()`
- `boolean hasData()`

