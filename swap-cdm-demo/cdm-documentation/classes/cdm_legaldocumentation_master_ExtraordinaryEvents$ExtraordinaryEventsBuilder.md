# ExtraordinaryEventsBuilder

**Full Name:** `cdm.legaldocumentation.master.ExtraordinaryEvents$ExtraordinaryEventsBuilder`

**Package:** `cdm.legaldocumentation.master`

## Type: Interface

### Implemented Interfaces

- `cdm.legaldocumentation.master.ExtraordinaryEvents`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`

### Methods

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

- `IndexAdjustmentEventsBuilder getIndexAdjustmentEvents()`
- `EquityCorporateEventsBuilder getTenderOfferEvents()`
- `RepresentationsBuilder getRepresentations()`
- `List getAdditionalBespokeTerms()`
- `EquityCorporateEventsBuilder getMergerEvents()`
- `EquityCorporateEventsBuilder getOrCreateMergerEvents()`
- `RepresentationsBuilder getOrCreateRepresentations()`
- `AdditionalDisruptionEventsBuilder getAdditionalDisruptionEvents()`
- `ClauseBuilder getOrCreateAdditionalBespokeTerms(int arg0)`
- `EquityCorporateEventsBuilder getOrCreateTenderOfferEvents()`
- `IndexAdjustmentEventsBuilder getOrCreateIndexAdjustmentEvents()`
- `AdditionalDisruptionEventsBuilder getOrCreateAdditionalDisruptionEvents()`

#### Adder Methods

- `ExtraordinaryEventsBuilder addAdditionalBespokeTerms(Clause arg0)`
- `ExtraordinaryEventsBuilder addAdditionalBespokeTerms(Clause arg0, int arg1)`
- `ExtraordinaryEventsBuilder addAdditionalBespokeTerms(List arg0)`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `ExtraordinaryEventsBuilder prune()`

