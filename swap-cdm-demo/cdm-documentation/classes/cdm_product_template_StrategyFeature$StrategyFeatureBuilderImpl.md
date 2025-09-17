# StrategyFeatureBuilderImpl

**Full Name:** `cdm.product.template.StrategyFeature$StrategyFeatureBuilderImpl`

**Package:** `cdm.product.template`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.product.template.StrategyFeature$StrategyFeatureBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| strikeSpread | `StrikeSpreadBuilder` |  |
| calendarSpread | `CalendarSpreadBuilder` |  |

### Methods

#### Builder Methods

- `StrategyFeature build()`

#### Setter Methods

- `StrategyFeatureBuilder setCalendarSpread(CalendarSpread arg0)`
- `StrategyFeatureBuilder setStrikeSpread(StrikeSpread arg0)`

#### Getter Methods

- `StrikeSpreadBuilder getStrikeSpread()`
- `CalendarSpreadBuilder getCalendarSpread()`
- `StrikeSpreadBuilder getOrCreateStrikeSpread()`
- `CalendarSpreadBuilder getOrCreateCalendarSpread()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `StrategyFeatureBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `StrategyFeatureBuilder prune()`
- `StrategyFeatureBuilder toBuilder()`
- `boolean hasData()`

