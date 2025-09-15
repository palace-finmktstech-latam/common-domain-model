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

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `DividendPeriodBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `boolean hasData()`
- `DividendPeriodBuilder toBuilder()`
- `DividendPeriodBuilder prune()`

