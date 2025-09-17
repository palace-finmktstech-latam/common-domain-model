# CashSettlementTermsBuilderImpl

**Full Name:** `cdm.product.common.settlement.CashSettlementTerms$CashSettlementTermsBuilderImpl`

**Package:** `cdm.product.common.settlement`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.product.common.settlement.CashSettlementTerms$CashSettlementTermsBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| cashSettlementMethod | `CashSettlementMethodEnum` |  |
| valuationMethod | `ValuationMethodBuilder` |  |
| valuationDate | `ValuationDateBuilder` |  |
| valuationTime | `BusinessCenterTimeBuilder` |  |
| cashSettlementAmount | `MoneyBuilder` |  |
| recoveryFactor | `BigDecimal` |  |
| fixedSettlement | `Boolean` |  |
| accruedInterest | `Boolean` |  |
| meta | `MetaFieldsBuilder` |  |

### Methods

#### Builder Methods

- `CashSettlementTerms build()`

#### Setter Methods

- `CashSettlementTermsBuilder setMeta(MetaFields arg0)`
- `CashSettlementTermsBuilder setValuationTime(BusinessCenterTime arg0)`
- `CashSettlementTermsBuilder setValuationDate(ValuationDate arg0)`
- `CashSettlementTermsBuilder setValuationMethod(ValuationMethod arg0)`
- `CashSettlementTermsBuilder setCashSettlementAmount(Money arg0)`
- `CashSettlementTermsBuilder setCashSettlementMethod(CashSettlementMethodEnum arg0)`
- `CashSettlementTermsBuilder setRecoveryFactor(BigDecimal arg0)`
- `CashSettlementTermsBuilder setFixedSettlement(Boolean arg0)`
- `CashSettlementTermsBuilder setAccruedInterest(Boolean arg0)`

#### Getter Methods

- `MetaFieldsBuilder getOrCreateMeta()`
- `BusinessCenterTimeBuilder getValuationTime()`
- `ValuationDateBuilder getValuationDate()`
- `MetaFieldsBuilder getMeta()`
- `BusinessCenterTimeBuilder getOrCreateValuationTime()`
- `ValuationDateBuilder getOrCreateValuationDate()`
- `MoneyBuilder getCashSettlementAmount()`
- `BigDecimal getRecoveryFactor()`
- `Boolean getFixedSettlement()`
- `ValuationMethodBuilder getOrCreateValuationMethod()`
- `ValuationMethodBuilder getValuationMethod()`
- `CashSettlementMethodEnum getCashSettlementMethod()`
- `Boolean getAccruedInterest()`
- `MoneyBuilder getOrCreateCashSettlementAmount()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `CashSettlementTermsBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `CashSettlementTermsBuilder prune()`
- `CashSettlementTermsBuilder toBuilder()`
- `boolean hasData()`

