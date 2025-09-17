# RateObservationBuilderImpl

**Full Name:** `cdm.observable.asset.RateObservation$RateObservationBuilderImpl`

**Package:** `cdm.observable.asset`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.observable.asset.RateObservation$RateObservationBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| resetDate | `Date` |  |
| adjustedFixingDate | `Date` |  |
| observedRate | `BigDecimal` |  |
| treatedRate | `BigDecimal` |  |
| observationWeight | `Integer` |  |
| rateReference | `ReferenceWithMetaRateObservationBuilder` |  |
| forecastRate | `BigDecimal` |  |
| treatedForecastRate | `BigDecimal` |  |
| meta | `MetaFieldsBuilder` |  |

### Methods

#### Builder Methods

- `RateObservation build()`

#### Setter Methods

- `RateObservationBuilder setResetDate(Date arg0)`
- `RateObservationBuilder setMeta(MetaFields arg0)`
- `RateObservationBuilder setForecastRate(BigDecimal arg0)`
- `RateObservationBuilder setObservedRate(BigDecimal arg0)`
- `RateObservationBuilder setObservationWeight(Integer arg0)`
- `RateObservationBuilder setRateReference(ReferenceWithMetaRateObservation arg0)`
- `RateObservationBuilder setRateReferenceValue(RateObservation arg0)`
- `RateObservationBuilder setAdjustedFixingDate(Date arg0)`
- `RateObservationBuilder setTreatedRate(BigDecimal arg0)`
- `RateObservationBuilder setTreatedForecastRate(BigDecimal arg0)`

#### Getter Methods

- `MetaFieldsBuilder getOrCreateMeta()`
- `Date getResetDate()`
- `MetaFieldsBuilder getMeta()`
- `BigDecimal getForecastRate()`
- `ReferenceWithMetaRateObservationBuilder getRateReference()`
- `BigDecimal getTreatedForecastRate()`
- `Integer getObservationWeight()`
- `Date getAdjustedFixingDate()`
- `ReferenceWithMetaRateObservationBuilder getOrCreateRateReference()`
- `BigDecimal getTreatedRate()`
- `BigDecimal getObservedRate()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `RateObservationBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `RateObservationBuilder prune()`
- `RateObservationBuilder toBuilder()`
- `boolean hasData()`

