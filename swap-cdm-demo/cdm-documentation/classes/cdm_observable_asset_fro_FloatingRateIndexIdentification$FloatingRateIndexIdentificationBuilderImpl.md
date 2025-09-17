# FloatingRateIndexIdentificationBuilderImpl

**Full Name:** `cdm.observable.asset.fro.FloatingRateIndexIdentification$FloatingRateIndexIdentificationBuilderImpl`

**Package:** `cdm.observable.asset.fro`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.observable.asset.fro.FloatingRateIndexIdentification$FloatingRateIndexIdentificationBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| floatingRateIndex | `FieldWithMetaFloatingRateIndexEnumBuilder` |  |
| currency | `ISOCurrencyCodeEnum` |  |
| froType | `String` |  |

### Methods

#### Builder Methods

- `FloatingRateIndexIdentification build()`

#### Setter Methods

- `FloatingRateIndexIdentificationBuilder setCurrency(ISOCurrencyCodeEnum arg0)`
- `FloatingRateIndexIdentificationBuilder setFloatingRateIndexValue(FloatingRateIndexEnum arg0)`
- `FloatingRateIndexIdentificationBuilder setFloatingRateIndex(FieldWithMetaFloatingRateIndexEnum arg0)`
- `FloatingRateIndexIdentificationBuilder setFroType(String arg0)`

#### Getter Methods

- `ISOCurrencyCodeEnum getCurrency()`
- `FieldWithMetaFloatingRateIndexEnumBuilder getFloatingRateIndex()`
- `FieldWithMetaFloatingRateIndexEnumBuilder getOrCreateFloatingRateIndex()`
- `String getFroType()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `FloatingRateIndexIdentificationBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `FloatingRateIndexIdentificationBuilder prune()`
- `FloatingRateIndexIdentificationBuilder toBuilder()`
- `boolean hasData()`

