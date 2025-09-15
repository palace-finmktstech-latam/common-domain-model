# ProductBuilder

**Full Name:** `cdm.product.template.Product$ProductBuilder`

**Package:** `cdm.product.template`

## Type: Interface

### Implemented Interfaces

- `cdm.product.template.Product`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`

### Methods

#### Setter Methods

- `ProductBuilder setTransferableProduct(TransferableProduct arg0)`
- `ProductBuilder setNonTransferableProduct(NonTransferableProduct arg0)`

#### Getter Methods

- `TransferableProductBuilder getTransferableProduct()`
- `NonTransferableProductBuilder getNonTransferableProduct()`
- `NonTransferableProductBuilder getOrCreateNonTransferableProduct()`
- `TransferableProductBuilder getOrCreateTransferableProduct()`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `ProductBuilder prune()`

