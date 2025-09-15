# FxFixingDateBuilder

**Full Name:** `cdm.product.common.settlement.FxFixingDate$FxFixingDateBuilder`

**Package:** `cdm.product.common.settlement`

## Type: Interface

### Implemented Interfaces

- `cdm.product.common.settlement.FxFixingDate`
- `cdm.base.datetime.Offset$OffsetBuilder`

### Methods

#### Setter Methods

- `FxFixingDateBuilder setBusinessDayConvention(BusinessDayConventionEnum arg0)`
- `FxFixingDateBuilder setBusinessCenters(BusinessCenters arg0)`
- `FxFixingDateBuilder setDayType(DayTypeEnum arg0)`
- `FxFixingDateBuilder setFxFixingDate(AdjustableOrRelativeDate arg0)`
- `FxFixingDateBuilder setDateRelativeToPaymentDates(DateRelativeToPaymentDates arg0)`
- `FxFixingDateBuilder setDateRelativeToValuationDates(DateRelativeToValuationDates arg0)`
- `FxFixingDateBuilder setDateRelativeToCalculationPeriodDates(DateRelativeToCalculationPeriodDates arg0)`
- `FxFixingDateBuilder setPeriod(PeriodEnum arg0)`
- `FxFixingDateBuilder setPeriodMultiplier(Integer arg0)`
- `FxFixingDateBuilder setBusinessCentersReferenceValue(BusinessCenters arg0)`
- `FxFixingDateBuilder setBusinessCentersReference(ReferenceWithMetaBusinessCenters arg0)`
- `FxFixingDateBuilder setMeta(MetaFields arg0)`

#### Getter Methods

- `BusinessCentersBuilder getOrCreateBusinessCenters()`
- `BusinessCentersBuilder getBusinessCenters()`
- `AdjustableOrRelativeDateBuilder getFxFixingDate()`
- `AdjustableOrRelativeDateBuilder getOrCreateFxFixingDate()`
- `DateRelativeToPaymentDatesBuilder getOrCreateDateRelativeToPaymentDates()`
- `DateRelativeToValuationDatesBuilder getDateRelativeToValuationDates()`
- `DateRelativeToPaymentDatesBuilder getDateRelativeToPaymentDates()`
- `DateRelativeToValuationDatesBuilder getOrCreateDateRelativeToValuationDates()`
- `DateRelativeToCalculationPeriodDatesBuilder getDateRelativeToCalculationPeriodDates()`
- `DateRelativeToCalculationPeriodDatesBuilder getOrCreateDateRelativeToCalculationPeriodDates()`
- `ReferenceWithMetaBusinessCentersBuilder getBusinessCentersReference()`
- `ReferenceWithMetaBusinessCentersBuilder getOrCreateBusinessCentersReference()`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `FxFixingDateBuilder prune()`

