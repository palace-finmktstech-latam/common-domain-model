# QuantoBuilder

**Full Name:** `cdm.product.template.Quanto$QuantoBuilder`

**Package:** `cdm.product.template`

## Type: Interface

### Implemented Interfaces

- `cdm.product.template.Quanto`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`

### Methods

#### Setter Methods

- `QuantoBuilder setFixingTime(BusinessCenterTime arg0)`
- `QuantoBuilder setFxSpotRateSource(FxSpotRateSource arg0)`
- `QuantoBuilder setFxRate(List arg0)`

#### Getter Methods

- `FxSpotRateSourceBuilder getFxSpotRateSource()`
- `BusinessCenterTimeBuilder getFixingTime()`
- `FxRateBuilder getOrCreateFxRate(int arg0)`
- `BusinessCenterTimeBuilder getOrCreateFixingTime()`
- `FxSpotRateSourceBuilder getOrCreateFxSpotRateSource()`
- `List getFxRate()`

#### Adder Methods

- `QuantoBuilder addFxRate(List arg0)`
- `QuantoBuilder addFxRate(FxRate arg0)`
- `QuantoBuilder addFxRate(FxRate arg0, int arg1)`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `QuantoBuilder prune()`

