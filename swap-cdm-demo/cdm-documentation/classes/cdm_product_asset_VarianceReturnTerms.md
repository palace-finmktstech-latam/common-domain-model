# VarianceReturnTerms

**Full Name:** `cdm.product.asset.VarianceReturnTerms`

**Package:** `cdm.product.asset`

## Type: Interface

### Implemented Interfaces

- `cdm.product.asset.ReturnTermsBase`

### Methods

#### Builder Methods

- `VarianceReturnTerms build()`

#### Getter Methods

- `Class getType()`
- `VarianceCapFloor getVarianceCapFloor()`
- `VolatilityCapFloor getVolatilityCapFloor()`
- `Price getVarianceStrikePrice()`
- `NonNegativeQuantitySchedule getVegaNotionalAmount()`
- `Price getVolatilityStrikePrice()`
- `ReferenceWithMetaObservable getExchangeTradedContractNearest()`

#### Other Methods

- `void process(RosettaPath arg0, Processor arg1)`
- `VarianceReturnTermsBuilder toBuilder()`
- `RosettaMetaData metaData()`

### Annotations

- **RuneDataType**
- **RosettaDataType**

