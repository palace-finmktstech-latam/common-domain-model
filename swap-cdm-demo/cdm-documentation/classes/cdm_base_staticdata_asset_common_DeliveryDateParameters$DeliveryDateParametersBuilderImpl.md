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

- `DeliveryDateParametersBuilder setDeliveryDate(AdjustableDate arg0)`
- `DeliveryDateParametersBuilder setDeliveryNearby(Offset arg0)`
- `DeliveryDateParametersBuilder setDeliveryDateRollConvention(Offset arg0)`
- `DeliveryDateParametersBuilder setDeliveryDateExpirationConvention(Offset arg0)`

#### Getter Methods

- `OffsetBuilder getOrCreateDeliveryDateExpirationConvention()`
- `OffsetBuilder getDeliveryNearby()`
- `AdjustableDateBuilder getDeliveryDate()`
- `OffsetBuilder getOrCreateDeliveryNearby()`
- `AdjustableDateBuilder getOrCreateDeliveryDate()`
- `OffsetBuilder getDeliveryDateRollConvention()`
- `OffsetBuilder getOrCreateDeliveryDateRollConvention()`
- `OffsetBuilder getDeliveryDateExpirationConvention()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `DeliveryDateParametersBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `DeliveryDateParametersBuilder prune()`
- `DeliveryDateParametersBuilder toBuilder()`
- `boolean hasData()`

