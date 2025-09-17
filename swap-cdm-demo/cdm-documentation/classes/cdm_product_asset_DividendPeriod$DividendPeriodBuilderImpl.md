# DividendPeriodBuilderImpl

**Full Name:** `cdm.product.asset.DividendPeriod$DividendPeriodBuilderImpl`

**Package:** `cdm.product.asset`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.product.asset.DividendPeriod$DividendPeriodBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| startDate | `DividendPaymentDateBuilder` |  |
| endDate | `DividendPaymentDateBuilder` |  |
| dateAdjustments | `BusinessDayAdjustmentsBuilder` |  |
| basketConstituent | `ReferenceWithMetaBasketConstituentBuilder` |  |
| dividendPaymentDate | `DividendPaymentDateBuilder` |  |
| dividendValuationDate | `AdjustableOrRelativeDateBuilder` |  |

### Methods

#### Builder Methods

- `DividendPeriod build()`

#### Setter Methods

- `DividendPeriodBuilder setDividendPaymentDate(DividendPaymentDate arg0)`
- `DividendPeriodBuilder setDividendValuationDate(AdjustableOrRelativeDate arg0)`
- `DividendPeriodBuilder setDateAdjustments(BusinessDayAdjustments arg0)`
- `DividendPeriodBuilder setEndDate(DividendPaymentDate arg0)`
- `DividendPeriodBuilder setBasketConstituent(ReferenceWithMetaBasketConstituent arg0)`
- `DividendPeriodBuilder setBasketConstituentValue(BasketConstituent arg0)`
- `DividendPeriodBuilder setStartDate(DividendPaymentDate arg0)`

#### Getter Methods

- `DividendPaymentDateBuilder getOrCreateEndDate()`
- `DividendPaymentDateBuilder getOrCreateStartDate()`
- `DividendPaymentDateBuilder getDividendPaymentDate()`
- `AdjustableOrRelativeDateBuilder getDividendValuationDate()`
- `AdjustableOrRelativeDateBuilder getOrCreateDividendValuationDate()`
- `DividendPaymentDateBuilder getOrCreateDividendPaymentDate()`
- `BusinessDayAdjustmentsBuilder getOrCreateDateAdjustments()`
- `BusinessDayAdjustmentsBuilder getDateAdjustments()`
- `DividendPaymentDateBuilder getEndDate()`
- `ReferenceWithMetaBasketConstituentBuilder getBasketConstituent()`
- `DividendPaymentDateBuilder getStartDate()`
- `ReferenceWithMetaBasketConstituentBuilder getOrCreateBasketConstituent()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `DividendPeriodBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `DividendPeriodBuilder prune()`
- `DividendPeriodBuilder toBuilder()`
- `boolean hasData()`

