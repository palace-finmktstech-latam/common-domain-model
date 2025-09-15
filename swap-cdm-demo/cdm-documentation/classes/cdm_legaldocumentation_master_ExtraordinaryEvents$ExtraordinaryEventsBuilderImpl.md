# ExtraordinaryEventsBuilderImpl

**Full Name:** `cdm.legaldocumentation.master.ExtraordinaryEvents$ExtraordinaryEventsBuilderImpl`

**Package:** `cdm.legaldocumentation.master`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.legaldocumentation.master.ExtraordinaryEvents$ExtraordinaryEventsBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| additionalBespokeTerms | `java.util.List<cdm.legaldocumentation.master.Clause$ClauseBuilder>` |  |
| mergerEvents | `EquityCorporateEventsBuilder` |  |
| tenderOfferEvents | `EquityCorporateEventsBuilder` |  |
| compositionOfCombinedConsideration | `Boolean` |  |
| indexAdjustmentEvents | `IndexAdjustmentEventsBuilder` |  |
| additionalDisruptionEvents | `AdditionalDisruptionEventsBuilder` |  |
| failureToDeliver | `Boolean` |  |
| representations | `RepresentationsBuilder` |  |
| nationalizationOrInsolvency | `NationalizationOrInsolvencyOrDelistingEventEnum` |  |
| delisting | `NationalizationOrInsolvencyOrDelistingEventEnum` |  |

### Methods

#### Builder Methods

- `ExtraordinaryEvents build()`

#### Setter Methods

- `ExtraordinaryEventsBuilder setMergerEvents(EquityCorporateEvents arg0)`
- `ExtraordinaryEventsBuilder setTenderOfferEvents(EquityCorporateEvents arg0)`
- `ExtraordinaryEventsBuilder setIndexAdjustmentEvents(IndexAdjustmentEvents arg0)`
- `ExtraordinaryEventsBuilder setRepresentations(Representations arg0)`
- `ExtraordinaryEventsBuilder setDelisting(NationalizationOrInsolvencyOrDelistingEventEnum arg0)`
- `ExtraordinaryEventsBuilder setAdditionalBespokeTerms(List arg0)`
- `ExtraordinaryEventsBuilder setFailureToDeliver(Boolean arg0)`
- `ExtraordinaryEventsBuilder setAdditionalDisruptionEvents(AdditionalDisruptionEvents arg0)`
- `ExtraordinaryEventsBuilder setCompositionOfCombinedConsideration(Boolean arg0)`
- `ExtraordinaryEventsBuilder setNationalizationOrInsolvency(NationalizationOrInsolvencyOrDelistingEventEnum arg0)`

#### Getter Methods

- `Boolean getCompositionOfCombinedConsideration()`
- `NationalizationOrInsolvencyOrDelistingEventEnum getNationalizationOrInsolvency()`
- `IndexAdjustmentEventsBuilder getIndexAdjustmentEvents()`
- `NationalizationOrInsolvencyOrDelistingEventEnum getDelisting()`
- `EquityCorporateEventsBuilder getTenderOfferEvents()`
- `RepresentationsBuilder getRepresentations()`
- `List getAdditionalBespokeTerms()`
- `EquityCorporateEventsBuilder getMergerEvents()`
- `Boolean getFailureToDeliver()`
- `EquityCorporateEventsBuilder getOrCreateMergerEvents()`
- `RepresentationsBuilder getOrCreateRepresentations()`
- `AdditionalDisruptionEventsBuilder getAdditionalDisruptionEvents()`
- `ClauseBuilder getOrCreateAdditionalBespokeTerms(int arg0)`
- `EquityCorporateEventsBuilder getOrCreateTenderOfferEvents()`
- `IndexAdjustmentEventsBuilder getOrCreateIndexAdjustmentEvents()`
- `AdditionalDisruptionEventsBuilder getOrCreateAdditionalDisruptionEvents()`

#### Adder Methods

- `ExtraordinaryEventsBuilder addAdditionalBespokeTerms(Clause arg0)`
- `ExtraordinaryEventsBuilder addAdditionalBespokeTerms(List arg0)`
- `ExtraordinaryEventsBuilder addAdditionalBespokeTerms(Clause arg0, int arg1)`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `ExtraordinaryEventsBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `boolean hasData()`
- `ExtraordinaryEventsBuilder toBuilder()`
- `ExtraordinaryEventsBuilder prune()`

