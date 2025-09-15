# SettlementBaseBuilder

**Full Name:** `cdm.product.common.settlement.SettlementBase$SettlementBaseBuilder`

**Package:** `cdm.product.common.settlement`

## Type: Interface

### Implemented Interfaces

- `cdm.product.common.settlement.SettlementBase`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`
- `com.rosetta.model.lib.GlobalKey$GlobalKeyBuilder`

### Methods

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
- `SettlementDateBuilder getSettlementDate()`
- `SettlementDateBuilder getOrCreateSettlementDate()`
- `MetaFieldsBuilder getOrCreateMeta()`
- `SettlementProvisionBuilder getOrCreateSettlementProvision()`
- `FieldWithMetaStringBuilder getOrCreateSettlementCurrency()`
- `FieldWithMetaStringBuilder getSettlementCurrency()`
- `MetaFieldsBuilder getMeta()`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `SettlementBaseBuilder prune()`

