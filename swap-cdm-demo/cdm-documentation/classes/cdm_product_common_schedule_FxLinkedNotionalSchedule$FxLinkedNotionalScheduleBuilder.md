# FxLinkedNotionalScheduleBuilder

**Full Name:** `cdm.product.common.schedule.FxLinkedNotionalSchedule$FxLinkedNotionalScheduleBuilder`

**Package:** `cdm.product.common.schedule`

## Type: Interface

### Implemented Interfaces

- `cdm.product.common.schedule.FxLinkedNotionalSchedule`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`

### Methods

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

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `FxLinkedNotionalScheduleBuilder prune()`

