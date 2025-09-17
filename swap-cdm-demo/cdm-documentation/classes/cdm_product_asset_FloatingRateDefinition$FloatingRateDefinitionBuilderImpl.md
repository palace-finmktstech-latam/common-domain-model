# FloatingRateDefinitionBuilderImpl

**Full Name:** `cdm.product.asset.FloatingRateDefinition$FloatingRateDefinitionBuilderImpl`

**Package:** `cdm.product.asset`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.product.asset.FloatingRateDefinition$FloatingRateDefinitionBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| calculatedRate | `BigDecimal` |  |
| rateObservation | `java.util.List<cdm.observable.asset.RateObservation$RateObservationBuilder>` |  |
| floatingRateMultiplier | `BigDecimal` |  |
| spread | `BigDecimal` |  |
| capRate | `java.util.List<cdm.product.template.Strike$StrikeBuilder>` |  |
| floorRate | `java.util.List<cdm.product.template.Strike$StrikeBuilder>` |  |

### Methods

#### Builder Methods

- `FloatingRateDefinition build()`

#### Setter Methods

- `FloatingRateDefinitionBuilder setCalculatedRate(BigDecimal arg0)`
- `FloatingRateDefinitionBuilder setRateObservation(List arg0)`
- `FloatingRateDefinitionBuilder setFloatingRateMultiplier(BigDecimal arg0)`
- `FloatingRateDefinitionBuilder setFloorRate(List arg0)`
- `FloatingRateDefinitionBuilder setSpread(BigDecimal arg0)`
- `FloatingRateDefinitionBuilder setCapRate(List arg0)`

#### Getter Methods

- `StrikeBuilder getOrCreateFloorRate(int arg0)`
- `BigDecimal getCalculatedRate()`
- `BigDecimal getFloatingRateMultiplier()`
- `List getFloorRate()`
- `List getRateObservation()`
- `RateObservationBuilder getOrCreateRateObservation(int arg0)`
- `StrikeBuilder getOrCreateCapRate(int arg0)`
- `List getCapRate()`
- `BigDecimal getSpread()`

#### Adder Methods

- `FloatingRateDefinitionBuilder addRateObservation(RateObservation arg0, int arg1)`
- `FloatingRateDefinitionBuilder addRateObservation(List arg0)`
- `FloatingRateDefinitionBuilder addRateObservation(RateObservation arg0)`
- `FloatingRateDefinitionBuilder addFloorRate(List arg0)`
- `FloatingRateDefinitionBuilder addFloorRate(Strike arg0, int arg1)`
- `FloatingRateDefinitionBuilder addFloorRate(Strike arg0)`
- `FloatingRateDefinitionBuilder addCapRate(List arg0)`
- `FloatingRateDefinitionBuilder addCapRate(Strike arg0, int arg1)`
- `FloatingRateDefinitionBuilder addCapRate(Strike arg0)`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `FloatingRateDefinitionBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `FloatingRateDefinitionBuilder prune()`
- `FloatingRateDefinitionBuilder toBuilder()`
- `boolean hasData()`

