# CompositeBuilderImpl

**Full Name:** `cdm.product.template.Composite$CompositeBuilderImpl`

**Package:** `cdm.product.template`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.product.template.Composite$CompositeBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| determinationMethod | `DeterminationMethodEnum` |  |
| relativeDate | `RelativeDateOffsetBuilder` |  |
| fxSpotRateSource | `FxSpotRateSourceBuilder` |  |
| fixingTime | `BusinessCenterTimeBuilder` |  |

### Methods

#### Builder Methods

- `Composite build()`

#### Setter Methods

- `CompositeBuilder setDeterminationMethod(DeterminationMethodEnum arg0)`
- `CompositeBuilder setRelativeDate(RelativeDateOffset arg0)`
- `CompositeBuilder setFixingTime(BusinessCenterTime arg0)`
- `CompositeBuilder setFxSpotRateSource(FxSpotRateSource arg0)`

#### Getter Methods

- `FxSpotRateSourceBuilder getOrCreateFxSpotRateSource()`
- `DeterminationMethodEnum getDeterminationMethod()`
- `RelativeDateOffsetBuilder getOrCreateRelativeDate()`
- `RelativeDateOffsetBuilder getRelativeDate()`
- `FxSpotRateSourceBuilder getFxSpotRateSource()`
- `BusinessCenterTimeBuilder getFixingTime()`
- `BusinessCenterTimeBuilder getOrCreateFixingTime()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `CompositeBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `boolean hasData()`
- `CompositeBuilder toBuilder()`
- `CompositeBuilder prune()`

