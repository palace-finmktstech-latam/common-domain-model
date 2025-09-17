# AssetPayout

**Full Name:** `cdm.product.template.AssetPayout`

**Package:** `cdm.product.template`

## Type: Interface

### Implemented Interfaces

- `cdm.product.common.settlement.PayoutBase`

### Methods

#### Builder Methods

- `AssetPayout build()`

#### Getter Methods

- `Class getType()`
- `Asset getUnderlier()`
- `List getAssetLeg()`
- `DividendTerms getDividendTerms()`
- `AssetPayoutTradeTypeEnum getTradeType()`
- `Money getMinimumFee()`

#### Other Methods

- `void process(RosettaPath arg0, Processor arg1)`
- `AssetPayoutBuilder toBuilder()`
- `RosettaMetaData metaData()`

### Annotations

- **RuneDataType**
- **RosettaDataType**

