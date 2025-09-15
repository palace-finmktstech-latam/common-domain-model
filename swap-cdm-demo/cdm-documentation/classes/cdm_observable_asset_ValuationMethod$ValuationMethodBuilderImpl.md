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
- `ValuationMethodBuilder setMinimumQuotationAmount(Money arg0)`
- `ValuationMethodBuilder setQuotationAmount(Money arg0)`
- `ValuationMethodBuilder setQuotationMethod(QuotationRateTypeEnum arg0)`
- `ValuationMethodBuilder setCashCollateralValuationMethod(CashCollateralValuationMethod arg0)`

#### Getter Methods

- `ValuationSourceBuilder getValuationSource()`
- `MoneyBuilder getQuotationAmount()`
- `MoneyBuilder getMinimumQuotationAmount()`
- `ValuationSourceBuilder getOrCreateValuationSource()`
- `QuotationRateTypeEnum getQuotationMethod()`
- `MoneyBuilder getOrCreateQuotationAmount()`
- `ValuationMethodEnum getValuationMethod()`
- `MoneyBuilder getOrCreateMinimumQuotationAmount()`
- `CashCollateralValuationMethodBuilder getOrCreateCashCollateralValuationMethod()`
- `CashCollateralValuationMethodBuilder getCashCollateralValuationMethod()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `ValuationMethodBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `boolean hasData()`
- `ValuationMethodBuilder toBuilder()`
- `ValuationMethodBuilder prune()`

