# BusinessDayAdjustmentsBuilderImpl

**Full Name:** `cdm.base.datetime.BusinessDayAdjustments$BusinessDayAdjustmentsBuilderImpl`

**Package:** `cdm.base.datetime`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.base.datetime.BusinessDayAdjustments$BusinessDayAdjustmentsBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| businessDayConvention | `BusinessDayConventionEnum` |  |
| businessCenters | `BusinessCentersBuilder` |  |
| meta | `MetaFieldsBuilder` |  |

### Methods

#### Builder Methods

- `BusinessDayAdjustments build()`

#### Setter Methods

- `BusinessDayAdjustmentsBuilder setMeta(MetaFields arg0)`
- `BusinessDayAdjustmentsBuilder setBusinessCenters(BusinessCenters arg0)`
- `BusinessDayAdjustmentsBuilder setBusinessDayConvention(BusinessDayConventionEnum arg0)`

#### Getter Methods

- `MetaFieldsBuilder getOrCreateMeta()`
- `MetaFieldsBuilder getMeta()`
- `BusinessCentersBuilder getOrCreateBusinessCenters()`
- `BusinessCentersBuilder getBusinessCenters()`
- `BusinessDayConventionEnum getBusinessDayConvention()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `BusinessDayAdjustmentsBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `BusinessDayAdjustmentsBuilder prune()`
- `BusinessDayAdjustmentsBuilder toBuilder()`
- `boolean hasData()`

