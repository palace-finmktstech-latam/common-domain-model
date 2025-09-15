# SettlementDateBuilderImpl

**Full Name:** `cdm.product.common.settlement.SettlementDate$SettlementDateBuilderImpl`

**Package:** `cdm.product.common.settlement`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.product.common.settlement.SettlementDate$SettlementDateBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| adjustableOrRelativeDate | `AdjustableOrAdjustedOrRelativeDateBuilder` |  |
| valueDate | `Date` |  |
| adjustableDates | `AdjustableDatesBuilder` |  |
| businessDateRange | `BusinessDateRangeBuilder` |  |
| cashSettlementBusinessDays | `Integer` |  |
| paymentDelay | `Boolean` |  |
| meta | `MetaFieldsBuilder` |  |

### Methods

#### Builder Methods

- `SettlementDate build()`

#### Setter Methods

- `SettlementDateBuilder setPaymentDelay(Boolean arg0)`
- `SettlementDateBuilder setAdjustableDates(AdjustableDates arg0)`
- `SettlementDateBuilder setAdjustableOrRelativeDate(AdjustableOrAdjustedOrRelativeDate arg0)`
- `SettlementDateBuilder setCashSettlementBusinessDays(Integer arg0)`
- `SettlementDateBuilder setMeta(MetaFields arg0)`
- `SettlementDateBuilder setValueDate(Date arg0)`
- `SettlementDateBuilder setBusinessDateRange(BusinessDateRange arg0)`

#### Getter Methods

- `Boolean getPaymentDelay()`
- `BusinessDateRangeBuilder getBusinessDateRange()`
- `Date getValueDate()`
- `AdjustableDatesBuilder getAdjustableDates()`
- `MetaFieldsBuilder getOrCreateMeta()`
- `AdjustableDatesBuilder getOrCreateAdjustableDates()`
- `Integer getCashSettlementBusinessDays()`
- `BusinessDateRangeBuilder getOrCreateBusinessDateRange()`
- `AdjustableOrAdjustedOrRelativeDateBuilder getOrCreateAdjustableOrRelativeDate()`
- `AdjustableOrAdjustedOrRelativeDateBuilder getAdjustableOrRelativeDate()`
- `MetaFieldsBuilder getMeta()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `SettlementDateBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `boolean hasData()`
- `SettlementDateBuilder toBuilder()`
- `SettlementDateBuilder prune()`

