# BasketReferenceInformationBuilder

**Full Name:** `cdm.product.asset.BasketReferenceInformation$BasketReferenceInformationBuilder`

**Package:** `cdm.product.asset`

## Type: Interface

### Implemented Interfaces

- `cdm.product.asset.BasketReferenceInformation`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`

### Methods

#### Setter Methods

- `BasketReferenceInformationBuilder setBasketName(FieldWithMetaString arg0)`
- `BasketReferenceInformationBuilder setBasketNameValue(String arg0)`
- `BasketReferenceInformationBuilder setBasketIdValue(List arg0)`
- `BasketReferenceInformationBuilder setReferencePool(ReferencePool arg0)`
- `BasketReferenceInformationBuilder setBasketId(List arg0)`
- `BasketReferenceInformationBuilder setNthToDefault(Integer arg0)`
- `BasketReferenceInformationBuilder setMthToDefault(Integer arg0)`
- `BasketReferenceInformationBuilder setTranche(Tranche arg0)`

#### Getter Methods

- `FieldWithMetaStringBuilder getBasketName()`
- `List getBasketId()`
- `ReferencePoolBuilder getReferencePool()`
- `ReferencePoolBuilder getOrCreateReferencePool()`
- `FieldWithMetaStringBuilder getOrCreateBasketName()`
- `FieldWithMetaStringBuilder getOrCreateBasketId(int arg0)`
- `TrancheBuilder getTranche()`
- `TrancheBuilder getOrCreateTranche()`

#### Adder Methods

- `BasketReferenceInformationBuilder addBasketId(List arg0)`
- `BasketReferenceInformationBuilder addBasketId(FieldWithMetaString arg0)`
- `BasketReferenceInformationBuilder addBasketId(FieldWithMetaString arg0, int arg1)`
- `BasketReferenceInformationBuilder addBasketIdValue(String arg0, int arg1)`
- `BasketReferenceInformationBuilder addBasketIdValue(String arg0)`
- `BasketReferenceInformationBuilder addBasketIdValue(List arg0)`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `BasketReferenceInformationBuilder prune()`

