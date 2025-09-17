# ReferencePoolBuilderImpl

**Full Name:** `cdm.product.asset.ReferencePool$ReferencePoolBuilderImpl`

**Package:** `cdm.product.asset`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.product.asset.ReferencePool$ReferencePoolBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| referencePoolItem | `java.util.List<cdm.product.asset.ReferencePoolItem$ReferencePoolItemBuilder>` |  |

### Methods

#### Builder Methods

- `ReferencePool build()`

#### Setter Methods

- `ReferencePoolBuilder setReferencePoolItem(List arg0)`

#### Getter Methods

- `List getReferencePoolItem()`
- `ReferencePoolItemBuilder getOrCreateReferencePoolItem(int arg0)`

#### Adder Methods

- `ReferencePoolBuilder addReferencePoolItem(List arg0)`
- `ReferencePoolBuilder addReferencePoolItem(ReferencePoolItem arg0)`
- `ReferencePoolBuilder addReferencePoolItem(ReferencePoolItem arg0, int arg1)`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `ReferencePoolBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `ReferencePoolBuilder prune()`
- `ReferencePoolBuilder toBuilder()`
- `boolean hasData()`

