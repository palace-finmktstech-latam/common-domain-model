# BusinessDateRangeBuilder

**Full Name:** `cdm.base.datetime.BusinessDateRange$BusinessDateRangeBuilder`

**Package:** `cdm.base.datetime`

## Type: Interface

### Implemented Interfaces

- `cdm.base.datetime.BusinessDateRange`
- `cdm.base.datetime.DateRange$DateRangeBuilder`

### Methods

#### Setter Methods

- `BusinessDateRangeBuilder setBusinessCenters(BusinessCenters arg0)`
- `BusinessDateRangeBuilder setBusinessDayConvention(BusinessDayConventionEnum arg0)`
- `BusinessDateRangeBuilder setEndDate(Date arg0)`
- `BusinessDateRangeBuilder setStartDate(Date arg0)`

#### Getter Methods

- `BusinessCentersBuilder getOrCreateBusinessCenters()`
- `BusinessCentersBuilder getBusinessCenters()`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `BusinessDateRangeBuilder prune()`

