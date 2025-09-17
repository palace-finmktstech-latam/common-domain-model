# FxFixingDateBuilderImpl

**Full Name:** `cdm.product.common.settlement.FxFixingDate$FxFixingDateBuilderImpl`

**Package:** `cdm.product.common.settlement`

## Type: Concrete Class

### Inheritance

**Extends:**
- `cdm.base.datetime.Offset$OffsetBuilderImpl`

### Implemented Interfaces

- `cdm.product.common.settlement.FxFixingDate$FxFixingDateBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| businessDayConvention | `BusinessDayConventionEnum` |  |
| businessCenters | `BusinessCentersBuilder` |  |
| businessCentersReference | `ReferenceWithMetaBusinessCentersBuilder` |  |
| dateRelativeToPaymentDates | `DateRelativeToPaymentDatesBuilder` |  |
| dateRelativeToCalculationPeriodDates | `DateRelativeToCalculationPeriodDatesBuilder` |  |
| dateRelativeToValuationDates | `DateRelativeToValuationDatesBuilder` |  |
| fxFixingDate | `AdjustableOrRelativeDateBuilder` |  |

### Methods

#### Builder Methods

- `FxFixingDate build()`

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
- `BusinessDayConventionEnum getBusinessDayConvention()`
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

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `FxFixingDateBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `FxFixingDateBuilder prune()`
- `FxFixingDateBuilder toBuilder()`
- `boolean hasData()`

