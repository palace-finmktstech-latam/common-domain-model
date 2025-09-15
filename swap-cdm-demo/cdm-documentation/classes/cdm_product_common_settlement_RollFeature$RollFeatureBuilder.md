# RollFeatureBuilder

**Full Name:** `cdm.product.common.settlement.RollFeature$RollFeatureBuilder`

**Package:** `cdm.product.common.settlement`

## Type: Interface

### Implemented Interfaces

- `cdm.product.common.settlement.RollFeature`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`

### Methods

#### Setter Methods

- `RollFeatureBuilder setRollSourceCalendar(RollSourceCalendarEnum arg0)`
- `RollFeatureBuilder setDeliveryDateRollConvention(Offset arg0)`

#### Getter Methods

- `OffsetBuilder getOrCreateDeliveryDateRollConvention()`
- `OffsetBuilder getDeliveryDateRollConvention()`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `RollFeatureBuilder prune()`

