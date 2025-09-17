# DividendPayoutRatioBuilderImpl

**Full Name:** `cdm.product.asset.DividendPayoutRatio$DividendPayoutRatioBuilderImpl`

**Package:** `cdm.product.asset`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.product.asset.DividendPayoutRatio$DividendPayoutRatioBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| totalRatio | `BigDecimal` |  |
| cashRatio | `BigDecimal` |  |
| nonCashRatio | `BigDecimal` |  |
| basketConstituent | `ReferenceWithMetaBasketConstituentBuilder` |  |

### Methods

#### Builder Methods

- `DividendPayoutRatio build()`

#### Setter Methods

- `DividendPayoutRatioBuilder setTotalRatio(BigDecimal arg0)`
- `DividendPayoutRatioBuilder setCashRatio(BigDecimal arg0)`
- `DividendPayoutRatioBuilder setNonCashRatio(BigDecimal arg0)`
- `DividendPayoutRatioBuilder setBasketConstituent(ReferenceWithMetaBasketConstituent arg0)`
- `DividendPayoutRatioBuilder setBasketConstituentValue(BasketConstituent arg0)`

#### Getter Methods

- `BigDecimal getTotalRatio()`
- `BigDecimal getNonCashRatio()`
- `BigDecimal getCashRatio()`
- `ReferenceWithMetaBasketConstituentBuilder getBasketConstituent()`
- `ReferenceWithMetaBasketConstituentBuilder getOrCreateBasketConstituent()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `DividendPayoutRatioBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `DividendPayoutRatioBuilder prune()`
- `DividendPayoutRatioBuilder toBuilder()`
- `boolean hasData()`

