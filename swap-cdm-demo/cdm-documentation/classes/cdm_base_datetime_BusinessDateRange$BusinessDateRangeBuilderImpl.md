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

- `BusinessDateRangeBuilder setStartDate(Date arg0)`
- `BusinessDateRangeBuilder setEndDate(Date arg0)`
- `BusinessDateRangeBuilder setBusinessDayConvention(BusinessDayConventionEnum arg0)`
- `BusinessDateRangeBuilder setBusinessCenters(BusinessCenters arg0)`

#### Getter Methods

- `BusinessDayConventionEnum getBusinessDayConvention()`
- `BusinessCentersBuilder getOrCreateBusinessCenters()`
- `BusinessCentersBuilder getBusinessCenters()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `BusinessDateRangeBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `boolean hasData()`
- `BusinessDateRangeBuilder toBuilder()`
- `BusinessDateRangeBuilder prune()`

