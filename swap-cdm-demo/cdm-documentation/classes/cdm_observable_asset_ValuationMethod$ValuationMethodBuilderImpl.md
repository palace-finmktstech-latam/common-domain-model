# ValuationMethodBuilderImpl

**Full Name:** `cdm.observable.asset.ValuationMethod$ValuationMethodBuilderImpl`

**Package:** `cdm.observable.asset`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.observable.asset.ValuationMethod$ValuationMethodBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| valuationSource | `ValuationSourceBuilder` |  |
| quotationMethod | `QuotationRateTypeEnum` |  |
| valuationMethod | `ValuationMethodEnum` |  |
| quotationAmount | `MoneyBuilder` |  |
| minimumQuotationAmount | `MoneyBuilder` |  |
| cashCollateralValuationMethod | `CashCollateralValuationMethodBuilder` |  |

### Methods

#### Builder Methods

- `ValuationMethod build()`

#### Setter Methods

- `ValuationMethodBuilder setValuationMethod(ValuationMethodEnum arg0)`
- `ValuationMethodBuilder setValuationSource(ValuationSource arg0)`
- `ValuationMethodBuilder setQuotationMethod(QuotationRateTypeEnum arg0)`
- `ValuationMethodBuilder setMinimumQuotationAmount(Money arg0)`
- `ValuationMethodBuilder setQuotationAmount(Money arg0)`
- `ValuationMethodBuilder setCashCollateralValuationMethod(CashCollateralValuationMethod arg0)`

#### Getter Methods

- `ValuationMethodEnum getValuationMethod()`
- `MoneyBuilder getQuotationAmount()`
- `MoneyBuilder getMinimumQuotationAmount()`
- `QuotationRateTypeEnum getQuotationMethod()`
- `ValuationSourceBuilder getValuationSource()`
- `ValuationSourceBuilder getOrCreateValuationSource()`
- `MoneyBuilder getOrCreateQuotationAmount()`
- `CashCollateralValuationMethodBuilder getCashCollateralValuationMethod()`
- `MoneyBuilder getOrCreateMinimumQuotationAmount()`
- `CashCollateralValuationMethodBuilder getOrCreateCashCollateralValuationMethod()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `ValuationMethodBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `ValuationMethodBuilder prune()`
- `ValuationMethodBuilder toBuilder()`
- `boolean hasData()`

