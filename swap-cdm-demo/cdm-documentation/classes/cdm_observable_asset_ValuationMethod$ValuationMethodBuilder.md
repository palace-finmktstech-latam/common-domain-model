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
- `ValuationMethodBuilder setMinimumQuotationAmount(Money arg0)`
- `ValuationMethodBuilder setQuotationAmount(Money arg0)`
- `ValuationMethodBuilder setQuotationMethod(QuotationRateTypeEnum arg0)`
- `ValuationMethodBuilder setCashCollateralValuationMethod(CashCollateralValuationMethod arg0)`

#### Getter Methods

- `ValuationSourceBuilder getValuationSource()`
- `MoneyBuilder getQuotationAmount()`
- `MoneyBuilder getMinimumQuotationAmount()`
- `ValuationSourceBuilder getOrCreateValuationSource()`
- `MoneyBuilder getOrCreateQuotationAmount()`
- `MoneyBuilder getOrCreateMinimumQuotationAmount()`
- `CashCollateralValuationMethodBuilder getOrCreateCashCollateralValuationMethod()`
- `CashCollateralValuationMethodBuilder getCashCollateralValuationMethod()`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `ValuationMethodBuilder prune()`

