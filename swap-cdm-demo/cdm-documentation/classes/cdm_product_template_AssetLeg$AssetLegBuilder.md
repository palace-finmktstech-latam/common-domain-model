# AssetLegBuilder

**Full Name:** `cdm.product.template.AssetLeg$AssetLegBuilder`

**Package:** `cdm.product.template`

## Type: Interface

### Implemented Interfaces

- `cdm.product.template.AssetLeg`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`

### Methods

#### Setter Methods

- `AssetLegBuilder setSettlementDate(AdjustableOrRelativeDate arg0)`
- `AssetLegBuilder setDeliveryMethod(DeliveryMethodEnum arg0)`

#### Getter Methods

- `AdjustableOrRelativeDateBuilder getSettlementDate()`
- `AdjustableOrRelativeDateBuilder getOrCreateSettlementDate()`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `AssetLegBuilder prune()`

