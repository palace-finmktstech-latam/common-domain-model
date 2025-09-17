# ProductBuilderImpl

**Full Name:** `cdm.product.template.Product$ProductBuilderImpl`

**Package:** `cdm.product.template`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.product.template.Product$ProductBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| transferableProduct | `TransferableProductBuilder` |  |
| nonTransferableProduct | `NonTransferableProductBuilder` |  |

### Methods

#### Builder Methods

- `Product build()`

#### Setter Methods

- `ProductBuilder setNonTransferableProduct(NonTransferableProduct arg0)`
- `ProductBuilder setTransferableProduct(TransferableProduct arg0)`

#### Getter Methods

- `TransferableProductBuilder getTransferableProduct()`
- `NonTransferableProductBuilder getNonTransferableProduct()`
- `TransferableProductBuilder getOrCreateTransferableProduct()`
- `NonTransferableProductBuilder getOrCreateNonTransferableProduct()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `ProductBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `ProductBuilder prune()`
- `ProductBuilder toBuilder()`
- `boolean hasData()`

