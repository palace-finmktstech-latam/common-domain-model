# AssetFlowBaseBuilderImpl

**Full Name:** `cdm.product.common.settlement.AssetFlowBase$AssetFlowBaseBuilderImpl`

**Package:** `cdm.product.common.settlement`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.product.common.settlement.AssetFlowBase$AssetFlowBaseBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| quantity | `NonNegativeQuantityBuilder` |  |
| asset | `AssetBuilder` |  |
| settlementDate | `AdjustableOrAdjustedOrRelativeDateBuilder` |  |

### Methods

#### Builder Methods

- `AssetFlowBase build()`

#### Setter Methods

- `AssetFlowBaseBuilder setSettlementDate(AdjustableOrAdjustedOrRelativeDate arg0)`
- `AssetFlowBaseBuilder setQuantity(NonNegativeQuantity arg0)`
- `AssetFlowBaseBuilder setAsset(Asset arg0)`

#### Getter Methods

- `NonNegativeQuantityBuilder getQuantity()`
- `AssetBuilder getOrCreateAsset()`
- `AdjustableOrAdjustedOrRelativeDateBuilder getOrCreateSettlementDate()`
- `NonNegativeQuantityBuilder getOrCreateQuantity()`
- `AdjustableOrAdjustedOrRelativeDateBuilder getSettlementDate()`
- `AssetBuilder getAsset()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `AssetFlowBaseBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `AssetFlowBaseBuilder prune()`
- `AssetFlowBaseBuilder toBuilder()`
- `boolean hasData()`

