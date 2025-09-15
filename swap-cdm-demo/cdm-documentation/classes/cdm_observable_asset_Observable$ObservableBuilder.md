# ObservableBuilder

**Full Name:** `cdm.observable.asset.Observable$ObservableBuilder`

**Package:** `cdm.observable.asset`

## Type: Interface

### Implemented Interfaces

- `cdm.observable.asset.Observable`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`

### Methods

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

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `ObservableBuilder prune()`

