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

- `ExtraordinaryEventsBuilder setAdditionalBespokeTerms(List arg0)`
- `ExtraordinaryEventsBuilder setTenderOfferEvents(EquityCorporateEvents arg0)`
- `ExtraordinaryEventsBuilder setIndexAdjustmentEvents(IndexAdjustmentEvents arg0)`
- `ExtraordinaryEventsBuilder setFailureToDeliver(Boolean arg0)`
- `ExtraordinaryEventsBuilder setMergerEvents(EquityCorporateEvents arg0)`
- `ExtraordinaryEventsBuilder setDelisting(NationalizationOrInsolvencyOrDelistingEventEnum arg0)`
- `ExtraordinaryEventsBuilder setRepresentations(Representations arg0)`
- `ExtraordinaryEventsBuilder setCompositionOfCombinedConsideration(Boolean arg0)`
- `ExtraordinaryEventsBuilder setAdditionalDisruptionEvents(AdditionalDisruptionEvents arg0)`
- `ExtraordinaryEventsBuilder setNationalizationOrInsolvency(NationalizationOrInsolvencyOrDelistingEventEnum arg0)`

#### Getter Methods

- `AdditionalDisruptionEventsBuilder getAdditionalDisruptionEvents()`
- `Boolean getCompositionOfCombinedConsideration()`
- `NationalizationOrInsolvencyOrDelistingEventEnum getNationalizationOrInsolvency()`
- `IndexAdjustmentEventsBuilder getIndexAdjustmentEvents()`
- `RepresentationsBuilder getRepresentations()`
- `EquityCorporateEventsBuilder getTenderOfferEvents()`
- `EquityCorporateEventsBuilder getMergerEvents()`
- `Boolean getFailureToDeliver()`
- `List getAdditionalBespokeTerms()`
- `NationalizationOrInsolvencyOrDelistingEventEnum getDelisting()`
- `EquityCorporateEventsBuilder getOrCreateMergerEvents()`
- `RepresentationsBuilder getOrCreateRepresentations()`
- `IndexAdjustmentEventsBuilder getOrCreateIndexAdjustmentEvents()`
- `ClauseBuilder getOrCreateAdditionalBespokeTerms(int arg0)`
- `AdditionalDisruptionEventsBuilder getOrCreateAdditionalDisruptionEvents()`
- `EquityCorporateEventsBuilder getOrCreateTenderOfferEvents()`

#### Adder Methods

- `ExtraordinaryEventsBuilder addAdditionalBespokeTerms(List arg0)`
- `ExtraordinaryEventsBuilder addAdditionalBespokeTerms(Clause arg0)`
- `ExtraordinaryEventsBuilder addAdditionalBespokeTerms(Clause arg0, int arg1)`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `ExtraordinaryEventsBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `ExtraordinaryEventsBuilder prune()`
- `ExtraordinaryEventsBuilder toBuilder()`
- `boolean hasData()`

