# DeliveryDateParametersBuilder

**Full Name:** `cdm.base.staticdata.asset.common.DeliveryDateParameters$DeliveryDateParametersBuilder`

**Package:** `cdm.base.staticdata.asset.common`

## Type: Interface

### Implemented Interfaces

- `cdm.base.staticdata.asset.common.DeliveryDateParameters`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`

### Methods

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

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `DeliveryDateParametersBuilder prune()`

