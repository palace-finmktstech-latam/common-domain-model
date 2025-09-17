# RateObservation

**Full Name:** `cdm.observable.asset.RateObservation`

**Package:** `cdm.observable.asset`

## Type: Interface

### Implemented Interfaces

- `com.rosetta.model.lib.RosettaModelObject`
- `com.rosetta.model.lib.GlobalKey`

### Methods

#### Builder Methods

- `RateObservation build()`

#### Getter Methods

- `Class getType()`
- `Date getResetDate()`
- `MetaFields getMeta()`
- `BigDecimal getForecastRate()`
- `ReferenceWithMetaRateObservation getRateReference()`
- `BigDecimal getTreatedForecastRate()`
- `Integer getObservationWeight()`
- `Date getAdjustedFixingDate()`
- `BigDecimal getTreatedRate()`
- `BigDecimal getObservedRate()`

#### Other Methods

- `void process(RosettaPath arg0, Processor arg1)`
- `RateObservationBuilder toBuilder()`
- `RosettaMetaData metaData()`

### Annotations

- **RuneDataType**
- **RosettaDataType**

