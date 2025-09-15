# TransferableProductBuilderImpl

**Full Name:** `cdm.product.template.TransferableProduct$TransferableProductBuilderImpl`

**Package:** `cdm.product.template`

## Type: Concrete Class

### Inheritance

**Extends:**
- `cdm.base.staticdata.asset.common.Asset$AssetBuilderImpl`

### Implemented Interfaces

- `cdm.product.template.TransferableProduct$TransferableProductBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| economicTerms | `EconomicTermsBuilder` |  |

### Methods

#### Builder Methods

- `TransferableProduct build()`

#### Setter Methods

- `TransferableProductBuilder setDigitalAsset(DigitalAsset arg0)`
- `TransferableProductBuilder setInstrument(Instrument arg0)`
- `TransferableProductBuilder setCommodity(Commodity arg0)`
- `TransferableProductBuilder setEconomicTerms(EconomicTerms arg0)`
- `TransferableProductBuilder setCash(Cash arg0)`

#### Getter Methods

- `EconomicTermsBuilder getEconomicTerms()`
- `EconomicTermsBuilder getOrCreateEconomicTerms()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `TransferableProductBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `boolean hasData()`
- `TransferableProductBuilder toBuilder()`
- `TransferableProductBuilder prune()`

