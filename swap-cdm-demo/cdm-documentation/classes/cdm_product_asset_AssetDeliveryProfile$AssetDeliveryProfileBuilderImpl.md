# AssetDeliveryProfileBuilderImpl

**Full Name:** `cdm.product.asset.AssetDeliveryProfile$AssetDeliveryProfileBuilderImpl`

**Package:** `cdm.product.asset`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.product.asset.AssetDeliveryProfile$AssetDeliveryProfileBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| loadType | `LoadTypeEnum` |  |
| block | `java.util.List<cdm.product.asset.AssetDeliveryProfileBlock$AssetDeliveryProfileBlockBuilder>` |  |
| bankHolidaysTreatment | `BankHolidayTreatmentEnum` |  |

### Methods

#### Builder Methods

- `AssetDeliveryProfile build()`

#### Setter Methods

- `AssetDeliveryProfileBuilder setBankHolidaysTreatment(BankHolidayTreatmentEnum arg0)`
- `AssetDeliveryProfileBuilder setLoadType(LoadTypeEnum arg0)`
- `AssetDeliveryProfileBuilder setBlock(List arg0)`

#### Getter Methods

- `AssetDeliveryProfileBlockBuilder getOrCreateBlock(int arg0)`
- `LoadTypeEnum getLoadType()`
- `BankHolidayTreatmentEnum getBankHolidaysTreatment()`
- `List getBlock()`

#### Adder Methods

- `AssetDeliveryProfileBuilder addBlock(AssetDeliveryProfileBlock arg0)`
- `AssetDeliveryProfileBuilder addBlock(AssetDeliveryProfileBlock arg0, int arg1)`
- `AssetDeliveryProfileBuilder addBlock(List arg0)`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `AssetDeliveryProfileBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `AssetDeliveryProfileBuilder prune()`
- `AssetDeliveryProfileBuilder toBuilder()`
- `boolean hasData()`

