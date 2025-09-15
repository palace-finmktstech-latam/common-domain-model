# CalculatedRateObservationsBuilder

**Full Name:** `cdm.observable.asset.calculatedrate.CalculatedRateObservations$CalculatedRateObservationsBuilder`

**Package:** `cdm.observable.asset.calculatedrate`

## Type: Interface

### Implemented Interfaces

- `cdm.observable.asset.calculatedrate.CalculatedRateObservations`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`

### Methods

#### Setter Methods

- `CalculatedRateObservationsBuilder setObservationDates(List arg0)`
- `CalculatedRateObservationsBuilder setObservedRates(List arg0)`
- `CalculatedRateObservationsBuilder setProcessedRates(List arg0)`
- `CalculatedRateObservationsBuilder setWeights(List arg0)`

#### Adder Methods

- `CalculatedRateObservationsBuilder addObservedRates(BigDecimal arg0)`
- `CalculatedRateObservationsBuilder addObservedRates(BigDecimal arg0, int arg1)`
- `CalculatedRateObservationsBuilder addObservedRates(List arg0)`
- `CalculatedRateObservationsBuilder addProcessedRates(BigDecimal arg0)`
- `CalculatedRateObservationsBuilder addProcessedRates(List arg0)`
- `CalculatedRateObservationsBuilder addProcessedRates(BigDecimal arg0, int arg1)`
- `CalculatedRateObservationsBuilder addObservationDates(Date arg0, int arg1)`
- `CalculatedRateObservationsBuilder addObservationDates(List arg0)`
- `CalculatedRateObservationsBuilder addObservationDates(Date arg0)`
- `CalculatedRateObservationsBuilder addWeights(List arg0)`
- `CalculatedRateObservationsBuilder addWeights(BigDecimal arg0, int arg1)`
- `CalculatedRateObservationsBuilder addWeights(BigDecimal arg0)`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `CalculatedRateObservationsBuilder prune()`

