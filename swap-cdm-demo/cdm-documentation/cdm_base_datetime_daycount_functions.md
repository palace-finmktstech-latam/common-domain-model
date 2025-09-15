# Package: cdm.base.datetime.daycount.functions

## Abstract Classes

### DayCountBasisACT_360
**Implements:** `RosettaFunction` 

### DayCountBasisACT_365L
**Implements:** `RosettaFunction` 

### DayCountBasisACT_365_FIXED
**Implements:** `RosettaFunction` 

### DayCountBasisACT_ACT_AFB
**Implements:** `RosettaFunction` 

### DayCountBasisACT_ACT_ICMA
**Implements:** `RosettaFunction` 

### DayCountBasisACT_ACT_ISDA
**Implements:** `RosettaFunction` 

### DayCountBasisCAL_252
**Implements:** `RosettaFunction` 

### DayCountBasis_30E_360
**Implements:** `RosettaFunction` 

### DayCountBasis_30_360
**Implements:** `RosettaFunction` 

### YearFractionACT_360
**Implements:** `RosettaFunction` 

**Fields:**
- `DateDifference dateDifference`

### YearFractionACT_364
**Implements:** `RosettaFunction` 

**Fields:**
- `DateDifference dateDifference`

### YearFractionACT_365L
**Implements:** `RosettaFunction` 

**Fields:**
- `DateDifference dateDifference`

### YearFractionACT_365_FIXED
**Implements:** `RosettaFunction` 

**Fields:**
- `DateDifference dateDifference`

### YearFractionACT_ACT_ICMA
**Implements:** `RosettaFunction` 

**Fields:**
- `DateDifference dateDifference`

### YearFractionACT_ACT_ISDA
**Implements:** `RosettaFunction` 

**Fields:**
- `DateDifference dateDifference`
- `LeapYearDateDifference leapYearDateDifference`

### YearFractionCAL_252
**Implements:** `RosettaFunction` 

**Fields:**
- `DateDifference dateDifference`

### YearFractionForOneDay
**Implements:** `RosettaFunction` 

**Fields:**
- `DayCountBasis dayCountBasis`

### YearFraction_1_1
**Implements:** `RosettaFunction` 

### YearFraction_30E_360
**Implements:** `RosettaFunction` 

### YearFraction_30E_360_ISDA
**Implements:** `RosettaFunction` 

### YearFraction_30_360
**Implements:** `RosettaFunction` 

## Concrete Classes

### 

### 

### DayCountBasis
**Implements:** `RosettaFunction` 

**Fields:**
- `DayCountBasisACT_360 dayCountBasisACT_360`
- `DayCountBasis_30_360 dayCountBasis_30_360`
- `DayCountBasis_30E_360 dayCountBasis_30E_360`
- `DayCountBasisACT_365L dayCountBasisACT_365L`
- `DayCountBasisACT_365_FIXED dayCountBasisACT_365_FIXED`
- `DayCountBasisACT_ACT_AFB dayCountBasisACT_ACT_AFB`
- `DayCountBasisACT_ACT_ISDA dayCountBasisACT_ACT_ISDA`
- `DayCountBasisACT_ACT_ICMA dayCountBasisACT_ACT_ICMA`
- `DayCountBasisCAL_252 dayCountBasisCAL_252`

### DayCountBasisACT_360Default
**Extends:** `DayCountBasis$DayCountBasisACT_360` 

### DayCountBasisACT_365LDefault
**Extends:** `DayCountBasis$DayCountBasisACT_365L` 

### DayCountBasisACT_365_FIXEDDefault
**Extends:** `DayCountBasis$DayCountBasisACT_365_FIXED` 

### DayCountBasisACT_ACT_AFBDefault
**Extends:** `DayCountBasis$DayCountBasisACT_ACT_AFB` 

### DayCountBasisACT_ACT_ICMADefault
**Extends:** `DayCountBasis$DayCountBasisACT_ACT_ICMA` 

### DayCountBasisACT_ACT_ISDADefault
**Extends:** `DayCountBasis$DayCountBasisACT_ACT_ISDA` 

### DayCountBasisCAL_252Default
**Extends:** `DayCountBasis$DayCountBasisCAL_252` 

### DayCountBasis_30E_360Default
**Extends:** `DayCountBasis$DayCountBasis_30E_360` 

### DayCountBasis_30_360Default
**Extends:** `DayCountBasis$DayCountBasis_30_360` 

### YearFraction
**Implements:** `RosettaFunction` 

**Fields:**
- `YearFraction_1_1 yearFraction_1_1`
- `YearFractionACT_ACT_ISDA yearFractionACT_ACT_ISDA`
- `YearFractionACT_ACT_ICMA yearFractionACT_ACT_ICMA`
- `YearFractionACT_365_FIXED yearFractionACT_365_FIXED`
- `YearFractionACT_360 yearFractionACT_360`
- `YearFraction_30_360 yearFraction_30_360`
- `YearFraction_30E_360 yearFraction_30E_360`
- `YearFraction_30E_360_ISDA yearFraction_30E_360_ISDA`
- `YearFractionACT_364 yearFractionACT_364`
- `YearFractionACT_365L yearFractionACT_365L`
- `YearFractionCAL_252 yearFractionCAL_252`

### YearFractionACT_360Default
**Extends:** `YearFraction$YearFractionACT_360` 

### YearFractionACT_364Default
**Extends:** `YearFraction$YearFractionACT_364` 

### YearFractionACT_365LDefault
**Extends:** `YearFraction$YearFractionACT_365L` 

### YearFractionACT_365_FIXEDDefault
**Extends:** `YearFraction$YearFractionACT_365_FIXED` 

### YearFractionACT_ACT_ICMADefault
**Extends:** `YearFraction$YearFractionACT_ACT_ICMA` 

### YearFractionACT_ACT_ISDADefault
**Extends:** `YearFraction$YearFractionACT_ACT_ISDA` 

### YearFractionCAL_252Default
**Extends:** `YearFraction$YearFractionCAL_252` 

### YearFractionForOneDayDefault
**Extends:** `YearFractionForOneDay` 

### YearFraction_1_1Default
**Extends:** `YearFraction$YearFraction_1_1` 

### YearFraction_30E_360Default
**Extends:** `YearFraction$YearFraction_30E_360` 

### YearFraction_30E_360_ISDADefault
**Extends:** `YearFraction$YearFraction_30E_360_ISDA` 

### YearFraction_30_360Default
**Extends:** `YearFraction$YearFraction_30_360` 

