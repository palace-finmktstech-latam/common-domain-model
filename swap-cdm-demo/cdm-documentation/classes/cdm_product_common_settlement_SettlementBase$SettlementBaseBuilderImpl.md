# SettlementBaseBuilderImpl

**Full Name:** `cdm.product.common.settlement.SettlementBase$SettlementBaseBuilderImpl`

**Package:** `cdm.product.common.settlement`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.product.common.settlement.SettlementBase$SettlementBaseBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| settlementType | `SettlementTypeEnum` |  |
| transferSettlementType | `TransferSettlementEnum` |  |
| settlementCurrency | `FieldWithMetaStringBuilder` |  |
| settlementDate | `SettlementDateBuilder` |  |
| settlementCentre | `SettlementCentreEnum` |  |
| settlementProvision | `SettlementProvisionBuilder` |  |
| standardSettlementStyle | `StandardSettlementStyleEnum` |  |
| meta | `MetaFieldsBuilder` |  |

### Methods

#### Builder Methods

- `SettlementBase build()`

#### Setter Methods

- `SettlementBaseBuilder setSettlementDate(SettlementDate arg0)`
- `SettlementBaseBuilder setSettlementType(SettlementTypeEnum arg0)`
- `SettlementBaseBuilder setTransferSettlementType(TransferSettlementEnum arg0)`
- `SettlementBaseBuilder setSettlementProvision(SettlementProvision arg0)`
- `SettlementBaseBuilder setSettlementCurrency(FieldWithMetaString arg0)`
- `SettlementBaseBuilder setSettlementCurrencyValue(String arg0)`
- `SettlementBaseBuilder setSettlementCentre(SettlementCentreEnum arg0)`
- `SettlementBaseBuilder setStandardSettlementStyle(StandardSettlementStyleEnum arg0)`
- `SettlementBaseBuilder setMeta(MetaFields arg0)`

#### Getter Methods

- `SettlementProvisionBuilder getSettlementProvision()`
- `TransferSettlementEnum getTransferSettlementType()`
- `StandardSettlementStyleEnum getStandardSettlementStyle()`
- `SettlementTypeEnum getSettlementType()`
- `SettlementCentreEnum getSettlementCentre()`
- `SettlementDateBuilder getSettlementDate()`
- `SettlementDateBuilder getOrCreateSettlementDate()`
- `MetaFieldsBuilder getOrCreateMeta()`
- `SettlementProvisionBuilder getOrCreateSettlementProvision()`
- `FieldWithMetaStringBuilder getOrCreateSettlementCurrency()`
- `FieldWithMetaStringBuilder getSettlementCurrency()`
- `MetaFieldsBuilder getMeta()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `SettlementBaseBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `boolean hasData()`
- `SettlementBaseBuilder toBuilder()`
- `SettlementBaseBuilder prune()`

