# BusinessDateRangeBuilderImpl

**Full Name:** `cdm.base.datetime.BusinessDateRange$BusinessDateRangeBuilderImpl`

**Package:** `cdm.base.datetime`

## Type: Concrete Class

### Inheritance

**Extends:**
- `cdm.base.datetime.DateRange$DateRangeBuilderImpl`

### Implemented Interfaces

- `cdm.base.datetime.BusinessDateRange$BusinessDateRangeBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| businessDayConvention | `BusinessDayConventionEnum` |  |
| businessCenters | `BusinessCentersBuilder` |  |

### Methods

#### Builder Methods

- `BusinessDateRange build()`

#### Setter Methods

- `BusinessDateRangeBuilder setBusinessCenters(BusinessCenters arg0)`
- `BusinessDateRangeBuilder setBusinessDayConvention(BusinessDayConventionEnum arg0)`
- `BusinessDateRangeBuilder setEndDate(Date arg0)`
- `BusinessDateRangeBuilder setStartDate(Date arg0)`

#### Getter Methods

- `BusinessCentersBuilder getOrCreateBusinessCenters()`
- `BusinessCentersBuilder getBusinessCenters()`
- `BusinessDayConventionEnum getBusinessDayConvention()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `BusinessDateRangeBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `BusinessDateRangeBuilder prune()`
- `BusinessDateRangeBuilder toBuilder()`
- `boolean hasData()`

