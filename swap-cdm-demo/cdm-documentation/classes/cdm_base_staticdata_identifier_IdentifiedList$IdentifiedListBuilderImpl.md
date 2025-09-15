# IdentifiedListBuilderImpl

**Full Name:** `cdm.base.staticdata.identifier.IdentifiedList$IdentifiedListBuilderImpl`

**Package:** `cdm.base.staticdata.identifier`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.base.staticdata.identifier.IdentifiedList$IdentifiedListBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| listId | `IdentifierBuilder` |  |
| componentId | `java.util.List<cdm.base.staticdata.identifier.Identifier$IdentifierBuilder>` |  |
| price | `PriceBuilder` |  |
| meta | `MetaFieldsBuilder` |  |

### Methods

#### Builder Methods

- `IdentifiedList build()`

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

- `IdentifiedListBuilder addComponentId(List arg0)`
- `IdentifiedListBuilder addComponentId(Identifier arg0, int arg1)`
- `IdentifiedListBuilder addComponentId(Identifier arg0)`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `IdentifiedListBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `boolean hasData()`
- `IdentifiedListBuilder toBuilder()`
- `IdentifiedListBuilder prune()`

