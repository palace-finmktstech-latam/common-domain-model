# AssetDeliveryInformationBuilderImpl

**Full Name:** `cdm.product.asset.AssetDeliveryInformation$AssetDeliveryInformationBuilderImpl`

**Package:** `cdm.product.asset`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.product.asset.AssetDeliveryInformation$AssetDeliveryInformationBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| periods | `AssetDeliveryPeriodsBuilder` |  |
| location | `java.util.List<cdm.base.staticdata.identifier.LocationIdentifier$LocationIdentifierBuilder>` |  |
| deliveryCapacity | `QuantityBuilder` |  |

### Methods

#### Builder Methods

- `AssetDeliveryInformation build()`

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

- `AssetDeliveryInformationBuilder addLocation(LocationIdentifier arg0, int arg1)`
- `AssetDeliveryInformationBuilder addLocation(LocationIdentifier arg0)`
- `AssetDeliveryInformationBuilder addLocation(List arg0)`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `AssetDeliveryInformationBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `AssetDeliveryInformationBuilder prune()`
- `AssetDeliveryInformationBuilder toBuilder()`
- `boolean hasData()`

