# AssetDeliveryProfileBuilder

**Full Name:** `cdm.product.asset.AssetDeliveryProfile$AssetDeliveryProfileBuilder`

**Package:** `cdm.product.asset`

## Type: Interface

### Implemented Interfaces

- `cdm.product.asset.AssetDeliveryProfile`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`

### Methods

#### Setter Methods

- `AssetDeliveryProfileBuilder setBankHolidaysTreatment(BankHolidayTreatmentEnum arg0)`
- `AssetDeliveryProfileBuilder setLoadType(LoadTypeEnum arg0)`
- `AssetDeliveryProfileBuilder setBlock(List arg0)`

#### Getter Methods

- `AssetDeliveryProfileBlockBuilder getOrCreateBlock(int arg0)`
- `List getBlock()`

#### Adder Methods

- `AssetDeliveryProfileBuilder addBlock(List arg0)`
- `AssetDeliveryProfileBuilder addBlock(AssetDeliveryProfileBlock arg0, int arg1)`
- `AssetDeliveryProfileBuilder addBlock(AssetDeliveryProfileBlock arg0)`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `AssetDeliveryProfileBuilder prune()`

