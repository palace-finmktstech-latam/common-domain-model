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

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `ObservableBuilder prune()`

