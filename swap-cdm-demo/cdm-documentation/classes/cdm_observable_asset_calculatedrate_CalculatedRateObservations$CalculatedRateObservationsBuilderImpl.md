# CalculatedRateObservationsBuilderImpl

**Full Name:** `cdm.observable.asset.calculatedrate.CalculatedRateObservations$CalculatedRateObservationsBuilderImpl`

**Package:** `cdm.observable.asset.calculatedrate`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.observable.asset.calculatedrate.CalculatedRateObservations$CalculatedRateObservationsBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| observationDates | `java.util.List<com.rosetta.model.lib.records.Date>` |  |
| weights | `java.util.List<java.math.BigDecimal>` |  |
| observedRates | `java.util.List<java.math.BigDecimal>` |  |
| processedRates | `java.util.List<java.math.BigDecimal>` |  |

### Methods

#### Builder Methods

- `CalculatedRateObservations build()`

#### Setter Methods

- `CalculatedRateObservationsBuilder setObservationDates(List arg0)`
- `CalculatedRateObservationsBuilder setProcessedRates(List arg0)`
- `CalculatedRateObservationsBuilder setObservedRates(List arg0)`
- `CalculatedRateObservationsBuilder setWeights(List arg0)`

#### Getter Methods

- `List getObservationDates()`
- `List getObservedRates()`
- `List getProcessedRates()`
- `List getWeights()`

#### Adder Methods

- `CalculatedRateObservationsBuilder addObservedRates(List arg0)`
- `CalculatedRateObservationsBuilder addObservedRates(BigDecimal arg0, int arg1)`
- `CalculatedRateObservationsBuilder addObservedRates(BigDecimal arg0)`
- `CalculatedRateObservationsBuilder addObservationDates(List arg0)`
- `CalculatedRateObservationsBuilder addObservationDates(Date arg0, int arg1)`
- `CalculatedRateObservationsBuilder addObservationDates(Date arg0)`
- `CalculatedRateObservationsBuilder addProcessedRates(List arg0)`
- `CalculatedRateObservationsBuilder addProcessedRates(BigDecimal arg0)`
- `CalculatedRateObservationsBuilder addProcessedRates(BigDecimal arg0, int arg1)`
- `CalculatedRateObservationsBuilder addWeights(BigDecimal arg0)`
- `CalculatedRateObservationsBuilder addWeights(List arg0)`
- `CalculatedRateObservationsBuilder addWeights(BigDecimal arg0, int arg1)`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `CalculatedRateObservationsBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `CalculatedRateObservationsBuilder prune()`
- `CalculatedRateObservationsBuilder toBuilder()`
- `boolean hasData()`

