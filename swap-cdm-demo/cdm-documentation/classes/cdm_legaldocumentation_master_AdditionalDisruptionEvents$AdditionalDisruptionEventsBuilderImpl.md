# AdditionalDisruptionEventsBuilderImpl

**Full Name:** `cdm.legaldocumentation.master.AdditionalDisruptionEvents$AdditionalDisruptionEventsBuilderImpl`

**Package:** `cdm.legaldocumentation.master`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.legaldocumentation.master.AdditionalDisruptionEvents$AdditionalDisruptionEventsBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| changeInLaw | `Boolean` |  |
| failureToDeliver | `Boolean` |  |
| insolvencyFiling | `Boolean` |  |
| hedgingDisruption | `Boolean` |  |
| increasedCostOfHedging | `Boolean` |  |
| foreignOwnershipEvent | `Boolean` |  |
| lossOfStockBorrow | `Boolean` |  |
| maximumStockLoanRate | `BigDecimal` |  |
| increasedCostOfStockBorrow | `Boolean` |  |
| initialStockLoanRate | `BigDecimal` |  |
| determiningParty | `AncillaryRoleEnum` |  |
| additionalBespokeTerms | `java.util.List<cdm.legaldocumentation.master.Clause$ClauseBuilder>` |  |

### Methods

#### Builder Methods

- `AdditionalDisruptionEvents build()`

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

- `Boolean getIncreasedCostOfStockBorrow()`
- `Boolean getFailureToDeliver()`
- `List getAdditionalBespokeTerms()`
- `Boolean getLossOfStockBorrow()`
- `BigDecimal getMaximumStockLoanRate()`
- `Boolean getForeignOwnershipEvent()`
- `Boolean getInsolvencyFiling()`
- `Boolean getHedgingDisruption()`
- `Boolean getIncreasedCostOfHedging()`
- `Boolean getChangeInLaw()`
- `BigDecimal getInitialStockLoanRate()`
- `AncillaryRoleEnum getDeterminingParty()`
- `ClauseBuilder getOrCreateAdditionalBespokeTerms(int arg0)`

#### Adder Methods

- `AdditionalDisruptionEventsBuilder addAdditionalBespokeTerms(List arg0)`
- `AdditionalDisruptionEventsBuilder addAdditionalBespokeTerms(Clause arg0, int arg1)`
- `AdditionalDisruptionEventsBuilder addAdditionalBespokeTerms(Clause arg0)`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `AdditionalDisruptionEventsBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `AdditionalDisruptionEventsBuilder prune()`
- `AdditionalDisruptionEventsBuilder toBuilder()`
- `boolean hasData()`

