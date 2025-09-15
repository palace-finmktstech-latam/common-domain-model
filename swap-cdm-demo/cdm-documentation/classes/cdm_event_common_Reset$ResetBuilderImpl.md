# ResetBuilderImpl

**Full Name:** `cdm.event.common.Reset$ResetBuilderImpl`

**Package:** `cdm.event.common`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.event.common.Reset$ResetBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| resetValue | `PriceBuilder` |  |
| resetDate | `Date` |  |
| rateRecordDate | `Date` |  |
| observations | `java.util.List<cdm.observable.event.metafields.ReferenceWithMetaObservation$ReferenceWithMetaObservationBuilder>` |  |
| averagingMethodology | `AveragingCalculationBuilder` |  |
| meta | `MetaFieldsBuilder` |  |

### Methods

#### Builder Methods

- `Reset build()`

#### Setter Methods

- `ResetBuilder setAveragingMethodology(AveragingCalculation arg0)`
- `ResetBuilder setObservationsValue(List arg0)`
- `ResetBuilder setResetValue(Price arg0)`
- `ResetBuilder setRateRecordDate(Date arg0)`
- `ResetBuilder setObservations(List arg0)`
- `ResetBuilder setResetDate(Date arg0)`
- `ResetBuilder setMeta(MetaFields arg0)`

#### Getter Methods

- `AveragingCalculationBuilder getOrCreateAveragingMethodology()`
- `Date getRateRecordDate()`
- `List getObservations()`
- `PriceBuilder getResetValue()`
- `Date getResetDate()`
- `AveragingCalculationBuilder getAveragingMethodology()`
- `MetaFieldsBuilder getOrCreateMeta()`
- `PriceBuilder getOrCreateResetValue()`
- `ReferenceWithMetaObservationBuilder getOrCreateObservations(int arg0)`
- `MetaFieldsBuilder getMeta()`

#### Adder Methods

- `ResetBuilder addObservations(ReferenceWithMetaObservation arg0, int arg1)`
- `ResetBuilder addObservations(ReferenceWithMetaObservation arg0)`
- `ResetBuilder addObservations(List arg0)`
- `ResetBuilder addObservationsValue(Observation arg0)`
- `ResetBuilder addObservationsValue(List arg0)`
- `ResetBuilder addObservationsValue(Observation arg0, int arg1)`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `ResetBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `boolean hasData()`
- `ResetBuilder toBuilder()`
- `ResetBuilder prune()`

