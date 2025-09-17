# EvergreenProvisionBuilderImpl

**Full Name:** `cdm.product.template.EvergreenProvision$EvergreenProvisionBuilderImpl`

**Package:** `cdm.product.template`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.product.template.EvergreenProvision$EvergreenProvisionBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| singlePartyOption | `PartyRoleBuilder` |  |
| noticePeriod | `RelativeDateOffsetBuilder` |  |
| noticeDeadlinePeriod | `RelativeDateOffsetBuilder` |  |
| noticeDeadlineDateTime | `ZonedDateTime` |  |
| extensionFrequency | `AdjustableRelativeOrPeriodicDatesBuilder` |  |
| finalPeriodFeeAdjustment | `PriceBuilder` |  |

### Methods

#### Builder Methods

- `EvergreenProvision build()`

#### Setter Methods

- `EvergreenProvisionBuilder setExtensionFrequency(AdjustableRelativeOrPeriodicDates arg0)`
- `EvergreenProvisionBuilder setNoticePeriod(RelativeDateOffset arg0)`
- `EvergreenProvisionBuilder setFinalPeriodFeeAdjustment(Price arg0)`
- `EvergreenProvisionBuilder setNoticeDeadlineDateTime(ZonedDateTime arg0)`
- `EvergreenProvisionBuilder setNoticeDeadlinePeriod(RelativeDateOffset arg0)`
- `EvergreenProvisionBuilder setSinglePartyOption(PartyRole arg0)`

#### Getter Methods

- `RelativeDateOffsetBuilder getOrCreateNoticePeriod()`
- `AdjustableRelativeOrPeriodicDatesBuilder getOrCreateExtensionFrequency()`
- `PriceBuilder getOrCreateFinalPeriodFeeAdjustment()`
- `PartyRoleBuilder getSinglePartyOption()`
- `AdjustableRelativeOrPeriodicDatesBuilder getExtensionFrequency()`
- `RelativeDateOffsetBuilder getNoticePeriod()`
- `PriceBuilder getFinalPeriodFeeAdjustment()`
- `RelativeDateOffsetBuilder getOrCreateNoticeDeadlinePeriod()`
- `RelativeDateOffsetBuilder getNoticeDeadlinePeriod()`
- `ZonedDateTime getNoticeDeadlineDateTime()`
- `PartyRoleBuilder getOrCreateSinglePartyOption()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `EvergreenProvisionBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `EvergreenProvisionBuilder prune()`
- `EvergreenProvisionBuilder toBuilder()`
- `boolean hasData()`

