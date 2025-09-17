# AssetFlowBaseBuilder

**Full Name:** `cdm.product.common.settlement.AssetFlowBase$AssetFlowBaseBuilder`

**Package:** `cdm.product.common.settlement`

## Type: Interface

### Implemented Interfaces

- `cdm.product.common.settlement.AssetFlowBase`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`

### Methods

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

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `AssetFlowBaseBuilder prune()`

