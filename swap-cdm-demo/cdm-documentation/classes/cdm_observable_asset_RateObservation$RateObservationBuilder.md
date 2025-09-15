# RateObservationBuilder

**Full Name:** `cdm.observable.asset.RateObservation$RateObservationBuilder`

**Package:** `cdm.observable.asset`

## Type: Interface

### Implemented Interfaces

- `cdm.observable.asset.RateObservation`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`
- `com.rosetta.model.lib.GlobalKey$GlobalKeyBuilder`

### Methods

#### Setter Methods

- `RateObservationBuilder setForecastRate(BigDecimal arg0)`
- `RateObservationBuilder setTreatedForecastRate(BigDecimal arg0)`
- `RateObservationBuilder setObservedRate(BigDecimal arg0)`
- `RateObservationBuilder setAdjustedFixingDate(Date arg0)`
- `RateObservationBuilder setTreatedRate(BigDecimal arg0)`
- `RateObservationBuilder setObservationWeight(Integer arg0)`
- `RateObservationBuilder setRateReferenceValue(RateObservation arg0)`
- `RateObservationBuilder setRateReference(ReferenceWithMetaRateObservation arg0)`
- `RateObservationBuilder setResetDate(Date arg0)`
- `RateObservationBuilder setMeta(MetaFields arg0)`

#### Getter Methods

- `MetaFieldsBuilder getOrCreateMeta()`
- `ReferenceWithMetaRateObservationBuilder getRateReference()`
- `ReferenceWithMetaRateObservationBuilder getOrCreateRateReference()`
- `MetaFieldsBuilder getMeta()`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `RateObservationBuilder prune()`

