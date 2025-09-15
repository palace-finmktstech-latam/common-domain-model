# SettlementDateBuilder

**Full Name:** `cdm.product.common.settlement.SettlementDate$SettlementDateBuilder`

**Package:** `cdm.product.common.settlement`

## Type: Interface

### Implemented Interfaces

- `cdm.product.common.settlement.SettlementDate`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`
- `com.rosetta.model.lib.GlobalKey$GlobalKeyBuilder`

### Methods

#### Setter Methods

- `SettlementDateBuilder setPaymentDelay(Boolean arg0)`
- `SettlementDateBuilder setAdjustableDates(AdjustableDates arg0)`
- `SettlementDateBuilder setAdjustableOrRelativeDate(AdjustableOrAdjustedOrRelativeDate arg0)`
- `SettlementDateBuilder setCashSettlementBusinessDays(Integer arg0)`
- `SettlementDateBuilder setMeta(MetaFields arg0)`
- `SettlementDateBuilder setValueDate(Date arg0)`
- `SettlementDateBuilder setBusinessDateRange(BusinessDateRange arg0)`

#### Getter Methods

- `BusinessDateRangeBuilder getBusinessDateRange()`
- `AdjustableDatesBuilder getAdjustableDates()`
- `MetaFieldsBuilder getOrCreateMeta()`
- `AdjustableDatesBuilder getOrCreateAdjustableDates()`
- `BusinessDateRangeBuilder getOrCreateBusinessDateRange()`
- `AdjustableOrAdjustedOrRelativeDateBuilder getOrCreateAdjustableOrRelativeDate()`
- `AdjustableOrAdjustedOrRelativeDateBuilder getAdjustableOrRelativeDate()`
- `MetaFieldsBuilder getMeta()`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `SettlementDateBuilder prune()`

