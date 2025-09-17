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

- `FxLinkedNotionalScheduleBuilder setFixingTime(BusinessCenterTime arg0)`
- `FxLinkedNotionalScheduleBuilder setFxSpotRateSource(FxSpotRateSource arg0)`
- `FxLinkedNotionalScheduleBuilder setVaryingNotionalCurrency(FieldWithMetaString arg0)`
- `FxLinkedNotionalScheduleBuilder setVaryingNotionalInterimExchangePaymentDates(RelativeDateOffset arg0)`
- `FxLinkedNotionalScheduleBuilder setVaryingNotionalCurrencyValue(String arg0)`
- `FxLinkedNotionalScheduleBuilder setVaryingNotionalFixingDates(RelativeDateOffset arg0)`

#### Getter Methods

- `FxSpotRateSourceBuilder getFxSpotRateSource()`
- `BusinessCenterTimeBuilder getFixingTime()`
- `BusinessCenterTimeBuilder getOrCreateFixingTime()`
- `FxSpotRateSourceBuilder getOrCreateFxSpotRateSource()`
- `FieldWithMetaStringBuilder getVaryingNotionalCurrency()`
- `RelativeDateOffsetBuilder getOrCreateVaryingNotionalInterimExchangePaymentDates()`
- `RelativeDateOffsetBuilder getVaryingNotionalInterimExchangePaymentDates()`
- `FieldWithMetaStringBuilder getOrCreateVaryingNotionalCurrency()`
- `RelativeDateOffsetBuilder getVaryingNotionalFixingDates()`
- `RelativeDateOffsetBuilder getOrCreateVaryingNotionalFixingDates()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `FxLinkedNotionalScheduleBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `FxLinkedNotionalScheduleBuilder prune()`
- `FxLinkedNotionalScheduleBuilder toBuilder()`
- `boolean hasData()`

