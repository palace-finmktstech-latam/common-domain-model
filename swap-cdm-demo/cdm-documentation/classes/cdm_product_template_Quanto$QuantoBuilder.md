# QuantoBuilder

**Full Name:** `cdm.product.template.Quanto$QuantoBuilder`

**Package:** `cdm.product.template`

## Type: Interface

### Implemented Interfaces

- `cdm.product.template.Quanto`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`

### Methods

#### Setter Methods

- `QuantoBuilder setFxRate(List arg0)`
- `QuantoBuilder setFixingTime(BusinessCenterTime arg0)`
- `QuantoBuilder setFxSpotRateSource(FxSpotRateSource arg0)`

#### Getter Methods

- `FxSpotRateSourceBuilder getOrCreateFxSpotRateSource()`
- `List getFxRate()`
- `FxSpotRateSourceBuilder getFxSpotRateSource()`
- `BusinessCenterTimeBuilder getFixingTime()`
- `FxRateBuilder getOrCreateFxRate(int arg0)`
- `BusinessCenterTimeBuilder getOrCreateFixingTime()`

#### Adder Methods

- `QuantoBuilder addFxRate(FxRate arg0, int arg1)`
- `QuantoBuilder addFxRate(FxRate arg0)`
- `QuantoBuilder addFxRate(List arg0)`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `QuantoBuilder prune()`

