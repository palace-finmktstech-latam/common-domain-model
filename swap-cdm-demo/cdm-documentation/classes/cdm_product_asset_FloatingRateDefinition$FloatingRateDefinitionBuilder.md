# FloatingRateDefinitionBuilder

**Full Name:** `cdm.product.asset.FloatingRateDefinition$FloatingRateDefinitionBuilder`

**Package:** `cdm.product.asset`

## Type: Interface

### Implemented Interfaces

- `cdm.product.asset.FloatingRateDefinition`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`

### Methods

#### Setter Methods

- `FloatingRateDefinitionBuilder setCalculatedRate(BigDecimal arg0)`
- `FloatingRateDefinitionBuilder setRateObservation(List arg0)`
- `FloatingRateDefinitionBuilder setFloatingRateMultiplier(BigDecimal arg0)`
- `FloatingRateDefinitionBuilder setFloorRate(List arg0)`
- `FloatingRateDefinitionBuilder setSpread(BigDecimal arg0)`
- `FloatingRateDefinitionBuilder setCapRate(List arg0)`

#### Getter Methods

- `StrikeBuilder getOrCreateFloorRate(int arg0)`
- `List getFloorRate()`
- `List getRateObservation()`
- `RateObservationBuilder getOrCreateRateObservation(int arg0)`
- `StrikeBuilder getOrCreateCapRate(int arg0)`
- `List getCapRate()`

#### Adder Methods

- `FloatingRateDefinitionBuilder addRateObservation(RateObservation arg0)`
- `FloatingRateDefinitionBuilder addRateObservation(RateObservation arg0, int arg1)`
- `FloatingRateDefinitionBuilder addRateObservation(List arg0)`
- `FloatingRateDefinitionBuilder addFloorRate(List arg0)`
- `FloatingRateDefinitionBuilder addFloorRate(Strike arg0)`
- `FloatingRateDefinitionBuilder addFloorRate(Strike arg0, int arg1)`
- `FloatingRateDefinitionBuilder addCapRate(Strike arg0)`
- `FloatingRateDefinitionBuilder addCapRate(List arg0)`
- `FloatingRateDefinitionBuilder addCapRate(Strike arg0, int arg1)`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `FloatingRateDefinitionBuilder prune()`

