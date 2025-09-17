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

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `IdentifiedListBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `IdentifiedListBuilder prune()`
- `IdentifiedListBuilder toBuilder()`
- `boolean hasData()`

