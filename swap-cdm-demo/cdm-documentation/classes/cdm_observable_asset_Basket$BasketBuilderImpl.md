# BasketBuilderImpl

**Full Name:** `cdm.observable.asset.Basket$BasketBuilderImpl`

**Package:** `cdm.observable.asset`

## Type: Concrete Class

### Inheritance

**Extends:**
- `cdm.base.staticdata.asset.common.AssetBase$AssetBaseBuilderImpl`

### Implemented Interfaces

- `cdm.observable.asset.Basket$BasketBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| basketConstituent | `java.util.List<cdm.observable.asset.metafields.FieldWithMetaBasketConstituent$FieldWithMetaBasketConstituentBuilder>` |  |

### Methods

#### Builder Methods

- `Basket build()`

#### Setter Methods

- `BasketBuilder setIsExchangeListed(Boolean arg0)`
- `BasketBuilder setBasketConstituentValue(List arg0)`
- `BasketBuilder setRelatedExchange(List arg0)`
- `BasketBuilder setExchange(LegalEntity arg0)`
- `BasketBuilder setBasketConstituent(List arg0)`
- `BasketBuilder setTaxonomy(List arg0)`
- `BasketBuilder setIdentifier(List arg0)`

#### Getter Methods

- `List getBasketConstituent()`
- `FieldWithMetaBasketConstituentBuilder getOrCreateBasketConstituent(int arg0)`

#### Adder Methods

- `BasketBuilder addBasketConstituentValue(BasketConstituent arg0, int arg1)`
- `BasketBuilder addBasketConstituentValue(List arg0)`
- `BasketBuilder addBasketConstituentValue(BasketConstituent arg0)`
- `BasketBuilder addBasketConstituent(FieldWithMetaBasketConstituent arg0, int arg1)`
- `BasketBuilder addBasketConstituent(FieldWithMetaBasketConstituent arg0)`
- `BasketBuilder addBasketConstituent(List arg0)`
- `BasketBuilder addRelatedExchange(LegalEntity arg0, int arg1)`
- `BasketBuilder addRelatedExchange(LegalEntity arg0)`
- `BasketBuilder addRelatedExchange(List arg0)`
- `BasketBuilder addTaxonomy(Taxonomy arg0, int arg1)`
- `BasketBuilder addTaxonomy(List arg0)`
- `BasketBuilder addTaxonomy(Taxonomy arg0)`
- `BasketBuilder addIdentifier(AssetIdentifier arg0, int arg1)`
- `BasketBuilder addIdentifier(List arg0)`
- `BasketBuilder addIdentifier(AssetIdentifier arg0)`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `BasketBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `boolean hasData()`
- `BasketBuilder toBuilder()`
- `BasketBuilder prune()`

