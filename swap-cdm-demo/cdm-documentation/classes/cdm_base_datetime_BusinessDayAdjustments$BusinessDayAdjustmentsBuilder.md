# BusinessDayAdjustmentsBuilder

**Full Name:** `cdm.base.datetime.BusinessDayAdjustments$BusinessDayAdjustmentsBuilder`

**Package:** `cdm.base.datetime`

## Type: Interface

### Implemented Interfaces

- `cdm.base.datetime.BusinessDayAdjustments`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`
- `com.rosetta.model.lib.GlobalKey$GlobalKeyBuilder`

### Methods

#### Setter Methods

- `BusinessDayAdjustmentsBuilder setBusinessDayConvention(BusinessDayConventionEnum arg0)`
- `BusinessDayAdjustmentsBuilder setBusinessCenters(BusinessCenters arg0)`
- `BusinessDayAdjustmentsBuilder setMeta(MetaFields arg0)`

#### Getter Methods

- `BusinessCentersBuilder getOrCreateBusinessCenters()`
- `BusinessCentersBuilder getBusinessCenters()`
- `MetaFieldsBuilder getOrCreateMeta()`
- `MetaFieldsBuilder getMeta()`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `BusinessDayAdjustmentsBuilder prune()`

