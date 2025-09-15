# EvergreenProvisionBuilder

**Full Name:** `cdm.product.template.EvergreenProvision$EvergreenProvisionBuilder`

**Package:** `cdm.product.template`

## Type: Interface

### Implemented Interfaces

- `cdm.product.template.EvergreenProvision`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`

### Methods

#### Setter Methods

- `EvergreenProvisionBuilder setFinalPeriodFeeAdjustment(Price arg0)`
- `EvergreenProvisionBuilder setExtensionFrequency(AdjustableRelativeOrPeriodicDates arg0)`
- `EvergreenProvisionBuilder setNoticePeriod(RelativeDateOffset arg0)`
- `EvergreenProvisionBuilder setNoticeDeadlineDateTime(ZonedDateTime arg0)`
- `EvergreenProvisionBuilder setNoticeDeadlinePeriod(RelativeDateOffset arg0)`
- `EvergreenProvisionBuilder setSinglePartyOption(PartyRole arg0)`

#### Getter Methods

- `PartyRoleBuilder getSinglePartyOption()`
- `RelativeDateOffsetBuilder getNoticePeriod()`
- `AdjustableRelativeOrPeriodicDatesBuilder getExtensionFrequency()`
- `RelativeDateOffsetBuilder getOrCreateNoticePeriod()`
- `PartyRoleBuilder getOrCreateSinglePartyOption()`
- `PriceBuilder getOrCreateFinalPeriodFeeAdjustment()`
- `AdjustableRelativeOrPeriodicDatesBuilder getOrCreateExtensionFrequency()`
- `RelativeDateOffsetBuilder getNoticeDeadlinePeriod()`
- `RelativeDateOffsetBuilder getOrCreateNoticeDeadlinePeriod()`
- `PriceBuilder getFinalPeriodFeeAdjustment()`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `EvergreenProvisionBuilder prune()`

