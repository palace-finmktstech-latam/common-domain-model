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

- `IdentifiedListBuilder setComponentId(List arg0)`
- `IdentifiedListBuilder setMeta(MetaFields arg0)`
- `IdentifiedListBuilder setListId(Identifier arg0)`
- `IdentifiedListBuilder setPrice(Price arg0)`

#### Getter Methods

- `MetaFieldsBuilder getOrCreateMeta()`
- `PriceBuilder getOrCreatePrice()`
- `List getComponentId()`
- `MetaFieldsBuilder getMeta()`
- `IdentifierBuilder getListId()`
- `PriceBuilder getPrice()`
- `IdentifierBuilder getOrCreateComponentId(int arg0)`
- `IdentifierBuilder getOrCreateListId()`

#### Adder Methods

- `IdentifiedListBuilder addComponentId(Identifier arg0, int arg1)`
- `IdentifiedListBuilder addComponentId(Identifier arg0)`
- `IdentifiedListBuilder addComponentId(List arg0)`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `IdentifiedListBuilder prune()`

