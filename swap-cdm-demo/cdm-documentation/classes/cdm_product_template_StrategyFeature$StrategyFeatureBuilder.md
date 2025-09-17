# StrategyFeatureBuilder

**Full Name:** `cdm.product.template.StrategyFeature$StrategyFeatureBuilder`

**Package:** `cdm.product.template`

## Type: Interface

### Implemented Interfaces

- `cdm.product.template.StrategyFeature`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`

### Methods

#### Setter Methods

- `StrategyFeatureBuilder setCalendarSpread(CalendarSpread arg0)`
- `StrategyFeatureBuilder setStrikeSpread(StrikeSpread arg0)`

#### Getter Methods

- `StrikeSpreadBuilder getStrikeSpread()`
- `CalendarSpreadBuilder getCalendarSpread()`
- `StrikeSpreadBuilder getOrCreateStrikeSpread()`
- `CalendarSpreadBuilder getOrCreateCalendarSpread()`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `StrategyFeatureBuilder prune()`

