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
- `ObservableBuilder setBasket(Basket arg0)`
- `ObservableBuilder setAsset(Asset arg0)`

#### Getter Methods

- `IndexBuilder getIndex()`
- `IndexBuilder getOrCreateIndex()`
- `BasketBuilder getOrCreateBasket()`
- `AssetBuilder getOrCreateAsset()`
- `BasketBuilder getBasket()`
- `AssetBuilder getAsset()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `ObservableBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `boolean hasData()`
- `ObservableBuilder toBuilder()`
- `ObservableBuilder prune()`

