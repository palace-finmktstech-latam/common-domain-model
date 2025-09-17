# ResetBuilder

**Full Name:** `cdm.event.common.Reset$ResetBuilder`

**Package:** `cdm.event.common`

## Type: Interface

### Implemented Interfaces

- `cdm.event.common.Reset`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`
- `com.rosetta.model.lib.GlobalKey$GlobalKeyBuilder`

### Methods

#### Setter Methods

- `ResetBuilder setAveragingMethodology(AveragingCalculation arg0)`
- `ResetBuilder setObservations(List arg0)`
- `ResetBuilder setResetDate(Date arg0)`
- `ResetBuilder setRateRecordDate(Date arg0)`
- `ResetBuilder setResetValue(Price arg0)`
- `ResetBuilder setObservationsValue(List arg0)`
- `ResetBuilder setMeta(MetaFields arg0)`

#### Getter Methods

- `MetaFieldsBuilder getOrCreateMeta()`
- `PriceBuilder getResetValue()`
- `List getObservations()`
- `AveragingCalculationBuilder getAveragingMethodology()`
- `PriceBuilder getOrCreateResetValue()`
- `ReferenceWithMetaObservationBuilder getOrCreateObservations(int arg0)`
- `AveragingCalculationBuilder getOrCreateAveragingMethodology()`
- `MetaFieldsBuilder getMeta()`

#### Adder Methods

- `ResetBuilder addObservations(List arg0)`
- `ResetBuilder addObservations(ReferenceWithMetaObservation arg0, int arg1)`
- `ResetBuilder addObservations(ReferenceWithMetaObservation arg0)`
- `ResetBuilder addObservationsValue(Observation arg0, int arg1)`
- `ResetBuilder addObservationsValue(List arg0)`
- `ResetBuilder addObservationsValue(Observation arg0)`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `ResetBuilder prune()`

