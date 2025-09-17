# AssetDeliveryInformationBuilder

**Full Name:** `cdm.product.asset.AssetDeliveryInformation$AssetDeliveryInformationBuilder`

**Package:** `cdm.product.asset`

## Type: Interface

### Implemented Interfaces

- `cdm.product.asset.AssetDeliveryInformation`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`

### Methods

#### Setter Methods

- `AssetDeliveryInformationBuilder setLocation(List arg0)`
- `AssetDeliveryInformationBuilder setDeliveryCapacity(Quantity arg0)`
- `AssetDeliveryInformationBuilder setPeriods(AssetDeliveryPeriods arg0)`

#### Getter Methods

- `List getLocation()`
- `AssetDeliveryPeriodsBuilder getPeriods()`
- `AssetDeliveryPeriodsBuilder getOrCreatePeriods()`
- `LocationIdentifierBuilder getOrCreateLocation(int arg0)`
- `QuantityBuilder getDeliveryCapacity()`
- `QuantityBuilder getOrCreateDeliveryCapacity()`

#### Adder Methods

- `AssetDeliveryInformationBuilder addLocation(List arg0)`
- `AssetDeliveryInformationBuilder addLocation(LocationIdentifier arg0, int arg1)`
- `AssetDeliveryInformationBuilder addLocation(LocationIdentifier arg0)`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `AssetDeliveryInformationBuilder prune()`

