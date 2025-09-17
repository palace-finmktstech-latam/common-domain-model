# FloatingRateIndexDefinitionBuilderImpl

**Full Name:** `cdm.observable.asset.fro.FloatingRateIndexDefinition$FloatingRateIndexDefinitionBuilderImpl`

**Package:** `cdm.observable.asset.fro`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.observable.asset.fro.FloatingRateIndexDefinition$FloatingRateIndexDefinitionBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| fro | `FloatingRateIndexIdentificationBuilder` |  |
| calculationDefaults | `FloatingRateIndexCalculationDefaultsBuilder` |  |

### Methods

#### Builder Methods

- `FloatingRateIndexDefinition build()`

#### Setter Methods

- `FloatingRateIndexDefinitionBuilder setCalculationDefaults(FloatingRateIndexCalculationDefaults arg0)`
- `FloatingRateIndexDefinitionBuilder setFro(FloatingRateIndexIdentification arg0)`

#### Getter Methods

- `FloatingRateIndexCalculationDefaultsBuilder getCalculationDefaults()`
- `FloatingRateIndexIdentificationBuilder getFro()`
- `FloatingRateIndexIdentificationBuilder getOrCreateFro()`
- `FloatingRateIndexCalculationDefaultsBuilder getOrCreateCalculationDefaults()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `FloatingRateIndexDefinitionBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `FloatingRateIndexDefinitionBuilder prune()`
- `FloatingRateIndexDefinitionBuilder toBuilder()`
- `boolean hasData()`

