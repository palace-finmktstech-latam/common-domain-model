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

- `Date getResetDate()`
- `MetaFieldsBuilder getOrCreateMeta()`
- `BigDecimal getForecastRate()`
- `BigDecimal getTreatedRate()`
- `ReferenceWithMetaRateObservationBuilder getRateReference()`
- `BigDecimal getObservedRate()`
- `ReferenceWithMetaRateObservationBuilder getOrCreateRateReference()`
- `Integer getObservationWeight()`
- `Date getAdjustedFixingDate()`
- `BigDecimal getTreatedForecastRate()`
- `MetaFieldsBuilder getMeta()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `RateObservationBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `boolean hasData()`
- `RateObservationBuilder toBuilder()`
- `RateObservationBuilder prune()`

