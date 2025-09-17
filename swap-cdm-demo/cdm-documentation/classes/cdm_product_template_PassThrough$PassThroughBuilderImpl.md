# PassThroughBuilderImpl

**Full Name:** `cdm.product.template.PassThrough$PassThroughBuilderImpl`

**Package:** `cdm.product.template`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.product.template.PassThrough$PassThroughBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| passThroughItem | `java.util.List<cdm.product.template.PassThroughItem$PassThroughItemBuilder>` |  |

### Methods

#### Builder Methods

- `PassThrough build()`

#### Setter Methods

- `PassThroughBuilder setPassThroughItem(List arg0)`

#### Getter Methods

- `List getPassThroughItem()`
- `PassThroughItemBuilder getOrCreatePassThroughItem(int arg0)`

#### Adder Methods

- `PassThroughBuilder addPassThroughItem(List arg0)`
- `PassThroughBuilder addPassThroughItem(PassThroughItem arg0)`
- `PassThroughBuilder addPassThroughItem(PassThroughItem arg0, int arg1)`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `PassThroughBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `PassThroughBuilder prune()`
- `PassThroughBuilder toBuilder()`
- `boolean hasData()`

