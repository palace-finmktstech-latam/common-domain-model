# TradableProductBuilderImpl

**Full Name:** `cdm.product.template.TradableProduct$TradableProductBuilderImpl`

**Package:** `cdm.product.template`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.product.template.TradableProduct$TradableProductBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| product | `NonTransferableProductBuilder` |  |
| tradeLot | `java.util.List<cdm.product.template.TradeLot$TradeLotBuilder>` |  |
| counterparty | `java.util.List<cdm.base.staticdata.party.Counterparty$CounterpartyBuilder>` |  |
| ancillaryParty | `java.util.List<cdm.base.staticdata.party.AncillaryParty$AncillaryPartyBuilder>` |  |
| adjustment | `NotionalAdjustmentEnum` |  |

### Methods

#### Builder Methods

- `TradableProduct build()`

#### Setter Methods

- `TradableProductBuilder setCounterparty(List arg0)`
- `TradableProductBuilder setAncillaryParty(List arg0)`
- `TradableProductBuilder setAdjustment(NotionalAdjustmentEnum arg0)`
- `TradableProductBuilder setTradeLot(List arg0)`
- `TradableProductBuilder setProduct(NonTransferableProduct arg0)`

#### Getter Methods

- `AncillaryPartyBuilder getOrCreateAncillaryParty(int arg0)`
- `CounterpartyBuilder getOrCreateCounterparty(int arg0)`
- `TradeLotBuilder getOrCreateTradeLot(int arg0)`
- `NonTransferableProductBuilder getOrCreateProduct()`
- `List getCounterparty()`
- `List getAncillaryParty()`
- `List getTradeLot()`
- `NotionalAdjustmentEnum getAdjustment()`
- `NonTransferableProductBuilder getProduct()`

#### Adder Methods

- `TradableProductBuilder addAncillaryParty(AncillaryParty arg0)`
- `TradableProductBuilder addAncillaryParty(AncillaryParty arg0, int arg1)`
- `TradableProductBuilder addAncillaryParty(List arg0)`
- `TradableProductBuilder addCounterparty(List arg0)`
- `TradableProductBuilder addCounterparty(Counterparty arg0, int arg1)`
- `TradableProductBuilder addCounterparty(Counterparty arg0)`
- `TradableProductBuilder addTradeLot(List arg0)`
- `TradableProductBuilder addTradeLot(TradeLot arg0)`
- `TradableProductBuilder addTradeLot(TradeLot arg0, int arg1)`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `TradableProductBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `boolean hasData()`
- `TradableProductBuilder toBuilder()`
- `TradableProductBuilder prune()`

