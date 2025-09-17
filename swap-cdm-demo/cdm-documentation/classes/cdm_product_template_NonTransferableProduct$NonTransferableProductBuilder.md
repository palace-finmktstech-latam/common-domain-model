# NonTransferableProductBuilder

**Full Name:** `cdm.product.template.NonTransferableProduct$NonTransferableProductBuilder`

**Package:** `cdm.product.template`

## Type: Interface

### Implemented Interfaces

- `cdm.product.template.NonTransferableProduct`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`
- `com.rosetta.model.lib.GlobalKey$GlobalKeyBuilder`

### Methods

#### Setter Methods

- `NonTransferableProductBuilder setIdentifier(List arg0)`
- `NonTransferableProductBuilder setMeta(MetaFields arg0)`
- `NonTransferableProductBuilder setTaxonomy(List arg0)`
- `NonTransferableProductBuilder setEconomicTerms(EconomicTerms arg0)`

#### Getter Methods

- `EconomicTermsBuilder getEconomicTerms()`
- `ProductIdentifierBuilder getOrCreateIdentifier(int arg0)`
- `MetaFieldsBuilder getOrCreateMeta()`
- `EconomicTermsBuilder getOrCreateEconomicTerms()`
- `MetaFieldsBuilder getMeta()`
- `List getTaxonomy()`
- `ProductTaxonomyBuilder getOrCreateTaxonomy(int arg0)`
- `List getIdentifier()`

#### Adder Methods

- `NonTransferableProductBuilder addIdentifier(ProductIdentifier arg0)`
- `NonTransferableProductBuilder addIdentifier(List arg0)`
- `NonTransferableProductBuilder addIdentifier(ProductIdentifier arg0, int arg1)`
- `NonTransferableProductBuilder addTaxonomy(ProductTaxonomy arg0, int arg1)`
- `NonTransferableProductBuilder addTaxonomy(ProductTaxonomy arg0)`
- `NonTransferableProductBuilder addTaxonomy(List arg0)`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `NonTransferableProductBuilder prune()`

