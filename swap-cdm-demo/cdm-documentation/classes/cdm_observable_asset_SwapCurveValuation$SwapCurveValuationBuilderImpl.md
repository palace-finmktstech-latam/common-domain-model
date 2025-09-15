# SwapCurveValuationBuilderImpl

**Full Name:** `cdm.observable.asset.SwapCurveValuation$SwapCurveValuationBuilderImpl`

**Package:** `cdm.observable.asset`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.observable.asset.SwapCurveValuation$SwapCurveValuationBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| floatingRateIndex | `FloatingRateIndexEnum` |  |
| indexTenor | `PeriodBuilder` |  |
| spread | `BigDecimal` |  |
| side | `QuotationSideEnum` |  |

### Methods

#### Builder Methods

- `SwapCurveValuation build()`

#### Setter Methods

- `SwapCurveValuationBuilder setFloatingRateIndex(FloatingRateIndexEnum arg0)`
- `SwapCurveValuationBuilder setSide(QuotationSideEnum arg0)`
- `SwapCurveValuationBuilder setIndexTenor(Period arg0)`
- `SwapCurveValuationBuilder setSpread(BigDecimal arg0)`

#### Getter Methods

- `FloatingRateIndexEnum getFloatingRateIndex()`
- `PeriodBuilder getIndexTenor()`
- `QuotationSideEnum getSide()`
- `PeriodBuilder getOrCreateIndexTenor()`
- `BigDecimal getSpread()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `SwapCurveValuationBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `boolean hasData()`
- `SwapCurveValuationBuilder toBuilder()`
- `SwapCurveValuationBuilder prune()`

