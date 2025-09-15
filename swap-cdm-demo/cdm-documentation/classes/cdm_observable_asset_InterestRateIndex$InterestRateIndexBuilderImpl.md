# InterestRateIndexBuilderImpl

**Full Name:** `cdm.observable.asset.InterestRateIndex$InterestRateIndexBuilderImpl`

**Package:** `cdm.observable.asset`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.observable.asset.InterestRateIndex$InterestRateIndexBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| floatingRateIndex | `FloatingRateIndexBuilder` |  |
| inflationIndex | `InflationIndexBuilder` |  |

### Methods

#### Builder Methods

- `InterestRateIndex build()`

#### Setter Methods

- `InterestRateIndexBuilder setInflationIndex(InflationIndex arg0)`
- `InterestRateIndexBuilder setFloatingRateIndex(FloatingRateIndex arg0)`

#### Getter Methods

- `InflationIndexBuilder getOrCreateInflationIndex()`
- `FloatingRateIndexBuilder getFloatingRateIndex()`
- `InflationIndexBuilder getInflationIndex()`
- `FloatingRateIndexBuilder getOrCreateFloatingRateIndex()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `InterestRateIndexBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `boolean hasData()`
- `InterestRateIndexBuilder toBuilder()`
- `InterestRateIndexBuilder prune()`

