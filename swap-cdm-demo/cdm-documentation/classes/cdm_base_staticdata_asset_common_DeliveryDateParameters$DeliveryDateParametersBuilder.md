# DeliveryDateParametersBuilder

**Full Name:** `cdm.base.staticdata.asset.common.DeliveryDateParameters$DeliveryDateParametersBuilder`

**Package:** `cdm.base.staticdata.asset.common`

## Type: Interface

### Implemented Interfaces

- `cdm.base.staticdata.asset.common.DeliveryDateParameters`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`

### Methods

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

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `DeliveryDateParametersBuilder prune()`

