# TradableProductBuilder

**Full Name:** `cdm.product.template.TradableProduct$TradableProductBuilder`

**Package:** `cdm.product.template`

## Type: Interface

### Implemented Interfaces

- `cdm.product.template.TradableProduct`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`

### Methods

#### Setter Methods

- `TradableProductBuilder setCounterparty(List arg0)`
- `TradableProductBuilder setAncillaryParty(List arg0)`
- `TradableProductBuilder setProduct(NonTransferableProduct arg0)`
- `TradableProductBuilder setTradeLot(List arg0)`
- `TradableProductBuilder setAdjustment(NotionalAdjustmentEnum arg0)`

#### Getter Methods

- `List getCounterparty()`
- `List getTradeLot()`
- `List getAncillaryParty()`
- `TradeLotBuilder getOrCreateTradeLot(int arg0)`
- `AncillaryPartyBuilder getOrCreateAncillaryParty(int arg0)`
- `CounterpartyBuilder getOrCreateCounterparty(int arg0)`
- `NonTransferableProductBuilder getOrCreateProduct()`
- `NonTransferableProductBuilder getProduct()`

#### Adder Methods

- `TradableProductBuilder addTradeLot(TradeLot arg0, int arg1)`
- `TradableProductBuilder addTradeLot(List arg0)`
- `TradableProductBuilder addTradeLot(TradeLot arg0)`
- `TradableProductBuilder addCounterparty(Counterparty arg0, int arg1)`
- `TradableProductBuilder addCounterparty(List arg0)`
- `TradableProductBuilder addCounterparty(Counterparty arg0)`
- `TradableProductBuilder addAncillaryParty(AncillaryParty arg0)`
- `TradableProductBuilder addAncillaryParty(AncillaryParty arg0, int arg1)`
- `TradableProductBuilder addAncillaryParty(List arg0)`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `TradableProductBuilder prune()`

