# QuantoBuilderImpl

**Full Name:** `cdm.product.template.Quanto$QuantoBuilderImpl`

**Package:** `cdm.product.template`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.product.template.Quanto$QuantoBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| fxRate | `java.util.List<cdm.observable.asset.FxRate$FxRateBuilder>` |  |
| fxSpotRateSource | `FxSpotRateSourceBuilder` |  |
| fixingTime | `BusinessCenterTimeBuilder` |  |

### Methods

#### Builder Methods

- `Quanto build()`

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

- `QuantoBuilder addFxRate(FxRate arg0)`
- `QuantoBuilder addFxRate(List arg0)`
- `QuantoBuilder addFxRate(FxRate arg0, int arg1)`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `QuantoBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `boolean hasData()`
- `QuantoBuilder toBuilder()`
- `QuantoBuilder prune()`

