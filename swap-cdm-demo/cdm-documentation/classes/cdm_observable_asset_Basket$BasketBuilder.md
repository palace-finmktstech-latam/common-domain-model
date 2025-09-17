# BasketBuilder

**Full Name:** `cdm.observable.asset.Basket$BasketBuilder`

**Package:** `cdm.observable.asset`

## Type: Interface

### Implemented Interfaces

- `cdm.observable.asset.Basket`
- `cdm.base.staticdata.asset.common.AssetBase$AssetBaseBuilder`

### Methods

#### Setter Methods

- `BasketBuilder setIdentifier(List arg0)`
- `BasketBuilder setTaxonomy(List arg0)`
- `BasketBuilder setExchange(LegalEntity arg0)`
- `BasketBuilder setIsExchangeListed(Boolean arg0)`
- `BasketBuilder setBasketConstituent(List arg0)`
- `BasketBuilder setBasketConstituentValue(List arg0)`
- `BasketBuilder setRelatedExchange(List arg0)`

#### Getter Methods

- `List getBasketConstituent()`
- `FieldWithMetaBasketConstituentBuilder getOrCreateBasketConstituent(int arg0)`

#### Adder Methods

- `BasketBuilder addIdentifier(List arg0)`
- `BasketBuilder addIdentifier(AssetIdentifier arg0)`
- `BasketBuilder addIdentifier(AssetIdentifier arg0, int arg1)`
- `BasketBuilder addTaxonomy(Taxonomy arg0)`
- `BasketBuilder addTaxonomy(Taxonomy arg0, int arg1)`
- `BasketBuilder addTaxonomy(List arg0)`
- `BasketBuilder addBasketConstituentValue(BasketConstituent arg0, int arg1)`
- `BasketBuilder addBasketConstituentValue(BasketConstituent arg0)`
- `BasketBuilder addBasketConstituentValue(List arg0)`
- `BasketBuilder addBasketConstituent(FieldWithMetaBasketConstituent arg0)`
- `BasketBuilder addBasketConstituent(List arg0)`
- `BasketBuilder addBasketConstituent(FieldWithMetaBasketConstituent arg0, int arg1)`
- `BasketBuilder addRelatedExchange(LegalEntity arg0, int arg1)`
- `BasketBuilder addRelatedExchange(List arg0)`
- `BasketBuilder addRelatedExchange(LegalEntity arg0)`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `BasketBuilder prune()`

