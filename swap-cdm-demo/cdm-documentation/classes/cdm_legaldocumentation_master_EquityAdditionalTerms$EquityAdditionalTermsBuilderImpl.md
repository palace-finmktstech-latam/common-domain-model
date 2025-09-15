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

- `ExtraordinaryEventsBuilder getExtraordinaryEvents()`
- `List getDeterminationTerms()`
- `UnderlierSubstitutionProvisionBuilder getSubstitutionProvision()`
- `ExtraordinaryEventsBuilder getOrCreateExtraordinaryEvents()`
- `DeterminationRolesAndTermsBuilder getOrCreateDeterminationTerms(int arg0)`
- `UnderlierSubstitutionProvisionBuilder getOrCreateSubstitutionProvision()`

#### Adder Methods

- `EquityAdditionalTermsBuilder addDeterminationTerms(List arg0)`
- `EquityAdditionalTermsBuilder addDeterminationTerms(DeterminationRolesAndTerms arg0, int arg1)`
- `EquityAdditionalTermsBuilder addDeterminationTerms(DeterminationRolesAndTerms arg0)`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `EquityAdditionalTermsBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `boolean hasData()`
- `EquityAdditionalTermsBuilder toBuilder()`
- `EquityAdditionalTermsBuilder prune()`

