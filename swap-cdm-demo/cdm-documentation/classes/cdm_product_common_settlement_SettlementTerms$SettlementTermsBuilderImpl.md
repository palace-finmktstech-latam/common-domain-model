# SettlementTermsBuilderImpl

**Full Name:** `cdm.product.common.settlement.SettlementTerms$SettlementTermsBuilderImpl`

**Package:** `cdm.product.common.settlement`

## Type: Concrete Class

### Inheritance

**Extends:**
- `cdm.product.common.settlement.SettlementBase$SettlementBaseBuilderImpl`

### Implemented Interfaces

- `cdm.product.common.settlement.SettlementTerms$SettlementTermsBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| cashSettlementTerms | `java.util.List<cdm.product.common.settlement.CashSettlementTerms$CashSettlementTermsBuilder>` |  |
| physicalSettlementTerms | `PhysicalSettlementTermsBuilder` |  |

### Methods

#### Builder Methods

- `SettlementTerms build()`

#### Setter Methods

- `SettlementTermsBuilder setSettlementDate(SettlementDate arg0)`
- `SettlementTermsBuilder setSettlementType(SettlementTypeEnum arg0)`
- `SettlementTermsBuilder setTransferSettlementType(TransferSettlementEnum arg0)`
- `SettlementTermsBuilder setSettlementProvision(SettlementProvision arg0)`
- `SettlementTermsBuilder setSettlementCurrency(FieldWithMetaString arg0)`
- `SettlementTermsBuilder setSettlementCurrencyValue(String arg0)`
- `SettlementTermsBuilder setCashSettlementTerms(List arg0)`
- `SettlementTermsBuilder setSettlementCentre(SettlementCentreEnum arg0)`
- `SettlementTermsBuilder setStandardSettlementStyle(StandardSettlementStyleEnum arg0)`
- `SettlementTermsBuilder setPhysicalSettlementTerms(PhysicalSettlementTerms arg0)`
- `SettlementTermsBuilder setMeta(MetaFields arg0)`

#### Getter Methods

- `CashSettlementTermsBuilder getOrCreateCashSettlementTerms(int arg0)`
- `PhysicalSettlementTermsBuilder getOrCreatePhysicalSettlementTerms()`
- `List getCashSettlementTerms()`
- `PhysicalSettlementTermsBuilder getPhysicalSettlementTerms()`

#### Adder Methods

- `SettlementTermsBuilder addCashSettlementTerms(CashSettlementTerms arg0, int arg1)`
- `SettlementTermsBuilder addCashSettlementTerms(CashSettlementTerms arg0)`
- `SettlementTermsBuilder addCashSettlementTerms(List arg0)`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `SettlementTermsBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `boolean hasData()`
- `SettlementTermsBuilder toBuilder()`
- `SettlementTermsBuilder prune()`

