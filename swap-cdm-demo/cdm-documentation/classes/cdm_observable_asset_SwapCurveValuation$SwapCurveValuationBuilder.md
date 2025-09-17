# SwapCurveValuationBuilder

**Full Name:** `cdm.observable.asset.SwapCurveValuation$SwapCurveValuationBuilder`

**Package:** `cdm.observable.asset`

## Type: Interface

### Implemented Interfaces

- `cdm.observable.asset.SwapCurveValuation`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`

### Methods

#### Setter Methods

- `SwapCurveValuationBuilder setSide(QuotationSideEnum arg0)`
- `SwapCurveValuationBuilder setIndexTenor(Period arg0)`
- `SwapCurveValuationBuilder setFloatingRateIndex(FloatingRateIndexEnum arg0)`
- `SwapCurveValuationBuilder setSpread(BigDecimal arg0)`

#### Getter Methods

- `PeriodBuilder getOrCreateIndexTenor()`
- `PeriodBuilder getIndexTenor()`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `SwapCurveValuationBuilder prune()`

