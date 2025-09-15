# PortfolioStateBuilder

**Full Name:** `cdm.event.position.PortfolioState$PortfolioStateBuilder`

**Package:** `cdm.event.position`

## Type: Interface

### Implemented Interfaces

- `cdm.event.position.PortfolioState`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`
- `com.rosetta.model.lib.GlobalKey$GlobalKeyBuilder`

### Methods

#### Setter Methods

- `PortfolioStateBuilder setPositions(List arg0)`
- `PortfolioStateBuilder setLineage(Lineage arg0)`
- `PortfolioStateBuilder setMeta(MetaFields arg0)`

#### Getter Methods

- `PositionBuilder getOrCreatePositions(int arg0)`
- `LineageBuilder getOrCreateLineage()`
- `MetaFieldsBuilder getOrCreateMeta()`
- `LineageBuilder getLineage()`
- `List getPositions()`
- `MetaFieldsBuilder getMeta()`

#### Adder Methods

- `PortfolioStateBuilder addPositions(Position arg0)`
- `PortfolioStateBuilder addPositions(List arg0)`
- `PortfolioStateBuilder addPositions(Position arg0, int arg1)`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `PortfolioStateBuilder prune()`

