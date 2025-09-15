# DeliveryDateParametersBuilderImpl

**Full Name:** `cdm.base.staticdata.asset.common.DeliveryDateParameters$DeliveryDateParametersBuilderImpl`

**Package:** `cdm.base.staticdata.asset.common`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.base.staticdata.asset.common.DeliveryDateParameters$DeliveryDateParametersBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| deliveryNearby | `OffsetBuilder` |  |
| deliveryDate | `AdjustableDateBuilder` |  |
| deliveryDateRollConvention | `OffsetBuilder` |  |
| deliveryDateExpirationConvention | `OffsetBuilder` |  |

### Methods

#### Builder Methods

- `DeliveryDateParameters build()`

#### Setter Methods

- `DeliveryDateParametersBuilder setDeliveryDateRollConvention(Offset arg0)`
- `DeliveryDateParametersBuilder setDeliveryDateExpirationConvention(Offset arg0)`
- `DeliveryDateParametersBuilder setDeliveryDate(AdjustableDate arg0)`
- `DeliveryDateParametersBuilder setDeliveryNearby(Offset arg0)`

#### Getter Methods

- `OffsetBuilder getOrCreateDeliveryDateRollConvention()`
- `OffsetBuilder getDeliveryDateExpirationConvention()`
- `OffsetBuilder getDeliveryDateRollConvention()`
- `OffsetBuilder getDeliveryNearby()`
- `AdjustableDateBuilder getDeliveryDate()`
- `AdjustableDateBuilder getOrCreateDeliveryDate()`
- `OffsetBuilder getOrCreateDeliveryNearby()`
- `OffsetBuilder getOrCreateDeliveryDateExpirationConvention()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `DeliveryDateParametersBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `boolean hasData()`
- `DeliveryDateParametersBuilder toBuilder()`
- `DeliveryDateParametersBuilder prune()`

