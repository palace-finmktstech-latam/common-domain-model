# CalculatedRateDetailsBuilderImpl

**Full Name:** `cdm.observable.asset.calculatedrate.CalculatedRateDetails$CalculatedRateDetailsBuilderImpl`

**Package:** `cdm.observable.asset.calculatedrate`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.observable.asset.calculatedrate.CalculatedRateDetails$CalculatedRateDetailsBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| observations | `CalculatedRateObservationsBuilder` |  |
| weightedRates | `java.util.List<java.math.BigDecimal>` |  |
| growthFactor | `java.util.List<java.math.BigDecimal>` |  |
| compoundedGrowth | `java.util.List<java.math.BigDecimal>` |  |
| aggregateValue | `BigDecimal` |  |
| aggregateWeight | `BigDecimal` |  |
| calculatedRate | `BigDecimal` |  |

### Methods

#### Builder Methods

- `CalculatedRateDetails build()`

#### Setter Methods

- `CalculatedRateDetailsBuilder setCalculatedRate(BigDecimal arg0)`
- `CalculatedRateDetailsBuilder setObservations(CalculatedRateObservations arg0)`
- `CalculatedRateDetailsBuilder setAggregateValue(BigDecimal arg0)`
- `CalculatedRateDetailsBuilder setAggregateWeight(BigDecimal arg0)`
- `CalculatedRateDetailsBuilder setGrowthFactor(List arg0)`
- `CalculatedRateDetailsBuilder setCompoundedGrowth(List arg0)`
- `CalculatedRateDetailsBuilder setWeightedRates(List arg0)`

#### Getter Methods

- `BigDecimal getAggregateValue()`
- `CalculatedRateObservationsBuilder getObservations()`
- `BigDecimal getCalculatedRate()`
- `CalculatedRateObservationsBuilder getOrCreateObservations()`
- `List getWeightedRates()`
- `List getCompoundedGrowth()`
- `List getGrowthFactor()`
- `BigDecimal getAggregateWeight()`

#### Adder Methods

- `CalculatedRateDetailsBuilder addGrowthFactor(BigDecimal arg0)`
- `CalculatedRateDetailsBuilder addGrowthFactor(List arg0)`
- `CalculatedRateDetailsBuilder addGrowthFactor(BigDecimal arg0, int arg1)`
- `CalculatedRateDetailsBuilder addCompoundedGrowth(BigDecimal arg0, int arg1)`
- `CalculatedRateDetailsBuilder addCompoundedGrowth(BigDecimal arg0)`
- `CalculatedRateDetailsBuilder addCompoundedGrowth(List arg0)`
- `CalculatedRateDetailsBuilder addWeightedRates(List arg0)`
- `CalculatedRateDetailsBuilder addWeightedRates(BigDecimal arg0, int arg1)`
- `CalculatedRateDetailsBuilder addWeightedRates(BigDecimal arg0)`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `CalculatedRateDetailsBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `boolean hasData()`
- `CalculatedRateDetailsBuilder toBuilder()`
- `CalculatedRateDetailsBuilder prune()`

