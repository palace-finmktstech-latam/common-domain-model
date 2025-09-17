# AssetDeliveryPeriodsBuilderImpl

**Full Name:** `cdm.product.asset.AssetDeliveryPeriods$AssetDeliveryPeriodsBuilderImpl`

**Package:** `cdm.product.asset`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.product.asset.AssetDeliveryPeriods$AssetDeliveryPeriodsBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| profile | `java.util.List<cdm.product.asset.AssetDeliveryProfile$AssetDeliveryProfileBuilder>` |  |
| startDate | `Date` |  |
| endDate | `Date` |  |

### Methods

#### Builder Methods

- `AssetDeliveryPeriods build()`

#### Setter Methods

- `AssetDeliveryPeriodsBuilder setEndDate(Date arg0)`
- `AssetDeliveryPeriodsBuilder setStartDate(Date arg0)`
- `AssetDeliveryPeriodsBuilder setProfile(List arg0)`

#### Getter Methods

- `AssetDeliveryProfileBuilder getOrCreateProfile(int arg0)`
- `List getProfile()`
- `Date getEndDate()`
- `Date getStartDate()`

#### Adder Methods

- `AssetDeliveryPeriodsBuilder addProfile(AssetDeliveryProfile arg0)`
- `AssetDeliveryPeriodsBuilder addProfile(AssetDeliveryProfile arg0, int arg1)`
- `AssetDeliveryPeriodsBuilder addProfile(List arg0)`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `AssetDeliveryPeriodsBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `AssetDeliveryPeriodsBuilder prune()`
- `AssetDeliveryPeriodsBuilder toBuilder()`
- `boolean hasData()`

