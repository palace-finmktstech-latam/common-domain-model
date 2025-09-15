# BasketReferenceInformationBuilderImpl

**Full Name:** `cdm.product.asset.BasketReferenceInformation$BasketReferenceInformationBuilderImpl`

**Package:** `cdm.product.asset`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.product.asset.BasketReferenceInformation$BasketReferenceInformationBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| basketName | `FieldWithMetaStringBuilder` |  |
| basketId | `java.util.List<com.rosetta.model.metafields.FieldWithMetaString$FieldWithMetaStringBuilder>` |  |
| referencePool | `ReferencePoolBuilder` |  |
| nthToDefault | `Integer` |  |
| mthToDefault | `Integer` |  |
| tranche | `TrancheBuilder` |  |

### Methods

#### Builder Methods

- `BasketReferenceInformation build()`

#### Setter Methods

- `BasketReferenceInformationBuilder setNthToDefault(Integer arg0)`
- `BasketReferenceInformationBuilder setBasketNameValue(String arg0)`
- `BasketReferenceInformationBuilder setBasketIdValue(List arg0)`
- `BasketReferenceInformationBuilder setReferencePool(ReferencePool arg0)`
- `BasketReferenceInformationBuilder setBasketId(List arg0)`
- `BasketReferenceInformationBuilder setMthToDefault(Integer arg0)`
- `BasketReferenceInformationBuilder setBasketName(FieldWithMetaString arg0)`
- `BasketReferenceInformationBuilder setTranche(Tranche arg0)`

#### Getter Methods

- `TrancheBuilder getOrCreateTranche()`
- `FieldWithMetaStringBuilder getOrCreateBasketName()`
- `Integer getMthToDefault()`
- `FieldWithMetaStringBuilder getOrCreateBasketId(int arg0)`
- `ReferencePoolBuilder getOrCreateReferencePool()`
- `Integer getNthToDefault()`
- `ReferencePoolBuilder getReferencePool()`
- `FieldWithMetaStringBuilder getBasketName()`
- `List getBasketId()`
- `TrancheBuilder getTranche()`

#### Adder Methods

- `BasketReferenceInformationBuilder addBasketIdValue(String arg0)`
- `BasketReferenceInformationBuilder addBasketIdValue(List arg0)`
- `BasketReferenceInformationBuilder addBasketIdValue(String arg0, int arg1)`
- `BasketReferenceInformationBuilder addBasketId(List arg0)`
- `BasketReferenceInformationBuilder addBasketId(FieldWithMetaString arg0, int arg1)`
- `BasketReferenceInformationBuilder addBasketId(FieldWithMetaString arg0)`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `BasketReferenceInformationBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `boolean hasData()`
- `BasketReferenceInformationBuilder toBuilder()`
- `BasketReferenceInformationBuilder prune()`

