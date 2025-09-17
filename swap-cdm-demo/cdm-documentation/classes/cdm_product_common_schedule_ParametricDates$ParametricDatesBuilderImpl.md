# ParametricDatesBuilderImpl

**Full Name:** `cdm.product.common.schedule.ParametricDates$ParametricDatesBuilderImpl`

**Package:** `cdm.product.common.schedule`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.product.common.schedule.ParametricDates$ParametricDatesBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| dayType | `DayTypeEnum` |  |
| dayDistribution | `DayDistributionEnum` |  |
| dayOfWeek | `java.util.List<cdm.base.datetime.DayOfWeekEnum>` |  |
| dayFrequency | `BigDecimal` |  |
| lag | `LagBuilder` |  |
| businessCenters | `BusinessCentersBuilder` |  |

### Methods

#### Builder Methods

- `ParametricDates build()`

#### Setter Methods

- `ParametricDatesBuilder setDayOfWeek(List arg0)`
- `ParametricDatesBuilder setDayDistribution(DayDistributionEnum arg0)`
- `ParametricDatesBuilder setDayFrequency(BigDecimal arg0)`
- `ParametricDatesBuilder setBusinessCenters(BusinessCenters arg0)`
- `ParametricDatesBuilder setDayType(DayTypeEnum arg0)`
- `ParametricDatesBuilder setLag(Lag arg0)`

#### Getter Methods

- `List getDayOfWeek()`
- `LagBuilder getOrCreateLag()`
- `BigDecimal getDayFrequency()`
- `DayDistributionEnum getDayDistribution()`
- `BusinessCentersBuilder getOrCreateBusinessCenters()`
- `BusinessCentersBuilder getBusinessCenters()`
- `DayTypeEnum getDayType()`
- `LagBuilder getLag()`

#### Adder Methods

- `ParametricDatesBuilder addDayOfWeek(List arg0)`
- `ParametricDatesBuilder addDayOfWeek(DayOfWeekEnum arg0, int arg1)`
- `ParametricDatesBuilder addDayOfWeek(DayOfWeekEnum arg0)`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `ParametricDatesBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `ParametricDatesBuilder prune()`
- `ParametricDatesBuilder toBuilder()`
- `boolean hasData()`

