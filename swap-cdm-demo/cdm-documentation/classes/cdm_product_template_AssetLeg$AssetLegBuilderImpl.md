# AssetLegBuilderImpl

**Full Name:** `cdm.product.template.AssetLeg$AssetLegBuilderImpl`

**Package:** `cdm.product.template`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.product.template.AssetLeg$AssetLegBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| settlementDate | `AdjustableOrRelativeDateBuilder` |  |
| deliveryMethod | `DeliveryMethodEnum` |  |

### Methods

#### Builder Methods

- `AssetLeg build()`

#### Setter Methods

- `AssetLegBuilder setSettlementDate(AdjustableOrRelativeDate arg0)`
- `AssetLegBuilder setDeliveryMethod(DeliveryMethodEnum arg0)`

#### Getter Methods

- `AdjustableOrRelativeDateBuilder getOrCreateSettlementDate()`
- `AdjustableOrRelativeDateBuilder getSettlementDate()`
- `DeliveryMethodEnum getDeliveryMethod()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `AssetLegBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `AssetLegBuilder prune()`
- `AssetLegBuilder toBuilder()`
- `boolean hasData()`

