# DividendPeriodBuilder

**Full Name:** `cdm.product.asset.DividendPeriod$DividendPeriodBuilder`

**Package:** `cdm.product.asset`

## Type: Interface

### Implemented Interfaces

- `cdm.product.asset.DividendPeriod`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`

### Methods

#### Setter Methods

- `DividendPeriodBuilder setBasketConstituentValue(BasketConstituent arg0)`
- `DividendPeriodBuilder setBasketConstituent(ReferenceWithMetaBasketConstituent arg0)`
- `DividendPeriodBuilder setStartDate(DividendPaymentDate arg0)`
- `DividendPeriodBuilder setEndDate(DividendPaymentDate arg0)`
- `DividendPeriodBuilder setDateAdjustments(BusinessDayAdjustments arg0)`
- `DividendPeriodBuilder setDividendPaymentDate(DividendPaymentDate arg0)`
- `DividendPeriodBuilder setDividendValuationDate(AdjustableOrRelativeDate arg0)`

#### Getter Methods

- `ReferenceWithMetaBasketConstituentBuilder getBasketConstituent()`
- `DividendPaymentDateBuilder getStartDate()`
- `DividendPaymentDateBuilder getEndDate()`
- `BusinessDayAdjustmentsBuilder getOrCreateDateAdjustments()`
- `AdjustableOrRelativeDateBuilder getOrCreateDividendValuationDate()`
- `DividendPaymentDateBuilder getOrCreateDividendPaymentDate()`
- `DividendPaymentDateBuilder getOrCreateEndDate()`
- `DividendPaymentDateBuilder getOrCreateStartDate()`
- `DividendPaymentDateBuilder getDividendPaymentDate()`
- `AdjustableOrRelativeDateBuilder getDividendValuationDate()`
- `ReferenceWithMetaBasketConstituentBuilder getOrCreateBasketConstituent()`
- `BusinessDayAdjustmentsBuilder getDateAdjustments()`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `DividendPeriodBuilder prune()`

