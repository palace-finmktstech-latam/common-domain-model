# AssetDeliveryPeriodsBuilder

**Full Name:** `cdm.product.asset.AssetDeliveryPeriods$AssetDeliveryPeriodsBuilder`

**Package:** `cdm.product.asset`

## Type: Interface

### Implemented Interfaces

- `cdm.product.asset.AssetDeliveryPeriods`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`

### Methods

#### Setter Methods

- `AssetDeliveryPeriodsBuilder setEndDate(Date arg0)`
- `AssetDeliveryPeriodsBuilder setStartDate(Date arg0)`
- `AssetDeliveryPeriodsBuilder setProfile(List arg0)`

#### Getter Methods

- `AssetDeliveryProfileBuilder getOrCreateProfile(int arg0)`
- `List getProfile()`

#### Adder Methods

- `AssetDeliveryPeriodsBuilder addProfile(List arg0)`
- `AssetDeliveryPeriodsBuilder addProfile(AssetDeliveryProfile arg0, int arg1)`
- `AssetDeliveryPeriodsBuilder addProfile(AssetDeliveryProfile arg0)`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `AssetDeliveryPeriodsBuilder prune()`

