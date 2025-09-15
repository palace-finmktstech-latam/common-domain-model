# TransferableProductBuilder

**Full Name:** `cdm.product.template.TransferableProduct$TransferableProductBuilder`

**Package:** `cdm.product.template`

## Type: Interface

### Implemented Interfaces

- `cdm.product.template.TransferableProduct`
- `cdm.base.staticdata.asset.common.Asset$AssetBuilder`

### Methods

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

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `TransferableProductBuilder prune()`

