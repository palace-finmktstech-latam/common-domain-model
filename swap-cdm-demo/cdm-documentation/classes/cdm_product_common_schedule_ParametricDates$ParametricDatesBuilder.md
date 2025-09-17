# ParametricDatesBuilder

**Full Name:** `cdm.product.common.schedule.ParametricDates$ParametricDatesBuilder`

**Package:** `cdm.product.common.schedule`

## Type: Interface

### Implemented Interfaces

- `cdm.product.common.schedule.ParametricDates`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`

### Methods

#### Setter Methods

- `ParametricDatesBuilder setDayOfWeek(List arg0)`
- `ParametricDatesBuilder setDayDistribution(DayDistributionEnum arg0)`
- `ParametricDatesBuilder setDayFrequency(BigDecimal arg0)`
- `ParametricDatesBuilder setBusinessCenters(BusinessCenters arg0)`
- `ParametricDatesBuilder setDayType(DayTypeEnum arg0)`
- `ParametricDatesBuilder setLag(Lag arg0)`

#### Getter Methods

- `LagBuilder getOrCreateLag()`
- `BusinessCentersBuilder getOrCreateBusinessCenters()`
- `BusinessCentersBuilder getBusinessCenters()`
- `LagBuilder getLag()`

#### Adder Methods

- `ParametricDatesBuilder addDayOfWeek(DayOfWeekEnum arg0, int arg1)`
- `ParametricDatesBuilder addDayOfWeek(List arg0)`
- `ParametricDatesBuilder addDayOfWeek(DayOfWeekEnum arg0)`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `ParametricDatesBuilder prune()`

