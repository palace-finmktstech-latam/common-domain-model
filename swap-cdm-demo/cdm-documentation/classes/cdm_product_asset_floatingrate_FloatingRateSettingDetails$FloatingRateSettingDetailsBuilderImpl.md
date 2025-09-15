# FloatingRateSettingDetailsBuilderImpl

**Full Name:** `cdm.product.asset.floatingrate.FloatingRateSettingDetails$FloatingRateSettingDetailsBuilderImpl`

**Package:** `cdm.product.asset.floatingrate`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.product.asset.floatingrate.FloatingRateSettingDetails$FloatingRateSettingDetailsBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| calculationDetails | `CalculatedRateDetailsBuilder` |  |
| observationDate | `Date` |  |
| resetDate | `Date` |  |
| floatingRate | `BigDecimal` |  |

### Methods

#### Builder Methods

- `FloatingRateSettingDetails build()`

#### Setter Methods

- `FloatingRateSettingDetailsBuilder setCalculationDetails(CalculatedRateDetails arg0)`
- `FloatingRateSettingDetailsBuilder setFloatingRate(BigDecimal arg0)`
- `FloatingRateSettingDetailsBuilder setObservationDate(Date arg0)`
- `FloatingRateSettingDetailsBuilder setResetDate(Date arg0)`

#### Getter Methods

- `Date getObservationDate()`
- `BigDecimal getFloatingRate()`
- `CalculatedRateDetailsBuilder getCalculationDetails()`
- `Date getResetDate()`
- `CalculatedRateDetailsBuilder getOrCreateCalculationDetails()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `FloatingRateSettingDetailsBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `boolean hasData()`
- `FloatingRateSettingDetailsBuilder toBuilder()`
- `FloatingRateSettingDetailsBuilder prune()`

