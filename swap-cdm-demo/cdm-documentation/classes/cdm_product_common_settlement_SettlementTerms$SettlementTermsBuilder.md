# SettlementTermsBuilder

**Full Name:** `cdm.product.common.settlement.SettlementTerms$SettlementTermsBuilder`

**Package:** `cdm.product.common.settlement`

## Type: Interface

### Implemented Interfaces

- `cdm.product.common.settlement.SettlementTerms`
- `cdm.product.common.settlement.SettlementBase$SettlementBaseBuilder`

### Methods

#### Setter Methods

- `SettlementTermsBuilder setSettlementDate(SettlementDate arg0)`
- `SettlementTermsBuilder setMeta(MetaFields arg0)`
- `SettlementTermsBuilder setTransferSettlementType(TransferSettlementEnum arg0)`
- `SettlementTermsBuilder setStandardSettlementStyle(StandardSettlementStyleEnum arg0)`
- `SettlementTermsBuilder setPhysicalSettlementTerms(PhysicalSettlementTerms arg0)`
- `SettlementTermsBuilder setCashSettlementTerms(List arg0)`
- `SettlementTermsBuilder setSettlementCurrencyValue(String arg0)`
- `SettlementTermsBuilder setSettlementCurrency(FieldWithMetaString arg0)`
- `SettlementTermsBuilder setSettlementCentre(SettlementCentreEnum arg0)`
- `SettlementTermsBuilder setSettlementType(SettlementTypeEnum arg0)`
- `SettlementTermsBuilder setSettlementProvision(SettlementProvision arg0)`

#### Getter Methods

- `List getCashSettlementTerms()`
- `PhysicalSettlementTermsBuilder getPhysicalSettlementTerms()`
- `CashSettlementTermsBuilder getOrCreateCashSettlementTerms(int arg0)`
- `PhysicalSettlementTermsBuilder getOrCreatePhysicalSettlementTerms()`

#### Adder Methods

- `SettlementTermsBuilder addCashSettlementTerms(CashSettlementTerms arg0, int arg1)`
- `SettlementTermsBuilder addCashSettlementTerms(CashSettlementTerms arg0)`
- `SettlementTermsBuilder addCashSettlementTerms(List arg0)`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `SettlementTermsBuilder prune()`

