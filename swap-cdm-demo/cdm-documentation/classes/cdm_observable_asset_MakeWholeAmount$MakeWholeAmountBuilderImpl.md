# MakeWholeAmountBuilderImpl

**Full Name:** `cdm.observable.asset.MakeWholeAmount$MakeWholeAmountBuilderImpl`

**Package:** `cdm.observable.asset`

## Type: Concrete Class

### Inheritance

**Extends:**
- `cdm.observable.asset.SwapCurveValuation$SwapCurveValuationBuilderImpl`

### Implemented Interfaces

- `cdm.observable.asset.MakeWholeAmount$MakeWholeAmountBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| interpolationMethod | `InterpolationMethodEnum` |  |
| earlyCallDate | `FieldWithMetaDateBuilder` |  |

### Methods

#### Builder Methods

- `MakeWholeAmount build()`

#### Setter Methods

- `MakeWholeAmountBuilder setSide(QuotationSideEnum arg0)`
- `MakeWholeAmountBuilder setIndexTenor(Period arg0)`
- `MakeWholeAmountBuilder setInterpolationMethod(InterpolationMethodEnum arg0)`
- `MakeWholeAmountBuilder setEarlyCallDateValue(Date arg0)`
- `MakeWholeAmountBuilder setEarlyCallDate(FieldWithMetaDate arg0)`
- `MakeWholeAmountBuilder setFloatingRateIndex(FloatingRateIndexEnum arg0)`
- `MakeWholeAmountBuilder setSpread(BigDecimal arg0)`

#### Getter Methods

- `InterpolationMethodEnum getInterpolationMethod()`
- `FieldWithMetaDateBuilder getEarlyCallDate()`
- `FieldWithMetaDateBuilder getOrCreateEarlyCallDate()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `MakeWholeAmountBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `MakeWholeAmountBuilder prune()`
- `MakeWholeAmountBuilder toBuilder()`
- `boolean hasData()`

