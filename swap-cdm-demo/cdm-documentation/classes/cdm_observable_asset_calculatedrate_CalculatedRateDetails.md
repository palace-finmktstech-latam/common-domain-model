# CalculatedRateDetails

**Full Name:** `cdm.observable.asset.calculatedrate.CalculatedRateDetails`

**Package:** `cdm.observable.asset.calculatedrate`

## Type: Interface

### Implemented Interfaces

- `com.rosetta.model.lib.RosettaModelObject`

### Methods

#### Builder Methods

- `CalculatedRateDetails build()`

#### Getter Methods

- `Class getType()`
- `BigDecimal getAggregateValue()`
- `CalculatedRateObservations getObservations()`
- `BigDecimal getCalculatedRate()`
- `List getWeightedRates()`
- `List getCompoundedGrowth()`
- `List getGrowthFactor()`
- `BigDecimal getAggregateWeight()`

#### Other Methods

- `void process(RosettaPath arg0, Processor arg1)`
- `CalculatedRateDetailsBuilder toBuilder()`
- `RosettaMetaData metaData()`

### Annotations

- **RuneDataType**
- **RosettaDataType**

