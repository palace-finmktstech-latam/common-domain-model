# CommoditySchedulesMappingProcessor

**Full Name:** `cdm.observable.asset.processor.CommoditySchedulesMappingProcessor`

**Package:** `cdm.observable.asset.processor`

## Type: Concrete Class

### Inheritance

**Extends:**
- `com.regnosys.rosetta.common.translation.MappingProcessor`

### Methods

#### Setter Methods

- `void setDatedValue(List arg0, int arg1, LocalDate arg2)`

#### Getter Methods

- `LocalDate getNextPeriodStartDate(PeriodEnum arg0, LocalDate arg1, int arg2, boolean arg3)`

#### Other Methods

- `void map(Path arg0, List arg1, RosettaModelObjectBuilder arg2)`
- `List findMappings(Path arg0, String arg1, String arg2)`
- `void mapCalculationPeriodsSchedule(List arg0, LocalDate arg1, LocalDate arg2, Path arg3)`
- `void mapCalculationPeriods(List arg0, LocalDate arg1, Path arg2)`
- `Optional findMapping(String arg0, String arg1)`
- `Optional findMapping(Path arg0, String arg1, int arg2)`
- `PeriodEnum extractPeriodEnum(Mapping arg0)`
- `LocalDate extractLocalDate(Path arg0, String arg1)`
- `LocalDate parseLocalDate(Object arg0)`
- `PeriodEnum parsePeriodEnum(String arg0)`
- `Boolean extractBoolean(Mapping arg0)`
- `Integer extractInteger(Mapping arg0)`

