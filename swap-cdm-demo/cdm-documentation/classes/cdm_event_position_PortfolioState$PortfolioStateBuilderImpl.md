# PortfolioStateBuilderImpl

**Full Name:** `cdm.event.position.PortfolioState$PortfolioStateBuilderImpl`

**Package:** `cdm.event.position`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.event.position.PortfolioState$PortfolioStateBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| positions | `java.util.List<cdm.event.position.Position$PositionBuilder>` |  |
| lineage | `LineageBuilder` |  |
| meta | `MetaFieldsBuilder` |  |

### Methods

#### Builder Methods

- `PortfolioState build()`

#### Setter Methods

- `PortfolioStateBuilder setMeta(MetaFields arg0)`
- `PortfolioStateBuilder setPositions(List arg0)`
- `PortfolioStateBuilder setLineage(Lineage arg0)`

#### Getter Methods

- `MetaFieldsBuilder getOrCreateMeta()`
- `MetaFieldsBuilder getMeta()`
- `LineageBuilder getOrCreateLineage()`
- `PositionBuilder getOrCreatePositions(int arg0)`
- `LineageBuilder getLineage()`
- `List getPositions()`

#### Adder Methods

- `PortfolioStateBuilder addPositions(List arg0)`
- `PortfolioStateBuilder addPositions(Position arg0, int arg1)`
- `PortfolioStateBuilder addPositions(Position arg0)`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `PortfolioStateBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `PortfolioStateBuilder prune()`
- `PortfolioStateBuilder toBuilder()`
- `boolean hasData()`

