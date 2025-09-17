# DividendPayoutRatioBuilder

**Full Name:** `cdm.product.asset.DividendPayoutRatio$DividendPayoutRatioBuilder`

**Package:** `cdm.product.asset`

## Type: Interface

### Implemented Interfaces

- `cdm.product.asset.DividendPayoutRatio`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`

### Methods

#### Setter Methods

- `DividendPayoutRatioBuilder setTotalRatio(BigDecimal arg0)`
- `DividendPayoutRatioBuilder setCashRatio(BigDecimal arg0)`
- `DividendPayoutRatioBuilder setNonCashRatio(BigDecimal arg0)`
- `DividendPayoutRatioBuilder setBasketConstituent(ReferenceWithMetaBasketConstituent arg0)`
- `DividendPayoutRatioBuilder setBasketConstituentValue(BasketConstituent arg0)`

#### Getter Methods

- `ReferenceWithMetaBasketConstituentBuilder getBasketConstituent()`
- `ReferenceWithMetaBasketConstituentBuilder getOrCreateBasketConstituent()`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `DividendPayoutRatioBuilder prune()`

