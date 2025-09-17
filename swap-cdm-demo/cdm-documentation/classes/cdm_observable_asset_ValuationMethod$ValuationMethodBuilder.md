# ValuationMethodBuilder

**Full Name:** `cdm.observable.asset.ValuationMethod$ValuationMethodBuilder`

**Package:** `cdm.observable.asset`

## Type: Interface

### Implemented Interfaces

- `cdm.observable.asset.ValuationMethod`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`

### Methods

#### Setter Methods

- `ValuationMethodBuilder setValuationMethod(ValuationMethodEnum arg0)`
- `ValuationMethodBuilder setValuationSource(ValuationSource arg0)`
- `ValuationMethodBuilder setQuotationMethod(QuotationRateTypeEnum arg0)`
- `ValuationMethodBuilder setMinimumQuotationAmount(Money arg0)`
- `ValuationMethodBuilder setQuotationAmount(Money arg0)`
- `ValuationMethodBuilder setCashCollateralValuationMethod(CashCollateralValuationMethod arg0)`

#### Getter Methods

- `MoneyBuilder getQuotationAmount()`
- `MoneyBuilder getMinimumQuotationAmount()`
- `ValuationSourceBuilder getValuationSource()`
- `ValuationSourceBuilder getOrCreateValuationSource()`
- `MoneyBuilder getOrCreateQuotationAmount()`
- `CashCollateralValuationMethodBuilder getCashCollateralValuationMethod()`
- `MoneyBuilder getOrCreateMinimumQuotationAmount()`
- `CashCollateralValuationMethodBuilder getOrCreateCashCollateralValuationMethod()`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `ValuationMethodBuilder prune()`

