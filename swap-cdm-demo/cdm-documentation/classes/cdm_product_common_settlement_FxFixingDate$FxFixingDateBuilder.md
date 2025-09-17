# FxFixingDateBuilder

**Full Name:** `cdm.product.common.settlement.FxFixingDate$FxFixingDateBuilder`

**Package:** `cdm.product.common.settlement`

## Type: Interface

### Implemented Interfaces

- `cdm.product.common.settlement.FxFixingDate`
- `cdm.base.datetime.Offset$OffsetBuilder`

### Methods

#### Setter Methods

- `FxFixingDateBuilder setMeta(MetaFields arg0)`
- `FxFixingDateBuilder setBusinessCenters(BusinessCenters arg0)`
- `FxFixingDateBuilder setBusinessDayConvention(BusinessDayConventionEnum arg0)`
- `FxFixingDateBuilder setDayType(DayTypeEnum arg0)`
- `FxFixingDateBuilder setFxFixingDate(AdjustableOrRelativeDate arg0)`
- `FxFixingDateBuilder setPeriod(PeriodEnum arg0)`
- `FxFixingDateBuilder setPeriodMultiplier(Integer arg0)`
- `FxFixingDateBuilder setBusinessCentersReference(ReferenceWithMetaBusinessCenters arg0)`
- `FxFixingDateBuilder setBusinessCentersReferenceValue(BusinessCenters arg0)`
- `FxFixingDateBuilder setDateRelativeToPaymentDates(DateRelativeToPaymentDates arg0)`
- `FxFixingDateBuilder setDateRelativeToValuationDates(DateRelativeToValuationDates arg0)`
- `FxFixingDateBuilder setDateRelativeToCalculationPeriodDates(DateRelativeToCalculationPeriodDates arg0)`

#### Getter Methods

- `DateRelativeToCalculationPeriodDatesBuilder getOrCreateDateRelativeToCalculationPeriodDates()`
- `BusinessCentersBuilder getOrCreateBusinessCenters()`
- `BusinessCentersBuilder getBusinessCenters()`
- `AdjustableOrRelativeDateBuilder getOrCreateFxFixingDate()`
- `AdjustableOrRelativeDateBuilder getFxFixingDate()`
- `ReferenceWithMetaBusinessCentersBuilder getOrCreateBusinessCentersReference()`
- `ReferenceWithMetaBusinessCentersBuilder getBusinessCentersReference()`
- `DateRelativeToValuationDatesBuilder getOrCreateDateRelativeToValuationDates()`
- `DateRelativeToPaymentDatesBuilder getDateRelativeToPaymentDates()`
- `DateRelativeToPaymentDatesBuilder getOrCreateDateRelativeToPaymentDates()`
- `DateRelativeToValuationDatesBuilder getDateRelativeToValuationDates()`
- `DateRelativeToCalculationPeriodDatesBuilder getDateRelativeToCalculationPeriodDates()`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `FxFixingDateBuilder prune()`

