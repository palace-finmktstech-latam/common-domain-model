# FxLinkedNotionalScheduleBuilderImpl

**Full Name:** `cdm.product.common.schedule.FxLinkedNotionalSchedule$FxLinkedNotionalScheduleBuilderImpl`

**Package:** `cdm.product.common.schedule`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.product.common.schedule.FxLinkedNotionalSchedule$FxLinkedNotionalScheduleBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| varyingNotionalCurrency | `FieldWithMetaStringBuilder` |  |
| varyingNotionalFixingDates | `RelativeDateOffsetBuilder` |  |
| fxSpotRateSource | `FxSpotRateSourceBuilder` |  |
| fixingTime | `BusinessCenterTimeBuilder` |  |
| varyingNotionalInterimExchangePaymentDates | `RelativeDateOffsetBuilder` |  |

### Methods

#### Builder Methods

- `FxLinkedNotionalSchedule build()`

#### Setter Methods

- `FxLinkedNotionalScheduleBuilder setVaryingNotionalCurrencyValue(String arg0)`
- `FxLinkedNotionalScheduleBuilder setVaryingNotionalFixingDates(RelativeDateOffset arg0)`
- `FxLinkedNotionalScheduleBuilder setFixingTime(BusinessCenterTime arg0)`
- `FxLinkedNotionalScheduleBuilder setFxSpotRateSource(FxSpotRateSource arg0)`
- `FxLinkedNotionalScheduleBuilder setVaryingNotionalInterimExchangePaymentDates(RelativeDateOffset arg0)`
- `FxLinkedNotionalScheduleBuilder setVaryingNotionalCurrency(FieldWithMetaString arg0)`

#### Getter Methods

- `FxSpotRateSourceBuilder getOrCreateFxSpotRateSource()`
- `FieldWithMetaStringBuilder getOrCreateVaryingNotionalCurrency()`
- `RelativeDateOffsetBuilder getOrCreateVaryingNotionalFixingDates()`
- `RelativeDateOffsetBuilder getVaryingNotionalFixingDates()`
- `FxSpotRateSourceBuilder getFxSpotRateSource()`
- `BusinessCenterTimeBuilder getFixingTime()`
- `BusinessCenterTimeBuilder getOrCreateFixingTime()`
- `RelativeDateOffsetBuilder getOrCreateVaryingNotionalInterimExchangePaymentDates()`
- `RelativeDateOffsetBuilder getVaryingNotionalInterimExchangePaymentDates()`
- `FieldWithMetaStringBuilder getVaryingNotionalCurrency()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `FxLinkedNotionalScheduleBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `boolean hasData()`
- `FxLinkedNotionalScheduleBuilder toBuilder()`
- `FxLinkedNotionalScheduleBuilder prune()`

