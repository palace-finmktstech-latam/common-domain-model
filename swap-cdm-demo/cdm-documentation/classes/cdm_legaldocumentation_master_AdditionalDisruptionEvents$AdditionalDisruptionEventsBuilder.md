# AdditionalDisruptionEventsBuilder

**Full Name:** `cdm.legaldocumentation.master.AdditionalDisruptionEvents$AdditionalDisruptionEventsBuilder`

**Package:** `cdm.legaldocumentation.master`

## Type: Interface

### Implemented Interfaces

- `cdm.legaldocumentation.master.AdditionalDisruptionEvents`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`

### Methods

#### Setter Methods

- `AdditionalDisruptionEventsBuilder setAdditionalBespokeTerms(List arg0)`
- `AdditionalDisruptionEventsBuilder setFailureToDeliver(Boolean arg0)`
- `AdditionalDisruptionEventsBuilder setLossOfStockBorrow(Boolean arg0)`
- `AdditionalDisruptionEventsBuilder setInitialStockLoanRate(BigDecimal arg0)`
- `AdditionalDisruptionEventsBuilder setInsolvencyFiling(Boolean arg0)`
- `AdditionalDisruptionEventsBuilder setForeignOwnershipEvent(Boolean arg0)`
- `AdditionalDisruptionEventsBuilder setMaximumStockLoanRate(BigDecimal arg0)`
- `AdditionalDisruptionEventsBuilder setHedgingDisruption(Boolean arg0)`
- `AdditionalDisruptionEventsBuilder setIncreasedCostOfHedging(Boolean arg0)`
- `AdditionalDisruptionEventsBuilder setChangeInLaw(Boolean arg0)`
- `AdditionalDisruptionEventsBuilder setDeterminingParty(AncillaryRoleEnum arg0)`
- `AdditionalDisruptionEventsBuilder setIncreasedCostOfStockBorrow(Boolean arg0)`

#### Getter Methods

- `List getAdditionalBespokeTerms()`
- `ClauseBuilder getOrCreateAdditionalBespokeTerms(int arg0)`

#### Adder Methods

- `AdditionalDisruptionEventsBuilder addAdditionalBespokeTerms(Clause arg0)`
- `AdditionalDisruptionEventsBuilder addAdditionalBespokeTerms(List arg0)`
- `AdditionalDisruptionEventsBuilder addAdditionalBespokeTerms(Clause arg0, int arg1)`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `AdditionalDisruptionEventsBuilder prune()`

