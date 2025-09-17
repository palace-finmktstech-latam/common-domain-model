# ObservableBuilderImpl

**Full Name:** `cdm.observable.asset.Observable$ObservableBuilderImpl`

**Package:** `cdm.observable.asset`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.observable.asset.Observable$ObservableBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| asset | `AssetBuilder` |  |
| basket | `BasketBuilder` |  |
| index | `IndexBuilder` |  |

### Methods

#### Builder Methods

- `Observable build()`

#### Setter Methods

- `ObservableBuilder setIndex(Index arg0)`
- `ObservableBuilder setAsset(Asset arg0)`
- `ObservableBuilder setBasket(Basket arg0)`

#### Getter Methods

- `IndexBuilder getIndex()`
- `AssetBuilder getOrCreateAsset()`
- `IndexBuilder getOrCreateIndex()`
- `AssetBuilder getAsset()`
- `BasketBuilder getOrCreateBasket()`
- `BasketBuilder getBasket()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `ObservableBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `ObservableBuilder prune()`
- `ObservableBuilder toBuilder()`
- `boolean hasData()`

