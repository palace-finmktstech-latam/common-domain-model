# CashSettlementTermsBuilder

**Full Name:** `cdm.product.common.settlement.CashSettlementTerms$CashSettlementTermsBuilder`

**Package:** `cdm.product.common.settlement`

## Type: Interface

### Implemented Interfaces

- `cdm.product.common.settlement.CashSettlementTerms`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`
- `com.rosetta.model.lib.GlobalKey$GlobalKeyBuilder`

### Methods

#### Setter Methods

- `CashSettlementTermsBuilder setRecoveryFactor(BigDecimal arg0)`
- `CashSettlementTermsBuilder setAccruedInterest(Boolean arg0)`
- `CashSettlementTermsBuilder setCashSettlementAmount(Money arg0)`
- `CashSettlementTermsBuilder setValuationMethod(ValuationMethod arg0)`
- `CashSettlementTermsBuilder setCashSettlementMethod(CashSettlementMethodEnum arg0)`
- `CashSettlementTermsBuilder setFixedSettlement(Boolean arg0)`
- `CashSettlementTermsBuilder setValuationTime(BusinessCenterTime arg0)`
- `CashSettlementTermsBuilder setValuationDate(ValuationDate arg0)`
- `CashSettlementTermsBuilder setMeta(MetaFields arg0)`

#### Getter Methods

- `MetaFieldsBuilder getOrCreateMeta()`
- `ValuationMethodBuilder getValuationMethod()`
- `MoneyBuilder getCashSettlementAmount()`
- `ValuationMethodBuilder getOrCreateValuationMethod()`
- `MoneyBuilder getOrCreateCashSettlementAmount()`
- `BusinessCenterTimeBuilder getValuationTime()`
- `ValuationDateBuilder getValuationDate()`
- `ValuationDateBuilder getOrCreateValuationDate()`
- `BusinessCenterTimeBuilder getOrCreateValuationTime()`
- `MetaFieldsBuilder getMeta()`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `CashSettlementTermsBuilder prune()`

