# Package: cdm.base.datetime.functions

## Abstract Classes

### AddBusinessDays
**Implements:** `RosettaFunction` 

**Fields:**
- `AddBusinessDays addBusinessDays`
- `AddDays addDays`
- `IsBusinessDay isBusinessDay`

**Key Methods:**
- `isGoodBusinessDay(Date arg0, Integer arg1, List arg2)` → `MapperS` [Getter]
- `isShiftedGood(Date arg0, Integer arg1, List arg2)` → `MapperS` [Getter]

### AddDays
**Implements:** `RosettaFunction` 

### AppendDateToList
**Implements:** `RosettaFunction` 

### BusinessCenterHolidays
**Implements:** `RosettaFunction` 

### BusinessCenterHolidaysMultiple
**Implements:** `RosettaFunction` 

**Fields:**
- `BusinessCenterHolidays businessCenterHolidays`

### ConvertToAdjustableOrAdjustedOrRelativeDate
**Implements:** `RosettaFunction` 

**Fields:**
- `ModelObjectValidator objectValidator`

### ConvertToAdjustableOrRelativeDate
**Implements:** `RosettaFunction` 

**Fields:**
- `ModelObjectValidator objectValidator`

### DateDifference
**Implements:** `RosettaFunction` 

### DayOfWeek
**Implements:** `RosettaFunction` 

### GenerateDateList
**Implements:** `RosettaFunction` 

**Fields:**
- `AddBusinessDays addBusinessDays`
- `AppendDateToList appendDateToList`
- `GenerateDateList generateDateList`
- `IsBusinessDay isBusinessDay`

**Key Methods:**
- `isGoodBusinessDay(Date arg0, Date arg1, List arg2)` → `MapperS` [Getter]

### GetAllBusinessCenters
**Implements:** `RosettaFunction` 

**Fields:**
- `GetAllBusinessCenters getAllBusinessCenters`

### IsBusinessDay
**Implements:** `RosettaFunction` 

**Fields:**
- `IsHoliday isHoliday`
- `IsWeekend isWeekend`

### IsHoliday
**Implements:** `RosettaFunction` 

**Fields:**
- `BusinessCenterHolidaysMultiple businessCenterHolidaysMultiple`

### IsWeekend
**Implements:** `RosettaFunction` 

**Fields:**
- `DayOfWeek dayOfWeek0`

### LeapYearDateDifference
**Implements:** `RosettaFunction` 

### Now
**Implements:** `RosettaFunction` 

### PopOffDateList
**Implements:** `RosettaFunction` 

### ResolveAdjustableDate
**Implements:** `RosettaFunction` 

### ResolveAdjustableDates
**Implements:** `RosettaFunction` 

### TimeZoneFromBusinessCenterTime
**Implements:** `RosettaFunction` 

**Fields:**
- `ModelObjectValidator objectValidator`

### ToDateTime
**Implements:** `RosettaFunction` 

**Fields:**
- `ToTime toTime`

### ToTime
**Implements:** `RosettaFunction` 

### Today
**Implements:** `RosettaFunction` 

## Concrete Classes

### AddBusinessDaysDefault
**Extends:** `AddBusinessDays` 

**Key Methods:**
- `isGoodBusinessDay(Date arg0, Integer arg1, List arg2)` → `MapperS` [Getter]
- `isShiftedGood(Date arg0, Integer arg1, List arg2)` → `MapperS` [Getter]

### AddDaysDefault
**Extends:** `AddDays` 

### AddDaysImpl
**Extends:** `AddDays` 

**Fields:**
- `AddDays func`

### AppendDateToListDefault
**Extends:** `AppendDateToList` 

### BusinessCenterHolidaysDefault
**Extends:** `BusinessCenterHolidays` 

### BusinessCenterHolidaysEmptyDataProvider
**Extends:** `BusinessCenterHolidays` 

### BusinessCenterHolidaysMultipleDefault
**Extends:** `BusinessCenterHolidaysMultiple` 

### ConvertToAdjustableOrAdjustedOrRelativeDateDefault
**Extends:** `ConvertToAdjustableOrAdjustedOrRelativeDate` 

### ConvertToAdjustableOrRelativeDateDefault
**Extends:** `ConvertToAdjustableOrRelativeDate` 

### DateDifferenceDefault
**Extends:** `DateDifference` 

### DateDifferenceImpl
**Extends:** `DateDifference` 

### DayOfWeekDefault
**Extends:** `DayOfWeek` 

### DayOfWeekImpl
**Extends:** `DayOfWeek` 

### GenerateDateListDefault
**Extends:** `GenerateDateList` 

**Key Methods:**
- `isGoodBusinessDay(Date arg0, Date arg1, List arg2)` → `MapperS` [Getter]

### GetAllBusinessCentersDefault
**Extends:** `GetAllBusinessCenters` 

### IsBusinessDayDefault
**Extends:** `IsBusinessDay` 

### IsHolidayDefault
**Extends:** `IsHoliday` 

### IsWeekendDefault
**Extends:** `IsWeekend` 

### LeapYearDateDifferenceDefault
**Extends:** `LeapYearDateDifference` 

### LeapYearDateDifferenceImpl
**Extends:** `LeapYearDateDifference` 

### NowDefault
**Extends:** `Now` 

### NowImpl
**Extends:** `Now` 

### PopOffDateListDefault
**Extends:** `PopOffDateList` 

### PopOffDateListImpl
**Extends:** `PopOffDateList` 

### ResolveAdjustableDateDefault
**Extends:** `ResolveAdjustableDate` 

### ResolveAdjustableDateImpl
**Extends:** `ResolveAdjustableDate` 

### ResolveAdjustableDatesDefault
**Extends:** `ResolveAdjustableDates` 

### ResolveAdjustableDatesImpl
**Extends:** `ResolveAdjustableDates` 

### TimeZoneFromBusinessCenterTimeDefault
**Extends:** `TimeZoneFromBusinessCenterTime` 

### ToDateTimeDefault
**Extends:** `ToDateTime` 

### ToTimeDefault
**Extends:** `ToTime` 

### ToTimeImpl
**Extends:** `ToTime` 

### TodayDefault
**Extends:** `Today` 

### TodayImpl
**Extends:** `Today` 

