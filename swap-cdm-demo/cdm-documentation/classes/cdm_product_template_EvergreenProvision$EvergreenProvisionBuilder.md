# EvergreenProvisionBuilder

**Full Name:** `cdm.product.template.EvergreenProvision$EvergreenProvisionBuilder`

**Package:** `cdm.product.template`

## Type: Interface

### Implemented Interfaces

- `cdm.product.template.EvergreenProvision`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`

### Methods

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
- `PartyRoleBuilder getOrCreateSinglePartyOption()`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `EvergreenProvisionBuilder prune()`

