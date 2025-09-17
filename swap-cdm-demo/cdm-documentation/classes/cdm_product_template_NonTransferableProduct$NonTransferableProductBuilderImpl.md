# NonTransferableProductBuilderImpl

**Full Name:** `cdm.product.template.NonTransferableProduct$NonTransferableProductBuilderImpl`

**Package:** `cdm.product.template`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.product.template.NonTransferableProduct$NonTransferableProductBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| identifier | `java.util.List<cdm.base.staticdata.asset.common.ProductIdentifier$ProductIdentifierBuilder>` |  |
| taxonomy | `java.util.List<cdm.base.staticdata.asset.common.ProductTaxonomy$ProductTaxonomyBuilder>` |  |
| economicTerms | `EconomicTermsBuilder` |  |
| meta | `MetaFieldsBuilder` |  |

### Methods

#### Builder Methods

- `NonTransferableProduct build()`

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

- `NonTransferableProductBuilder addIdentifier(ProductIdentifier arg0, int arg1)`
- `NonTransferableProductBuilder addIdentifier(List arg0)`
- `NonTransferableProductBuilder addIdentifier(ProductIdentifier arg0)`
- `NonTransferableProductBuilder addTaxonomy(List arg0)`
- `NonTransferableProductBuilder addTaxonomy(ProductTaxonomy arg0)`
- `NonTransferableProductBuilder addTaxonomy(ProductTaxonomy arg0, int arg1)`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `NonTransferableProductBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `NonTransferableProductBuilder prune()`
- `NonTransferableProductBuilder toBuilder()`
- `boolean hasData()`

