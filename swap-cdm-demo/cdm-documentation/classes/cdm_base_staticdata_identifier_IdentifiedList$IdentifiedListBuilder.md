# IdentifiedListBuilder

**Full Name:** `cdm.base.staticdata.identifier.IdentifiedList$IdentifiedListBuilder`

**Package:** `cdm.base.staticdata.identifier`

## Type: Interface

### Implemented Interfaces

- `cdm.base.staticdata.identifier.IdentifiedList`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`
- `com.rosetta.model.lib.GlobalKey$GlobalKeyBuilder`

### Methods

#### Setter Methods

- `IdentifiedListBuilder setPrice(Price arg0)`
- `IdentifiedListBuilder setListId(Identifier arg0)`
- `IdentifiedListBuilder setComponentId(List arg0)`
- `IdentifiedListBuilder setMeta(MetaFields arg0)`

#### Getter Methods

- `PriceBuilder getOrCreatePrice()`
- `IdentifierBuilder getOrCreateListId()`
- `IdentifierBuilder getOrCreateComponentId(int arg0)`
- `MetaFieldsBuilder getOrCreateMeta()`
- `IdentifierBuilder getListId()`
- `PriceBuilder getPrice()`
- `List getComponentId()`
- `MetaFieldsBuilder getMeta()`

#### Adder Methods

- `IdentifiedListBuilder addComponentId(Identifier arg0)`
- `IdentifiedListBuilder addComponentId(Identifier arg0, int arg1)`
- `IdentifiedListBuilder addComponentId(List arg0)`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `IdentifiedListBuilder prune()`

