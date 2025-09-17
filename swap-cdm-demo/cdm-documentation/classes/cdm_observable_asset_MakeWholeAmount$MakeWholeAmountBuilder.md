# MakeWholeAmountBuilder

**Full Name:** `cdm.observable.asset.MakeWholeAmount$MakeWholeAmountBuilder`

**Package:** `cdm.observable.asset`

## Type: Interface

### Implemented Interfaces

- `cdm.observable.asset.MakeWholeAmount`
- `cdm.observable.asset.SwapCurveValuation$SwapCurveValuationBuilder`

### Methods

#### Setter Methods

- `MakeWholeAmountBuilder setSide(QuotationSideEnum arg0)`
- `MakeWholeAmountBuilder setIndexTenor(Period arg0)`
- `MakeWholeAmountBuilder setInterpolationMethod(InterpolationMethodEnum arg0)`
- `MakeWholeAmountBuilder setEarlyCallDateValue(Date arg0)`
- `MakeWholeAmountBuilder setEarlyCallDate(FieldWithMetaDate arg0)`
- `MakeWholeAmountBuilder setFloatingRateIndex(FloatingRateIndexEnum arg0)`
- `MakeWholeAmountBuilder setSpread(BigDecimal arg0)`

#### Getter Methods

- `FieldWithMetaDateBuilder getEarlyCallDate()`
- `FieldWithMetaDateBuilder getOrCreateEarlyCallDate()`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `MakeWholeAmountBuilder prune()`

