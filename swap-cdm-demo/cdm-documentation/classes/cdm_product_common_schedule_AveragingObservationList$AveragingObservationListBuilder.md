# AveragingObservationListBuilder

**Full Name:** `cdm.product.common.schedule.AveragingObservationList$AveragingObservationListBuilder`

**Package:** `cdm.product.common.schedule`

## Type: Interface

### Implemented Interfaces

- `cdm.product.common.schedule.AveragingObservationList`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`

### Methods

#### Setter Methods

- `AveragingObservationListBuilder setAveragingObservation(List arg0)`

#### Getter Methods

- `List getAveragingObservation()`
- `WeightedAveragingObservationBuilder getOrCreateAveragingObservation(int arg0)`

#### Adder Methods

- `AveragingObservationListBuilder addAveragingObservation(List arg0)`
- `AveragingObservationListBuilder addAveragingObservation(WeightedAveragingObservation arg0)`
- `AveragingObservationListBuilder addAveragingObservation(WeightedAveragingObservation arg0, int arg1)`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `AveragingObservationListBuilder prune()`

