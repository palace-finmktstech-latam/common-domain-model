# AveragingObservationListBuilderImpl

**Full Name:** `cdm.product.common.schedule.AveragingObservationList$AveragingObservationListBuilderImpl`

**Package:** `cdm.product.common.schedule`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.product.common.schedule.AveragingObservationList$AveragingObservationListBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| averagingObservation | `java.util.List<cdm.product.common.schedule.WeightedAveragingObservation$WeightedAveragingObservationBuilder>` |  |

### Methods

#### Builder Methods

- `AveragingObservationList build()`

#### Setter Methods

- `AveragingObservationListBuilder setAveragingObservation(List arg0)`

#### Getter Methods

- `List getAveragingObservation()`
- `WeightedAveragingObservationBuilder getOrCreateAveragingObservation(int arg0)`

#### Adder Methods

- `AveragingObservationListBuilder addAveragingObservation(WeightedAveragingObservation arg0, int arg1)`
- `AveragingObservationListBuilder addAveragingObservation(WeightedAveragingObservation arg0)`
- `AveragingObservationListBuilder addAveragingObservation(List arg0)`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `AveragingObservationListBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `boolean hasData()`
- `AveragingObservationListBuilder toBuilder()`
- `AveragingObservationListBuilder prune()`

